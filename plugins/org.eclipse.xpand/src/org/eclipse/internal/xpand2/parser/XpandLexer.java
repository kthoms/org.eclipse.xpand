// $ANTLR 3.0.1 src/org/eclipse/internal/xpand2/parser/Xpand.g 2009-12-21 07:23:30
 	
package org.eclipse.internal.xpand2.parser; 
	
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;

public class XpandLexer extends Lexer {
    public static final int T29=29;
    public static final int HexDigit=13;
    public static final int T70=70;
    public static final int T74=74;
    public static final int T85=85;
    public static final int Letter=14;
    public static final int T32=32;
    public static final int T81=81;
    public static final int T41=41;
    public static final int T24=24;
    public static final int LG=4;
    public static final int T62=62;
    public static final int T68=68;
    public static final int T73=73;
    public static final int T84=84;
    public static final int T33=33;
    public static final int Identifier=9;
    public static final int T78=78;
    public static final int WS=16;
    public static final int T42=42;
    public static final int RG=19;
    public static final int T96=96;
    public static final int T71=71;
    public static final int LINE_COMMENT=18;
    public static final int T72=72;
    public static final int T94=94;
    public static final int T76=76;
    public static final int UnicodeEscape=11;
    public static final int T75=75;
    public static final int T89=89;
    public static final int T67=67;
    public static final int TEXT=6;
    public static final int T31=31;
    public static final int T60=60;
    public static final int T82=82;
    public static final int T100=100;
    public static final int T49=49;
    public static final int T30=30;
    public static final int T79=79;
    public static final int IntLiteral=8;
    public static final int T36=36;
    public static final int T58=58;
    public static final int T93=93;
    public static final int T35=35;
    public static final int T83=83;
    public static final int T61=61;
    public static final int T45=45;
    public static final int T34=34;
    public static final int T64=64;
    public static final int T25=25;
    public static final int T91=91;
    public static final int T37=37;
    public static final int T86=86;
    public static final int EscapeSequence=10;
    public static final int T26=26;
    public static final int VOCAB=20;
    public static final int T51=51;
    public static final int T46=46;
    public static final int T77=77;
    public static final int ML_COMMENT=17;
    public static final int T38=38;
    public static final int T69=69;
    public static final int T39=39;
    public static final int T21=21;
    public static final int T44=44;
    public static final int T55=55;
    public static final int T95=95;
    public static final int T22=22;
    public static final int T50=50;
    public static final int T92=92;
    public static final int T43=43;
    public static final int T28=28;
    public static final int T23=23;
    public static final int T40=40;
    public static final int T66=66;
    public static final int COMMENT=5;
    public static final int T88=88;
    public static final int StringLiteral=7;
    public static final int T63=63;
    public static final int T57=57;
    public static final int T65=65;
    public static final int T98=98;
    public static final int T56=56;
    public static final int T87=87;
    public static final int T80=80;
    public static final int JavaIDDigit=15;
    public static final int T59=59;
    public static final int T97=97;
    public static final int T48=48;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T47=47;
    public static final int Tokens=101;
    public static final int T53=53;
    public static final int OctalEscape=12;
    public static final int T99=99;
    public static final int T27=27;
    public static final int T52=52;
    public static final int T90=90;
    public XpandLexer() {} 
    public XpandLexer(CharStream input) {
        super(input);
    }
    @Override
	public String getGrammarFileName() { return "src/org/eclipse/internal/xpand2/parser/Xpand.g"; }

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:13:5: ( 'IMPORT' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:13:7: 'IMPORT'
            {
            match("IMPORT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:14:5: ( 'EXTENSION' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:14:7: 'EXTENSION'
            {
            match("EXTENSION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:15:5: ( 'AROUND' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:15:7: 'AROUND'
            {
            match("AROUND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:16:5: ( '(' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:16:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:17:5: ( ',' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:17:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:18:5: ( '*' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:18:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:19:5: ( ')' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:19:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:20:5: ( 'FOR' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:20:7: 'FOR'
            {
            match("FOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:21:5: ( 'ENDAROUND' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:21:7: 'ENDAROUND'
            {
            match("ENDAROUND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:22:5: ( '::' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:22:7: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:23:5: ( 'DEFINE' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:23:7: 'DEFINE'
            {
            match("DEFINE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:24:5: ( 'ENDDEFINE' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:24:7: 'ENDDEFINE'
            {
            match("ENDDEFINE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:25:5: ( '-' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:25:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:26:5: ( 'ERROR' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:26:7: 'ERROR'
            {
            match("ERROR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:27:5: ( 'EXPAND' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:27:7: 'EXPAND'
            {
            match("EXPAND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:28:5: ( 'FOREACH' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:28:7: 'FOREACH'
            {
            match("FOREACH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:29:5: ( 'SEPARATOR' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:29:7: 'SEPARATOR'
            {
            match("SEPARATOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:30:5: ( 'FILE' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:30:7: 'FILE'
            {
            match("FILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:31:5: ( 'ENDFILE' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:31:7: 'ENDFILE'
            {
            match("ENDFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:32:5: ( 'AS' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:32:7: 'AS'
            {
            match("AS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:33:5: ( 'ITERATOR' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:33:7: 'ITERATOR'
            {
            match("ITERATOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:34:5: ( 'ENDFOREACH' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:34:7: 'ENDFOREACH'
            {
            match("ENDFOREACH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:35:5: ( 'IF' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:35:7: 'IF'
            {
            match("IF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:36:5: ( 'ENDIF' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:36:7: 'ENDIF'
            {
            match("ENDIF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:37:5: ( 'ELSEIF' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:37:7: 'ELSEIF'
            {
            match("ELSEIF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:38:5: ( 'ELSE' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:38:7: 'ELSE'
            {
            match("ELSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:39:5: ( 'LET' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:39:7: 'LET'
            {
            match("LET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:40:5: ( 'ENDLET' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:40:7: 'ENDLET'
            {
            match("ENDLET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:41:5: ( 'PROTECT' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:41:7: 'PROTECT'
            {
            match("PROTECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:42:5: ( 'CSTART' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:42:7: 'CSTART'
            {
            match("CSTART"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:43:5: ( 'CEND' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:43:7: 'CEND'
            {
            match("CEND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:44:5: ( 'ID' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:44:7: 'ID'
            {
            match("ID"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:45:5: ( 'DISABLE' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:45:7: 'DISABLE'
            {
            match("DISABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:46:5: ( 'ENDPROTECT' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:46:7: 'ENDPROTECT'
            {
            match("ENDPROTECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:47:5: ( 'let' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:47:7: 'let'
            {
            match("let"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:48:5: ( '=' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:48:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:49:5: ( ':' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:49:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:50:5: ( '->' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:50:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:51:5: ( '?' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:51:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:52:5: ( 'if' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:52:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:53:5: ( 'then' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:53:7: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:54:5: ( 'else' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:54:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:55:5: ( 'switch' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:55:7: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:56:5: ( '{' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:56:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:57:5: ( 'case' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:57:7: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:58:5: ( 'default' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:58:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:59:5: ( '}' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:59:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:60:5: ( '||' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:60:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:61:5: ( '&&' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:61:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:62:5: ( 'implies' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:62:7: 'implies'
            {
            match("implies"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:63:5: ( '==' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:63:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:64:5: ( '!=' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:64:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:65:5: ( '>=' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:65:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:66:5: ( '<=' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:66:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:67:5: ( '>' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:67:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:68:5: ( '<' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:68:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:69:5: ( '+' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:69:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:70:5: ( '/' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:70:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:71:5: ( '!' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:71:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:72:5: ( '.' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:72:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:73:5: ( 'GLOBALVAR' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:73:7: 'GLOBALVAR'
            {
            match("GLOBALVAR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:74:5: ( 'new' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:74:7: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:75:5: ( 'false' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:75:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:76:5: ( 'true' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:76:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:77:5: ( 'null' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:77:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:78:5: ( 'typeSelect' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:78:7: 'typeSelect'
            {
            match("typeSelect"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:79:5: ( 'collect' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:79:7: 'collect'
            {
            match("collect"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:80:5: ( 'select' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:80:7: 'select'
            {
            match("select"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:81:5: ( 'selectFirst' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:81:7: 'selectFirst'
            {
            match("selectFirst"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:82:5: ( 'reject' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:82:7: 'reject'
            {
            match("reject"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:83:5: ( 'exists' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:83:7: 'exists'
            {
            match("exists"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public final void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:84:5: ( 'notExists' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:84:7: 'notExists'
            {
            match("notExists"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public final void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:85:5: ( 'sortBy' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:85:7: 'sortBy'
            {
            match("sortBy"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start T94
    public final void mT94() throws RecognitionException {
        try {
            int _type = T94;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:86:5: ( 'forAll' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:86:7: 'forAll'
            {
            match("forAll"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T94

    // $ANTLR start T95
    public final void mT95() throws RecognitionException {
        try {
            int _type = T95;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:87:5: ( '|' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:87:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T95

    // $ANTLR start T96
    public final void mT96() throws RecognitionException {
        try {
            int _type = T96;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:88:5: ( 'Collection' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:88:7: 'Collection'
            {
            match("Collection"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T96

    // $ANTLR start T97
    public final void mT97() throws RecognitionException {
        try {
            int _type = T97;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:89:5: ( 'List' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:89:7: 'List'
            {
            match("List"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T97

    // $ANTLR start T98
    public final void mT98() throws RecognitionException {
        try {
            int _type = T98;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:90:5: ( 'Set' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:90:7: 'Set'
            {
            match("Set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T98

    // $ANTLR start T99
    public final void mT99() throws RecognitionException {
        try {
            int _type = T99;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:91:5: ( '[' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:91:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T99

    // $ANTLR start T100
    public final void mT100() throws RecognitionException {
        try {
            int _type = T100;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:92:6: ( ']' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:92:8: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T100

    // $ANTLR start IntLiteral
    public final void mIntLiteral() throws RecognitionException {
        try {
            int _type = IntLiteral;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:372:12: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:372:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:372:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("372:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:372:15: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:372:21: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:372:30: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:372:30: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IntLiteral

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:375:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("374:1: StringLiteral : ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:375:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:375:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:375:14: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:375:31: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:376:8: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
                    {
                    match('\''); 
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:376:13: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:376:15: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:376:32: ~ ( '\\'' | '\\\\' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start EscapeSequence
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:381:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt6=1;
                    }
                    break;
                case 'u':
                    {
                    alt6=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt6=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("379:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("379:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:381:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:382:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:383:9: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end EscapeSequence

    // $ANTLR start OctalEscape
    public final void mOctalEscape() throws RecognitionException {
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:388:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>='0' && LA7_1<='3')) ) {
                    int LA7_2 = input.LA(3);

                    if ( ((LA7_2>='0' && LA7_2<='7')) ) {
                        int LA7_5 = input.LA(4);

                        if ( ((LA7_5>='0' && LA7_5<='7')) ) {
                            alt7=1;
                        }
                        else {
                            alt7=2;}
                    }
                    else {
                        alt7=3;}
                }
                else if ( ((LA7_1>='4' && LA7_1<='7')) ) {
                    int LA7_3 = input.LA(3);

                    if ( ((LA7_3>='0' && LA7_3<='7')) ) {
                        alt7=2;
                    }
                    else {
                        alt7=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("386:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("386:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:388:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:388:14: ( '0' .. '3' )
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:388:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:388:25: ( '0' .. '7' )
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:388:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:388:36: ( '0' .. '7' )
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:388:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:389:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:389:14: ( '0' .. '7' )
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:389:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:389:25: ( '0' .. '7' )
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:389:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:390:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:390:14: ( '0' .. '7' )
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:390:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end OctalEscape

    // $ANTLR start UnicodeEscape
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:395:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:395:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end UnicodeEscape

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:398:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:398:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start Identifier
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:401:5: ( ( '^' )? Letter ( Letter | JavaIDDigit )* )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:401:9: ( '^' )? Letter ( Letter | JavaIDDigit )*
            {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:401:9: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:401:10: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            mLetter(); 
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:401:23: ( Letter | JavaIDDigit )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')||(LA9_0>='\u00C0' && LA9_0<='\u00D6')||(LA9_0>='\u00D8' && LA9_0<='\u00F6')||(LA9_0>='\u00F8' && LA9_0<='\u1FFF')||(LA9_0>='\u3040' && LA9_0<='\u318F')||(LA9_0>='\u3300' && LA9_0<='\u337F')||(LA9_0>='\u3400' && LA9_0<='\u3D2D')||(LA9_0>='\u4E00' && LA9_0<='\u9FFF')||(LA9_0>='\uF900' && LA9_0<='\uFAFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Identifier

    // $ANTLR start Letter
    public final void mLetter() throws RecognitionException {
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:406:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Letter

    // $ANTLR start JavaIDDigit
    public final void mJavaIDDigit() throws RecognitionException {
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:423:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09EF')||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A6F')||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u1040' && input.LA(1)<='\u1049') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end JavaIDDigit

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:440:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:440:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start ML_COMMENT
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:444:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:444:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // src/org/eclipse/internal/xpand2/parser/Xpand.g:444:14: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFE')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:444:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ML_COMMENT

    // $ANTLR start LINE_COMMENT
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:448:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:448:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // src/org/eclipse/internal/xpand2/parser/Xpand.g:448:12: (~ ( '\\n' | '\\r' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:448:12: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // src/org/eclipse/internal/xpand2/parser/Xpand.g:448:26: ( '\\r' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:448:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_COMMENT

    // $ANTLR start LG
    public final void mLG() throws RecognitionException {
        try {
            int _type = LG;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:451:5: ( '\\u00AB' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:451:7: '\\u00AB'
            {
            match('\u00AB'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LG

    // $ANTLR start RG
    public final void mRG() throws RecognitionException {
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:453:3: ( '\\u00BB' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:453:5: '\\u00BB'
            {
            match('\u00BB'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end RG

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:456:9: ( 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:457:2: 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM'
            {
            match("REM"); 

            mRG(); 
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:457:11: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\u00AB') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='E') ) {
                        int LA13_3 = input.LA(3);

                        if ( (LA13_3=='N') ) {
                            int LA13_4 = input.LA(4);

                            if ( (LA13_4=='D') ) {
                                int LA13_5 = input.LA(5);

                                if ( (LA13_5=='R') ) {
                                    int LA13_6 = input.LA(6);

                                    if ( (LA13_6=='E') ) {
                                        int LA13_7 = input.LA(7);

                                        if ( (LA13_7=='M') ) {
                                            alt13=2;
                                        }
                                        else if ( ((LA13_7>='\u0000' && LA13_7<='L')||(LA13_7>='N' && LA13_7<='\uFFFE')) ) {
                                            alt13=1;
                                        }


                                    }
                                    else if ( ((LA13_6>='\u0000' && LA13_6<='D')||(LA13_6>='F' && LA13_6<='\uFFFE')) ) {
                                        alt13=1;
                                    }


                                }
                                else if ( ((LA13_5>='\u0000' && LA13_5<='Q')||(LA13_5>='S' && LA13_5<='\uFFFE')) ) {
                                    alt13=1;
                                }


                            }
                            else if ( ((LA13_4>='\u0000' && LA13_4<='C')||(LA13_4>='E' && LA13_4<='\uFFFE')) ) {
                                alt13=1;
                            }


                        }
                        else if ( ((LA13_3>='\u0000' && LA13_3<='M')||(LA13_3>='O' && LA13_3<='\uFFFE')) ) {
                            alt13=1;
                        }


                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='D')||(LA13_1>='F' && LA13_1<='\uFFFE')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='\u00AA')||(LA13_0>='\u00AC' && LA13_0<='\uFFFE')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:457:39: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("\u00ABENDREM"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start TEXT
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:460:6: ( RG (~ ( LG ) )* ( LG )? )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:461:3: RG (~ ( LG ) )* ( LG )?
            {
            mRG(); 
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:461:6: (~ ( LG ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\u00AA')||(LA14_0>='\u00AC' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/org/eclipse/internal/xpand2/parser/Xpand.g:461:6: ~ ( LG )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // src/org/eclipse/internal/xpand2/parser/Xpand.g:461:13: ( LG )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\u00AB') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // src/org/eclipse/internal/xpand2/parser/Xpand.g:461:14: LG
                    {
                    mLG(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TEXT

    // $ANTLR start VOCAB
    public final void mVOCAB() throws RecognitionException {
        try {
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:467:7: ( ( '\\3' .. '\\u00aa' | '\\u00ac' .. '\\u00ba' | '\\u00bc' .. '\\ufffe' ) )
            // src/org/eclipse/internal/xpand2/parser/Xpand.g:468:2: ( '\\3' .. '\\u00aa' | '\\u00ac' .. '\\u00ba' | '\\u00bc' .. '\\ufffe' )
            {
            if ( (input.LA(1)>='3' && input.LA(1)<='\u00AA')||(input.LA(1)>='\u00AC' && input.LA(1)<='\u00BA')||(input.LA(1)>='\u00BC' && input.LA(1)<='\uFFFE') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end VOCAB

    @Override
	public void mTokens() throws RecognitionException {
        // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:8: ( T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | IntLiteral | StringLiteral | Identifier | WS | ML_COMMENT | LINE_COMMENT | LG | COMMENT | TEXT )
        int alt16=89;
        int LA16_0 = input.LA(1);

        if ( (LA16_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'D':
                {
                int LA16_48 = input.LA(3);

                if ( (LA16_48=='$'||(LA16_48>='0' && LA16_48<='9')||(LA16_48>='A' && LA16_48<='Z')||LA16_48=='_'||(LA16_48>='a' && LA16_48<='z')||(LA16_48>='\u00C0' && LA16_48<='\u00D6')||(LA16_48>='\u00D8' && LA16_48<='\u00F6')||(LA16_48>='\u00F8' && LA16_48<='\u1FFF')||(LA16_48>='\u3040' && LA16_48<='\u318F')||(LA16_48>='\u3300' && LA16_48<='\u337F')||(LA16_48>='\u3400' && LA16_48<='\u3D2D')||(LA16_48>='\u4E00' && LA16_48<='\u9FFF')||(LA16_48>='\uF900' && LA16_48<='\uFAFF')) ) {
                    alt16=83;
                }
                else {
                    alt16=32;}
                }
                break;
            case 'M':
                {
                int LA16_49 = input.LA(3);

                if ( (LA16_49=='P') ) {
                    int LA16_110 = input.LA(4);

                    if ( (LA16_110=='O') ) {
                        int LA16_154 = input.LA(5);

                        if ( (LA16_154=='R') ) {
                            int LA16_201 = input.LA(6);

                            if ( (LA16_201=='T') ) {
                                int LA16_244 = input.LA(7);

                                if ( (LA16_244=='$'||(LA16_244>='0' && LA16_244<='9')||(LA16_244>='A' && LA16_244<='Z')||LA16_244=='_'||(LA16_244>='a' && LA16_244<='z')||(LA16_244>='\u00C0' && LA16_244<='\u00D6')||(LA16_244>='\u00D8' && LA16_244<='\u00F6')||(LA16_244>='\u00F8' && LA16_244<='\u1FFF')||(LA16_244>='\u3040' && LA16_244<='\u318F')||(LA16_244>='\u3300' && LA16_244<='\u337F')||(LA16_244>='\u3400' && LA16_244<='\u3D2D')||(LA16_244>='\u4E00' && LA16_244<='\u9FFF')||(LA16_244>='\uF900' && LA16_244<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=1;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'T':
                {
                int LA16_50 = input.LA(3);

                if ( (LA16_50=='E') ) {
                    int LA16_111 = input.LA(4);

                    if ( (LA16_111=='R') ) {
                        int LA16_155 = input.LA(5);

                        if ( (LA16_155=='A') ) {
                            int LA16_202 = input.LA(6);

                            if ( (LA16_202=='T') ) {
                                int LA16_245 = input.LA(7);

                                if ( (LA16_245=='O') ) {
                                    int LA16_279 = input.LA(8);

                                    if ( (LA16_279=='R') ) {
                                        int LA16_310 = input.LA(9);

                                        if ( (LA16_310=='$'||(LA16_310>='0' && LA16_310<='9')||(LA16_310>='A' && LA16_310<='Z')||LA16_310=='_'||(LA16_310>='a' && LA16_310<='z')||(LA16_310>='\u00C0' && LA16_310<='\u00D6')||(LA16_310>='\u00D8' && LA16_310<='\u00F6')||(LA16_310>='\u00F8' && LA16_310<='\u1FFF')||(LA16_310>='\u3040' && LA16_310<='\u318F')||(LA16_310>='\u3300' && LA16_310<='\u337F')||(LA16_310>='\u3400' && LA16_310<='\u3D2D')||(LA16_310>='\u4E00' && LA16_310<='\u9FFF')||(LA16_310>='\uF900' && LA16_310<='\uFAFF')) ) {
                                            alt16=83;
                                        }
                                        else {
                                            alt16=21;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'F':
                {
                int LA16_51 = input.LA(3);

                if ( (LA16_51=='$'||(LA16_51>='0' && LA16_51<='9')||(LA16_51>='A' && LA16_51<='Z')||LA16_51=='_'||(LA16_51>='a' && LA16_51<='z')||(LA16_51>='\u00C0' && LA16_51<='\u00D6')||(LA16_51>='\u00D8' && LA16_51<='\u00F6')||(LA16_51>='\u00F8' && LA16_51<='\u1FFF')||(LA16_51>='\u3040' && LA16_51<='\u318F')||(LA16_51>='\u3300' && LA16_51<='\u337F')||(LA16_51>='\u3400' && LA16_51<='\u3D2D')||(LA16_51>='\u4E00' && LA16_51<='\u9FFF')||(LA16_51>='\uF900' && LA16_51<='\uFAFF')) ) {
                    alt16=83;
                }
                else {
                    alt16=23;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='E') ) {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA16_52 = input.LA(3);

                if ( (LA16_52=='D') ) {
                    switch ( input.LA(4) ) {
                    case 'L':
                        {
                        int LA16_156 = input.LA(5);

                        if ( (LA16_156=='E') ) {
                            int LA16_203 = input.LA(6);

                            if ( (LA16_203=='T') ) {
                                int LA16_246 = input.LA(7);

                                if ( (LA16_246=='$'||(LA16_246>='0' && LA16_246<='9')||(LA16_246>='A' && LA16_246<='Z')||LA16_246=='_'||(LA16_246>='a' && LA16_246<='z')||(LA16_246>='\u00C0' && LA16_246<='\u00D6')||(LA16_246>='\u00D8' && LA16_246<='\u00F6')||(LA16_246>='\u00F8' && LA16_246<='\u1FFF')||(LA16_246>='\u3040' && LA16_246<='\u318F')||(LA16_246>='\u3300' && LA16_246<='\u337F')||(LA16_246>='\u3400' && LA16_246<='\u3D2D')||(LA16_246>='\u4E00' && LA16_246<='\u9FFF')||(LA16_246>='\uF900' && LA16_246<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=28;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                        }
                        break;
                    case 'P':
                        {
                        int LA16_157 = input.LA(5);

                        if ( (LA16_157=='R') ) {
                            int LA16_204 = input.LA(6);

                            if ( (LA16_204=='O') ) {
                                int LA16_247 = input.LA(7);

                                if ( (LA16_247=='T') ) {
                                    int LA16_281 = input.LA(8);

                                    if ( (LA16_281=='E') ) {
                                        int LA16_311 = input.LA(9);

                                        if ( (LA16_311=='C') ) {
                                            int LA16_330 = input.LA(10);

                                            if ( (LA16_330=='T') ) {
                                                int LA16_341 = input.LA(11);

                                                if ( (LA16_341=='$'||(LA16_341>='0' && LA16_341<='9')||(LA16_341>='A' && LA16_341<='Z')||LA16_341=='_'||(LA16_341>='a' && LA16_341<='z')||(LA16_341>='\u00C0' && LA16_341<='\u00D6')||(LA16_341>='\u00D8' && LA16_341<='\u00F6')||(LA16_341>='\u00F8' && LA16_341<='\u1FFF')||(LA16_341>='\u3040' && LA16_341<='\u318F')||(LA16_341>='\u3300' && LA16_341<='\u337F')||(LA16_341>='\u3400' && LA16_341<='\u3D2D')||(LA16_341>='\u4E00' && LA16_341<='\u9FFF')||(LA16_341>='\uF900' && LA16_341<='\uFAFF')) ) {
                                                    alt16=83;
                                                }
                                                else {
                                                    alt16=34;}
                                            }
                                            else {
                                                alt16=83;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                        }
                        break;
                    case 'I':
                        {
                        int LA16_158 = input.LA(5);

                        if ( (LA16_158=='F') ) {
                            int LA16_205 = input.LA(6);

                            if ( (LA16_205=='$'||(LA16_205>='0' && LA16_205<='9')||(LA16_205>='A' && LA16_205<='Z')||LA16_205=='_'||(LA16_205>='a' && LA16_205<='z')||(LA16_205>='\u00C0' && LA16_205<='\u00D6')||(LA16_205>='\u00D8' && LA16_205<='\u00F6')||(LA16_205>='\u00F8' && LA16_205<='\u1FFF')||(LA16_205>='\u3040' && LA16_205<='\u318F')||(LA16_205>='\u3300' && LA16_205<='\u337F')||(LA16_205>='\u3400' && LA16_205<='\u3D2D')||(LA16_205>='\u4E00' && LA16_205<='\u9FFF')||(LA16_205>='\uF900' && LA16_205<='\uFAFF')) ) {
                                alt16=83;
                            }
                            else {
                                alt16=24;}
                        }
                        else {
                            alt16=83;}
                        }
                        break;
                    case 'F':
                        {
                        switch ( input.LA(5) ) {
                        case 'O':
                            {
                            int LA16_206 = input.LA(6);

                            if ( (LA16_206=='R') ) {
                                int LA16_249 = input.LA(7);

                                if ( (LA16_249=='E') ) {
                                    int LA16_282 = input.LA(8);

                                    if ( (LA16_282=='A') ) {
                                        int LA16_312 = input.LA(9);

                                        if ( (LA16_312=='C') ) {
                                            int LA16_331 = input.LA(10);

                                            if ( (LA16_331=='H') ) {
                                                int LA16_342 = input.LA(11);

                                                if ( (LA16_342=='$'||(LA16_342>='0' && LA16_342<='9')||(LA16_342>='A' && LA16_342<='Z')||LA16_342=='_'||(LA16_342>='a' && LA16_342<='z')||(LA16_342>='\u00C0' && LA16_342<='\u00D6')||(LA16_342>='\u00D8' && LA16_342<='\u00F6')||(LA16_342>='\u00F8' && LA16_342<='\u1FFF')||(LA16_342>='\u3040' && LA16_342<='\u318F')||(LA16_342>='\u3300' && LA16_342<='\u337F')||(LA16_342>='\u3400' && LA16_342<='\u3D2D')||(LA16_342>='\u4E00' && LA16_342<='\u9FFF')||(LA16_342>='\uF900' && LA16_342<='\uFAFF')) ) {
                                                    alt16=83;
                                                }
                                                else {
                                                    alt16=22;}
                                            }
                                            else {
                                                alt16=83;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                            }
                            break;
                        case 'I':
                            {
                            int LA16_207 = input.LA(6);

                            if ( (LA16_207=='L') ) {
                                int LA16_250 = input.LA(7);

                                if ( (LA16_250=='E') ) {
                                    int LA16_283 = input.LA(8);

                                    if ( (LA16_283=='$'||(LA16_283>='0' && LA16_283<='9')||(LA16_283>='A' && LA16_283<='Z')||LA16_283=='_'||(LA16_283>='a' && LA16_283<='z')||(LA16_283>='\u00C0' && LA16_283<='\u00D6')||(LA16_283>='\u00D8' && LA16_283<='\u00F6')||(LA16_283>='\u00F8' && LA16_283<='\u1FFF')||(LA16_283>='\u3040' && LA16_283<='\u318F')||(LA16_283>='\u3300' && LA16_283<='\u337F')||(LA16_283>='\u3400' && LA16_283<='\u3D2D')||(LA16_283>='\u4E00' && LA16_283<='\u9FFF')||(LA16_283>='\uF900' && LA16_283<='\uFAFF')) ) {
                                        alt16=83;
                                    }
                                    else {
                                        alt16=19;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                            }
                            break;
                        default:
                            alt16=83;}

                        }
                        break;
                    case 'A':
                        {
                        int LA16_160 = input.LA(5);

                        if ( (LA16_160=='R') ) {
                            int LA16_208 = input.LA(6);

                            if ( (LA16_208=='O') ) {
                                int LA16_251 = input.LA(7);

                                if ( (LA16_251=='U') ) {
                                    int LA16_284 = input.LA(8);

                                    if ( (LA16_284=='N') ) {
                                        int LA16_314 = input.LA(9);

                                        if ( (LA16_314=='D') ) {
                                            int LA16_332 = input.LA(10);

                                            if ( (LA16_332=='$'||(LA16_332>='0' && LA16_332<='9')||(LA16_332>='A' && LA16_332<='Z')||LA16_332=='_'||(LA16_332>='a' && LA16_332<='z')||(LA16_332>='\u00C0' && LA16_332<='\u00D6')||(LA16_332>='\u00D8' && LA16_332<='\u00F6')||(LA16_332>='\u00F8' && LA16_332<='\u1FFF')||(LA16_332>='\u3040' && LA16_332<='\u318F')||(LA16_332>='\u3300' && LA16_332<='\u337F')||(LA16_332>='\u3400' && LA16_332<='\u3D2D')||(LA16_332>='\u4E00' && LA16_332<='\u9FFF')||(LA16_332>='\uF900' && LA16_332<='\uFAFF')) ) {
                                                alt16=83;
                                            }
                                            else {
                                                alt16=9;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                        }
                        break;
                    case 'D':
                        {
                        int LA16_161 = input.LA(5);

                        if ( (LA16_161=='E') ) {
                            int LA16_209 = input.LA(6);

                            if ( (LA16_209=='F') ) {
                                int LA16_252 = input.LA(7);

                                if ( (LA16_252=='I') ) {
                                    int LA16_285 = input.LA(8);

                                    if ( (LA16_285=='N') ) {
                                        int LA16_315 = input.LA(9);

                                        if ( (LA16_315=='E') ) {
                                            int LA16_333 = input.LA(10);

                                            if ( (LA16_333=='$'||(LA16_333>='0' && LA16_333<='9')||(LA16_333>='A' && LA16_333<='Z')||LA16_333=='_'||(LA16_333>='a' && LA16_333<='z')||(LA16_333>='\u00C0' && LA16_333<='\u00D6')||(LA16_333>='\u00D8' && LA16_333<='\u00F6')||(LA16_333>='\u00F8' && LA16_333<='\u1FFF')||(LA16_333>='\u3040' && LA16_333<='\u318F')||(LA16_333>='\u3300' && LA16_333<='\u337F')||(LA16_333>='\u3400' && LA16_333<='\u3D2D')||(LA16_333>='\u4E00' && LA16_333<='\u9FFF')||(LA16_333>='\uF900' && LA16_333<='\uFAFF')) ) {
                                                alt16=83;
                                            }
                                            else {
                                                alt16=12;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                        }
                        break;
                    default:
                        alt16=83;}

                }
                else {
                    alt16=83;}
                }
                break;
            case 'X':
                {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    int LA16_114 = input.LA(4);

                    if ( (LA16_114=='E') ) {
                        int LA16_162 = input.LA(5);

                        if ( (LA16_162=='N') ) {
                            int LA16_210 = input.LA(6);

                            if ( (LA16_210=='S') ) {
                                int LA16_253 = input.LA(7);

                                if ( (LA16_253=='I') ) {
                                    int LA16_286 = input.LA(8);

                                    if ( (LA16_286=='O') ) {
                                        int LA16_316 = input.LA(9);

                                        if ( (LA16_316=='N') ) {
                                            int LA16_334 = input.LA(10);

                                            if ( (LA16_334=='$'||(LA16_334>='0' && LA16_334<='9')||(LA16_334>='A' && LA16_334<='Z')||LA16_334=='_'||(LA16_334>='a' && LA16_334<='z')||(LA16_334>='\u00C0' && LA16_334<='\u00D6')||(LA16_334>='\u00D8' && LA16_334<='\u00F6')||(LA16_334>='\u00F8' && LA16_334<='\u1FFF')||(LA16_334>='\u3040' && LA16_334<='\u318F')||(LA16_334>='\u3300' && LA16_334<='\u337F')||(LA16_334>='\u3400' && LA16_334<='\u3D2D')||(LA16_334>='\u4E00' && LA16_334<='\u9FFF')||(LA16_334>='\uF900' && LA16_334<='\uFAFF')) ) {
                                                alt16=83;
                                            }
                                            else {
                                                alt16=2;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                    }
                    break;
                case 'P':
                    {
                    int LA16_115 = input.LA(4);

                    if ( (LA16_115=='A') ) {
                        int LA16_163 = input.LA(5);

                        if ( (LA16_163=='N') ) {
                            int LA16_211 = input.LA(6);

                            if ( (LA16_211=='D') ) {
                                int LA16_254 = input.LA(7);

                                if ( (LA16_254=='$'||(LA16_254>='0' && LA16_254<='9')||(LA16_254>='A' && LA16_254<='Z')||LA16_254=='_'||(LA16_254>='a' && LA16_254<='z')||(LA16_254>='\u00C0' && LA16_254<='\u00D6')||(LA16_254>='\u00D8' && LA16_254<='\u00F6')||(LA16_254>='\u00F8' && LA16_254<='\u1FFF')||(LA16_254>='\u3040' && LA16_254<='\u318F')||(LA16_254>='\u3300' && LA16_254<='\u337F')||(LA16_254>='\u3400' && LA16_254<='\u3D2D')||(LA16_254>='\u4E00' && LA16_254<='\u9FFF')||(LA16_254>='\uF900' && LA16_254<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=15;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                    }
                    break;
                default:
                    alt16=83;}

                }
                break;
            case 'R':
                {
                int LA16_54 = input.LA(3);

                if ( (LA16_54=='R') ) {
                    int LA16_116 = input.LA(4);

                    if ( (LA16_116=='O') ) {
                        int LA16_164 = input.LA(5);

                        if ( (LA16_164=='R') ) {
                            int LA16_212 = input.LA(6);

                            if ( (LA16_212=='$'||(LA16_212>='0' && LA16_212<='9')||(LA16_212>='A' && LA16_212<='Z')||LA16_212=='_'||(LA16_212>='a' && LA16_212<='z')||(LA16_212>='\u00C0' && LA16_212<='\u00D6')||(LA16_212>='\u00D8' && LA16_212<='\u00F6')||(LA16_212>='\u00F8' && LA16_212<='\u1FFF')||(LA16_212>='\u3040' && LA16_212<='\u318F')||(LA16_212>='\u3300' && LA16_212<='\u337F')||(LA16_212>='\u3400' && LA16_212<='\u3D2D')||(LA16_212>='\u4E00' && LA16_212<='\u9FFF')||(LA16_212>='\uF900' && LA16_212<='\uFAFF')) ) {
                                alt16=83;
                            }
                            else {
                                alt16=14;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'L':
                {
                int LA16_55 = input.LA(3);

                if ( (LA16_55=='S') ) {
                    int LA16_117 = input.LA(4);

                    if ( (LA16_117=='E') ) {
                        int LA16_165 = input.LA(5);

                        if ( (LA16_165=='I') ) {
                            int LA16_213 = input.LA(6);

                            if ( (LA16_213=='F') ) {
                                int LA16_256 = input.LA(7);

                                if ( (LA16_256=='$'||(LA16_256>='0' && LA16_256<='9')||(LA16_256>='A' && LA16_256<='Z')||LA16_256=='_'||(LA16_256>='a' && LA16_256<='z')||(LA16_256>='\u00C0' && LA16_256<='\u00D6')||(LA16_256>='\u00D8' && LA16_256<='\u00F6')||(LA16_256>='\u00F8' && LA16_256<='\u1FFF')||(LA16_256>='\u3040' && LA16_256<='\u318F')||(LA16_256>='\u3300' && LA16_256<='\u337F')||(LA16_256>='\u3400' && LA16_256<='\u3D2D')||(LA16_256>='\u4E00' && LA16_256<='\u9FFF')||(LA16_256>='\uF900' && LA16_256<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=25;}
                            }
                            else {
                                alt16=83;}
                        }
                        else if ( (LA16_165=='$'||(LA16_165>='0' && LA16_165<='9')||(LA16_165>='A' && LA16_165<='H')||(LA16_165>='J' && LA16_165<='Z')||LA16_165=='_'||(LA16_165>='a' && LA16_165<='z')||(LA16_165>='\u00C0' && LA16_165<='\u00D6')||(LA16_165>='\u00D8' && LA16_165<='\u00F6')||(LA16_165>='\u00F8' && LA16_165<='\u1FFF')||(LA16_165>='\u3040' && LA16_165<='\u318F')||(LA16_165>='\u3300' && LA16_165<='\u337F')||(LA16_165>='\u3400' && LA16_165<='\u3D2D')||(LA16_165>='\u4E00' && LA16_165<='\u9FFF')||(LA16_165>='\uF900' && LA16_165<='\uFAFF')) ) {
                            alt16=83;
                        }
                        else {
                            alt16=26;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'S':
                {
                int LA16_56 = input.LA(3);

                if ( (LA16_56=='$'||(LA16_56>='0' && LA16_56<='9')||(LA16_56>='A' && LA16_56<='Z')||LA16_56=='_'||(LA16_56>='a' && LA16_56<='z')||(LA16_56>='\u00C0' && LA16_56<='\u00D6')||(LA16_56>='\u00D8' && LA16_56<='\u00F6')||(LA16_56>='\u00F8' && LA16_56<='\u1FFF')||(LA16_56>='\u3040' && LA16_56<='\u318F')||(LA16_56>='\u3300' && LA16_56<='\u337F')||(LA16_56>='\u3400' && LA16_56<='\u3D2D')||(LA16_56>='\u4E00' && LA16_56<='\u9FFF')||(LA16_56>='\uF900' && LA16_56<='\uFAFF')) ) {
                    alt16=83;
                }
                else {
                    alt16=20;}
                }
                break;
            case 'R':
                {
                int LA16_57 = input.LA(3);

                if ( (LA16_57=='O') ) {
                    int LA16_119 = input.LA(4);

                    if ( (LA16_119=='U') ) {
                        int LA16_166 = input.LA(5);

                        if ( (LA16_166=='N') ) {
                            int LA16_215 = input.LA(6);

                            if ( (LA16_215=='D') ) {
                                int LA16_257 = input.LA(7);

                                if ( (LA16_257=='$'||(LA16_257>='0' && LA16_257<='9')||(LA16_257>='A' && LA16_257<='Z')||LA16_257=='_'||(LA16_257>='a' && LA16_257<='z')||(LA16_257>='\u00C0' && LA16_257<='\u00D6')||(LA16_257>='\u00D8' && LA16_257<='\u00F6')||(LA16_257>='\u00F8' && LA16_257<='\u1FFF')||(LA16_257>='\u3040' && LA16_257<='\u318F')||(LA16_257>='\u3300' && LA16_257<='\u337F')||(LA16_257>='\u3400' && LA16_257<='\u3D2D')||(LA16_257>='\u4E00' && LA16_257<='\u9FFF')||(LA16_257>='\uF900' && LA16_257<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=3;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='(') ) {
            alt16=4;
        }
        else if ( (LA16_0==',') ) {
            alt16=5;
        }
        else if ( (LA16_0=='*') ) {
            alt16=6;
        }
        else if ( (LA16_0==')') ) {
            alt16=7;
        }
        else if ( (LA16_0=='F') ) {
            switch ( input.LA(2) ) {
            case 'O':
                {
                int LA16_58 = input.LA(3);

                if ( (LA16_58=='R') ) {
                    int LA16_120 = input.LA(4);

                    if ( (LA16_120=='E') ) {
                        int LA16_167 = input.LA(5);

                        if ( (LA16_167=='A') ) {
                            int LA16_216 = input.LA(6);

                            if ( (LA16_216=='C') ) {
                                int LA16_258 = input.LA(7);

                                if ( (LA16_258=='H') ) {
                                    int LA16_290 = input.LA(8);

                                    if ( (LA16_290=='$'||(LA16_290>='0' && LA16_290<='9')||(LA16_290>='A' && LA16_290<='Z')||LA16_290=='_'||(LA16_290>='a' && LA16_290<='z')||(LA16_290>='\u00C0' && LA16_290<='\u00D6')||(LA16_290>='\u00D8' && LA16_290<='\u00F6')||(LA16_290>='\u00F8' && LA16_290<='\u1FFF')||(LA16_290>='\u3040' && LA16_290<='\u318F')||(LA16_290>='\u3300' && LA16_290<='\u337F')||(LA16_290>='\u3400' && LA16_290<='\u3D2D')||(LA16_290>='\u4E00' && LA16_290<='\u9FFF')||(LA16_290>='\uF900' && LA16_290<='\uFAFF')) ) {
                                        alt16=83;
                                    }
                                    else {
                                        alt16=16;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else if ( (LA16_120=='$'||(LA16_120>='0' && LA16_120<='9')||(LA16_120>='A' && LA16_120<='D')||(LA16_120>='F' && LA16_120<='Z')||LA16_120=='_'||(LA16_120>='a' && LA16_120<='z')||(LA16_120>='\u00C0' && LA16_120<='\u00D6')||(LA16_120>='\u00D8' && LA16_120<='\u00F6')||(LA16_120>='\u00F8' && LA16_120<='\u1FFF')||(LA16_120>='\u3040' && LA16_120<='\u318F')||(LA16_120>='\u3300' && LA16_120<='\u337F')||(LA16_120>='\u3400' && LA16_120<='\u3D2D')||(LA16_120>='\u4E00' && LA16_120<='\u9FFF')||(LA16_120>='\uF900' && LA16_120<='\uFAFF')) ) {
                        alt16=83;
                    }
                    else {
                        alt16=8;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'I':
                {
                int LA16_59 = input.LA(3);

                if ( (LA16_59=='L') ) {
                    int LA16_121 = input.LA(4);

                    if ( (LA16_121=='E') ) {
                        int LA16_169 = input.LA(5);

                        if ( (LA16_169=='$'||(LA16_169>='0' && LA16_169<='9')||(LA16_169>='A' && LA16_169<='Z')||LA16_169=='_'||(LA16_169>='a' && LA16_169<='z')||(LA16_169>='\u00C0' && LA16_169<='\u00D6')||(LA16_169>='\u00D8' && LA16_169<='\u00F6')||(LA16_169>='\u00F8' && LA16_169<='\u1FFF')||(LA16_169>='\u3040' && LA16_169<='\u318F')||(LA16_169>='\u3300' && LA16_169<='\u337F')||(LA16_169>='\u3400' && LA16_169<='\u3D2D')||(LA16_169>='\u4E00' && LA16_169<='\u9FFF')||(LA16_169>='\uF900' && LA16_169<='\uFAFF')) ) {
                            alt16=83;
                        }
                        else {
                            alt16=18;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0==':') ) {
            int LA16_9 = input.LA(2);

            if ( (LA16_9==':') ) {
                alt16=10;
            }
            else {
                alt16=37;}
        }
        else if ( (LA16_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA16_62 = input.LA(3);

                if ( (LA16_62=='F') ) {
                    int LA16_122 = input.LA(4);

                    if ( (LA16_122=='I') ) {
                        int LA16_170 = input.LA(5);

                        if ( (LA16_170=='N') ) {
                            int LA16_218 = input.LA(6);

                            if ( (LA16_218=='E') ) {
                                int LA16_259 = input.LA(7);

                                if ( (LA16_259=='$'||(LA16_259>='0' && LA16_259<='9')||(LA16_259>='A' && LA16_259<='Z')||LA16_259=='_'||(LA16_259>='a' && LA16_259<='z')||(LA16_259>='\u00C0' && LA16_259<='\u00D6')||(LA16_259>='\u00D8' && LA16_259<='\u00F6')||(LA16_259>='\u00F8' && LA16_259<='\u1FFF')||(LA16_259>='\u3040' && LA16_259<='\u318F')||(LA16_259>='\u3300' && LA16_259<='\u337F')||(LA16_259>='\u3400' && LA16_259<='\u3D2D')||(LA16_259>='\u4E00' && LA16_259<='\u9FFF')||(LA16_259>='\uF900' && LA16_259<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=11;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'I':
                {
                int LA16_63 = input.LA(3);

                if ( (LA16_63=='S') ) {
                    int LA16_123 = input.LA(4);

                    if ( (LA16_123=='A') ) {
                        int LA16_171 = input.LA(5);

                        if ( (LA16_171=='B') ) {
                            int LA16_219 = input.LA(6);

                            if ( (LA16_219=='L') ) {
                                int LA16_260 = input.LA(7);

                                if ( (LA16_260=='E') ) {
                                    int LA16_292 = input.LA(8);

                                    if ( (LA16_292=='$'||(LA16_292>='0' && LA16_292<='9')||(LA16_292>='A' && LA16_292<='Z')||LA16_292=='_'||(LA16_292>='a' && LA16_292<='z')||(LA16_292>='\u00C0' && LA16_292<='\u00D6')||(LA16_292>='\u00D8' && LA16_292<='\u00F6')||(LA16_292>='\u00F8' && LA16_292<='\u1FFF')||(LA16_292>='\u3040' && LA16_292<='\u318F')||(LA16_292>='\u3300' && LA16_292<='\u337F')||(LA16_292>='\u3400' && LA16_292<='\u3D2D')||(LA16_292>='\u4E00' && LA16_292<='\u9FFF')||(LA16_292>='\uF900' && LA16_292<='\uFAFF')) ) {
                                        alt16=83;
                                    }
                                    else {
                                        alt16=33;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='-') ) {
            int LA16_11 = input.LA(2);

            if ( (LA16_11=='>') ) {
                alt16=38;
            }
            else {
                alt16=13;}
        }
        else if ( (LA16_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA16_66 = input.LA(3);

                if ( (LA16_66=='P') ) {
                    int LA16_124 = input.LA(4);

                    if ( (LA16_124=='A') ) {
                        int LA16_172 = input.LA(5);

                        if ( (LA16_172=='R') ) {
                            int LA16_220 = input.LA(6);

                            if ( (LA16_220=='A') ) {
                                int LA16_261 = input.LA(7);

                                if ( (LA16_261=='T') ) {
                                    int LA16_293 = input.LA(8);

                                    if ( (LA16_293=='O') ) {
                                        int LA16_319 = input.LA(9);

                                        if ( (LA16_319=='R') ) {
                                            int LA16_335 = input.LA(10);

                                            if ( (LA16_335=='$'||(LA16_335>='0' && LA16_335<='9')||(LA16_335>='A' && LA16_335<='Z')||LA16_335=='_'||(LA16_335>='a' && LA16_335<='z')||(LA16_335>='\u00C0' && LA16_335<='\u00D6')||(LA16_335>='\u00D8' && LA16_335<='\u00F6')||(LA16_335>='\u00F8' && LA16_335<='\u1FFF')||(LA16_335>='\u3040' && LA16_335<='\u318F')||(LA16_335>='\u3300' && LA16_335<='\u337F')||(LA16_335>='\u3400' && LA16_335<='\u3D2D')||(LA16_335>='\u4E00' && LA16_335<='\u9FFF')||(LA16_335>='\uF900' && LA16_335<='\uFAFF')) ) {
                                                alt16=83;
                                            }
                                            else {
                                                alt16=17;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'e':
                {
                int LA16_67 = input.LA(3);

                if ( (LA16_67=='t') ) {
                    int LA16_125 = input.LA(4);

                    if ( (LA16_125=='$'||(LA16_125>='0' && LA16_125<='9')||(LA16_125>='A' && LA16_125<='Z')||LA16_125=='_'||(LA16_125>='a' && LA16_125<='z')||(LA16_125>='\u00C0' && LA16_125<='\u00D6')||(LA16_125>='\u00D8' && LA16_125<='\u00F6')||(LA16_125>='\u00F8' && LA16_125<='\u1FFF')||(LA16_125>='\u3040' && LA16_125<='\u318F')||(LA16_125>='\u3300' && LA16_125<='\u337F')||(LA16_125>='\u3400' && LA16_125<='\u3D2D')||(LA16_125>='\u4E00' && LA16_125<='\u9FFF')||(LA16_125>='\uF900' && LA16_125<='\uFAFF')) ) {
                        alt16=83;
                    }
                    else {
                        alt16=78;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='L') ) {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA16_68 = input.LA(3);

                if ( (LA16_68=='T') ) {
                    int LA16_126 = input.LA(4);

                    if ( (LA16_126=='$'||(LA16_126>='0' && LA16_126<='9')||(LA16_126>='A' && LA16_126<='Z')||LA16_126=='_'||(LA16_126>='a' && LA16_126<='z')||(LA16_126>='\u00C0' && LA16_126<='\u00D6')||(LA16_126>='\u00D8' && LA16_126<='\u00F6')||(LA16_126>='\u00F8' && LA16_126<='\u1FFF')||(LA16_126>='\u3040' && LA16_126<='\u318F')||(LA16_126>='\u3300' && LA16_126<='\u337F')||(LA16_126>='\u3400' && LA16_126<='\u3D2D')||(LA16_126>='\u4E00' && LA16_126<='\u9FFF')||(LA16_126>='\uF900' && LA16_126<='\uFAFF')) ) {
                        alt16=83;
                    }
                    else {
                        alt16=27;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'i':
                {
                int LA16_69 = input.LA(3);

                if ( (LA16_69=='s') ) {
                    int LA16_127 = input.LA(4);

                    if ( (LA16_127=='t') ) {
                        int LA16_175 = input.LA(5);

                        if ( (LA16_175=='$'||(LA16_175>='0' && LA16_175<='9')||(LA16_175>='A' && LA16_175<='Z')||LA16_175=='_'||(LA16_175>='a' && LA16_175<='z')||(LA16_175>='\u00C0' && LA16_175<='\u00D6')||(LA16_175>='\u00D8' && LA16_175<='\u00F6')||(LA16_175>='\u00F8' && LA16_175<='\u1FFF')||(LA16_175>='\u3040' && LA16_175<='\u318F')||(LA16_175>='\u3300' && LA16_175<='\u337F')||(LA16_175>='\u3400' && LA16_175<='\u3D2D')||(LA16_175>='\u4E00' && LA16_175<='\u9FFF')||(LA16_175>='\uF900' && LA16_175<='\uFAFF')) ) {
                            alt16=83;
                        }
                        else {
                            alt16=77;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='P') ) {
            int LA16_14 = input.LA(2);

            if ( (LA16_14=='R') ) {
                int LA16_70 = input.LA(3);

                if ( (LA16_70=='O') ) {
                    int LA16_128 = input.LA(4);

                    if ( (LA16_128=='T') ) {
                        int LA16_176 = input.LA(5);

                        if ( (LA16_176=='E') ) {
                            int LA16_222 = input.LA(6);

                            if ( (LA16_222=='C') ) {
                                int LA16_262 = input.LA(7);

                                if ( (LA16_262=='T') ) {
                                    int LA16_294 = input.LA(8);

                                    if ( (LA16_294=='$'||(LA16_294>='0' && LA16_294<='9')||(LA16_294>='A' && LA16_294<='Z')||LA16_294=='_'||(LA16_294>='a' && LA16_294<='z')||(LA16_294>='\u00C0' && LA16_294<='\u00D6')||(LA16_294>='\u00D8' && LA16_294<='\u00F6')||(LA16_294>='\u00F8' && LA16_294<='\u1FFF')||(LA16_294>='\u3040' && LA16_294<='\u318F')||(LA16_294>='\u3300' && LA16_294<='\u337F')||(LA16_294>='\u3400' && LA16_294<='\u3D2D')||(LA16_294>='\u4E00' && LA16_294<='\u9FFF')||(LA16_294>='\uF900' && LA16_294<='\uFAFF')) ) {
                                        alt16=83;
                                    }
                                    else {
                                        alt16=29;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
            }
            else {
                alt16=83;}
        }
        else if ( (LA16_0=='C') ) {
            switch ( input.LA(2) ) {
            case 'S':
                {
                int LA16_71 = input.LA(3);

                if ( (LA16_71=='T') ) {
                    int LA16_129 = input.LA(4);

                    if ( (LA16_129=='A') ) {
                        int LA16_177 = input.LA(5);

                        if ( (LA16_177=='R') ) {
                            int LA16_223 = input.LA(6);

                            if ( (LA16_223=='T') ) {
                                int LA16_263 = input.LA(7);

                                if ( (LA16_263=='$'||(LA16_263>='0' && LA16_263<='9')||(LA16_263>='A' && LA16_263<='Z')||LA16_263=='_'||(LA16_263>='a' && LA16_263<='z')||(LA16_263>='\u00C0' && LA16_263<='\u00D6')||(LA16_263>='\u00D8' && LA16_263<='\u00F6')||(LA16_263>='\u00F8' && LA16_263<='\u1FFF')||(LA16_263>='\u3040' && LA16_263<='\u318F')||(LA16_263>='\u3300' && LA16_263<='\u337F')||(LA16_263>='\u3400' && LA16_263<='\u3D2D')||(LA16_263>='\u4E00' && LA16_263<='\u9FFF')||(LA16_263>='\uF900' && LA16_263<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=30;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'o':
                {
                int LA16_72 = input.LA(3);

                if ( (LA16_72=='l') ) {
                    int LA16_130 = input.LA(4);

                    if ( (LA16_130=='l') ) {
                        int LA16_178 = input.LA(5);

                        if ( (LA16_178=='e') ) {
                            int LA16_224 = input.LA(6);

                            if ( (LA16_224=='c') ) {
                                int LA16_264 = input.LA(7);

                                if ( (LA16_264=='t') ) {
                                    int LA16_296 = input.LA(8);

                                    if ( (LA16_296=='i') ) {
                                        int LA16_321 = input.LA(9);

                                        if ( (LA16_321=='o') ) {
                                            int LA16_336 = input.LA(10);

                                            if ( (LA16_336=='n') ) {
                                                int LA16_347 = input.LA(11);

                                                if ( (LA16_347=='$'||(LA16_347>='0' && LA16_347<='9')||(LA16_347>='A' && LA16_347<='Z')||LA16_347=='_'||(LA16_347>='a' && LA16_347<='z')||(LA16_347>='\u00C0' && LA16_347<='\u00D6')||(LA16_347>='\u00D8' && LA16_347<='\u00F6')||(LA16_347>='\u00F8' && LA16_347<='\u1FFF')||(LA16_347>='\u3040' && LA16_347<='\u318F')||(LA16_347>='\u3300' && LA16_347<='\u337F')||(LA16_347>='\u3400' && LA16_347<='\u3D2D')||(LA16_347>='\u4E00' && LA16_347<='\u9FFF')||(LA16_347>='\uF900' && LA16_347<='\uFAFF')) ) {
                                                    alt16=83;
                                                }
                                                else {
                                                    alt16=76;}
                                            }
                                            else {
                                                alt16=83;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'E':
                {
                int LA16_73 = input.LA(3);

                if ( (LA16_73=='N') ) {
                    int LA16_131 = input.LA(4);

                    if ( (LA16_131=='D') ) {
                        int LA16_179 = input.LA(5);

                        if ( (LA16_179=='$'||(LA16_179>='0' && LA16_179<='9')||(LA16_179>='A' && LA16_179<='Z')||LA16_179=='_'||(LA16_179>='a' && LA16_179<='z')||(LA16_179>='\u00C0' && LA16_179<='\u00D6')||(LA16_179>='\u00D8' && LA16_179<='\u00F6')||(LA16_179>='\u00F8' && LA16_179<='\u1FFF')||(LA16_179>='\u3040' && LA16_179<='\u318F')||(LA16_179>='\u3300' && LA16_179<='\u337F')||(LA16_179>='\u3400' && LA16_179<='\u3D2D')||(LA16_179>='\u4E00' && LA16_179<='\u9FFF')||(LA16_179>='\uF900' && LA16_179<='\uFAFF')) ) {
                            alt16=83;
                        }
                        else {
                            alt16=31;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='l') ) {
            int LA16_16 = input.LA(2);

            if ( (LA16_16=='e') ) {
                int LA16_74 = input.LA(3);

                if ( (LA16_74=='t') ) {
                    int LA16_132 = input.LA(4);

                    if ( (LA16_132=='$'||(LA16_132>='0' && LA16_132<='9')||(LA16_132>='A' && LA16_132<='Z')||LA16_132=='_'||(LA16_132>='a' && LA16_132<='z')||(LA16_132>='\u00C0' && LA16_132<='\u00D6')||(LA16_132>='\u00D8' && LA16_132<='\u00F6')||(LA16_132>='\u00F8' && LA16_132<='\u1FFF')||(LA16_132>='\u3040' && LA16_132<='\u318F')||(LA16_132>='\u3300' && LA16_132<='\u337F')||(LA16_132>='\u3400' && LA16_132<='\u3D2D')||(LA16_132>='\u4E00' && LA16_132<='\u9FFF')||(LA16_132>='\uF900' && LA16_132<='\uFAFF')) ) {
                        alt16=83;
                    }
                    else {
                        alt16=35;}
                }
                else {
                    alt16=83;}
            }
            else {
                alt16=83;}
        }
        else if ( (LA16_0=='=') ) {
            int LA16_17 = input.LA(2);

            if ( (LA16_17=='=') ) {
                alt16=51;
            }
            else {
                alt16=36;}
        }
        else if ( (LA16_0=='?') ) {
            alt16=39;
        }
        else if ( (LA16_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'f':
                {
                int LA16_77 = input.LA(3);

                if ( (LA16_77=='$'||(LA16_77>='0' && LA16_77<='9')||(LA16_77>='A' && LA16_77<='Z')||LA16_77=='_'||(LA16_77>='a' && LA16_77<='z')||(LA16_77>='\u00C0' && LA16_77<='\u00D6')||(LA16_77>='\u00D8' && LA16_77<='\u00F6')||(LA16_77>='\u00F8' && LA16_77<='\u1FFF')||(LA16_77>='\u3040' && LA16_77<='\u318F')||(LA16_77>='\u3300' && LA16_77<='\u337F')||(LA16_77>='\u3400' && LA16_77<='\u3D2D')||(LA16_77>='\u4E00' && LA16_77<='\u9FFF')||(LA16_77>='\uF900' && LA16_77<='\uFAFF')) ) {
                    alt16=83;
                }
                else {
                    alt16=40;}
                }
                break;
            case 'm':
                {
                int LA16_78 = input.LA(3);

                if ( (LA16_78=='p') ) {
                    int LA16_134 = input.LA(4);

                    if ( (LA16_134=='l') ) {
                        int LA16_181 = input.LA(5);

                        if ( (LA16_181=='i') ) {
                            int LA16_226 = input.LA(6);

                            if ( (LA16_226=='e') ) {
                                int LA16_265 = input.LA(7);

                                if ( (LA16_265=='s') ) {
                                    int LA16_297 = input.LA(8);

                                    if ( (LA16_297=='$'||(LA16_297>='0' && LA16_297<='9')||(LA16_297>='A' && LA16_297<='Z')||LA16_297=='_'||(LA16_297>='a' && LA16_297<='z')||(LA16_297>='\u00C0' && LA16_297<='\u00D6')||(LA16_297>='\u00D8' && LA16_297<='\u00F6')||(LA16_297>='\u00F8' && LA16_297<='\u1FFF')||(LA16_297>='\u3040' && LA16_297<='\u318F')||(LA16_297>='\u3300' && LA16_297<='\u337F')||(LA16_297>='\u3400' && LA16_297<='\u3D2D')||(LA16_297>='\u4E00' && LA16_297<='\u9FFF')||(LA16_297>='\uF900' && LA16_297<='\uFAFF')) ) {
                                        alt16=83;
                                    }
                                    else {
                                        alt16=50;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA16_79 = input.LA(3);

                if ( (LA16_79=='p') ) {
                    int LA16_135 = input.LA(4);

                    if ( (LA16_135=='e') ) {
                        int LA16_182 = input.LA(5);

                        if ( (LA16_182=='S') ) {
                            int LA16_227 = input.LA(6);

                            if ( (LA16_227=='e') ) {
                                int LA16_266 = input.LA(7);

                                if ( (LA16_266=='l') ) {
                                    int LA16_298 = input.LA(8);

                                    if ( (LA16_298=='e') ) {
                                        int LA16_323 = input.LA(9);

                                        if ( (LA16_323=='c') ) {
                                            int LA16_337 = input.LA(10);

                                            if ( (LA16_337=='t') ) {
                                                int LA16_348 = input.LA(11);

                                                if ( (LA16_348=='$'||(LA16_348>='0' && LA16_348<='9')||(LA16_348>='A' && LA16_348<='Z')||LA16_348=='_'||(LA16_348>='a' && LA16_348<='z')||(LA16_348>='\u00C0' && LA16_348<='\u00D6')||(LA16_348>='\u00D8' && LA16_348<='\u00F6')||(LA16_348>='\u00F8' && LA16_348<='\u1FFF')||(LA16_348>='\u3040' && LA16_348<='\u318F')||(LA16_348>='\u3300' && LA16_348<='\u337F')||(LA16_348>='\u3400' && LA16_348<='\u3D2D')||(LA16_348>='\u4E00' && LA16_348<='\u9FFF')||(LA16_348>='\uF900' && LA16_348<='\uFAFF')) ) {
                                                    alt16=83;
                                                }
                                                else {
                                                    alt16=66;}
                                            }
                                            else {
                                                alt16=83;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'r':
                {
                int LA16_80 = input.LA(3);

                if ( (LA16_80=='u') ) {
                    int LA16_136 = input.LA(4);

                    if ( (LA16_136=='e') ) {
                        int LA16_183 = input.LA(5);

                        if ( (LA16_183=='$'||(LA16_183>='0' && LA16_183<='9')||(LA16_183>='A' && LA16_183<='Z')||LA16_183=='_'||(LA16_183>='a' && LA16_183<='z')||(LA16_183>='\u00C0' && LA16_183<='\u00D6')||(LA16_183>='\u00D8' && LA16_183<='\u00F6')||(LA16_183>='\u00F8' && LA16_183<='\u1FFF')||(LA16_183>='\u3040' && LA16_183<='\u318F')||(LA16_183>='\u3300' && LA16_183<='\u337F')||(LA16_183>='\u3400' && LA16_183<='\u3D2D')||(LA16_183>='\u4E00' && LA16_183<='\u9FFF')||(LA16_183>='\uF900' && LA16_183<='\uFAFF')) ) {
                            alt16=83;
                        }
                        else {
                            alt16=64;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'h':
                {
                int LA16_81 = input.LA(3);

                if ( (LA16_81=='e') ) {
                    int LA16_137 = input.LA(4);

                    if ( (LA16_137=='n') ) {
                        int LA16_184 = input.LA(5);

                        if ( (LA16_184=='$'||(LA16_184>='0' && LA16_184<='9')||(LA16_184>='A' && LA16_184<='Z')||LA16_184=='_'||(LA16_184>='a' && LA16_184<='z')||(LA16_184>='\u00C0' && LA16_184<='\u00D6')||(LA16_184>='\u00D8' && LA16_184<='\u00F6')||(LA16_184>='\u00F8' && LA16_184<='\u1FFF')||(LA16_184>='\u3040' && LA16_184<='\u318F')||(LA16_184>='\u3300' && LA16_184<='\u337F')||(LA16_184>='\u3400' && LA16_184<='\u3D2D')||(LA16_184>='\u4E00' && LA16_184<='\u9FFF')||(LA16_184>='\uF900' && LA16_184<='\uFAFF')) ) {
                            alt16=83;
                        }
                        else {
                            alt16=41;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                int LA16_82 = input.LA(3);

                if ( (LA16_82=='i') ) {
                    int LA16_138 = input.LA(4);

                    if ( (LA16_138=='s') ) {
                        int LA16_185 = input.LA(5);

                        if ( (LA16_185=='t') ) {
                            int LA16_230 = input.LA(6);

                            if ( (LA16_230=='s') ) {
                                int LA16_267 = input.LA(7);

                                if ( (LA16_267=='$'||(LA16_267>='0' && LA16_267<='9')||(LA16_267>='A' && LA16_267<='Z')||LA16_267=='_'||(LA16_267>='a' && LA16_267<='z')||(LA16_267>='\u00C0' && LA16_267<='\u00D6')||(LA16_267>='\u00D8' && LA16_267<='\u00F6')||(LA16_267>='\u00F8' && LA16_267<='\u1FFF')||(LA16_267>='\u3040' && LA16_267<='\u318F')||(LA16_267>='\u3300' && LA16_267<='\u337F')||(LA16_267>='\u3400' && LA16_267<='\u3D2D')||(LA16_267>='\u4E00' && LA16_267<='\u9FFF')||(LA16_267>='\uF900' && LA16_267<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=71;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'l':
                {
                int LA16_83 = input.LA(3);

                if ( (LA16_83=='s') ) {
                    int LA16_139 = input.LA(4);

                    if ( (LA16_139=='e') ) {
                        int LA16_186 = input.LA(5);

                        if ( (LA16_186=='$'||(LA16_186>='0' && LA16_186<='9')||(LA16_186>='A' && LA16_186<='Z')||LA16_186=='_'||(LA16_186>='a' && LA16_186<='z')||(LA16_186>='\u00C0' && LA16_186<='\u00D6')||(LA16_186>='\u00D8' && LA16_186<='\u00F6')||(LA16_186>='\u00F8' && LA16_186<='\u1FFF')||(LA16_186>='\u3040' && LA16_186<='\u318F')||(LA16_186>='\u3300' && LA16_186<='\u337F')||(LA16_186>='\u3400' && LA16_186<='\u3D2D')||(LA16_186>='\u4E00' && LA16_186<='\u9FFF')||(LA16_186>='\uF900' && LA16_186<='\uFAFF')) ) {
                            alt16=83;
                        }
                        else {
                            alt16=42;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA16_84 = input.LA(3);

                if ( (LA16_84=='l') ) {
                    int LA16_140 = input.LA(4);

                    if ( (LA16_140=='e') ) {
                        int LA16_187 = input.LA(5);

                        if ( (LA16_187=='c') ) {
                            int LA16_232 = input.LA(6);

                            if ( (LA16_232=='t') ) {
                                int LA16_268 = input.LA(7);

                                if ( (LA16_268=='F') ) {
                                    int LA16_300 = input.LA(8);

                                    if ( (LA16_300=='i') ) {
                                        int LA16_324 = input.LA(9);

                                        if ( (LA16_324=='r') ) {
                                            int LA16_338 = input.LA(10);

                                            if ( (LA16_338=='s') ) {
                                                int LA16_349 = input.LA(11);

                                                if ( (LA16_349=='t') ) {
                                                    int LA16_356 = input.LA(12);

                                                    if ( (LA16_356=='$'||(LA16_356>='0' && LA16_356<='9')||(LA16_356>='A' && LA16_356<='Z')||LA16_356=='_'||(LA16_356>='a' && LA16_356<='z')||(LA16_356>='\u00C0' && LA16_356<='\u00D6')||(LA16_356>='\u00D8' && LA16_356<='\u00F6')||(LA16_356>='\u00F8' && LA16_356<='\u1FFF')||(LA16_356>='\u3040' && LA16_356<='\u318F')||(LA16_356>='\u3300' && LA16_356<='\u337F')||(LA16_356>='\u3400' && LA16_356<='\u3D2D')||(LA16_356>='\u4E00' && LA16_356<='\u9FFF')||(LA16_356>='\uF900' && LA16_356<='\uFAFF')) ) {
                                                        alt16=83;
                                                    }
                                                    else {
                                                        alt16=69;}
                                                }
                                                else {
                                                    alt16=83;}
                                            }
                                            else {
                                                alt16=83;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else if ( (LA16_268=='$'||(LA16_268>='0' && LA16_268<='9')||(LA16_268>='A' && LA16_268<='E')||(LA16_268>='G' && LA16_268<='Z')||LA16_268=='_'||(LA16_268>='a' && LA16_268<='z')||(LA16_268>='\u00C0' && LA16_268<='\u00D6')||(LA16_268>='\u00D8' && LA16_268<='\u00F6')||(LA16_268>='\u00F8' && LA16_268<='\u1FFF')||(LA16_268>='\u3040' && LA16_268<='\u318F')||(LA16_268>='\u3300' && LA16_268<='\u337F')||(LA16_268>='\u3400' && LA16_268<='\u3D2D')||(LA16_268>='\u4E00' && LA16_268<='\u9FFF')||(LA16_268>='\uF900' && LA16_268<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=68;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'w':
                {
                int LA16_85 = input.LA(3);

                if ( (LA16_85=='i') ) {
                    int LA16_141 = input.LA(4);

                    if ( (LA16_141=='t') ) {
                        int LA16_188 = input.LA(5);

                        if ( (LA16_188=='c') ) {
                            int LA16_233 = input.LA(6);

                            if ( (LA16_233=='h') ) {
                                int LA16_269 = input.LA(7);

                                if ( (LA16_269=='$'||(LA16_269>='0' && LA16_269<='9')||(LA16_269>='A' && LA16_269<='Z')||LA16_269=='_'||(LA16_269>='a' && LA16_269<='z')||(LA16_269>='\u00C0' && LA16_269<='\u00D6')||(LA16_269>='\u00D8' && LA16_269<='\u00F6')||(LA16_269>='\u00F8' && LA16_269<='\u1FFF')||(LA16_269>='\u3040' && LA16_269<='\u318F')||(LA16_269>='\u3300' && LA16_269<='\u337F')||(LA16_269>='\u3400' && LA16_269<='\u3D2D')||(LA16_269>='\u4E00' && LA16_269<='\u9FFF')||(LA16_269>='\uF900' && LA16_269<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=43;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'o':
                {
                int LA16_86 = input.LA(3);

                if ( (LA16_86=='r') ) {
                    int LA16_142 = input.LA(4);

                    if ( (LA16_142=='t') ) {
                        int LA16_189 = input.LA(5);

                        if ( (LA16_189=='B') ) {
                            int LA16_234 = input.LA(6);

                            if ( (LA16_234=='y') ) {
                                int LA16_270 = input.LA(7);

                                if ( (LA16_270=='$'||(LA16_270>='0' && LA16_270<='9')||(LA16_270>='A' && LA16_270<='Z')||LA16_270=='_'||(LA16_270>='a' && LA16_270<='z')||(LA16_270>='\u00C0' && LA16_270<='\u00D6')||(LA16_270>='\u00D8' && LA16_270<='\u00F6')||(LA16_270>='\u00F8' && LA16_270<='\u1FFF')||(LA16_270>='\u3040' && LA16_270<='\u318F')||(LA16_270>='\u3300' && LA16_270<='\u337F')||(LA16_270>='\u3400' && LA16_270<='\u3D2D')||(LA16_270>='\u4E00' && LA16_270<='\u9FFF')||(LA16_270>='\uF900' && LA16_270<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=73;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='{') ) {
            alt16=44;
        }
        else if ( (LA16_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA16_87 = input.LA(3);

                if ( (LA16_87=='s') ) {
                    int LA16_143 = input.LA(4);

                    if ( (LA16_143=='e') ) {
                        int LA16_190 = input.LA(5);

                        if ( (LA16_190=='$'||(LA16_190>='0' && LA16_190<='9')||(LA16_190>='A' && LA16_190<='Z')||LA16_190=='_'||(LA16_190>='a' && LA16_190<='z')||(LA16_190>='\u00C0' && LA16_190<='\u00D6')||(LA16_190>='\u00D8' && LA16_190<='\u00F6')||(LA16_190>='\u00F8' && LA16_190<='\u1FFF')||(LA16_190>='\u3040' && LA16_190<='\u318F')||(LA16_190>='\u3300' && LA16_190<='\u337F')||(LA16_190>='\u3400' && LA16_190<='\u3D2D')||(LA16_190>='\u4E00' && LA16_190<='\u9FFF')||(LA16_190>='\uF900' && LA16_190<='\uFAFF')) ) {
                            alt16=83;
                        }
                        else {
                            alt16=45;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'o':
                {
                int LA16_88 = input.LA(3);

                if ( (LA16_88=='l') ) {
                    int LA16_144 = input.LA(4);

                    if ( (LA16_144=='l') ) {
                        int LA16_191 = input.LA(5);

                        if ( (LA16_191=='e') ) {
                            int LA16_236 = input.LA(6);

                            if ( (LA16_236=='c') ) {
                                int LA16_271 = input.LA(7);

                                if ( (LA16_271=='t') ) {
                                    int LA16_304 = input.LA(8);

                                    if ( (LA16_304=='$'||(LA16_304>='0' && LA16_304<='9')||(LA16_304>='A' && LA16_304<='Z')||LA16_304=='_'||(LA16_304>='a' && LA16_304<='z')||(LA16_304>='\u00C0' && LA16_304<='\u00D6')||(LA16_304>='\u00D8' && LA16_304<='\u00F6')||(LA16_304>='\u00F8' && LA16_304<='\u1FFF')||(LA16_304>='\u3040' && LA16_304<='\u318F')||(LA16_304>='\u3300' && LA16_304<='\u337F')||(LA16_304>='\u3400' && LA16_304<='\u3D2D')||(LA16_304>='\u4E00' && LA16_304<='\u9FFF')||(LA16_304>='\uF900' && LA16_304<='\uFAFF')) ) {
                                        alt16=83;
                                    }
                                    else {
                                        alt16=67;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='d') ) {
            int LA16_25 = input.LA(2);

            if ( (LA16_25=='e') ) {
                int LA16_89 = input.LA(3);

                if ( (LA16_89=='f') ) {
                    int LA16_145 = input.LA(4);

                    if ( (LA16_145=='a') ) {
                        int LA16_192 = input.LA(5);

                        if ( (LA16_192=='u') ) {
                            int LA16_237 = input.LA(6);

                            if ( (LA16_237=='l') ) {
                                int LA16_272 = input.LA(7);

                                if ( (LA16_272=='t') ) {
                                    int LA16_305 = input.LA(8);

                                    if ( (LA16_305=='$'||(LA16_305>='0' && LA16_305<='9')||(LA16_305>='A' && LA16_305<='Z')||LA16_305=='_'||(LA16_305>='a' && LA16_305<='z')||(LA16_305>='\u00C0' && LA16_305<='\u00D6')||(LA16_305>='\u00D8' && LA16_305<='\u00F6')||(LA16_305>='\u00F8' && LA16_305<='\u1FFF')||(LA16_305>='\u3040' && LA16_305<='\u318F')||(LA16_305>='\u3300' && LA16_305<='\u337F')||(LA16_305>='\u3400' && LA16_305<='\u3D2D')||(LA16_305>='\u4E00' && LA16_305<='\u9FFF')||(LA16_305>='\uF900' && LA16_305<='\uFAFF')) ) {
                                        alt16=83;
                                    }
                                    else {
                                        alt16=46;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
            }
            else {
                alt16=83;}
        }
        else if ( (LA16_0=='}') ) {
            alt16=47;
        }
        else if ( (LA16_0=='|') ) {
            int LA16_27 = input.LA(2);

            if ( (LA16_27=='|') ) {
                alt16=48;
            }
            else {
                alt16=75;}
        }
        else if ( (LA16_0=='&') ) {
            alt16=49;
        }
        else if ( (LA16_0=='!') ) {
            int LA16_29 = input.LA(2);

            if ( (LA16_29=='=') ) {
                alt16=52;
            }
            else {
                alt16=59;}
        }
        else if ( (LA16_0=='>') ) {
            int LA16_30 = input.LA(2);

            if ( (LA16_30=='=') ) {
                alt16=53;
            }
            else {
                alt16=55;}
        }
        else if ( (LA16_0=='<') ) {
            int LA16_31 = input.LA(2);

            if ( (LA16_31=='=') ) {
                alt16=54;
            }
            else {
                alt16=56;}
        }
        else if ( (LA16_0=='+') ) {
            alt16=57;
        }
        else if ( (LA16_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt16=85;
                }
                break;
            case '/':
                {
                alt16=86;
                }
                break;
            default:
                alt16=58;}

        }
        else if ( (LA16_0=='.') ) {
            alt16=60;
        }
        else if ( (LA16_0=='G') ) {
            int LA16_35 = input.LA(2);

            if ( (LA16_35=='L') ) {
                int LA16_101 = input.LA(3);

                if ( (LA16_101=='O') ) {
                    int LA16_146 = input.LA(4);

                    if ( (LA16_146=='B') ) {
                        int LA16_193 = input.LA(5);

                        if ( (LA16_193=='A') ) {
                            int LA16_238 = input.LA(6);

                            if ( (LA16_238=='L') ) {
                                int LA16_273 = input.LA(7);

                                if ( (LA16_273=='V') ) {
                                    int LA16_306 = input.LA(8);

                                    if ( (LA16_306=='A') ) {
                                        int LA16_327 = input.LA(9);

                                        if ( (LA16_327=='R') ) {
                                            int LA16_339 = input.LA(10);

                                            if ( (LA16_339=='$'||(LA16_339>='0' && LA16_339<='9')||(LA16_339>='A' && LA16_339<='Z')||LA16_339=='_'||(LA16_339>='a' && LA16_339<='z')||(LA16_339>='\u00C0' && LA16_339<='\u00D6')||(LA16_339>='\u00D8' && LA16_339<='\u00F6')||(LA16_339>='\u00F8' && LA16_339<='\u1FFF')||(LA16_339>='\u3040' && LA16_339<='\u318F')||(LA16_339>='\u3300' && LA16_339<='\u337F')||(LA16_339>='\u3400' && LA16_339<='\u3D2D')||(LA16_339>='\u4E00' && LA16_339<='\u9FFF')||(LA16_339>='\uF900' && LA16_339<='\uFAFF')) ) {
                                                alt16=83;
                                            }
                                            else {
                                                alt16=61;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
            }
            else {
                alt16=83;}
        }
        else if ( (LA16_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA16_102 = input.LA(3);

                if ( (LA16_102=='l') ) {
                    int LA16_147 = input.LA(4);

                    if ( (LA16_147=='l') ) {
                        int LA16_194 = input.LA(5);

                        if ( (LA16_194=='$'||(LA16_194>='0' && LA16_194<='9')||(LA16_194>='A' && LA16_194<='Z')||LA16_194=='_'||(LA16_194>='a' && LA16_194<='z')||(LA16_194>='\u00C0' && LA16_194<='\u00D6')||(LA16_194>='\u00D8' && LA16_194<='\u00F6')||(LA16_194>='\u00F8' && LA16_194<='\u1FFF')||(LA16_194>='\u3040' && LA16_194<='\u318F')||(LA16_194>='\u3300' && LA16_194<='\u337F')||(LA16_194>='\u3400' && LA16_194<='\u3D2D')||(LA16_194>='\u4E00' && LA16_194<='\u9FFF')||(LA16_194>='\uF900' && LA16_194<='\uFAFF')) ) {
                            alt16=83;
                        }
                        else {
                            alt16=65;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'o':
                {
                int LA16_103 = input.LA(3);

                if ( (LA16_103=='t') ) {
                    int LA16_148 = input.LA(4);

                    if ( (LA16_148=='E') ) {
                        int LA16_195 = input.LA(5);

                        if ( (LA16_195=='x') ) {
                            int LA16_240 = input.LA(6);

                            if ( (LA16_240=='i') ) {
                                int LA16_274 = input.LA(7);

                                if ( (LA16_274=='s') ) {
                                    int LA16_307 = input.LA(8);

                                    if ( (LA16_307=='t') ) {
                                        int LA16_328 = input.LA(9);

                                        if ( (LA16_328=='s') ) {
                                            int LA16_340 = input.LA(10);

                                            if ( (LA16_340=='$'||(LA16_340>='0' && LA16_340<='9')||(LA16_340>='A' && LA16_340<='Z')||LA16_340=='_'||(LA16_340>='a' && LA16_340<='z')||(LA16_340>='\u00C0' && LA16_340<='\u00D6')||(LA16_340>='\u00D8' && LA16_340<='\u00F6')||(LA16_340>='\u00F8' && LA16_340<='\u1FFF')||(LA16_340>='\u3040' && LA16_340<='\u318F')||(LA16_340>='\u3300' && LA16_340<='\u337F')||(LA16_340>='\u3400' && LA16_340<='\u3D2D')||(LA16_340>='\u4E00' && LA16_340<='\u9FFF')||(LA16_340>='\uF900' && LA16_340<='\uFAFF')) ) {
                                                alt16=83;
                                            }
                                            else {
                                                alt16=72;}
                                        }
                                        else {
                                            alt16=83;}
                                    }
                                    else {
                                        alt16=83;}
                                }
                                else {
                                    alt16=83;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'e':
                {
                int LA16_104 = input.LA(3);

                if ( (LA16_104=='w') ) {
                    int LA16_149 = input.LA(4);

                    if ( (LA16_149=='$'||(LA16_149>='0' && LA16_149<='9')||(LA16_149>='A' && LA16_149<='Z')||LA16_149=='_'||(LA16_149>='a' && LA16_149<='z')||(LA16_149>='\u00C0' && LA16_149<='\u00D6')||(LA16_149>='\u00D8' && LA16_149<='\u00F6')||(LA16_149>='\u00F8' && LA16_149<='\u1FFF')||(LA16_149>='\u3040' && LA16_149<='\u318F')||(LA16_149>='\u3300' && LA16_149<='\u337F')||(LA16_149>='\u3400' && LA16_149<='\u3D2D')||(LA16_149>='\u4E00' && LA16_149<='\u9FFF')||(LA16_149>='\uF900' && LA16_149<='\uFAFF')) ) {
                        alt16=83;
                    }
                    else {
                        alt16=62;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA16_105 = input.LA(3);

                if ( (LA16_105=='r') ) {
                    int LA16_150 = input.LA(4);

                    if ( (LA16_150=='A') ) {
                        int LA16_197 = input.LA(5);

                        if ( (LA16_197=='l') ) {
                            int LA16_241 = input.LA(6);

                            if ( (LA16_241=='l') ) {
                                int LA16_275 = input.LA(7);

                                if ( (LA16_275=='$'||(LA16_275>='0' && LA16_275<='9')||(LA16_275>='A' && LA16_275<='Z')||LA16_275=='_'||(LA16_275>='a' && LA16_275<='z')||(LA16_275>='\u00C0' && LA16_275<='\u00D6')||(LA16_275>='\u00D8' && LA16_275<='\u00F6')||(LA16_275>='\u00F8' && LA16_275<='\u1FFF')||(LA16_275>='\u3040' && LA16_275<='\u318F')||(LA16_275>='\u3300' && LA16_275<='\u337F')||(LA16_275>='\u3400' && LA16_275<='\u3D2D')||(LA16_275>='\u4E00' && LA16_275<='\u9FFF')||(LA16_275>='\uF900' && LA16_275<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=74;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            case 'a':
                {
                int LA16_106 = input.LA(3);

                if ( (LA16_106=='l') ) {
                    int LA16_151 = input.LA(4);

                    if ( (LA16_151=='s') ) {
                        int LA16_198 = input.LA(5);

                        if ( (LA16_198=='e') ) {
                            int LA16_242 = input.LA(6);

                            if ( (LA16_242=='$'||(LA16_242>='0' && LA16_242<='9')||(LA16_242>='A' && LA16_242<='Z')||LA16_242=='_'||(LA16_242>='a' && LA16_242<='z')||(LA16_242>='\u00C0' && LA16_242<='\u00D6')||(LA16_242>='\u00D8' && LA16_242<='\u00F6')||(LA16_242>='\u00F8' && LA16_242<='\u1FFF')||(LA16_242>='\u3040' && LA16_242<='\u318F')||(LA16_242>='\u3300' && LA16_242<='\u337F')||(LA16_242>='\u3400' && LA16_242<='\u3D2D')||(LA16_242>='\u4E00' && LA16_242<='\u9FFF')||(LA16_242>='\uF900' && LA16_242<='\uFAFF')) ) {
                                alt16=83;
                            }
                            else {
                                alt16=63;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
                }
                break;
            default:
                alt16=83;}

        }
        else if ( (LA16_0=='r') ) {
            int LA16_38 = input.LA(2);

            if ( (LA16_38=='e') ) {
                int LA16_107 = input.LA(3);

                if ( (LA16_107=='j') ) {
                    int LA16_152 = input.LA(4);

                    if ( (LA16_152=='e') ) {
                        int LA16_199 = input.LA(5);

                        if ( (LA16_199=='c') ) {
                            int LA16_243 = input.LA(6);

                            if ( (LA16_243=='t') ) {
                                int LA16_277 = input.LA(7);

                                if ( (LA16_277=='$'||(LA16_277>='0' && LA16_277<='9')||(LA16_277>='A' && LA16_277<='Z')||LA16_277=='_'||(LA16_277>='a' && LA16_277<='z')||(LA16_277>='\u00C0' && LA16_277<='\u00D6')||(LA16_277>='\u00D8' && LA16_277<='\u00F6')||(LA16_277>='\u00F8' && LA16_277<='\u1FFF')||(LA16_277>='\u3040' && LA16_277<='\u318F')||(LA16_277>='\u3300' && LA16_277<='\u337F')||(LA16_277>='\u3400' && LA16_277<='\u3D2D')||(LA16_277>='\u4E00' && LA16_277<='\u9FFF')||(LA16_277>='\uF900' && LA16_277<='\uFAFF')) ) {
                                    alt16=83;
                                }
                                else {
                                    alt16=70;}
                            }
                            else {
                                alt16=83;}
                        }
                        else {
                            alt16=83;}
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
            }
            else {
                alt16=83;}
        }
        else if ( (LA16_0=='[') ) {
            alt16=79;
        }
        else if ( (LA16_0==']') ) {
            alt16=80;
        }
        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {
            alt16=81;
        }
        else if ( (LA16_0=='\"'||LA16_0=='\'') ) {
            alt16=82;
        }
        else if ( (LA16_0=='$'||LA16_0=='B'||LA16_0=='H'||(LA16_0>='J' && LA16_0<='K')||(LA16_0>='M' && LA16_0<='O')||LA16_0=='Q'||(LA16_0>='T' && LA16_0<='Z')||(LA16_0>='^' && LA16_0<='_')||(LA16_0>='a' && LA16_0<='b')||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='k')||LA16_0=='m'||(LA16_0>='o' && LA16_0<='q')||(LA16_0>='u' && LA16_0<='z')||(LA16_0>='\u00C0' && LA16_0<='\u00D6')||(LA16_0>='\u00D8' && LA16_0<='\u00F6')||(LA16_0>='\u00F8' && LA16_0<='\u1FFF')||(LA16_0>='\u3040' && LA16_0<='\u318F')||(LA16_0>='\u3300' && LA16_0<='\u337F')||(LA16_0>='\u3400' && LA16_0<='\u3D2D')||(LA16_0>='\u4E00' && LA16_0<='\u9FFF')||(LA16_0>='\uF900' && LA16_0<='\uFAFF')) ) {
            alt16=83;
        }
        else if ( (LA16_0=='R') ) {
            int LA16_44 = input.LA(2);

            if ( (LA16_44=='E') ) {
                int LA16_108 = input.LA(3);

                if ( (LA16_108=='M') ) {
                    int LA16_153 = input.LA(4);

                    if ( (LA16_153=='\u00BB') ) {
                        alt16=88;
                    }
                    else {
                        alt16=83;}
                }
                else {
                    alt16=83;}
            }
            else {
                alt16=83;}
        }
        else if ( ((LA16_0>='\t' && LA16_0<='\n')||(LA16_0>='\f' && LA16_0<='\r')||LA16_0==' ') ) {
            alt16=84;
        }
        else if ( (LA16_0=='\u00AB') ) {
            alt16=87;
        }
        else if ( (LA16_0=='\u00BB') ) {
            alt16=89;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | IntLiteral | StringLiteral | Identifier | WS | ML_COMMENT | LINE_COMMENT | LG | COMMENT | TEXT );", 16, 0, input);

            throw nvae;
        }
        switch (alt16) {
            case 1 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:10: T21
                {
                mT21(); 

                }
                break;
            case 2 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:14: T22
                {
                mT22(); 

                }
                break;
            case 3 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:18: T23
                {
                mT23(); 

                }
                break;
            case 4 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:22: T24
                {
                mT24(); 

                }
                break;
            case 5 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:26: T25
                {
                mT25(); 

                }
                break;
            case 6 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:30: T26
                {
                mT26(); 

                }
                break;
            case 7 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:34: T27
                {
                mT27(); 

                }
                break;
            case 8 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:38: T28
                {
                mT28(); 

                }
                break;
            case 9 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:42: T29
                {
                mT29(); 

                }
                break;
            case 10 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:46: T30
                {
                mT30(); 

                }
                break;
            case 11 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:50: T31
                {
                mT31(); 

                }
                break;
            case 12 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:54: T32
                {
                mT32(); 

                }
                break;
            case 13 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:58: T33
                {
                mT33(); 

                }
                break;
            case 14 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:62: T34
                {
                mT34(); 

                }
                break;
            case 15 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:66: T35
                {
                mT35(); 

                }
                break;
            case 16 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:70: T36
                {
                mT36(); 

                }
                break;
            case 17 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:74: T37
                {
                mT37(); 

                }
                break;
            case 18 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:78: T38
                {
                mT38(); 

                }
                break;
            case 19 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:82: T39
                {
                mT39(); 

                }
                break;
            case 20 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:86: T40
                {
                mT40(); 

                }
                break;
            case 21 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:90: T41
                {
                mT41(); 

                }
                break;
            case 22 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:94: T42
                {
                mT42(); 

                }
                break;
            case 23 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:98: T43
                {
                mT43(); 

                }
                break;
            case 24 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:102: T44
                {
                mT44(); 

                }
                break;
            case 25 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:106: T45
                {
                mT45(); 

                }
                break;
            case 26 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:110: T46
                {
                mT46(); 

                }
                break;
            case 27 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:114: T47
                {
                mT47(); 

                }
                break;
            case 28 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:118: T48
                {
                mT48(); 

                }
                break;
            case 29 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:122: T49
                {
                mT49(); 

                }
                break;
            case 30 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:126: T50
                {
                mT50(); 

                }
                break;
            case 31 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:130: T51
                {
                mT51(); 

                }
                break;
            case 32 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:134: T52
                {
                mT52(); 

                }
                break;
            case 33 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:138: T53
                {
                mT53(); 

                }
                break;
            case 34 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:142: T54
                {
                mT54(); 

                }
                break;
            case 35 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:146: T55
                {
                mT55(); 

                }
                break;
            case 36 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:150: T56
                {
                mT56(); 

                }
                break;
            case 37 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:154: T57
                {
                mT57(); 

                }
                break;
            case 38 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:158: T58
                {
                mT58(); 

                }
                break;
            case 39 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:162: T59
                {
                mT59(); 

                }
                break;
            case 40 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:166: T60
                {
                mT60(); 

                }
                break;
            case 41 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:170: T61
                {
                mT61(); 

                }
                break;
            case 42 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:174: T62
                {
                mT62(); 

                }
                break;
            case 43 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:178: T63
                {
                mT63(); 

                }
                break;
            case 44 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:182: T64
                {
                mT64(); 

                }
                break;
            case 45 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:186: T65
                {
                mT65(); 

                }
                break;
            case 46 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:190: T66
                {
                mT66(); 

                }
                break;
            case 47 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:194: T67
                {
                mT67(); 

                }
                break;
            case 48 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:198: T68
                {
                mT68(); 

                }
                break;
            case 49 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:202: T69
                {
                mT69(); 

                }
                break;
            case 50 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:206: T70
                {
                mT70(); 

                }
                break;
            case 51 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:210: T71
                {
                mT71(); 

                }
                break;
            case 52 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:214: T72
                {
                mT72(); 

                }
                break;
            case 53 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:218: T73
                {
                mT73(); 

                }
                break;
            case 54 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:222: T74
                {
                mT74(); 

                }
                break;
            case 55 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:226: T75
                {
                mT75(); 

                }
                break;
            case 56 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:230: T76
                {
                mT76(); 

                }
                break;
            case 57 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:234: T77
                {
                mT77(); 

                }
                break;
            case 58 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:238: T78
                {
                mT78(); 

                }
                break;
            case 59 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:242: T79
                {
                mT79(); 

                }
                break;
            case 60 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:246: T80
                {
                mT80(); 

                }
                break;
            case 61 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:250: T81
                {
                mT81(); 

                }
                break;
            case 62 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:254: T82
                {
                mT82(); 

                }
                break;
            case 63 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:258: T83
                {
                mT83(); 

                }
                break;
            case 64 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:262: T84
                {
                mT84(); 

                }
                break;
            case 65 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:266: T85
                {
                mT85(); 

                }
                break;
            case 66 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:270: T86
                {
                mT86(); 

                }
                break;
            case 67 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:274: T87
                {
                mT87(); 

                }
                break;
            case 68 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:278: T88
                {
                mT88(); 

                }
                break;
            case 69 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:282: T89
                {
                mT89(); 

                }
                break;
            case 70 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:286: T90
                {
                mT90(); 

                }
                break;
            case 71 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:290: T91
                {
                mT91(); 

                }
                break;
            case 72 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:294: T92
                {
                mT92(); 

                }
                break;
            case 73 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:298: T93
                {
                mT93(); 

                }
                break;
            case 74 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:302: T94
                {
                mT94(); 

                }
                break;
            case 75 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:306: T95
                {
                mT95(); 

                }
                break;
            case 76 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:310: T96
                {
                mT96(); 

                }
                break;
            case 77 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:314: T97
                {
                mT97(); 

                }
                break;
            case 78 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:318: T98
                {
                mT98(); 

                }
                break;
            case 79 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:322: T99
                {
                mT99(); 

                }
                break;
            case 80 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:326: T100
                {
                mT100(); 

                }
                break;
            case 81 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:331: IntLiteral
                {
                mIntLiteral(); 

                }
                break;
            case 82 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:342: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 83 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:356: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 84 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:367: WS
                {
                mWS(); 

                }
                break;
            case 85 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:370: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 86 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:381: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 87 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:394: LG
                {
                mLG(); 

                }
                break;
            case 88 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:397: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 89 :
                // src/org/eclipse/internal/xpand2/parser/Xpand.g:1:405: TEXT
                {
                mTEXT(); 

                }
                break;

        }

    }


 

}