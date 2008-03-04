// $ANTLR 3.0.1 src/org/eclipse/xpand3/parser/Xpand3.g 2008-02-28 17:18:32
 	
package org.eclipse.xpand3.parser; 


import org.antlr.runtime.CharStream;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;

public class Xpand3Lexer extends Lexer {
    public static final int T29=29;
    public static final int HexDigit=17;
    public static final int T70=70;
    public static final int T74=74;
    public static final int REM_COMMENT=24;
    public static final int T85=85;
    public static final int T102=102;
    public static final int Letter=18;
    public static final int T103=103;
    public static final int T32=32;
    public static final int T81=81;
    public static final int T41=41;
    public static final int LG=4;
    public static final int T62=62;
    public static final int T109=109;
    public static final int T68=68;
    public static final int T73=73;
    public static final int T84=84;
    public static final int T33=33;
    public static final int Identifier=13;
    public static final int T78=78;
    public static final int WS=20;
    public static final int T42=42;
    public static final int RG=5;
    public static final int T96=96;
    public static final int T71=71;
    public static final int LINE_COMMENT=22;
    public static final int T72=72;
    public static final int T94=94;
    public static final int T76=76;
    public static final int UnicodeEscape=15;
    public static final int T75=75;
    public static final int T89=89;
    public static final int T67=67;
    public static final int TEXT=10;
    public static final int ENDAROUND=9;
    public static final int T31=31;
    public static final int T60=60;
    public static final int T82=82;
    public static final int T100=100;
    public static final int T49=49;
    public static final int T30=30;
    public static final int T79=79;
    public static final int IntLiteral=12;
    public static final int T36=36;
    public static final int T58=58;
    public static final int T93=93;
    public static final int T35=35;
    public static final int T107=107;
    public static final int T83=83;
    public static final int T61=61;
    public static final int T45=45;
    public static final int T34=34;
    public static final int T101=101;
    public static final int T64=64;
    public static final int T25=25;
    public static final int T91=91;
    public static final int T105=105;
    public static final int T37=37;
    public static final int T86=86;
    public static final int EscapeSequence=14;
    public static final int T26=26;
    public static final int T51=51;
    public static final int T111=111;
    public static final int T46=46;
    public static final int T77=77;
    public static final int T38=38;
    public static final int T106=106;
    public static final int T69=69;
    public static final int T39=39;
    public static final int T44=44;
    public static final int T55=55;
    public static final int T95=95;
    public static final int T50=50;
    public static final int T110=110;
    public static final int T108=108;
    public static final int T92=92;
    public static final int T43=43;
    public static final int ENDDEFINE=7;
    public static final int T28=28;
    public static final int T40=40;
    public static final int T66=66;
    public static final int COMMENT=21;
    public static final int T88=88;
    public static final int StringLiteral=11;
    public static final int T63=63;
    public static final int T57=57;
    public static final int T65=65;
    public static final int T98=98;
    public static final int T56=56;
    public static final int T87=87;
    public static final int T80=80;
    public static final int JavaIDDigit=19;
    public static final int DEFINE=6;
    public static final int T59=59;
    public static final int T97=97;
    public static final int T48=48;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T104=104;
    public static final int T47=47;
    public static final int Tokens=112;
    public static final int T53=53;
    public static final int OctalEscape=16;
    public static final int T99=99;
    public static final int T27=27;
    public static final int REM_COMMENT_OUT=23;
    public static final int T52=52;
    public static final int T90=90;
    public static final int AROUND=8;

       private boolean xpandMode = false;

    public Xpand3Lexer() {;} 
    public Xpand3Lexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "src/org/eclipse/xpand3/parser/Xpand3.g"; }

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // src/org/eclipse/xpand3/parser/Xpand3.g:9:5: ( 'IMPORT' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:9:7: 'IMPORT'
            {
            match("IMPORT"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:10:5: ( 'EXTENSION' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:10:7: 'EXTENSION'
            {
            match("EXTENSION"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:11:5: ( 'import' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:11:7: 'import'
            {
            match("import"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:12:5: ( ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:12:7: ';'
            {
            match(';'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:13:5: ( 'extension' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:13:7: 'extension'
            {
            match("extension"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:14:5: ( 'reexport' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:14:7: 'reexport'
            {
            match("reexport"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:15:5: ( '(' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:15:7: '('
            {
            match('('); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:16:5: ( ',' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:16:7: ','
            {
            match(','); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:17:5: ( '*' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:17:7: '*'
            {
            match('*'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:18:5: ( ')' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:18:7: ')'
            {
            match(')'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:19:5: ( 'FOR' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:19:7: 'FOR'
            {
            match("FOR"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:20:5: ( '-' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:20:7: '-'
            {
            match('-'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:21:5: ( 'ERROR' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:21:7: 'ERROR'
            {
            match("ERROR"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:22:5: ( 'EXPAND' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:22:7: 'EXPAND'
            {
            match("EXPAND"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:23:5: ( 'FOREACH' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:23:7: 'FOREACH'
            {
            match("FOREACH"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:24:5: ( 'SEPARATOR' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:24:7: 'SEPARATOR'
            {
            match("SEPARATOR"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:25:5: ( 'FILE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:25:7: 'FILE'
            {
            match("FILE"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:26:5: ( 'ENDFILE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:26:7: 'ENDFILE'
            {
            match("ENDFILE"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:27:5: ( 'AS' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:27:7: 'AS'
            {
            match("AS"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:28:5: ( 'ITERATOR' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:28:7: 'ITERATOR'
            {
            match("ITERATOR"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:29:5: ( 'ENDFOREACH' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:29:7: 'ENDFOREACH'
            {
            match("ENDFOREACH"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:30:5: ( 'IF' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:30:7: 'IF'
            {
            match("IF"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:31:5: ( 'ENDIF' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:31:7: 'ENDIF'
            {
            match("ENDIF"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:32:5: ( 'ELSEIF' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:32:7: 'ELSEIF'
            {
            match("ELSEIF"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:33:5: ( 'ELSE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:33:7: 'ELSE'
            {
            match("ELSE"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:34:5: ( 'LET' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:34:7: 'LET'
            {
            match("LET"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:35:5: ( 'ENDLET' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:35:7: 'ENDLET'
            {
            match("ENDLET"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:36:5: ( 'PROTECT' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:36:7: 'PROTECT'
            {
            match("PROTECT"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:37:5: ( 'CSTART' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:37:7: 'CSTART'
            {
            match("CSTART"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:38:5: ( 'CEND' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:38:7: 'CEND'
            {
            match("CEND"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:39:5: ( 'ID' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:39:7: 'ID'
            {
            match("ID"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:40:5: ( 'DISABLE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:40:7: 'DISABLE'
            {
            match("DISABLE"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:41:5: ( 'ENDPROTECT' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:41:7: 'ENDPROTECT'
            {
            match("ENDPROTECT"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:42:5: ( 'context' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:42:7: 'context'
            {
            match("context"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:43:5: ( 'if' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:43:7: 'if'
            {
            match("if"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:44:5: ( 'WARNING' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:44:7: 'WARNING'
            {
            match("WARNING"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:45:5: ( ':' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:45:7: ':'
            {
            match(':'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:46:5: ( 'around' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:46:7: 'around'
            {
            match("around"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:47:5: ( '::' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:47:7: '::'
            {
            match("::"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:48:5: ( 'private' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:48:7: 'private'
            {
            match("private"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:49:5: ( 'cached' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:49:7: 'cached'
            {
            match("cached"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:50:5: ( 'create' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:50:7: 'create'
            {
            match("create"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:51:5: ( 'JAVA' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:51:7: 'JAVA'
            {
            match("JAVA"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:52:5: ( '.' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:52:7: '.'
            {
            match('.'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:53:5: ( 'Collection' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:53:7: 'Collection'
            {
            match("Collection"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:54:5: ( 'List' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:54:7: 'List'
            {
            match("List"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:55:5: ( 'Set' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:55:7: 'Set'
            {
            match("Set"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:56:5: ( 'let' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:56:7: 'let'
            {
            match("let"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:57:5: ( '=' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:57:7: '='
            {
            match('='); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:58:5: ( '->' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:58:7: '->'
            {
            match("->"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:59:5: ( '?' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:59:7: '?'
            {
            match('?'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:60:5: ( 'then' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:60:7: 'then'
            {
            match("then"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:61:5: ( 'else' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:61:7: 'else'
            {
            match("else"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:62:5: ( 'switch' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:62:7: 'switch'
            {
            match("switch"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:63:5: ( '{' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:63:7: '{'
            {
            match('{'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:64:5: ( 'default' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:64:7: 'default'
            {
            match("default"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:65:5: ( '}' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:65:7: '}'
            {
            match('}'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:66:5: ( 'case' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:66:7: 'case'
            {
            match("case"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:67:5: ( '||' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:67:7: '||'
            {
            match("||"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:68:5: ( '&&' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:68:7: '&&'
            {
            match("&&"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:69:5: ( 'implies' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:69:7: 'implies'
            {
            match("implies"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:70:5: ( '==' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:70:7: '=='
            {
            match("=="); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:71:5: ( '!=' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:71:7: '!='
            {
            match("!="); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:72:5: ( '>=' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:72:7: '>='
            {
            match(">="); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:73:5: ( '<=' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:73:7: '<='
            {
            match("<="); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:74:5: ( '>' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:74:7: '>'
            {
            match('>'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:75:5: ( '<' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:75:7: '<'
            {
            match('<'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:76:5: ( '+' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:76:7: '+'
            {
            match('+'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:77:5: ( '/' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:77:7: '/'
            {
            match('/'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:78:5: ( '!' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:78:7: '!'
            {
            match('!'); 

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
            // src/org/eclipse/xpand3/parser/Xpand3.g:79:5: ( 'GLOBALVAR' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:79:7: 'GLOBALVAR'
            {
            match("GLOBALVAR"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:80:5: ( 'new' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:80:7: 'new'
            {
            match("new"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:81:5: ( 'false' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:81:7: 'false'
            {
            match("false"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:82:5: ( 'true' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:82:7: 'true'
            {
            match("true"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:83:5: ( 'null' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:83:7: 'null'
            {
            match("null"); 


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
            // src/org/eclipse/xpand3/parser/Xpand3.g:84:6: ( 'typeSelect' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:84:8: 'typeSelect'
            {
            match("typeSelect"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T100

    // $ANTLR start T101
    public final void mT101() throws RecognitionException {
        try {
            int _type = T101;
            // src/org/eclipse/xpand3/parser/Xpand3.g:85:6: ( 'collect' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:85:8: 'collect'
            {
            match("collect"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T101

    // $ANTLR start T102
    public final void mT102() throws RecognitionException {
        try {
            int _type = T102;
            // src/org/eclipse/xpand3/parser/Xpand3.g:86:6: ( 'select' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:86:8: 'select'
            {
            match("select"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T102

    // $ANTLR start T103
    public final void mT103() throws RecognitionException {
        try {
            int _type = T103;
            // src/org/eclipse/xpand3/parser/Xpand3.g:87:6: ( 'selectFirst' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:87:8: 'selectFirst'
            {
            match("selectFirst"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T103

    // $ANTLR start T104
    public final void mT104() throws RecognitionException {
        try {
            int _type = T104;
            // src/org/eclipse/xpand3/parser/Xpand3.g:88:6: ( 'reject' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:88:8: 'reject'
            {
            match("reject"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T104

    // $ANTLR start T105
    public final void mT105() throws RecognitionException {
        try {
            int _type = T105;
            // src/org/eclipse/xpand3/parser/Xpand3.g:89:6: ( 'exists' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:89:8: 'exists'
            {
            match("exists"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T105

    // $ANTLR start T106
    public final void mT106() throws RecognitionException {
        try {
            int _type = T106;
            // src/org/eclipse/xpand3/parser/Xpand3.g:90:6: ( 'notExists' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:90:8: 'notExists'
            {
            match("notExists"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T106

    // $ANTLR start T107
    public final void mT107() throws RecognitionException {
        try {
            int _type = T107;
            // src/org/eclipse/xpand3/parser/Xpand3.g:91:6: ( 'sortBy' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:91:8: 'sortBy'
            {
            match("sortBy"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T107

    // $ANTLR start T108
    public final void mT108() throws RecognitionException {
        try {
            int _type = T108;
            // src/org/eclipse/xpand3/parser/Xpand3.g:92:6: ( 'forAll' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:92:8: 'forAll'
            {
            match("forAll"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T108

    // $ANTLR start T109
    public final void mT109() throws RecognitionException {
        try {
            int _type = T109;
            // src/org/eclipse/xpand3/parser/Xpand3.g:93:6: ( '|' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:93:8: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T109

    // $ANTLR start T110
    public final void mT110() throws RecognitionException {
        try {
            int _type = T110;
            // src/org/eclipse/xpand3/parser/Xpand3.g:94:6: ( '[' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:94:8: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T110

    // $ANTLR start T111
    public final void mT111() throws RecognitionException {
        try {
            int _type = T111;
            // src/org/eclipse/xpand3/parser/Xpand3.g:95:6: ( ']' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:95:8: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T111

    // $ANTLR start IntLiteral
    public final void mIntLiteral() throws RecognitionException {
        try {
            int _type = IntLiteral;
            // src/org/eclipse/xpand3/parser/Xpand3.g:357:12: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // src/org/eclipse/xpand3/parser/Xpand3.g:357:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:357:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    new NoViableAltException("357:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:357:15: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:357:21: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:357:30: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:357:30: '0' .. '9'
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
            // src/org/eclipse/xpand3/parser/Xpand3.g:360:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
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
                    new NoViableAltException("359:1: StringLiteral : ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:360:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:360:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
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
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:360:14: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:360:31: ~ ( '\\\\' | '\"' )
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
                    // src/org/eclipse/xpand3/parser/Xpand3.g:361:8: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
                    {
                    match('\''); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:361:13: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
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
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:361:15: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:361:32: ~ ( '\\'' | '\\\\' )
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
            // src/org/eclipse/xpand3/parser/Xpand3.g:366:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
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
                        new NoViableAltException("364:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("364:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:366:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // src/org/eclipse/xpand3/parser/Xpand3.g:367:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:368:9: OctalEscape
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
            // src/org/eclipse/xpand3/parser/Xpand3.g:373:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                        new NoViableAltException("371:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("371:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:373:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:373:14: ( '0' .. '3' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:373:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // src/org/eclipse/xpand3/parser/Xpand3.g:373:25: ( '0' .. '7' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:373:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // src/org/eclipse/xpand3/parser/Xpand3.g:373:36: ( '0' .. '7' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:373:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:374:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:374:14: ( '0' .. '7' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:374:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // src/org/eclipse/xpand3/parser/Xpand3.g:374:25: ( '0' .. '7' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:374:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:375:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:375:14: ( '0' .. '7' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:375:15: '0' .. '7'
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
            // src/org/eclipse/xpand3/parser/Xpand3.g:380:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // src/org/eclipse/xpand3/parser/Xpand3.g:380:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
            // src/org/eclipse/xpand3/parser/Xpand3.g:383:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // src/org/eclipse/xpand3/parser/Xpand3.g:383:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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

    // $ANTLR start DEFINE
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            // src/org/eclipse/xpand3/parser/Xpand3.g:386:9: ( 'DEFINE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:386:11: 'DEFINE'
            {
            xpandMode=true;
            match("DEFINE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DEFINE

    // $ANTLR start ENDDEFINE
    public final void mENDDEFINE() throws RecognitionException {
        try {
            int _type = ENDDEFINE;
            // src/org/eclipse/xpand3/parser/Xpand3.g:388:2: ( 'ENDDEFINE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:388:4: 'ENDDEFINE'
            {
            match("ENDDEFINE"); 

            xpandMode=false;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ENDDEFINE

    // $ANTLR start AROUND
    public final void mAROUND() throws RecognitionException {
        try {
            int _type = AROUND;
            // src/org/eclipse/xpand3/parser/Xpand3.g:390:9: ( 'AROUND' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:390:11: 'AROUND'
            {
            xpandMode=true;
            match("AROUND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AROUND

    // $ANTLR start ENDAROUND
    public final void mENDAROUND() throws RecognitionException {
        try {
            int _type = ENDAROUND;
            // src/org/eclipse/xpand3/parser/Xpand3.g:391:11: ( 'ENDAROUND' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:391:13: 'ENDAROUND'
            {
            match("ENDAROUND"); 

            xpandMode=false;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ENDAROUND

    // $ANTLR start Identifier
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            // src/org/eclipse/xpand3/parser/Xpand3.g:394:5: ( ( '^' )? Letter ( Letter | JavaIDDigit )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:394:9: ( '^' )? Letter ( Letter | JavaIDDigit )*
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:394:9: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:394:10: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            mLetter(); 
            // src/org/eclipse/xpand3/parser/Xpand3.g:394:23: ( Letter | JavaIDDigit )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')||(LA9_0>='\u00C0' && LA9_0<='\u00D6')||(LA9_0>='\u00D8' && LA9_0<='\u00F6')||(LA9_0>='\u00F8' && LA9_0<='\u1FFF')||(LA9_0>='\u3040' && LA9_0<='\u318F')||(LA9_0>='\u3300' && LA9_0<='\u337F')||(LA9_0>='\u3400' && LA9_0<='\u3D2D')||(LA9_0>='\u4E00' && LA9_0<='\u9FFF')||(LA9_0>='\uF900' && LA9_0<='\uFAFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:
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
            // src/org/eclipse/xpand3/parser/Xpand3.g:399:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:
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
            // src/org/eclipse/xpand3/parser/Xpand3.g:416:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:
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
            // src/org/eclipse/xpand3/parser/Xpand3.g:433:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // src/org/eclipse/xpand3/parser/Xpand3.g:433:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // src/org/eclipse/xpand3/parser/Xpand3.g:437:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:437:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // src/org/eclipse/xpand3/parser/Xpand3.g:437:14: ( options {greedy=false; } : . )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:437:42: .
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
    // $ANTLR end COMMENT

    // $ANTLR start LINE_COMMENT
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            // src/org/eclipse/xpand3/parser/Xpand3.g:441:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF ) )
            // src/org/eclipse/xpand3/parser/Xpand3.g:441:7: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF )
            {
            match("//"); 

            // src/org/eclipse/xpand3/parser/Xpand3.g:441:12: (~ ( '\\n' | '\\r' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:441:12: ~ ( '\\n' | '\\r' )
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

            // src/org/eclipse/xpand3/parser/Xpand3.g:441:26: ( ( '\\r' )? '\\n' | EOF )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            else {
                alt13=2;}
            switch (alt13) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:441:27: ( '\\r' )? '\\n'
                    {
                    // src/org/eclipse/xpand3/parser/Xpand3.g:441:27: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:441:27: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:441:38: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_COMMENT

    // $ANTLR start REM_COMMENT_OUT
    public final void mREM_COMMENT_OUT() throws RecognitionException {
        try {
            int _type = REM_COMMENT_OUT;
            // src/org/eclipse/xpand3/parser/Xpand3.g:446:2: ({...}? => LG 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' RG )
            // src/org/eclipse/xpand3/parser/Xpand3.g:446:4: {...}? => LG 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' RG
            {
            if ( !(!xpandMode) ) {
                throw new FailedPredicateException(input, "REM_COMMENT_OUT", "!xpandMode");
            }
            mLG(); 
            match("REM"); 

            mRG(); 
            // src/org/eclipse/xpand3/parser/Xpand3.g:446:32: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\u00AB') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='E') ) {
                        int LA14_3 = input.LA(3);

                        if ( (LA14_3=='N') ) {
                            int LA14_4 = input.LA(4);

                            if ( (LA14_4=='D') ) {
                                int LA14_5 = input.LA(5);

                                if ( (LA14_5=='R') ) {
                                    int LA14_6 = input.LA(6);

                                    if ( (LA14_6=='E') ) {
                                        int LA14_7 = input.LA(7);

                                        if ( (LA14_7=='M') ) {
                                            int LA14_8 = input.LA(8);

                                            if ( (LA14_8=='\u00BB') ) {
                                                alt14=2;
                                            }
                                            else if ( ((LA14_8>='\u0000' && LA14_8<='\u00BA')||(LA14_8>='\u00BC' && LA14_8<='\uFFFE')) ) {
                                                alt14=1;
                                            }


                                        }
                                        else if ( ((LA14_7>='\u0000' && LA14_7<='L')||(LA14_7>='N' && LA14_7<='\uFFFE')) ) {
                                            alt14=1;
                                        }


                                    }
                                    else if ( ((LA14_6>='\u0000' && LA14_6<='D')||(LA14_6>='F' && LA14_6<='\uFFFE')) ) {
                                        alt14=1;
                                    }


                                }
                                else if ( ((LA14_5>='\u0000' && LA14_5<='Q')||(LA14_5>='S' && LA14_5<='\uFFFE')) ) {
                                    alt14=1;
                                }


                            }
                            else if ( ((LA14_4>='\u0000' && LA14_4<='C')||(LA14_4>='E' && LA14_4<='\uFFFE')) ) {
                                alt14=1;
                            }


                        }
                        else if ( ((LA14_3>='\u0000' && LA14_3<='M')||(LA14_3>='O' && LA14_3<='\uFFFE')) ) {
                            alt14=1;
                        }


                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='D')||(LA14_1>='F' && LA14_1<='\uFFFE')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='\u00AA')||(LA14_0>='\u00AC' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:446:60: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("\u00ABENDREM"); 

            mRG(); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end REM_COMMENT_OUT

    // $ANTLR start REM_COMMENT
    public final void mREM_COMMENT() throws RecognitionException {
        try {
            int _type = REM_COMMENT;
            // src/org/eclipse/xpand3/parser/Xpand3.g:449:13: ({...}? => 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:450:2: {...}? => 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM'
            {
            if ( !(xpandMode) ) {
                throw new FailedPredicateException(input, "REM_COMMENT", "xpandMode");
            }
            match("REM"); 

            mRG(); 
            // src/org/eclipse/xpand3/parser/Xpand3.g:450:26: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\u00AB') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='E') ) {
                        int LA15_3 = input.LA(3);

                        if ( (LA15_3=='N') ) {
                            int LA15_4 = input.LA(4);

                            if ( (LA15_4=='D') ) {
                                int LA15_5 = input.LA(5);

                                if ( (LA15_5=='R') ) {
                                    int LA15_6 = input.LA(6);

                                    if ( (LA15_6=='E') ) {
                                        int LA15_7 = input.LA(7);

                                        if ( (LA15_7=='M') ) {
                                            alt15=2;
                                        }
                                        else if ( ((LA15_7>='\u0000' && LA15_7<='L')||(LA15_7>='N' && LA15_7<='\uFFFE')) ) {
                                            alt15=1;
                                        }


                                    }
                                    else if ( ((LA15_6>='\u0000' && LA15_6<='D')||(LA15_6>='F' && LA15_6<='\uFFFE')) ) {
                                        alt15=1;
                                    }


                                }
                                else if ( ((LA15_5>='\u0000' && LA15_5<='Q')||(LA15_5>='S' && LA15_5<='\uFFFE')) ) {
                                    alt15=1;
                                }


                            }
                            else if ( ((LA15_4>='\u0000' && LA15_4<='C')||(LA15_4>='E' && LA15_4<='\uFFFE')) ) {
                                alt15=1;
                            }


                        }
                        else if ( ((LA15_3>='\u0000' && LA15_3<='M')||(LA15_3>='O' && LA15_3<='\uFFFE')) ) {
                            alt15=1;
                        }


                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='D')||(LA15_1>='F' && LA15_1<='\uFFFE')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='\u00AA')||(LA15_0>='\u00AC' && LA15_0<='\uFFFE')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:450:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("\u00ABENDREM"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end REM_COMMENT

    // $ANTLR start TEXT
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            // src/org/eclipse/xpand3/parser/Xpand3.g:454:6: ({...}? => RG (~ ( LG ) )* ( LG )? )
            // src/org/eclipse/xpand3/parser/Xpand3.g:455:3: {...}? => RG (~ ( LG ) )* ( LG )?
            {
            if ( !(xpandMode) ) {
                throw new FailedPredicateException(input, "TEXT", "xpandMode");
            }
            mRG(); 
            // src/org/eclipse/xpand3/parser/Xpand3.g:455:21: (~ ( LG ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\u00AA')||(LA16_0>='\u00AC' && LA16_0<='\uFFFE')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:455:21: ~ ( LG )
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
            	    break loop16;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:455:28: ( LG )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\u00AB') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:455:29: LG
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

    // $ANTLR start LG
    public final void mLG() throws RecognitionException {
        try {
            int _type = LG;
            // src/org/eclipse/xpand3/parser/Xpand3.g:459:2: ( '\\u00AB' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:459:4: '\\u00AB'
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
            int _type = RG;
            // src/org/eclipse/xpand3/parser/Xpand3.g:461:2: ( '\\u00BB' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:461:4: '\\u00BB'
            {
            match('\u00BB'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RG

    public void mTokens() throws RecognitionException {
        // src/org/eclipse/xpand3/parser/Xpand3.g:1:8: ( T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | IntLiteral | StringLiteral | DEFINE | ENDDEFINE | AROUND | ENDAROUND | Identifier | WS | COMMENT | LINE_COMMENT | REM_COMMENT_OUT | REM_COMMENT | TEXT | LG | RG )
        int alt18=102;
        int LA18_0 = input.LA(1);

        if ( (LA18_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'F':
                {
                int LA18_53 = input.LA(3);

                if ( (LA18_53=='$'||(LA18_53>='0' && LA18_53<='9')||(LA18_53>='A' && LA18_53<='Z')||LA18_53=='_'||(LA18_53>='a' && LA18_53<='z')||(LA18_53>='\u00C0' && LA18_53<='\u00D6')||(LA18_53>='\u00D8' && LA18_53<='\u00F6')||(LA18_53>='\u00F8' && LA18_53<='\u1FFF')||(LA18_53>='\u3040' && LA18_53<='\u318F')||(LA18_53>='\u3300' && LA18_53<='\u337F')||(LA18_53>='\u3400' && LA18_53<='\u3D2D')||(LA18_53>='\u4E00' && LA18_53<='\u9FFF')||(LA18_53>='\uF900' && LA18_53<='\uFAFF')) ) {
                    alt18=94;
                }
                else {
                    alt18=22;}
                }
                break;
            case 'D':
                {
                int LA18_54 = input.LA(3);

                if ( (LA18_54=='$'||(LA18_54>='0' && LA18_54<='9')||(LA18_54>='A' && LA18_54<='Z')||LA18_54=='_'||(LA18_54>='a' && LA18_54<='z')||(LA18_54>='\u00C0' && LA18_54<='\u00D6')||(LA18_54>='\u00D8' && LA18_54<='\u00F6')||(LA18_54>='\u00F8' && LA18_54<='\u1FFF')||(LA18_54>='\u3040' && LA18_54<='\u318F')||(LA18_54>='\u3300' && LA18_54<='\u337F')||(LA18_54>='\u3400' && LA18_54<='\u3D2D')||(LA18_54>='\u4E00' && LA18_54<='\u9FFF')||(LA18_54>='\uF900' && LA18_54<='\uFAFF')) ) {
                    alt18=94;
                }
                else {
                    alt18=31;}
                }
                break;
            case 'T':
                {
                int LA18_55 = input.LA(3);

                if ( (LA18_55=='E') ) {
                    int LA18_125 = input.LA(4);

                    if ( (LA18_125=='R') ) {
                        int LA18_178 = input.LA(5);

                        if ( (LA18_178=='A') ) {
                            int LA18_235 = input.LA(6);

                            if ( (LA18_235=='T') ) {
                                int LA18_288 = input.LA(7);

                                if ( (LA18_288=='O') ) {
                                    int LA18_331 = input.LA(8);

                                    if ( (LA18_331=='R') ) {
                                        int LA18_372 = input.LA(9);

                                        if ( (LA18_372=='$'||(LA18_372>='0' && LA18_372<='9')||(LA18_372>='A' && LA18_372<='Z')||LA18_372=='_'||(LA18_372>='a' && LA18_372<='z')||(LA18_372>='\u00C0' && LA18_372<='\u00D6')||(LA18_372>='\u00D8' && LA18_372<='\u00F6')||(LA18_372>='\u00F8' && LA18_372<='\u1FFF')||(LA18_372>='\u3040' && LA18_372<='\u318F')||(LA18_372>='\u3300' && LA18_372<='\u337F')||(LA18_372>='\u3400' && LA18_372<='\u3D2D')||(LA18_372>='\u4E00' && LA18_372<='\u9FFF')||(LA18_372>='\uF900' && LA18_372<='\uFAFF')) ) {
                                            alt18=94;
                                        }
                                        else {
                                            alt18=20;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'M':
                {
                int LA18_56 = input.LA(3);

                if ( (LA18_56=='P') ) {
                    int LA18_126 = input.LA(4);

                    if ( (LA18_126=='O') ) {
                        int LA18_179 = input.LA(5);

                        if ( (LA18_179=='R') ) {
                            int LA18_236 = input.LA(6);

                            if ( (LA18_236=='T') ) {
                                int LA18_289 = input.LA(7);

                                if ( (LA18_289=='$'||(LA18_289>='0' && LA18_289<='9')||(LA18_289>='A' && LA18_289<='Z')||LA18_289=='_'||(LA18_289>='a' && LA18_289<='z')||(LA18_289>='\u00C0' && LA18_289<='\u00D6')||(LA18_289>='\u00D8' && LA18_289<='\u00F6')||(LA18_289>='\u00F8' && LA18_289<='\u1FFF')||(LA18_289>='\u3040' && LA18_289<='\u318F')||(LA18_289>='\u3300' && LA18_289<='\u337F')||(LA18_289>='\u3400' && LA18_289<='\u3D2D')||(LA18_289>='\u4E00' && LA18_289<='\u9FFF')||(LA18_289>='\uF900' && LA18_289<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=1;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='E') ) {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA18_57 = input.LA(3);

                if ( (LA18_57=='D') ) {
                    switch ( input.LA(4) ) {
                    case 'P':
                        {
                        int LA18_180 = input.LA(5);

                        if ( (LA18_180=='R') ) {
                            int LA18_237 = input.LA(6);

                            if ( (LA18_237=='O') ) {
                                int LA18_290 = input.LA(7);

                                if ( (LA18_290=='T') ) {
                                    int LA18_333 = input.LA(8);

                                    if ( (LA18_333=='E') ) {
                                        int LA18_373 = input.LA(9);

                                        if ( (LA18_373=='C') ) {
                                            int LA18_397 = input.LA(10);

                                            if ( (LA18_397=='T') ) {
                                                int LA18_410 = input.LA(11);

                                                if ( (LA18_410=='$'||(LA18_410>='0' && LA18_410<='9')||(LA18_410>='A' && LA18_410<='Z')||LA18_410=='_'||(LA18_410>='a' && LA18_410<='z')||(LA18_410>='\u00C0' && LA18_410<='\u00D6')||(LA18_410>='\u00D8' && LA18_410<='\u00F6')||(LA18_410>='\u00F8' && LA18_410<='\u1FFF')||(LA18_410>='\u3040' && LA18_410<='\u318F')||(LA18_410>='\u3300' && LA18_410<='\u337F')||(LA18_410>='\u3400' && LA18_410<='\u3D2D')||(LA18_410>='\u4E00' && LA18_410<='\u9FFF')||(LA18_410>='\uF900' && LA18_410<='\uFAFF')) ) {
                                                    alt18=94;
                                                }
                                                else {
                                                    alt18=33;}
                                            }
                                            else {
                                                alt18=94;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                        }
                        break;
                    case 'D':
                        {
                        int LA18_181 = input.LA(5);

                        if ( (LA18_181=='E') ) {
                            int LA18_238 = input.LA(6);

                            if ( (LA18_238=='F') ) {
                                int LA18_291 = input.LA(7);

                                if ( (LA18_291=='I') ) {
                                    int LA18_334 = input.LA(8);

                                    if ( (LA18_334=='N') ) {
                                        int LA18_374 = input.LA(9);

                                        if ( (LA18_374=='E') ) {
                                            int LA18_398 = input.LA(10);

                                            if ( (LA18_398=='$'||(LA18_398>='0' && LA18_398<='9')||(LA18_398>='A' && LA18_398<='Z')||LA18_398=='_'||(LA18_398>='a' && LA18_398<='z')||(LA18_398>='\u00C0' && LA18_398<='\u00D6')||(LA18_398>='\u00D8' && LA18_398<='\u00F6')||(LA18_398>='\u00F8' && LA18_398<='\u1FFF')||(LA18_398>='\u3040' && LA18_398<='\u318F')||(LA18_398>='\u3300' && LA18_398<='\u337F')||(LA18_398>='\u3400' && LA18_398<='\u3D2D')||(LA18_398>='\u4E00' && LA18_398<='\u9FFF')||(LA18_398>='\uF900' && LA18_398<='\uFAFF')) ) {
                                                alt18=94;
                                            }
                                            else {
                                                alt18=91;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                        }
                        break;
                    case 'L':
                        {
                        int LA18_182 = input.LA(5);

                        if ( (LA18_182=='E') ) {
                            int LA18_239 = input.LA(6);

                            if ( (LA18_239=='T') ) {
                                int LA18_292 = input.LA(7);

                                if ( (LA18_292=='$'||(LA18_292>='0' && LA18_292<='9')||(LA18_292>='A' && LA18_292<='Z')||LA18_292=='_'||(LA18_292>='a' && LA18_292<='z')||(LA18_292>='\u00C0' && LA18_292<='\u00D6')||(LA18_292>='\u00D8' && LA18_292<='\u00F6')||(LA18_292>='\u00F8' && LA18_292<='\u1FFF')||(LA18_292>='\u3040' && LA18_292<='\u318F')||(LA18_292>='\u3300' && LA18_292<='\u337F')||(LA18_292>='\u3400' && LA18_292<='\u3D2D')||(LA18_292>='\u4E00' && LA18_292<='\u9FFF')||(LA18_292>='\uF900' && LA18_292<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=27;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                        }
                        break;
                    case 'A':
                        {
                        int LA18_183 = input.LA(5);

                        if ( (LA18_183=='R') ) {
                            int LA18_240 = input.LA(6);

                            if ( (LA18_240=='O') ) {
                                int LA18_293 = input.LA(7);

                                if ( (LA18_293=='U') ) {
                                    int LA18_336 = input.LA(8);

                                    if ( (LA18_336=='N') ) {
                                        int LA18_375 = input.LA(9);

                                        if ( (LA18_375=='D') ) {
                                            int LA18_399 = input.LA(10);

                                            if ( (LA18_399=='$'||(LA18_399>='0' && LA18_399<='9')||(LA18_399>='A' && LA18_399<='Z')||LA18_399=='_'||(LA18_399>='a' && LA18_399<='z')||(LA18_399>='\u00C0' && LA18_399<='\u00D6')||(LA18_399>='\u00D8' && LA18_399<='\u00F6')||(LA18_399>='\u00F8' && LA18_399<='\u1FFF')||(LA18_399>='\u3040' && LA18_399<='\u318F')||(LA18_399>='\u3300' && LA18_399<='\u337F')||(LA18_399>='\u3400' && LA18_399<='\u3D2D')||(LA18_399>='\u4E00' && LA18_399<='\u9FFF')||(LA18_399>='\uF900' && LA18_399<='\uFAFF')) ) {
                                                alt18=94;
                                            }
                                            else {
                                                alt18=93;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                        }
                        break;
                    case 'F':
                        {
                        switch ( input.LA(5) ) {
                        case 'I':
                            {
                            int LA18_241 = input.LA(6);

                            if ( (LA18_241=='L') ) {
                                int LA18_294 = input.LA(7);

                                if ( (LA18_294=='E') ) {
                                    int LA18_337 = input.LA(8);

                                    if ( (LA18_337=='$'||(LA18_337>='0' && LA18_337<='9')||(LA18_337>='A' && LA18_337<='Z')||LA18_337=='_'||(LA18_337>='a' && LA18_337<='z')||(LA18_337>='\u00C0' && LA18_337<='\u00D6')||(LA18_337>='\u00D8' && LA18_337<='\u00F6')||(LA18_337>='\u00F8' && LA18_337<='\u1FFF')||(LA18_337>='\u3040' && LA18_337<='\u318F')||(LA18_337>='\u3300' && LA18_337<='\u337F')||(LA18_337>='\u3400' && LA18_337<='\u3D2D')||(LA18_337>='\u4E00' && LA18_337<='\u9FFF')||(LA18_337>='\uF900' && LA18_337<='\uFAFF')) ) {
                                        alt18=94;
                                    }
                                    else {
                                        alt18=18;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                            }
                            break;
                        case 'O':
                            {
                            int LA18_242 = input.LA(6);

                            if ( (LA18_242=='R') ) {
                                int LA18_295 = input.LA(7);

                                if ( (LA18_295=='E') ) {
                                    int LA18_338 = input.LA(8);

                                    if ( (LA18_338=='A') ) {
                                        int LA18_377 = input.LA(9);

                                        if ( (LA18_377=='C') ) {
                                            int LA18_400 = input.LA(10);

                                            if ( (LA18_400=='H') ) {
                                                int LA18_413 = input.LA(11);

                                                if ( (LA18_413=='$'||(LA18_413>='0' && LA18_413<='9')||(LA18_413>='A' && LA18_413<='Z')||LA18_413=='_'||(LA18_413>='a' && LA18_413<='z')||(LA18_413>='\u00C0' && LA18_413<='\u00D6')||(LA18_413>='\u00D8' && LA18_413<='\u00F6')||(LA18_413>='\u00F8' && LA18_413<='\u1FFF')||(LA18_413>='\u3040' && LA18_413<='\u318F')||(LA18_413>='\u3300' && LA18_413<='\u337F')||(LA18_413>='\u3400' && LA18_413<='\u3D2D')||(LA18_413>='\u4E00' && LA18_413<='\u9FFF')||(LA18_413>='\uF900' && LA18_413<='\uFAFF')) ) {
                                                    alt18=94;
                                                }
                                                else {
                                                    alt18=21;}
                                            }
                                            else {
                                                alt18=94;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                            }
                            break;
                        default:
                            alt18=94;}

                        }
                        break;
                    case 'I':
                        {
                        int LA18_185 = input.LA(5);

                        if ( (LA18_185=='F') ) {
                            int LA18_243 = input.LA(6);

                            if ( (LA18_243=='$'||(LA18_243>='0' && LA18_243<='9')||(LA18_243>='A' && LA18_243<='Z')||LA18_243=='_'||(LA18_243>='a' && LA18_243<='z')||(LA18_243>='\u00C0' && LA18_243<='\u00D6')||(LA18_243>='\u00D8' && LA18_243<='\u00F6')||(LA18_243>='\u00F8' && LA18_243<='\u1FFF')||(LA18_243>='\u3040' && LA18_243<='\u318F')||(LA18_243>='\u3300' && LA18_243<='\u337F')||(LA18_243>='\u3400' && LA18_243<='\u3D2D')||(LA18_243>='\u4E00' && LA18_243<='\u9FFF')||(LA18_243>='\uF900' && LA18_243<='\uFAFF')) ) {
                                alt18=94;
                            }
                            else {
                                alt18=23;}
                        }
                        else {
                            alt18=94;}
                        }
                        break;
                    default:
                        alt18=94;}

                }
                else {
                    alt18=94;}
                }
                break;
            case 'X':
                {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    int LA18_128 = input.LA(4);

                    if ( (LA18_128=='E') ) {
                        int LA18_186 = input.LA(5);

                        if ( (LA18_186=='N') ) {
                            int LA18_244 = input.LA(6);

                            if ( (LA18_244=='S') ) {
                                int LA18_297 = input.LA(7);

                                if ( (LA18_297=='I') ) {
                                    int LA18_339 = input.LA(8);

                                    if ( (LA18_339=='O') ) {
                                        int LA18_378 = input.LA(9);

                                        if ( (LA18_378=='N') ) {
                                            int LA18_401 = input.LA(10);

                                            if ( (LA18_401=='$'||(LA18_401>='0' && LA18_401<='9')||(LA18_401>='A' && LA18_401<='Z')||LA18_401=='_'||(LA18_401>='a' && LA18_401<='z')||(LA18_401>='\u00C0' && LA18_401<='\u00D6')||(LA18_401>='\u00D8' && LA18_401<='\u00F6')||(LA18_401>='\u00F8' && LA18_401<='\u1FFF')||(LA18_401>='\u3040' && LA18_401<='\u318F')||(LA18_401>='\u3300' && LA18_401<='\u337F')||(LA18_401>='\u3400' && LA18_401<='\u3D2D')||(LA18_401>='\u4E00' && LA18_401<='\u9FFF')||(LA18_401>='\uF900' && LA18_401<='\uFAFF')) ) {
                                                alt18=94;
                                            }
                                            else {
                                                alt18=2;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                    }
                    break;
                case 'P':
                    {
                    int LA18_129 = input.LA(4);

                    if ( (LA18_129=='A') ) {
                        int LA18_187 = input.LA(5);

                        if ( (LA18_187=='N') ) {
                            int LA18_245 = input.LA(6);

                            if ( (LA18_245=='D') ) {
                                int LA18_298 = input.LA(7);

                                if ( (LA18_298=='$'||(LA18_298>='0' && LA18_298<='9')||(LA18_298>='A' && LA18_298<='Z')||LA18_298=='_'||(LA18_298>='a' && LA18_298<='z')||(LA18_298>='\u00C0' && LA18_298<='\u00D6')||(LA18_298>='\u00D8' && LA18_298<='\u00F6')||(LA18_298>='\u00F8' && LA18_298<='\u1FFF')||(LA18_298>='\u3040' && LA18_298<='\u318F')||(LA18_298>='\u3300' && LA18_298<='\u337F')||(LA18_298>='\u3400' && LA18_298<='\u3D2D')||(LA18_298>='\u4E00' && LA18_298<='\u9FFF')||(LA18_298>='\uF900' && LA18_298<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=14;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                    }
                    break;
                default:
                    alt18=94;}

                }
                break;
            case 'R':
                {
                int LA18_59 = input.LA(3);

                if ( (LA18_59=='R') ) {
                    int LA18_130 = input.LA(4);

                    if ( (LA18_130=='O') ) {
                        int LA18_188 = input.LA(5);

                        if ( (LA18_188=='R') ) {
                            int LA18_246 = input.LA(6);

                            if ( (LA18_246=='$'||(LA18_246>='0' && LA18_246<='9')||(LA18_246>='A' && LA18_246<='Z')||LA18_246=='_'||(LA18_246>='a' && LA18_246<='z')||(LA18_246>='\u00C0' && LA18_246<='\u00D6')||(LA18_246>='\u00D8' && LA18_246<='\u00F6')||(LA18_246>='\u00F8' && LA18_246<='\u1FFF')||(LA18_246>='\u3040' && LA18_246<='\u318F')||(LA18_246>='\u3300' && LA18_246<='\u337F')||(LA18_246>='\u3400' && LA18_246<='\u3D2D')||(LA18_246>='\u4E00' && LA18_246<='\u9FFF')||(LA18_246>='\uF900' && LA18_246<='\uFAFF')) ) {
                                alt18=94;
                            }
                            else {
                                alt18=13;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'L':
                {
                int LA18_60 = input.LA(3);

                if ( (LA18_60=='S') ) {
                    int LA18_131 = input.LA(4);

                    if ( (LA18_131=='E') ) {
                        int LA18_189 = input.LA(5);

                        if ( (LA18_189=='I') ) {
                            int LA18_247 = input.LA(6);

                            if ( (LA18_247=='F') ) {
                                int LA18_300 = input.LA(7);

                                if ( (LA18_300=='$'||(LA18_300>='0' && LA18_300<='9')||(LA18_300>='A' && LA18_300<='Z')||LA18_300=='_'||(LA18_300>='a' && LA18_300<='z')||(LA18_300>='\u00C0' && LA18_300<='\u00D6')||(LA18_300>='\u00D8' && LA18_300<='\u00F6')||(LA18_300>='\u00F8' && LA18_300<='\u1FFF')||(LA18_300>='\u3040' && LA18_300<='\u318F')||(LA18_300>='\u3300' && LA18_300<='\u337F')||(LA18_300>='\u3400' && LA18_300<='\u3D2D')||(LA18_300>='\u4E00' && LA18_300<='\u9FFF')||(LA18_300>='\uF900' && LA18_300<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=24;}
                            }
                            else {
                                alt18=94;}
                        }
                        else if ( (LA18_189=='$'||(LA18_189>='0' && LA18_189<='9')||(LA18_189>='A' && LA18_189<='H')||(LA18_189>='J' && LA18_189<='Z')||LA18_189=='_'||(LA18_189>='a' && LA18_189<='z')||(LA18_189>='\u00C0' && LA18_189<='\u00D6')||(LA18_189>='\u00D8' && LA18_189<='\u00F6')||(LA18_189>='\u00F8' && LA18_189<='\u1FFF')||(LA18_189>='\u3040' && LA18_189<='\u318F')||(LA18_189>='\u3300' && LA18_189<='\u337F')||(LA18_189>='\u3400' && LA18_189<='\u3D2D')||(LA18_189>='\u4E00' && LA18_189<='\u9FFF')||(LA18_189>='\uF900' && LA18_189<='\uFAFF')) ) {
                            alt18=94;
                        }
                        else {
                            alt18=25;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA18_61 = input.LA(3);

                if ( (LA18_61=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA18_190 = input.LA(5);

                        if ( (LA18_190=='r') ) {
                            int LA18_249 = input.LA(6);

                            if ( (LA18_249=='t') ) {
                                int LA18_301 = input.LA(7);

                                if ( (LA18_301=='$'||(LA18_301>='0' && LA18_301<='9')||(LA18_301>='A' && LA18_301<='Z')||LA18_301=='_'||(LA18_301>='a' && LA18_301<='z')||(LA18_301>='\u00C0' && LA18_301<='\u00D6')||(LA18_301>='\u00D8' && LA18_301<='\u00F6')||(LA18_301>='\u00F8' && LA18_301<='\u1FFF')||(LA18_301>='\u3040' && LA18_301<='\u318F')||(LA18_301>='\u3300' && LA18_301<='\u337F')||(LA18_301>='\u3400' && LA18_301<='\u3D2D')||(LA18_301>='\u4E00' && LA18_301<='\u9FFF')||(LA18_301>='\uF900' && LA18_301<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=3;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                        }
                        break;
                    case 'l':
                        {
                        int LA18_191 = input.LA(5);

                        if ( (LA18_191=='i') ) {
                            int LA18_250 = input.LA(6);

                            if ( (LA18_250=='e') ) {
                                int LA18_302 = input.LA(7);

                                if ( (LA18_302=='s') ) {
                                    int LA18_343 = input.LA(8);

                                    if ( (LA18_343=='$'||(LA18_343>='0' && LA18_343<='9')||(LA18_343>='A' && LA18_343<='Z')||LA18_343=='_'||(LA18_343>='a' && LA18_343<='z')||(LA18_343>='\u00C0' && LA18_343<='\u00D6')||(LA18_343>='\u00D8' && LA18_343<='\u00F6')||(LA18_343>='\u00F8' && LA18_343<='\u1FFF')||(LA18_343>='\u3040' && LA18_343<='\u318F')||(LA18_343>='\u3300' && LA18_343<='\u337F')||(LA18_343>='\u3400' && LA18_343<='\u3D2D')||(LA18_343>='\u4E00' && LA18_343<='\u9FFF')||(LA18_343>='\uF900' && LA18_343<='\uFAFF')) ) {
                                        alt18=94;
                                    }
                                    else {
                                        alt18=61;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                        }
                        break;
                    default:
                        alt18=94;}

                }
                else {
                    alt18=94;}
                }
                break;
            case 'f':
                {
                int LA18_62 = input.LA(3);

                if ( (LA18_62=='$'||(LA18_62>='0' && LA18_62<='9')||(LA18_62>='A' && LA18_62<='Z')||LA18_62=='_'||(LA18_62>='a' && LA18_62<='z')||(LA18_62>='\u00C0' && LA18_62<='\u00D6')||(LA18_62>='\u00D8' && LA18_62<='\u00F6')||(LA18_62>='\u00F8' && LA18_62<='\u1FFF')||(LA18_62>='\u3040' && LA18_62<='\u318F')||(LA18_62>='\u3300' && LA18_62<='\u337F')||(LA18_62>='\u3400' && LA18_62<='\u3D2D')||(LA18_62>='\u4E00' && LA18_62<='\u9FFF')||(LA18_62>='\uF900' && LA18_62<='\uFAFF')) ) {
                    alt18=94;
                }
                else {
                    alt18=35;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0==';') ) {
            alt18=4;
        }
        else if ( (LA18_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA18_63 = input.LA(3);

                if ( (LA18_63=='s') ) {
                    int LA18_134 = input.LA(4);

                    if ( (LA18_134=='e') ) {
                        int LA18_192 = input.LA(5);

                        if ( (LA18_192=='$'||(LA18_192>='0' && LA18_192<='9')||(LA18_192>='A' && LA18_192<='Z')||LA18_192=='_'||(LA18_192>='a' && LA18_192<='z')||(LA18_192>='\u00C0' && LA18_192<='\u00D6')||(LA18_192>='\u00D8' && LA18_192<='\u00F6')||(LA18_192>='\u00F8' && LA18_192<='\u1FFF')||(LA18_192>='\u3040' && LA18_192<='\u318F')||(LA18_192>='\u3300' && LA18_192<='\u337F')||(LA18_192>='\u3400' && LA18_192<='\u3D2D')||(LA18_192>='\u4E00' && LA18_192<='\u9FFF')||(LA18_192>='\uF900' && LA18_192<='\uFAFF')) ) {
                            alt18=94;
                        }
                        else {
                            alt18=53;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA18_135 = input.LA(4);

                    if ( (LA18_135=='e') ) {
                        int LA18_193 = input.LA(5);

                        if ( (LA18_193=='n') ) {
                            int LA18_252 = input.LA(6);

                            if ( (LA18_252=='s') ) {
                                int LA18_303 = input.LA(7);

                                if ( (LA18_303=='i') ) {
                                    int LA18_344 = input.LA(8);

                                    if ( (LA18_344=='o') ) {
                                        int LA18_380 = input.LA(9);

                                        if ( (LA18_380=='n') ) {
                                            int LA18_402 = input.LA(10);

                                            if ( (LA18_402=='$'||(LA18_402>='0' && LA18_402<='9')||(LA18_402>='A' && LA18_402<='Z')||LA18_402=='_'||(LA18_402>='a' && LA18_402<='z')||(LA18_402>='\u00C0' && LA18_402<='\u00D6')||(LA18_402>='\u00D8' && LA18_402<='\u00F6')||(LA18_402>='\u00F8' && LA18_402<='\u1FFF')||(LA18_402>='\u3040' && LA18_402<='\u318F')||(LA18_402>='\u3300' && LA18_402<='\u337F')||(LA18_402>='\u3400' && LA18_402<='\u3D2D')||(LA18_402>='\u4E00' && LA18_402<='\u9FFF')||(LA18_402>='\uF900' && LA18_402<='\uFAFF')) ) {
                                                alt18=94;
                                            }
                                            else {
                                                alt18=5;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                    }
                    break;
                case 'i':
                    {
                    int LA18_136 = input.LA(4);

                    if ( (LA18_136=='s') ) {
                        int LA18_194 = input.LA(5);

                        if ( (LA18_194=='t') ) {
                            int LA18_253 = input.LA(6);

                            if ( (LA18_253=='s') ) {
                                int LA18_304 = input.LA(7);

                                if ( (LA18_304=='$'||(LA18_304>='0' && LA18_304<='9')||(LA18_304>='A' && LA18_304<='Z')||LA18_304=='_'||(LA18_304>='a' && LA18_304<='z')||(LA18_304>='\u00C0' && LA18_304<='\u00D6')||(LA18_304>='\u00D8' && LA18_304<='\u00F6')||(LA18_304>='\u00F8' && LA18_304<='\u1FFF')||(LA18_304>='\u3040' && LA18_304<='\u318F')||(LA18_304>='\u3300' && LA18_304<='\u337F')||(LA18_304>='\u3400' && LA18_304<='\u3D2D')||(LA18_304>='\u4E00' && LA18_304<='\u9FFF')||(LA18_304>='\uF900' && LA18_304<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=81;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                    }
                    break;
                default:
                    alt18=94;}

                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='r') ) {
            int LA18_6 = input.LA(2);

            if ( (LA18_6=='e') ) {
                switch ( input.LA(3) ) {
                case 'e':
                    {
                    int LA18_137 = input.LA(4);

                    if ( (LA18_137=='x') ) {
                        int LA18_195 = input.LA(5);

                        if ( (LA18_195=='p') ) {
                            int LA18_254 = input.LA(6);

                            if ( (LA18_254=='o') ) {
                                int LA18_305 = input.LA(7);

                                if ( (LA18_305=='r') ) {
                                    int LA18_346 = input.LA(8);

                                    if ( (LA18_346=='t') ) {
                                        int LA18_381 = input.LA(9);

                                        if ( (LA18_381=='$'||(LA18_381>='0' && LA18_381<='9')||(LA18_381>='A' && LA18_381<='Z')||LA18_381=='_'||(LA18_381>='a' && LA18_381<='z')||(LA18_381>='\u00C0' && LA18_381<='\u00D6')||(LA18_381>='\u00D8' && LA18_381<='\u00F6')||(LA18_381>='\u00F8' && LA18_381<='\u1FFF')||(LA18_381>='\u3040' && LA18_381<='\u318F')||(LA18_381>='\u3300' && LA18_381<='\u337F')||(LA18_381>='\u3400' && LA18_381<='\u3D2D')||(LA18_381>='\u4E00' && LA18_381<='\u9FFF')||(LA18_381>='\uF900' && LA18_381<='\uFAFF')) ) {
                                            alt18=94;
                                        }
                                        else {
                                            alt18=6;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                    }
                    break;
                case 'j':
                    {
                    int LA18_138 = input.LA(4);

                    if ( (LA18_138=='e') ) {
                        int LA18_196 = input.LA(5);

                        if ( (LA18_196=='c') ) {
                            int LA18_255 = input.LA(6);

                            if ( (LA18_255=='t') ) {
                                int LA18_306 = input.LA(7);

                                if ( (LA18_306=='$'||(LA18_306>='0' && LA18_306<='9')||(LA18_306>='A' && LA18_306<='Z')||LA18_306=='_'||(LA18_306>='a' && LA18_306<='z')||(LA18_306>='\u00C0' && LA18_306<='\u00D6')||(LA18_306>='\u00D8' && LA18_306<='\u00F6')||(LA18_306>='\u00F8' && LA18_306<='\u1FFF')||(LA18_306>='\u3040' && LA18_306<='\u318F')||(LA18_306>='\u3300' && LA18_306<='\u337F')||(LA18_306>='\u3400' && LA18_306<='\u3D2D')||(LA18_306>='\u4E00' && LA18_306<='\u9FFF')||(LA18_306>='\uF900' && LA18_306<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=80;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                    }
                    break;
                default:
                    alt18=94;}

            }
            else {
                alt18=94;}
        }
        else if ( (LA18_0=='(') ) {
            alt18=7;
        }
        else if ( (LA18_0==',') ) {
            alt18=8;
        }
        else if ( (LA18_0=='*') ) {
            alt18=9;
        }
        else if ( (LA18_0==')') ) {
            alt18=10;
        }
        else if ( (LA18_0=='F') ) {
            switch ( input.LA(2) ) {
            case 'O':
                {
                int LA18_66 = input.LA(3);

                if ( (LA18_66=='R') ) {
                    int LA18_139 = input.LA(4);

                    if ( (LA18_139=='E') ) {
                        int LA18_197 = input.LA(5);

                        if ( (LA18_197=='A') ) {
                            int LA18_256 = input.LA(6);

                            if ( (LA18_256=='C') ) {
                                int LA18_307 = input.LA(7);

                                if ( (LA18_307=='H') ) {
                                    int LA18_348 = input.LA(8);

                                    if ( (LA18_348=='$'||(LA18_348>='0' && LA18_348<='9')||(LA18_348>='A' && LA18_348<='Z')||LA18_348=='_'||(LA18_348>='a' && LA18_348<='z')||(LA18_348>='\u00C0' && LA18_348<='\u00D6')||(LA18_348>='\u00D8' && LA18_348<='\u00F6')||(LA18_348>='\u00F8' && LA18_348<='\u1FFF')||(LA18_348>='\u3040' && LA18_348<='\u318F')||(LA18_348>='\u3300' && LA18_348<='\u337F')||(LA18_348>='\u3400' && LA18_348<='\u3D2D')||(LA18_348>='\u4E00' && LA18_348<='\u9FFF')||(LA18_348>='\uF900' && LA18_348<='\uFAFF')) ) {
                                        alt18=94;
                                    }
                                    else {
                                        alt18=15;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else if ( (LA18_139=='$'||(LA18_139>='0' && LA18_139<='9')||(LA18_139>='A' && LA18_139<='D')||(LA18_139>='F' && LA18_139<='Z')||LA18_139=='_'||(LA18_139>='a' && LA18_139<='z')||(LA18_139>='\u00C0' && LA18_139<='\u00D6')||(LA18_139>='\u00D8' && LA18_139<='\u00F6')||(LA18_139>='\u00F8' && LA18_139<='\u1FFF')||(LA18_139>='\u3040' && LA18_139<='\u318F')||(LA18_139>='\u3300' && LA18_139<='\u337F')||(LA18_139>='\u3400' && LA18_139<='\u3D2D')||(LA18_139>='\u4E00' && LA18_139<='\u9FFF')||(LA18_139>='\uF900' && LA18_139<='\uFAFF')) ) {
                        alt18=94;
                    }
                    else {
                        alt18=11;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'I':
                {
                int LA18_67 = input.LA(3);

                if ( (LA18_67=='L') ) {
                    int LA18_140 = input.LA(4);

                    if ( (LA18_140=='E') ) {
                        int LA18_199 = input.LA(5);

                        if ( (LA18_199=='$'||(LA18_199>='0' && LA18_199<='9')||(LA18_199>='A' && LA18_199<='Z')||LA18_199=='_'||(LA18_199>='a' && LA18_199<='z')||(LA18_199>='\u00C0' && LA18_199<='\u00D6')||(LA18_199>='\u00D8' && LA18_199<='\u00F6')||(LA18_199>='\u00F8' && LA18_199<='\u1FFF')||(LA18_199>='\u3040' && LA18_199<='\u318F')||(LA18_199>='\u3300' && LA18_199<='\u337F')||(LA18_199>='\u3400' && LA18_199<='\u3D2D')||(LA18_199>='\u4E00' && LA18_199<='\u9FFF')||(LA18_199>='\uF900' && LA18_199<='\uFAFF')) ) {
                            alt18=94;
                        }
                        else {
                            alt18=17;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='-') ) {
            int LA18_12 = input.LA(2);

            if ( (LA18_12=='>') ) {
                alt18=50;
            }
            else {
                alt18=12;}
        }
        else if ( (LA18_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA18_70 = input.LA(3);

                if ( (LA18_70=='t') ) {
                    int LA18_141 = input.LA(4);

                    if ( (LA18_141=='$'||(LA18_141>='0' && LA18_141<='9')||(LA18_141>='A' && LA18_141<='Z')||LA18_141=='_'||(LA18_141>='a' && LA18_141<='z')||(LA18_141>='\u00C0' && LA18_141<='\u00D6')||(LA18_141>='\u00D8' && LA18_141<='\u00F6')||(LA18_141>='\u00F8' && LA18_141<='\u1FFF')||(LA18_141>='\u3040' && LA18_141<='\u318F')||(LA18_141>='\u3300' && LA18_141<='\u337F')||(LA18_141>='\u3400' && LA18_141<='\u3D2D')||(LA18_141>='\u4E00' && LA18_141<='\u9FFF')||(LA18_141>='\uF900' && LA18_141<='\uFAFF')) ) {
                        alt18=94;
                    }
                    else {
                        alt18=47;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'E':
                {
                int LA18_71 = input.LA(3);

                if ( (LA18_71=='P') ) {
                    int LA18_142 = input.LA(4);

                    if ( (LA18_142=='A') ) {
                        int LA18_201 = input.LA(5);

                        if ( (LA18_201=='R') ) {
                            int LA18_258 = input.LA(6);

                            if ( (LA18_258=='A') ) {
                                int LA18_308 = input.LA(7);

                                if ( (LA18_308=='T') ) {
                                    int LA18_349 = input.LA(8);

                                    if ( (LA18_349=='O') ) {
                                        int LA18_383 = input.LA(9);

                                        if ( (LA18_383=='R') ) {
                                            int LA18_404 = input.LA(10);

                                            if ( (LA18_404=='$'||(LA18_404>='0' && LA18_404<='9')||(LA18_404>='A' && LA18_404<='Z')||LA18_404=='_'||(LA18_404>='a' && LA18_404<='z')||(LA18_404>='\u00C0' && LA18_404<='\u00D6')||(LA18_404>='\u00D8' && LA18_404<='\u00F6')||(LA18_404>='\u00F8' && LA18_404<='\u1FFF')||(LA18_404>='\u3040' && LA18_404<='\u318F')||(LA18_404>='\u3300' && LA18_404<='\u337F')||(LA18_404>='\u3400' && LA18_404<='\u3D2D')||(LA18_404>='\u4E00' && LA18_404<='\u9FFF')||(LA18_404>='\uF900' && LA18_404<='\uFAFF')) ) {
                                                alt18=94;
                                            }
                                            else {
                                                alt18=16;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'S':
                {
                int LA18_72 = input.LA(3);

                if ( (LA18_72=='$'||(LA18_72>='0' && LA18_72<='9')||(LA18_72>='A' && LA18_72<='Z')||LA18_72=='_'||(LA18_72>='a' && LA18_72<='z')||(LA18_72>='\u00C0' && LA18_72<='\u00D6')||(LA18_72>='\u00D8' && LA18_72<='\u00F6')||(LA18_72>='\u00F8' && LA18_72<='\u1FFF')||(LA18_72>='\u3040' && LA18_72<='\u318F')||(LA18_72>='\u3300' && LA18_72<='\u337F')||(LA18_72>='\u3400' && LA18_72<='\u3D2D')||(LA18_72>='\u4E00' && LA18_72<='\u9FFF')||(LA18_72>='\uF900' && LA18_72<='\uFAFF')) ) {
                    alt18=94;
                }
                else {
                    alt18=19;}
                }
                break;
            case 'R':
                {
                int LA18_73 = input.LA(3);

                if ( (LA18_73=='O') ) {
                    int LA18_144 = input.LA(4);

                    if ( (LA18_144=='U') ) {
                        int LA18_202 = input.LA(5);

                        if ( (LA18_202=='N') ) {
                            int LA18_259 = input.LA(6);

                            if ( (LA18_259=='D') ) {
                                int LA18_309 = input.LA(7);

                                if ( (LA18_309=='$'||(LA18_309>='0' && LA18_309<='9')||(LA18_309>='A' && LA18_309<='Z')||LA18_309=='_'||(LA18_309>='a' && LA18_309<='z')||(LA18_309>='\u00C0' && LA18_309<='\u00D6')||(LA18_309>='\u00D8' && LA18_309<='\u00F6')||(LA18_309>='\u00F8' && LA18_309<='\u1FFF')||(LA18_309>='\u3040' && LA18_309<='\u318F')||(LA18_309>='\u3300' && LA18_309<='\u337F')||(LA18_309>='\u3400' && LA18_309<='\u3D2D')||(LA18_309>='\u4E00' && LA18_309<='\u9FFF')||(LA18_309>='\uF900' && LA18_309<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=92;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='L') ) {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA18_74 = input.LA(3);

                if ( (LA18_74=='T') ) {
                    int LA18_145 = input.LA(4);

                    if ( (LA18_145=='$'||(LA18_145>='0' && LA18_145<='9')||(LA18_145>='A' && LA18_145<='Z')||LA18_145=='_'||(LA18_145>='a' && LA18_145<='z')||(LA18_145>='\u00C0' && LA18_145<='\u00D6')||(LA18_145>='\u00D8' && LA18_145<='\u00F6')||(LA18_145>='\u00F8' && LA18_145<='\u1FFF')||(LA18_145>='\u3040' && LA18_145<='\u318F')||(LA18_145>='\u3300' && LA18_145<='\u337F')||(LA18_145>='\u3400' && LA18_145<='\u3D2D')||(LA18_145>='\u4E00' && LA18_145<='\u9FFF')||(LA18_145>='\uF900' && LA18_145<='\uFAFF')) ) {
                        alt18=94;
                    }
                    else {
                        alt18=26;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'i':
                {
                int LA18_75 = input.LA(3);

                if ( (LA18_75=='s') ) {
                    int LA18_146 = input.LA(4);

                    if ( (LA18_146=='t') ) {
                        int LA18_204 = input.LA(5);

                        if ( (LA18_204=='$'||(LA18_204>='0' && LA18_204<='9')||(LA18_204>='A' && LA18_204<='Z')||LA18_204=='_'||(LA18_204>='a' && LA18_204<='z')||(LA18_204>='\u00C0' && LA18_204<='\u00D6')||(LA18_204>='\u00D8' && LA18_204<='\u00F6')||(LA18_204>='\u00F8' && LA18_204<='\u1FFF')||(LA18_204>='\u3040' && LA18_204<='\u318F')||(LA18_204>='\u3300' && LA18_204<='\u337F')||(LA18_204>='\u3400' && LA18_204<='\u3D2D')||(LA18_204>='\u4E00' && LA18_204<='\u9FFF')||(LA18_204>='\uF900' && LA18_204<='\uFAFF')) ) {
                            alt18=94;
                        }
                        else {
                            alt18=46;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='P') ) {
            int LA18_16 = input.LA(2);

            if ( (LA18_16=='R') ) {
                int LA18_76 = input.LA(3);

                if ( (LA18_76=='O') ) {
                    int LA18_147 = input.LA(4);

                    if ( (LA18_147=='T') ) {
                        int LA18_205 = input.LA(5);

                        if ( (LA18_205=='E') ) {
                            int LA18_261 = input.LA(6);

                            if ( (LA18_261=='C') ) {
                                int LA18_310 = input.LA(7);

                                if ( (LA18_310=='T') ) {
                                    int LA18_351 = input.LA(8);

                                    if ( (LA18_351=='$'||(LA18_351>='0' && LA18_351<='9')||(LA18_351>='A' && LA18_351<='Z')||LA18_351=='_'||(LA18_351>='a' && LA18_351<='z')||(LA18_351>='\u00C0' && LA18_351<='\u00D6')||(LA18_351>='\u00D8' && LA18_351<='\u00F6')||(LA18_351>='\u00F8' && LA18_351<='\u1FFF')||(LA18_351>='\u3040' && LA18_351<='\u318F')||(LA18_351>='\u3300' && LA18_351<='\u337F')||(LA18_351>='\u3400' && LA18_351<='\u3D2D')||(LA18_351>='\u4E00' && LA18_351<='\u9FFF')||(LA18_351>='\uF900' && LA18_351<='\uFAFF')) ) {
                                        alt18=94;
                                    }
                                    else {
                                        alt18=28;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
            }
            else {
                alt18=94;}
        }
        else if ( (LA18_0=='C') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA18_77 = input.LA(3);

                if ( (LA18_77=='l') ) {
                    int LA18_148 = input.LA(4);

                    if ( (LA18_148=='l') ) {
                        int LA18_206 = input.LA(5);

                        if ( (LA18_206=='e') ) {
                            int LA18_262 = input.LA(6);

                            if ( (LA18_262=='c') ) {
                                int LA18_311 = input.LA(7);

                                if ( (LA18_311=='t') ) {
                                    int LA18_352 = input.LA(8);

                                    if ( (LA18_352=='i') ) {
                                        int LA18_385 = input.LA(9);

                                        if ( (LA18_385=='o') ) {
                                            int LA18_405 = input.LA(10);

                                            if ( (LA18_405=='n') ) {
                                                int LA18_417 = input.LA(11);

                                                if ( (LA18_417=='$'||(LA18_417>='0' && LA18_417<='9')||(LA18_417>='A' && LA18_417<='Z')||LA18_417=='_'||(LA18_417>='a' && LA18_417<='z')||(LA18_417>='\u00C0' && LA18_417<='\u00D6')||(LA18_417>='\u00D8' && LA18_417<='\u00F6')||(LA18_417>='\u00F8' && LA18_417<='\u1FFF')||(LA18_417>='\u3040' && LA18_417<='\u318F')||(LA18_417>='\u3300' && LA18_417<='\u337F')||(LA18_417>='\u3400' && LA18_417<='\u3D2D')||(LA18_417>='\u4E00' && LA18_417<='\u9FFF')||(LA18_417>='\uF900' && LA18_417<='\uFAFF')) ) {
                                                    alt18=94;
                                                }
                                                else {
                                                    alt18=45;}
                                            }
                                            else {
                                                alt18=94;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'E':
                {
                int LA18_78 = input.LA(3);

                if ( (LA18_78=='N') ) {
                    int LA18_149 = input.LA(4);

                    if ( (LA18_149=='D') ) {
                        int LA18_207 = input.LA(5);

                        if ( (LA18_207=='$'||(LA18_207>='0' && LA18_207<='9')||(LA18_207>='A' && LA18_207<='Z')||LA18_207=='_'||(LA18_207>='a' && LA18_207<='z')||(LA18_207>='\u00C0' && LA18_207<='\u00D6')||(LA18_207>='\u00D8' && LA18_207<='\u00F6')||(LA18_207>='\u00F8' && LA18_207<='\u1FFF')||(LA18_207>='\u3040' && LA18_207<='\u318F')||(LA18_207>='\u3300' && LA18_207<='\u337F')||(LA18_207>='\u3400' && LA18_207<='\u3D2D')||(LA18_207>='\u4E00' && LA18_207<='\u9FFF')||(LA18_207>='\uF900' && LA18_207<='\uFAFF')) ) {
                            alt18=94;
                        }
                        else {
                            alt18=30;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'S':
                {
                int LA18_79 = input.LA(3);

                if ( (LA18_79=='T') ) {
                    int LA18_150 = input.LA(4);

                    if ( (LA18_150=='A') ) {
                        int LA18_208 = input.LA(5);

                        if ( (LA18_208=='R') ) {
                            int LA18_264 = input.LA(6);

                            if ( (LA18_264=='T') ) {
                                int LA18_312 = input.LA(7);

                                if ( (LA18_312=='$'||(LA18_312>='0' && LA18_312<='9')||(LA18_312>='A' && LA18_312<='Z')||LA18_312=='_'||(LA18_312>='a' && LA18_312<='z')||(LA18_312>='\u00C0' && LA18_312<='\u00D6')||(LA18_312>='\u00D8' && LA18_312<='\u00F6')||(LA18_312>='\u00F8' && LA18_312<='\u1FFF')||(LA18_312>='\u3040' && LA18_312<='\u318F')||(LA18_312>='\u3300' && LA18_312<='\u337F')||(LA18_312>='\u3400' && LA18_312<='\u3D2D')||(LA18_312>='\u4E00' && LA18_312<='\u9FFF')||(LA18_312>='\uF900' && LA18_312<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=29;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'I':
                {
                int LA18_80 = input.LA(3);

                if ( (LA18_80=='S') ) {
                    int LA18_151 = input.LA(4);

                    if ( (LA18_151=='A') ) {
                        int LA18_209 = input.LA(5);

                        if ( (LA18_209=='B') ) {
                            int LA18_265 = input.LA(6);

                            if ( (LA18_265=='L') ) {
                                int LA18_313 = input.LA(7);

                                if ( (LA18_313=='E') ) {
                                    int LA18_354 = input.LA(8);

                                    if ( (LA18_354=='$'||(LA18_354>='0' && LA18_354<='9')||(LA18_354>='A' && LA18_354<='Z')||LA18_354=='_'||(LA18_354>='a' && LA18_354<='z')||(LA18_354>='\u00C0' && LA18_354<='\u00D6')||(LA18_354>='\u00D8' && LA18_354<='\u00F6')||(LA18_354>='\u00F8' && LA18_354<='\u1FFF')||(LA18_354>='\u3040' && LA18_354<='\u318F')||(LA18_354>='\u3300' && LA18_354<='\u337F')||(LA18_354>='\u3400' && LA18_354<='\u3D2D')||(LA18_354>='\u4E00' && LA18_354<='\u9FFF')||(LA18_354>='\uF900' && LA18_354<='\uFAFF')) ) {
                                        alt18=94;
                                    }
                                    else {
                                        alt18=32;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'E':
                {
                int LA18_81 = input.LA(3);

                if ( (LA18_81=='F') ) {
                    int LA18_152 = input.LA(4);

                    if ( (LA18_152=='I') ) {
                        int LA18_210 = input.LA(5);

                        if ( (LA18_210=='N') ) {
                            int LA18_266 = input.LA(6);

                            if ( (LA18_266=='E') ) {
                                int LA18_314 = input.LA(7);

                                if ( (LA18_314=='$'||(LA18_314>='0' && LA18_314<='9')||(LA18_314>='A' && LA18_314<='Z')||LA18_314=='_'||(LA18_314>='a' && LA18_314<='z')||(LA18_314>='\u00C0' && LA18_314<='\u00D6')||(LA18_314>='\u00D8' && LA18_314<='\u00F6')||(LA18_314>='\u00F8' && LA18_314<='\u1FFF')||(LA18_314>='\u3040' && LA18_314<='\u318F')||(LA18_314>='\u3300' && LA18_314<='\u337F')||(LA18_314>='\u3400' && LA18_314<='\u3D2D')||(LA18_314>='\u4E00' && LA18_314<='\u9FFF')||(LA18_314>='\uF900' && LA18_314<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=90;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA18_153 = input.LA(4);

                    if ( (LA18_153=='h') ) {
                        int LA18_211 = input.LA(5);

                        if ( (LA18_211=='e') ) {
                            int LA18_267 = input.LA(6);

                            if ( (LA18_267=='d') ) {
                                int LA18_315 = input.LA(7);

                                if ( (LA18_315=='$'||(LA18_315>='0' && LA18_315<='9')||(LA18_315>='A' && LA18_315<='Z')||LA18_315=='_'||(LA18_315>='a' && LA18_315<='z')||(LA18_315>='\u00C0' && LA18_315<='\u00D6')||(LA18_315>='\u00D8' && LA18_315<='\u00F6')||(LA18_315>='\u00F8' && LA18_315<='\u1FFF')||(LA18_315>='\u3040' && LA18_315<='\u318F')||(LA18_315>='\u3300' && LA18_315<='\u337F')||(LA18_315>='\u3400' && LA18_315<='\u3D2D')||(LA18_315>='\u4E00' && LA18_315<='\u9FFF')||(LA18_315>='\uF900' && LA18_315<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=41;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                    }
                    break;
                case 's':
                    {
                    int LA18_154 = input.LA(4);

                    if ( (LA18_154=='e') ) {
                        int LA18_212 = input.LA(5);

                        if ( (LA18_212=='$'||(LA18_212>='0' && LA18_212<='9')||(LA18_212>='A' && LA18_212<='Z')||LA18_212=='_'||(LA18_212>='a' && LA18_212<='z')||(LA18_212>='\u00C0' && LA18_212<='\u00D6')||(LA18_212>='\u00D8' && LA18_212<='\u00F6')||(LA18_212>='\u00F8' && LA18_212<='\u1FFF')||(LA18_212>='\u3040' && LA18_212<='\u318F')||(LA18_212>='\u3300' && LA18_212<='\u337F')||(LA18_212>='\u3400' && LA18_212<='\u3D2D')||(LA18_212>='\u4E00' && LA18_212<='\u9FFF')||(LA18_212>='\uF900' && LA18_212<='\uFAFF')) ) {
                            alt18=94;
                        }
                        else {
                            alt18=58;}
                    }
                    else {
                        alt18=94;}
                    }
                    break;
                default:
                    alt18=94;}

                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    int LA18_155 = input.LA(4);

                    if ( (LA18_155=='t') ) {
                        int LA18_213 = input.LA(5);

                        if ( (LA18_213=='e') ) {
                            int LA18_269 = input.LA(6);

                            if ( (LA18_269=='x') ) {
                                int LA18_316 = input.LA(7);

                                if ( (LA18_316=='t') ) {
                                    int LA18_357 = input.LA(8);

                                    if ( (LA18_357=='$'||(LA18_357>='0' && LA18_357<='9')||(LA18_357>='A' && LA18_357<='Z')||LA18_357=='_'||(LA18_357>='a' && LA18_357<='z')||(LA18_357>='\u00C0' && LA18_357<='\u00D6')||(LA18_357>='\u00D8' && LA18_357<='\u00F6')||(LA18_357>='\u00F8' && LA18_357<='\u1FFF')||(LA18_357>='\u3040' && LA18_357<='\u318F')||(LA18_357>='\u3300' && LA18_357<='\u337F')||(LA18_357>='\u3400' && LA18_357<='\u3D2D')||(LA18_357>='\u4E00' && LA18_357<='\u9FFF')||(LA18_357>='\uF900' && LA18_357<='\uFAFF')) ) {
                                        alt18=94;
                                    }
                                    else {
                                        alt18=34;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                    }
                    break;
                case 'l':
                    {
                    int LA18_156 = input.LA(4);

                    if ( (LA18_156=='l') ) {
                        int LA18_214 = input.LA(5);

                        if ( (LA18_214=='e') ) {
                            int LA18_270 = input.LA(6);

                            if ( (LA18_270=='c') ) {
                                int LA18_317 = input.LA(7);

                                if ( (LA18_317=='t') ) {
                                    int LA18_358 = input.LA(8);

                                    if ( (LA18_358=='$'||(LA18_358>='0' && LA18_358<='9')||(LA18_358>='A' && LA18_358<='Z')||LA18_358=='_'||(LA18_358>='a' && LA18_358<='z')||(LA18_358>='\u00C0' && LA18_358<='\u00D6')||(LA18_358>='\u00D8' && LA18_358<='\u00F6')||(LA18_358>='\u00F8' && LA18_358<='\u1FFF')||(LA18_358>='\u3040' && LA18_358<='\u318F')||(LA18_358>='\u3300' && LA18_358<='\u337F')||(LA18_358>='\u3400' && LA18_358<='\u3D2D')||(LA18_358>='\u4E00' && LA18_358<='\u9FFF')||(LA18_358>='\uF900' && LA18_358<='\uFAFF')) ) {
                                        alt18=94;
                                    }
                                    else {
                                        alt18=77;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                    }
                    break;
                default:
                    alt18=94;}

                }
                break;
            case 'r':
                {
                int LA18_84 = input.LA(3);

                if ( (LA18_84=='e') ) {
                    int LA18_157 = input.LA(4);

                    if ( (LA18_157=='a') ) {
                        int LA18_215 = input.LA(5);

                        if ( (LA18_215=='t') ) {
                            int LA18_271 = input.LA(6);

                            if ( (LA18_271=='e') ) {
                                int LA18_318 = input.LA(7);

                                if ( (LA18_318=='$'||(LA18_318>='0' && LA18_318<='9')||(LA18_318>='A' && LA18_318<='Z')||LA18_318=='_'||(LA18_318>='a' && LA18_318<='z')||(LA18_318>='\u00C0' && LA18_318<='\u00D6')||(LA18_318>='\u00D8' && LA18_318<='\u00F6')||(LA18_318>='\u00F8' && LA18_318<='\u1FFF')||(LA18_318>='\u3040' && LA18_318<='\u318F')||(LA18_318>='\u3300' && LA18_318<='\u337F')||(LA18_318>='\u3400' && LA18_318<='\u3D2D')||(LA18_318>='\u4E00' && LA18_318<='\u9FFF')||(LA18_318>='\uF900' && LA18_318<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=42;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='W') ) {
            int LA18_20 = input.LA(2);

            if ( (LA18_20=='A') ) {
                int LA18_85 = input.LA(3);

                if ( (LA18_85=='R') ) {
                    int LA18_158 = input.LA(4);

                    if ( (LA18_158=='N') ) {
                        int LA18_216 = input.LA(5);

                        if ( (LA18_216=='I') ) {
                            int LA18_272 = input.LA(6);

                            if ( (LA18_272=='N') ) {
                                int LA18_319 = input.LA(7);

                                if ( (LA18_319=='G') ) {
                                    int LA18_360 = input.LA(8);

                                    if ( (LA18_360=='$'||(LA18_360>='0' && LA18_360<='9')||(LA18_360>='A' && LA18_360<='Z')||LA18_360=='_'||(LA18_360>='a' && LA18_360<='z')||(LA18_360>='\u00C0' && LA18_360<='\u00D6')||(LA18_360>='\u00D8' && LA18_360<='\u00F6')||(LA18_360>='\u00F8' && LA18_360<='\u1FFF')||(LA18_360>='\u3040' && LA18_360<='\u318F')||(LA18_360>='\u3300' && LA18_360<='\u337F')||(LA18_360>='\u3400' && LA18_360<='\u3D2D')||(LA18_360>='\u4E00' && LA18_360<='\u9FFF')||(LA18_360>='\uF900' && LA18_360<='\uFAFF')) ) {
                                        alt18=94;
                                    }
                                    else {
                                        alt18=36;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
            }
            else {
                alt18=94;}
        }
        else if ( (LA18_0==':') ) {
            int LA18_21 = input.LA(2);

            if ( (LA18_21==':') ) {
                alt18=39;
            }
            else {
                alt18=37;}
        }
        else if ( (LA18_0=='a') ) {
            int LA18_22 = input.LA(2);

            if ( (LA18_22=='r') ) {
                int LA18_88 = input.LA(3);

                if ( (LA18_88=='o') ) {
                    int LA18_159 = input.LA(4);

                    if ( (LA18_159=='u') ) {
                        int LA18_217 = input.LA(5);

                        if ( (LA18_217=='n') ) {
                            int LA18_273 = input.LA(6);

                            if ( (LA18_273=='d') ) {
                                int LA18_320 = input.LA(7);

                                if ( (LA18_320=='$'||(LA18_320>='0' && LA18_320<='9')||(LA18_320>='A' && LA18_320<='Z')||LA18_320=='_'||(LA18_320>='a' && LA18_320<='z')||(LA18_320>='\u00C0' && LA18_320<='\u00D6')||(LA18_320>='\u00D8' && LA18_320<='\u00F6')||(LA18_320>='\u00F8' && LA18_320<='\u1FFF')||(LA18_320>='\u3040' && LA18_320<='\u318F')||(LA18_320>='\u3300' && LA18_320<='\u337F')||(LA18_320>='\u3400' && LA18_320<='\u3D2D')||(LA18_320>='\u4E00' && LA18_320<='\u9FFF')||(LA18_320>='\uF900' && LA18_320<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=38;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
            }
            else {
                alt18=94;}
        }
        else if ( (LA18_0=='p') ) {
            int LA18_23 = input.LA(2);

            if ( (LA18_23=='r') ) {
                int LA18_89 = input.LA(3);

                if ( (LA18_89=='i') ) {
                    int LA18_160 = input.LA(4);

                    if ( (LA18_160=='v') ) {
                        int LA18_218 = input.LA(5);

                        if ( (LA18_218=='a') ) {
                            int LA18_274 = input.LA(6);

                            if ( (LA18_274=='t') ) {
                                int LA18_321 = input.LA(7);

                                if ( (LA18_321=='e') ) {
                                    int LA18_362 = input.LA(8);

                                    if ( (LA18_362=='$'||(LA18_362>='0' && LA18_362<='9')||(LA18_362>='A' && LA18_362<='Z')||LA18_362=='_'||(LA18_362>='a' && LA18_362<='z')||(LA18_362>='\u00C0' && LA18_362<='\u00D6')||(LA18_362>='\u00D8' && LA18_362<='\u00F6')||(LA18_362>='\u00F8' && LA18_362<='\u1FFF')||(LA18_362>='\u3040' && LA18_362<='\u318F')||(LA18_362>='\u3300' && LA18_362<='\u337F')||(LA18_362>='\u3400' && LA18_362<='\u3D2D')||(LA18_362>='\u4E00' && LA18_362<='\u9FFF')||(LA18_362>='\uF900' && LA18_362<='\uFAFF')) ) {
                                        alt18=94;
                                    }
                                    else {
                                        alt18=40;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
            }
            else {
                alt18=94;}
        }
        else if ( (LA18_0=='J') ) {
            int LA18_24 = input.LA(2);

            if ( (LA18_24=='A') ) {
                int LA18_90 = input.LA(3);

                if ( (LA18_90=='V') ) {
                    int LA18_161 = input.LA(4);

                    if ( (LA18_161=='A') ) {
                        int LA18_219 = input.LA(5);

                        if ( (LA18_219=='$'||(LA18_219>='0' && LA18_219<='9')||(LA18_219>='A' && LA18_219<='Z')||LA18_219=='_'||(LA18_219>='a' && LA18_219<='z')||(LA18_219>='\u00C0' && LA18_219<='\u00D6')||(LA18_219>='\u00D8' && LA18_219<='\u00F6')||(LA18_219>='\u00F8' && LA18_219<='\u1FFF')||(LA18_219>='\u3040' && LA18_219<='\u318F')||(LA18_219>='\u3300' && LA18_219<='\u337F')||(LA18_219>='\u3400' && LA18_219<='\u3D2D')||(LA18_219>='\u4E00' && LA18_219<='\u9FFF')||(LA18_219>='\uF900' && LA18_219<='\uFAFF')) ) {
                            alt18=94;
                        }
                        else {
                            alt18=43;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
            }
            else {
                alt18=94;}
        }
        else if ( (LA18_0=='.') ) {
            alt18=44;
        }
        else if ( (LA18_0=='l') ) {
            int LA18_26 = input.LA(2);

            if ( (LA18_26=='e') ) {
                int LA18_91 = input.LA(3);

                if ( (LA18_91=='t') ) {
                    int LA18_162 = input.LA(4);

                    if ( (LA18_162=='$'||(LA18_162>='0' && LA18_162<='9')||(LA18_162>='A' && LA18_162<='Z')||LA18_162=='_'||(LA18_162>='a' && LA18_162<='z')||(LA18_162>='\u00C0' && LA18_162<='\u00D6')||(LA18_162>='\u00D8' && LA18_162<='\u00F6')||(LA18_162>='\u00F8' && LA18_162<='\u1FFF')||(LA18_162>='\u3040' && LA18_162<='\u318F')||(LA18_162>='\u3300' && LA18_162<='\u337F')||(LA18_162>='\u3400' && LA18_162<='\u3D2D')||(LA18_162>='\u4E00' && LA18_162<='\u9FFF')||(LA18_162>='\uF900' && LA18_162<='\uFAFF')) ) {
                        alt18=94;
                    }
                    else {
                        alt18=48;}
                }
                else {
                    alt18=94;}
            }
            else {
                alt18=94;}
        }
        else if ( (LA18_0=='=') ) {
            int LA18_27 = input.LA(2);

            if ( (LA18_27=='=') ) {
                alt18=62;
            }
            else {
                alt18=49;}
        }
        else if ( (LA18_0=='?') ) {
            alt18=51;
        }
        else if ( (LA18_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA18_94 = input.LA(3);

                if ( (LA18_94=='p') ) {
                    int LA18_163 = input.LA(4);

                    if ( (LA18_163=='e') ) {
                        int LA18_221 = input.LA(5);

                        if ( (LA18_221=='S') ) {
                            int LA18_276 = input.LA(6);

                            if ( (LA18_276=='e') ) {
                                int LA18_322 = input.LA(7);

                                if ( (LA18_322=='l') ) {
                                    int LA18_363 = input.LA(8);

                                    if ( (LA18_363=='e') ) {
                                        int LA18_391 = input.LA(9);

                                        if ( (LA18_391=='c') ) {
                                            int LA18_406 = input.LA(10);

                                            if ( (LA18_406=='t') ) {
                                                int LA18_418 = input.LA(11);

                                                if ( (LA18_418=='$'||(LA18_418>='0' && LA18_418<='9')||(LA18_418>='A' && LA18_418<='Z')||LA18_418=='_'||(LA18_418>='a' && LA18_418<='z')||(LA18_418>='\u00C0' && LA18_418<='\u00D6')||(LA18_418>='\u00D8' && LA18_418<='\u00F6')||(LA18_418>='\u00F8' && LA18_418<='\u1FFF')||(LA18_418>='\u3040' && LA18_418<='\u318F')||(LA18_418>='\u3300' && LA18_418<='\u337F')||(LA18_418>='\u3400' && LA18_418<='\u3D2D')||(LA18_418>='\u4E00' && LA18_418<='\u9FFF')||(LA18_418>='\uF900' && LA18_418<='\uFAFF')) ) {
                                                    alt18=94;
                                                }
                                                else {
                                                    alt18=76;}
                                            }
                                            else {
                                                alt18=94;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'h':
                {
                int LA18_95 = input.LA(3);

                if ( (LA18_95=='e') ) {
                    int LA18_164 = input.LA(4);

                    if ( (LA18_164=='n') ) {
                        int LA18_222 = input.LA(5);

                        if ( (LA18_222=='$'||(LA18_222>='0' && LA18_222<='9')||(LA18_222>='A' && LA18_222<='Z')||LA18_222=='_'||(LA18_222>='a' && LA18_222<='z')||(LA18_222>='\u00C0' && LA18_222<='\u00D6')||(LA18_222>='\u00D8' && LA18_222<='\u00F6')||(LA18_222>='\u00F8' && LA18_222<='\u1FFF')||(LA18_222>='\u3040' && LA18_222<='\u318F')||(LA18_222>='\u3300' && LA18_222<='\u337F')||(LA18_222>='\u3400' && LA18_222<='\u3D2D')||(LA18_222>='\u4E00' && LA18_222<='\u9FFF')||(LA18_222>='\uF900' && LA18_222<='\uFAFF')) ) {
                            alt18=94;
                        }
                        else {
                            alt18=52;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'r':
                {
                int LA18_96 = input.LA(3);

                if ( (LA18_96=='u') ) {
                    int LA18_165 = input.LA(4);

                    if ( (LA18_165=='e') ) {
                        int LA18_223 = input.LA(5);

                        if ( (LA18_223=='$'||(LA18_223>='0' && LA18_223<='9')||(LA18_223>='A' && LA18_223<='Z')||LA18_223=='_'||(LA18_223>='a' && LA18_223<='z')||(LA18_223>='\u00C0' && LA18_223<='\u00D6')||(LA18_223>='\u00D8' && LA18_223<='\u00F6')||(LA18_223>='\u00F8' && LA18_223<='\u1FFF')||(LA18_223>='\u3040' && LA18_223<='\u318F')||(LA18_223>='\u3300' && LA18_223<='\u337F')||(LA18_223>='\u3400' && LA18_223<='\u3D2D')||(LA18_223>='\u4E00' && LA18_223<='\u9FFF')||(LA18_223>='\uF900' && LA18_223<='\uFAFF')) ) {
                            alt18=94;
                        }
                        else {
                            alt18=74;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA18_97 = input.LA(3);

                if ( (LA18_97=='l') ) {
                    int LA18_166 = input.LA(4);

                    if ( (LA18_166=='e') ) {
                        int LA18_224 = input.LA(5);

                        if ( (LA18_224=='c') ) {
                            int LA18_279 = input.LA(6);

                            if ( (LA18_279=='t') ) {
                                int LA18_323 = input.LA(7);

                                if ( (LA18_323=='F') ) {
                                    int LA18_364 = input.LA(8);

                                    if ( (LA18_364=='i') ) {
                                        int LA18_392 = input.LA(9);

                                        if ( (LA18_392=='r') ) {
                                            int LA18_407 = input.LA(10);

                                            if ( (LA18_407=='s') ) {
                                                int LA18_419 = input.LA(11);

                                                if ( (LA18_419=='t') ) {
                                                    int LA18_426 = input.LA(12);

                                                    if ( (LA18_426=='$'||(LA18_426>='0' && LA18_426<='9')||(LA18_426>='A' && LA18_426<='Z')||LA18_426=='_'||(LA18_426>='a' && LA18_426<='z')||(LA18_426>='\u00C0' && LA18_426<='\u00D6')||(LA18_426>='\u00D8' && LA18_426<='\u00F6')||(LA18_426>='\u00F8' && LA18_426<='\u1FFF')||(LA18_426>='\u3040' && LA18_426<='\u318F')||(LA18_426>='\u3300' && LA18_426<='\u337F')||(LA18_426>='\u3400' && LA18_426<='\u3D2D')||(LA18_426>='\u4E00' && LA18_426<='\u9FFF')||(LA18_426>='\uF900' && LA18_426<='\uFAFF')) ) {
                                                        alt18=94;
                                                    }
                                                    else {
                                                        alt18=79;}
                                                }
                                                else {
                                                    alt18=94;}
                                            }
                                            else {
                                                alt18=94;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else if ( (LA18_323=='$'||(LA18_323>='0' && LA18_323<='9')||(LA18_323>='A' && LA18_323<='E')||(LA18_323>='G' && LA18_323<='Z')||LA18_323=='_'||(LA18_323>='a' && LA18_323<='z')||(LA18_323>='\u00C0' && LA18_323<='\u00D6')||(LA18_323>='\u00D8' && LA18_323<='\u00F6')||(LA18_323>='\u00F8' && LA18_323<='\u1FFF')||(LA18_323>='\u3040' && LA18_323<='\u318F')||(LA18_323>='\u3300' && LA18_323<='\u337F')||(LA18_323>='\u3400' && LA18_323<='\u3D2D')||(LA18_323>='\u4E00' && LA18_323<='\u9FFF')||(LA18_323>='\uF900' && LA18_323<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=78;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'w':
                {
                int LA18_98 = input.LA(3);

                if ( (LA18_98=='i') ) {
                    int LA18_167 = input.LA(4);

                    if ( (LA18_167=='t') ) {
                        int LA18_225 = input.LA(5);

                        if ( (LA18_225=='c') ) {
                            int LA18_280 = input.LA(6);

                            if ( (LA18_280=='h') ) {
                                int LA18_324 = input.LA(7);

                                if ( (LA18_324=='$'||(LA18_324>='0' && LA18_324<='9')||(LA18_324>='A' && LA18_324<='Z')||LA18_324=='_'||(LA18_324>='a' && LA18_324<='z')||(LA18_324>='\u00C0' && LA18_324<='\u00D6')||(LA18_324>='\u00D8' && LA18_324<='\u00F6')||(LA18_324>='\u00F8' && LA18_324<='\u1FFF')||(LA18_324>='\u3040' && LA18_324<='\u318F')||(LA18_324>='\u3300' && LA18_324<='\u337F')||(LA18_324>='\u3400' && LA18_324<='\u3D2D')||(LA18_324>='\u4E00' && LA18_324<='\u9FFF')||(LA18_324>='\uF900' && LA18_324<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=54;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'o':
                {
                int LA18_99 = input.LA(3);

                if ( (LA18_99=='r') ) {
                    int LA18_168 = input.LA(4);

                    if ( (LA18_168=='t') ) {
                        int LA18_226 = input.LA(5);

                        if ( (LA18_226=='B') ) {
                            int LA18_281 = input.LA(6);

                            if ( (LA18_281=='y') ) {
                                int LA18_325 = input.LA(7);

                                if ( (LA18_325=='$'||(LA18_325>='0' && LA18_325<='9')||(LA18_325>='A' && LA18_325<='Z')||LA18_325=='_'||(LA18_325>='a' && LA18_325<='z')||(LA18_325>='\u00C0' && LA18_325<='\u00D6')||(LA18_325>='\u00D8' && LA18_325<='\u00F6')||(LA18_325>='\u00F8' && LA18_325<='\u1FFF')||(LA18_325>='\u3040' && LA18_325<='\u318F')||(LA18_325>='\u3300' && LA18_325<='\u337F')||(LA18_325>='\u3400' && LA18_325<='\u3D2D')||(LA18_325>='\u4E00' && LA18_325<='\u9FFF')||(LA18_325>='\uF900' && LA18_325<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=83;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='{') ) {
            alt18=55;
        }
        else if ( (LA18_0=='d') ) {
            int LA18_32 = input.LA(2);

            if ( (LA18_32=='e') ) {
                int LA18_100 = input.LA(3);

                if ( (LA18_100=='f') ) {
                    int LA18_169 = input.LA(4);

                    if ( (LA18_169=='a') ) {
                        int LA18_227 = input.LA(5);

                        if ( (LA18_227=='u') ) {
                            int LA18_282 = input.LA(6);

                            if ( (LA18_282=='l') ) {
                                int LA18_326 = input.LA(7);

                                if ( (LA18_326=='t') ) {
                                    int LA18_368 = input.LA(8);

                                    if ( (LA18_368=='$'||(LA18_368>='0' && LA18_368<='9')||(LA18_368>='A' && LA18_368<='Z')||LA18_368=='_'||(LA18_368>='a' && LA18_368<='z')||(LA18_368>='\u00C0' && LA18_368<='\u00D6')||(LA18_368>='\u00D8' && LA18_368<='\u00F6')||(LA18_368>='\u00F8' && LA18_368<='\u1FFF')||(LA18_368>='\u3040' && LA18_368<='\u318F')||(LA18_368>='\u3300' && LA18_368<='\u337F')||(LA18_368>='\u3400' && LA18_368<='\u3D2D')||(LA18_368>='\u4E00' && LA18_368<='\u9FFF')||(LA18_368>='\uF900' && LA18_368<='\uFAFF')) ) {
                                        alt18=94;
                                    }
                                    else {
                                        alt18=56;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
            }
            else {
                alt18=94;}
        }
        else if ( (LA18_0=='}') ) {
            alt18=57;
        }
        else if ( (LA18_0=='|') ) {
            int LA18_34 = input.LA(2);

            if ( (LA18_34=='|') ) {
                alt18=59;
            }
            else {
                alt18=85;}
        }
        else if ( (LA18_0=='&') ) {
            alt18=60;
        }
        else if ( (LA18_0=='!') ) {
            int LA18_36 = input.LA(2);

            if ( (LA18_36=='=') ) {
                alt18=63;
            }
            else {
                alt18=70;}
        }
        else if ( (LA18_0=='>') ) {
            int LA18_37 = input.LA(2);

            if ( (LA18_37=='=') ) {
                alt18=64;
            }
            else {
                alt18=66;}
        }
        else if ( (LA18_0=='<') ) {
            int LA18_38 = input.LA(2);

            if ( (LA18_38=='=') ) {
                alt18=65;
            }
            else {
                alt18=67;}
        }
        else if ( (LA18_0=='+') ) {
            alt18=68;
        }
        else if ( (LA18_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt18=97;
                }
                break;
            case '*':
                {
                alt18=96;
                }
                break;
            default:
                alt18=69;}

        }
        else if ( (LA18_0=='G') ) {
            int LA18_41 = input.LA(2);

            if ( (LA18_41=='L') ) {
                int LA18_112 = input.LA(3);

                if ( (LA18_112=='O') ) {
                    int LA18_170 = input.LA(4);

                    if ( (LA18_170=='B') ) {
                        int LA18_228 = input.LA(5);

                        if ( (LA18_228=='A') ) {
                            int LA18_283 = input.LA(6);

                            if ( (LA18_283=='L') ) {
                                int LA18_327 = input.LA(7);

                                if ( (LA18_327=='V') ) {
                                    int LA18_369 = input.LA(8);

                                    if ( (LA18_369=='A') ) {
                                        int LA18_394 = input.LA(9);

                                        if ( (LA18_394=='R') ) {
                                            int LA18_408 = input.LA(10);

                                            if ( (LA18_408=='$'||(LA18_408>='0' && LA18_408<='9')||(LA18_408>='A' && LA18_408<='Z')||LA18_408=='_'||(LA18_408>='a' && LA18_408<='z')||(LA18_408>='\u00C0' && LA18_408<='\u00D6')||(LA18_408>='\u00D8' && LA18_408<='\u00F6')||(LA18_408>='\u00F8' && LA18_408<='\u1FFF')||(LA18_408>='\u3040' && LA18_408<='\u318F')||(LA18_408>='\u3300' && LA18_408<='\u337F')||(LA18_408>='\u3400' && LA18_408<='\u3D2D')||(LA18_408>='\u4E00' && LA18_408<='\u9FFF')||(LA18_408>='\uF900' && LA18_408<='\uFAFF')) ) {
                                                alt18=94;
                                            }
                                            else {
                                                alt18=71;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
            }
            else {
                alt18=94;}
        }
        else if ( (LA18_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA18_113 = input.LA(3);

                if ( (LA18_113=='l') ) {
                    int LA18_171 = input.LA(4);

                    if ( (LA18_171=='l') ) {
                        int LA18_229 = input.LA(5);

                        if ( (LA18_229=='$'||(LA18_229>='0' && LA18_229<='9')||(LA18_229>='A' && LA18_229<='Z')||LA18_229=='_'||(LA18_229>='a' && LA18_229<='z')||(LA18_229>='\u00C0' && LA18_229<='\u00D6')||(LA18_229>='\u00D8' && LA18_229<='\u00F6')||(LA18_229>='\u00F8' && LA18_229<='\u1FFF')||(LA18_229>='\u3040' && LA18_229<='\u318F')||(LA18_229>='\u3300' && LA18_229<='\u337F')||(LA18_229>='\u3400' && LA18_229<='\u3D2D')||(LA18_229>='\u4E00' && LA18_229<='\u9FFF')||(LA18_229>='\uF900' && LA18_229<='\uFAFF')) ) {
                            alt18=94;
                        }
                        else {
                            alt18=75;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'e':
                {
                int LA18_114 = input.LA(3);

                if ( (LA18_114=='w') ) {
                    int LA18_172 = input.LA(4);

                    if ( (LA18_172=='$'||(LA18_172>='0' && LA18_172<='9')||(LA18_172>='A' && LA18_172<='Z')||LA18_172=='_'||(LA18_172>='a' && LA18_172<='z')||(LA18_172>='\u00C0' && LA18_172<='\u00D6')||(LA18_172>='\u00D8' && LA18_172<='\u00F6')||(LA18_172>='\u00F8' && LA18_172<='\u1FFF')||(LA18_172>='\u3040' && LA18_172<='\u318F')||(LA18_172>='\u3300' && LA18_172<='\u337F')||(LA18_172>='\u3400' && LA18_172<='\u3D2D')||(LA18_172>='\u4E00' && LA18_172<='\u9FFF')||(LA18_172>='\uF900' && LA18_172<='\uFAFF')) ) {
                        alt18=94;
                    }
                    else {
                        alt18=72;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'o':
                {
                int LA18_115 = input.LA(3);

                if ( (LA18_115=='t') ) {
                    int LA18_173 = input.LA(4);

                    if ( (LA18_173=='E') ) {
                        int LA18_231 = input.LA(5);

                        if ( (LA18_231=='x') ) {
                            int LA18_285 = input.LA(6);

                            if ( (LA18_285=='i') ) {
                                int LA18_328 = input.LA(7);

                                if ( (LA18_328=='s') ) {
                                    int LA18_370 = input.LA(8);

                                    if ( (LA18_370=='t') ) {
                                        int LA18_395 = input.LA(9);

                                        if ( (LA18_395=='s') ) {
                                            int LA18_409 = input.LA(10);

                                            if ( (LA18_409=='$'||(LA18_409>='0' && LA18_409<='9')||(LA18_409>='A' && LA18_409<='Z')||LA18_409=='_'||(LA18_409>='a' && LA18_409<='z')||(LA18_409>='\u00C0' && LA18_409<='\u00D6')||(LA18_409>='\u00D8' && LA18_409<='\u00F6')||(LA18_409>='\u00F8' && LA18_409<='\u1FFF')||(LA18_409>='\u3040' && LA18_409<='\u318F')||(LA18_409>='\u3300' && LA18_409<='\u337F')||(LA18_409>='\u3400' && LA18_409<='\u3D2D')||(LA18_409>='\u4E00' && LA18_409<='\u9FFF')||(LA18_409>='\uF900' && LA18_409<='\uFAFF')) ) {
                                                alt18=94;
                                            }
                                            else {
                                                alt18=82;}
                                        }
                                        else {
                                            alt18=94;}
                                    }
                                    else {
                                        alt18=94;}
                                }
                                else {
                                    alt18=94;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA18_116 = input.LA(3);

                if ( (LA18_116=='l') ) {
                    int LA18_174 = input.LA(4);

                    if ( (LA18_174=='s') ) {
                        int LA18_232 = input.LA(5);

                        if ( (LA18_232=='e') ) {
                            int LA18_286 = input.LA(6);

                            if ( (LA18_286=='$'||(LA18_286>='0' && LA18_286<='9')||(LA18_286>='A' && LA18_286<='Z')||LA18_286=='_'||(LA18_286>='a' && LA18_286<='z')||(LA18_286>='\u00C0' && LA18_286<='\u00D6')||(LA18_286>='\u00D8' && LA18_286<='\u00F6')||(LA18_286>='\u00F8' && LA18_286<='\u1FFF')||(LA18_286>='\u3040' && LA18_286<='\u318F')||(LA18_286>='\u3300' && LA18_286<='\u337F')||(LA18_286>='\u3400' && LA18_286<='\u3D2D')||(LA18_286>='\u4E00' && LA18_286<='\u9FFF')||(LA18_286>='\uF900' && LA18_286<='\uFAFF')) ) {
                                alt18=94;
                            }
                            else {
                                alt18=73;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            case 'o':
                {
                int LA18_117 = input.LA(3);

                if ( (LA18_117=='r') ) {
                    int LA18_175 = input.LA(4);

                    if ( (LA18_175=='A') ) {
                        int LA18_233 = input.LA(5);

                        if ( (LA18_233=='l') ) {
                            int LA18_287 = input.LA(6);

                            if ( (LA18_287=='l') ) {
                                int LA18_330 = input.LA(7);

                                if ( (LA18_330=='$'||(LA18_330>='0' && LA18_330<='9')||(LA18_330>='A' && LA18_330<='Z')||LA18_330=='_'||(LA18_330>='a' && LA18_330<='z')||(LA18_330>='\u00C0' && LA18_330<='\u00D6')||(LA18_330>='\u00D8' && LA18_330<='\u00F6')||(LA18_330>='\u00F8' && LA18_330<='\u1FFF')||(LA18_330>='\u3040' && LA18_330<='\u318F')||(LA18_330>='\u3300' && LA18_330<='\u337F')||(LA18_330>='\u3400' && LA18_330<='\u3D2D')||(LA18_330>='\u4E00' && LA18_330<='\u9FFF')||(LA18_330>='\uF900' && LA18_330<='\uFAFF')) ) {
                                    alt18=94;
                                }
                                else {
                                    alt18=84;}
                            }
                            else {
                                alt18=94;}
                        }
                        else {
                            alt18=94;}
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
                }
                break;
            default:
                alt18=94;}

        }
        else if ( (LA18_0=='[') ) {
            alt18=86;
        }
        else if ( (LA18_0==']') ) {
            alt18=87;
        }
        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {
            alt18=88;
        }
        else if ( (LA18_0=='\"'||LA18_0=='\'') ) {
            alt18=89;
        }
        else if ( (LA18_0=='$'||LA18_0=='B'||LA18_0=='H'||LA18_0=='K'||(LA18_0>='M' && LA18_0<='O')||LA18_0=='Q'||(LA18_0>='T' && LA18_0<='V')||(LA18_0>='X' && LA18_0<='Z')||(LA18_0>='^' && LA18_0<='_')||LA18_0=='b'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='k')||LA18_0=='m'||LA18_0=='o'||LA18_0=='q'||(LA18_0>='u' && LA18_0<='z')||(LA18_0>='\u00C0' && LA18_0<='\u00D6')||(LA18_0>='\u00D8' && LA18_0<='\u00F6')||(LA18_0>='\u00F8' && LA18_0<='\u1FFF')||(LA18_0>='\u3040' && LA18_0<='\u318F')||(LA18_0>='\u3300' && LA18_0<='\u337F')||(LA18_0>='\u3400' && LA18_0<='\u3D2D')||(LA18_0>='\u4E00' && LA18_0<='\u9FFF')||(LA18_0>='\uF900' && LA18_0<='\uFAFF')) ) {
            alt18=94;
        }
        else if ( (LA18_0=='R') ) {
            int LA18_49 = input.LA(2);

            if ( (LA18_49=='E') ) {
                int LA18_118 = input.LA(3);

                if ( (LA18_118=='M') ) {
                    int LA18_176 = input.LA(4);

                    if ( (LA18_176=='\u00BB') && (xpandMode)) {
                        alt18=99;
                    }
                    else {
                        alt18=94;}
                }
                else {
                    alt18=94;}
            }
            else {
                alt18=94;}
        }
        else if ( ((LA18_0>='\t' && LA18_0<='\n')||(LA18_0>='\f' && LA18_0<='\r')||LA18_0==' ') ) {
            alt18=95;
        }
        else if ( (LA18_0=='\u00AB') ) {
            int LA18_51 = input.LA(2);

            if ( (LA18_51=='R') && (!xpandMode)) {
                alt18=98;
            }
            else {
                alt18=101;}
        }
        else if ( (LA18_0=='\u00BB') ) {
            int LA18_52 = input.LA(2);

            if ( ((LA18_52>='\u0000' && LA18_52<='\uFFFE')) && (xpandMode)) {
                alt18=100;
            }
            else if ( (xpandMode) ) {
                alt18=100;
            }
            else if ( (true) ) {
                alt18=102;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | IntLiteral | StringLiteral | DEFINE | ENDDEFINE | AROUND | ENDAROUND | Identifier | WS | COMMENT | LINE_COMMENT | REM_COMMENT_OUT | REM_COMMENT | TEXT | LG | RG );", 18, 52, input);

                throw nvae;
            }
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | IntLiteral | StringLiteral | DEFINE | ENDDEFINE | AROUND | ENDAROUND | Identifier | WS | COMMENT | LINE_COMMENT | REM_COMMENT_OUT | REM_COMMENT | TEXT | LG | RG );", 18, 0, input);

            throw nvae;
        }
        switch (alt18) {
            case 1 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:10: T25
                {
                mT25(); 

                }
                break;
            case 2 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:14: T26
                {
                mT26(); 

                }
                break;
            case 3 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:18: T27
                {
                mT27(); 

                }
                break;
            case 4 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:22: T28
                {
                mT28(); 

                }
                break;
            case 5 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:26: T29
                {
                mT29(); 

                }
                break;
            case 6 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:30: T30
                {
                mT30(); 

                }
                break;
            case 7 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:34: T31
                {
                mT31(); 

                }
                break;
            case 8 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:38: T32
                {
                mT32(); 

                }
                break;
            case 9 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:42: T33
                {
                mT33(); 

                }
                break;
            case 10 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:46: T34
                {
                mT34(); 

                }
                break;
            case 11 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:50: T35
                {
                mT35(); 

                }
                break;
            case 12 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:54: T36
                {
                mT36(); 

                }
                break;
            case 13 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:58: T37
                {
                mT37(); 

                }
                break;
            case 14 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:62: T38
                {
                mT38(); 

                }
                break;
            case 15 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:66: T39
                {
                mT39(); 

                }
                break;
            case 16 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:70: T40
                {
                mT40(); 

                }
                break;
            case 17 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:74: T41
                {
                mT41(); 

                }
                break;
            case 18 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:78: T42
                {
                mT42(); 

                }
                break;
            case 19 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:82: T43
                {
                mT43(); 

                }
                break;
            case 20 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:86: T44
                {
                mT44(); 

                }
                break;
            case 21 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:90: T45
                {
                mT45(); 

                }
                break;
            case 22 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:94: T46
                {
                mT46(); 

                }
                break;
            case 23 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:98: T47
                {
                mT47(); 

                }
                break;
            case 24 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:102: T48
                {
                mT48(); 

                }
                break;
            case 25 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:106: T49
                {
                mT49(); 

                }
                break;
            case 26 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:110: T50
                {
                mT50(); 

                }
                break;
            case 27 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:114: T51
                {
                mT51(); 

                }
                break;
            case 28 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:118: T52
                {
                mT52(); 

                }
                break;
            case 29 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:122: T53
                {
                mT53(); 

                }
                break;
            case 30 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:126: T54
                {
                mT54(); 

                }
                break;
            case 31 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:130: T55
                {
                mT55(); 

                }
                break;
            case 32 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:134: T56
                {
                mT56(); 

                }
                break;
            case 33 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:138: T57
                {
                mT57(); 

                }
                break;
            case 34 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:142: T58
                {
                mT58(); 

                }
                break;
            case 35 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:146: T59
                {
                mT59(); 

                }
                break;
            case 36 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:150: T60
                {
                mT60(); 

                }
                break;
            case 37 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:154: T61
                {
                mT61(); 

                }
                break;
            case 38 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:158: T62
                {
                mT62(); 

                }
                break;
            case 39 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:162: T63
                {
                mT63(); 

                }
                break;
            case 40 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:166: T64
                {
                mT64(); 

                }
                break;
            case 41 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:170: T65
                {
                mT65(); 

                }
                break;
            case 42 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:174: T66
                {
                mT66(); 

                }
                break;
            case 43 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:178: T67
                {
                mT67(); 

                }
                break;
            case 44 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:182: T68
                {
                mT68(); 

                }
                break;
            case 45 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:186: T69
                {
                mT69(); 

                }
                break;
            case 46 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:190: T70
                {
                mT70(); 

                }
                break;
            case 47 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:194: T71
                {
                mT71(); 

                }
                break;
            case 48 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:198: T72
                {
                mT72(); 

                }
                break;
            case 49 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:202: T73
                {
                mT73(); 

                }
                break;
            case 50 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:206: T74
                {
                mT74(); 

                }
                break;
            case 51 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:210: T75
                {
                mT75(); 

                }
                break;
            case 52 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:214: T76
                {
                mT76(); 

                }
                break;
            case 53 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:218: T77
                {
                mT77(); 

                }
                break;
            case 54 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:222: T78
                {
                mT78(); 

                }
                break;
            case 55 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:226: T79
                {
                mT79(); 

                }
                break;
            case 56 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:230: T80
                {
                mT80(); 

                }
                break;
            case 57 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:234: T81
                {
                mT81(); 

                }
                break;
            case 58 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:238: T82
                {
                mT82(); 

                }
                break;
            case 59 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:242: T83
                {
                mT83(); 

                }
                break;
            case 60 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:246: T84
                {
                mT84(); 

                }
                break;
            case 61 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:250: T85
                {
                mT85(); 

                }
                break;
            case 62 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:254: T86
                {
                mT86(); 

                }
                break;
            case 63 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:258: T87
                {
                mT87(); 

                }
                break;
            case 64 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:262: T88
                {
                mT88(); 

                }
                break;
            case 65 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:266: T89
                {
                mT89(); 

                }
                break;
            case 66 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:270: T90
                {
                mT90(); 

                }
                break;
            case 67 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:274: T91
                {
                mT91(); 

                }
                break;
            case 68 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:278: T92
                {
                mT92(); 

                }
                break;
            case 69 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:282: T93
                {
                mT93(); 

                }
                break;
            case 70 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:286: T94
                {
                mT94(); 

                }
                break;
            case 71 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:290: T95
                {
                mT95(); 

                }
                break;
            case 72 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:294: T96
                {
                mT96(); 

                }
                break;
            case 73 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:298: T97
                {
                mT97(); 

                }
                break;
            case 74 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:302: T98
                {
                mT98(); 

                }
                break;
            case 75 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:306: T99
                {
                mT99(); 

                }
                break;
            case 76 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:310: T100
                {
                mT100(); 

                }
                break;
            case 77 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:315: T101
                {
                mT101(); 

                }
                break;
            case 78 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:320: T102
                {
                mT102(); 

                }
                break;
            case 79 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:325: T103
                {
                mT103(); 

                }
                break;
            case 80 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:330: T104
                {
                mT104(); 

                }
                break;
            case 81 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:335: T105
                {
                mT105(); 

                }
                break;
            case 82 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:340: T106
                {
                mT106(); 

                }
                break;
            case 83 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:345: T107
                {
                mT107(); 

                }
                break;
            case 84 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:350: T108
                {
                mT108(); 

                }
                break;
            case 85 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:355: T109
                {
                mT109(); 

                }
                break;
            case 86 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:360: T110
                {
                mT110(); 

                }
                break;
            case 87 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:365: T111
                {
                mT111(); 

                }
                break;
            case 88 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:370: IntLiteral
                {
                mIntLiteral(); 

                }
                break;
            case 89 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:381: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 90 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:395: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 91 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:402: ENDDEFINE
                {
                mENDDEFINE(); 

                }
                break;
            case 92 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:412: AROUND
                {
                mAROUND(); 

                }
                break;
            case 93 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:419: ENDAROUND
                {
                mENDAROUND(); 

                }
                break;
            case 94 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:429: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 95 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:440: WS
                {
                mWS(); 

                }
                break;
            case 96 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:443: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 97 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:451: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 98 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:464: REM_COMMENT_OUT
                {
                mREM_COMMENT_OUT(); 

                }
                break;
            case 99 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:480: REM_COMMENT
                {
                mREM_COMMENT(); 

                }
                break;
            case 100 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:492: TEXT
                {
                mTEXT(); 

                }
                break;
            case 101 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:497: LG
                {
                mLG(); 

                }
                break;
            case 102 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:500: RG
                {
                mRG(); 

                }
                break;

        }

    }


 

}