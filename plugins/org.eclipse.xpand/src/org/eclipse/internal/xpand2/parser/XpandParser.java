// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g 2011-08-25 14:27:04
 	
package org.eclipse.internal.xpand2.parser; 
	
import java.util.ArrayList;
import java.util.List;

import org.eclipse.internal.xtend.expression.ast.*;
import org.eclipse.internal.xpand2.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XpandParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LG", "COMMENT", "TEXT", "StringLiteral", "IntLiteral", "Identifier", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "Letter", "JavaIDDigit", "WS", "ML_COMMENT", "LINE_COMMENT", "RG", "'IMPORT'", "'EXTENSION'", "'AROUND'", "'('", "','", "'*'", "')'", "'FOR'", "'ENDAROUND'", "'::'", "'DEFINE'", "'ENDDEFINE'", "'-'", "'ERROR'", "'EXPAND'", "'FOREACH'", "'SEPARATOR'", "'ONFILECLOSE'", "'FILE'", "'ENDFILE'", "'AS'", "'ITERATOR'", "'ENDFOREACH'", "'IF'", "'ENDIF'", "'ELSEIF'", "'ELSE'", "'LET'", "'ENDLET'", "'PROTECT'", "'CSTART'", "'CEND'", "'ID'", "'DISABLE'", "'ENDPROTECT'", "'let'", "'='", "':'", "'->'", "'?'", "'if'", "'then'", "'else'", "'switch'", "'{'", "'case'", "'default'", "'}'", "'||'", "'&&'", "'implies'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'/'", "'!'", "'.'", "'GLOBALVAR'", "'new'", "'false'", "'true'", "'null'", "'typeSelect'", "'collect'", "'select'", "'selectFirst'", "'reject'", "'exists'", "'notExists'", "'sortBy'", "'forAll'", "'|'", "'Collection'", "'List'", "'Set'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int LG=4;
    public static final int COMMENT=5;
    public static final int TEXT=6;
    public static final int StringLiteral=7;
    public static final int IntLiteral=8;
    public static final int Identifier=9;
    public static final int EscapeSequence=10;
    public static final int UnicodeEscape=11;
    public static final int OctalEscape=12;
    public static final int HexDigit=13;
    public static final int Letter=14;
    public static final int JavaIDDigit=15;
    public static final int WS=16;
    public static final int ML_COMMENT=17;
    public static final int LINE_COMMENT=18;
    public static final int RG=19;

    // delegates
    // delegators


        public XpandParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public XpandParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return XpandParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g"; }


    	private XpandFactory factory;
    	
    	public XpandParser(TokenStream stream, XpandFactory factory) {
    		this(stream);
    		this.factory = factory;
    	}
    	
    	protected Identifier id(Token t) {
    		if (t == null)
    			return null;
    		CommonToken ct = (CommonToken) t;
    		Identifier id = new Identifier(t.getText());
    		id.setStart(ct.getStartIndex());
    		id.setEnd(ct.getStopIndex());
    		id.setLine(ct.getLine());
    		return id;
    	}



    // $ANTLR start "template"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:44:1: template returns [Template t] : ( LG ( COMMENT TEXT )* ( (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )* )* ( (d= define | a= around ) TEXT ( COMMENT TEXT )* )* | );
    public Template template() throws RecognitionException {
        Template t = null;

        ImportDeclaration imp = null;

        ExtensionImportDeclaration extimp = null;

        Definition d = null;

        Advice a = null;


        List imports = new ArrayList(),extensions = new ArrayList(), defines = new ArrayList(), advices = new ArrayList();
        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:45:123: ( LG ( COMMENT TEXT )* ( (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )* )* ( (d= define | a= around ) TEXT ( COMMENT TEXT )* )* | )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LG) ) {
                alt8=1;
            }
            else if ( (LA8_0==EOF) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:46:2: LG ( COMMENT TEXT )* ( (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )* )* ( (d= define | a= around ) TEXT ( COMMENT TEXT )* )*
                    {
                    match(input,LG,FOLLOW_LG_in_template47); if (state.failed) return t;
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:47:3: ( COMMENT TEXT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==COMMENT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:47:4: COMMENT TEXT
                    	    {
                    	    match(input,COMMENT,FOLLOW_COMMENT_in_template52); if (state.failed) return t;
                    	    match(input,TEXT,FOLLOW_TEXT_in_template54); if (state.failed) return t;

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:48:3: ( (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )* )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=20 && LA4_0<=21)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:48:4: (imp= anImport | extimp= anExtensionImport ) TEXT ( COMMENT TEXT )*
                    	    {
                    	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:48:4: (imp= anImport | extimp= anExtensionImport )
                    	    int alt2=2;
                    	    int LA2_0 = input.LA(1);

                    	    if ( (LA2_0==20) ) {
                    	        alt2=1;
                    	    }
                    	    else if ( (LA2_0==21) ) {
                    	        alt2=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return t;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 2, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt2) {
                    	        case 1 :
                    	            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:48:5: imp= anImport
                    	            {
                    	            pushFollow(FOLLOW_anImport_in_template64);
                    	            imp=anImport();

                    	            state._fsp--;
                    	            if (state.failed) return t;
                    	            if ( state.backtracking==0 ) {
                    	              imports.add(imp);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:48:41: extimp= anExtensionImport
                    	            {
                    	            pushFollow(FOLLOW_anExtensionImport_in_template73);
                    	            extimp=anExtensionImport();

                    	            state._fsp--;
                    	            if (state.failed) return t;
                    	            if ( state.backtracking==0 ) {
                    	              extensions.add(extimp);
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    match(input,TEXT,FOLLOW_TEXT_in_template78); if (state.failed) return t;
                    	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:48:98: ( COMMENT TEXT )*
                    	    loop3:
                    	    do {
                    	        int alt3=2;
                    	        int LA3_0 = input.LA(1);

                    	        if ( (LA3_0==COMMENT) ) {
                    	            alt3=1;
                    	        }


                    	        switch (alt3) {
                    	    	case 1 :
                    	    	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:48:99: COMMENT TEXT
                    	    	    {
                    	    	    match(input,COMMENT,FOLLOW_COMMENT_in_template81); if (state.failed) return t;
                    	    	    match(input,TEXT,FOLLOW_TEXT_in_template83); if (state.failed) return t;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop3;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:49:3: ( (d= define | a= around ) TEXT ( COMMENT TEXT )* )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22||LA7_0==30) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:49:4: (d= define | a= around ) TEXT ( COMMENT TEXT )*
                    	    {
                    	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:49:4: (d= define | a= around )
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0==30) ) {
                    	        alt5=1;
                    	    }
                    	    else if ( (LA5_0==22) ) {
                    	        alt5=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return t;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 5, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:49:5: d= define
                    	            {
                    	            pushFollow(FOLLOW_define_in_template95);
                    	            d=define();

                    	            state._fsp--;
                    	            if (state.failed) return t;
                    	            if ( state.backtracking==0 ) {
                    	              defines.add(d);
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:49:33: a= around
                    	            {
                    	            pushFollow(FOLLOW_around_in_template102);
                    	            a=around();

                    	            state._fsp--;
                    	            if (state.failed) return t;
                    	            if ( state.backtracking==0 ) {
                    	              advices.add(a);
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    match(input,TEXT,FOLLOW_TEXT_in_template106); if (state.failed) return t;
                    	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:49:65: ( COMMENT TEXT )*
                    	    loop6:
                    	    do {
                    	        int alt6=2;
                    	        int LA6_0 = input.LA(1);

                    	        if ( (LA6_0==COMMENT) ) {
                    	            alt6=1;
                    	        }


                    	        switch (alt6) {
                    	    	case 1 :
                    	    	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:49:66: COMMENT TEXT
                    	    	    {
                    	    	    match(input,COMMENT,FOLLOW_COMMENT_in_template109); if (state.failed) return t;
                    	    	    match(input,TEXT,FOLLOW_TEXT_in_template111); if (state.failed) return t;

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop6;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                      t = factory.createTemplate(imports,extensions,defines,advices);
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:52:1: 
                    {
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
        return t;
    }
    // $ANTLR end "template"


    // $ANTLR start "anImport"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:54:1: anImport returns [ImportDeclaration imp] : 'IMPORT' id= simpleType ;
    public ImportDeclaration anImport() throws RecognitionException {
        ImportDeclaration imp = null;

        Identifier id = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:54:42: ( 'IMPORT' id= simpleType )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:55:2: 'IMPORT' id= simpleType
            {
            match(input,20,FOLLOW_20_in_anImport137); if (state.failed) return imp;
            pushFollow(FOLLOW_simpleType_in_anImport141);
            id=simpleType();

            state._fsp--;
            if (state.failed) return imp;
            if ( state.backtracking==0 ) {
              imp = factory.createImportDeclaration(id);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return imp;
    }
    // $ANTLR end "anImport"


    // $ANTLR start "anExtensionImport"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:58:1: anExtensionImport returns [ExtensionImportDeclaration imp] : 'EXTENSION' id= simpleType ;
    public ExtensionImportDeclaration anExtensionImport() throws RecognitionException {
        ExtensionImportDeclaration imp = null;

        Identifier id = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:58:59: ( 'EXTENSION' id= simpleType )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:59:2: 'EXTENSION' id= simpleType
            {
            match(input,21,FOLLOW_21_in_anExtensionImport156); if (state.failed) return imp;
            pushFollow(FOLLOW_simpleType_in_anExtensionImport160);
            id=simpleType();

            state._fsp--;
            if (state.failed) return imp;
            if ( state.backtracking==0 ) {
              imp = factory.createExtensionImportDeclaration(id);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return imp;
    }
    // $ANTLR end "anExtensionImport"


    // $ANTLR start "around"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:62:1: around returns [Advice a] : 'AROUND' pc= pointcut ( '(' (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' ) ')' )? 'FOR' t= type s= sequence 'ENDAROUND' ;
    public Advice around() throws RecognitionException {
        Advice a = null;

        Token wildparams=null;
        Identifier pc = null;

        List<DeclaredParameter> p = null;

        Identifier t = null;

        List<Statement> s = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:62:27: ( 'AROUND' pc= pointcut ( '(' (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' ) ')' )? 'FOR' t= type s= sequence 'ENDAROUND' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:63:4: 'AROUND' pc= pointcut ( '(' (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' ) ')' )? 'FOR' t= type s= sequence 'ENDAROUND'
            {
            match(input,22,FOLLOW_22_in_around178); if (state.failed) return a;
            pushFollow(FOLLOW_pointcut_in_around182);
            pc=pointcut();

            state._fsp--;
            if (state.failed) return a;
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:64:4: ( '(' (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' ) ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:64:5: '(' (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' ) ')'
                    {
                    match(input,23,FOLLOW_23_in_around188); if (state.failed) return a;
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:64:9: (p= declaredParameterList ( ',' wildparams= '*' )? | wildparams= '*' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==Identifier||(LA10_0>=96 && LA10_0<=98)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==25) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return a;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:64:10: p= declaredParameterList ( ',' wildparams= '*' )?
                            {
                            pushFollow(FOLLOW_declaredParameterList_in_around193);
                            p=declaredParameterList();

                            state._fsp--;
                            if (state.failed) return a;
                            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:64:34: ( ',' wildparams= '*' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==24) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:64:35: ',' wildparams= '*'
                                    {
                                    match(input,24,FOLLOW_24_in_around196); if (state.failed) return a;
                                    wildparams=(Token)match(input,25,FOLLOW_25_in_around200); if (state.failed) return a;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:64:59: wildparams= '*'
                            {
                            wildparams=(Token)match(input,25,FOLLOW_25_in_around209); if (state.failed) return a;

                            }
                            break;

                    }

                    match(input,26,FOLLOW_26_in_around213); if (state.failed) return a;

                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_around217); if (state.failed) return a;
            pushFollow(FOLLOW_type_in_around221);
            t=type();

            state._fsp--;
            if (state.failed) return a;
            pushFollow(FOLLOW_sequence_in_around229);
            s=sequence();

            state._fsp--;
            if (state.failed) return a;
            match(input,28,FOLLOW_28_in_around234); if (state.failed) return a;
            if ( state.backtracking==0 ) {
               a = factory.createAround(pc,p,wildparams!=null,t,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "around"


    // $ANTLR start "pointcut"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:70:1: pointcut returns [Identifier i] : (x= '*' | i1= identifier ) (x1= '*' | n1= identifier | dc= '::' )* ;
    public Identifier pointcut() throws RecognitionException {
        Identifier i = null;

        Token x=null;
        Token x1=null;
        Token dc=null;
        Identifier i1 = null;

        Identifier n1 = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:70:33: ( (x= '*' | i1= identifier ) (x1= '*' | n1= identifier | dc= '::' )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:71:2: (x= '*' | i1= identifier ) (x1= '*' | n1= identifier | dc= '::' )*
            {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:71:2: (x= '*' | i1= identifier )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==Identifier) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return i;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:71:3: x= '*'
                    {
                    x=(Token)match(input,25,FOLLOW_25_in_pointcut256); if (state.failed) return i;
                    if ( state.backtracking==0 ) {
                      i = id(x);
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:71:23: i1= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_pointcut262);
                    i1=identifier();

                    state._fsp--;
                    if (state.failed) return i;
                    if ( state.backtracking==0 ) {
                      i = i1;
                    }

                    }
                    break;

            }

            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:72:2: (x1= '*' | n1= identifier | dc= '::' )*
            loop13:
            do {
                int alt13=4;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    alt13=1;
                    }
                    break;
                case Identifier:
                    {
                    alt13=2;
                    }
                    break;
                case 29:
                    {
                    alt13=3;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:72:3: x1= '*'
            	    {
            	    x1=(Token)match(input,25,FOLLOW_25_in_pointcut271); if (state.failed) return i;
            	    if ( state.backtracking==0 ) {
            	      i.append(id(x1));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:72:31: n1= identifier
            	    {
            	    pushFollow(FOLLOW_identifier_in_pointcut277);
            	    n1=identifier();

            	    state._fsp--;
            	    if (state.failed) return i;
            	    if ( state.backtracking==0 ) {
            	      i.append(n1);
            	    }

            	    }
            	    break;
            	case 3 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:72:62: dc= '::'
            	    {
            	    dc=(Token)match(input,29,FOLLOW_29_in_pointcut283); if (state.failed) return i;
            	    if ( state.backtracking==0 ) {
            	      i.append(id(dc));
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
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
        return i;
    }
    // $ANTLR end "pointcut"


    // $ANTLR start "define"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:75:1: define returns [Definition d] : 'DEFINE' name= identifier ( '(' p= declaredParameterList ')' )? 'FOR' t= type s= sequence 'ENDDEFINE' ;
    public Definition define() throws RecognitionException {
        Definition d = null;

        Identifier name = null;

        List<DeclaredParameter> p = null;

        Identifier t = null;

        List<Statement> s = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:75:31: ( 'DEFINE' name= identifier ( '(' p= declaredParameterList ')' )? 'FOR' t= type s= sequence 'ENDDEFINE' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:76:4: 'DEFINE' name= identifier ( '(' p= declaredParameterList ')' )? 'FOR' t= type s= sequence 'ENDDEFINE'
            {
            match(input,30,FOLLOW_30_in_define303); if (state.failed) return d;
            pushFollow(FOLLOW_identifier_in_define307);
            name=identifier();

            state._fsp--;
            if (state.failed) return d;
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:76:29: ( '(' p= declaredParameterList ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:76:30: '(' p= declaredParameterList ')'
                    {
                    match(input,23,FOLLOW_23_in_define310); if (state.failed) return d;
                    pushFollow(FOLLOW_declaredParameterList_in_define314);
                    p=declaredParameterList();

                    state._fsp--;
                    if (state.failed) return d;
                    match(input,26,FOLLOW_26_in_define316); if (state.failed) return d;

                    }
                    break;

            }

            match(input,27,FOLLOW_27_in_define320); if (state.failed) return d;
            pushFollow(FOLLOW_type_in_define324);
            t=type();

            state._fsp--;
            if (state.failed) return d;
            pushFollow(FOLLOW_sequence_in_define332);
            s=sequence();

            state._fsp--;
            if (state.failed) return d;
            match(input,31,FOLLOW_31_in_define338); if (state.failed) return d;
            if ( state.backtracking==0 ) {
               d = factory.createDefinition(name,p,t,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "define"


    // $ANTLR start "sequence"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:82:1: sequence returns [List<Statement> s=new ArrayList<Statement>()] : s1= textSequence (s2= statement s1= textSequence )* ;
    public List<Statement> sequence() throws RecognitionException {
        List<Statement> s = new ArrayList<Statement>();

        List<Statement> s1 = null;

        Statement s2 = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:82:65: (s1= textSequence (s2= statement s1= textSequence )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:83:3: s1= textSequence (s2= statement s1= textSequence )*
            {
            pushFollow(FOLLOW_textSequence_in_sequence361);
            s1=textSequence();

            state._fsp--;
            if (state.failed) return s;
            if ( state.backtracking==0 ) {
              s.addAll(s1);
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:84:3: (s2= statement s1= textSequence )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=StringLiteral && LA15_0<=Identifier)||LA15_0==23||(LA15_0>=32 && LA15_0<=35)||LA15_0==38||LA15_0==43||LA15_0==47||LA15_0==49||LA15_0==55||LA15_0==60||(LA15_0>=63 && LA15_0<=64)||LA15_0==79||(LA15_0>=81 && LA15_0<=94)||(LA15_0>=96 && LA15_0<=98)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:84:4: s2= statement s1= textSequence
            	    {
            	    pushFollow(FOLLOW_statement_in_sequence370);
            	    s2=statement();

            	    state._fsp--;
            	    if (state.failed) return s;
            	    if ( state.backtracking==0 ) {
            	      s.add(s2);
            	    }
            	    pushFollow(FOLLOW_textSequence_in_sequence379);
            	    s1=textSequence();

            	    state._fsp--;
            	    if (state.failed) return s;
            	    if ( state.backtracking==0 ) {
            	      s.addAll(s1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
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
        return s;
    }
    // $ANTLR end "sequence"


    // $ANTLR start "statement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:93:1: statement returns [Statement s] : (s1= simpleStatement | s2= fileStatement | s3= foreachStatement | s4= ifStatement | s5= letStatement | s6= protectStatement );
    public Statement statement() throws RecognitionException {
        Statement s = null;

        Statement s1 = null;

        FileStatement s2 = null;

        ForEachStatement s3 = null;

        IfStatement s4 = null;

        LetStatement s5 = null;

        ProtectStatement s6 = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:93:33: (s1= simpleStatement | s2= fileStatement | s3= foreachStatement | s4= ifStatement | s5= letStatement | s6= protectStatement )
            int alt16=6;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 23:
            case 32:
            case 33:
            case 34:
            case 55:
            case 60:
            case 63:
            case 64:
            case 79:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 97:
            case 98:
                {
                alt16=1;
                }
                break;
            case 38:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            case 43:
                {
                alt16=4;
                }
                break;
            case 47:
                {
                alt16=5;
                }
                break;
            case 49:
                {
                alt16=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:94:3: s1= simpleStatement
                    {
                    pushFollow(FOLLOW_simpleStatement_in_statement409);
                    s1=simpleStatement();

                    state._fsp--;
                    if (state.failed) return s;
                    if ( state.backtracking==0 ) {
                      s =s1;
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:95:3: s2= fileStatement
                    {
                    pushFollow(FOLLOW_fileStatement_in_statement417);
                    s2=fileStatement();

                    state._fsp--;
                    if (state.failed) return s;
                    if ( state.backtracking==0 ) {
                      s =s2;
                    }

                    }
                    break;
                case 3 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:96:3: s3= foreachStatement
                    {
                    pushFollow(FOLLOW_foreachStatement_in_statement425);
                    s3=foreachStatement();

                    state._fsp--;
                    if (state.failed) return s;
                    if ( state.backtracking==0 ) {
                      s =s3;
                    }

                    }
                    break;
                case 4 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:97:3: s4= ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement433);
                    s4=ifStatement();

                    state._fsp--;
                    if (state.failed) return s;
                    if ( state.backtracking==0 ) {
                      s =s4;
                    }

                    }
                    break;
                case 5 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:98:3: s5= letStatement
                    {
                    pushFollow(FOLLOW_letStatement_in_statement441);
                    s5=letStatement();

                    state._fsp--;
                    if (state.failed) return s;
                    if ( state.backtracking==0 ) {
                      s =s5;
                    }

                    }
                    break;
                case 6 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:99:3: s6= protectStatement
                    {
                    pushFollow(FOLLOW_protectStatement_in_statement449);
                    s6=protectStatement();

                    state._fsp--;
                    if (state.failed) return s;
                    if ( state.backtracking==0 ) {
                      s =s6;
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
        return s;
    }
    // $ANTLR end "statement"


    // $ANTLR start "textSequence"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:102:1: textSequence returns [List<Statement> s=new ArrayList<Statement>();] : t= text ( COMMENT t1= text )* ;
    public List<Statement> textSequence() throws RecognitionException {
        List<Statement> s = new ArrayList<Statement>();;

        Statement t = null;

        Statement t1 = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:102:70: (t= text ( COMMENT t1= text )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:103:2: t= text ( COMMENT t1= text )*
            {
            pushFollow(FOLLOW_text_in_textSequence468);
            t=text();

            state._fsp--;
            if (state.failed) return s;
            if ( state.backtracking==0 ) {
              s.add(t);
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:104:3: ( COMMENT t1= text )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMENT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:104:4: COMMENT t1= text
            	    {
            	    match(input,COMMENT,FOLLOW_COMMENT_in_textSequence475); if (state.failed) return s;
            	    pushFollow(FOLLOW_text_in_textSequence479);
            	    t1=text();

            	    state._fsp--;
            	    if (state.failed) return s;
            	    if ( state.backtracking==0 ) {
            	      s.add(t1);
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
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
        return s;
    }
    // $ANTLR end "textSequence"


    // $ANTLR start "text"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:107:1: text returns [Statement s] : (m= '-' )? t= TEXT ;
    public Statement text() throws RecognitionException {
        Statement s = null;

        Token m=null;
        Token t=null;

        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:107:28: ( (m= '-' )? t= TEXT )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:108:2: (m= '-' )? t= TEXT
            {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:108:2: (m= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:108:3: m= '-'
                    {
                    m=(Token)match(input,32,FOLLOW_32_in_text500); if (state.failed) return s;

                    }
                    break;

            }

            t=(Token)match(input,TEXT,FOLLOW_TEXT_in_text506); if (state.failed) return s;
            if ( state.backtracking==0 ) {
              s = factory.createTextStatement(id(t),id(m));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "text"


    // $ANTLR start "simpleStatement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:111:1: simpleStatement returns [Statement s] : (s1= errorStatement | s2= expandStatement | s3= expressionStmt );
    public Statement simpleStatement() throws RecognitionException {
        Statement s = null;

        ErrorStatement s1 = null;

        ExpandStatement s2 = null;

        ExpressionStatement s3 = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:111:39: (s1= errorStatement | s2= expandStatement | s3= expressionStmt )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt19=1;
                }
                break;
            case 34:
                {
                alt19=2;
                }
                break;
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 23:
            case 32:
            case 55:
            case 60:
            case 63:
            case 64:
            case 79:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 97:
            case 98:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:112:3: s1= errorStatement
                    {
                    pushFollow(FOLLOW_errorStatement_in_simpleStatement525);
                    s1=errorStatement();

                    state._fsp--;
                    if (state.failed) return s;
                    if ( state.backtracking==0 ) {
                      s =s1;
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:113:3: s2= expandStatement
                    {
                    pushFollow(FOLLOW_expandStatement_in_simpleStatement533);
                    s2=expandStatement();

                    state._fsp--;
                    if (state.failed) return s;
                    if ( state.backtracking==0 ) {
                      s =s2;
                    }

                    }
                    break;
                case 3 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:114:3: s3= expressionStmt
                    {
                    pushFollow(FOLLOW_expressionStmt_in_simpleStatement541);
                    s3=expressionStmt();

                    state._fsp--;
                    if (state.failed) return s;
                    if ( state.backtracking==0 ) {
                      s =s3;
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
        return s;
    }
    // $ANTLR end "simpleStatement"


    // $ANTLR start "errorStatement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:117:1: errorStatement returns [ErrorStatement e] : 'ERROR' expr= expression ;
    public ErrorStatement errorStatement() throws RecognitionException {
        ErrorStatement e = null;

        Expression expr = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:117:43: ( 'ERROR' expr= expression )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:118:3: 'ERROR' expr= expression
            {
            match(input,33,FOLLOW_33_in_errorStatement558); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_errorStatement562);
            expr=expression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = factory.createErrorStatement(expr); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "errorStatement"


    // $ANTLR start "expandStatement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:121:1: expandStatement returns [ExpandStatement e] : 'EXPAND' t= definitionName ( '(' pl= parameterList ')' )? ( ( 'FOR' expr= expression ) | (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? ) )? (onFileClose= 'ONFILECLOSE' )? ;
    public ExpandStatement expandStatement() throws RecognitionException {
        ExpandStatement e = null;

        Token fe=null;
        Token onFileClose=null;
        Identifier t = null;

        List<Expression> pl = null;

        Expression expr = null;

        Expression sep = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:121:45: ( 'EXPAND' t= definitionName ( '(' pl= parameterList ')' )? ( ( 'FOR' expr= expression ) | (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? ) )? (onFileClose= 'ONFILECLOSE' )? )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:122:3: 'EXPAND' t= definitionName ( '(' pl= parameterList ')' )? ( ( 'FOR' expr= expression ) | (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? ) )? (onFileClose= 'ONFILECLOSE' )?
            {
            match(input,34,FOLLOW_34_in_expandStatement579); if (state.failed) return e;
            pushFollow(FOLLOW_definitionName_in_expandStatement583);
            t=definitionName();

            state._fsp--;
            if (state.failed) return e;
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:122:29: ( '(' pl= parameterList ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:122:30: '(' pl= parameterList ')'
                    {
                    match(input,23,FOLLOW_23_in_expandStatement586); if (state.failed) return e;
                    pushFollow(FOLLOW_parameterList_in_expandStatement590);
                    pl=parameterList();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,26,FOLLOW_26_in_expandStatement592); if (state.failed) return e;

                    }
                    break;

            }

            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:122:57: ( ( 'FOR' expr= expression ) | (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            else if ( (LA22_0==35) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:122:58: ( 'FOR' expr= expression )
                    {
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:122:58: ( 'FOR' expr= expression )
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:122:59: 'FOR' expr= expression
                    {
                    match(input,27,FOLLOW_27_in_expandStatement598); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expandStatement602);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return e;

                    }


                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:123:5: (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? )
                    {
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:123:5: (fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )? )
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:123:6: fe= 'FOREACH' expr= expression ( 'SEPARATOR' sep= expression )?
                    {
                    fe=(Token)match(input,35,FOLLOW_35_in_expandStatement612); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_expandStatement616);
                    expr=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:123:35: ( 'SEPARATOR' sep= expression )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==36) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:123:36: 'SEPARATOR' sep= expression
                            {
                            match(input,36,FOLLOW_36_in_expandStatement619); if (state.failed) return e;
                            pushFollow(FOLLOW_expression_in_expandStatement623);
                            sep=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:124:3: (onFileClose= 'ONFILECLOSE' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:124:4: onFileClose= 'ONFILECLOSE'
                    {
                    onFileClose=(Token)match(input,37,FOLLOW_37_in_expandStatement635); if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              e = factory.createExpandStatement(t,pl,expr,fe!=null,sep,onFileClose!=null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "expandStatement"


    // $ANTLR start "definitionName"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:129:1: definitionName returns [Identifier id] : id1= simpleType ;
    public Identifier definitionName() throws RecognitionException {
        Identifier id = null;

        Identifier id1 = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:129:40: (id1= simpleType )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:130:2: id1= simpleType
            {
            pushFollow(FOLLOW_simpleType_in_definitionName662);
            id1=simpleType();

            state._fsp--;
            if (state.failed) return id;
            if ( state.backtracking==0 ) {
              id =id1;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "definitionName"


    // $ANTLR start "expressionStmt"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:133:1: expressionStmt returns [ExpressionStatement es] : e= expression ;
    public ExpressionStatement expressionStmt() throws RecognitionException {
        ExpressionStatement es = null;

        Expression e = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:133:49: (e= expression )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:134:2: e= expression
            {
            pushFollow(FOLLOW_expression_in_expressionStmt680);
            e=expression();

            state._fsp--;
            if (state.failed) return es;
            if ( state.backtracking==0 ) {
              es = factory.createExpressionStatement(e);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return es;
    }
    // $ANTLR end "expressionStmt"


    // $ANTLR start "fileStatement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:137:1: fileStatement returns [FileStatement f] : 'FILE' e= expression (option= identifier )? s= sequence 'ENDFILE' ;
    public FileStatement fileStatement() throws RecognitionException {
        FileStatement f = null;

        Expression e = null;

        Identifier option = null;

        List<Statement> s = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:137:41: ( 'FILE' e= expression (option= identifier )? s= sequence 'ENDFILE' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:138:2: 'FILE' e= expression (option= identifier )? s= sequence 'ENDFILE'
            {
            match(input,38,FOLLOW_38_in_fileStatement696); if (state.failed) return f;
            pushFollow(FOLLOW_expression_in_fileStatement700);
            e=expression();

            state._fsp--;
            if (state.failed) return f;
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:138:22: (option= identifier )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Identifier) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:138:23: option= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_fileStatement705);
                    option=identifier();

                    state._fsp--;
                    if (state.failed) return f;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequence_in_fileStatement713);
            s=sequence();

            state._fsp--;
            if (state.failed) return f;
            match(input,39,FOLLOW_39_in_fileStatement717); if (state.failed) return f;
            if ( state.backtracking==0 ) {
              f = factory.createFileStatement(e,option,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return f;
    }
    // $ANTLR end "fileStatement"


    // $ANTLR start "foreachStatement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:144:1: foreachStatement returns [ForEachStatement f] : 'FOREACH' e= expression 'AS' v= identifier ( 'ITERATOR' iter= identifier )? ( 'SEPARATOR' sep= expression )? s= sequence 'ENDFOREACH' ;
    public ForEachStatement foreachStatement() throws RecognitionException {
        ForEachStatement f = null;

        Expression e = null;

        Identifier v = null;

        Identifier iter = null;

        Expression sep = null;

        List<Statement> s = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:144:46: ( 'FOREACH' e= expression 'AS' v= identifier ( 'ITERATOR' iter= identifier )? ( 'SEPARATOR' sep= expression )? s= sequence 'ENDFOREACH' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:145:3: 'FOREACH' e= expression 'AS' v= identifier ( 'ITERATOR' iter= identifier )? ( 'SEPARATOR' sep= expression )? s= sequence 'ENDFOREACH'
            {
            match(input,35,FOLLOW_35_in_foreachStatement735); if (state.failed) return f;
            pushFollow(FOLLOW_expression_in_foreachStatement739);
            e=expression();

            state._fsp--;
            if (state.failed) return f;
            match(input,40,FOLLOW_40_in_foreachStatement741); if (state.failed) return f;
            pushFollow(FOLLOW_identifier_in_foreachStatement745);
            v=identifier();

            state._fsp--;
            if (state.failed) return f;
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:145:44: ( 'ITERATOR' iter= identifier )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:145:45: 'ITERATOR' iter= identifier
                    {
                    match(input,41,FOLLOW_41_in_foreachStatement748); if (state.failed) return f;
                    pushFollow(FOLLOW_identifier_in_foreachStatement752);
                    iter=identifier();

                    state._fsp--;
                    if (state.failed) return f;

                    }
                    break;

            }

            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:145:74: ( 'SEPARATOR' sep= expression )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:145:75: 'SEPARATOR' sep= expression
                    {
                    match(input,36,FOLLOW_36_in_foreachStatement757); if (state.failed) return f;
                    pushFollow(FOLLOW_expression_in_foreachStatement761);
                    sep=expression();

                    state._fsp--;
                    if (state.failed) return f;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequence_in_foreachStatement771);
            s=sequence();

            state._fsp--;
            if (state.failed) return f;
            match(input,42,FOLLOW_42_in_foreachStatement776); if (state.failed) return f;
            if ( state.backtracking==0 ) {
              f = factory.createForEachStatement(e,v,sep,iter,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return f;
    }
    // $ANTLR end "foreachStatement"


    // $ANTLR start "ifStatement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:151:1: ifStatement returns [IfStatement i] : 'IF' e= expression s= sequence (elif= elseIfStatement )* (el= elseStatement )? 'ENDIF' ;
    public IfStatement ifStatement() throws RecognitionException {
        IfStatement i = null;

        Expression e = null;

        List<Statement> s = null;

        IfStatement elif = null;

        IfStatement el = null;


        IfStatement temp = null;
        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:151:68: ( 'IF' e= expression s= sequence (elif= elseIfStatement )* (el= elseStatement )? 'ENDIF' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:152:6: 'IF' e= expression s= sequence (elif= elseIfStatement )* (el= elseStatement )? 'ENDIF'
            {
            match(input,43,FOLLOW_43_in_ifStatement802); if (state.failed) return i;
            pushFollow(FOLLOW_expression_in_ifStatement806);
            e=expression();

            state._fsp--;
            if (state.failed) return i;
            pushFollow(FOLLOW_sequence_in_ifStatement812);
            s=sequence();

            state._fsp--;
            if (state.failed) return i;
            if ( state.backtracking==0 ) {
              i = factory.createIfStatement(e,s);
              		 temp = i;
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:156:3: (elif= elseIfStatement )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==45) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:156:4: elif= elseIfStatement
            	    {
            	    pushFollow(FOLLOW_elseIfStatement_in_ifStatement824);
            	    elif=elseIfStatement();

            	    state._fsp--;
            	    if (state.failed) return i;
            	    if ( state.backtracking==0 ) {
            	      temp.setElseIf(elif);
            	      	 			temp = elif; 
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:158:3: (el= elseStatement )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:158:4: el= elseStatement
                    {
                    pushFollow(FOLLOW_elseStatement_in_ifStatement835);
                    el=elseStatement();

                    state._fsp--;
                    if (state.failed) return i;
                    if ( state.backtracking==0 ) {
                      temp.setElseIf(el);
                      	 			temp = el; 
                    }

                    }
                    break;

            }

            match(input,44,FOLLOW_44_in_ifStatement847); if (state.failed) return i;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "elseIfStatement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:163:1: elseIfStatement returns [IfStatement i] : 'ELSEIF' e= expression s= sequence ;
    public IfStatement elseIfStatement() throws RecognitionException {
        IfStatement i = null;

        Expression e = null;

        List<Statement> s = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:163:41: ( 'ELSEIF' e= expression s= sequence )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:164:2: 'ELSEIF' e= expression s= sequence
            {
            match(input,45,FOLLOW_45_in_elseIfStatement861); if (state.failed) return i;
            pushFollow(FOLLOW_expression_in_elseIfStatement865);
            e=expression();

            state._fsp--;
            if (state.failed) return i;
            pushFollow(FOLLOW_sequence_in_elseIfStatement871);
            s=sequence();

            state._fsp--;
            if (state.failed) return i;
            if ( state.backtracking==0 ) {
              i = factory.createIfStatement(e,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end "elseIfStatement"


    // $ANTLR start "elseStatement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:169:1: elseStatement returns [IfStatement i] : 'ELSE' s= sequence ;
    public IfStatement elseStatement() throws RecognitionException {
        IfStatement i = null;

        List<Statement> s = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:169:39: ( 'ELSE' s= sequence )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:170:2: 'ELSE' s= sequence
            {
            match(input,46,FOLLOW_46_in_elseStatement892); if (state.failed) return i;
            pushFollow(FOLLOW_sequence_in_elseStatement898);
            s=sequence();

            state._fsp--;
            if (state.failed) return i;
            if ( state.backtracking==0 ) {
              i = factory.createIfStatement(null,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end "elseStatement"


    // $ANTLR start "letStatement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:175:1: letStatement returns [LetStatement l] : 'LET' e= expression 'AS' v= identifier s= sequence 'ENDLET' ;
    public LetStatement letStatement() throws RecognitionException {
        LetStatement l = null;

        Expression e = null;

        Identifier v = null;

        List<Statement> s = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:175:39: ( 'LET' e= expression 'AS' v= identifier s= sequence 'ENDLET' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:176:3: 'LET' e= expression 'AS' v= identifier s= sequence 'ENDLET'
            {
            match(input,47,FOLLOW_47_in_letStatement919); if (state.failed) return l;
            pushFollow(FOLLOW_expression_in_letStatement923);
            e=expression();

            state._fsp--;
            if (state.failed) return l;
            match(input,40,FOLLOW_40_in_letStatement925); if (state.failed) return l;
            pushFollow(FOLLOW_identifier_in_letStatement929);
            v=identifier();

            state._fsp--;
            if (state.failed) return l;
            pushFollow(FOLLOW_sequence_in_letStatement937);
            s=sequence();

            state._fsp--;
            if (state.failed) return l;
            match(input,48,FOLLOW_48_in_letStatement942); if (state.failed) return l;
            if ( state.backtracking==0 ) {
              l = factory.createLetStatement(e,v,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end "letStatement"


    // $ANTLR start "protectStatement"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:182:1: protectStatement returns [ProtectStatement l] : 'PROTECT' 'CSTART' startC= expression 'CEND' endC= expression 'ID' id= expression (disabled= 'DISABLE' )? s= sequence 'ENDPROTECT' ;
    public ProtectStatement protectStatement() throws RecognitionException {
        ProtectStatement l = null;

        Token disabled=null;
        Expression startC = null;

        Expression endC = null;

        Expression id = null;

        List<Statement> s = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:182:47: ( 'PROTECT' 'CSTART' startC= expression 'CEND' endC= expression 'ID' id= expression (disabled= 'DISABLE' )? s= sequence 'ENDPROTECT' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:183:2: 'PROTECT' 'CSTART' startC= expression 'CEND' endC= expression 'ID' id= expression (disabled= 'DISABLE' )? s= sequence 'ENDPROTECT'
            {
            match(input,49,FOLLOW_49_in_protectStatement961); if (state.failed) return l;
            match(input,50,FOLLOW_50_in_protectStatement966); if (state.failed) return l;
            pushFollow(FOLLOW_expression_in_protectStatement970);
            startC=expression();

            state._fsp--;
            if (state.failed) return l;
            match(input,51,FOLLOW_51_in_protectStatement975); if (state.failed) return l;
            pushFollow(FOLLOW_expression_in_protectStatement979);
            endC=expression();

            state._fsp--;
            if (state.failed) return l;
            match(input,52,FOLLOW_52_in_protectStatement992); if (state.failed) return l;
            pushFollow(FOLLOW_expression_in_protectStatement996);
            id=expression();

            state._fsp--;
            if (state.failed) return l;
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:186:30: (disabled= 'DISABLE' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:186:31: disabled= 'DISABLE'
                    {
                    disabled=(Token)match(input,53,FOLLOW_53_in_protectStatement1001); if (state.failed) return l;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequence_in_protectStatement1010);
            s=sequence();

            state._fsp--;
            if (state.failed) return l;
            match(input,54,FOLLOW_54_in_protectStatement1014); if (state.failed) return l;
            if ( state.backtracking==0 ) {
              l = factory.createProtectStatement(startC,endC,id,disabled!=null,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return l;
    }
    // $ANTLR end "protectStatement"


    // $ANTLR start "expression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:195:1: expression returns [Expression e] : x= letExpression ;
    public Expression expression() throws RecognitionException {
        Expression e = null;

        Expression x = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:195:34: (x= letExpression )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:196:2: x= letExpression
            {
            pushFollow(FOLLOW_letExpression_in_expression1036);
            x=letExpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =x;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "expression"


    // $ANTLR start "letExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:199:1: letExpression returns [Expression e] : ( 'let' v= identifier '=' varExpr= castedExpression ':' target= expression | x= castedExpression );
    public Expression letExpression() throws RecognitionException {
        Expression e = null;

        Identifier v = null;

        Expression varExpr = null;

        Expression target = null;

        Expression x = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:199:39: ( 'let' v= identifier '=' varExpr= castedExpression ':' target= expression | x= castedExpression )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=StringLiteral && LA30_0<=Identifier)||LA30_0==23||LA30_0==32||LA30_0==60||(LA30_0>=63 && LA30_0<=64)||LA30_0==79||(LA30_0>=81 && LA30_0<=94)||(LA30_0>=96 && LA30_0<=98)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:200:4: 'let' v= identifier '=' varExpr= castedExpression ':' target= expression
                    {
                    match(input,55,FOLLOW_55_in_letExpression1055); if (state.failed) return e;
                    pushFollow(FOLLOW_identifier_in_letExpression1059);
                    v=identifier();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,56,FOLLOW_56_in_letExpression1061); if (state.failed) return e;
                    pushFollow(FOLLOW_castedExpression_in_letExpression1065);
                    varExpr=castedExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,57,FOLLOW_57_in_letExpression1067); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_letExpression1071);
                    target=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =factory.createLetExpression(v,varExpr,target);
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:202:4: x= castedExpression
                    {
                    pushFollow(FOLLOW_castedExpression_in_letExpression1084);
                    x=castedExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
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
        return e;
    }
    // $ANTLR end "letExpression"


    // $ANTLR start "castedExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:205:1: castedExpression returns [Expression e] : ( ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression | x= chainExpression );
    public Expression castedExpression() throws RecognitionException {
        Expression e = null;

        Identifier t = null;

        Expression x = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:205:41: ( ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression | x= chainExpression )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:206:5: ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression
                    {
                    match(input,23,FOLLOW_23_in_castedExpression1115); if (state.failed) return e;
                    pushFollow(FOLLOW_type_in_castedExpression1119);
                    t=type();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,26,FOLLOW_26_in_castedExpression1121); if (state.failed) return e;
                    pushFollow(FOLLOW_chainExpression_in_castedExpression1125);
                    x=chainExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e = factory.createCast(t,x);
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:208:4: x= chainExpression
                    {
                    pushFollow(FOLLOW_chainExpression_in_castedExpression1134);
                    x=chainExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
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
        return e;
    }
    // $ANTLR end "castedExpression"


    // $ANTLR start "chainExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:212:1: chainExpression returns [Expression e] : x= ifExpression ( '->' right= ifExpression )* ;
    public Expression chainExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;

        Expression right = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:212:41: (x= ifExpression ( '->' right= ifExpression )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:213:2: x= ifExpression ( '->' right= ifExpression )*
            {
            pushFollow(FOLLOW_ifExpression_in_chainExpression1154);
            x=ifExpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =x;
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:213:25: ( '->' right= ifExpression )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==58) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:213:27: '->' right= ifExpression
            	    {
            	    match(input,58,FOLLOW_58_in_chainExpression1160); if (state.failed) return e;
            	    pushFollow(FOLLOW_ifExpression_in_chainExpression1164);
            	    right=ifExpression();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    if ( state.backtracking==0 ) {
            	      e =factory.createChainExpression(e,right);
            	    }

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
        return e;
    }
    // $ANTLR end "chainExpression"


    // $ANTLR start "ifExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:216:1: ifExpression returns [Expression e] : (x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )? | 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )? );
    public Expression ifExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;

        Expression thenPart = null;

        Expression elsePart = null;

        Expression condition = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:216:38: (x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )? | 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )? )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=StringLiteral && LA35_0<=Identifier)||LA35_0==23||LA35_0==32||(LA35_0>=63 && LA35_0<=64)||LA35_0==79||(LA35_0>=81 && LA35_0<=94)||(LA35_0>=96 && LA35_0<=98)) ) {
                alt35=1;
            }
            else if ( (LA35_0==60) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:217:2: x= switchExpression ( '?' thenPart= switchExpression ':' elsePart= switchExpression )?
                    {
                    pushFollow(FOLLOW_switchExpression_in_ifExpression1185);
                    x=switchExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
                    }
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:217:28: ( '?' thenPart= switchExpression ':' elsePart= switchExpression )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==59) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:217:29: '?' thenPart= switchExpression ':' elsePart= switchExpression
                            {
                            match(input,59,FOLLOW_59_in_ifExpression1189); if (state.failed) return e;
                            pushFollow(FOLLOW_switchExpression_in_ifExpression1193);
                            thenPart=switchExpression();

                            state._fsp--;
                            if (state.failed) return e;
                            match(input,57,FOLLOW_57_in_ifExpression1195); if (state.failed) return e;
                            pushFollow(FOLLOW_switchExpression_in_ifExpression1199);
                            elsePart=switchExpression();

                            state._fsp--;
                            if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                              e =factory.createIf(e,thenPart,elsePart);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:218:3: 'if' condition= switchExpression 'then' thenPart= switchExpression ( 'else' elsePart= expression )?
                    {
                    match(input,60,FOLLOW_60_in_ifExpression1207); if (state.failed) return e;
                    pushFollow(FOLLOW_switchExpression_in_ifExpression1211);
                    condition=switchExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,61,FOLLOW_61_in_ifExpression1213); if (state.failed) return e;
                    pushFollow(FOLLOW_switchExpression_in_ifExpression1217);
                    thenPart=switchExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:218:68: ( 'else' elsePart= expression )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==62) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:218:69: 'else' elsePart= expression
                            {
                            match(input,62,FOLLOW_62_in_ifExpression1220); if (state.failed) return e;
                            pushFollow(FOLLOW_expression_in_ifExpression1224);
                            elsePart=expression();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      e =factory.createIf(condition,thenPart,elsePart);
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
        return e;
    }
    // $ANTLR end "ifExpression"


    // $ANTLR start "switchExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:222:1: switchExpression returns [Expression e=null] : ( 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}' | x= orExpression );
    public Expression switchExpression() throws RecognitionException {
        Expression e = null;

        Expression pred = null;

        Expression c = null;

        Expression v = null;

        Expression def = null;

        Expression x = null;


        List cases = new ArrayList();
        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:222:85: ( 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}' | x= orExpression )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==63) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=StringLiteral && LA38_0<=Identifier)||LA38_0==23||LA38_0==32||LA38_0==64||LA38_0==79||(LA38_0>=81 && LA38_0<=94)||(LA38_0>=96 && LA38_0<=98)) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:223:4: 'switch' ( '(' pred= orExpression ')' )? '{' ( 'case' c= orExpression ':' v= orExpression )* 'default' ':' def= orExpression '}'
                    {
                    match(input,63,FOLLOW_63_in_switchExpression1251); if (state.failed) return e;
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:223:13: ( '(' pred= orExpression ')' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==23) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:223:14: '(' pred= orExpression ')'
                            {
                            match(input,23,FOLLOW_23_in_switchExpression1254); if (state.failed) return e;
                            pushFollow(FOLLOW_orExpression_in_switchExpression1260);
                            pred=orExpression();

                            state._fsp--;
                            if (state.failed) return e;
                            match(input,26,FOLLOW_26_in_switchExpression1262); if (state.failed) return e;

                            }
                            break;

                    }

                    match(input,64,FOLLOW_64_in_switchExpression1269); if (state.failed) return e;
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:225:4: ( 'case' c= orExpression ':' v= orExpression )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==65) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:226:6: 'case' c= orExpression ':' v= orExpression
                    	    {
                    	    match(input,65,FOLLOW_65_in_switchExpression1282); if (state.failed) return e;
                    	    pushFollow(FOLLOW_orExpression_in_switchExpression1286);
                    	    c=orExpression();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,57,FOLLOW_57_in_switchExpression1289); if (state.failed) return e;
                    	    pushFollow(FOLLOW_orExpression_in_switchExpression1294);
                    	    v=orExpression();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    if ( state.backtracking==0 ) {
                    	      cases.add(factory.createCase(c, v));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    match(input,66,FOLLOW_66_in_switchExpression1312); if (state.failed) return e;
                    match(input,57,FOLLOW_57_in_switchExpression1314); if (state.failed) return e;
                    pushFollow(FOLLOW_orExpression_in_switchExpression1320);
                    def=orExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,67,FOLLOW_67_in_switchExpression1325); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e = factory.createSwitchExpression(pred,cases,def);
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:232:4: x= orExpression
                    {
                    pushFollow(FOLLOW_orExpression_in_switchExpression1337);
                    x=orExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
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
        return e;
    }
    // $ANTLR end "switchExpression"


    // $ANTLR start "orExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:235:1: orExpression returns [Expression e] : x= andExpression (name= '||' r= andExpression )* ;
    public Expression orExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:235:37: (x= andExpression (name= '||' r= andExpression )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:236:4: x= andExpression (name= '||' r= andExpression )*
            {
            pushFollow(FOLLOW_andExpression_in_orExpression1357);
            x=andExpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =x;
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:236:28: (name= '||' r= andExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==68) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:236:29: name= '||' r= andExpression
            	    {
            	    name=(Token)match(input,68,FOLLOW_68_in_orExpression1364); if (state.failed) return e;
            	    pushFollow(FOLLOW_andExpression_in_orExpression1368);
            	    r=andExpression();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    if ( state.backtracking==0 ) {
            	      e = factory.createBooleanOperation(id(name),e,r);
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
        return e;
    }
    // $ANTLR end "orExpression"


    // $ANTLR start "andExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:239:1: andExpression returns [Expression e] : x= impliesExpression (name= '&&' r= impliesExpression )* ;
    public Expression andExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:239:39: (x= impliesExpression (name= '&&' r= impliesExpression )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:240:2: x= impliesExpression (name= '&&' r= impliesExpression )*
            {
            pushFollow(FOLLOW_impliesExpression_in_andExpression1391);
            x=impliesExpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =x;
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:240:30: (name= '&&' r= impliesExpression )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==69) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:240:31: name= '&&' r= impliesExpression
            	    {
            	    name=(Token)match(input,69,FOLLOW_69_in_andExpression1398); if (state.failed) return e;
            	    pushFollow(FOLLOW_impliesExpression_in_andExpression1402);
            	    r=impliesExpression();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    if ( state.backtracking==0 ) {
            	      e = factory.createBooleanOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
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
        return e;
    }
    // $ANTLR end "andExpression"


    // $ANTLR start "impliesExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:243:1: impliesExpression returns [Expression e] : x= relationalExpression (name= 'implies' r= relationalExpression )* ;
    public Expression impliesExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:243:42: (x= relationalExpression (name= 'implies' r= relationalExpression )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:244:2: x= relationalExpression (name= 'implies' r= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_impliesExpression1424);
            x=relationalExpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =x;
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:244:33: (name= 'implies' r= relationalExpression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==70) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:244:34: name= 'implies' r= relationalExpression
            	    {
            	    name=(Token)match(input,70,FOLLOW_70_in_impliesExpression1431); if (state.failed) return e;
            	    pushFollow(FOLLOW_relationalExpression_in_impliesExpression1435);
            	    r=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    if ( state.backtracking==0 ) {
            	      e = factory.createBooleanOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop41;
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
        return e;
    }
    // $ANTLR end "impliesExpression"


    // $ANTLR start "relationalExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:248:1: relationalExpression returns [Expression e] : x= additiveExpression (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )* ;
    public Expression relationalExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:248:45: (x= additiveExpression (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:249:2: x= additiveExpression (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1459);
            x=additiveExpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =x;
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:250:2: (name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=71 && LA42_0<=76)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:250:3: name= ( '==' | '!=' | '>=' | '<=' | '>' | '<' ) r= additiveExpression
            	    {
            	    name=(Token)input.LT(1);
            	    if ( (input.LA(1)>=71 && input.LA(1)<=76) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return e;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression1493);
            	    r=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    if ( state.backtracking==0 ) {
            	      e = factory.createBinaryOperation(id(name),e,r);
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
        return e;
    }
    // $ANTLR end "relationalExpression"


    // $ANTLR start "additiveExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:254:1: additiveExpression returns [Expression e] : x= multiplicativeExpression (name= ( '+' | '-' ) r= multiplicativeExpression )* ;
    public Expression additiveExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:254:43: (x= multiplicativeExpression (name= ( '+' | '-' ) r= multiplicativeExpression )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:255:2: x= multiplicativeExpression (name= ( '+' | '-' ) r= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1514);
            x=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =x;
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:256:4: (name= ( '+' | '-' ) r= multiplicativeExpression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==32) ) {
                    int LA43_2 = input.LA(2);

                    if ( ((LA43_2>=StringLiteral && LA43_2<=Identifier)||LA43_2==23||LA43_2==32||LA43_2==64||LA43_2==79||(LA43_2>=81 && LA43_2<=94)||(LA43_2>=96 && LA43_2<=98)) ) {
                        alt43=1;
                    }


                }
                else if ( (LA43_0==77) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:256:5: name= ( '+' | '-' ) r= multiplicativeExpression
            	    {
            	    name=(Token)input.LT(1);
            	    if ( input.LA(1)==32||input.LA(1)==77 ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return e;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1533);
            	    r=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    if ( state.backtracking==0 ) {
            	      e = factory.createBinaryOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop43;
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
        return e;
    }
    // $ANTLR end "additiveExpression"


    // $ANTLR start "multiplicativeExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:259:1: multiplicativeExpression returns [Expression e] : x= unaryExpression (name= ( '*' | '/' ) r= unaryExpression )* ;
    public Expression multiplicativeExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;

        Expression r = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:259:48: (x= unaryExpression (name= ( '*' | '/' ) r= unaryExpression )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:260:2: x= unaryExpression (name= ( '*' | '/' ) r= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1552);
            x=unaryExpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =x;
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:261:2: (name= ( '*' | '/' ) r= unaryExpression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==25||LA44_0==78) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:261:3: name= ( '*' | '/' ) r= unaryExpression
            	    {
            	    name=(Token)input.LT(1);
            	    if ( input.LA(1)==25||input.LA(1)==78 ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return e;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1570);
            	    r=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    if ( state.backtracking==0 ) {
            	      e = factory.createBinaryOperation(id(name),e,r);
            	    }

            	    }
            	    break;

            	default :
            	    break loop44;
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
        return e;
    }
    // $ANTLR end "multiplicativeExpression"


    // $ANTLR start "unaryExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:265:1: unaryExpression returns [Expression e] : (x= infixExpression | name= '!' x= infixExpression | name= '-' x= infixExpression );
    public Expression unaryExpression() throws RecognitionException {
        Expression e = null;

        Token name=null;
        Expression x = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:265:40: (x= infixExpression | name= '!' x= infixExpression | name= '-' x= infixExpression )
            int alt45=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntLiteral:
            case Identifier:
            case 23:
            case 64:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 97:
            case 98:
                {
                alt45=1;
                }
                break;
            case 79:
                {
                alt45=2;
                }
                break;
            case 32:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:266:2: x= infixExpression
                    {
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression1591);
                    x=infixExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:267:3: name= '!' x= infixExpression
                    {
                    name=(Token)match(input,79,FOLLOW_79_in_unaryExpression1599); if (state.failed) return e;
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression1603);
                    x=infixExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e = factory.createOperationCall(id(name),x);
                    }

                    }
                    break;
                case 3 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:268:3: name= '-' x= infixExpression
                    {
                    name=(Token)match(input,32,FOLLOW_32_in_unaryExpression1611); if (state.failed) return e;
                    pushFollow(FOLLOW_infixExpression_in_unaryExpression1615);
                    x=infixExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e = factory.createOperationCall(id(name),x);
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
        return e;
    }
    // $ANTLR end "unaryExpression"


    // $ANTLR start "infixExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:271:1: infixExpression returns [Expression e] : x= primaryExpression ( '.' op= featureCall )* ;
    public Expression infixExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;

        FeatureCall op = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:271:40: (x= primaryExpression ( '.' op= featureCall )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:272:2: x= primaryExpression ( '.' op= featureCall )*
            {
            pushFollow(FOLLOW_primaryExpression_in_infixExpression1633);
            x=primaryExpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =x;
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:272:30: ( '.' op= featureCall )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==80) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:272:32: '.' op= featureCall
            	    {
            	    match(input,80,FOLLOW_80_in_infixExpression1639); if (state.failed) return e;
            	    pushFollow(FOLLOW_featureCall_in_infixExpression1643);
            	    op=featureCall();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    if ( state.backtracking==0 ) {
            	       if (op!=null) { op.setTarget(e);e =op; }
            	    }

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
        return e;
    }
    // $ANTLR end "infixExpression"


    // $ANTLR start "primaryExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:275:1: primaryExpression returns [Expression e] : (c= StringLiteral | x= featureCall | x= booleanLiteral | x= numberLiteral | x= nullLiteral | x= listLiteral | x= constructorCall | x= globalVarExpression | x= paranthesizedExpression );
    public Expression primaryExpression() throws RecognitionException {
        Expression e = null;

        Token c=null;
        Expression x = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:275:44: (c= StringLiteral | x= featureCall | x= booleanLiteral | x= numberLiteral | x= nullLiteral | x= listLiteral | x= constructorCall | x= globalVarExpression | x= paranthesizedExpression )
            int alt47=9;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt47=1;
                }
                break;
            case Identifier:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 97:
            case 98:
                {
                alt47=2;
                }
                break;
            case 83:
            case 84:
                {
                alt47=3;
                }
                break;
            case IntLiteral:
                {
                alt47=4;
                }
                break;
            case 85:
                {
                alt47=5;
                }
                break;
            case 64:
                {
                alt47=6;
                }
                break;
            case 82:
                {
                alt47=7;
                }
                break;
            case 81:
                {
                alt47=8;
                }
                break;
            case 23:
                {
                alt47=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:276:4: c= StringLiteral
                    {
                    c=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_primaryExpression1669); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = factory.createStringLiteral(id(c));
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:277:5: x= featureCall
                    {
                    pushFollow(FOLLOW_featureCall_in_primaryExpression1680);
                    x=featureCall();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 3 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:278:5: x= booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_primaryExpression1690);
                    x=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 4 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:279:5: x= numberLiteral
                    {
                    pushFollow(FOLLOW_numberLiteral_in_primaryExpression1700);
                    x=numberLiteral();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 5 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:280:5: x= nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_primaryExpression1710);
                    x=nullLiteral();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 6 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:281:5: x= listLiteral
                    {
                    pushFollow(FOLLOW_listLiteral_in_primaryExpression1720);
                    x=listLiteral();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 7 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:282:5: x= constructorCall
                    {
                    pushFollow(FOLLOW_constructorCall_in_primaryExpression1730);
                    x=constructorCall();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 8 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:283:5: x= globalVarExpression
                    {
                    pushFollow(FOLLOW_globalVarExpression_in_primaryExpression1740);
                    x=globalVarExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
                    }

                    }
                    break;
                case 9 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:284:5: x= paranthesizedExpression
                    {
                    pushFollow(FOLLOW_paranthesizedExpression_in_primaryExpression1750);
                    x=paranthesizedExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
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
        return e;
    }
    // $ANTLR end "primaryExpression"


    // $ANTLR start "paranthesizedExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:287:1: paranthesizedExpression returns [Expression e] : '(' x= expression ')' ;
    public Expression paranthesizedExpression() throws RecognitionException {
        Expression e = null;

        Expression x = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:287:48: ( '(' x= expression ')' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:288:5: '(' x= expression ')'
            {
            match(input,23,FOLLOW_23_in_paranthesizedExpression1769); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_paranthesizedExpression1773);
            x=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,26,FOLLOW_26_in_paranthesizedExpression1775); if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =factory.createParanthesizedExpression(x);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "paranthesizedExpression"


    // $ANTLR start "globalVarExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:291:1: globalVarExpression returns [GlobalVarExpression e] : 'GLOBALVAR' name= identifier ;
    public GlobalVarExpression globalVarExpression() throws RecognitionException {
        GlobalVarExpression e = null;

        Identifier name = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:291:54: ( 'GLOBALVAR' name= identifier )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:292:5: 'GLOBALVAR' name= identifier
            {
            match(input,81,FOLLOW_81_in_globalVarExpression1795); if (state.failed) return e;
            pushFollow(FOLLOW_identifier_in_globalVarExpression1799);
            name=identifier();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e = factory.createGlobalVarExpression(name);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "globalVarExpression"


    // $ANTLR start "featureCall"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:294:1: featureCall returns [FeatureCall e] : (id1= identifier '(' (l= parameterList )? ')' | t= type | x= collectionExpression );
    public FeatureCall featureCall() throws RecognitionException {
        FeatureCall e = null;

        Identifier id1 = null;

        List<Expression> l = null;

        Identifier t = null;

        FeatureCall x = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:294:38: (id1= identifier '(' (l= parameterList )? ')' | t= type | x= collectionExpression )
            int alt49=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==23) ) {
                    alt49=1;
                }
                else if ( (LA49_1==EOF||LA49_1==TEXT||LA49_1==Identifier||(LA49_1>=24 && LA49_1<=26)||LA49_1==29||LA49_1==32||(LA49_1>=36 && LA49_1<=37)||LA49_1==40||(LA49_1>=51 && LA49_1<=53)||(LA49_1>=57 && LA49_1<=59)||(LA49_1>=61 && LA49_1<=62)||(LA49_1>=65 && LA49_1<=78)||LA49_1==80) ) {
                    alt49=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
                }
                break;
            case 96:
            case 97:
            case 98:
                {
                alt49=2;
                }
                break;
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:295:2: id1= identifier '(' (l= parameterList )? ')'
                    {
                    pushFollow(FOLLOW_identifier_in_featureCall1817);
                    id1=identifier();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,23,FOLLOW_23_in_featureCall1819); if (state.failed) return e;
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:295:21: (l= parameterList )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=StringLiteral && LA48_0<=Identifier)||LA48_0==23||LA48_0==32||LA48_0==55||LA48_0==60||(LA48_0>=63 && LA48_0<=64)||LA48_0==79||(LA48_0>=81 && LA48_0<=94)||(LA48_0>=96 && LA48_0<=98)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:295:22: l= parameterList
                            {
                            pushFollow(FOLLOW_parameterList_in_featureCall1824);
                            l=parameterList();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }

                    match(input,26,FOLLOW_26_in_featureCall1828); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e = factory.createOperationCall(id1,l);
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:296:5: t= type
                    {
                    pushFollow(FOLLOW_type_in_featureCall1838);
                    t=type();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =factory.createFeatureCall(t,null);
                    }

                    }
                    break;
                case 3 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:297:5: x= collectionExpression
                    {
                    pushFollow(FOLLOW_collectionExpression_in_featureCall1849);
                    x=collectionExpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =x;
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
        return e;
    }
    // $ANTLR end "featureCall"


    // $ANTLR start "listLiteral"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:300:1: listLiteral returns [Expression e] : '{' (l= parameterList )? '}' ;
    public Expression listLiteral() throws RecognitionException {
        Expression e = null;

        List<Expression> l = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:300:37: ( '{' (l= parameterList )? '}' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:301:2: '{' (l= parameterList )? '}'
            {
            match(input,64,FOLLOW_64_in_listLiteral1866); if (state.failed) return e;
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:301:6: (l= parameterList )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=StringLiteral && LA50_0<=Identifier)||LA50_0==23||LA50_0==32||LA50_0==55||LA50_0==60||(LA50_0>=63 && LA50_0<=64)||LA50_0==79||(LA50_0>=81 && LA50_0<=94)||(LA50_0>=96 && LA50_0<=98)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:301:7: l= parameterList
                    {
                    pushFollow(FOLLOW_parameterList_in_listLiteral1871);
                    l=parameterList();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,67,FOLLOW_67_in_listLiteral1875); if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e =factory.createListLiteral(l);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "listLiteral"


    // $ANTLR start "constructorCall"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:304:1: constructorCall returns [Expression e] : 'new' t= simpleType ;
    public Expression constructorCall() throws RecognitionException {
        Expression e = null;

        Identifier t = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:304:41: ( 'new' t= simpleType )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:305:2: 'new' t= simpleType
            {
            match(input,82,FOLLOW_82_in_constructorCall1892); if (state.failed) return e;
            pushFollow(FOLLOW_simpleType_in_constructorCall1896);
            t=simpleType();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
              e = factory.createConstructorCall(t);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "constructorCall"


    // $ANTLR start "booleanLiteral"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:309:1: booleanLiteral returns [Expression e=factory.createBooleanLiteral(id(input.LT(1)))] : ( 'false' | 'true' );
    public Expression booleanLiteral() throws RecognitionException {
        Expression e = factory.createBooleanLiteral(id(input.LT(1)));

        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:309:86: ( 'false' | 'true' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:
            {
            if ( (input.LA(1)>=83 && input.LA(1)<=84) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return e;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "booleanLiteral"


    // $ANTLR start "nullLiteral"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:313:1: nullLiteral returns [Expression e=factory.createNullLiteral(id(input.LT(1)))] : 'null' ;
    public Expression nullLiteral() throws RecognitionException {
        Expression e = factory.createNullLiteral(id(input.LT(1)));

        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:313:80: ( 'null' )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:314:2: 'null'
            {
            match(input,85,FOLLOW_85_in_nullLiteral1931); if (state.failed) return e;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "nullLiteral"


    // $ANTLR start "numberLiteral"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:317:1: numberLiteral returns [Expression e] : (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral );
    public Expression numberLiteral() throws RecognitionException {
        Expression e = null;

        Token a=null;
        Token b=null;
        Token c=null;

        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:317:39: (a= IntLiteral | a= IntLiteral b= '.' c= IntLiteral )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==IntLiteral) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==80) ) {
                    int LA51_2 = input.LA(3);

                    if ( (LA51_2==IntLiteral) ) {
                        alt51=2;
                    }
                    else if ( (LA51_2==Identifier||(LA51_2>=86 && LA51_2<=94)||(LA51_2>=96 && LA51_2<=98)) ) {
                        alt51=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA51_1==EOF||LA51_1==TEXT||LA51_1==Identifier||(LA51_1>=24 && LA51_1<=26)||LA51_1==32||(LA51_1>=36 && LA51_1<=37)||LA51_1==40||(LA51_1>=51 && LA51_1<=53)||(LA51_1>=57 && LA51_1<=59)||(LA51_1>=61 && LA51_1<=62)||(LA51_1>=65 && LA51_1<=78)) ) {
                    alt51=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:318:4: a= IntLiteral
                    {
                    a=(Token)match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral1950); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =factory.createIntegerLiteral(id(a));
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:319:4: a= IntLiteral b= '.' c= IntLiteral
                    {
                    a=(Token)match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral1959); if (state.failed) return e;
                    b=(Token)match(input,80,FOLLOW_80_in_numberLiteral1963); if (state.failed) return e;
                    c=(Token)match(input,IntLiteral,FOLLOW_IntLiteral_in_numberLiteral1967); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                      e =factory.createRealLiteral(id(a).append(id(b)).append(id(c)));
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
        return e;
    }
    // $ANTLR end "numberLiteral"


    // $ANTLR start "collectionExpression"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:322:1: collectionExpression returns [FeatureCall e] : (name= 'typeSelect' '(' t= type ')' | name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')' );
    public FeatureCall collectionExpression() throws RecognitionException {
        FeatureCall e = null;

        Token name=null;
        Identifier t = null;

        Identifier var = null;

        Expression x = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:322:47: (name= 'typeSelect' '(' t= type ')' | name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==86) ) {
                alt53=1;
            }
            else if ( ((LA53_0>=87 && LA53_0<=94)) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:323:3: name= 'typeSelect' '(' t= type ')'
                    {
                    name=(Token)match(input,86,FOLLOW_86_in_collectionExpression1987); if (state.failed) return e;
                    match(input,23,FOLLOW_23_in_collectionExpression1991); if (state.failed) return e;
                    pushFollow(FOLLOW_type_in_collectionExpression1995);
                    t=type();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,26,FOLLOW_26_in_collectionExpression1997); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = factory.createTypeSelectExpression(id(name),t);
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:326:5: name= ( 'collect' | 'select' | 'selectFirst' | 'reject' | 'exists' | 'notExists' | 'sortBy' | 'forAll' ) '(' (var= identifier '|' )? x= expression ')'
                    {
                    name=(Token)input.LT(1);
                    if ( (input.LA(1)>=87 && input.LA(1)<=94) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    match(input,23,FOLLOW_23_in_collectionExpression2060); if (state.failed) return e;
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:333:19: (var= identifier '|' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==Identifier) ) {
                        int LA52_1 = input.LA(2);

                        if ( (LA52_1==95) ) {
                            alt52=1;
                        }
                    }
                    switch (alt52) {
                        case 1 :
                            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:333:20: var= identifier '|'
                            {
                            pushFollow(FOLLOW_identifier_in_collectionExpression2065);
                            var=identifier();

                            state._fsp--;
                            if (state.failed) return e;
                            match(input,95,FOLLOW_95_in_collectionExpression2067); if (state.failed) return e;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expression_in_collectionExpression2073);
                    x=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,26,FOLLOW_26_in_collectionExpression2075); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = factory.createCollectionExpression(id(name),var,x);
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
        return e;
    }
    // $ANTLR end "collectionExpression"


    // $ANTLR start "declaredParameterList"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:339:1: declaredParameterList returns [List<DeclaredParameter> l = new ArrayList<DeclaredParameter>()] : dp= declaredParameter ( ',' dp1= declaredParameter )* ;
    public List<DeclaredParameter> declaredParameterList() throws RecognitionException {
        List<DeclaredParameter> l =  new ArrayList<DeclaredParameter>();

        DeclaredParameter dp = null;

        DeclaredParameter dp1 = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:339:97: (dp= declaredParameter ( ',' dp1= declaredParameter )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:340:2: dp= declaredParameter ( ',' dp1= declaredParameter )*
            {
            pushFollow(FOLLOW_declaredParameter_in_declaredParameterList2099);
            dp=declaredParameter();

            state._fsp--;
            if (state.failed) return l;
            if ( state.backtracking==0 ) {
              l.add(dp);
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:340:36: ( ',' dp1= declaredParameter )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==24) ) {
                    int LA54_1 = input.LA(2);

                    if ( (LA54_1==Identifier||(LA54_1>=96 && LA54_1<=98)) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:340:37: ',' dp1= declaredParameter
            	    {
            	    match(input,24,FOLLOW_24_in_declaredParameterList2103); if (state.failed) return l;
            	    pushFollow(FOLLOW_declaredParameter_in_declaredParameterList2107);
            	    dp1=declaredParameter();

            	    state._fsp--;
            	    if (state.failed) return l;
            	    if ( state.backtracking==0 ) {
            	      l.add(dp1);
            	    }

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
        }
        return l;
    }
    // $ANTLR end "declaredParameterList"


    // $ANTLR start "declaredParameter"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:343:1: declaredParameter returns [DeclaredParameter dp] : t= type name= identifier ;
    public DeclaredParameter declaredParameter() throws RecognitionException {
        DeclaredParameter dp = null;

        Identifier t = null;

        Identifier name = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:343:50: (t= type name= identifier )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:344:2: t= type name= identifier
            {
            pushFollow(FOLLOW_type_in_declaredParameter2127);
            t=type();

            state._fsp--;
            if (state.failed) return dp;
            pushFollow(FOLLOW_identifier_in_declaredParameter2131);
            name=identifier();

            state._fsp--;
            if (state.failed) return dp;
            if ( state.backtracking==0 ) {
              dp = factory.createDeclaredParameter(t,name);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return dp;
    }
    // $ANTLR end "declaredParameter"


    // $ANTLR start "parameterList"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:347:1: parameterList returns [List<Expression> list = new ArrayList<Expression>()] : a= expression ( ',' b= expression )* ;
    public List<Expression> parameterList() throws RecognitionException {
        List<Expression> list =  new ArrayList<Expression>();

        Expression a = null;

        Expression b = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:347:78: (a= expression ( ',' b= expression )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:348:5: a= expression ( ',' b= expression )*
            {
            pushFollow(FOLLOW_expression_in_parameterList2153);
            a=expression();

            state._fsp--;
            if (state.failed) return list;
            if ( state.backtracking==0 ) {
              list.add(a);
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:348:34: ( ',' b= expression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==24) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:348:35: ',' b= expression
            	    {
            	    match(input,24,FOLLOW_24_in_parameterList2158); if (state.failed) return list;
            	    pushFollow(FOLLOW_expression_in_parameterList2162);
            	    b=expression();

            	    state._fsp--;
            	    if (state.failed) return list;
            	    if ( state.backtracking==0 ) {
            	      list.add(b);
            	    }

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
        }
        return list;
    }
    // $ANTLR end "parameterList"


    // $ANTLR start "type"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:353:1: type returns [Identifier id] : (a= collectionType | b= simpleType );
    public Identifier type() throws RecognitionException {
        Identifier id = null;

        Identifier a = null;

        Identifier b = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:353:30: (a= collectionType | b= simpleType )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=96 && LA56_0<=98)) ) {
                alt56=1;
            }
            else if ( (LA56_0==Identifier) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return id;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:354:2: a= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type2188);
                    a=collectionType();

                    state._fsp--;
                    if (state.failed) return id;
                    if ( state.backtracking==0 ) {
                      id =a;
                    }

                    }
                    break;
                case 2 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:355:2: b= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type2198);
                    b=simpleType();

                    state._fsp--;
                    if (state.failed) return id;
                    if ( state.backtracking==0 ) {
                      id =b;
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
        return id;
    }
    // $ANTLR end "type"


    // $ANTLR start "collectionType"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:358:1: collectionType returns [Identifier id ] : cl= ( 'Collection' | 'List' | 'Set' ) (b= '[' id1= simpleType c= ']' )? ;
    public Identifier collectionType() throws RecognitionException {
        Identifier id = null;

        Token cl=null;
        Token b=null;
        Token c=null;
        Identifier id1 = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:358:42: (cl= ( 'Collection' | 'List' | 'Set' ) (b= '[' id1= simpleType c= ']' )? )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:359:3: cl= ( 'Collection' | 'List' | 'Set' ) (b= '[' id1= simpleType c= ']' )?
            {
            cl=(Token)input.LT(1);
            if ( (input.LA(1)>=96 && input.LA(1)<=98) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return id;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
              id = id(cl);
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:360:3: (b= '[' id1= simpleType c= ']' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==99) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:360:4: b= '[' id1= simpleType c= ']'
                    {
                    b=(Token)match(input,99,FOLLOW_99_in_collectionType2241); if (state.failed) return id;
                    pushFollow(FOLLOW_simpleType_in_collectionType2245);
                    id1=simpleType();

                    state._fsp--;
                    if (state.failed) return id;
                    c=(Token)match(input,100,FOLLOW_100_in_collectionType2249); if (state.failed) return id;
                    if ( state.backtracking==0 ) {
                       id.append(id(b));id.append(id1);id.append(id(c));
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
        return id;
    }
    // $ANTLR end "collectionType"


    // $ANTLR start "simpleType"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:363:1: simpleType returns [Identifier id] : x= identifier (d= '::' end= identifier )* ;
    public Identifier simpleType() throws RecognitionException {
        Identifier id = null;

        Token d=null;
        Identifier x = null;

        Identifier end = null;


        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:363:36: (x= identifier (d= '::' end= identifier )* )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:364:2: x= identifier (d= '::' end= identifier )*
            {
            pushFollow(FOLLOW_identifier_in_simpleType2269);
            x=identifier();

            state._fsp--;
            if (state.failed) return id;
            if ( state.backtracking==0 ) {
              id =x;
            }
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:365:2: (d= '::' end= identifier )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==29) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:365:3: d= '::' end= identifier
            	    {
            	    d=(Token)match(input,29,FOLLOW_29_in_simpleType2277); if (state.failed) return id;
            	    pushFollow(FOLLOW_identifier_in_simpleType2281);
            	    end=identifier();

            	    state._fsp--;
            	    if (state.failed) return id;
            	    if ( state.backtracking==0 ) {
            	      id.append(id(d)); id.append(end);
            	    }

            	    }
            	    break;

            	default :
            	    break loop58;
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
        return id;
    }
    // $ANTLR end "simpleType"


    // $ANTLR start "identifier"
    // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:368:1: identifier returns [Identifier r] : x= Identifier ;
    public Identifier identifier() throws RecognitionException {
        Identifier r = null;

        Token x=null;

        try {
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:368:35: (x= Identifier )
            // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:369:4: x= Identifier
            {
            x=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifier2304); if (state.failed) return r;
            if ( state.backtracking==0 ) {
              r =id(x);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end "identifier"

    // $ANTLR start synpred1_Xpand
    public void synpred1_Xpand_fragment() throws RecognitionException {   
        // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:206:5: ( '(' type ')' castedExpression )
        // /Users/thoms/Development/checkout/eclipse/org.eclipse.xpand/plugins/org.eclipse.xpand/src/org/eclipse/internal/xpand2/parser/Xpand.g:206:6: '(' type ')' castedExpression
        {
        match(input,23,FOLLOW_23_in_synpred1_Xpand1104); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred1_Xpand1106);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,26,FOLLOW_26_in_synpred1_Xpand1108); if (state.failed) return ;
        pushFollow(FOLLOW_castedExpression_in_synpred1_Xpand1110);
        castedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Xpand

    // Delegated rules

    public boolean synpred1_Xpand() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Xpand_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA31_eotS =
        "\22\uffff";
    static final String DFA31_eofS =
        "\22\uffff";
    static final String DFA31_minS =
        "\1\7\1\0\20\uffff";
    static final String DFA31_maxS =
        "\1\142\1\0\20\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\16\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\20\uffff}>";
    static final String[] DFA31_transitionS = {
            "\3\2\15\uffff\1\1\10\uffff\1\2\33\uffff\1\2\2\uffff\2\2\16\uffff"+
            "\1\2\1\uffff\16\2\1\uffff\3\2",
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
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "205:1: castedExpression returns [Expression e] : ( ( '(' type ')' castedExpression )=> '(' t= type ')' x= chainExpression | x= chainExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Xpand()) ) {s = 17;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_LG_in_template47 = new BitSet(new long[]{0x0000000040700022L});
    public static final BitSet FOLLOW_COMMENT_in_template52 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_template54 = new BitSet(new long[]{0x0000000040700022L});
    public static final BitSet FOLLOW_anImport_in_template64 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_anExtensionImport_in_template73 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_template78 = new BitSet(new long[]{0x0000000040700022L});
    public static final BitSet FOLLOW_COMMENT_in_template81 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_template83 = new BitSet(new long[]{0x0000000040700022L});
    public static final BitSet FOLLOW_define_in_template95 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_around_in_template102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_template106 = new BitSet(new long[]{0x0000000040400022L});
    public static final BitSet FOLLOW_COMMENT_in_template109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_template111 = new BitSet(new long[]{0x0000000040400022L});
    public static final BitSet FOLLOW_20_in_anImport137 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_simpleType_in_anImport141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_anExtensionImport156 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_simpleType_in_anExtensionImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_around178 = new BitSet(new long[]{0x0000000002000200L});
    public static final BitSet FOLLOW_pointcut_in_around182 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_23_in_around188 = new BitSet(new long[]{0x0000000002000200L,0x0000000700000000L});
    public static final BitSet FOLLOW_declaredParameterList_in_around193 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_around196 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_around200 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25_in_around209 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_around213 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_around217 = new BitSet(new long[]{0x0000000000000200L,0x0000000700000000L});
    public static final BitSet FOLLOW_type_in_around221 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_sequence_in_around229 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_around234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_pointcut256 = new BitSet(new long[]{0x0000000022000202L});
    public static final BitSet FOLLOW_identifier_in_pointcut262 = new BitSet(new long[]{0x0000000022000202L});
    public static final BitSet FOLLOW_25_in_pointcut271 = new BitSet(new long[]{0x0000000022000202L});
    public static final BitSet FOLLOW_identifier_in_pointcut277 = new BitSet(new long[]{0x0000000022000202L});
    public static final BitSet FOLLOW_29_in_pointcut283 = new BitSet(new long[]{0x0000000022000202L});
    public static final BitSet FOLLOW_30_in_define303 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_define307 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_23_in_define310 = new BitSet(new long[]{0x0000000000000200L,0x0000000700000000L});
    public static final BitSet FOLLOW_declaredParameterList_in_define314 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_define316 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_define320 = new BitSet(new long[]{0x0000000000000200L,0x0000000700000000L});
    public static final BitSet FOLLOW_type_in_define324 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_sequence_in_define332 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_define338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textSequence_in_sequence361 = new BitSet(new long[]{0x9082884F00800382L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_statement_in_sequence370 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_textSequence_in_sequence379 = new BitSet(new long[]{0x9082884F00800382L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_simpleStatement_in_statement409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fileStatement_in_statement417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreachStatement_in_statement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letStatement_in_statement441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_protectStatement_in_statement449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_in_textSequence468 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMENT_in_textSequence475 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_text_in_textSequence479 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_32_in_text500 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TEXT_in_text506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_errorStatement_in_simpleStatement525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expandStatement_in_simpleStatement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStmt_in_simpleStatement541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_errorStatement558 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_errorStatement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_expandStatement579 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_definitionName_in_expandStatement583 = new BitSet(new long[]{0x0000002808800002L});
    public static final BitSet FOLLOW_23_in_expandStatement586 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_parameterList_in_expandStatement590 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_expandStatement592 = new BitSet(new long[]{0x0000002808000002L});
    public static final BitSet FOLLOW_27_in_expandStatement598 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_expandStatement602 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_35_in_expandStatement612 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_expandStatement616 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_expandStatement619 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_expandStatement623 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_expandStatement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_definitionName662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStmt680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_fileStatement696 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_fileStatement700 = new BitSet(new long[]{0x0000000100000240L});
    public static final BitSet FOLLOW_identifier_in_fileStatement705 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_sequence_in_fileStatement713 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_fileStatement717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_foreachStatement735 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_foreachStatement739 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_foreachStatement741 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_foreachStatement745 = new BitSet(new long[]{0x0000021100000040L});
    public static final BitSet FOLLOW_41_in_foreachStatement748 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_foreachStatement752 = new BitSet(new long[]{0x0000001100000040L});
    public static final BitSet FOLLOW_36_in_foreachStatement757 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_foreachStatement761 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_sequence_in_foreachStatement771 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_foreachStatement776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ifStatement802 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_ifStatement806 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_sequence_in_ifStatement812 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_elseIfStatement_in_ifStatement824 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_elseStatement_in_ifStatement835 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ifStatement847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_elseIfStatement861 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_elseIfStatement865 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_sequence_in_elseIfStatement871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_elseStatement892 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_sequence_in_elseStatement898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_letStatement919 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_letStatement923 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_letStatement925 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_letStatement929 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_sequence_in_letStatement937 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_letStatement942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_protectStatement961 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_protectStatement966 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_protectStatement970 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_protectStatement975 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_protectStatement979 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_protectStatement992 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_protectStatement996 = new BitSet(new long[]{0x0020000100000040L});
    public static final BitSet FOLLOW_53_in_protectStatement1001 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_sequence_in_protectStatement1010 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_protectStatement1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letExpression_in_expression1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_letExpression1055 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_letExpression1059 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_letExpression1061 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_castedExpression_in_letExpression1065 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_letExpression1067 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_letExpression1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castedExpression_in_letExpression1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_castedExpression1115 = new BitSet(new long[]{0x0000000000000200L,0x0000000700000000L});
    public static final BitSet FOLLOW_type_in_castedExpression1119 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_castedExpression1121 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_chainExpression_in_castedExpression1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chainExpression_in_castedExpression1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_chainExpression1154 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_chainExpression1160 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_ifExpression_in_chainExpression1164 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression1185 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ifExpression1189 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression1193 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ifExpression1195 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ifExpression1207 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression1211 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifExpression1213 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_switchExpression_in_ifExpression1217 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ifExpression1220 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_ifExpression1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_switchExpression1251 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23_in_switchExpression1254 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression1260 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_switchExpression1262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_switchExpression1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_65_in_switchExpression1282 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression1286 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_switchExpression1289 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression1294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_66_in_switchExpression1312 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_switchExpression1314 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression1320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_switchExpression1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_switchExpression1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1357 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_orExpression1364 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_andExpression_in_orExpression1368 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_impliesExpression_in_andExpression1391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_andExpression1398 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_impliesExpression_in_andExpression1402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_relationalExpression_in_impliesExpression1424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_impliesExpression1431 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_relationalExpression_in_impliesExpression1435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1459 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001F80L});
    public static final BitSet FOLLOW_set_in_relationalExpression1467 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1493 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001F80L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1514 = new BitSet(new long[]{0x0000000100000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_additiveExpression1524 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1533 = new BitSet(new long[]{0x0000000100000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1552 = new BitSet(new long[]{0x0000000002000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1560 = new BitSet(new long[]{0x8000000100800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1570 = new BitSet(new long[]{0x0000000002000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_unaryExpression1599 = new BitSet(new long[]{0x0000000000800380L,0x000000077FFE0001L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_unaryExpression1611 = new BitSet(new long[]{0x0000000000800380L,0x000000077FFE0001L});
    public static final BitSet FOLLOW_infixExpression_in_unaryExpression1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_infixExpression1633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_infixExpression1639 = new BitSet(new long[]{0x0000000000000200L,0x000000077FC00000L});
    public static final BitSet FOLLOW_featureCall_in_infixExpression1643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_primaryExpression1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_featureCall_in_primaryExpression1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_primaryExpression1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberLiteral_in_primaryExpression1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_primaryExpression1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listLiteral_in_primaryExpression1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorCall_in_primaryExpression1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalVarExpression_in_primaryExpression1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paranthesizedExpression_in_primaryExpression1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_paranthesizedExpression1769 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_paranthesizedExpression1773 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_paranthesizedExpression1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_globalVarExpression1795 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_globalVarExpression1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_featureCall1817 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_featureCall1819 = new BitSet(new long[]{0x9080000704800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_parameterList_in_featureCall1824 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_featureCall1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_featureCall1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionExpression_in_featureCall1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_listLiteral1866 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8009L});
    public static final BitSet FOLLOW_parameterList_in_listLiteral1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_listLiteral1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_constructorCall1892 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_simpleType_in_constructorCall1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_nullLiteral1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_numberLiteral1963 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_IntLiteral_in_numberLiteral1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_collectionExpression1987 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_collectionExpression1991 = new BitSet(new long[]{0x0000000000000200L,0x0000000700000000L});
    public static final BitSet FOLLOW_type_in_collectionExpression1995 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_collectionExpression1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionExpression2010 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_collectionExpression2060 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_identifier_in_collectionExpression2065 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_collectionExpression2067 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_collectionExpression2073 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_collectionExpression2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaredParameter_in_declaredParameterList2099 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_declaredParameterList2103 = new BitSet(new long[]{0x0000000000000200L,0x0000000700000000L});
    public static final BitSet FOLLOW_declaredParameter_in_declaredParameterList2107 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_type_in_declaredParameter2127 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_declaredParameter2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameterList2153 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_parameterList2158 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_expression_in_parameterList2162 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_collectionType_in_type2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType2220 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_collectionType2241 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_simpleType_in_collectionType2245 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_collectionType2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleType2269 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_simpleType2277 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_identifier_in_simpleType2281 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_Identifier_in_identifier2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred1_Xpand1104 = new BitSet(new long[]{0x0000000000000200L,0x0000000700000000L});
    public static final BitSet FOLLOW_type_in_synpred1_Xpand1106 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_synpred1_Xpand1108 = new BitSet(new long[]{0x9080000700800380L,0x000000077FFE8001L});
    public static final BitSet FOLLOW_castedExpression_in_synpred1_Xpand1110 = new BitSet(new long[]{0x0000000000000002L});

}