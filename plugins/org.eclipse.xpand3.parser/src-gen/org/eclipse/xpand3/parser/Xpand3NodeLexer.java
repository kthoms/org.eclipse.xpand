// $ANTLR 3.0 ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g 2008-03-07 11:57:31
 	
package org.eclipse.xpand3.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Xpand3NodeLexer extends Lexer {
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
    public static final int T112=112;
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
    public static final int Tokens=113;
    public static final int T53=53;
    public static final int OctalEscape=16;
    public static final int T99=99;
    public static final int T27=27;
    public static final int REM_COMMENT_OUT=23;
    public static final int T52=52;
    public static final int T90=90;
    public static final int AROUND=8;

       private boolean xpandMode = false;

    public Xpand3NodeLexer() {;} 
    public Xpand3NodeLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g"; }

    // $ANTLR start T25
    public void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:9:7: ( 'y' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:9:7: 'y'
            {
            match('y'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:10:7: ( 'IMPORT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:10:7: 'IMPORT'
            {
            match("IMPORT"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:11:7: ( 'EXTENSION' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:11:7: 'EXTENSION'
            {
            match("EXTENSION"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:12:7: ( 'import' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:12:7: 'import'
            {
            match("import"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:13:7: ( ';' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:13:7: ';'
            {
            match(';'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:14:7: ( 'extension' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:14:7: 'extension'
            {
            match("extension"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:15:7: ( 'reexport' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:15:7: 'reexport'
            {
            match("reexport"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:16:7: ( '(' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:16:7: '('
            {
            match('('); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:17:7: ( ',' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:17:7: ','
            {
            match(','); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:18:7: ( '*' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:18:7: '*'
            {
            match('*'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:19:7: ( ')' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:19:7: ')'
            {
            match(')'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:20:7: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:20:7: 'FOR'
            {
            match("FOR"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:21:7: ( '-' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:21:7: '-'
            {
            match('-'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:22:7: ( 'ERROR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:22:7: 'ERROR'
            {
            match("ERROR"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:23:7: ( 'EXPAND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:23:7: 'EXPAND'
            {
            match("EXPAND"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:24:7: ( 'FOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:24:7: 'FOREACH'
            {
            match("FOREACH"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:25:7: ( 'SEPARATOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:25:7: 'SEPARATOR'
            {
            match("SEPARATOR"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:26:7: ( 'FILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:26:7: 'FILE'
            {
            match("FILE"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:27:7: ( 'ENDFILE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:27:7: 'ENDFILE'
            {
            match("ENDFILE"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:28:7: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:28:7: 'AS'
            {
            match("AS"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:29:7: ( 'ITERATOR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:29:7: 'ITERATOR'
            {
            match("ITERATOR"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:30:7: ( 'ENDFOREACH' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:30:7: 'ENDFOREACH'
            {
            match("ENDFOREACH"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:31:7: ( 'IF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:31:7: 'IF'
            {
            match("IF"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:7: ( 'ENDIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:32:7: 'ENDIF'
            {
            match("ENDIF"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:7: ( 'ELSEIF' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:33:7: 'ELSEIF'
            {
            match("ELSEIF"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:34:7: ( 'ELSE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:34:7: 'ELSE'
            {
            match("ELSE"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:35:7: ( 'LET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:35:7: 'LET'
            {
            match("LET"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:7: ( 'ENDLET' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:36:7: 'ENDLET'
            {
            match("ENDLET"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:7: ( 'PROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:37:7: 'PROTECT'
            {
            match("PROTECT"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:7: ( 'CSTART' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:38:7: 'CSTART'
            {
            match("CSTART"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:7: ( 'CEND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:39:7: 'CEND'
            {
            match("CEND"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:7: ( 'ID' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:40:7: 'ID'
            {
            match("ID"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:7: ( 'DISABLE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:41:7: 'DISABLE'
            {
            match("DISABLE"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:7: ( 'ENDPROTECT' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:42:7: 'ENDPROTECT'
            {
            match("ENDPROTECT"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:7: ( 'context' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:43:7: 'context'
            {
            match("context"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:7: ( 'if' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:44:7: 'if'
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
    public void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:7: ( 'WARNING' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:45:7: 'WARNING'
            {
            match("WARNING"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:7: ( ':' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:46:7: ':'
            {
            match(':'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:7: ( 'around' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:47:7: 'around'
            {
            match("around"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:7: ( '::' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:48:7: '::'
            {
            match("::"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:49:7: ( 'private' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:49:7: 'private'
            {
            match("private"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:7: ( 'cached' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:50:7: 'cached'
            {
            match("cached"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:7: ( 'create' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:51:7: 'create'
            {
            match("create"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:7: ( 'JAVA' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:52:7: 'JAVA'
            {
            match("JAVA"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:7: ( '.' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:53:7: '.'
            {
            match('.'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:7: ( 'Collection' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:54:7: 'Collection'
            {
            match("Collection"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:7: ( 'List' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:55:7: 'List'
            {
            match("List"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:7: ( 'Set' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:56:7: 'Set'
            {
            match("Set"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:7: ( 'let' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:57:7: 'let'
            {
            match("let"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:58:7: ( '=' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:58:7: '='
            {
            match('='); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:7: ( '->' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:59:7: '->'
            {
            match("->"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:7: ( '?' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:60:7: '?'
            {
            match('?'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:61:7: ( 'then' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:61:7: 'then'
            {
            match("then"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:62:7: ( 'else' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:62:7: 'else'
            {
            match("else"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:7: ( 'switch' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:63:7: 'switch'
            {
            match("switch"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:7: ( '{' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:64:7: '{'
            {
            match('{'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:7: ( 'default' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:65:7: 'default'
            {
            match("default"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:7: ( '}' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:66:7: '}'
            {
            match('}'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:7: ( 'case' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:67:7: 'case'
            {
            match("case"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:7: ( '||' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:68:7: '||'
            {
            match("||"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:69:7: ( '&&' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:69:7: '&&'
            {
            match("&&"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:7: ( 'implies' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:70:7: 'implies'
            {
            match("implies"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:71:7: ( '==' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:71:7: '=='
            {
            match("=="); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:7: ( '!=' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:72:7: '!='
            {
            match("!="); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:7: ( '>=' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:73:7: '>='
            {
            match(">="); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:7: ( '<=' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:74:7: '<='
            {
            match("<="); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:75:7: ( '>' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:75:7: '>'
            {
            match('>'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:76:7: ( '<' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:76:7: '<'
            {
            match('<'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:7: ( '+' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:77:7: '+'
            {
            match('+'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:78:7: ( '/' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:78:7: '/'
            {
            match('/'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:7: ( '!' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:79:7: '!'
            {
            match('!'); 

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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:7: ( 'GLOBALVAR' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:80:7: 'GLOBALVAR'
            {
            match("GLOBALVAR"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:81:7: ( 'new' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:81:7: 'new'
            {
            match("new"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:82:7: ( 'false' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:82:7: 'false'
            {
            match("false"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:83:7: ( 'true' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:83:7: 'true'
            {
            match("true"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:8: ( 'null' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:84:8: 'null'
            {
            match("null"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:85:8: ( 'typeSelect' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:85:8: 'typeSelect'
            {
            match("typeSelect"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:8: ( 'collect' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:86:8: 'collect'
            {
            match("collect"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:8: ( 'select' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:87:8: 'select'
            {
            match("select"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:8: ( 'selectFirst' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:88:8: 'selectFirst'
            {
            match("selectFirst"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:8: ( 'reject' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:89:8: 'reject'
            {
            match("reject"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:8: ( 'exists' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:90:8: 'exists'
            {
            match("exists"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:8: ( 'notExists' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:91:8: 'notExists'
            {
            match("notExists"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:92:8: ( 'sortBy' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:92:8: 'sortBy'
            {
            match("sortBy"); 


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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:93:8: ( 'forAll' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:93:8: 'forAll'
            {
            match("forAll"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T109

    // $ANTLR start T110
    public void mT110() throws RecognitionException {
        try {
            int _type = T110;
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:8: ( '|' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:94:8: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T110

    // $ANTLR start T111
    public void mT111() throws RecognitionException {
        try {
            int _type = T111;
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:8: ( '[' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:95:8: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T111

    // $ANTLR start T112
    public void mT112() throws RecognitionException {
        try {
            int _type = T112;
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:8: ( ']' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:96:8: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T112

    // $ANTLR start IntLiteral
    public void mIntLiteral() throws RecognitionException {
        try {
            int _type = IntLiteral;
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:469:3: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:469:3: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:469:3: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    new NoViableAltException("469:3: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:469:4: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:469:10: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:469:19: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:469:19: '0' .. '9'
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:474:3: ( '\\\"' ( EscapeSequence | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
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
                    new NoViableAltException("473:1: StringLiteral : ( '\\\"' ( EscapeSequence | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:474:3: '\\\"' ( EscapeSequence | ~ ( '\\\\' | '\\\"' ) )* '\\\"'
                    {
                    match('\"'); 
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:474:8: ( EscapeSequence | ~ ( '\\\\' | '\\\"' ) )*
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
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:474:10: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:474:27: ~ ( '\\\\' | '\\\"' )
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:475:8: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
                    {
                    match('\''); 
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:475:13: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
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
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:475:15: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:475:32: ~ ( '\\'' | '\\\\' )
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:480:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt6=2;
                    }
                    break;
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
                        new NoViableAltException("479:10: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("479:10: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:480:3: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:481:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:482:9: OctalEscape
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:487:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\\') ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>='0' && LA7_1<='3')) ) {
                    int LA7_2 = input.LA(3);

                    if ( ((LA7_2>='0' && LA7_2<='7')) ) {
                        int LA7_4 = input.LA(4);

                        if ( ((LA7_4>='0' && LA7_4<='7')) ) {
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
                        new NoViableAltException("486:10: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("486:10: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:487:3: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:487:8: ( '0' .. '3' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:487:9: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:487:19: ( '0' .. '7' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:487:20: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:487:30: ( '0' .. '7' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:487:31: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:488:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:488:14: ( '0' .. '7' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:488:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:488:25: ( '0' .. '7' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:488:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:489:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:489:14: ( '0' .. '7' )
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:489:15: '0' .. '7'
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:494:3: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:494:3: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:499:3: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:499:3: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:504:3: ( 'DEFINE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:504:3: 'DEFINE'
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:509:3: ( 'ENDDEFINE' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:509:3: 'ENDDEFINE'
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:514:3: ( 'AROUND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:514:3: 'AROUND'
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:519:3: ( 'ENDAROUND' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:519:3: 'ENDAROUND'
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:524:3: ( ( '^' )? Letter ( Letter | JavaIDDigit )* )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:524:3: ( '^' )? Letter ( Letter | JavaIDDigit )*
            {
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:524:3: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:524:4: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            mLetter(); 
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:524:17: ( Letter | JavaIDDigit )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')||(LA9_0>='\u00C0' && LA9_0<='\u00D6')||(LA9_0>='\u00D8' && LA9_0<='\u00F6')||(LA9_0>='\u00F8' && LA9_0<='\u1FFF')||(LA9_0>='\u3040' && LA9_0<='\u318F')||(LA9_0>='\u3300' && LA9_0<='\u337F')||(LA9_0>='\u3400' && LA9_0<='\u3D2D')||(LA9_0>='\u4E00' && LA9_0<='\u9FFF')||(LA9_0>='\uF900' && LA9_0<='\uFAFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:529:3: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:547:8: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:567:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:567:3: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:572:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:572:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:572:8: ( options {greedy=false; } : . )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:572:36: .
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:577:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF ) )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:577:3: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF )
            {
            match("//"); 

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:577:8: (~ ( '\\n' | '\\r' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:577:8: ~ ( '\\n' | '\\r' )
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:577:22: ( ( '\\r' )? '\\n' | EOF )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            else {
                alt13=2;}
            switch (alt13) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:577:23: ( '\\r' )? '\\n'
                    {
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:577:23: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:577:23: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:577:34: EOF
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
    public void mREM_COMMENT_OUT() throws RecognitionException {
        try {
            int _type = REM_COMMENT_OUT;
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:582:3: ({...}? => LG 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' RG )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:582:3: {...}? => LG 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' RG
            {
            if ( !(!xpandMode) ) {
                throw new FailedPredicateException(input, "REM_COMMENT_OUT", "!xpandMode");
            }
            mLG(); 
            match("REM"); 

            mRG(); 
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:582:31: ( options {greedy=false; } : . )*
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

                                            if ( ((LA14_8>='\u0000' && LA14_8<='\u00BA')||(LA14_8>='\u00BC' && LA14_8<='\uFFFE')) ) {
                                                alt14=1;
                                            }
                                            else if ( (LA14_8=='\u00BB') ) {
                                                alt14=2;
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:582:59: .
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
    public void mREM_COMMENT() throws RecognitionException {
        try {
            int _type = REM_COMMENT;
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:587:3: ({...}? => 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:587:3: {...}? => 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM'
            {
            if ( !(xpandMode) ) {
                throw new FailedPredicateException(input, "REM_COMMENT", "xpandMode");
            }
            match("REM"); 

            mRG(); 
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:587:27: ( options {greedy=false; } : . )*
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
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:587:55: .
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
    public void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:592:3: ({...}? => RG (~ ( LG ) )* ( LG )? )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:592:3: {...}? => RG (~ ( LG ) )* ( LG )?
            {
            if ( !(xpandMode) ) {
                throw new FailedPredicateException(input, "TEXT", "xpandMode");
            }
            mRG(); 
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:592:21: (~ ( LG ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\u00AA')||(LA16_0>='\u00AC' && LA16_0<='\uFFFE')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:592:21: ~ ( LG )
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

            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:592:28: ( LG )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\u00AB') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:592:29: LG
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:597:3: ( '\\u00AB' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:597:3: '\\u00AB'
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
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:602:3: ( '\\u00BB' )
            // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:602:3: '\\u00BB'
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
        // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:10: ( T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | IntLiteral | StringLiteral | DEFINE | ENDDEFINE | AROUND | ENDAROUND | Identifier | WS | COMMENT | LINE_COMMENT | REM_COMMENT_OUT | REM_COMMENT | TEXT | LG | RG )
        int alt18=103;
        int LA18_0 = input.LA(1);

        if ( (LA18_0=='y') ) {
            int LA18_1 = input.LA(2);

            if ( (LA18_1=='$'||(LA18_1>='0' && LA18_1<='9')||(LA18_1>='A' && LA18_1<='Z')||LA18_1=='_'||(LA18_1>='a' && LA18_1<='z')||(LA18_1>='\u00C0' && LA18_1<='\u00D6')||(LA18_1>='\u00D8' && LA18_1<='\u00F6')||(LA18_1>='\u00F8' && LA18_1<='\u1FFF')||(LA18_1>='\u3040' && LA18_1<='\u318F')||(LA18_1>='\u3300' && LA18_1<='\u337F')||(LA18_1>='\u3400' && LA18_1<='\u3D2D')||(LA18_1>='\u4E00' && LA18_1<='\u9FFF')||(LA18_1>='\uF900' && LA18_1<='\uFAFF')) ) {
                alt18=95;
            }
            else {
                alt18=1;}
        }
        else if ( (LA18_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'D':
                {
                int LA18_55 = input.LA(3);

                if ( (LA18_55=='$'||(LA18_55>='0' && LA18_55<='9')||(LA18_55>='A' && LA18_55<='Z')||LA18_55=='_'||(LA18_55>='a' && LA18_55<='z')||(LA18_55>='\u00C0' && LA18_55<='\u00D6')||(LA18_55>='\u00D8' && LA18_55<='\u00F6')||(LA18_55>='\u00F8' && LA18_55<='\u1FFF')||(LA18_55>='\u3040' && LA18_55<='\u318F')||(LA18_55>='\u3300' && LA18_55<='\u337F')||(LA18_55>='\u3400' && LA18_55<='\u3D2D')||(LA18_55>='\u4E00' && LA18_55<='\u9FFF')||(LA18_55>='\uF900' && LA18_55<='\uFAFF')) ) {
                    alt18=95;
                }
                else {
                    alt18=32;}
                }
                break;
            case 'T':
                {
                int LA18_56 = input.LA(3);

                if ( (LA18_56=='E') ) {
                    int LA18_126 = input.LA(4);

                    if ( (LA18_126=='R') ) {
                        int LA18_180 = input.LA(5);

                        if ( (LA18_180=='A') ) {
                            int LA18_237 = input.LA(6);

                            if ( (LA18_237=='T') ) {
                                int LA18_290 = input.LA(7);

                                if ( (LA18_290=='O') ) {
                                    int LA18_333 = input.LA(8);

                                    if ( (LA18_333=='R') ) {
                                        int LA18_374 = input.LA(9);

                                        if ( (LA18_374=='$'||(LA18_374>='0' && LA18_374<='9')||(LA18_374>='A' && LA18_374<='Z')||LA18_374=='_'||(LA18_374>='a' && LA18_374<='z')||(LA18_374>='\u00C0' && LA18_374<='\u00D6')||(LA18_374>='\u00D8' && LA18_374<='\u00F6')||(LA18_374>='\u00F8' && LA18_374<='\u1FFF')||(LA18_374>='\u3040' && LA18_374<='\u318F')||(LA18_374>='\u3300' && LA18_374<='\u337F')||(LA18_374>='\u3400' && LA18_374<='\u3D2D')||(LA18_374>='\u4E00' && LA18_374<='\u9FFF')||(LA18_374>='\uF900' && LA18_374<='\uFAFF')) ) {
                                            alt18=95;
                                        }
                                        else {
                                            alt18=21;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'M':
                {
                int LA18_57 = input.LA(3);

                if ( (LA18_57=='P') ) {
                    int LA18_127 = input.LA(4);

                    if ( (LA18_127=='O') ) {
                        int LA18_181 = input.LA(5);

                        if ( (LA18_181=='R') ) {
                            int LA18_238 = input.LA(6);

                            if ( (LA18_238=='T') ) {
                                int LA18_291 = input.LA(7);

                                if ( (LA18_291=='$'||(LA18_291>='0' && LA18_291<='9')||(LA18_291>='A' && LA18_291<='Z')||LA18_291=='_'||(LA18_291>='a' && LA18_291<='z')||(LA18_291>='\u00C0' && LA18_291<='\u00D6')||(LA18_291>='\u00D8' && LA18_291<='\u00F6')||(LA18_291>='\u00F8' && LA18_291<='\u1FFF')||(LA18_291>='\u3040' && LA18_291<='\u318F')||(LA18_291>='\u3300' && LA18_291<='\u337F')||(LA18_291>='\u3400' && LA18_291<='\u3D2D')||(LA18_291>='\u4E00' && LA18_291<='\u9FFF')||(LA18_291>='\uF900' && LA18_291<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=2;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'F':
                {
                int LA18_58 = input.LA(3);

                if ( (LA18_58=='$'||(LA18_58>='0' && LA18_58<='9')||(LA18_58>='A' && LA18_58<='Z')||LA18_58=='_'||(LA18_58>='a' && LA18_58<='z')||(LA18_58>='\u00C0' && LA18_58<='\u00D6')||(LA18_58>='\u00D8' && LA18_58<='\u00F6')||(LA18_58>='\u00F8' && LA18_58<='\u1FFF')||(LA18_58>='\u3040' && LA18_58<='\u318F')||(LA18_58>='\u3300' && LA18_58<='\u337F')||(LA18_58>='\u3400' && LA18_58<='\u3D2D')||(LA18_58>='\u4E00' && LA18_58<='\u9FFF')||(LA18_58>='\uF900' && LA18_58<='\uFAFF')) ) {
                    alt18=95;
                }
                else {
                    alt18=23;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='E') ) {
            switch ( input.LA(2) ) {
            case 'L':
                {
                int LA18_59 = input.LA(3);

                if ( (LA18_59=='S') ) {
                    int LA18_129 = input.LA(4);

                    if ( (LA18_129=='E') ) {
                        int LA18_182 = input.LA(5);

                        if ( (LA18_182=='I') ) {
                            int LA18_239 = input.LA(6);

                            if ( (LA18_239=='F') ) {
                                int LA18_292 = input.LA(7);

                                if ( (LA18_292=='$'||(LA18_292>='0' && LA18_292<='9')||(LA18_292>='A' && LA18_292<='Z')||LA18_292=='_'||(LA18_292>='a' && LA18_292<='z')||(LA18_292>='\u00C0' && LA18_292<='\u00D6')||(LA18_292>='\u00D8' && LA18_292<='\u00F6')||(LA18_292>='\u00F8' && LA18_292<='\u1FFF')||(LA18_292>='\u3040' && LA18_292<='\u318F')||(LA18_292>='\u3300' && LA18_292<='\u337F')||(LA18_292>='\u3400' && LA18_292<='\u3D2D')||(LA18_292>='\u4E00' && LA18_292<='\u9FFF')||(LA18_292>='\uF900' && LA18_292<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=25;}
                            }
                            else {
                                alt18=95;}
                        }
                        else if ( (LA18_182=='$'||(LA18_182>='0' && LA18_182<='9')||(LA18_182>='A' && LA18_182<='H')||(LA18_182>='J' && LA18_182<='Z')||LA18_182=='_'||(LA18_182>='a' && LA18_182<='z')||(LA18_182>='\u00C0' && LA18_182<='\u00D6')||(LA18_182>='\u00D8' && LA18_182<='\u00F6')||(LA18_182>='\u00F8' && LA18_182<='\u1FFF')||(LA18_182>='\u3040' && LA18_182<='\u318F')||(LA18_182>='\u3300' && LA18_182<='\u337F')||(LA18_182>='\u3400' && LA18_182<='\u3D2D')||(LA18_182>='\u4E00' && LA18_182<='\u9FFF')||(LA18_182>='\uF900' && LA18_182<='\uFAFF')) ) {
                            alt18=95;
                        }
                        else {
                            alt18=26;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'N':
                {
                int LA18_60 = input.LA(3);

                if ( (LA18_60=='D') ) {
                    switch ( input.LA(4) ) {
                    case 'P':
                        {
                        int LA18_183 = input.LA(5);

                        if ( (LA18_183=='R') ) {
                            int LA18_241 = input.LA(6);

                            if ( (LA18_241=='O') ) {
                                int LA18_293 = input.LA(7);

                                if ( (LA18_293=='T') ) {
                                    int LA18_336 = input.LA(8);

                                    if ( (LA18_336=='E') ) {
                                        int LA18_375 = input.LA(9);

                                        if ( (LA18_375=='C') ) {
                                            int LA18_399 = input.LA(10);

                                            if ( (LA18_399=='T') ) {
                                                int LA18_412 = input.LA(11);

                                                if ( (LA18_412=='$'||(LA18_412>='0' && LA18_412<='9')||(LA18_412>='A' && LA18_412<='Z')||LA18_412=='_'||(LA18_412>='a' && LA18_412<='z')||(LA18_412>='\u00C0' && LA18_412<='\u00D6')||(LA18_412>='\u00D8' && LA18_412<='\u00F6')||(LA18_412>='\u00F8' && LA18_412<='\u1FFF')||(LA18_412>='\u3040' && LA18_412<='\u318F')||(LA18_412>='\u3300' && LA18_412<='\u337F')||(LA18_412>='\u3400' && LA18_412<='\u3D2D')||(LA18_412>='\u4E00' && LA18_412<='\u9FFF')||(LA18_412>='\uF900' && LA18_412<='\uFAFF')) ) {
                                                    alt18=95;
                                                }
                                                else {
                                                    alt18=34;}
                                            }
                                            else {
                                                alt18=95;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                        }
                        break;
                    case 'I':
                        {
                        int LA18_184 = input.LA(5);

                        if ( (LA18_184=='F') ) {
                            int LA18_242 = input.LA(6);

                            if ( (LA18_242=='$'||(LA18_242>='0' && LA18_242<='9')||(LA18_242>='A' && LA18_242<='Z')||LA18_242=='_'||(LA18_242>='a' && LA18_242<='z')||(LA18_242>='\u00C0' && LA18_242<='\u00D6')||(LA18_242>='\u00D8' && LA18_242<='\u00F6')||(LA18_242>='\u00F8' && LA18_242<='\u1FFF')||(LA18_242>='\u3040' && LA18_242<='\u318F')||(LA18_242>='\u3300' && LA18_242<='\u337F')||(LA18_242>='\u3400' && LA18_242<='\u3D2D')||(LA18_242>='\u4E00' && LA18_242<='\u9FFF')||(LA18_242>='\uF900' && LA18_242<='\uFAFF')) ) {
                                alt18=95;
                            }
                            else {
                                alt18=24;}
                        }
                        else {
                            alt18=95;}
                        }
                        break;
                    case 'F':
                        {
                        switch ( input.LA(5) ) {
                        case 'I':
                            {
                            int LA18_243 = input.LA(6);

                            if ( (LA18_243=='L') ) {
                                int LA18_295 = input.LA(7);

                                if ( (LA18_295=='E') ) {
                                    int LA18_337 = input.LA(8);

                                    if ( (LA18_337=='$'||(LA18_337>='0' && LA18_337<='9')||(LA18_337>='A' && LA18_337<='Z')||LA18_337=='_'||(LA18_337>='a' && LA18_337<='z')||(LA18_337>='\u00C0' && LA18_337<='\u00D6')||(LA18_337>='\u00D8' && LA18_337<='\u00F6')||(LA18_337>='\u00F8' && LA18_337<='\u1FFF')||(LA18_337>='\u3040' && LA18_337<='\u318F')||(LA18_337>='\u3300' && LA18_337<='\u337F')||(LA18_337>='\u3400' && LA18_337<='\u3D2D')||(LA18_337>='\u4E00' && LA18_337<='\u9FFF')||(LA18_337>='\uF900' && LA18_337<='\uFAFF')) ) {
                                        alt18=95;
                                    }
                                    else {
                                        alt18=19;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                            }
                            break;
                        case 'O':
                            {
                            int LA18_244 = input.LA(6);

                            if ( (LA18_244=='R') ) {
                                int LA18_296 = input.LA(7);

                                if ( (LA18_296=='E') ) {
                                    int LA18_338 = input.LA(8);

                                    if ( (LA18_338=='A') ) {
                                        int LA18_377 = input.LA(9);

                                        if ( (LA18_377=='C') ) {
                                            int LA18_400 = input.LA(10);

                                            if ( (LA18_400=='H') ) {
                                                int LA18_413 = input.LA(11);

                                                if ( (LA18_413=='$'||(LA18_413>='0' && LA18_413<='9')||(LA18_413>='A' && LA18_413<='Z')||LA18_413=='_'||(LA18_413>='a' && LA18_413<='z')||(LA18_413>='\u00C0' && LA18_413<='\u00D6')||(LA18_413>='\u00D8' && LA18_413<='\u00F6')||(LA18_413>='\u00F8' && LA18_413<='\u1FFF')||(LA18_413>='\u3040' && LA18_413<='\u318F')||(LA18_413>='\u3300' && LA18_413<='\u337F')||(LA18_413>='\u3400' && LA18_413<='\u3D2D')||(LA18_413>='\u4E00' && LA18_413<='\u9FFF')||(LA18_413>='\uF900' && LA18_413<='\uFAFF')) ) {
                                                    alt18=95;
                                                }
                                                else {
                                                    alt18=22;}
                                            }
                                            else {
                                                alt18=95;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                            }
                            break;
                        default:
                            alt18=95;}

                        }
                        break;
                    case 'A':
                        {
                        int LA18_186 = input.LA(5);

                        if ( (LA18_186=='R') ) {
                            int LA18_245 = input.LA(6);

                            if ( (LA18_245=='O') ) {
                                int LA18_297 = input.LA(7);

                                if ( (LA18_297=='U') ) {
                                    int LA18_339 = input.LA(8);

                                    if ( (LA18_339=='N') ) {
                                        int LA18_378 = input.LA(9);

                                        if ( (LA18_378=='D') ) {
                                            int LA18_401 = input.LA(10);

                                            if ( (LA18_401=='$'||(LA18_401>='0' && LA18_401<='9')||(LA18_401>='A' && LA18_401<='Z')||LA18_401=='_'||(LA18_401>='a' && LA18_401<='z')||(LA18_401>='\u00C0' && LA18_401<='\u00D6')||(LA18_401>='\u00D8' && LA18_401<='\u00F6')||(LA18_401>='\u00F8' && LA18_401<='\u1FFF')||(LA18_401>='\u3040' && LA18_401<='\u318F')||(LA18_401>='\u3300' && LA18_401<='\u337F')||(LA18_401>='\u3400' && LA18_401<='\u3D2D')||(LA18_401>='\u4E00' && LA18_401<='\u9FFF')||(LA18_401>='\uF900' && LA18_401<='\uFAFF')) ) {
                                                alt18=95;
                                            }
                                            else {
                                                alt18=94;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                        }
                        break;
                    case 'D':
                        {
                        int LA18_187 = input.LA(5);

                        if ( (LA18_187=='E') ) {
                            int LA18_246 = input.LA(6);

                            if ( (LA18_246=='F') ) {
                                int LA18_298 = input.LA(7);

                                if ( (LA18_298=='I') ) {
                                    int LA18_340 = input.LA(8);

                                    if ( (LA18_340=='N') ) {
                                        int LA18_379 = input.LA(9);

                                        if ( (LA18_379=='E') ) {
                                            int LA18_402 = input.LA(10);

                                            if ( (LA18_402=='$'||(LA18_402>='0' && LA18_402<='9')||(LA18_402>='A' && LA18_402<='Z')||LA18_402=='_'||(LA18_402>='a' && LA18_402<='z')||(LA18_402>='\u00C0' && LA18_402<='\u00D6')||(LA18_402>='\u00D8' && LA18_402<='\u00F6')||(LA18_402>='\u00F8' && LA18_402<='\u1FFF')||(LA18_402>='\u3040' && LA18_402<='\u318F')||(LA18_402>='\u3300' && LA18_402<='\u337F')||(LA18_402>='\u3400' && LA18_402<='\u3D2D')||(LA18_402>='\u4E00' && LA18_402<='\u9FFF')||(LA18_402>='\uF900' && LA18_402<='\uFAFF')) ) {
                                                alt18=95;
                                            }
                                            else {
                                                alt18=92;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                        }
                        break;
                    case 'L':
                        {
                        int LA18_188 = input.LA(5);

                        if ( (LA18_188=='E') ) {
                            int LA18_247 = input.LA(6);

                            if ( (LA18_247=='T') ) {
                                int LA18_299 = input.LA(7);

                                if ( (LA18_299=='$'||(LA18_299>='0' && LA18_299<='9')||(LA18_299>='A' && LA18_299<='Z')||LA18_299=='_'||(LA18_299>='a' && LA18_299<='z')||(LA18_299>='\u00C0' && LA18_299<='\u00D6')||(LA18_299>='\u00D8' && LA18_299<='\u00F6')||(LA18_299>='\u00F8' && LA18_299<='\u1FFF')||(LA18_299>='\u3040' && LA18_299<='\u318F')||(LA18_299>='\u3300' && LA18_299<='\u337F')||(LA18_299>='\u3400' && LA18_299<='\u3D2D')||(LA18_299>='\u4E00' && LA18_299<='\u9FFF')||(LA18_299>='\uF900' && LA18_299<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=28;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                        }
                        break;
                    default:
                        alt18=95;}

                }
                else {
                    alt18=95;}
                }
                break;
            case 'R':
                {
                int LA18_61 = input.LA(3);

                if ( (LA18_61=='R') ) {
                    int LA18_131 = input.LA(4);

                    if ( (LA18_131=='O') ) {
                        int LA18_189 = input.LA(5);

                        if ( (LA18_189=='R') ) {
                            int LA18_248 = input.LA(6);

                            if ( (LA18_248=='$'||(LA18_248>='0' && LA18_248<='9')||(LA18_248>='A' && LA18_248<='Z')||LA18_248=='_'||(LA18_248>='a' && LA18_248<='z')||(LA18_248>='\u00C0' && LA18_248<='\u00D6')||(LA18_248>='\u00D8' && LA18_248<='\u00F6')||(LA18_248>='\u00F8' && LA18_248<='\u1FFF')||(LA18_248>='\u3040' && LA18_248<='\u318F')||(LA18_248>='\u3300' && LA18_248<='\u337F')||(LA18_248>='\u3400' && LA18_248<='\u3D2D')||(LA18_248>='\u4E00' && LA18_248<='\u9FFF')||(LA18_248>='\uF900' && LA18_248<='\uFAFF')) ) {
                                alt18=95;
                            }
                            else {
                                alt18=14;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'X':
                {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    int LA18_132 = input.LA(4);

                    if ( (LA18_132=='E') ) {
                        int LA18_190 = input.LA(5);

                        if ( (LA18_190=='N') ) {
                            int LA18_249 = input.LA(6);

                            if ( (LA18_249=='S') ) {
                                int LA18_301 = input.LA(7);

                                if ( (LA18_301=='I') ) {
                                    int LA18_342 = input.LA(8);

                                    if ( (LA18_342=='O') ) {
                                        int LA18_380 = input.LA(9);

                                        if ( (LA18_380=='N') ) {
                                            int LA18_403 = input.LA(10);

                                            if ( (LA18_403=='$'||(LA18_403>='0' && LA18_403<='9')||(LA18_403>='A' && LA18_403<='Z')||LA18_403=='_'||(LA18_403>='a' && LA18_403<='z')||(LA18_403>='\u00C0' && LA18_403<='\u00D6')||(LA18_403>='\u00D8' && LA18_403<='\u00F6')||(LA18_403>='\u00F8' && LA18_403<='\u1FFF')||(LA18_403>='\u3040' && LA18_403<='\u318F')||(LA18_403>='\u3300' && LA18_403<='\u337F')||(LA18_403>='\u3400' && LA18_403<='\u3D2D')||(LA18_403>='\u4E00' && LA18_403<='\u9FFF')||(LA18_403>='\uF900' && LA18_403<='\uFAFF')) ) {
                                                alt18=95;
                                            }
                                            else {
                                                alt18=3;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                    }
                    break;
                case 'P':
                    {
                    int LA18_133 = input.LA(4);

                    if ( (LA18_133=='A') ) {
                        int LA18_191 = input.LA(5);

                        if ( (LA18_191=='N') ) {
                            int LA18_250 = input.LA(6);

                            if ( (LA18_250=='D') ) {
                                int LA18_302 = input.LA(7);

                                if ( (LA18_302=='$'||(LA18_302>='0' && LA18_302<='9')||(LA18_302>='A' && LA18_302<='Z')||LA18_302=='_'||(LA18_302>='a' && LA18_302<='z')||(LA18_302>='\u00C0' && LA18_302<='\u00D6')||(LA18_302>='\u00D8' && LA18_302<='\u00F6')||(LA18_302>='\u00F8' && LA18_302<='\u1FFF')||(LA18_302>='\u3040' && LA18_302<='\u318F')||(LA18_302>='\u3300' && LA18_302<='\u337F')||(LA18_302>='\u3400' && LA18_302<='\u3D2D')||(LA18_302>='\u4E00' && LA18_302<='\u9FFF')||(LA18_302>='\uF900' && LA18_302<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=15;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                    }
                    break;
                default:
                    alt18=95;}

                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'f':
                {
                int LA18_63 = input.LA(3);

                if ( (LA18_63=='$'||(LA18_63>='0' && LA18_63<='9')||(LA18_63>='A' && LA18_63<='Z')||LA18_63=='_'||(LA18_63>='a' && LA18_63<='z')||(LA18_63>='\u00C0' && LA18_63<='\u00D6')||(LA18_63>='\u00D8' && LA18_63<='\u00F6')||(LA18_63>='\u00F8' && LA18_63<='\u1FFF')||(LA18_63>='\u3040' && LA18_63<='\u318F')||(LA18_63>='\u3300' && LA18_63<='\u337F')||(LA18_63>='\u3400' && LA18_63<='\u3D2D')||(LA18_63>='\u4E00' && LA18_63<='\u9FFF')||(LA18_63>='\uF900' && LA18_63<='\uFAFF')) ) {
                    alt18=95;
                }
                else {
                    alt18=36;}
                }
                break;
            case 'm':
                {
                int LA18_64 = input.LA(3);

                if ( (LA18_64=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA18_192 = input.LA(5);

                        if ( (LA18_192=='r') ) {
                            int LA18_251 = input.LA(6);

                            if ( (LA18_251=='t') ) {
                                int LA18_303 = input.LA(7);

                                if ( (LA18_303=='$'||(LA18_303>='0' && LA18_303<='9')||(LA18_303>='A' && LA18_303<='Z')||LA18_303=='_'||(LA18_303>='a' && LA18_303<='z')||(LA18_303>='\u00C0' && LA18_303<='\u00D6')||(LA18_303>='\u00D8' && LA18_303<='\u00F6')||(LA18_303>='\u00F8' && LA18_303<='\u1FFF')||(LA18_303>='\u3040' && LA18_303<='\u318F')||(LA18_303>='\u3300' && LA18_303<='\u337F')||(LA18_303>='\u3400' && LA18_303<='\u3D2D')||(LA18_303>='\u4E00' && LA18_303<='\u9FFF')||(LA18_303>='\uF900' && LA18_303<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=4;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                        }
                        break;
                    case 'l':
                        {
                        int LA18_193 = input.LA(5);

                        if ( (LA18_193=='i') ) {
                            int LA18_252 = input.LA(6);

                            if ( (LA18_252=='e') ) {
                                int LA18_304 = input.LA(7);

                                if ( (LA18_304=='s') ) {
                                    int LA18_345 = input.LA(8);

                                    if ( (LA18_345=='$'||(LA18_345>='0' && LA18_345<='9')||(LA18_345>='A' && LA18_345<='Z')||LA18_345=='_'||(LA18_345>='a' && LA18_345<='z')||(LA18_345>='\u00C0' && LA18_345<='\u00D6')||(LA18_345>='\u00D8' && LA18_345<='\u00F6')||(LA18_345>='\u00F8' && LA18_345<='\u1FFF')||(LA18_345>='\u3040' && LA18_345<='\u318F')||(LA18_345>='\u3300' && LA18_345<='\u337F')||(LA18_345>='\u3400' && LA18_345<='\u3D2D')||(LA18_345>='\u4E00' && LA18_345<='\u9FFF')||(LA18_345>='\uF900' && LA18_345<='\uFAFF')) ) {
                                        alt18=95;
                                    }
                                    else {
                                        alt18=62;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                        }
                        break;
                    default:
                        alt18=95;}

                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0==';') ) {
            alt18=5;
        }
        else if ( (LA18_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA18_65 = input.LA(3);

                if ( (LA18_65=='s') ) {
                    int LA18_136 = input.LA(4);

                    if ( (LA18_136=='e') ) {
                        int LA18_194 = input.LA(5);

                        if ( (LA18_194=='$'||(LA18_194>='0' && LA18_194<='9')||(LA18_194>='A' && LA18_194<='Z')||LA18_194=='_'||(LA18_194>='a' && LA18_194<='z')||(LA18_194>='\u00C0' && LA18_194<='\u00D6')||(LA18_194>='\u00D8' && LA18_194<='\u00F6')||(LA18_194>='\u00F8' && LA18_194<='\u1FFF')||(LA18_194>='\u3040' && LA18_194<='\u318F')||(LA18_194>='\u3300' && LA18_194<='\u337F')||(LA18_194>='\u3400' && LA18_194<='\u3D2D')||(LA18_194>='\u4E00' && LA18_194<='\u9FFF')||(LA18_194>='\uF900' && LA18_194<='\uFAFF')) ) {
                            alt18=95;
                        }
                        else {
                            alt18=54;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA18_137 = input.LA(4);

                    if ( (LA18_137=='s') ) {
                        int LA18_195 = input.LA(5);

                        if ( (LA18_195=='t') ) {
                            int LA18_254 = input.LA(6);

                            if ( (LA18_254=='s') ) {
                                int LA18_305 = input.LA(7);

                                if ( (LA18_305=='$'||(LA18_305>='0' && LA18_305<='9')||(LA18_305>='A' && LA18_305<='Z')||LA18_305=='_'||(LA18_305>='a' && LA18_305<='z')||(LA18_305>='\u00C0' && LA18_305<='\u00D6')||(LA18_305>='\u00D8' && LA18_305<='\u00F6')||(LA18_305>='\u00F8' && LA18_305<='\u1FFF')||(LA18_305>='\u3040' && LA18_305<='\u318F')||(LA18_305>='\u3300' && LA18_305<='\u337F')||(LA18_305>='\u3400' && LA18_305<='\u3D2D')||(LA18_305>='\u4E00' && LA18_305<='\u9FFF')||(LA18_305>='\uF900' && LA18_305<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=82;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                    }
                    break;
                case 't':
                    {
                    int LA18_138 = input.LA(4);

                    if ( (LA18_138=='e') ) {
                        int LA18_196 = input.LA(5);

                        if ( (LA18_196=='n') ) {
                            int LA18_255 = input.LA(6);

                            if ( (LA18_255=='s') ) {
                                int LA18_306 = input.LA(7);

                                if ( (LA18_306=='i') ) {
                                    int LA18_347 = input.LA(8);

                                    if ( (LA18_347=='o') ) {
                                        int LA18_382 = input.LA(9);

                                        if ( (LA18_382=='n') ) {
                                            int LA18_404 = input.LA(10);

                                            if ( (LA18_404=='$'||(LA18_404>='0' && LA18_404<='9')||(LA18_404>='A' && LA18_404<='Z')||LA18_404=='_'||(LA18_404>='a' && LA18_404<='z')||(LA18_404>='\u00C0' && LA18_404<='\u00D6')||(LA18_404>='\u00D8' && LA18_404<='\u00F6')||(LA18_404>='\u00F8' && LA18_404<='\u1FFF')||(LA18_404>='\u3040' && LA18_404<='\u318F')||(LA18_404>='\u3300' && LA18_404<='\u337F')||(LA18_404>='\u3400' && LA18_404<='\u3D2D')||(LA18_404>='\u4E00' && LA18_404<='\u9FFF')||(LA18_404>='\uF900' && LA18_404<='\uFAFF')) ) {
                                                alt18=95;
                                            }
                                            else {
                                                alt18=6;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                    }
                    break;
                default:
                    alt18=95;}

                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='r') ) {
            int LA18_7 = input.LA(2);

            if ( (LA18_7=='e') ) {
                switch ( input.LA(3) ) {
                case 'e':
                    {
                    int LA18_139 = input.LA(4);

                    if ( (LA18_139=='x') ) {
                        int LA18_197 = input.LA(5);

                        if ( (LA18_197=='p') ) {
                            int LA18_256 = input.LA(6);

                            if ( (LA18_256=='o') ) {
                                int LA18_307 = input.LA(7);

                                if ( (LA18_307=='r') ) {
                                    int LA18_348 = input.LA(8);

                                    if ( (LA18_348=='t') ) {
                                        int LA18_383 = input.LA(9);

                                        if ( (LA18_383=='$'||(LA18_383>='0' && LA18_383<='9')||(LA18_383>='A' && LA18_383<='Z')||LA18_383=='_'||(LA18_383>='a' && LA18_383<='z')||(LA18_383>='\u00C0' && LA18_383<='\u00D6')||(LA18_383>='\u00D8' && LA18_383<='\u00F6')||(LA18_383>='\u00F8' && LA18_383<='\u1FFF')||(LA18_383>='\u3040' && LA18_383<='\u318F')||(LA18_383>='\u3300' && LA18_383<='\u337F')||(LA18_383>='\u3400' && LA18_383<='\u3D2D')||(LA18_383>='\u4E00' && LA18_383<='\u9FFF')||(LA18_383>='\uF900' && LA18_383<='\uFAFF')) ) {
                                            alt18=95;
                                        }
                                        else {
                                            alt18=7;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                    }
                    break;
                case 'j':
                    {
                    int LA18_140 = input.LA(4);

                    if ( (LA18_140=='e') ) {
                        int LA18_198 = input.LA(5);

                        if ( (LA18_198=='c') ) {
                            int LA18_257 = input.LA(6);

                            if ( (LA18_257=='t') ) {
                                int LA18_308 = input.LA(7);

                                if ( (LA18_308=='$'||(LA18_308>='0' && LA18_308<='9')||(LA18_308>='A' && LA18_308<='Z')||LA18_308=='_'||(LA18_308>='a' && LA18_308<='z')||(LA18_308>='\u00C0' && LA18_308<='\u00D6')||(LA18_308>='\u00D8' && LA18_308<='\u00F6')||(LA18_308>='\u00F8' && LA18_308<='\u1FFF')||(LA18_308>='\u3040' && LA18_308<='\u318F')||(LA18_308>='\u3300' && LA18_308<='\u337F')||(LA18_308>='\u3400' && LA18_308<='\u3D2D')||(LA18_308>='\u4E00' && LA18_308<='\u9FFF')||(LA18_308>='\uF900' && LA18_308<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=81;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                    }
                    break;
                default:
                    alt18=95;}

            }
            else {
                alt18=95;}
        }
        else if ( (LA18_0=='(') ) {
            alt18=8;
        }
        else if ( (LA18_0==',') ) {
            alt18=9;
        }
        else if ( (LA18_0=='*') ) {
            alt18=10;
        }
        else if ( (LA18_0==')') ) {
            alt18=11;
        }
        else if ( (LA18_0=='F') ) {
            switch ( input.LA(2) ) {
            case 'O':
                {
                int LA18_68 = input.LA(3);

                if ( (LA18_68=='R') ) {
                    int LA18_141 = input.LA(4);

                    if ( (LA18_141=='E') ) {
                        int LA18_199 = input.LA(5);

                        if ( (LA18_199=='A') ) {
                            int LA18_258 = input.LA(6);

                            if ( (LA18_258=='C') ) {
                                int LA18_309 = input.LA(7);

                                if ( (LA18_309=='H') ) {
                                    int LA18_350 = input.LA(8);

                                    if ( (LA18_350=='$'||(LA18_350>='0' && LA18_350<='9')||(LA18_350>='A' && LA18_350<='Z')||LA18_350=='_'||(LA18_350>='a' && LA18_350<='z')||(LA18_350>='\u00C0' && LA18_350<='\u00D6')||(LA18_350>='\u00D8' && LA18_350<='\u00F6')||(LA18_350>='\u00F8' && LA18_350<='\u1FFF')||(LA18_350>='\u3040' && LA18_350<='\u318F')||(LA18_350>='\u3300' && LA18_350<='\u337F')||(LA18_350>='\u3400' && LA18_350<='\u3D2D')||(LA18_350>='\u4E00' && LA18_350<='\u9FFF')||(LA18_350>='\uF900' && LA18_350<='\uFAFF')) ) {
                                        alt18=95;
                                    }
                                    else {
                                        alt18=16;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else if ( (LA18_141=='$'||(LA18_141>='0' && LA18_141<='9')||(LA18_141>='A' && LA18_141<='D')||(LA18_141>='F' && LA18_141<='Z')||LA18_141=='_'||(LA18_141>='a' && LA18_141<='z')||(LA18_141>='\u00C0' && LA18_141<='\u00D6')||(LA18_141>='\u00D8' && LA18_141<='\u00F6')||(LA18_141>='\u00F8' && LA18_141<='\u1FFF')||(LA18_141>='\u3040' && LA18_141<='\u318F')||(LA18_141>='\u3300' && LA18_141<='\u337F')||(LA18_141>='\u3400' && LA18_141<='\u3D2D')||(LA18_141>='\u4E00' && LA18_141<='\u9FFF')||(LA18_141>='\uF900' && LA18_141<='\uFAFF')) ) {
                        alt18=95;
                    }
                    else {
                        alt18=12;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'I':
                {
                int LA18_69 = input.LA(3);

                if ( (LA18_69=='L') ) {
                    int LA18_142 = input.LA(4);

                    if ( (LA18_142=='E') ) {
                        int LA18_201 = input.LA(5);

                        if ( (LA18_201=='$'||(LA18_201>='0' && LA18_201<='9')||(LA18_201>='A' && LA18_201<='Z')||LA18_201=='_'||(LA18_201>='a' && LA18_201<='z')||(LA18_201>='\u00C0' && LA18_201<='\u00D6')||(LA18_201>='\u00D8' && LA18_201<='\u00F6')||(LA18_201>='\u00F8' && LA18_201<='\u1FFF')||(LA18_201>='\u3040' && LA18_201<='\u318F')||(LA18_201>='\u3300' && LA18_201<='\u337F')||(LA18_201>='\u3400' && LA18_201<='\u3D2D')||(LA18_201>='\u4E00' && LA18_201<='\u9FFF')||(LA18_201>='\uF900' && LA18_201<='\uFAFF')) ) {
                            alt18=95;
                        }
                        else {
                            alt18=18;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='-') ) {
            int LA18_13 = input.LA(2);

            if ( (LA18_13=='>') ) {
                alt18=51;
            }
            else {
                alt18=13;}
        }
        else if ( (LA18_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA18_72 = input.LA(3);

                if ( (LA18_72=='t') ) {
                    int LA18_143 = input.LA(4);

                    if ( (LA18_143=='$'||(LA18_143>='0' && LA18_143<='9')||(LA18_143>='A' && LA18_143<='Z')||LA18_143=='_'||(LA18_143>='a' && LA18_143<='z')||(LA18_143>='\u00C0' && LA18_143<='\u00D6')||(LA18_143>='\u00D8' && LA18_143<='\u00F6')||(LA18_143>='\u00F8' && LA18_143<='\u1FFF')||(LA18_143>='\u3040' && LA18_143<='\u318F')||(LA18_143>='\u3300' && LA18_143<='\u337F')||(LA18_143>='\u3400' && LA18_143<='\u3D2D')||(LA18_143>='\u4E00' && LA18_143<='\u9FFF')||(LA18_143>='\uF900' && LA18_143<='\uFAFF')) ) {
                        alt18=95;
                    }
                    else {
                        alt18=48;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'E':
                {
                int LA18_73 = input.LA(3);

                if ( (LA18_73=='P') ) {
                    int LA18_144 = input.LA(4);

                    if ( (LA18_144=='A') ) {
                        int LA18_203 = input.LA(5);

                        if ( (LA18_203=='R') ) {
                            int LA18_260 = input.LA(6);

                            if ( (LA18_260=='A') ) {
                                int LA18_310 = input.LA(7);

                                if ( (LA18_310=='T') ) {
                                    int LA18_351 = input.LA(8);

                                    if ( (LA18_351=='O') ) {
                                        int LA18_385 = input.LA(9);

                                        if ( (LA18_385=='R') ) {
                                            int LA18_406 = input.LA(10);

                                            if ( (LA18_406=='$'||(LA18_406>='0' && LA18_406<='9')||(LA18_406>='A' && LA18_406<='Z')||LA18_406=='_'||(LA18_406>='a' && LA18_406<='z')||(LA18_406>='\u00C0' && LA18_406<='\u00D6')||(LA18_406>='\u00D8' && LA18_406<='\u00F6')||(LA18_406>='\u00F8' && LA18_406<='\u1FFF')||(LA18_406>='\u3040' && LA18_406<='\u318F')||(LA18_406>='\u3300' && LA18_406<='\u337F')||(LA18_406>='\u3400' && LA18_406<='\u3D2D')||(LA18_406>='\u4E00' && LA18_406<='\u9FFF')||(LA18_406>='\uF900' && LA18_406<='\uFAFF')) ) {
                                                alt18=95;
                                            }
                                            else {
                                                alt18=17;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'S':
                {
                int LA18_74 = input.LA(3);

                if ( (LA18_74=='$'||(LA18_74>='0' && LA18_74<='9')||(LA18_74>='A' && LA18_74<='Z')||LA18_74=='_'||(LA18_74>='a' && LA18_74<='z')||(LA18_74>='\u00C0' && LA18_74<='\u00D6')||(LA18_74>='\u00D8' && LA18_74<='\u00F6')||(LA18_74>='\u00F8' && LA18_74<='\u1FFF')||(LA18_74>='\u3040' && LA18_74<='\u318F')||(LA18_74>='\u3300' && LA18_74<='\u337F')||(LA18_74>='\u3400' && LA18_74<='\u3D2D')||(LA18_74>='\u4E00' && LA18_74<='\u9FFF')||(LA18_74>='\uF900' && LA18_74<='\uFAFF')) ) {
                    alt18=95;
                }
                else {
                    alt18=20;}
                }
                break;
            case 'R':
                {
                int LA18_75 = input.LA(3);

                if ( (LA18_75=='O') ) {
                    int LA18_146 = input.LA(4);

                    if ( (LA18_146=='U') ) {
                        int LA18_204 = input.LA(5);

                        if ( (LA18_204=='N') ) {
                            int LA18_261 = input.LA(6);

                            if ( (LA18_261=='D') ) {
                                int LA18_311 = input.LA(7);

                                if ( (LA18_311=='$'||(LA18_311>='0' && LA18_311<='9')||(LA18_311>='A' && LA18_311<='Z')||LA18_311=='_'||(LA18_311>='a' && LA18_311<='z')||(LA18_311>='\u00C0' && LA18_311<='\u00D6')||(LA18_311>='\u00D8' && LA18_311<='\u00F6')||(LA18_311>='\u00F8' && LA18_311<='\u1FFF')||(LA18_311>='\u3040' && LA18_311<='\u318F')||(LA18_311>='\u3300' && LA18_311<='\u337F')||(LA18_311>='\u3400' && LA18_311<='\u3D2D')||(LA18_311>='\u4E00' && LA18_311<='\u9FFF')||(LA18_311>='\uF900' && LA18_311<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=93;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='L') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA18_76 = input.LA(3);

                if ( (LA18_76=='s') ) {
                    int LA18_147 = input.LA(4);

                    if ( (LA18_147=='t') ) {
                        int LA18_205 = input.LA(5);

                        if ( (LA18_205=='$'||(LA18_205>='0' && LA18_205<='9')||(LA18_205>='A' && LA18_205<='Z')||LA18_205=='_'||(LA18_205>='a' && LA18_205<='z')||(LA18_205>='\u00C0' && LA18_205<='\u00D6')||(LA18_205>='\u00D8' && LA18_205<='\u00F6')||(LA18_205>='\u00F8' && LA18_205<='\u1FFF')||(LA18_205>='\u3040' && LA18_205<='\u318F')||(LA18_205>='\u3300' && LA18_205<='\u337F')||(LA18_205>='\u3400' && LA18_205<='\u3D2D')||(LA18_205>='\u4E00' && LA18_205<='\u9FFF')||(LA18_205>='\uF900' && LA18_205<='\uFAFF')) ) {
                            alt18=95;
                        }
                        else {
                            alt18=47;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'E':
                {
                int LA18_77 = input.LA(3);

                if ( (LA18_77=='T') ) {
                    int LA18_148 = input.LA(4);

                    if ( (LA18_148=='$'||(LA18_148>='0' && LA18_148<='9')||(LA18_148>='A' && LA18_148<='Z')||LA18_148=='_'||(LA18_148>='a' && LA18_148<='z')||(LA18_148>='\u00C0' && LA18_148<='\u00D6')||(LA18_148>='\u00D8' && LA18_148<='\u00F6')||(LA18_148>='\u00F8' && LA18_148<='\u1FFF')||(LA18_148>='\u3040' && LA18_148<='\u318F')||(LA18_148>='\u3300' && LA18_148<='\u337F')||(LA18_148>='\u3400' && LA18_148<='\u3D2D')||(LA18_148>='\u4E00' && LA18_148<='\u9FFF')||(LA18_148>='\uF900' && LA18_148<='\uFAFF')) ) {
                        alt18=95;
                    }
                    else {
                        alt18=27;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='P') ) {
            int LA18_17 = input.LA(2);

            if ( (LA18_17=='R') ) {
                int LA18_78 = input.LA(3);

                if ( (LA18_78=='O') ) {
                    int LA18_149 = input.LA(4);

                    if ( (LA18_149=='T') ) {
                        int LA18_207 = input.LA(5);

                        if ( (LA18_207=='E') ) {
                            int LA18_263 = input.LA(6);

                            if ( (LA18_263=='C') ) {
                                int LA18_312 = input.LA(7);

                                if ( (LA18_312=='T') ) {
                                    int LA18_353 = input.LA(8);

                                    if ( (LA18_353=='$'||(LA18_353>='0' && LA18_353<='9')||(LA18_353>='A' && LA18_353<='Z')||LA18_353=='_'||(LA18_353>='a' && LA18_353<='z')||(LA18_353>='\u00C0' && LA18_353<='\u00D6')||(LA18_353>='\u00D8' && LA18_353<='\u00F6')||(LA18_353>='\u00F8' && LA18_353<='\u1FFF')||(LA18_353>='\u3040' && LA18_353<='\u318F')||(LA18_353>='\u3300' && LA18_353<='\u337F')||(LA18_353>='\u3400' && LA18_353<='\u3D2D')||(LA18_353>='\u4E00' && LA18_353<='\u9FFF')||(LA18_353>='\uF900' && LA18_353<='\uFAFF')) ) {
                                        alt18=95;
                                    }
                                    else {
                                        alt18=29;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
            }
            else {
                alt18=95;}
        }
        else if ( (LA18_0=='C') ) {
            switch ( input.LA(2) ) {
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
                                int LA18_313 = input.LA(7);

                                if ( (LA18_313=='$'||(LA18_313>='0' && LA18_313<='9')||(LA18_313>='A' && LA18_313<='Z')||LA18_313=='_'||(LA18_313>='a' && LA18_313<='z')||(LA18_313>='\u00C0' && LA18_313<='\u00D6')||(LA18_313>='\u00D8' && LA18_313<='\u00F6')||(LA18_313>='\u00F8' && LA18_313<='\u1FFF')||(LA18_313>='\u3040' && LA18_313<='\u318F')||(LA18_313>='\u3300' && LA18_313<='\u337F')||(LA18_313>='\u3400' && LA18_313<='\u3D2D')||(LA18_313>='\u4E00' && LA18_313<='\u9FFF')||(LA18_313>='\uF900' && LA18_313<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=30;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'E':
                {
                int LA18_80 = input.LA(3);

                if ( (LA18_80=='N') ) {
                    int LA18_151 = input.LA(4);

                    if ( (LA18_151=='D') ) {
                        int LA18_209 = input.LA(5);

                        if ( (LA18_209=='$'||(LA18_209>='0' && LA18_209<='9')||(LA18_209>='A' && LA18_209<='Z')||LA18_209=='_'||(LA18_209>='a' && LA18_209<='z')||(LA18_209>='\u00C0' && LA18_209<='\u00D6')||(LA18_209>='\u00D8' && LA18_209<='\u00F6')||(LA18_209>='\u00F8' && LA18_209<='\u1FFF')||(LA18_209>='\u3040' && LA18_209<='\u318F')||(LA18_209>='\u3300' && LA18_209<='\u337F')||(LA18_209>='\u3400' && LA18_209<='\u3D2D')||(LA18_209>='\u4E00' && LA18_209<='\u9FFF')||(LA18_209>='\uF900' && LA18_209<='\uFAFF')) ) {
                            alt18=95;
                        }
                        else {
                            alt18=31;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'o':
                {
                int LA18_81 = input.LA(3);

                if ( (LA18_81=='l') ) {
                    int LA18_152 = input.LA(4);

                    if ( (LA18_152=='l') ) {
                        int LA18_210 = input.LA(5);

                        if ( (LA18_210=='e') ) {
                            int LA18_266 = input.LA(6);

                            if ( (LA18_266=='c') ) {
                                int LA18_314 = input.LA(7);

                                if ( (LA18_314=='t') ) {
                                    int LA18_355 = input.LA(8);

                                    if ( (LA18_355=='i') ) {
                                        int LA18_387 = input.LA(9);

                                        if ( (LA18_387=='o') ) {
                                            int LA18_407 = input.LA(10);

                                            if ( (LA18_407=='n') ) {
                                                int LA18_419 = input.LA(11);

                                                if ( (LA18_419=='$'||(LA18_419>='0' && LA18_419<='9')||(LA18_419>='A' && LA18_419<='Z')||LA18_419=='_'||(LA18_419>='a' && LA18_419<='z')||(LA18_419>='\u00C0' && LA18_419<='\u00D6')||(LA18_419>='\u00D8' && LA18_419<='\u00F6')||(LA18_419>='\u00F8' && LA18_419<='\u1FFF')||(LA18_419>='\u3040' && LA18_419<='\u318F')||(LA18_419>='\u3300' && LA18_419<='\u337F')||(LA18_419>='\u3400' && LA18_419<='\u3D2D')||(LA18_419>='\u4E00' && LA18_419<='\u9FFF')||(LA18_419>='\uF900' && LA18_419<='\uFAFF')) ) {
                                                    alt18=95;
                                                }
                                                else {
                                                    alt18=46;}
                                            }
                                            else {
                                                alt18=95;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA18_82 = input.LA(3);

                if ( (LA18_82=='F') ) {
                    int LA18_153 = input.LA(4);

                    if ( (LA18_153=='I') ) {
                        int LA18_211 = input.LA(5);

                        if ( (LA18_211=='N') ) {
                            int LA18_267 = input.LA(6);

                            if ( (LA18_267=='E') ) {
                                int LA18_315 = input.LA(7);

                                if ( (LA18_315=='$'||(LA18_315>='0' && LA18_315<='9')||(LA18_315>='A' && LA18_315<='Z')||LA18_315=='_'||(LA18_315>='a' && LA18_315<='z')||(LA18_315>='\u00C0' && LA18_315<='\u00D6')||(LA18_315>='\u00D8' && LA18_315<='\u00F6')||(LA18_315>='\u00F8' && LA18_315<='\u1FFF')||(LA18_315>='\u3040' && LA18_315<='\u318F')||(LA18_315>='\u3300' && LA18_315<='\u337F')||(LA18_315>='\u3400' && LA18_315<='\u3D2D')||(LA18_315>='\u4E00' && LA18_315<='\u9FFF')||(LA18_315>='\uF900' && LA18_315<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=91;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'I':
                {
                int LA18_83 = input.LA(3);

                if ( (LA18_83=='S') ) {
                    int LA18_154 = input.LA(4);

                    if ( (LA18_154=='A') ) {
                        int LA18_212 = input.LA(5);

                        if ( (LA18_212=='B') ) {
                            int LA18_268 = input.LA(6);

                            if ( (LA18_268=='L') ) {
                                int LA18_316 = input.LA(7);

                                if ( (LA18_316=='E') ) {
                                    int LA18_357 = input.LA(8);

                                    if ( (LA18_357=='$'||(LA18_357>='0' && LA18_357<='9')||(LA18_357>='A' && LA18_357<='Z')||LA18_357=='_'||(LA18_357>='a' && LA18_357<='z')||(LA18_357>='\u00C0' && LA18_357<='\u00D6')||(LA18_357>='\u00D8' && LA18_357<='\u00F6')||(LA18_357>='\u00F8' && LA18_357<='\u1FFF')||(LA18_357>='\u3040' && LA18_357<='\u318F')||(LA18_357>='\u3300' && LA18_357<='\u337F')||(LA18_357>='\u3400' && LA18_357<='\u3D2D')||(LA18_357>='\u4E00' && LA18_357<='\u9FFF')||(LA18_357>='\uF900' && LA18_357<='\uFAFF')) ) {
                                        alt18=95;
                                    }
                                    else {
                                        alt18=33;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA18_155 = input.LA(4);

                    if ( (LA18_155=='h') ) {
                        int LA18_213 = input.LA(5);

                        if ( (LA18_213=='e') ) {
                            int LA18_269 = input.LA(6);

                            if ( (LA18_269=='d') ) {
                                int LA18_317 = input.LA(7);

                                if ( (LA18_317=='$'||(LA18_317>='0' && LA18_317<='9')||(LA18_317>='A' && LA18_317<='Z')||LA18_317=='_'||(LA18_317>='a' && LA18_317<='z')||(LA18_317>='\u00C0' && LA18_317<='\u00D6')||(LA18_317>='\u00D8' && LA18_317<='\u00F6')||(LA18_317>='\u00F8' && LA18_317<='\u1FFF')||(LA18_317>='\u3040' && LA18_317<='\u318F')||(LA18_317>='\u3300' && LA18_317<='\u337F')||(LA18_317>='\u3400' && LA18_317<='\u3D2D')||(LA18_317>='\u4E00' && LA18_317<='\u9FFF')||(LA18_317>='\uF900' && LA18_317<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=42;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                    }
                    break;
                case 's':
                    {
                    int LA18_156 = input.LA(4);

                    if ( (LA18_156=='e') ) {
                        int LA18_214 = input.LA(5);

                        if ( (LA18_214=='$'||(LA18_214>='0' && LA18_214<='9')||(LA18_214>='A' && LA18_214<='Z')||LA18_214=='_'||(LA18_214>='a' && LA18_214<='z')||(LA18_214>='\u00C0' && LA18_214<='\u00D6')||(LA18_214>='\u00D8' && LA18_214<='\u00F6')||(LA18_214>='\u00F8' && LA18_214<='\u1FFF')||(LA18_214>='\u3040' && LA18_214<='\u318F')||(LA18_214>='\u3300' && LA18_214<='\u337F')||(LA18_214>='\u3400' && LA18_214<='\u3D2D')||(LA18_214>='\u4E00' && LA18_214<='\u9FFF')||(LA18_214>='\uF900' && LA18_214<='\uFAFF')) ) {
                            alt18=95;
                        }
                        else {
                            alt18=59;}
                    }
                    else {
                        alt18=95;}
                    }
                    break;
                default:
                    alt18=95;}

                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA18_157 = input.LA(4);

                    if ( (LA18_157=='l') ) {
                        int LA18_215 = input.LA(5);

                        if ( (LA18_215=='e') ) {
                            int LA18_271 = input.LA(6);

                            if ( (LA18_271=='c') ) {
                                int LA18_318 = input.LA(7);

                                if ( (LA18_318=='t') ) {
                                    int LA18_359 = input.LA(8);

                                    if ( (LA18_359=='$'||(LA18_359>='0' && LA18_359<='9')||(LA18_359>='A' && LA18_359<='Z')||LA18_359=='_'||(LA18_359>='a' && LA18_359<='z')||(LA18_359>='\u00C0' && LA18_359<='\u00D6')||(LA18_359>='\u00D8' && LA18_359<='\u00F6')||(LA18_359>='\u00F8' && LA18_359<='\u1FFF')||(LA18_359>='\u3040' && LA18_359<='\u318F')||(LA18_359>='\u3300' && LA18_359<='\u337F')||(LA18_359>='\u3400' && LA18_359<='\u3D2D')||(LA18_359>='\u4E00' && LA18_359<='\u9FFF')||(LA18_359>='\uF900' && LA18_359<='\uFAFF')) ) {
                                        alt18=95;
                                    }
                                    else {
                                        alt18=78;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                    }
                    break;
                case 'n':
                    {
                    int LA18_158 = input.LA(4);

                    if ( (LA18_158=='t') ) {
                        int LA18_216 = input.LA(5);

                        if ( (LA18_216=='e') ) {
                            int LA18_272 = input.LA(6);

                            if ( (LA18_272=='x') ) {
                                int LA18_319 = input.LA(7);

                                if ( (LA18_319=='t') ) {
                                    int LA18_360 = input.LA(8);

                                    if ( (LA18_360=='$'||(LA18_360>='0' && LA18_360<='9')||(LA18_360>='A' && LA18_360<='Z')||LA18_360=='_'||(LA18_360>='a' && LA18_360<='z')||(LA18_360>='\u00C0' && LA18_360<='\u00D6')||(LA18_360>='\u00D8' && LA18_360<='\u00F6')||(LA18_360>='\u00F8' && LA18_360<='\u1FFF')||(LA18_360>='\u3040' && LA18_360<='\u318F')||(LA18_360>='\u3300' && LA18_360<='\u337F')||(LA18_360>='\u3400' && LA18_360<='\u3D2D')||(LA18_360>='\u4E00' && LA18_360<='\u9FFF')||(LA18_360>='\uF900' && LA18_360<='\uFAFF')) ) {
                                        alt18=95;
                                    }
                                    else {
                                        alt18=35;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                    }
                    break;
                default:
                    alt18=95;}

                }
                break;
            case 'r':
                {
                int LA18_86 = input.LA(3);

                if ( (LA18_86=='e') ) {
                    int LA18_159 = input.LA(4);

                    if ( (LA18_159=='a') ) {
                        int LA18_217 = input.LA(5);

                        if ( (LA18_217=='t') ) {
                            int LA18_273 = input.LA(6);

                            if ( (LA18_273=='e') ) {
                                int LA18_320 = input.LA(7);

                                if ( (LA18_320=='$'||(LA18_320>='0' && LA18_320<='9')||(LA18_320>='A' && LA18_320<='Z')||LA18_320=='_'||(LA18_320>='a' && LA18_320<='z')||(LA18_320>='\u00C0' && LA18_320<='\u00D6')||(LA18_320>='\u00D8' && LA18_320<='\u00F6')||(LA18_320>='\u00F8' && LA18_320<='\u1FFF')||(LA18_320>='\u3040' && LA18_320<='\u318F')||(LA18_320>='\u3300' && LA18_320<='\u337F')||(LA18_320>='\u3400' && LA18_320<='\u3D2D')||(LA18_320>='\u4E00' && LA18_320<='\u9FFF')||(LA18_320>='\uF900' && LA18_320<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=43;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='W') ) {
            int LA18_21 = input.LA(2);

            if ( (LA18_21=='A') ) {
                int LA18_87 = input.LA(3);

                if ( (LA18_87=='R') ) {
                    int LA18_160 = input.LA(4);

                    if ( (LA18_160=='N') ) {
                        int LA18_218 = input.LA(5);

                        if ( (LA18_218=='I') ) {
                            int LA18_274 = input.LA(6);

                            if ( (LA18_274=='N') ) {
                                int LA18_321 = input.LA(7);

                                if ( (LA18_321=='G') ) {
                                    int LA18_362 = input.LA(8);

                                    if ( (LA18_362=='$'||(LA18_362>='0' && LA18_362<='9')||(LA18_362>='A' && LA18_362<='Z')||LA18_362=='_'||(LA18_362>='a' && LA18_362<='z')||(LA18_362>='\u00C0' && LA18_362<='\u00D6')||(LA18_362>='\u00D8' && LA18_362<='\u00F6')||(LA18_362>='\u00F8' && LA18_362<='\u1FFF')||(LA18_362>='\u3040' && LA18_362<='\u318F')||(LA18_362>='\u3300' && LA18_362<='\u337F')||(LA18_362>='\u3400' && LA18_362<='\u3D2D')||(LA18_362>='\u4E00' && LA18_362<='\u9FFF')||(LA18_362>='\uF900' && LA18_362<='\uFAFF')) ) {
                                        alt18=95;
                                    }
                                    else {
                                        alt18=37;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
            }
            else {
                alt18=95;}
        }
        else if ( (LA18_0==':') ) {
            int LA18_22 = input.LA(2);

            if ( (LA18_22==':') ) {
                alt18=40;
            }
            else {
                alt18=38;}
        }
        else if ( (LA18_0=='a') ) {
            int LA18_23 = input.LA(2);

            if ( (LA18_23=='r') ) {
                int LA18_90 = input.LA(3);

                if ( (LA18_90=='o') ) {
                    int LA18_161 = input.LA(4);

                    if ( (LA18_161=='u') ) {
                        int LA18_219 = input.LA(5);

                        if ( (LA18_219=='n') ) {
                            int LA18_275 = input.LA(6);

                            if ( (LA18_275=='d') ) {
                                int LA18_322 = input.LA(7);

                                if ( (LA18_322=='$'||(LA18_322>='0' && LA18_322<='9')||(LA18_322>='A' && LA18_322<='Z')||LA18_322=='_'||(LA18_322>='a' && LA18_322<='z')||(LA18_322>='\u00C0' && LA18_322<='\u00D6')||(LA18_322>='\u00D8' && LA18_322<='\u00F6')||(LA18_322>='\u00F8' && LA18_322<='\u1FFF')||(LA18_322>='\u3040' && LA18_322<='\u318F')||(LA18_322>='\u3300' && LA18_322<='\u337F')||(LA18_322>='\u3400' && LA18_322<='\u3D2D')||(LA18_322>='\u4E00' && LA18_322<='\u9FFF')||(LA18_322>='\uF900' && LA18_322<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=39;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
            }
            else {
                alt18=95;}
        }
        else if ( (LA18_0=='p') ) {
            int LA18_24 = input.LA(2);

            if ( (LA18_24=='r') ) {
                int LA18_91 = input.LA(3);

                if ( (LA18_91=='i') ) {
                    int LA18_162 = input.LA(4);

                    if ( (LA18_162=='v') ) {
                        int LA18_220 = input.LA(5);

                        if ( (LA18_220=='a') ) {
                            int LA18_276 = input.LA(6);

                            if ( (LA18_276=='t') ) {
                                int LA18_323 = input.LA(7);

                                if ( (LA18_323=='e') ) {
                                    int LA18_364 = input.LA(8);

                                    if ( (LA18_364=='$'||(LA18_364>='0' && LA18_364<='9')||(LA18_364>='A' && LA18_364<='Z')||LA18_364=='_'||(LA18_364>='a' && LA18_364<='z')||(LA18_364>='\u00C0' && LA18_364<='\u00D6')||(LA18_364>='\u00D8' && LA18_364<='\u00F6')||(LA18_364>='\u00F8' && LA18_364<='\u1FFF')||(LA18_364>='\u3040' && LA18_364<='\u318F')||(LA18_364>='\u3300' && LA18_364<='\u337F')||(LA18_364>='\u3400' && LA18_364<='\u3D2D')||(LA18_364>='\u4E00' && LA18_364<='\u9FFF')||(LA18_364>='\uF900' && LA18_364<='\uFAFF')) ) {
                                        alt18=95;
                                    }
                                    else {
                                        alt18=41;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
            }
            else {
                alt18=95;}
        }
        else if ( (LA18_0=='J') ) {
            int LA18_25 = input.LA(2);

            if ( (LA18_25=='A') ) {
                int LA18_92 = input.LA(3);

                if ( (LA18_92=='V') ) {
                    int LA18_163 = input.LA(4);

                    if ( (LA18_163=='A') ) {
                        int LA18_221 = input.LA(5);

                        if ( (LA18_221=='$'||(LA18_221>='0' && LA18_221<='9')||(LA18_221>='A' && LA18_221<='Z')||LA18_221=='_'||(LA18_221>='a' && LA18_221<='z')||(LA18_221>='\u00C0' && LA18_221<='\u00D6')||(LA18_221>='\u00D8' && LA18_221<='\u00F6')||(LA18_221>='\u00F8' && LA18_221<='\u1FFF')||(LA18_221>='\u3040' && LA18_221<='\u318F')||(LA18_221>='\u3300' && LA18_221<='\u337F')||(LA18_221>='\u3400' && LA18_221<='\u3D2D')||(LA18_221>='\u4E00' && LA18_221<='\u9FFF')||(LA18_221>='\uF900' && LA18_221<='\uFAFF')) ) {
                            alt18=95;
                        }
                        else {
                            alt18=44;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
            }
            else {
                alt18=95;}
        }
        else if ( (LA18_0=='.') ) {
            alt18=45;
        }
        else if ( (LA18_0=='l') ) {
            int LA18_27 = input.LA(2);

            if ( (LA18_27=='e') ) {
                int LA18_93 = input.LA(3);

                if ( (LA18_93=='t') ) {
                    int LA18_164 = input.LA(4);

                    if ( (LA18_164=='$'||(LA18_164>='0' && LA18_164<='9')||(LA18_164>='A' && LA18_164<='Z')||LA18_164=='_'||(LA18_164>='a' && LA18_164<='z')||(LA18_164>='\u00C0' && LA18_164<='\u00D6')||(LA18_164>='\u00D8' && LA18_164<='\u00F6')||(LA18_164>='\u00F8' && LA18_164<='\u1FFF')||(LA18_164>='\u3040' && LA18_164<='\u318F')||(LA18_164>='\u3300' && LA18_164<='\u337F')||(LA18_164>='\u3400' && LA18_164<='\u3D2D')||(LA18_164>='\u4E00' && LA18_164<='\u9FFF')||(LA18_164>='\uF900' && LA18_164<='\uFAFF')) ) {
                        alt18=95;
                    }
                    else {
                        alt18=49;}
                }
                else {
                    alt18=95;}
            }
            else {
                alt18=95;}
        }
        else if ( (LA18_0=='=') ) {
            int LA18_28 = input.LA(2);

            if ( (LA18_28=='=') ) {
                alt18=63;
            }
            else {
                alt18=50;}
        }
        else if ( (LA18_0=='?') ) {
            alt18=52;
        }
        else if ( (LA18_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA18_96 = input.LA(3);

                if ( (LA18_96=='u') ) {
                    int LA18_165 = input.LA(4);

                    if ( (LA18_165=='e') ) {
                        int LA18_223 = input.LA(5);

                        if ( (LA18_223=='$'||(LA18_223>='0' && LA18_223<='9')||(LA18_223>='A' && LA18_223<='Z')||LA18_223=='_'||(LA18_223>='a' && LA18_223<='z')||(LA18_223>='\u00C0' && LA18_223<='\u00D6')||(LA18_223>='\u00D8' && LA18_223<='\u00F6')||(LA18_223>='\u00F8' && LA18_223<='\u1FFF')||(LA18_223>='\u3040' && LA18_223<='\u318F')||(LA18_223>='\u3300' && LA18_223<='\u337F')||(LA18_223>='\u3400' && LA18_223<='\u3D2D')||(LA18_223>='\u4E00' && LA18_223<='\u9FFF')||(LA18_223>='\uF900' && LA18_223<='\uFAFF')) ) {
                            alt18=95;
                        }
                        else {
                            alt18=75;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'y':
                {
                int LA18_97 = input.LA(3);

                if ( (LA18_97=='p') ) {
                    int LA18_166 = input.LA(4);

                    if ( (LA18_166=='e') ) {
                        int LA18_224 = input.LA(5);

                        if ( (LA18_224=='S') ) {
                            int LA18_279 = input.LA(6);

                            if ( (LA18_279=='e') ) {
                                int LA18_324 = input.LA(7);

                                if ( (LA18_324=='l') ) {
                                    int LA18_365 = input.LA(8);

                                    if ( (LA18_365=='e') ) {
                                        int LA18_393 = input.LA(9);

                                        if ( (LA18_393=='c') ) {
                                            int LA18_408 = input.LA(10);

                                            if ( (LA18_408=='t') ) {
                                                int LA18_420 = input.LA(11);

                                                if ( (LA18_420=='$'||(LA18_420>='0' && LA18_420<='9')||(LA18_420>='A' && LA18_420<='Z')||LA18_420=='_'||(LA18_420>='a' && LA18_420<='z')||(LA18_420>='\u00C0' && LA18_420<='\u00D6')||(LA18_420>='\u00D8' && LA18_420<='\u00F6')||(LA18_420>='\u00F8' && LA18_420<='\u1FFF')||(LA18_420>='\u3040' && LA18_420<='\u318F')||(LA18_420>='\u3300' && LA18_420<='\u337F')||(LA18_420>='\u3400' && LA18_420<='\u3D2D')||(LA18_420>='\u4E00' && LA18_420<='\u9FFF')||(LA18_420>='\uF900' && LA18_420<='\uFAFF')) ) {
                                                    alt18=95;
                                                }
                                                else {
                                                    alt18=77;}
                                            }
                                            else {
                                                alt18=95;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'h':
                {
                int LA18_98 = input.LA(3);

                if ( (LA18_98=='e') ) {
                    int LA18_167 = input.LA(4);

                    if ( (LA18_167=='n') ) {
                        int LA18_225 = input.LA(5);

                        if ( (LA18_225=='$'||(LA18_225>='0' && LA18_225<='9')||(LA18_225>='A' && LA18_225<='Z')||LA18_225=='_'||(LA18_225>='a' && LA18_225<='z')||(LA18_225>='\u00C0' && LA18_225<='\u00D6')||(LA18_225>='\u00D8' && LA18_225<='\u00F6')||(LA18_225>='\u00F8' && LA18_225<='\u1FFF')||(LA18_225>='\u3040' && LA18_225<='\u318F')||(LA18_225>='\u3300' && LA18_225<='\u337F')||(LA18_225>='\u3400' && LA18_225<='\u3D2D')||(LA18_225>='\u4E00' && LA18_225<='\u9FFF')||(LA18_225>='\uF900' && LA18_225<='\uFAFF')) ) {
                            alt18=95;
                        }
                        else {
                            alt18=53;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA18_99 = input.LA(3);

                if ( (LA18_99=='l') ) {
                    int LA18_168 = input.LA(4);

                    if ( (LA18_168=='e') ) {
                        int LA18_226 = input.LA(5);

                        if ( (LA18_226=='c') ) {
                            int LA18_281 = input.LA(6);

                            if ( (LA18_281=='t') ) {
                                int LA18_325 = input.LA(7);

                                if ( (LA18_325=='F') ) {
                                    int LA18_366 = input.LA(8);

                                    if ( (LA18_366=='i') ) {
                                        int LA18_394 = input.LA(9);

                                        if ( (LA18_394=='r') ) {
                                            int LA18_409 = input.LA(10);

                                            if ( (LA18_409=='s') ) {
                                                int LA18_421 = input.LA(11);

                                                if ( (LA18_421=='t') ) {
                                                    int LA18_428 = input.LA(12);

                                                    if ( (LA18_428=='$'||(LA18_428>='0' && LA18_428<='9')||(LA18_428>='A' && LA18_428<='Z')||LA18_428=='_'||(LA18_428>='a' && LA18_428<='z')||(LA18_428>='\u00C0' && LA18_428<='\u00D6')||(LA18_428>='\u00D8' && LA18_428<='\u00F6')||(LA18_428>='\u00F8' && LA18_428<='\u1FFF')||(LA18_428>='\u3040' && LA18_428<='\u318F')||(LA18_428>='\u3300' && LA18_428<='\u337F')||(LA18_428>='\u3400' && LA18_428<='\u3D2D')||(LA18_428>='\u4E00' && LA18_428<='\u9FFF')||(LA18_428>='\uF900' && LA18_428<='\uFAFF')) ) {
                                                        alt18=95;
                                                    }
                                                    else {
                                                        alt18=80;}
                                                }
                                                else {
                                                    alt18=95;}
                                            }
                                            else {
                                                alt18=95;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else if ( (LA18_325=='$'||(LA18_325>='0' && LA18_325<='9')||(LA18_325>='A' && LA18_325<='E')||(LA18_325>='G' && LA18_325<='Z')||LA18_325=='_'||(LA18_325>='a' && LA18_325<='z')||(LA18_325>='\u00C0' && LA18_325<='\u00D6')||(LA18_325>='\u00D8' && LA18_325<='\u00F6')||(LA18_325>='\u00F8' && LA18_325<='\u1FFF')||(LA18_325>='\u3040' && LA18_325<='\u318F')||(LA18_325>='\u3300' && LA18_325<='\u337F')||(LA18_325>='\u3400' && LA18_325<='\u3D2D')||(LA18_325>='\u4E00' && LA18_325<='\u9FFF')||(LA18_325>='\uF900' && LA18_325<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=79;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'o':
                {
                int LA18_100 = input.LA(3);

                if ( (LA18_100=='r') ) {
                    int LA18_169 = input.LA(4);

                    if ( (LA18_169=='t') ) {
                        int LA18_227 = input.LA(5);

                        if ( (LA18_227=='B') ) {
                            int LA18_282 = input.LA(6);

                            if ( (LA18_282=='y') ) {
                                int LA18_326 = input.LA(7);

                                if ( (LA18_326=='$'||(LA18_326>='0' && LA18_326<='9')||(LA18_326>='A' && LA18_326<='Z')||LA18_326=='_'||(LA18_326>='a' && LA18_326<='z')||(LA18_326>='\u00C0' && LA18_326<='\u00D6')||(LA18_326>='\u00D8' && LA18_326<='\u00F6')||(LA18_326>='\u00F8' && LA18_326<='\u1FFF')||(LA18_326>='\u3040' && LA18_326<='\u318F')||(LA18_326>='\u3300' && LA18_326<='\u337F')||(LA18_326>='\u3400' && LA18_326<='\u3D2D')||(LA18_326>='\u4E00' && LA18_326<='\u9FFF')||(LA18_326>='\uF900' && LA18_326<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=84;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'w':
                {
                int LA18_101 = input.LA(3);

                if ( (LA18_101=='i') ) {
                    int LA18_170 = input.LA(4);

                    if ( (LA18_170=='t') ) {
                        int LA18_228 = input.LA(5);

                        if ( (LA18_228=='c') ) {
                            int LA18_283 = input.LA(6);

                            if ( (LA18_283=='h') ) {
                                int LA18_327 = input.LA(7);

                                if ( (LA18_327=='$'||(LA18_327>='0' && LA18_327<='9')||(LA18_327>='A' && LA18_327<='Z')||LA18_327=='_'||(LA18_327>='a' && LA18_327<='z')||(LA18_327>='\u00C0' && LA18_327<='\u00D6')||(LA18_327>='\u00D8' && LA18_327<='\u00F6')||(LA18_327>='\u00F8' && LA18_327<='\u1FFF')||(LA18_327>='\u3040' && LA18_327<='\u318F')||(LA18_327>='\u3300' && LA18_327<='\u337F')||(LA18_327>='\u3400' && LA18_327<='\u3D2D')||(LA18_327>='\u4E00' && LA18_327<='\u9FFF')||(LA18_327>='\uF900' && LA18_327<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=55;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='{') ) {
            alt18=56;
        }
        else if ( (LA18_0=='d') ) {
            int LA18_33 = input.LA(2);

            if ( (LA18_33=='e') ) {
                int LA18_102 = input.LA(3);

                if ( (LA18_102=='f') ) {
                    int LA18_171 = input.LA(4);

                    if ( (LA18_171=='a') ) {
                        int LA18_229 = input.LA(5);

                        if ( (LA18_229=='u') ) {
                            int LA18_284 = input.LA(6);

                            if ( (LA18_284=='l') ) {
                                int LA18_328 = input.LA(7);

                                if ( (LA18_328=='t') ) {
                                    int LA18_370 = input.LA(8);

                                    if ( (LA18_370=='$'||(LA18_370>='0' && LA18_370<='9')||(LA18_370>='A' && LA18_370<='Z')||LA18_370=='_'||(LA18_370>='a' && LA18_370<='z')||(LA18_370>='\u00C0' && LA18_370<='\u00D6')||(LA18_370>='\u00D8' && LA18_370<='\u00F6')||(LA18_370>='\u00F8' && LA18_370<='\u1FFF')||(LA18_370>='\u3040' && LA18_370<='\u318F')||(LA18_370>='\u3300' && LA18_370<='\u337F')||(LA18_370>='\u3400' && LA18_370<='\u3D2D')||(LA18_370>='\u4E00' && LA18_370<='\u9FFF')||(LA18_370>='\uF900' && LA18_370<='\uFAFF')) ) {
                                        alt18=95;
                                    }
                                    else {
                                        alt18=57;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
            }
            else {
                alt18=95;}
        }
        else if ( (LA18_0=='}') ) {
            alt18=58;
        }
        else if ( (LA18_0=='|') ) {
            int LA18_35 = input.LA(2);

            if ( (LA18_35=='|') ) {
                alt18=60;
            }
            else {
                alt18=86;}
        }
        else if ( (LA18_0=='&') ) {
            alt18=61;
        }
        else if ( (LA18_0=='!') ) {
            int LA18_37 = input.LA(2);

            if ( (LA18_37=='=') ) {
                alt18=64;
            }
            else {
                alt18=71;}
        }
        else if ( (LA18_0=='>') ) {
            int LA18_38 = input.LA(2);

            if ( (LA18_38=='=') ) {
                alt18=65;
            }
            else {
                alt18=67;}
        }
        else if ( (LA18_0=='<') ) {
            int LA18_39 = input.LA(2);

            if ( (LA18_39=='=') ) {
                alt18=66;
            }
            else {
                alt18=68;}
        }
        else if ( (LA18_0=='+') ) {
            alt18=69;
        }
        else if ( (LA18_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt18=98;
                }
                break;
            case '*':
                {
                alt18=97;
                }
                break;
            default:
                alt18=70;}

        }
        else if ( (LA18_0=='G') ) {
            int LA18_42 = input.LA(2);

            if ( (LA18_42=='L') ) {
                int LA18_114 = input.LA(3);

                if ( (LA18_114=='O') ) {
                    int LA18_172 = input.LA(4);

                    if ( (LA18_172=='B') ) {
                        int LA18_230 = input.LA(5);

                        if ( (LA18_230=='A') ) {
                            int LA18_285 = input.LA(6);

                            if ( (LA18_285=='L') ) {
                                int LA18_329 = input.LA(7);

                                if ( (LA18_329=='V') ) {
                                    int LA18_371 = input.LA(8);

                                    if ( (LA18_371=='A') ) {
                                        int LA18_396 = input.LA(9);

                                        if ( (LA18_396=='R') ) {
                                            int LA18_410 = input.LA(10);

                                            if ( (LA18_410=='$'||(LA18_410>='0' && LA18_410<='9')||(LA18_410>='A' && LA18_410<='Z')||LA18_410=='_'||(LA18_410>='a' && LA18_410<='z')||(LA18_410>='\u00C0' && LA18_410<='\u00D6')||(LA18_410>='\u00D8' && LA18_410<='\u00F6')||(LA18_410>='\u00F8' && LA18_410<='\u1FFF')||(LA18_410>='\u3040' && LA18_410<='\u318F')||(LA18_410>='\u3300' && LA18_410<='\u337F')||(LA18_410>='\u3400' && LA18_410<='\u3D2D')||(LA18_410>='\u4E00' && LA18_410<='\u9FFF')||(LA18_410>='\uF900' && LA18_410<='\uFAFF')) ) {
                                                alt18=95;
                                            }
                                            else {
                                                alt18=72;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
            }
            else {
                alt18=95;}
        }
        else if ( (LA18_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA18_115 = input.LA(3);

                if ( (LA18_115=='l') ) {
                    int LA18_173 = input.LA(4);

                    if ( (LA18_173=='l') ) {
                        int LA18_231 = input.LA(5);

                        if ( (LA18_231=='$'||(LA18_231>='0' && LA18_231<='9')||(LA18_231>='A' && LA18_231<='Z')||LA18_231=='_'||(LA18_231>='a' && LA18_231<='z')||(LA18_231>='\u00C0' && LA18_231<='\u00D6')||(LA18_231>='\u00D8' && LA18_231<='\u00F6')||(LA18_231>='\u00F8' && LA18_231<='\u1FFF')||(LA18_231>='\u3040' && LA18_231<='\u318F')||(LA18_231>='\u3300' && LA18_231<='\u337F')||(LA18_231>='\u3400' && LA18_231<='\u3D2D')||(LA18_231>='\u4E00' && LA18_231<='\u9FFF')||(LA18_231>='\uF900' && LA18_231<='\uFAFF')) ) {
                            alt18=95;
                        }
                        else {
                            alt18=76;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'e':
                {
                int LA18_116 = input.LA(3);

                if ( (LA18_116=='w') ) {
                    int LA18_174 = input.LA(4);

                    if ( (LA18_174=='$'||(LA18_174>='0' && LA18_174<='9')||(LA18_174>='A' && LA18_174<='Z')||LA18_174=='_'||(LA18_174>='a' && LA18_174<='z')||(LA18_174>='\u00C0' && LA18_174<='\u00D6')||(LA18_174>='\u00D8' && LA18_174<='\u00F6')||(LA18_174>='\u00F8' && LA18_174<='\u1FFF')||(LA18_174>='\u3040' && LA18_174<='\u318F')||(LA18_174>='\u3300' && LA18_174<='\u337F')||(LA18_174>='\u3400' && LA18_174<='\u3D2D')||(LA18_174>='\u4E00' && LA18_174<='\u9FFF')||(LA18_174>='\uF900' && LA18_174<='\uFAFF')) ) {
                        alt18=95;
                    }
                    else {
                        alt18=73;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'o':
                {
                int LA18_117 = input.LA(3);

                if ( (LA18_117=='t') ) {
                    int LA18_175 = input.LA(4);

                    if ( (LA18_175=='E') ) {
                        int LA18_233 = input.LA(5);

                        if ( (LA18_233=='x') ) {
                            int LA18_287 = input.LA(6);

                            if ( (LA18_287=='i') ) {
                                int LA18_330 = input.LA(7);

                                if ( (LA18_330=='s') ) {
                                    int LA18_372 = input.LA(8);

                                    if ( (LA18_372=='t') ) {
                                        int LA18_397 = input.LA(9);

                                        if ( (LA18_397=='s') ) {
                                            int LA18_411 = input.LA(10);

                                            if ( (LA18_411=='$'||(LA18_411>='0' && LA18_411<='9')||(LA18_411>='A' && LA18_411<='Z')||LA18_411=='_'||(LA18_411>='a' && LA18_411<='z')||(LA18_411>='\u00C0' && LA18_411<='\u00D6')||(LA18_411>='\u00D8' && LA18_411<='\u00F6')||(LA18_411>='\u00F8' && LA18_411<='\u1FFF')||(LA18_411>='\u3040' && LA18_411<='\u318F')||(LA18_411>='\u3300' && LA18_411<='\u337F')||(LA18_411>='\u3400' && LA18_411<='\u3D2D')||(LA18_411>='\u4E00' && LA18_411<='\u9FFF')||(LA18_411>='\uF900' && LA18_411<='\uFAFF')) ) {
                                                alt18=95;
                                            }
                                            else {
                                                alt18=83;}
                                        }
                                        else {
                                            alt18=95;}
                                    }
                                    else {
                                        alt18=95;}
                                }
                                else {
                                    alt18=95;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA18_118 = input.LA(3);

                if ( (LA18_118=='l') ) {
                    int LA18_176 = input.LA(4);

                    if ( (LA18_176=='s') ) {
                        int LA18_234 = input.LA(5);

                        if ( (LA18_234=='e') ) {
                            int LA18_288 = input.LA(6);

                            if ( (LA18_288=='$'||(LA18_288>='0' && LA18_288<='9')||(LA18_288>='A' && LA18_288<='Z')||LA18_288=='_'||(LA18_288>='a' && LA18_288<='z')||(LA18_288>='\u00C0' && LA18_288<='\u00D6')||(LA18_288>='\u00D8' && LA18_288<='\u00F6')||(LA18_288>='\u00F8' && LA18_288<='\u1FFF')||(LA18_288>='\u3040' && LA18_288<='\u318F')||(LA18_288>='\u3300' && LA18_288<='\u337F')||(LA18_288>='\u3400' && LA18_288<='\u3D2D')||(LA18_288>='\u4E00' && LA18_288<='\u9FFF')||(LA18_288>='\uF900' && LA18_288<='\uFAFF')) ) {
                                alt18=95;
                            }
                            else {
                                alt18=74;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'o':
                {
                int LA18_119 = input.LA(3);

                if ( (LA18_119=='r') ) {
                    int LA18_177 = input.LA(4);

                    if ( (LA18_177=='A') ) {
                        int LA18_235 = input.LA(5);

                        if ( (LA18_235=='l') ) {
                            int LA18_289 = input.LA(6);

                            if ( (LA18_289=='l') ) {
                                int LA18_332 = input.LA(7);

                                if ( (LA18_332=='$'||(LA18_332>='0' && LA18_332<='9')||(LA18_332>='A' && LA18_332<='Z')||LA18_332=='_'||(LA18_332>='a' && LA18_332<='z')||(LA18_332>='\u00C0' && LA18_332<='\u00D6')||(LA18_332>='\u00D8' && LA18_332<='\u00F6')||(LA18_332>='\u00F8' && LA18_332<='\u1FFF')||(LA18_332>='\u3040' && LA18_332<='\u318F')||(LA18_332>='\u3300' && LA18_332<='\u337F')||(LA18_332>='\u3400' && LA18_332<='\u3D2D')||(LA18_332>='\u4E00' && LA18_332<='\u9FFF')||(LA18_332>='\uF900' && LA18_332<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=85;}
                            }
                            else {
                                alt18=95;}
                        }
                        else {
                            alt18=95;}
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='[') ) {
            alt18=87;
        }
        else if ( (LA18_0==']') ) {
            alt18=88;
        }
        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {
            alt18=89;
        }
        else if ( (LA18_0=='\"'||LA18_0=='\'') ) {
            alt18=90;
        }
        else if ( (LA18_0=='$'||LA18_0=='B'||LA18_0=='H'||LA18_0=='K'||(LA18_0>='M' && LA18_0<='O')||LA18_0=='Q'||(LA18_0>='T' && LA18_0<='V')||(LA18_0>='X' && LA18_0<='Z')||(LA18_0>='^' && LA18_0<='_')||LA18_0=='b'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='k')||LA18_0=='m'||LA18_0=='o'||LA18_0=='q'||(LA18_0>='u' && LA18_0<='x')||LA18_0=='z'||(LA18_0>='\u00C0' && LA18_0<='\u00D6')||(LA18_0>='\u00D8' && LA18_0<='\u00F6')||(LA18_0>='\u00F8' && LA18_0<='\u1FFF')||(LA18_0>='\u3040' && LA18_0<='\u318F')||(LA18_0>='\u3300' && LA18_0<='\u337F')||(LA18_0>='\u3400' && LA18_0<='\u3D2D')||(LA18_0>='\u4E00' && LA18_0<='\u9FFF')||(LA18_0>='\uF900' && LA18_0<='\uFAFF')) ) {
            alt18=95;
        }
        else if ( (LA18_0=='R') ) {
            int LA18_50 = input.LA(2);

            if ( (LA18_50=='E') ) {
                int LA18_120 = input.LA(3);

                if ( (LA18_120=='M') ) {
                    int LA18_178 = input.LA(4);

                    if ( (LA18_178=='\u00BB') && (xpandMode)) {
                        alt18=100;
                    }
                    else {
                        alt18=95;}
                }
                else {
                    alt18=95;}
            }
            else {
                alt18=95;}
        }
        else if ( ((LA18_0>='\t' && LA18_0<='\n')||(LA18_0>='\f' && LA18_0<='\r')||LA18_0==' ') ) {
            alt18=96;
        }
        else if ( (LA18_0=='\u00AB') ) {
            int LA18_52 = input.LA(2);

            if ( (LA18_52=='R') && (!xpandMode)) {
                alt18=99;
            }
            else {
                alt18=102;}
        }
        else if ( (LA18_0=='\u00BB') ) {
            int LA18_53 = input.LA(2);

            if ( ((LA18_53>='\u0000' && LA18_53<='\uFFFE')) && (xpandMode)) {
                alt18=101;
            }
            else if ( (xpandMode) ) {
                alt18=101;
            }
            else if ( (true) ) {
                alt18=103;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | IntLiteral | StringLiteral | DEFINE | ENDDEFINE | AROUND | ENDAROUND | Identifier | WS | COMMENT | LINE_COMMENT | REM_COMMENT_OUT | REM_COMMENT | TEXT | LG | RG );", 18, 53, input);

                throw nvae;
            }
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | IntLiteral | StringLiteral | DEFINE | ENDDEFINE | AROUND | ENDAROUND | Identifier | WS | COMMENT | LINE_COMMENT | REM_COMMENT_OUT | REM_COMMENT | TEXT | LG | RG );", 18, 0, input);

            throw nvae;
        }
        switch (alt18) {
            case 1 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:10: T25
                {
                mT25(); 

                }
                break;
            case 2 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:14: T26
                {
                mT26(); 

                }
                break;
            case 3 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:18: T27
                {
                mT27(); 

                }
                break;
            case 4 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:22: T28
                {
                mT28(); 

                }
                break;
            case 5 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:26: T29
                {
                mT29(); 

                }
                break;
            case 6 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:30: T30
                {
                mT30(); 

                }
                break;
            case 7 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:34: T31
                {
                mT31(); 

                }
                break;
            case 8 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:38: T32
                {
                mT32(); 

                }
                break;
            case 9 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:42: T33
                {
                mT33(); 

                }
                break;
            case 10 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:46: T34
                {
                mT34(); 

                }
                break;
            case 11 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:50: T35
                {
                mT35(); 

                }
                break;
            case 12 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:54: T36
                {
                mT36(); 

                }
                break;
            case 13 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:58: T37
                {
                mT37(); 

                }
                break;
            case 14 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:62: T38
                {
                mT38(); 

                }
                break;
            case 15 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:66: T39
                {
                mT39(); 

                }
                break;
            case 16 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:70: T40
                {
                mT40(); 

                }
                break;
            case 17 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:74: T41
                {
                mT41(); 

                }
                break;
            case 18 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:78: T42
                {
                mT42(); 

                }
                break;
            case 19 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:82: T43
                {
                mT43(); 

                }
                break;
            case 20 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:86: T44
                {
                mT44(); 

                }
                break;
            case 21 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:90: T45
                {
                mT45(); 

                }
                break;
            case 22 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:94: T46
                {
                mT46(); 

                }
                break;
            case 23 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:98: T47
                {
                mT47(); 

                }
                break;
            case 24 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:102: T48
                {
                mT48(); 

                }
                break;
            case 25 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:106: T49
                {
                mT49(); 

                }
                break;
            case 26 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:110: T50
                {
                mT50(); 

                }
                break;
            case 27 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:114: T51
                {
                mT51(); 

                }
                break;
            case 28 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:118: T52
                {
                mT52(); 

                }
                break;
            case 29 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:122: T53
                {
                mT53(); 

                }
                break;
            case 30 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:126: T54
                {
                mT54(); 

                }
                break;
            case 31 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:130: T55
                {
                mT55(); 

                }
                break;
            case 32 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:134: T56
                {
                mT56(); 

                }
                break;
            case 33 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:138: T57
                {
                mT57(); 

                }
                break;
            case 34 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:142: T58
                {
                mT58(); 

                }
                break;
            case 35 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:146: T59
                {
                mT59(); 

                }
                break;
            case 36 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:150: T60
                {
                mT60(); 

                }
                break;
            case 37 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:154: T61
                {
                mT61(); 

                }
                break;
            case 38 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:158: T62
                {
                mT62(); 

                }
                break;
            case 39 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:162: T63
                {
                mT63(); 

                }
                break;
            case 40 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:166: T64
                {
                mT64(); 

                }
                break;
            case 41 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:170: T65
                {
                mT65(); 

                }
                break;
            case 42 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:174: T66
                {
                mT66(); 

                }
                break;
            case 43 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:178: T67
                {
                mT67(); 

                }
                break;
            case 44 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:182: T68
                {
                mT68(); 

                }
                break;
            case 45 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:186: T69
                {
                mT69(); 

                }
                break;
            case 46 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:190: T70
                {
                mT70(); 

                }
                break;
            case 47 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:194: T71
                {
                mT71(); 

                }
                break;
            case 48 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:198: T72
                {
                mT72(); 

                }
                break;
            case 49 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:202: T73
                {
                mT73(); 

                }
                break;
            case 50 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:206: T74
                {
                mT74(); 

                }
                break;
            case 51 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:210: T75
                {
                mT75(); 

                }
                break;
            case 52 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:214: T76
                {
                mT76(); 

                }
                break;
            case 53 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:218: T77
                {
                mT77(); 

                }
                break;
            case 54 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:222: T78
                {
                mT78(); 

                }
                break;
            case 55 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:226: T79
                {
                mT79(); 

                }
                break;
            case 56 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:230: T80
                {
                mT80(); 

                }
                break;
            case 57 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:234: T81
                {
                mT81(); 

                }
                break;
            case 58 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:238: T82
                {
                mT82(); 

                }
                break;
            case 59 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:242: T83
                {
                mT83(); 

                }
                break;
            case 60 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:246: T84
                {
                mT84(); 

                }
                break;
            case 61 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:250: T85
                {
                mT85(); 

                }
                break;
            case 62 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:254: T86
                {
                mT86(); 

                }
                break;
            case 63 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:258: T87
                {
                mT87(); 

                }
                break;
            case 64 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:262: T88
                {
                mT88(); 

                }
                break;
            case 65 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:266: T89
                {
                mT89(); 

                }
                break;
            case 66 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:270: T90
                {
                mT90(); 

                }
                break;
            case 67 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:274: T91
                {
                mT91(); 

                }
                break;
            case 68 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:278: T92
                {
                mT92(); 

                }
                break;
            case 69 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:282: T93
                {
                mT93(); 

                }
                break;
            case 70 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:286: T94
                {
                mT94(); 

                }
                break;
            case 71 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:290: T95
                {
                mT95(); 

                }
                break;
            case 72 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:294: T96
                {
                mT96(); 

                }
                break;
            case 73 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:298: T97
                {
                mT97(); 

                }
                break;
            case 74 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:302: T98
                {
                mT98(); 

                }
                break;
            case 75 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:306: T99
                {
                mT99(); 

                }
                break;
            case 76 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:310: T100
                {
                mT100(); 

                }
                break;
            case 77 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:315: T101
                {
                mT101(); 

                }
                break;
            case 78 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:320: T102
                {
                mT102(); 

                }
                break;
            case 79 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:325: T103
                {
                mT103(); 

                }
                break;
            case 80 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:330: T104
                {
                mT104(); 

                }
                break;
            case 81 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:335: T105
                {
                mT105(); 

                }
                break;
            case 82 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:340: T106
                {
                mT106(); 

                }
                break;
            case 83 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:345: T107
                {
                mT107(); 

                }
                break;
            case 84 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:350: T108
                {
                mT108(); 

                }
                break;
            case 85 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:355: T109
                {
                mT109(); 

                }
                break;
            case 86 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:360: T110
                {
                mT110(); 

                }
                break;
            case 87 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:365: T111
                {
                mT111(); 

                }
                break;
            case 88 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:370: T112
                {
                mT112(); 

                }
                break;
            case 89 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:375: IntLiteral
                {
                mIntLiteral(); 

                }
                break;
            case 90 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:386: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 91 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:400: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 92 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:407: ENDDEFINE
                {
                mENDDEFINE(); 

                }
                break;
            case 93 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:417: AROUND
                {
                mAROUND(); 

                }
                break;
            case 94 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:424: ENDAROUND
                {
                mENDAROUND(); 

                }
                break;
            case 95 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:434: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 96 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:445: WS
                {
                mWS(); 

                }
                break;
            case 97 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:448: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 98 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:456: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 99 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:469: REM_COMMENT_OUT
                {
                mREM_COMMENT_OUT(); 

                }
                break;
            case 100 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:485: REM_COMMENT
                {
                mREM_COMMENT(); 

                }
                break;
            case 101 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:497: TEXT
                {
                mTEXT(); 

                }
                break;
            case 102 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:502: LG
                {
                mLG(); 

                }
                break;
            case 103 :
                // ./src-gen/org/eclipse/xpand3/parser/Xpand3Node.g:1:505: RG
                {
                mRG(); 

                }
                break;

        }

    }


 

}