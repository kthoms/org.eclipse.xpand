// $ANTLR 3.0 src/org/eclipse/xpand3/parser/Xpand3.g 2008-02-27 17:07:41
 	
package org.eclipse.xpand3.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Xpand3Lexer extends Lexer {
    public static final int T29=29;
    public static final int HexDigit=17;
    public static final int T70=70;
    public static final int T74=74;
    public static final int REM_COMMENT=23;
    public static final int T85=85;
    public static final int T102=102;
    public static final int Letter=18;
    public static final int T103=103;
    public static final int T32=32;
    public static final int T81=81;
    public static final int T41=41;
    public static final int T24=24;
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
    public static final int Tokens=110;
    public static final int T53=53;
    public static final int OctalEscape=16;
    public static final int T99=99;
    public static final int T27=27;
    public static final int T52=52;
    public static final int T90=90;
    public static final int AROUND=8;

       private boolean xpandMode = false;

    public Xpand3Lexer() {;} 
    public Xpand3Lexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "src/org/eclipse/xpand3/parser/Xpand3.g"; }

    // $ANTLR start T24
    public void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // src/org/eclipse/xpand3/parser/Xpand3.g:9:7: ( 'IMPORT' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:9:7: 'IMPORT'
            {
            match("IMPORT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // src/org/eclipse/xpand3/parser/Xpand3.g:10:7: ( 'EXTENSION' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:10:7: 'EXTENSION'
            {
            match("EXTENSION"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // src/org/eclipse/xpand3/parser/Xpand3.g:11:7: ( 'import' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:11:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // src/org/eclipse/xpand3/parser/Xpand3.g:12:7: ( ';' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:12:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // src/org/eclipse/xpand3/parser/Xpand3.g:13:7: ( 'extension' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:13:7: 'extension'
            {
            match("extension"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // src/org/eclipse/xpand3/parser/Xpand3.g:14:7: ( 'reexport' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:14:7: 'reexport'
            {
            match("reexport"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // src/org/eclipse/xpand3/parser/Xpand3.g:15:7: ( '(' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:15:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // src/org/eclipse/xpand3/parser/Xpand3.g:16:7: ( ',' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:16:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // src/org/eclipse/xpand3/parser/Xpand3.g:17:7: ( '*' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:17:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // src/org/eclipse/xpand3/parser/Xpand3.g:18:7: ( ')' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:18:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // src/org/eclipse/xpand3/parser/Xpand3.g:19:7: ( 'FOR' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:19:7: 'FOR'
            {
            match("FOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // src/org/eclipse/xpand3/parser/Xpand3.g:20:7: ( '-' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:20:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // src/org/eclipse/xpand3/parser/Xpand3.g:21:7: ( 'ERROR' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:21:7: 'ERROR'
            {
            match("ERROR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // src/org/eclipse/xpand3/parser/Xpand3.g:22:7: ( 'EXPAND' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:22:7: 'EXPAND'
            {
            match("EXPAND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // src/org/eclipse/xpand3/parser/Xpand3.g:23:7: ( 'FOREACH' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:23:7: 'FOREACH'
            {
            match("FOREACH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // src/org/eclipse/xpand3/parser/Xpand3.g:24:7: ( 'SEPARATOR' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:24:7: 'SEPARATOR'
            {
            match("SEPARATOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // src/org/eclipse/xpand3/parser/Xpand3.g:25:7: ( 'FILE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:25:7: 'FILE'
            {
            match("FILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // src/org/eclipse/xpand3/parser/Xpand3.g:26:7: ( 'ENDFILE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:26:7: 'ENDFILE'
            {
            match("ENDFILE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // src/org/eclipse/xpand3/parser/Xpand3.g:27:7: ( 'AS' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:27:7: 'AS'
            {
            match("AS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // src/org/eclipse/xpand3/parser/Xpand3.g:28:7: ( 'ITERATOR' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:28:7: 'ITERATOR'
            {
            match("ITERATOR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // src/org/eclipse/xpand3/parser/Xpand3.g:29:7: ( 'ENDFOREACH' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:29:7: 'ENDFOREACH'
            {
            match("ENDFOREACH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // src/org/eclipse/xpand3/parser/Xpand3.g:30:7: ( 'IF' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:30:7: 'IF'
            {
            match("IF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // src/org/eclipse/xpand3/parser/Xpand3.g:31:7: ( 'ENDIF' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:31:7: 'ENDIF'
            {
            match("ENDIF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // src/org/eclipse/xpand3/parser/Xpand3.g:32:7: ( 'ELSEIF' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:32:7: 'ELSEIF'
            {
            match("ELSEIF"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // src/org/eclipse/xpand3/parser/Xpand3.g:33:7: ( 'ELSE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:33:7: 'ELSE'
            {
            match("ELSE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // src/org/eclipse/xpand3/parser/Xpand3.g:34:7: ( 'LET' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:34:7: 'LET'
            {
            match("LET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // src/org/eclipse/xpand3/parser/Xpand3.g:35:7: ( 'ENDLET' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:35:7: 'ENDLET'
            {
            match("ENDLET"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // src/org/eclipse/xpand3/parser/Xpand3.g:36:7: ( 'PROTECT' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:36:7: 'PROTECT'
            {
            match("PROTECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // src/org/eclipse/xpand3/parser/Xpand3.g:37:7: ( 'CSTART' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:37:7: 'CSTART'
            {
            match("CSTART"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // src/org/eclipse/xpand3/parser/Xpand3.g:38:7: ( 'CEND' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:38:7: 'CEND'
            {
            match("CEND"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // src/org/eclipse/xpand3/parser/Xpand3.g:39:7: ( 'ID' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:39:7: 'ID'
            {
            match("ID"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // src/org/eclipse/xpand3/parser/Xpand3.g:40:7: ( 'DISABLE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:40:7: 'DISABLE'
            {
            match("DISABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // src/org/eclipse/xpand3/parser/Xpand3.g:41:7: ( 'ENDPROTECT' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:41:7: 'ENDPROTECT'
            {
            match("ENDPROTECT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // src/org/eclipse/xpand3/parser/Xpand3.g:42:7: ( 'context' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:42:7: 'context'
            {
            match("context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // src/org/eclipse/xpand3/parser/Xpand3.g:43:7: ( 'if' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:43:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // src/org/eclipse/xpand3/parser/Xpand3.g:44:7: ( 'WARNING' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:44:7: 'WARNING'
            {
            match("WARNING"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // src/org/eclipse/xpand3/parser/Xpand3.g:45:7: ( ':' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:45:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // src/org/eclipse/xpand3/parser/Xpand3.g:46:7: ( 'around' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:46:7: 'around'
            {
            match("around"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // src/org/eclipse/xpand3/parser/Xpand3.g:47:7: ( '::' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:47:7: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // src/org/eclipse/xpand3/parser/Xpand3.g:48:7: ( 'private' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:48:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // src/org/eclipse/xpand3/parser/Xpand3.g:49:7: ( 'cached' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:49:7: 'cached'
            {
            match("cached"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // src/org/eclipse/xpand3/parser/Xpand3.g:50:7: ( 'create' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:50:7: 'create'
            {
            match("create"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // src/org/eclipse/xpand3/parser/Xpand3.g:51:7: ( 'JAVA' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:51:7: 'JAVA'
            {
            match("JAVA"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // src/org/eclipse/xpand3/parser/Xpand3.g:52:7: ( '.' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:52:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // src/org/eclipse/xpand3/parser/Xpand3.g:53:7: ( 'Collection' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:53:7: 'Collection'
            {
            match("Collection"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // src/org/eclipse/xpand3/parser/Xpand3.g:54:7: ( 'List' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:54:7: 'List'
            {
            match("List"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // src/org/eclipse/xpand3/parser/Xpand3.g:55:7: ( 'Set' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:55:7: 'Set'
            {
            match("Set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // src/org/eclipse/xpand3/parser/Xpand3.g:56:7: ( 'let' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:56:7: 'let'
            {
            match("let"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // src/org/eclipse/xpand3/parser/Xpand3.g:57:7: ( '=' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:57:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // src/org/eclipse/xpand3/parser/Xpand3.g:58:7: ( '->' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:58:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // src/org/eclipse/xpand3/parser/Xpand3.g:59:7: ( '?' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:59:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // src/org/eclipse/xpand3/parser/Xpand3.g:60:7: ( 'then' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:60:7: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // src/org/eclipse/xpand3/parser/Xpand3.g:61:7: ( 'else' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:61:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // src/org/eclipse/xpand3/parser/Xpand3.g:62:7: ( 'switch' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:62:7: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // src/org/eclipse/xpand3/parser/Xpand3.g:63:7: ( 'default' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:63:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // src/org/eclipse/xpand3/parser/Xpand3.g:64:7: ( '}' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:64:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // src/org/eclipse/xpand3/parser/Xpand3.g:65:7: ( 'case' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:65:7: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // src/org/eclipse/xpand3/parser/Xpand3.g:66:7: ( '||' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:66:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // src/org/eclipse/xpand3/parser/Xpand3.g:67:7: ( '&&' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:67:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // src/org/eclipse/xpand3/parser/Xpand3.g:68:7: ( 'implies' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:68:7: 'implies'
            {
            match("implies"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // src/org/eclipse/xpand3/parser/Xpand3.g:69:7: ( '==' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:69:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // src/org/eclipse/xpand3/parser/Xpand3.g:70:7: ( '!=' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:70:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // src/org/eclipse/xpand3/parser/Xpand3.g:71:7: ( '>=' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:71:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // src/org/eclipse/xpand3/parser/Xpand3.g:72:7: ( '<=' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:72:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // src/org/eclipse/xpand3/parser/Xpand3.g:73:7: ( '>' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:73:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // src/org/eclipse/xpand3/parser/Xpand3.g:74:7: ( '<' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:74:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // src/org/eclipse/xpand3/parser/Xpand3.g:75:7: ( '+' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:75:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // src/org/eclipse/xpand3/parser/Xpand3.g:76:7: ( '/' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:76:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // src/org/eclipse/xpand3/parser/Xpand3.g:77:7: ( '!' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:77:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // src/org/eclipse/xpand3/parser/Xpand3.g:78:7: ( 'GLOBALVAR' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:78:7: 'GLOBALVAR'
            {
            match("GLOBALVAR"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start T94
    public void mT94() throws RecognitionException {
        try {
            int _type = T94;
            // src/org/eclipse/xpand3/parser/Xpand3.g:79:7: ( '[' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:79:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T94

    // $ANTLR start T95
    public void mT95() throws RecognitionException {
        try {
            int _type = T95;
            // src/org/eclipse/xpand3/parser/Xpand3.g:80:7: ( ']' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:80:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T95

    // $ANTLR start T96
    public void mT96() throws RecognitionException {
        try {
            int _type = T96;
            // src/org/eclipse/xpand3/parser/Xpand3.g:81:7: ( 'new' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:81:7: 'new'
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
    public void mT97() throws RecognitionException {
        try {
            int _type = T97;
            // src/org/eclipse/xpand3/parser/Xpand3.g:82:7: ( 'false' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:82:7: 'false'
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
    public void mT98() throws RecognitionException {
        try {
            int _type = T98;
            // src/org/eclipse/xpand3/parser/Xpand3.g:83:7: ( 'true' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:83:7: 'true'
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
    public void mT99() throws RecognitionException {
        try {
            int _type = T99;
            // src/org/eclipse/xpand3/parser/Xpand3.g:84:7: ( 'null' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:84:7: 'null'
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
    public void mT100() throws RecognitionException {
        try {
            int _type = T100;
            // src/org/eclipse/xpand3/parser/Xpand3.g:85:8: ( 'typeSelect' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:85:8: 'typeSelect'
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
    public void mT101() throws RecognitionException {
        try {
            int _type = T101;
            // src/org/eclipse/xpand3/parser/Xpand3.g:86:8: ( 'collect' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:86:8: 'collect'
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
    public void mT102() throws RecognitionException {
        try {
            int _type = T102;
            // src/org/eclipse/xpand3/parser/Xpand3.g:87:8: ( 'select' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:87:8: 'select'
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
    public void mT103() throws RecognitionException {
        try {
            int _type = T103;
            // src/org/eclipse/xpand3/parser/Xpand3.g:88:8: ( 'selectFirst' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:88:8: 'selectFirst'
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
    public void mT104() throws RecognitionException {
        try {
            int _type = T104;
            // src/org/eclipse/xpand3/parser/Xpand3.g:89:8: ( 'reject' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:89:8: 'reject'
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
    public void mT105() throws RecognitionException {
        try {
            int _type = T105;
            // src/org/eclipse/xpand3/parser/Xpand3.g:90:8: ( 'exists' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:90:8: 'exists'
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
    public void mT106() throws RecognitionException {
        try {
            int _type = T106;
            // src/org/eclipse/xpand3/parser/Xpand3.g:91:8: ( 'notExists' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:91:8: 'notExists'
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
    public void mT107() throws RecognitionException {
        try {
            int _type = T107;
            // src/org/eclipse/xpand3/parser/Xpand3.g:92:8: ( 'sortBy' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:92:8: 'sortBy'
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
    public void mT108() throws RecognitionException {
        try {
            int _type = T108;
            // src/org/eclipse/xpand3/parser/Xpand3.g:93:8: ( 'forAll' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:93:8: 'forAll'
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
    public void mT109() throws RecognitionException {
        try {
            int _type = T109;
            // src/org/eclipse/xpand3/parser/Xpand3.g:94:8: ( '|' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:94:8: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T109

    // $ANTLR start IntLiteral
    public void mIntLiteral() throws RecognitionException {
        try {
            int _type = IntLiteral;
            // src/org/eclipse/xpand3/parser/Xpand3.g:349:14: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // src/org/eclipse/xpand3/parser/Xpand3.g:349:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:349:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    new NoViableAltException("349:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:349:15: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:349:21: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:349:30: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:349:30: '0' .. '9'
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
    public void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // src/org/eclipse/xpand3/parser/Xpand3.g:352:8: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
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
                    new NoViableAltException("351:1: StringLiteral : ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:352:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:352:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
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
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:352:14: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:352:31: ~ ( '\\\\' | '\"' )
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
                    // src/org/eclipse/xpand3/parser/Xpand3.g:353:8: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
                    {
                    match('\''); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:353:13: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
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
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:353:15: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // src/org/eclipse/xpand3/parser/Xpand3.g:353:32: ~ ( '\\'' | '\\\\' )
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
    public void mEscapeSequence() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:358:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
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
                        new NoViableAltException("356:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("356:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:358:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // src/org/eclipse/xpand3/parser/Xpand3.g:359:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:360:9: OctalEscape
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
    public void mOctalEscape() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:365:9: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                        new NoViableAltException("363:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("363:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:365:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:365:14: ( '0' .. '3' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:365:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // src/org/eclipse/xpand3/parser/Xpand3.g:365:25: ( '0' .. '7' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:365:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // src/org/eclipse/xpand3/parser/Xpand3.g:365:36: ( '0' .. '7' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:365:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:366:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:366:14: ( '0' .. '7' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:366:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // src/org/eclipse/xpand3/parser/Xpand3.g:366:25: ( '0' .. '7' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:366:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:367:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/xpand3/parser/Xpand3.g:367:14: ( '0' .. '7' )
                    // src/org/eclipse/xpand3/parser/Xpand3.g:367:15: '0' .. '7'
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
    public void mUnicodeEscape() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:372:9: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // src/org/eclipse/xpand3/parser/Xpand3.g:372:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
    public void mHexDigit() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:375:12: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // src/org/eclipse/xpand3/parser/Xpand3.g:375:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
    public void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            // src/org/eclipse/xpand3/parser/Xpand3.g:378:11: ( 'DEFINE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:378:11: 'DEFINE'
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
    public void mENDDEFINE() throws RecognitionException {
        try {
            int _type = ENDDEFINE;
            // src/org/eclipse/xpand3/parser/Xpand3.g:380:4: ( 'ENDDEFINE' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:380:4: 'ENDDEFINE'
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
    public void mAROUND() throws RecognitionException {
        try {
            int _type = AROUND;
            // src/org/eclipse/xpand3/parser/Xpand3.g:382:11: ( 'AROUND' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:382:11: 'AROUND'
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
    public void mENDAROUND() throws RecognitionException {
        try {
            int _type = ENDAROUND;
            // src/org/eclipse/xpand3/parser/Xpand3.g:383:13: ( 'ENDAROUND' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:383:13: 'ENDAROUND'
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
    public void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            // src/org/eclipse/xpand3/parser/Xpand3.g:386:9: ( ( '^' )? Letter ( Letter | JavaIDDigit )* )
            // src/org/eclipse/xpand3/parser/Xpand3.g:386:9: ( '^' )? Letter ( Letter | JavaIDDigit )*
            {
            // src/org/eclipse/xpand3/parser/Xpand3.g:386:9: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:386:10: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            mLetter(); 
            // src/org/eclipse/xpand3/parser/Xpand3.g:386:23: ( Letter | JavaIDDigit )*
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
    public void mLetter() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:391:8: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
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
    public void mJavaIDDigit() throws RecognitionException {
        try {
            // src/org/eclipse/xpand3/parser/Xpand3.g:408:8: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
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
    public void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // src/org/eclipse/xpand3/parser/Xpand3.g:425:8: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // src/org/eclipse/xpand3/parser/Xpand3.g:425:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
    public void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // src/org/eclipse/xpand3/parser/Xpand3.g:429:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:429:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // src/org/eclipse/xpand3/parser/Xpand3.g:429:14: ( options {greedy=false; } : . )*
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:429:42: .
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
    public void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            // src/org/eclipse/xpand3/parser/Xpand3.g:433:7: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF ) )
            // src/org/eclipse/xpand3/parser/Xpand3.g:433:7: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF )
            {
            match("//"); 

            // src/org/eclipse/xpand3/parser/Xpand3.g:433:12: (~ ( '\\n' | '\\r' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:433:12: ~ ( '\\n' | '\\r' )
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

            // src/org/eclipse/xpand3/parser/Xpand3.g:433:26: ( ( '\\r' )? '\\n' | EOF )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            else {
                alt13=2;}
            switch (alt13) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:433:27: ( '\\r' )? '\\n'
                    {
                    // src/org/eclipse/xpand3/parser/Xpand3.g:433:27: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // src/org/eclipse/xpand3/parser/Xpand3.g:433:27: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;
                case 2 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:433:38: EOF
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

    // $ANTLR start REM_COMMENT
    public void mREM_COMMENT() throws RecognitionException {
        try {
            int _type = REM_COMMENT;
            // src/org/eclipse/xpand3/parser/Xpand3.g:437:2: ( 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:437:2: 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM'
            {
            match("REM"); 

            mRG(); 
            // src/org/eclipse/xpand3/parser/Xpand3.g:437:11: ( options {greedy=false; } : . )*
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
                                            alt14=2;
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
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:437:39: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
    public void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            // src/org/eclipse/xpand3/parser/Xpand3.g:442:3: ({...}? RG (~ ( LG ) )* ( LG )? )
            // src/org/eclipse/xpand3/parser/Xpand3.g:442:3: {...}? RG (~ ( LG ) )* ( LG )?
            {
            if ( !(xpandMode) ) {
                throw new FailedPredicateException(input, "TEXT", "xpandMode");
            }
            mRG(); 
            // src/org/eclipse/xpand3/parser/Xpand3.g:442:19: (~ ( LG ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\u00AA')||(LA15_0>='\u00AC' && LA15_0<='\uFFFE')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/org/eclipse/xpand3/parser/Xpand3.g:442:19: ~ ( LG )
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
            	    break loop15;
                }
            } while (true);

            // src/org/eclipse/xpand3/parser/Xpand3.g:442:26: ( LG )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\u00AB') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // src/org/eclipse/xpand3/parser/Xpand3.g:442:27: LG
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
    public void mLG() throws RecognitionException {
        try {
            int _type = LG;
            // src/org/eclipse/xpand3/parser/Xpand3.g:446:4: ( '\\u00AB' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:446:4: '\\u00AB'
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
    public void mRG() throws RecognitionException {
        try {
            int _type = RG;
            // src/org/eclipse/xpand3/parser/Xpand3.g:448:4: ( '\\u00BB' )
            // src/org/eclipse/xpand3/parser/Xpand3.g:448:4: '\\u00BB'
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
        // src/org/eclipse/xpand3/parser/Xpand3.g:1:10: ( T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | IntLiteral | StringLiteral | DEFINE | ENDDEFINE | AROUND | ENDAROUND | Identifier | WS | COMMENT | LINE_COMMENT | REM_COMMENT | TEXT | LG | RG )
        int alt17=100;
        int LA17_0 = input.LA(1);

        if ( (LA17_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'F':
                {
                int LA17_52 = input.LA(3);

                if ( (LA17_52=='$'||(LA17_52>='0' && LA17_52<='9')||(LA17_52>='A' && LA17_52<='Z')||LA17_52=='_'||(LA17_52>='a' && LA17_52<='z')||(LA17_52>='\u00C0' && LA17_52<='\u00D6')||(LA17_52>='\u00D8' && LA17_52<='\u00F6')||(LA17_52>='\u00F8' && LA17_52<='\u1FFF')||(LA17_52>='\u3040' && LA17_52<='\u318F')||(LA17_52>='\u3300' && LA17_52<='\u337F')||(LA17_52>='\u3400' && LA17_52<='\u3D2D')||(LA17_52>='\u4E00' && LA17_52<='\u9FFF')||(LA17_52>='\uF900' && LA17_52<='\uFAFF')) ) {
                    alt17=93;
                }
                else {
                    alt17=22;}
                }
                break;
            case 'T':
                {
                int LA17_53 = input.LA(3);

                if ( (LA17_53=='E') ) {
                    int LA17_121 = input.LA(4);

                    if ( (LA17_121=='R') ) {
                        int LA17_175 = input.LA(5);

                        if ( (LA17_175=='A') ) {
                            int LA17_232 = input.LA(6);

                            if ( (LA17_232=='T') ) {
                                int LA17_285 = input.LA(7);

                                if ( (LA17_285=='O') ) {
                                    int LA17_328 = input.LA(8);

                                    if ( (LA17_328=='R') ) {
                                        int LA17_369 = input.LA(9);

                                        if ( (LA17_369=='$'||(LA17_369>='0' && LA17_369<='9')||(LA17_369>='A' && LA17_369<='Z')||LA17_369=='_'||(LA17_369>='a' && LA17_369<='z')||(LA17_369>='\u00C0' && LA17_369<='\u00D6')||(LA17_369>='\u00D8' && LA17_369<='\u00F6')||(LA17_369>='\u00F8' && LA17_369<='\u1FFF')||(LA17_369>='\u3040' && LA17_369<='\u318F')||(LA17_369>='\u3300' && LA17_369<='\u337F')||(LA17_369>='\u3400' && LA17_369<='\u3D2D')||(LA17_369>='\u4E00' && LA17_369<='\u9FFF')||(LA17_369>='\uF900' && LA17_369<='\uFAFF')) ) {
                                            alt17=93;
                                        }
                                        else {
                                            alt17=20;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'D':
                {
                int LA17_54 = input.LA(3);

                if ( (LA17_54=='$'||(LA17_54>='0' && LA17_54<='9')||(LA17_54>='A' && LA17_54<='Z')||LA17_54=='_'||(LA17_54>='a' && LA17_54<='z')||(LA17_54>='\u00C0' && LA17_54<='\u00D6')||(LA17_54>='\u00D8' && LA17_54<='\u00F6')||(LA17_54>='\u00F8' && LA17_54<='\u1FFF')||(LA17_54>='\u3040' && LA17_54<='\u318F')||(LA17_54>='\u3300' && LA17_54<='\u337F')||(LA17_54>='\u3400' && LA17_54<='\u3D2D')||(LA17_54>='\u4E00' && LA17_54<='\u9FFF')||(LA17_54>='\uF900' && LA17_54<='\uFAFF')) ) {
                    alt17=93;
                }
                else {
                    alt17=31;}
                }
                break;
            case 'M':
                {
                int LA17_55 = input.LA(3);

                if ( (LA17_55=='P') ) {
                    int LA17_123 = input.LA(4);

                    if ( (LA17_123=='O') ) {
                        int LA17_176 = input.LA(5);

                        if ( (LA17_176=='R') ) {
                            int LA17_233 = input.LA(6);

                            if ( (LA17_233=='T') ) {
                                int LA17_286 = input.LA(7);

                                if ( (LA17_286=='$'||(LA17_286>='0' && LA17_286<='9')||(LA17_286>='A' && LA17_286<='Z')||LA17_286=='_'||(LA17_286>='a' && LA17_286<='z')||(LA17_286>='\u00C0' && LA17_286<='\u00D6')||(LA17_286>='\u00D8' && LA17_286<='\u00F6')||(LA17_286>='\u00F8' && LA17_286<='\u1FFF')||(LA17_286>='\u3040' && LA17_286<='\u318F')||(LA17_286>='\u3300' && LA17_286<='\u337F')||(LA17_286>='\u3400' && LA17_286<='\u3D2D')||(LA17_286>='\u4E00' && LA17_286<='\u9FFF')||(LA17_286>='\uF900' && LA17_286<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=1;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='E') ) {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA17_56 = input.LA(3);

                if ( (LA17_56=='D') ) {
                    switch ( input.LA(4) ) {
                    case 'F':
                        {
                        switch ( input.LA(5) ) {
                        case 'O':
                            {
                            int LA17_234 = input.LA(6);

                            if ( (LA17_234=='R') ) {
                                int LA17_287 = input.LA(7);

                                if ( (LA17_287=='E') ) {
                                    int LA17_330 = input.LA(8);

                                    if ( (LA17_330=='A') ) {
                                        int LA17_370 = input.LA(9);

                                        if ( (LA17_370=='C') ) {
                                            int LA17_394 = input.LA(10);

                                            if ( (LA17_394=='H') ) {
                                                int LA17_407 = input.LA(11);

                                                if ( (LA17_407=='$'||(LA17_407>='0' && LA17_407<='9')||(LA17_407>='A' && LA17_407<='Z')||LA17_407=='_'||(LA17_407>='a' && LA17_407<='z')||(LA17_407>='\u00C0' && LA17_407<='\u00D6')||(LA17_407>='\u00D8' && LA17_407<='\u00F6')||(LA17_407>='\u00F8' && LA17_407<='\u1FFF')||(LA17_407>='\u3040' && LA17_407<='\u318F')||(LA17_407>='\u3300' && LA17_407<='\u337F')||(LA17_407>='\u3400' && LA17_407<='\u3D2D')||(LA17_407>='\u4E00' && LA17_407<='\u9FFF')||(LA17_407>='\uF900' && LA17_407<='\uFAFF')) ) {
                                                    alt17=93;
                                                }
                                                else {
                                                    alt17=21;}
                                            }
                                            else {
                                                alt17=93;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                            }
                            break;
                        case 'I':
                            {
                            int LA17_235 = input.LA(6);

                            if ( (LA17_235=='L') ) {
                                int LA17_288 = input.LA(7);

                                if ( (LA17_288=='E') ) {
                                    int LA17_331 = input.LA(8);

                                    if ( (LA17_331=='$'||(LA17_331>='0' && LA17_331<='9')||(LA17_331>='A' && LA17_331<='Z')||LA17_331=='_'||(LA17_331>='a' && LA17_331<='z')||(LA17_331>='\u00C0' && LA17_331<='\u00D6')||(LA17_331>='\u00D8' && LA17_331<='\u00F6')||(LA17_331>='\u00F8' && LA17_331<='\u1FFF')||(LA17_331>='\u3040' && LA17_331<='\u318F')||(LA17_331>='\u3300' && LA17_331<='\u337F')||(LA17_331>='\u3400' && LA17_331<='\u3D2D')||(LA17_331>='\u4E00' && LA17_331<='\u9FFF')||(LA17_331>='\uF900' && LA17_331<='\uFAFF')) ) {
                                        alt17=93;
                                    }
                                    else {
                                        alt17=18;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                            }
                            break;
                        default:
                            alt17=93;}

                        }
                        break;
                    case 'L':
                        {
                        int LA17_178 = input.LA(5);

                        if ( (LA17_178=='E') ) {
                            int LA17_236 = input.LA(6);

                            if ( (LA17_236=='T') ) {
                                int LA17_289 = input.LA(7);

                                if ( (LA17_289=='$'||(LA17_289>='0' && LA17_289<='9')||(LA17_289>='A' && LA17_289<='Z')||LA17_289=='_'||(LA17_289>='a' && LA17_289<='z')||(LA17_289>='\u00C0' && LA17_289<='\u00D6')||(LA17_289>='\u00D8' && LA17_289<='\u00F6')||(LA17_289>='\u00F8' && LA17_289<='\u1FFF')||(LA17_289>='\u3040' && LA17_289<='\u318F')||(LA17_289>='\u3300' && LA17_289<='\u337F')||(LA17_289>='\u3400' && LA17_289<='\u3D2D')||(LA17_289>='\u4E00' && LA17_289<='\u9FFF')||(LA17_289>='\uF900' && LA17_289<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=27;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                        }
                        break;
                    case 'A':
                        {
                        int LA17_179 = input.LA(5);

                        if ( (LA17_179=='R') ) {
                            int LA17_237 = input.LA(6);

                            if ( (LA17_237=='O') ) {
                                int LA17_290 = input.LA(7);

                                if ( (LA17_290=='U') ) {
                                    int LA17_333 = input.LA(8);

                                    if ( (LA17_333=='N') ) {
                                        int LA17_372 = input.LA(9);

                                        if ( (LA17_372=='D') ) {
                                            int LA17_395 = input.LA(10);

                                            if ( (LA17_395=='$'||(LA17_395>='0' && LA17_395<='9')||(LA17_395>='A' && LA17_395<='Z')||LA17_395=='_'||(LA17_395>='a' && LA17_395<='z')||(LA17_395>='\u00C0' && LA17_395<='\u00D6')||(LA17_395>='\u00D8' && LA17_395<='\u00F6')||(LA17_395>='\u00F8' && LA17_395<='\u1FFF')||(LA17_395>='\u3040' && LA17_395<='\u318F')||(LA17_395>='\u3300' && LA17_395<='\u337F')||(LA17_395>='\u3400' && LA17_395<='\u3D2D')||(LA17_395>='\u4E00' && LA17_395<='\u9FFF')||(LA17_395>='\uF900' && LA17_395<='\uFAFF')) ) {
                                                alt17=93;
                                            }
                                            else {
                                                alt17=92;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                        }
                        break;
                    case 'I':
                        {
                        int LA17_180 = input.LA(5);

                        if ( (LA17_180=='F') ) {
                            int LA17_238 = input.LA(6);

                            if ( (LA17_238=='$'||(LA17_238>='0' && LA17_238<='9')||(LA17_238>='A' && LA17_238<='Z')||LA17_238=='_'||(LA17_238>='a' && LA17_238<='z')||(LA17_238>='\u00C0' && LA17_238<='\u00D6')||(LA17_238>='\u00D8' && LA17_238<='\u00F6')||(LA17_238>='\u00F8' && LA17_238<='\u1FFF')||(LA17_238>='\u3040' && LA17_238<='\u318F')||(LA17_238>='\u3300' && LA17_238<='\u337F')||(LA17_238>='\u3400' && LA17_238<='\u3D2D')||(LA17_238>='\u4E00' && LA17_238<='\u9FFF')||(LA17_238>='\uF900' && LA17_238<='\uFAFF')) ) {
                                alt17=93;
                            }
                            else {
                                alt17=23;}
                        }
                        else {
                            alt17=93;}
                        }
                        break;
                    case 'P':
                        {
                        int LA17_181 = input.LA(5);

                        if ( (LA17_181=='R') ) {
                            int LA17_239 = input.LA(6);

                            if ( (LA17_239=='O') ) {
                                int LA17_292 = input.LA(7);

                                if ( (LA17_292=='T') ) {
                                    int LA17_334 = input.LA(8);

                                    if ( (LA17_334=='E') ) {
                                        int LA17_373 = input.LA(9);

                                        if ( (LA17_373=='C') ) {
                                            int LA17_396 = input.LA(10);

                                            if ( (LA17_396=='T') ) {
                                                int LA17_409 = input.LA(11);

                                                if ( (LA17_409=='$'||(LA17_409>='0' && LA17_409<='9')||(LA17_409>='A' && LA17_409<='Z')||LA17_409=='_'||(LA17_409>='a' && LA17_409<='z')||(LA17_409>='\u00C0' && LA17_409<='\u00D6')||(LA17_409>='\u00D8' && LA17_409<='\u00F6')||(LA17_409>='\u00F8' && LA17_409<='\u1FFF')||(LA17_409>='\u3040' && LA17_409<='\u318F')||(LA17_409>='\u3300' && LA17_409<='\u337F')||(LA17_409>='\u3400' && LA17_409<='\u3D2D')||(LA17_409>='\u4E00' && LA17_409<='\u9FFF')||(LA17_409>='\uF900' && LA17_409<='\uFAFF')) ) {
                                                    alt17=93;
                                                }
                                                else {
                                                    alt17=33;}
                                            }
                                            else {
                                                alt17=93;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                        }
                        break;
                    case 'D':
                        {
                        int LA17_182 = input.LA(5);

                        if ( (LA17_182=='E') ) {
                            int LA17_240 = input.LA(6);

                            if ( (LA17_240=='F') ) {
                                int LA17_293 = input.LA(7);

                                if ( (LA17_293=='I') ) {
                                    int LA17_335 = input.LA(8);

                                    if ( (LA17_335=='N') ) {
                                        int LA17_374 = input.LA(9);

                                        if ( (LA17_374=='E') ) {
                                            int LA17_397 = input.LA(10);

                                            if ( (LA17_397=='$'||(LA17_397>='0' && LA17_397<='9')||(LA17_397>='A' && LA17_397<='Z')||LA17_397=='_'||(LA17_397>='a' && LA17_397<='z')||(LA17_397>='\u00C0' && LA17_397<='\u00D6')||(LA17_397>='\u00D8' && LA17_397<='\u00F6')||(LA17_397>='\u00F8' && LA17_397<='\u1FFF')||(LA17_397>='\u3040' && LA17_397<='\u318F')||(LA17_397>='\u3300' && LA17_397<='\u337F')||(LA17_397>='\u3400' && LA17_397<='\u3D2D')||(LA17_397>='\u4E00' && LA17_397<='\u9FFF')||(LA17_397>='\uF900' && LA17_397<='\uFAFF')) ) {
                                                alt17=93;
                                            }
                                            else {
                                                alt17=90;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                        }
                        break;
                    default:
                        alt17=93;}

                }
                else {
                    alt17=93;}
                }
                break;
            case 'L':
                {
                int LA17_57 = input.LA(3);

                if ( (LA17_57=='S') ) {
                    int LA17_125 = input.LA(4);

                    if ( (LA17_125=='E') ) {
                        int LA17_183 = input.LA(5);

                        if ( (LA17_183=='I') ) {
                            int LA17_241 = input.LA(6);

                            if ( (LA17_241=='F') ) {
                                int LA17_294 = input.LA(7);

                                if ( (LA17_294=='$'||(LA17_294>='0' && LA17_294<='9')||(LA17_294>='A' && LA17_294<='Z')||LA17_294=='_'||(LA17_294>='a' && LA17_294<='z')||(LA17_294>='\u00C0' && LA17_294<='\u00D6')||(LA17_294>='\u00D8' && LA17_294<='\u00F6')||(LA17_294>='\u00F8' && LA17_294<='\u1FFF')||(LA17_294>='\u3040' && LA17_294<='\u318F')||(LA17_294>='\u3300' && LA17_294<='\u337F')||(LA17_294>='\u3400' && LA17_294<='\u3D2D')||(LA17_294>='\u4E00' && LA17_294<='\u9FFF')||(LA17_294>='\uF900' && LA17_294<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=24;}
                            }
                            else {
                                alt17=93;}
                        }
                        else if ( (LA17_183=='$'||(LA17_183>='0' && LA17_183<='9')||(LA17_183>='A' && LA17_183<='H')||(LA17_183>='J' && LA17_183<='Z')||LA17_183=='_'||(LA17_183>='a' && LA17_183<='z')||(LA17_183>='\u00C0' && LA17_183<='\u00D6')||(LA17_183>='\u00D8' && LA17_183<='\u00F6')||(LA17_183>='\u00F8' && LA17_183<='\u1FFF')||(LA17_183>='\u3040' && LA17_183<='\u318F')||(LA17_183>='\u3300' && LA17_183<='\u337F')||(LA17_183>='\u3400' && LA17_183<='\u3D2D')||(LA17_183>='\u4E00' && LA17_183<='\u9FFF')||(LA17_183>='\uF900' && LA17_183<='\uFAFF')) ) {
                            alt17=93;
                        }
                        else {
                            alt17=25;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'X':
                {
                switch ( input.LA(3) ) {
                case 'P':
                    {
                    int LA17_126 = input.LA(4);

                    if ( (LA17_126=='A') ) {
                        int LA17_184 = input.LA(5);

                        if ( (LA17_184=='N') ) {
                            int LA17_243 = input.LA(6);

                            if ( (LA17_243=='D') ) {
                                int LA17_295 = input.LA(7);

                                if ( (LA17_295=='$'||(LA17_295>='0' && LA17_295<='9')||(LA17_295>='A' && LA17_295<='Z')||LA17_295=='_'||(LA17_295>='a' && LA17_295<='z')||(LA17_295>='\u00C0' && LA17_295<='\u00D6')||(LA17_295>='\u00D8' && LA17_295<='\u00F6')||(LA17_295>='\u00F8' && LA17_295<='\u1FFF')||(LA17_295>='\u3040' && LA17_295<='\u318F')||(LA17_295>='\u3300' && LA17_295<='\u337F')||(LA17_295>='\u3400' && LA17_295<='\u3D2D')||(LA17_295>='\u4E00' && LA17_295<='\u9FFF')||(LA17_295>='\uF900' && LA17_295<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=14;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                    }
                    break;
                case 'T':
                    {
                    int LA17_127 = input.LA(4);

                    if ( (LA17_127=='E') ) {
                        int LA17_185 = input.LA(5);

                        if ( (LA17_185=='N') ) {
                            int LA17_244 = input.LA(6);

                            if ( (LA17_244=='S') ) {
                                int LA17_296 = input.LA(7);

                                if ( (LA17_296=='I') ) {
                                    int LA17_338 = input.LA(8);

                                    if ( (LA17_338=='O') ) {
                                        int LA17_375 = input.LA(9);

                                        if ( (LA17_375=='N') ) {
                                            int LA17_398 = input.LA(10);

                                            if ( (LA17_398=='$'||(LA17_398>='0' && LA17_398<='9')||(LA17_398>='A' && LA17_398<='Z')||LA17_398=='_'||(LA17_398>='a' && LA17_398<='z')||(LA17_398>='\u00C0' && LA17_398<='\u00D6')||(LA17_398>='\u00D8' && LA17_398<='\u00F6')||(LA17_398>='\u00F8' && LA17_398<='\u1FFF')||(LA17_398>='\u3040' && LA17_398<='\u318F')||(LA17_398>='\u3300' && LA17_398<='\u337F')||(LA17_398>='\u3400' && LA17_398<='\u3D2D')||(LA17_398>='\u4E00' && LA17_398<='\u9FFF')||(LA17_398>='\uF900' && LA17_398<='\uFAFF')) ) {
                                                alt17=93;
                                            }
                                            else {
                                                alt17=2;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                    }
                    break;
                default:
                    alt17=93;}

                }
                break;
            case 'R':
                {
                int LA17_59 = input.LA(3);

                if ( (LA17_59=='R') ) {
                    int LA17_128 = input.LA(4);

                    if ( (LA17_128=='O') ) {
                        int LA17_186 = input.LA(5);

                        if ( (LA17_186=='R') ) {
                            int LA17_245 = input.LA(6);

                            if ( (LA17_245=='$'||(LA17_245>='0' && LA17_245<='9')||(LA17_245>='A' && LA17_245<='Z')||LA17_245=='_'||(LA17_245>='a' && LA17_245<='z')||(LA17_245>='\u00C0' && LA17_245<='\u00D6')||(LA17_245>='\u00D8' && LA17_245<='\u00F6')||(LA17_245>='\u00F8' && LA17_245<='\u1FFF')||(LA17_245>='\u3040' && LA17_245<='\u318F')||(LA17_245>='\u3300' && LA17_245<='\u337F')||(LA17_245>='\u3400' && LA17_245<='\u3D2D')||(LA17_245>='\u4E00' && LA17_245<='\u9FFF')||(LA17_245>='\uF900' && LA17_245<='\uFAFF')) ) {
                                alt17=93;
                            }
                            else {
                                alt17=13;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA17_60 = input.LA(3);

                if ( (LA17_60=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA17_187 = input.LA(5);

                        if ( (LA17_187=='r') ) {
                            int LA17_246 = input.LA(6);

                            if ( (LA17_246=='t') ) {
                                int LA17_298 = input.LA(7);

                                if ( (LA17_298=='$'||(LA17_298>='0' && LA17_298<='9')||(LA17_298>='A' && LA17_298<='Z')||LA17_298=='_'||(LA17_298>='a' && LA17_298<='z')||(LA17_298>='\u00C0' && LA17_298<='\u00D6')||(LA17_298>='\u00D8' && LA17_298<='\u00F6')||(LA17_298>='\u00F8' && LA17_298<='\u1FFF')||(LA17_298>='\u3040' && LA17_298<='\u318F')||(LA17_298>='\u3300' && LA17_298<='\u337F')||(LA17_298>='\u3400' && LA17_298<='\u3D2D')||(LA17_298>='\u4E00' && LA17_298<='\u9FFF')||(LA17_298>='\uF900' && LA17_298<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=3;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                        }
                        break;
                    case 'l':
                        {
                        int LA17_188 = input.LA(5);

                        if ( (LA17_188=='i') ) {
                            int LA17_247 = input.LA(6);

                            if ( (LA17_247=='e') ) {
                                int LA17_299 = input.LA(7);

                                if ( (LA17_299=='s') ) {
                                    int LA17_340 = input.LA(8);

                                    if ( (LA17_340=='$'||(LA17_340>='0' && LA17_340<='9')||(LA17_340>='A' && LA17_340<='Z')||LA17_340=='_'||(LA17_340>='a' && LA17_340<='z')||(LA17_340>='\u00C0' && LA17_340<='\u00D6')||(LA17_340>='\u00D8' && LA17_340<='\u00F6')||(LA17_340>='\u00F8' && LA17_340<='\u1FFF')||(LA17_340>='\u3040' && LA17_340<='\u318F')||(LA17_340>='\u3300' && LA17_340<='\u337F')||(LA17_340>='\u3400' && LA17_340<='\u3D2D')||(LA17_340>='\u4E00' && LA17_340<='\u9FFF')||(LA17_340>='\uF900' && LA17_340<='\uFAFF')) ) {
                                        alt17=93;
                                    }
                                    else {
                                        alt17=60;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                        }
                        break;
                    default:
                        alt17=93;}

                }
                else {
                    alt17=93;}
                }
                break;
            case 'f':
                {
                int LA17_61 = input.LA(3);

                if ( (LA17_61=='$'||(LA17_61>='0' && LA17_61<='9')||(LA17_61>='A' && LA17_61<='Z')||LA17_61=='_'||(LA17_61>='a' && LA17_61<='z')||(LA17_61>='\u00C0' && LA17_61<='\u00D6')||(LA17_61>='\u00D8' && LA17_61<='\u00F6')||(LA17_61>='\u00F8' && LA17_61<='\u1FFF')||(LA17_61>='\u3040' && LA17_61<='\u318F')||(LA17_61>='\u3300' && LA17_61<='\u337F')||(LA17_61>='\u3400' && LA17_61<='\u3D2D')||(LA17_61>='\u4E00' && LA17_61<='\u9FFF')||(LA17_61>='\uF900' && LA17_61<='\uFAFF')) ) {
                    alt17=93;
                }
                else {
                    alt17=35;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0==';') ) {
            alt17=4;
        }
        else if ( (LA17_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA17_62 = input.LA(3);

                if ( (LA17_62=='s') ) {
                    int LA17_131 = input.LA(4);

                    if ( (LA17_131=='e') ) {
                        int LA17_189 = input.LA(5);

                        if ( (LA17_189=='$'||(LA17_189>='0' && LA17_189<='9')||(LA17_189>='A' && LA17_189<='Z')||LA17_189=='_'||(LA17_189>='a' && LA17_189<='z')||(LA17_189>='\u00C0' && LA17_189<='\u00D6')||(LA17_189>='\u00D8' && LA17_189<='\u00F6')||(LA17_189>='\u00F8' && LA17_189<='\u1FFF')||(LA17_189>='\u3040' && LA17_189<='\u318F')||(LA17_189>='\u3300' && LA17_189<='\u337F')||(LA17_189>='\u3400' && LA17_189<='\u3D2D')||(LA17_189>='\u4E00' && LA17_189<='\u9FFF')||(LA17_189>='\uF900' && LA17_189<='\uFAFF')) ) {
                            alt17=93;
                        }
                        else {
                            alt17=53;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA17_132 = input.LA(4);

                    if ( (LA17_132=='e') ) {
                        int LA17_190 = input.LA(5);

                        if ( (LA17_190=='n') ) {
                            int LA17_249 = input.LA(6);

                            if ( (LA17_249=='s') ) {
                                int LA17_300 = input.LA(7);

                                if ( (LA17_300=='i') ) {
                                    int LA17_341 = input.LA(8);

                                    if ( (LA17_341=='o') ) {
                                        int LA17_377 = input.LA(9);

                                        if ( (LA17_377=='n') ) {
                                            int LA17_399 = input.LA(10);

                                            if ( (LA17_399=='$'||(LA17_399>='0' && LA17_399<='9')||(LA17_399>='A' && LA17_399<='Z')||LA17_399=='_'||(LA17_399>='a' && LA17_399<='z')||(LA17_399>='\u00C0' && LA17_399<='\u00D6')||(LA17_399>='\u00D8' && LA17_399<='\u00F6')||(LA17_399>='\u00F8' && LA17_399<='\u1FFF')||(LA17_399>='\u3040' && LA17_399<='\u318F')||(LA17_399>='\u3300' && LA17_399<='\u337F')||(LA17_399>='\u3400' && LA17_399<='\u3D2D')||(LA17_399>='\u4E00' && LA17_399<='\u9FFF')||(LA17_399>='\uF900' && LA17_399<='\uFAFF')) ) {
                                                alt17=93;
                                            }
                                            else {
                                                alt17=5;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                    }
                    break;
                case 'i':
                    {
                    int LA17_133 = input.LA(4);

                    if ( (LA17_133=='s') ) {
                        int LA17_191 = input.LA(5);

                        if ( (LA17_191=='t') ) {
                            int LA17_250 = input.LA(6);

                            if ( (LA17_250=='s') ) {
                                int LA17_301 = input.LA(7);

                                if ( (LA17_301=='$'||(LA17_301>='0' && LA17_301<='9')||(LA17_301>='A' && LA17_301<='Z')||LA17_301=='_'||(LA17_301>='a' && LA17_301<='z')||(LA17_301>='\u00C0' && LA17_301<='\u00D6')||(LA17_301>='\u00D8' && LA17_301<='\u00F6')||(LA17_301>='\u00F8' && LA17_301<='\u1FFF')||(LA17_301>='\u3040' && LA17_301<='\u318F')||(LA17_301>='\u3300' && LA17_301<='\u337F')||(LA17_301>='\u3400' && LA17_301<='\u3D2D')||(LA17_301>='\u4E00' && LA17_301<='\u9FFF')||(LA17_301>='\uF900' && LA17_301<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=82;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                    }
                    break;
                default:
                    alt17=93;}

                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='r') ) {
            int LA17_6 = input.LA(2);

            if ( (LA17_6=='e') ) {
                switch ( input.LA(3) ) {
                case 'j':
                    {
                    int LA17_134 = input.LA(4);

                    if ( (LA17_134=='e') ) {
                        int LA17_192 = input.LA(5);

                        if ( (LA17_192=='c') ) {
                            int LA17_251 = input.LA(6);

                            if ( (LA17_251=='t') ) {
                                int LA17_302 = input.LA(7);

                                if ( (LA17_302=='$'||(LA17_302>='0' && LA17_302<='9')||(LA17_302>='A' && LA17_302<='Z')||LA17_302=='_'||(LA17_302>='a' && LA17_302<='z')||(LA17_302>='\u00C0' && LA17_302<='\u00D6')||(LA17_302>='\u00D8' && LA17_302<='\u00F6')||(LA17_302>='\u00F8' && LA17_302<='\u1FFF')||(LA17_302>='\u3040' && LA17_302<='\u318F')||(LA17_302>='\u3300' && LA17_302<='\u337F')||(LA17_302>='\u3400' && LA17_302<='\u3D2D')||(LA17_302>='\u4E00' && LA17_302<='\u9FFF')||(LA17_302>='\uF900' && LA17_302<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=81;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                    }
                    break;
                case 'e':
                    {
                    int LA17_135 = input.LA(4);

                    if ( (LA17_135=='x') ) {
                        int LA17_193 = input.LA(5);

                        if ( (LA17_193=='p') ) {
                            int LA17_252 = input.LA(6);

                            if ( (LA17_252=='o') ) {
                                int LA17_303 = input.LA(7);

                                if ( (LA17_303=='r') ) {
                                    int LA17_344 = input.LA(8);

                                    if ( (LA17_344=='t') ) {
                                        int LA17_378 = input.LA(9);

                                        if ( (LA17_378=='$'||(LA17_378>='0' && LA17_378<='9')||(LA17_378>='A' && LA17_378<='Z')||LA17_378=='_'||(LA17_378>='a' && LA17_378<='z')||(LA17_378>='\u00C0' && LA17_378<='\u00D6')||(LA17_378>='\u00D8' && LA17_378<='\u00F6')||(LA17_378>='\u00F8' && LA17_378<='\u1FFF')||(LA17_378>='\u3040' && LA17_378<='\u318F')||(LA17_378>='\u3300' && LA17_378<='\u337F')||(LA17_378>='\u3400' && LA17_378<='\u3D2D')||(LA17_378>='\u4E00' && LA17_378<='\u9FFF')||(LA17_378>='\uF900' && LA17_378<='\uFAFF')) ) {
                                            alt17=93;
                                        }
                                        else {
                                            alt17=6;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                    }
                    break;
                default:
                    alt17=93;}

            }
            else {
                alt17=93;}
        }
        else if ( (LA17_0=='(') ) {
            alt17=7;
        }
        else if ( (LA17_0==',') ) {
            alt17=8;
        }
        else if ( (LA17_0=='*') ) {
            alt17=9;
        }
        else if ( (LA17_0==')') ) {
            alt17=10;
        }
        else if ( (LA17_0=='F') ) {
            switch ( input.LA(2) ) {
            case 'O':
                {
                int LA17_65 = input.LA(3);

                if ( (LA17_65=='R') ) {
                    int LA17_136 = input.LA(4);

                    if ( (LA17_136=='E') ) {
                        int LA17_194 = input.LA(5);

                        if ( (LA17_194=='A') ) {
                            int LA17_253 = input.LA(6);

                            if ( (LA17_253=='C') ) {
                                int LA17_304 = input.LA(7);

                                if ( (LA17_304=='H') ) {
                                    int LA17_345 = input.LA(8);

                                    if ( (LA17_345=='$'||(LA17_345>='0' && LA17_345<='9')||(LA17_345>='A' && LA17_345<='Z')||LA17_345=='_'||(LA17_345>='a' && LA17_345<='z')||(LA17_345>='\u00C0' && LA17_345<='\u00D6')||(LA17_345>='\u00D8' && LA17_345<='\u00F6')||(LA17_345>='\u00F8' && LA17_345<='\u1FFF')||(LA17_345>='\u3040' && LA17_345<='\u318F')||(LA17_345>='\u3300' && LA17_345<='\u337F')||(LA17_345>='\u3400' && LA17_345<='\u3D2D')||(LA17_345>='\u4E00' && LA17_345<='\u9FFF')||(LA17_345>='\uF900' && LA17_345<='\uFAFF')) ) {
                                        alt17=93;
                                    }
                                    else {
                                        alt17=15;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else if ( (LA17_136=='$'||(LA17_136>='0' && LA17_136<='9')||(LA17_136>='A' && LA17_136<='D')||(LA17_136>='F' && LA17_136<='Z')||LA17_136=='_'||(LA17_136>='a' && LA17_136<='z')||(LA17_136>='\u00C0' && LA17_136<='\u00D6')||(LA17_136>='\u00D8' && LA17_136<='\u00F6')||(LA17_136>='\u00F8' && LA17_136<='\u1FFF')||(LA17_136>='\u3040' && LA17_136<='\u318F')||(LA17_136>='\u3300' && LA17_136<='\u337F')||(LA17_136>='\u3400' && LA17_136<='\u3D2D')||(LA17_136>='\u4E00' && LA17_136<='\u9FFF')||(LA17_136>='\uF900' && LA17_136<='\uFAFF')) ) {
                        alt17=93;
                    }
                    else {
                        alt17=11;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'I':
                {
                int LA17_66 = input.LA(3);

                if ( (LA17_66=='L') ) {
                    int LA17_137 = input.LA(4);

                    if ( (LA17_137=='E') ) {
                        int LA17_196 = input.LA(5);

                        if ( (LA17_196=='$'||(LA17_196>='0' && LA17_196<='9')||(LA17_196>='A' && LA17_196<='Z')||LA17_196=='_'||(LA17_196>='a' && LA17_196<='z')||(LA17_196>='\u00C0' && LA17_196<='\u00D6')||(LA17_196>='\u00D8' && LA17_196<='\u00F6')||(LA17_196>='\u00F8' && LA17_196<='\u1FFF')||(LA17_196>='\u3040' && LA17_196<='\u318F')||(LA17_196>='\u3300' && LA17_196<='\u337F')||(LA17_196>='\u3400' && LA17_196<='\u3D2D')||(LA17_196>='\u4E00' && LA17_196<='\u9FFF')||(LA17_196>='\uF900' && LA17_196<='\uFAFF')) ) {
                            alt17=93;
                        }
                        else {
                            alt17=17;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='-') ) {
            int LA17_12 = input.LA(2);

            if ( (LA17_12=='>') ) {
                alt17=50;
            }
            else {
                alt17=12;}
        }
        else if ( (LA17_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA17_69 = input.LA(3);

                if ( (LA17_69=='t') ) {
                    int LA17_138 = input.LA(4);

                    if ( (LA17_138=='$'||(LA17_138>='0' && LA17_138<='9')||(LA17_138>='A' && LA17_138<='Z')||LA17_138=='_'||(LA17_138>='a' && LA17_138<='z')||(LA17_138>='\u00C0' && LA17_138<='\u00D6')||(LA17_138>='\u00D8' && LA17_138<='\u00F6')||(LA17_138>='\u00F8' && LA17_138<='\u1FFF')||(LA17_138>='\u3040' && LA17_138<='\u318F')||(LA17_138>='\u3300' && LA17_138<='\u337F')||(LA17_138>='\u3400' && LA17_138<='\u3D2D')||(LA17_138>='\u4E00' && LA17_138<='\u9FFF')||(LA17_138>='\uF900' && LA17_138<='\uFAFF')) ) {
                        alt17=93;
                    }
                    else {
                        alt17=47;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'E':
                {
                int LA17_70 = input.LA(3);

                if ( (LA17_70=='P') ) {
                    int LA17_139 = input.LA(4);

                    if ( (LA17_139=='A') ) {
                        int LA17_198 = input.LA(5);

                        if ( (LA17_198=='R') ) {
                            int LA17_255 = input.LA(6);

                            if ( (LA17_255=='A') ) {
                                int LA17_305 = input.LA(7);

                                if ( (LA17_305=='T') ) {
                                    int LA17_346 = input.LA(8);

                                    if ( (LA17_346=='O') ) {
                                        int LA17_380 = input.LA(9);

                                        if ( (LA17_380=='R') ) {
                                            int LA17_401 = input.LA(10);

                                            if ( (LA17_401=='$'||(LA17_401>='0' && LA17_401<='9')||(LA17_401>='A' && LA17_401<='Z')||LA17_401=='_'||(LA17_401>='a' && LA17_401<='z')||(LA17_401>='\u00C0' && LA17_401<='\u00D6')||(LA17_401>='\u00D8' && LA17_401<='\u00F6')||(LA17_401>='\u00F8' && LA17_401<='\u1FFF')||(LA17_401>='\u3040' && LA17_401<='\u318F')||(LA17_401>='\u3300' && LA17_401<='\u337F')||(LA17_401>='\u3400' && LA17_401<='\u3D2D')||(LA17_401>='\u4E00' && LA17_401<='\u9FFF')||(LA17_401>='\uF900' && LA17_401<='\uFAFF')) ) {
                                                alt17=93;
                                            }
                                            else {
                                                alt17=16;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'R':
                {
                int LA17_71 = input.LA(3);

                if ( (LA17_71=='O') ) {
                    int LA17_140 = input.LA(4);

                    if ( (LA17_140=='U') ) {
                        int LA17_199 = input.LA(5);

                        if ( (LA17_199=='N') ) {
                            int LA17_256 = input.LA(6);

                            if ( (LA17_256=='D') ) {
                                int LA17_306 = input.LA(7);

                                if ( (LA17_306=='$'||(LA17_306>='0' && LA17_306<='9')||(LA17_306>='A' && LA17_306<='Z')||LA17_306=='_'||(LA17_306>='a' && LA17_306<='z')||(LA17_306>='\u00C0' && LA17_306<='\u00D6')||(LA17_306>='\u00D8' && LA17_306<='\u00F6')||(LA17_306>='\u00F8' && LA17_306<='\u1FFF')||(LA17_306>='\u3040' && LA17_306<='\u318F')||(LA17_306>='\u3300' && LA17_306<='\u337F')||(LA17_306>='\u3400' && LA17_306<='\u3D2D')||(LA17_306>='\u4E00' && LA17_306<='\u9FFF')||(LA17_306>='\uF900' && LA17_306<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=91;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'S':
                {
                int LA17_72 = input.LA(3);

                if ( (LA17_72=='$'||(LA17_72>='0' && LA17_72<='9')||(LA17_72>='A' && LA17_72<='Z')||LA17_72=='_'||(LA17_72>='a' && LA17_72<='z')||(LA17_72>='\u00C0' && LA17_72<='\u00D6')||(LA17_72>='\u00D8' && LA17_72<='\u00F6')||(LA17_72>='\u00F8' && LA17_72<='\u1FFF')||(LA17_72>='\u3040' && LA17_72<='\u318F')||(LA17_72>='\u3300' && LA17_72<='\u337F')||(LA17_72>='\u3400' && LA17_72<='\u3D2D')||(LA17_72>='\u4E00' && LA17_72<='\u9FFF')||(LA17_72>='\uF900' && LA17_72<='\uFAFF')) ) {
                    alt17=93;
                }
                else {
                    alt17=19;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='L') ) {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA17_73 = input.LA(3);

                if ( (LA17_73=='T') ) {
                    int LA17_142 = input.LA(4);

                    if ( (LA17_142=='$'||(LA17_142>='0' && LA17_142<='9')||(LA17_142>='A' && LA17_142<='Z')||LA17_142=='_'||(LA17_142>='a' && LA17_142<='z')||(LA17_142>='\u00C0' && LA17_142<='\u00D6')||(LA17_142>='\u00D8' && LA17_142<='\u00F6')||(LA17_142>='\u00F8' && LA17_142<='\u1FFF')||(LA17_142>='\u3040' && LA17_142<='\u318F')||(LA17_142>='\u3300' && LA17_142<='\u337F')||(LA17_142>='\u3400' && LA17_142<='\u3D2D')||(LA17_142>='\u4E00' && LA17_142<='\u9FFF')||(LA17_142>='\uF900' && LA17_142<='\uFAFF')) ) {
                        alt17=93;
                    }
                    else {
                        alt17=26;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'i':
                {
                int LA17_74 = input.LA(3);

                if ( (LA17_74=='s') ) {
                    int LA17_143 = input.LA(4);

                    if ( (LA17_143=='t') ) {
                        int LA17_201 = input.LA(5);

                        if ( (LA17_201=='$'||(LA17_201>='0' && LA17_201<='9')||(LA17_201>='A' && LA17_201<='Z')||LA17_201=='_'||(LA17_201>='a' && LA17_201<='z')||(LA17_201>='\u00C0' && LA17_201<='\u00D6')||(LA17_201>='\u00D8' && LA17_201<='\u00F6')||(LA17_201>='\u00F8' && LA17_201<='\u1FFF')||(LA17_201>='\u3040' && LA17_201<='\u318F')||(LA17_201>='\u3300' && LA17_201<='\u337F')||(LA17_201>='\u3400' && LA17_201<='\u3D2D')||(LA17_201>='\u4E00' && LA17_201<='\u9FFF')||(LA17_201>='\uF900' && LA17_201<='\uFAFF')) ) {
                            alt17=93;
                        }
                        else {
                            alt17=46;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='P') ) {
            int LA17_16 = input.LA(2);

            if ( (LA17_16=='R') ) {
                int LA17_75 = input.LA(3);

                if ( (LA17_75=='O') ) {
                    int LA17_144 = input.LA(4);

                    if ( (LA17_144=='T') ) {
                        int LA17_202 = input.LA(5);

                        if ( (LA17_202=='E') ) {
                            int LA17_258 = input.LA(6);

                            if ( (LA17_258=='C') ) {
                                int LA17_307 = input.LA(7);

                                if ( (LA17_307=='T') ) {
                                    int LA17_348 = input.LA(8);

                                    if ( (LA17_348=='$'||(LA17_348>='0' && LA17_348<='9')||(LA17_348>='A' && LA17_348<='Z')||LA17_348=='_'||(LA17_348>='a' && LA17_348<='z')||(LA17_348>='\u00C0' && LA17_348<='\u00D6')||(LA17_348>='\u00D8' && LA17_348<='\u00F6')||(LA17_348>='\u00F8' && LA17_348<='\u1FFF')||(LA17_348>='\u3040' && LA17_348<='\u318F')||(LA17_348>='\u3300' && LA17_348<='\u337F')||(LA17_348>='\u3400' && LA17_348<='\u3D2D')||(LA17_348>='\u4E00' && LA17_348<='\u9FFF')||(LA17_348>='\uF900' && LA17_348<='\uFAFF')) ) {
                                        alt17=93;
                                    }
                                    else {
                                        alt17=28;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
            }
            else {
                alt17=93;}
        }
        else if ( (LA17_0=='C') ) {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA17_76 = input.LA(3);

                if ( (LA17_76=='N') ) {
                    int LA17_145 = input.LA(4);

                    if ( (LA17_145=='D') ) {
                        int LA17_203 = input.LA(5);

                        if ( (LA17_203=='$'||(LA17_203>='0' && LA17_203<='9')||(LA17_203>='A' && LA17_203<='Z')||LA17_203=='_'||(LA17_203>='a' && LA17_203<='z')||(LA17_203>='\u00C0' && LA17_203<='\u00D6')||(LA17_203>='\u00D8' && LA17_203<='\u00F6')||(LA17_203>='\u00F8' && LA17_203<='\u1FFF')||(LA17_203>='\u3040' && LA17_203<='\u318F')||(LA17_203>='\u3300' && LA17_203<='\u337F')||(LA17_203>='\u3400' && LA17_203<='\u3D2D')||(LA17_203>='\u4E00' && LA17_203<='\u9FFF')||(LA17_203>='\uF900' && LA17_203<='\uFAFF')) ) {
                            alt17=93;
                        }
                        else {
                            alt17=30;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'o':
                {
                int LA17_77 = input.LA(3);

                if ( (LA17_77=='l') ) {
                    int LA17_146 = input.LA(4);

                    if ( (LA17_146=='l') ) {
                        int LA17_204 = input.LA(5);

                        if ( (LA17_204=='e') ) {
                            int LA17_260 = input.LA(6);

                            if ( (LA17_260=='c') ) {
                                int LA17_308 = input.LA(7);

                                if ( (LA17_308=='t') ) {
                                    int LA17_349 = input.LA(8);

                                    if ( (LA17_349=='i') ) {
                                        int LA17_382 = input.LA(9);

                                        if ( (LA17_382=='o') ) {
                                            int LA17_402 = input.LA(10);

                                            if ( (LA17_402=='n') ) {
                                                int LA17_414 = input.LA(11);

                                                if ( (LA17_414=='$'||(LA17_414>='0' && LA17_414<='9')||(LA17_414>='A' && LA17_414<='Z')||LA17_414=='_'||(LA17_414>='a' && LA17_414<='z')||(LA17_414>='\u00C0' && LA17_414<='\u00D6')||(LA17_414>='\u00D8' && LA17_414<='\u00F6')||(LA17_414>='\u00F8' && LA17_414<='\u1FFF')||(LA17_414>='\u3040' && LA17_414<='\u318F')||(LA17_414>='\u3300' && LA17_414<='\u337F')||(LA17_414>='\u3400' && LA17_414<='\u3D2D')||(LA17_414>='\u4E00' && LA17_414<='\u9FFF')||(LA17_414>='\uF900' && LA17_414<='\uFAFF')) ) {
                                                    alt17=93;
                                                }
                                                else {
                                                    alt17=45;}
                                            }
                                            else {
                                                alt17=93;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'S':
                {
                int LA17_78 = input.LA(3);

                if ( (LA17_78=='T') ) {
                    int LA17_147 = input.LA(4);

                    if ( (LA17_147=='A') ) {
                        int LA17_205 = input.LA(5);

                        if ( (LA17_205=='R') ) {
                            int LA17_261 = input.LA(6);

                            if ( (LA17_261=='T') ) {
                                int LA17_309 = input.LA(7);

                                if ( (LA17_309=='$'||(LA17_309>='0' && LA17_309<='9')||(LA17_309>='A' && LA17_309<='Z')||LA17_309=='_'||(LA17_309>='a' && LA17_309<='z')||(LA17_309>='\u00C0' && LA17_309<='\u00D6')||(LA17_309>='\u00D8' && LA17_309<='\u00F6')||(LA17_309>='\u00F8' && LA17_309<='\u1FFF')||(LA17_309>='\u3040' && LA17_309<='\u318F')||(LA17_309>='\u3300' && LA17_309<='\u337F')||(LA17_309>='\u3400' && LA17_309<='\u3D2D')||(LA17_309>='\u4E00' && LA17_309<='\u9FFF')||(LA17_309>='\uF900' && LA17_309<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=29;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA17_79 = input.LA(3);

                if ( (LA17_79=='F') ) {
                    int LA17_148 = input.LA(4);

                    if ( (LA17_148=='I') ) {
                        int LA17_206 = input.LA(5);

                        if ( (LA17_206=='N') ) {
                            int LA17_262 = input.LA(6);

                            if ( (LA17_262=='E') ) {
                                int LA17_310 = input.LA(7);

                                if ( (LA17_310=='$'||(LA17_310>='0' && LA17_310<='9')||(LA17_310>='A' && LA17_310<='Z')||LA17_310=='_'||(LA17_310>='a' && LA17_310<='z')||(LA17_310>='\u00C0' && LA17_310<='\u00D6')||(LA17_310>='\u00D8' && LA17_310<='\u00F6')||(LA17_310>='\u00F8' && LA17_310<='\u1FFF')||(LA17_310>='\u3040' && LA17_310<='\u318F')||(LA17_310>='\u3300' && LA17_310<='\u337F')||(LA17_310>='\u3400' && LA17_310<='\u3D2D')||(LA17_310>='\u4E00' && LA17_310<='\u9FFF')||(LA17_310>='\uF900' && LA17_310<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=89;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'I':
                {
                int LA17_80 = input.LA(3);

                if ( (LA17_80=='S') ) {
                    int LA17_149 = input.LA(4);

                    if ( (LA17_149=='A') ) {
                        int LA17_207 = input.LA(5);

                        if ( (LA17_207=='B') ) {
                            int LA17_263 = input.LA(6);

                            if ( (LA17_263=='L') ) {
                                int LA17_311 = input.LA(7);

                                if ( (LA17_311=='E') ) {
                                    int LA17_352 = input.LA(8);

                                    if ( (LA17_352=='$'||(LA17_352>='0' && LA17_352<='9')||(LA17_352>='A' && LA17_352<='Z')||LA17_352=='_'||(LA17_352>='a' && LA17_352<='z')||(LA17_352>='\u00C0' && LA17_352<='\u00D6')||(LA17_352>='\u00D8' && LA17_352<='\u00F6')||(LA17_352>='\u00F8' && LA17_352<='\u1FFF')||(LA17_352>='\u3040' && LA17_352<='\u318F')||(LA17_352>='\u3300' && LA17_352<='\u337F')||(LA17_352>='\u3400' && LA17_352<='\u3D2D')||(LA17_352>='\u4E00' && LA17_352<='\u9FFF')||(LA17_352>='\uF900' && LA17_352<='\uFAFF')) ) {
                                        alt17=93;
                                    }
                                    else {
                                        alt17=32;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA17_81 = input.LA(3);

                if ( (LA17_81=='e') ) {
                    int LA17_150 = input.LA(4);

                    if ( (LA17_150=='a') ) {
                        int LA17_208 = input.LA(5);

                        if ( (LA17_208=='t') ) {
                            int LA17_264 = input.LA(6);

                            if ( (LA17_264=='e') ) {
                                int LA17_312 = input.LA(7);

                                if ( (LA17_312=='$'||(LA17_312>='0' && LA17_312<='9')||(LA17_312>='A' && LA17_312<='Z')||LA17_312=='_'||(LA17_312>='a' && LA17_312<='z')||(LA17_312>='\u00C0' && LA17_312<='\u00D6')||(LA17_312>='\u00D8' && LA17_312<='\u00F6')||(LA17_312>='\u00F8' && LA17_312<='\u1FFF')||(LA17_312>='\u3040' && LA17_312<='\u318F')||(LA17_312>='\u3300' && LA17_312<='\u337F')||(LA17_312>='\u3400' && LA17_312<='\u3D2D')||(LA17_312>='\u4E00' && LA17_312<='\u9FFF')||(LA17_312>='\uF900' && LA17_312<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=42;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA17_151 = input.LA(4);

                    if ( (LA17_151=='l') ) {
                        int LA17_209 = input.LA(5);

                        if ( (LA17_209=='e') ) {
                            int LA17_265 = input.LA(6);

                            if ( (LA17_265=='c') ) {
                                int LA17_313 = input.LA(7);

                                if ( (LA17_313=='t') ) {
                                    int LA17_354 = input.LA(8);

                                    if ( (LA17_354=='$'||(LA17_354>='0' && LA17_354<='9')||(LA17_354>='A' && LA17_354<='Z')||LA17_354=='_'||(LA17_354>='a' && LA17_354<='z')||(LA17_354>='\u00C0' && LA17_354<='\u00D6')||(LA17_354>='\u00D8' && LA17_354<='\u00F6')||(LA17_354>='\u00F8' && LA17_354<='\u1FFF')||(LA17_354>='\u3040' && LA17_354<='\u318F')||(LA17_354>='\u3300' && LA17_354<='\u337F')||(LA17_354>='\u3400' && LA17_354<='\u3D2D')||(LA17_354>='\u4E00' && LA17_354<='\u9FFF')||(LA17_354>='\uF900' && LA17_354<='\uFAFF')) ) {
                                        alt17=93;
                                    }
                                    else {
                                        alt17=78;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                    }
                    break;
                case 'n':
                    {
                    int LA17_152 = input.LA(4);

                    if ( (LA17_152=='t') ) {
                        int LA17_210 = input.LA(5);

                        if ( (LA17_210=='e') ) {
                            int LA17_266 = input.LA(6);

                            if ( (LA17_266=='x') ) {
                                int LA17_314 = input.LA(7);

                                if ( (LA17_314=='t') ) {
                                    int LA17_355 = input.LA(8);

                                    if ( (LA17_355=='$'||(LA17_355>='0' && LA17_355<='9')||(LA17_355>='A' && LA17_355<='Z')||LA17_355=='_'||(LA17_355>='a' && LA17_355<='z')||(LA17_355>='\u00C0' && LA17_355<='\u00D6')||(LA17_355>='\u00D8' && LA17_355<='\u00F6')||(LA17_355>='\u00F8' && LA17_355<='\u1FFF')||(LA17_355>='\u3040' && LA17_355<='\u318F')||(LA17_355>='\u3300' && LA17_355<='\u337F')||(LA17_355>='\u3400' && LA17_355<='\u3D2D')||(LA17_355>='\u4E00' && LA17_355<='\u9FFF')||(LA17_355>='\uF900' && LA17_355<='\uFAFF')) ) {
                                        alt17=93;
                                    }
                                    else {
                                        alt17=34;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                    }
                    break;
                default:
                    alt17=93;}

                }
                break;
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA17_153 = input.LA(4);

                    if ( (LA17_153=='e') ) {
                        int LA17_211 = input.LA(5);

                        if ( (LA17_211=='$'||(LA17_211>='0' && LA17_211<='9')||(LA17_211>='A' && LA17_211<='Z')||LA17_211=='_'||(LA17_211>='a' && LA17_211<='z')||(LA17_211>='\u00C0' && LA17_211<='\u00D6')||(LA17_211>='\u00D8' && LA17_211<='\u00F6')||(LA17_211>='\u00F8' && LA17_211<='\u1FFF')||(LA17_211>='\u3040' && LA17_211<='\u318F')||(LA17_211>='\u3300' && LA17_211<='\u337F')||(LA17_211>='\u3400' && LA17_211<='\u3D2D')||(LA17_211>='\u4E00' && LA17_211<='\u9FFF')||(LA17_211>='\uF900' && LA17_211<='\uFAFF')) ) {
                            alt17=93;
                        }
                        else {
                            alt17=57;}
                    }
                    else {
                        alt17=93;}
                    }
                    break;
                case 'c':
                    {
                    int LA17_154 = input.LA(4);

                    if ( (LA17_154=='h') ) {
                        int LA17_212 = input.LA(5);

                        if ( (LA17_212=='e') ) {
                            int LA17_268 = input.LA(6);

                            if ( (LA17_268=='d') ) {
                                int LA17_315 = input.LA(7);

                                if ( (LA17_315=='$'||(LA17_315>='0' && LA17_315<='9')||(LA17_315>='A' && LA17_315<='Z')||LA17_315=='_'||(LA17_315>='a' && LA17_315<='z')||(LA17_315>='\u00C0' && LA17_315<='\u00D6')||(LA17_315>='\u00D8' && LA17_315<='\u00F6')||(LA17_315>='\u00F8' && LA17_315<='\u1FFF')||(LA17_315>='\u3040' && LA17_315<='\u318F')||(LA17_315>='\u3300' && LA17_315<='\u337F')||(LA17_315>='\u3400' && LA17_315<='\u3D2D')||(LA17_315>='\u4E00' && LA17_315<='\u9FFF')||(LA17_315>='\uF900' && LA17_315<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=41;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                    }
                    break;
                default:
                    alt17=93;}

                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='W') ) {
            int LA17_20 = input.LA(2);

            if ( (LA17_20=='A') ) {
                int LA17_84 = input.LA(3);

                if ( (LA17_84=='R') ) {
                    int LA17_155 = input.LA(4);

                    if ( (LA17_155=='N') ) {
                        int LA17_213 = input.LA(5);

                        if ( (LA17_213=='I') ) {
                            int LA17_269 = input.LA(6);

                            if ( (LA17_269=='N') ) {
                                int LA17_316 = input.LA(7);

                                if ( (LA17_316=='G') ) {
                                    int LA17_357 = input.LA(8);

                                    if ( (LA17_357=='$'||(LA17_357>='0' && LA17_357<='9')||(LA17_357>='A' && LA17_357<='Z')||LA17_357=='_'||(LA17_357>='a' && LA17_357<='z')||(LA17_357>='\u00C0' && LA17_357<='\u00D6')||(LA17_357>='\u00D8' && LA17_357<='\u00F6')||(LA17_357>='\u00F8' && LA17_357<='\u1FFF')||(LA17_357>='\u3040' && LA17_357<='\u318F')||(LA17_357>='\u3300' && LA17_357<='\u337F')||(LA17_357>='\u3400' && LA17_357<='\u3D2D')||(LA17_357>='\u4E00' && LA17_357<='\u9FFF')||(LA17_357>='\uF900' && LA17_357<='\uFAFF')) ) {
                                        alt17=93;
                                    }
                                    else {
                                        alt17=36;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
            }
            else {
                alt17=93;}
        }
        else if ( (LA17_0==':') ) {
            int LA17_21 = input.LA(2);

            if ( (LA17_21==':') ) {
                alt17=39;
            }
            else {
                alt17=37;}
        }
        else if ( (LA17_0=='a') ) {
            int LA17_22 = input.LA(2);

            if ( (LA17_22=='r') ) {
                int LA17_87 = input.LA(3);

                if ( (LA17_87=='o') ) {
                    int LA17_156 = input.LA(4);

                    if ( (LA17_156=='u') ) {
                        int LA17_214 = input.LA(5);

                        if ( (LA17_214=='n') ) {
                            int LA17_270 = input.LA(6);

                            if ( (LA17_270=='d') ) {
                                int LA17_317 = input.LA(7);

                                if ( (LA17_317=='$'||(LA17_317>='0' && LA17_317<='9')||(LA17_317>='A' && LA17_317<='Z')||LA17_317=='_'||(LA17_317>='a' && LA17_317<='z')||(LA17_317>='\u00C0' && LA17_317<='\u00D6')||(LA17_317>='\u00D8' && LA17_317<='\u00F6')||(LA17_317>='\u00F8' && LA17_317<='\u1FFF')||(LA17_317>='\u3040' && LA17_317<='\u318F')||(LA17_317>='\u3300' && LA17_317<='\u337F')||(LA17_317>='\u3400' && LA17_317<='\u3D2D')||(LA17_317>='\u4E00' && LA17_317<='\u9FFF')||(LA17_317>='\uF900' && LA17_317<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=38;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
            }
            else {
                alt17=93;}
        }
        else if ( (LA17_0=='p') ) {
            int LA17_23 = input.LA(2);

            if ( (LA17_23=='r') ) {
                int LA17_88 = input.LA(3);

                if ( (LA17_88=='i') ) {
                    int LA17_157 = input.LA(4);

                    if ( (LA17_157=='v') ) {
                        int LA17_215 = input.LA(5);

                        if ( (LA17_215=='a') ) {
                            int LA17_271 = input.LA(6);

                            if ( (LA17_271=='t') ) {
                                int LA17_318 = input.LA(7);

                                if ( (LA17_318=='e') ) {
                                    int LA17_359 = input.LA(8);

                                    if ( (LA17_359=='$'||(LA17_359>='0' && LA17_359<='9')||(LA17_359>='A' && LA17_359<='Z')||LA17_359=='_'||(LA17_359>='a' && LA17_359<='z')||(LA17_359>='\u00C0' && LA17_359<='\u00D6')||(LA17_359>='\u00D8' && LA17_359<='\u00F6')||(LA17_359>='\u00F8' && LA17_359<='\u1FFF')||(LA17_359>='\u3040' && LA17_359<='\u318F')||(LA17_359>='\u3300' && LA17_359<='\u337F')||(LA17_359>='\u3400' && LA17_359<='\u3D2D')||(LA17_359>='\u4E00' && LA17_359<='\u9FFF')||(LA17_359>='\uF900' && LA17_359<='\uFAFF')) ) {
                                        alt17=93;
                                    }
                                    else {
                                        alt17=40;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
            }
            else {
                alt17=93;}
        }
        else if ( (LA17_0=='J') ) {
            int LA17_24 = input.LA(2);

            if ( (LA17_24=='A') ) {
                int LA17_89 = input.LA(3);

                if ( (LA17_89=='V') ) {
                    int LA17_158 = input.LA(4);

                    if ( (LA17_158=='A') ) {
                        int LA17_216 = input.LA(5);

                        if ( (LA17_216=='$'||(LA17_216>='0' && LA17_216<='9')||(LA17_216>='A' && LA17_216<='Z')||LA17_216=='_'||(LA17_216>='a' && LA17_216<='z')||(LA17_216>='\u00C0' && LA17_216<='\u00D6')||(LA17_216>='\u00D8' && LA17_216<='\u00F6')||(LA17_216>='\u00F8' && LA17_216<='\u1FFF')||(LA17_216>='\u3040' && LA17_216<='\u318F')||(LA17_216>='\u3300' && LA17_216<='\u337F')||(LA17_216>='\u3400' && LA17_216<='\u3D2D')||(LA17_216>='\u4E00' && LA17_216<='\u9FFF')||(LA17_216>='\uF900' && LA17_216<='\uFAFF')) ) {
                            alt17=93;
                        }
                        else {
                            alt17=43;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
            }
            else {
                alt17=93;}
        }
        else if ( (LA17_0=='.') ) {
            alt17=44;
        }
        else if ( (LA17_0=='l') ) {
            int LA17_26 = input.LA(2);

            if ( (LA17_26=='e') ) {
                int LA17_90 = input.LA(3);

                if ( (LA17_90=='t') ) {
                    int LA17_159 = input.LA(4);

                    if ( (LA17_159=='$'||(LA17_159>='0' && LA17_159<='9')||(LA17_159>='A' && LA17_159<='Z')||LA17_159=='_'||(LA17_159>='a' && LA17_159<='z')||(LA17_159>='\u00C0' && LA17_159<='\u00D6')||(LA17_159>='\u00D8' && LA17_159<='\u00F6')||(LA17_159>='\u00F8' && LA17_159<='\u1FFF')||(LA17_159>='\u3040' && LA17_159<='\u318F')||(LA17_159>='\u3300' && LA17_159<='\u337F')||(LA17_159>='\u3400' && LA17_159<='\u3D2D')||(LA17_159>='\u4E00' && LA17_159<='\u9FFF')||(LA17_159>='\uF900' && LA17_159<='\uFAFF')) ) {
                        alt17=93;
                    }
                    else {
                        alt17=48;}
                }
                else {
                    alt17=93;}
            }
            else {
                alt17=93;}
        }
        else if ( (LA17_0=='=') ) {
            int LA17_27 = input.LA(2);

            if ( (LA17_27=='=') ) {
                alt17=61;
            }
            else {
                alt17=49;}
        }
        else if ( (LA17_0=='?') ) {
            alt17=51;
        }
        else if ( (LA17_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA17_93 = input.LA(3);

                if ( (LA17_93=='p') ) {
                    int LA17_160 = input.LA(4);

                    if ( (LA17_160=='e') ) {
                        int LA17_218 = input.LA(5);

                        if ( (LA17_218=='S') ) {
                            int LA17_273 = input.LA(6);

                            if ( (LA17_273=='e') ) {
                                int LA17_319 = input.LA(7);

                                if ( (LA17_319=='l') ) {
                                    int LA17_360 = input.LA(8);

                                    if ( (LA17_360=='e') ) {
                                        int LA17_388 = input.LA(9);

                                        if ( (LA17_388=='c') ) {
                                            int LA17_403 = input.LA(10);

                                            if ( (LA17_403=='t') ) {
                                                int LA17_415 = input.LA(11);

                                                if ( (LA17_415=='$'||(LA17_415>='0' && LA17_415<='9')||(LA17_415>='A' && LA17_415<='Z')||LA17_415=='_'||(LA17_415>='a' && LA17_415<='z')||(LA17_415>='\u00C0' && LA17_415<='\u00D6')||(LA17_415>='\u00D8' && LA17_415<='\u00F6')||(LA17_415>='\u00F8' && LA17_415<='\u1FFF')||(LA17_415>='\u3040' && LA17_415<='\u318F')||(LA17_415>='\u3300' && LA17_415<='\u337F')||(LA17_415>='\u3400' && LA17_415<='\u3D2D')||(LA17_415>='\u4E00' && LA17_415<='\u9FFF')||(LA17_415>='\uF900' && LA17_415<='\uFAFF')) ) {
                                                    alt17=93;
                                                }
                                                else {
                                                    alt17=77;}
                                            }
                                            else {
                                                alt17=93;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'r':
                {
                int LA17_94 = input.LA(3);

                if ( (LA17_94=='u') ) {
                    int LA17_161 = input.LA(4);

                    if ( (LA17_161=='e') ) {
                        int LA17_219 = input.LA(5);

                        if ( (LA17_219=='$'||(LA17_219>='0' && LA17_219<='9')||(LA17_219>='A' && LA17_219<='Z')||LA17_219=='_'||(LA17_219>='a' && LA17_219<='z')||(LA17_219>='\u00C0' && LA17_219<='\u00D6')||(LA17_219>='\u00D8' && LA17_219<='\u00F6')||(LA17_219>='\u00F8' && LA17_219<='\u1FFF')||(LA17_219>='\u3040' && LA17_219<='\u318F')||(LA17_219>='\u3300' && LA17_219<='\u337F')||(LA17_219>='\u3400' && LA17_219<='\u3D2D')||(LA17_219>='\u4E00' && LA17_219<='\u9FFF')||(LA17_219>='\uF900' && LA17_219<='\uFAFF')) ) {
                            alt17=93;
                        }
                        else {
                            alt17=75;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'h':
                {
                int LA17_95 = input.LA(3);

                if ( (LA17_95=='e') ) {
                    int LA17_162 = input.LA(4);

                    if ( (LA17_162=='n') ) {
                        int LA17_220 = input.LA(5);

                        if ( (LA17_220=='$'||(LA17_220>='0' && LA17_220<='9')||(LA17_220>='A' && LA17_220<='Z')||LA17_220=='_'||(LA17_220>='a' && LA17_220<='z')||(LA17_220>='\u00C0' && LA17_220<='\u00D6')||(LA17_220>='\u00D8' && LA17_220<='\u00F6')||(LA17_220>='\u00F8' && LA17_220<='\u1FFF')||(LA17_220>='\u3040' && LA17_220<='\u318F')||(LA17_220>='\u3300' && LA17_220<='\u337F')||(LA17_220>='\u3400' && LA17_220<='\u3D2D')||(LA17_220>='\u4E00' && LA17_220<='\u9FFF')||(LA17_220>='\uF900' && LA17_220<='\uFAFF')) ) {
                            alt17=93;
                        }
                        else {
                            alt17=52;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA17_96 = input.LA(3);

                if ( (LA17_96=='l') ) {
                    int LA17_163 = input.LA(4);

                    if ( (LA17_163=='e') ) {
                        int LA17_221 = input.LA(5);

                        if ( (LA17_221=='c') ) {
                            int LA17_276 = input.LA(6);

                            if ( (LA17_276=='t') ) {
                                int LA17_320 = input.LA(7);

                                if ( (LA17_320=='F') ) {
                                    int LA17_361 = input.LA(8);

                                    if ( (LA17_361=='i') ) {
                                        int LA17_389 = input.LA(9);

                                        if ( (LA17_389=='r') ) {
                                            int LA17_404 = input.LA(10);

                                            if ( (LA17_404=='s') ) {
                                                int LA17_416 = input.LA(11);

                                                if ( (LA17_416=='t') ) {
                                                    int LA17_423 = input.LA(12);

                                                    if ( (LA17_423=='$'||(LA17_423>='0' && LA17_423<='9')||(LA17_423>='A' && LA17_423<='Z')||LA17_423=='_'||(LA17_423>='a' && LA17_423<='z')||(LA17_423>='\u00C0' && LA17_423<='\u00D6')||(LA17_423>='\u00D8' && LA17_423<='\u00F6')||(LA17_423>='\u00F8' && LA17_423<='\u1FFF')||(LA17_423>='\u3040' && LA17_423<='\u318F')||(LA17_423>='\u3300' && LA17_423<='\u337F')||(LA17_423>='\u3400' && LA17_423<='\u3D2D')||(LA17_423>='\u4E00' && LA17_423<='\u9FFF')||(LA17_423>='\uF900' && LA17_423<='\uFAFF')) ) {
                                                        alt17=93;
                                                    }
                                                    else {
                                                        alt17=80;}
                                                }
                                                else {
                                                    alt17=93;}
                                            }
                                            else {
                                                alt17=93;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else if ( (LA17_320=='$'||(LA17_320>='0' && LA17_320<='9')||(LA17_320>='A' && LA17_320<='E')||(LA17_320>='G' && LA17_320<='Z')||LA17_320=='_'||(LA17_320>='a' && LA17_320<='z')||(LA17_320>='\u00C0' && LA17_320<='\u00D6')||(LA17_320>='\u00D8' && LA17_320<='\u00F6')||(LA17_320>='\u00F8' && LA17_320<='\u1FFF')||(LA17_320>='\u3040' && LA17_320<='\u318F')||(LA17_320>='\u3300' && LA17_320<='\u337F')||(LA17_320>='\u3400' && LA17_320<='\u3D2D')||(LA17_320>='\u4E00' && LA17_320<='\u9FFF')||(LA17_320>='\uF900' && LA17_320<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=79;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'o':
                {
                int LA17_97 = input.LA(3);

                if ( (LA17_97=='r') ) {
                    int LA17_164 = input.LA(4);

                    if ( (LA17_164=='t') ) {
                        int LA17_222 = input.LA(5);

                        if ( (LA17_222=='B') ) {
                            int LA17_277 = input.LA(6);

                            if ( (LA17_277=='y') ) {
                                int LA17_321 = input.LA(7);

                                if ( (LA17_321=='$'||(LA17_321>='0' && LA17_321<='9')||(LA17_321>='A' && LA17_321<='Z')||LA17_321=='_'||(LA17_321>='a' && LA17_321<='z')||(LA17_321>='\u00C0' && LA17_321<='\u00D6')||(LA17_321>='\u00D8' && LA17_321<='\u00F6')||(LA17_321>='\u00F8' && LA17_321<='\u1FFF')||(LA17_321>='\u3040' && LA17_321<='\u318F')||(LA17_321>='\u3300' && LA17_321<='\u337F')||(LA17_321>='\u3400' && LA17_321<='\u3D2D')||(LA17_321>='\u4E00' && LA17_321<='\u9FFF')||(LA17_321>='\uF900' && LA17_321<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=84;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'w':
                {
                int LA17_98 = input.LA(3);

                if ( (LA17_98=='i') ) {
                    int LA17_165 = input.LA(4);

                    if ( (LA17_165=='t') ) {
                        int LA17_223 = input.LA(5);

                        if ( (LA17_223=='c') ) {
                            int LA17_278 = input.LA(6);

                            if ( (LA17_278=='h') ) {
                                int LA17_322 = input.LA(7);

                                if ( (LA17_322=='$'||(LA17_322>='0' && LA17_322<='9')||(LA17_322>='A' && LA17_322<='Z')||LA17_322=='_'||(LA17_322>='a' && LA17_322<='z')||(LA17_322>='\u00C0' && LA17_322<='\u00D6')||(LA17_322>='\u00D8' && LA17_322<='\u00F6')||(LA17_322>='\u00F8' && LA17_322<='\u1FFF')||(LA17_322>='\u3040' && LA17_322<='\u318F')||(LA17_322>='\u3300' && LA17_322<='\u337F')||(LA17_322>='\u3400' && LA17_322<='\u3D2D')||(LA17_322>='\u4E00' && LA17_322<='\u9FFF')||(LA17_322>='\uF900' && LA17_322<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=54;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='d') ) {
            int LA17_31 = input.LA(2);

            if ( (LA17_31=='e') ) {
                int LA17_99 = input.LA(3);

                if ( (LA17_99=='f') ) {
                    int LA17_166 = input.LA(4);

                    if ( (LA17_166=='a') ) {
                        int LA17_224 = input.LA(5);

                        if ( (LA17_224=='u') ) {
                            int LA17_279 = input.LA(6);

                            if ( (LA17_279=='l') ) {
                                int LA17_323 = input.LA(7);

                                if ( (LA17_323=='t') ) {
                                    int LA17_365 = input.LA(8);

                                    if ( (LA17_365=='$'||(LA17_365>='0' && LA17_365<='9')||(LA17_365>='A' && LA17_365<='Z')||LA17_365=='_'||(LA17_365>='a' && LA17_365<='z')||(LA17_365>='\u00C0' && LA17_365<='\u00D6')||(LA17_365>='\u00D8' && LA17_365<='\u00F6')||(LA17_365>='\u00F8' && LA17_365<='\u1FFF')||(LA17_365>='\u3040' && LA17_365<='\u318F')||(LA17_365>='\u3300' && LA17_365<='\u337F')||(LA17_365>='\u3400' && LA17_365<='\u3D2D')||(LA17_365>='\u4E00' && LA17_365<='\u9FFF')||(LA17_365>='\uF900' && LA17_365<='\uFAFF')) ) {
                                        alt17=93;
                                    }
                                    else {
                                        alt17=55;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
            }
            else {
                alt17=93;}
        }
        else if ( (LA17_0=='}') ) {
            alt17=56;
        }
        else if ( (LA17_0=='|') ) {
            int LA17_33 = input.LA(2);

            if ( (LA17_33=='|') ) {
                alt17=58;
            }
            else {
                alt17=86;}
        }
        else if ( (LA17_0=='&') ) {
            alt17=59;
        }
        else if ( (LA17_0=='!') ) {
            int LA17_35 = input.LA(2);

            if ( (LA17_35=='=') ) {
                alt17=62;
            }
            else {
                alt17=69;}
        }
        else if ( (LA17_0=='>') ) {
            int LA17_36 = input.LA(2);

            if ( (LA17_36=='=') ) {
                alt17=63;
            }
            else {
                alt17=65;}
        }
        else if ( (LA17_0=='<') ) {
            int LA17_37 = input.LA(2);

            if ( (LA17_37=='=') ) {
                alt17=64;
            }
            else {
                alt17=66;}
        }
        else if ( (LA17_0=='+') ) {
            alt17=67;
        }
        else if ( (LA17_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt17=96;
                }
                break;
            case '*':
                {
                alt17=95;
                }
                break;
            default:
                alt17=68;}

        }
        else if ( (LA17_0=='G') ) {
            int LA17_40 = input.LA(2);

            if ( (LA17_40=='L') ) {
                int LA17_111 = input.LA(3);

                if ( (LA17_111=='O') ) {
                    int LA17_167 = input.LA(4);

                    if ( (LA17_167=='B') ) {
                        int LA17_225 = input.LA(5);

                        if ( (LA17_225=='A') ) {
                            int LA17_280 = input.LA(6);

                            if ( (LA17_280=='L') ) {
                                int LA17_324 = input.LA(7);

                                if ( (LA17_324=='V') ) {
                                    int LA17_366 = input.LA(8);

                                    if ( (LA17_366=='A') ) {
                                        int LA17_391 = input.LA(9);

                                        if ( (LA17_391=='R') ) {
                                            int LA17_405 = input.LA(10);

                                            if ( (LA17_405=='$'||(LA17_405>='0' && LA17_405<='9')||(LA17_405>='A' && LA17_405<='Z')||LA17_405=='_'||(LA17_405>='a' && LA17_405<='z')||(LA17_405>='\u00C0' && LA17_405<='\u00D6')||(LA17_405>='\u00D8' && LA17_405<='\u00F6')||(LA17_405>='\u00F8' && LA17_405<='\u1FFF')||(LA17_405>='\u3040' && LA17_405<='\u318F')||(LA17_405>='\u3300' && LA17_405<='\u337F')||(LA17_405>='\u3400' && LA17_405<='\u3D2D')||(LA17_405>='\u4E00' && LA17_405<='\u9FFF')||(LA17_405>='\uF900' && LA17_405<='\uFAFF')) ) {
                                                alt17=93;
                                            }
                                            else {
                                                alt17=70;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
            }
            else {
                alt17=93;}
        }
        else if ( (LA17_0=='[') ) {
            alt17=71;
        }
        else if ( (LA17_0==']') ) {
            alt17=72;
        }
        else if ( (LA17_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA17_112 = input.LA(3);

                if ( (LA17_112=='w') ) {
                    int LA17_168 = input.LA(4);

                    if ( (LA17_168=='$'||(LA17_168>='0' && LA17_168<='9')||(LA17_168>='A' && LA17_168<='Z')||LA17_168=='_'||(LA17_168>='a' && LA17_168<='z')||(LA17_168>='\u00C0' && LA17_168<='\u00D6')||(LA17_168>='\u00D8' && LA17_168<='\u00F6')||(LA17_168>='\u00F8' && LA17_168<='\u1FFF')||(LA17_168>='\u3040' && LA17_168<='\u318F')||(LA17_168>='\u3300' && LA17_168<='\u337F')||(LA17_168>='\u3400' && LA17_168<='\u3D2D')||(LA17_168>='\u4E00' && LA17_168<='\u9FFF')||(LA17_168>='\uF900' && LA17_168<='\uFAFF')) ) {
                        alt17=93;
                    }
                    else {
                        alt17=73;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'u':
                {
                int LA17_113 = input.LA(3);

                if ( (LA17_113=='l') ) {
                    int LA17_169 = input.LA(4);

                    if ( (LA17_169=='l') ) {
                        int LA17_227 = input.LA(5);

                        if ( (LA17_227=='$'||(LA17_227>='0' && LA17_227<='9')||(LA17_227>='A' && LA17_227<='Z')||LA17_227=='_'||(LA17_227>='a' && LA17_227<='z')||(LA17_227>='\u00C0' && LA17_227<='\u00D6')||(LA17_227>='\u00D8' && LA17_227<='\u00F6')||(LA17_227>='\u00F8' && LA17_227<='\u1FFF')||(LA17_227>='\u3040' && LA17_227<='\u318F')||(LA17_227>='\u3300' && LA17_227<='\u337F')||(LA17_227>='\u3400' && LA17_227<='\u3D2D')||(LA17_227>='\u4E00' && LA17_227<='\u9FFF')||(LA17_227>='\uF900' && LA17_227<='\uFAFF')) ) {
                            alt17=93;
                        }
                        else {
                            alt17=76;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'o':
                {
                int LA17_114 = input.LA(3);

                if ( (LA17_114=='t') ) {
                    int LA17_170 = input.LA(4);

                    if ( (LA17_170=='E') ) {
                        int LA17_228 = input.LA(5);

                        if ( (LA17_228=='x') ) {
                            int LA17_282 = input.LA(6);

                            if ( (LA17_282=='i') ) {
                                int LA17_325 = input.LA(7);

                                if ( (LA17_325=='s') ) {
                                    int LA17_367 = input.LA(8);

                                    if ( (LA17_367=='t') ) {
                                        int LA17_392 = input.LA(9);

                                        if ( (LA17_392=='s') ) {
                                            int LA17_406 = input.LA(10);

                                            if ( (LA17_406=='$'||(LA17_406>='0' && LA17_406<='9')||(LA17_406>='A' && LA17_406<='Z')||LA17_406=='_'||(LA17_406>='a' && LA17_406<='z')||(LA17_406>='\u00C0' && LA17_406<='\u00D6')||(LA17_406>='\u00D8' && LA17_406<='\u00F6')||(LA17_406>='\u00F8' && LA17_406<='\u1FFF')||(LA17_406>='\u3040' && LA17_406<='\u318F')||(LA17_406>='\u3300' && LA17_406<='\u337F')||(LA17_406>='\u3400' && LA17_406<='\u3D2D')||(LA17_406>='\u4E00' && LA17_406<='\u9FFF')||(LA17_406>='\uF900' && LA17_406<='\uFAFF')) ) {
                                                alt17=93;
                                            }
                                            else {
                                                alt17=83;}
                                        }
                                        else {
                                            alt17=93;}
                                    }
                                    else {
                                        alt17=93;}
                                }
                                else {
                                    alt17=93;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( (LA17_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA17_115 = input.LA(3);

                if ( (LA17_115=='r') ) {
                    int LA17_171 = input.LA(4);

                    if ( (LA17_171=='A') ) {
                        int LA17_229 = input.LA(5);

                        if ( (LA17_229=='l') ) {
                            int LA17_283 = input.LA(6);

                            if ( (LA17_283=='l') ) {
                                int LA17_326 = input.LA(7);

                                if ( (LA17_326=='$'||(LA17_326>='0' && LA17_326<='9')||(LA17_326>='A' && LA17_326<='Z')||LA17_326=='_'||(LA17_326>='a' && LA17_326<='z')||(LA17_326>='\u00C0' && LA17_326<='\u00D6')||(LA17_326>='\u00D8' && LA17_326<='\u00F6')||(LA17_326>='\u00F8' && LA17_326<='\u1FFF')||(LA17_326>='\u3040' && LA17_326<='\u318F')||(LA17_326>='\u3300' && LA17_326<='\u337F')||(LA17_326>='\u3400' && LA17_326<='\u3D2D')||(LA17_326>='\u4E00' && LA17_326<='\u9FFF')||(LA17_326>='\uF900' && LA17_326<='\uFAFF')) ) {
                                    alt17=93;
                                }
                                else {
                                    alt17=85;}
                            }
                            else {
                                alt17=93;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            case 'a':
                {
                int LA17_116 = input.LA(3);

                if ( (LA17_116=='l') ) {
                    int LA17_172 = input.LA(4);

                    if ( (LA17_172=='s') ) {
                        int LA17_230 = input.LA(5);

                        if ( (LA17_230=='e') ) {
                            int LA17_284 = input.LA(6);

                            if ( (LA17_284=='$'||(LA17_284>='0' && LA17_284<='9')||(LA17_284>='A' && LA17_284<='Z')||LA17_284=='_'||(LA17_284>='a' && LA17_284<='z')||(LA17_284>='\u00C0' && LA17_284<='\u00D6')||(LA17_284>='\u00D8' && LA17_284<='\u00F6')||(LA17_284>='\u00F8' && LA17_284<='\u1FFF')||(LA17_284>='\u3040' && LA17_284<='\u318F')||(LA17_284>='\u3300' && LA17_284<='\u337F')||(LA17_284>='\u3400' && LA17_284<='\u3D2D')||(LA17_284>='\u4E00' && LA17_284<='\u9FFF')||(LA17_284>='\uF900' && LA17_284<='\uFAFF')) ) {
                                alt17=93;
                            }
                            else {
                                alt17=74;}
                        }
                        else {
                            alt17=93;}
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
                }
                break;
            default:
                alt17=93;}

        }
        else if ( ((LA17_0>='0' && LA17_0<='9')) ) {
            alt17=87;
        }
        else if ( (LA17_0=='\"'||LA17_0=='\'') ) {
            alt17=88;
        }
        else if ( (LA17_0=='$'||LA17_0=='B'||LA17_0=='H'||LA17_0=='K'||(LA17_0>='M' && LA17_0<='O')||LA17_0=='Q'||(LA17_0>='T' && LA17_0<='V')||(LA17_0>='X' && LA17_0<='Z')||(LA17_0>='^' && LA17_0<='_')||LA17_0=='b'||(LA17_0>='g' && LA17_0<='h')||(LA17_0>='j' && LA17_0<='k')||LA17_0=='m'||LA17_0=='o'||LA17_0=='q'||(LA17_0>='u' && LA17_0<='z')||(LA17_0>='\u00C0' && LA17_0<='\u00D6')||(LA17_0>='\u00D8' && LA17_0<='\u00F6')||(LA17_0>='\u00F8' && LA17_0<='\u1FFF')||(LA17_0>='\u3040' && LA17_0<='\u318F')||(LA17_0>='\u3300' && LA17_0<='\u337F')||(LA17_0>='\u3400' && LA17_0<='\u3D2D')||(LA17_0>='\u4E00' && LA17_0<='\u9FFF')||(LA17_0>='\uF900' && LA17_0<='\uFAFF')) ) {
            alt17=93;
        }
        else if ( (LA17_0=='R') ) {
            int LA17_48 = input.LA(2);

            if ( (LA17_48=='E') ) {
                int LA17_117 = input.LA(3);

                if ( (LA17_117=='M') ) {
                    int LA17_173 = input.LA(4);

                    if ( (LA17_173=='\u00BB') ) {
                        alt17=97;
                    }
                    else {
                        alt17=93;}
                }
                else {
                    alt17=93;}
            }
            else {
                alt17=93;}
        }
        else if ( ((LA17_0>='\t' && LA17_0<='\n')||(LA17_0>='\f' && LA17_0<='\r')||LA17_0==' ') ) {
            alt17=94;
        }
        else if ( (LA17_0=='\u00BB') ) {
            int LA17_50 = input.LA(2);

            if ( ((LA17_50>='\u0000' && LA17_50<='\uFFFE')) ) {
                alt17=98;
            }
            else if ( (xpandMode) ) {
                alt17=98;
            }
            else if ( (true) ) {
                alt17=100;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | IntLiteral | StringLiteral | DEFINE | ENDDEFINE | AROUND | ENDAROUND | Identifier | WS | COMMENT | LINE_COMMENT | REM_COMMENT | TEXT | LG | RG );", 17, 50, input);

                throw nvae;
            }
        }
        else if ( (LA17_0=='\u00AB') ) {
            alt17=99;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | IntLiteral | StringLiteral | DEFINE | ENDDEFINE | AROUND | ENDAROUND | Identifier | WS | COMMENT | LINE_COMMENT | REM_COMMENT | TEXT | LG | RG );", 17, 0, input);

            throw nvae;
        }
        switch (alt17) {
            case 1 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:10: T24
                {
                mT24(); 

                }
                break;
            case 2 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:14: T25
                {
                mT25(); 

                }
                break;
            case 3 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:18: T26
                {
                mT26(); 

                }
                break;
            case 4 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:22: T27
                {
                mT27(); 

                }
                break;
            case 5 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:26: T28
                {
                mT28(); 

                }
                break;
            case 6 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:30: T29
                {
                mT29(); 

                }
                break;
            case 7 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:34: T30
                {
                mT30(); 

                }
                break;
            case 8 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:38: T31
                {
                mT31(); 

                }
                break;
            case 9 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:42: T32
                {
                mT32(); 

                }
                break;
            case 10 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:46: T33
                {
                mT33(); 

                }
                break;
            case 11 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:50: T34
                {
                mT34(); 

                }
                break;
            case 12 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:54: T35
                {
                mT35(); 

                }
                break;
            case 13 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:58: T36
                {
                mT36(); 

                }
                break;
            case 14 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:62: T37
                {
                mT37(); 

                }
                break;
            case 15 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:66: T38
                {
                mT38(); 

                }
                break;
            case 16 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:70: T39
                {
                mT39(); 

                }
                break;
            case 17 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:74: T40
                {
                mT40(); 

                }
                break;
            case 18 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:78: T41
                {
                mT41(); 

                }
                break;
            case 19 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:82: T42
                {
                mT42(); 

                }
                break;
            case 20 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:86: T43
                {
                mT43(); 

                }
                break;
            case 21 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:90: T44
                {
                mT44(); 

                }
                break;
            case 22 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:94: T45
                {
                mT45(); 

                }
                break;
            case 23 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:98: T46
                {
                mT46(); 

                }
                break;
            case 24 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:102: T47
                {
                mT47(); 

                }
                break;
            case 25 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:106: T48
                {
                mT48(); 

                }
                break;
            case 26 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:110: T49
                {
                mT49(); 

                }
                break;
            case 27 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:114: T50
                {
                mT50(); 

                }
                break;
            case 28 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:118: T51
                {
                mT51(); 

                }
                break;
            case 29 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:122: T52
                {
                mT52(); 

                }
                break;
            case 30 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:126: T53
                {
                mT53(); 

                }
                break;
            case 31 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:130: T54
                {
                mT54(); 

                }
                break;
            case 32 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:134: T55
                {
                mT55(); 

                }
                break;
            case 33 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:138: T56
                {
                mT56(); 

                }
                break;
            case 34 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:142: T57
                {
                mT57(); 

                }
                break;
            case 35 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:146: T58
                {
                mT58(); 

                }
                break;
            case 36 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:150: T59
                {
                mT59(); 

                }
                break;
            case 37 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:154: T60
                {
                mT60(); 

                }
                break;
            case 38 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:158: T61
                {
                mT61(); 

                }
                break;
            case 39 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:162: T62
                {
                mT62(); 

                }
                break;
            case 40 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:166: T63
                {
                mT63(); 

                }
                break;
            case 41 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:170: T64
                {
                mT64(); 

                }
                break;
            case 42 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:174: T65
                {
                mT65(); 

                }
                break;
            case 43 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:178: T66
                {
                mT66(); 

                }
                break;
            case 44 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:182: T67
                {
                mT67(); 

                }
                break;
            case 45 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:186: T68
                {
                mT68(); 

                }
                break;
            case 46 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:190: T69
                {
                mT69(); 

                }
                break;
            case 47 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:194: T70
                {
                mT70(); 

                }
                break;
            case 48 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:198: T71
                {
                mT71(); 

                }
                break;
            case 49 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:202: T72
                {
                mT72(); 

                }
                break;
            case 50 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:206: T73
                {
                mT73(); 

                }
                break;
            case 51 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:210: T74
                {
                mT74(); 

                }
                break;
            case 52 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:214: T75
                {
                mT75(); 

                }
                break;
            case 53 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:218: T76
                {
                mT76(); 

                }
                break;
            case 54 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:222: T77
                {
                mT77(); 

                }
                break;
            case 55 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:226: T78
                {
                mT78(); 

                }
                break;
            case 56 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:230: T79
                {
                mT79(); 

                }
                break;
            case 57 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:234: T80
                {
                mT80(); 

                }
                break;
            case 58 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:238: T81
                {
                mT81(); 

                }
                break;
            case 59 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:242: T82
                {
                mT82(); 

                }
                break;
            case 60 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:246: T83
                {
                mT83(); 

                }
                break;
            case 61 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:250: T84
                {
                mT84(); 

                }
                break;
            case 62 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:254: T85
                {
                mT85(); 

                }
                break;
            case 63 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:258: T86
                {
                mT86(); 

                }
                break;
            case 64 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:262: T87
                {
                mT87(); 

                }
                break;
            case 65 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:266: T88
                {
                mT88(); 

                }
                break;
            case 66 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:270: T89
                {
                mT89(); 

                }
                break;
            case 67 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:274: T90
                {
                mT90(); 

                }
                break;
            case 68 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:278: T91
                {
                mT91(); 

                }
                break;
            case 69 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:282: T92
                {
                mT92(); 

                }
                break;
            case 70 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:286: T93
                {
                mT93(); 

                }
                break;
            case 71 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:290: T94
                {
                mT94(); 

                }
                break;
            case 72 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:294: T95
                {
                mT95(); 

                }
                break;
            case 73 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:298: T96
                {
                mT96(); 

                }
                break;
            case 74 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:302: T97
                {
                mT97(); 

                }
                break;
            case 75 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:306: T98
                {
                mT98(); 

                }
                break;
            case 76 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:310: T99
                {
                mT99(); 

                }
                break;
            case 77 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:314: T100
                {
                mT100(); 

                }
                break;
            case 78 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:319: T101
                {
                mT101(); 

                }
                break;
            case 79 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:324: T102
                {
                mT102(); 

                }
                break;
            case 80 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:329: T103
                {
                mT103(); 

                }
                break;
            case 81 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:334: T104
                {
                mT104(); 

                }
                break;
            case 82 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:339: T105
                {
                mT105(); 

                }
                break;
            case 83 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:344: T106
                {
                mT106(); 

                }
                break;
            case 84 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:349: T107
                {
                mT107(); 

                }
                break;
            case 85 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:354: T108
                {
                mT108(); 

                }
                break;
            case 86 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:359: T109
                {
                mT109(); 

                }
                break;
            case 87 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:364: IntLiteral
                {
                mIntLiteral(); 

                }
                break;
            case 88 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:375: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 89 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:389: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 90 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:396: ENDDEFINE
                {
                mENDDEFINE(); 

                }
                break;
            case 91 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:406: AROUND
                {
                mAROUND(); 

                }
                break;
            case 92 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:413: ENDAROUND
                {
                mENDAROUND(); 

                }
                break;
            case 93 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:423: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 94 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:434: WS
                {
                mWS(); 

                }
                break;
            case 95 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:437: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 96 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:445: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 97 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:458: REM_COMMENT
                {
                mREM_COMMENT(); 

                }
                break;
            case 98 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:470: TEXT
                {
                mTEXT(); 

                }
                break;
            case 99 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:475: LG
                {
                mLG(); 

                }
                break;
            case 100 :
                // src/org/eclipse/xpand3/parser/Xpand3.g:1:478: RG
                {
                mRG(); 

                }
                break;

        }

    }


 

}