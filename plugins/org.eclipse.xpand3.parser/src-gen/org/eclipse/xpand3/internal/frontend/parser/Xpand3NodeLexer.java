// $ANTLR 3.0 ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g 2008-03-18 09:15:12
 	
package org.eclipse.xpand3.internal.frontend.parser; 


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
    public String getGrammarFileName() { return "./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g"; }

    // $ANTLR start T25
    public void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:9:7: ( 'IMPORT' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:9:7: 'IMPORT'
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
    public void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:10:7: ( 'import' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:10:7: 'import'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:11:7: ( ';' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:11:7: ';'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:12:7: ( 'EXTENSION' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:12:7: 'EXTENSION'
            {
            match("EXTENSION"); 


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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:13:7: ( 'extension' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:13:7: 'extension'
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
    public void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:14:7: ( 'reexport' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:14:7: 'reexport'
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
    public void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:15:7: ( '(' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:15:7: '('
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
    public void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:16:7: ( ',' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:16:7: ','
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
    public void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:17:7: ( '*' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:17:7: '*'
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
    public void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:18:7: ( ')' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:18:7: ')'
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
    public void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:19:7: ( 'FOR' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:19:7: 'FOR'
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
    public void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:20:7: ( '-' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:20:7: '-'
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
    public void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:21:7: ( 'ERROR' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:21:7: 'ERROR'
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
    public void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:22:7: ( 'EXPAND' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:22:7: 'EXPAND'
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
    public void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:23:7: ( 'FOREACH' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:23:7: 'FOREACH'
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
    public void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:24:7: ( 'SEPARATOR' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:24:7: 'SEPARATOR'
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
    public void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:25:7: ( 'FILE' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:25:7: 'FILE'
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
    public void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:26:7: ( 'ONCE' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:26:7: 'ONCE'
            {
            match("ONCE"); 


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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:27:7: ( 'ENDFILE' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:27:7: 'ENDFILE'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:28:7: ( 'AS' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:28:7: 'AS'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:29:7: ( 'ITERATOR' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:29:7: 'ITERATOR'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:30:7: ( 'ENDFOREACH' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:30:7: 'ENDFOREACH'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:31:7: ( 'IF' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:31:7: 'IF'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:32:7: ( 'ENDIF' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:32:7: 'ENDIF'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:33:7: ( 'ELSEIF' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:33:7: 'ELSEIF'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:34:7: ( 'ELSE' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:34:7: 'ELSE'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:35:7: ( 'LET' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:35:7: 'LET'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:36:7: ( 'ENDLET' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:36:7: 'ENDLET'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:37:7: ( 'PROTECT' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:37:7: 'PROTECT'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:38:7: ( 'CSTART' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:38:7: 'CSTART'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:39:7: ( 'CEND' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:39:7: 'CEND'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:40:7: ( 'ID' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:40:7: 'ID'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:41:7: ( 'DISABLE' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:41:7: 'DISABLE'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:42:7: ( 'ENDPROTECT' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:42:7: 'ENDPROTECT'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:43:7: ( 'context' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:43:7: 'context'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:44:7: ( 'if' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:44:7: 'if'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:45:7: ( 'WARNING' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:45:7: 'WARNING'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:46:7: ( ':' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:46:7: ':'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:47:7: ( 'around' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:47:7: 'around'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:48:7: ( '::' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:48:7: '::'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:49:7: ( 'private' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:49:7: 'private'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:50:7: ( 'cached' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:50:7: 'cached'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:51:7: ( 'create' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:51:7: 'create'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:52:7: ( 'JAVA' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:52:7: 'JAVA'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:53:7: ( '.' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:53:7: '.'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:54:7: ( 'Collection' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:54:7: 'Collection'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:55:7: ( 'List' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:55:7: 'List'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:56:7: ( 'Set' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:56:7: 'Set'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:57:7: ( 'let' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:57:7: 'let'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:58:7: ( '=' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:58:7: '='
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:59:7: ( '->' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:59:7: '->'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:60:7: ( '?' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:60:7: '?'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:61:7: ( 'then' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:61:7: 'then'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:62:7: ( 'else' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:62:7: 'else'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:63:7: ( 'switch' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:63:7: 'switch'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:64:7: ( '{' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:64:7: '{'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:65:7: ( 'default' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:65:7: 'default'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:66:7: ( '}' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:66:7: '}'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:67:7: ( 'case' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:67:7: 'case'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:68:7: ( '||' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:68:7: '||'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:69:7: ( '&&' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:69:7: '&&'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:70:7: ( 'implies' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:70:7: 'implies'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:71:7: ( '==' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:71:7: '=='
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:72:7: ( '!=' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:72:7: '!='
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:73:7: ( '>=' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:73:7: '>='
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:74:7: ( '<=' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:74:7: '<='
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:75:7: ( '>' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:75:7: '>'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:76:7: ( '<' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:76:7: '<'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:77:7: ( '+' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:77:7: '+'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:78:7: ( '/' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:78:7: '/'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:79:7: ( '!' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:79:7: '!'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:80:7: ( 'GLOBALVAR' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:80:7: 'GLOBALVAR'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:81:7: ( 'new' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:81:7: 'new'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:82:7: ( 'false' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:82:7: 'false'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:83:7: ( 'true' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:83:7: 'true'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:84:8: ( 'null' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:84:8: 'null'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:85:8: ( 'typeSelect' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:85:8: 'typeSelect'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:86:8: ( 'collect' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:86:8: 'collect'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:87:8: ( 'select' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:87:8: 'select'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:88:8: ( 'selectFirst' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:88:8: 'selectFirst'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:89:8: ( 'reject' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:89:8: 'reject'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:90:8: ( 'exists' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:90:8: 'exists'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:91:8: ( 'notExists' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:91:8: 'notExists'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:92:8: ( 'sortBy' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:92:8: 'sortBy'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:93:8: ( 'forAll' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:93:8: 'forAll'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:94:8: ( '|' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:94:8: '|'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:95:8: ( '[' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:95:8: '['
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:96:8: ( ']' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:96:8: ']'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:557:3: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:557:3: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:557:3: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    new NoViableAltException("557:3: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:557:4: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:557:10: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:557:19: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:557:19: '0' .. '9'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:562:3: ( '\\\"' ( EscapeSequence | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
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
                    new NoViableAltException("561:1: StringLiteral : ( '\\\"' ( EscapeSequence | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:562:3: '\\\"' ( EscapeSequence | ~ ( '\\\\' | '\\\"' ) )* '\\\"'
                    {
                    match('\"'); 
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:562:8: ( EscapeSequence | ~ ( '\\\\' | '\\\"' ) )*
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
                    	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:562:10: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:562:27: ~ ( '\\\\' | '\\\"' )
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
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:563:8: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
                    {
                    match('\''); 
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:563:13: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
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
                    	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:563:15: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:563:32: ~ ( '\\'' | '\\\\' )
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:568:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
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
                        new NoViableAltException("567:10: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("567:10: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:568:3: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:569:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:570:9: OctalEscape
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:575:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                        new NoViableAltException("574:10: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("574:10: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:575:3: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:575:8: ( '0' .. '3' )
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:575:9: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:575:19: ( '0' .. '7' )
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:575:20: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:575:30: ( '0' .. '7' )
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:575:31: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:576:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:576:14: ( '0' .. '7' )
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:576:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:576:25: ( '0' .. '7' )
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:576:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:577:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:577:14: ( '0' .. '7' )
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:577:15: '0' .. '7'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:582:3: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:582:3: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:587:3: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:587:3: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:592:3: ( 'DEFINE' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:592:3: 'DEFINE'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:597:3: ( 'ENDDEFINE' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:597:3: 'ENDDEFINE'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:602:3: ( 'AROUND' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:602:3: 'AROUND'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:607:3: ( 'ENDAROUND' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:607:3: 'ENDAROUND'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:612:3: ( ( '^' )? Letter ( Letter | JavaIDDigit )* )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:612:3: ( '^' )? Letter ( Letter | JavaIDDigit )*
            {
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:612:3: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:612:4: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            mLetter(); 
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:612:17: ( Letter | JavaIDDigit )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')||(LA9_0>='\u00C0' && LA9_0<='\u00D6')||(LA9_0>='\u00D8' && LA9_0<='\u00F6')||(LA9_0>='\u00F8' && LA9_0<='\u1FFF')||(LA9_0>='\u3040' && LA9_0<='\u318F')||(LA9_0>='\u3300' && LA9_0<='\u337F')||(LA9_0>='\u3400' && LA9_0<='\u3D2D')||(LA9_0>='\u4E00' && LA9_0<='\u9FFF')||(LA9_0>='\uF900' && LA9_0<='\uFAFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:617:3: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:635:8: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:655:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:655:3: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:660:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:660:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:660:8: ( options {greedy=false; } : . )*
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
            	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:660:36: .
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:665:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF ) )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:665:3: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF )
            {
            match("//"); 

            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:665:8: (~ ( '\\n' | '\\r' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:665:8: ~ ( '\\n' | '\\r' )
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

            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:665:22: ( ( '\\r' )? '\\n' | EOF )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            else {
                alt13=2;}
            switch (alt13) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:665:23: ( '\\r' )? '\\n'
                    {
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:665:23: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:665:23: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;
                case 2 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:665:34: EOF
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:670:3: ({...}? => LG 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' RG )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:670:3: {...}? => LG 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' RG
            {
            if ( !(!xpandMode) ) {
                throw new FailedPredicateException(input, "REM_COMMENT_OUT", "!xpandMode");
            }
            mLG(); 
            match("REM"); 

            mRG(); 
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:670:31: ( options {greedy=false; } : . )*
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
            	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:670:59: .
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:675:3: ({...}? => 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:675:3: {...}? => 'REM' RG ( options {greedy=false; } : . )* '\\u00ABENDREM'
            {
            if ( !(xpandMode) ) {
                throw new FailedPredicateException(input, "REM_COMMENT", "xpandMode");
            }
            match("REM"); 

            mRG(); 
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:675:27: ( options {greedy=false; } : . )*
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
            	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:675:55: .
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:680:3: ({...}? => RG (~ ( LG ) )* ( LG )? )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:680:3: {...}? => RG (~ ( LG ) )* ( LG )?
            {
            if ( !(xpandMode) ) {
                throw new FailedPredicateException(input, "TEXT", "xpandMode");
            }
            mRG(); 
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:680:21: (~ ( LG ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\u00AA')||(LA16_0>='\u00AC' && LA16_0<='\uFFFE')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:680:21: ~ ( LG )
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

            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:680:28: ( LG )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\u00AB') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:680:29: LG
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:685:3: ( '\\u00AB' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:685:3: '\\u00AB'
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
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:690:3: ( '\\u00BB' )
            // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:690:3: '\\u00BB'
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
        // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:10: ( T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | IntLiteral | StringLiteral | DEFINE | ENDDEFINE | AROUND | ENDAROUND | Identifier | WS | COMMENT | LINE_COMMENT | REM_COMMENT_OUT | REM_COMMENT | TEXT | LG | RG )
        int alt18=103;
        int LA18_0 = input.LA(1);

        if ( (LA18_0=='I') ) {
            switch ( input.LA(2) ) {
            case 'D':
                {
                int LA18_54 = input.LA(3);

                if ( (LA18_54=='$'||(LA18_54>='0' && LA18_54<='9')||(LA18_54>='A' && LA18_54<='Z')||LA18_54=='_'||(LA18_54>='a' && LA18_54<='z')||(LA18_54>='\u00C0' && LA18_54<='\u00D6')||(LA18_54>='\u00D8' && LA18_54<='\u00F6')||(LA18_54>='\u00F8' && LA18_54<='\u1FFF')||(LA18_54>='\u3040' && LA18_54<='\u318F')||(LA18_54>='\u3300' && LA18_54<='\u337F')||(LA18_54>='\u3400' && LA18_54<='\u3D2D')||(LA18_54>='\u4E00' && LA18_54<='\u9FFF')||(LA18_54>='\uF900' && LA18_54<='\uFAFF')) ) {
                    alt18=95;
                }
                else {
                    alt18=32;}
                }
                break;
            case 'T':
                {
                int LA18_55 = input.LA(3);

                if ( (LA18_55=='E') ) {
                    int LA18_126 = input.LA(4);

                    if ( (LA18_126=='R') ) {
                        int LA18_181 = input.LA(5);

                        if ( (LA18_181=='A') ) {
                            int LA18_239 = input.LA(6);

                            if ( (LA18_239=='T') ) {
                                int LA18_293 = input.LA(7);

                                if ( (LA18_293=='O') ) {
                                    int LA18_336 = input.LA(8);

                                    if ( (LA18_336=='R') ) {
                                        int LA18_377 = input.LA(9);

                                        if ( (LA18_377=='$'||(LA18_377>='0' && LA18_377<='9')||(LA18_377>='A' && LA18_377<='Z')||LA18_377=='_'||(LA18_377>='a' && LA18_377<='z')||(LA18_377>='\u00C0' && LA18_377<='\u00D6')||(LA18_377>='\u00D8' && LA18_377<='\u00F6')||(LA18_377>='\u00F8' && LA18_377<='\u1FFF')||(LA18_377>='\u3040' && LA18_377<='\u318F')||(LA18_377>='\u3300' && LA18_377<='\u337F')||(LA18_377>='\u3400' && LA18_377<='\u3D2D')||(LA18_377>='\u4E00' && LA18_377<='\u9FFF')||(LA18_377>='\uF900' && LA18_377<='\uFAFF')) ) {
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
                int LA18_56 = input.LA(3);

                if ( (LA18_56=='P') ) {
                    int LA18_127 = input.LA(4);

                    if ( (LA18_127=='O') ) {
                        int LA18_182 = input.LA(5);

                        if ( (LA18_182=='R') ) {
                            int LA18_240 = input.LA(6);

                            if ( (LA18_240=='T') ) {
                                int LA18_294 = input.LA(7);

                                if ( (LA18_294=='$'||(LA18_294>='0' && LA18_294<='9')||(LA18_294>='A' && LA18_294<='Z')||LA18_294=='_'||(LA18_294>='a' && LA18_294<='z')||(LA18_294>='\u00C0' && LA18_294<='\u00D6')||(LA18_294>='\u00D8' && LA18_294<='\u00F6')||(LA18_294>='\u00F8' && LA18_294<='\u1FFF')||(LA18_294>='\u3040' && LA18_294<='\u318F')||(LA18_294>='\u3300' && LA18_294<='\u337F')||(LA18_294>='\u3400' && LA18_294<='\u3D2D')||(LA18_294>='\u4E00' && LA18_294<='\u9FFF')||(LA18_294>='\uF900' && LA18_294<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=1;}
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
                int LA18_57 = input.LA(3);

                if ( (LA18_57=='$'||(LA18_57>='0' && LA18_57<='9')||(LA18_57>='A' && LA18_57<='Z')||LA18_57=='_'||(LA18_57>='a' && LA18_57<='z')||(LA18_57>='\u00C0' && LA18_57<='\u00D6')||(LA18_57>='\u00D8' && LA18_57<='\u00F6')||(LA18_57>='\u00F8' && LA18_57<='\u1FFF')||(LA18_57>='\u3040' && LA18_57<='\u318F')||(LA18_57>='\u3300' && LA18_57<='\u337F')||(LA18_57>='\u3400' && LA18_57<='\u3D2D')||(LA18_57>='\u4E00' && LA18_57<='\u9FFF')||(LA18_57>='\uF900' && LA18_57<='\uFAFF')) ) {
                    alt18=95;
                }
                else {
                    alt18=23;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA18_58 = input.LA(3);

                if ( (LA18_58=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA18_183 = input.LA(5);

                        if ( (LA18_183=='r') ) {
                            int LA18_241 = input.LA(6);

                            if ( (LA18_241=='t') ) {
                                int LA18_295 = input.LA(7);

                                if ( (LA18_295=='$'||(LA18_295>='0' && LA18_295<='9')||(LA18_295>='A' && LA18_295<='Z')||LA18_295=='_'||(LA18_295>='a' && LA18_295<='z')||(LA18_295>='\u00C0' && LA18_295<='\u00D6')||(LA18_295>='\u00D8' && LA18_295<='\u00F6')||(LA18_295>='\u00F8' && LA18_295<='\u1FFF')||(LA18_295>='\u3040' && LA18_295<='\u318F')||(LA18_295>='\u3300' && LA18_295<='\u337F')||(LA18_295>='\u3400' && LA18_295<='\u3D2D')||(LA18_295>='\u4E00' && LA18_295<='\u9FFF')||(LA18_295>='\uF900' && LA18_295<='\uFAFF')) ) {
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
                        break;
                    case 'l':
                        {
                        int LA18_184 = input.LA(5);

                        if ( (LA18_184=='i') ) {
                            int LA18_242 = input.LA(6);

                            if ( (LA18_242=='e') ) {
                                int LA18_296 = input.LA(7);

                                if ( (LA18_296=='s') ) {
                                    int LA18_339 = input.LA(8);

                                    if ( (LA18_339=='$'||(LA18_339>='0' && LA18_339<='9')||(LA18_339>='A' && LA18_339<='Z')||LA18_339=='_'||(LA18_339>='a' && LA18_339<='z')||(LA18_339>='\u00C0' && LA18_339<='\u00D6')||(LA18_339>='\u00D8' && LA18_339<='\u00F6')||(LA18_339>='\u00F8' && LA18_339<='\u1FFF')||(LA18_339>='\u3040' && LA18_339<='\u318F')||(LA18_339>='\u3300' && LA18_339<='\u337F')||(LA18_339>='\u3400' && LA18_339<='\u3D2D')||(LA18_339>='\u4E00' && LA18_339<='\u9FFF')||(LA18_339>='\uF900' && LA18_339<='\uFAFF')) ) {
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
            case 'f':
                {
                int LA18_59 = input.LA(3);

                if ( (LA18_59=='$'||(LA18_59>='0' && LA18_59<='9')||(LA18_59>='A' && LA18_59<='Z')||LA18_59=='_'||(LA18_59>='a' && LA18_59<='z')||(LA18_59>='\u00C0' && LA18_59<='\u00D6')||(LA18_59>='\u00D8' && LA18_59<='\u00F6')||(LA18_59>='\u00F8' && LA18_59<='\u1FFF')||(LA18_59>='\u3040' && LA18_59<='\u318F')||(LA18_59>='\u3300' && LA18_59<='\u337F')||(LA18_59>='\u3400' && LA18_59<='\u3D2D')||(LA18_59>='\u4E00' && LA18_59<='\u9FFF')||(LA18_59>='\uF900' && LA18_59<='\uFAFF')) ) {
                    alt18=95;
                }
                else {
                    alt18=36;}
                }
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0==';') ) {
            alt18=3;
        }
        else if ( (LA18_0=='E') ) {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA18_60 = input.LA(3);

                if ( (LA18_60=='D') ) {
                    switch ( input.LA(4) ) {
                    case 'F':
                        {
                        switch ( input.LA(5) ) {
                        case 'O':
                            {
                            int LA18_243 = input.LA(6);

                            if ( (LA18_243=='R') ) {
                                int LA18_297 = input.LA(7);

                                if ( (LA18_297=='E') ) {
                                    int LA18_340 = input.LA(8);

                                    if ( (LA18_340=='A') ) {
                                        int LA18_379 = input.LA(9);

                                        if ( (LA18_379=='C') ) {
                                            int LA18_402 = input.LA(10);

                                            if ( (LA18_402=='H') ) {
                                                int LA18_415 = input.LA(11);

                                                if ( (LA18_415=='$'||(LA18_415>='0' && LA18_415<='9')||(LA18_415>='A' && LA18_415<='Z')||LA18_415=='_'||(LA18_415>='a' && LA18_415<='z')||(LA18_415>='\u00C0' && LA18_415<='\u00D6')||(LA18_415>='\u00D8' && LA18_415<='\u00F6')||(LA18_415>='\u00F8' && LA18_415<='\u1FFF')||(LA18_415>='\u3040' && LA18_415<='\u318F')||(LA18_415>='\u3300' && LA18_415<='\u337F')||(LA18_415>='\u3400' && LA18_415<='\u3D2D')||(LA18_415>='\u4E00' && LA18_415<='\u9FFF')||(LA18_415>='\uF900' && LA18_415<='\uFAFF')) ) {
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
                        case 'I':
                            {
                            int LA18_244 = input.LA(6);

                            if ( (LA18_244=='L') ) {
                                int LA18_298 = input.LA(7);

                                if ( (LA18_298=='E') ) {
                                    int LA18_341 = input.LA(8);

                                    if ( (LA18_341=='$'||(LA18_341>='0' && LA18_341<='9')||(LA18_341>='A' && LA18_341<='Z')||LA18_341=='_'||(LA18_341>='a' && LA18_341<='z')||(LA18_341>='\u00C0' && LA18_341<='\u00D6')||(LA18_341>='\u00D8' && LA18_341<='\u00F6')||(LA18_341>='\u00F8' && LA18_341<='\u1FFF')||(LA18_341>='\u3040' && LA18_341<='\u318F')||(LA18_341>='\u3300' && LA18_341<='\u337F')||(LA18_341>='\u3400' && LA18_341<='\u3D2D')||(LA18_341>='\u4E00' && LA18_341<='\u9FFF')||(LA18_341>='\uF900' && LA18_341<='\uFAFF')) ) {
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
                        default:
                            alt18=95;}

                        }
                        break;
                    case 'D':
                        {
                        int LA18_186 = input.LA(5);

                        if ( (LA18_186=='E') ) {
                            int LA18_245 = input.LA(6);

                            if ( (LA18_245=='F') ) {
                                int LA18_299 = input.LA(7);

                                if ( (LA18_299=='I') ) {
                                    int LA18_342 = input.LA(8);

                                    if ( (LA18_342=='N') ) {
                                        int LA18_381 = input.LA(9);

                                        if ( (LA18_381=='E') ) {
                                            int LA18_403 = input.LA(10);

                                            if ( (LA18_403=='$'||(LA18_403>='0' && LA18_403<='9')||(LA18_403>='A' && LA18_403<='Z')||LA18_403=='_'||(LA18_403>='a' && LA18_403<='z')||(LA18_403>='\u00C0' && LA18_403<='\u00D6')||(LA18_403>='\u00D8' && LA18_403<='\u00F6')||(LA18_403>='\u00F8' && LA18_403<='\u1FFF')||(LA18_403>='\u3040' && LA18_403<='\u318F')||(LA18_403>='\u3300' && LA18_403<='\u337F')||(LA18_403>='\u3400' && LA18_403<='\u3D2D')||(LA18_403>='\u4E00' && LA18_403<='\u9FFF')||(LA18_403>='\uF900' && LA18_403<='\uFAFF')) ) {
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
                        int LA18_187 = input.LA(5);

                        if ( (LA18_187=='E') ) {
                            int LA18_246 = input.LA(6);

                            if ( (LA18_246=='T') ) {
                                int LA18_300 = input.LA(7);

                                if ( (LA18_300=='$'||(LA18_300>='0' && LA18_300<='9')||(LA18_300>='A' && LA18_300<='Z')||LA18_300=='_'||(LA18_300>='a' && LA18_300<='z')||(LA18_300>='\u00C0' && LA18_300<='\u00D6')||(LA18_300>='\u00D8' && LA18_300<='\u00F6')||(LA18_300>='\u00F8' && LA18_300<='\u1FFF')||(LA18_300>='\u3040' && LA18_300<='\u318F')||(LA18_300>='\u3300' && LA18_300<='\u337F')||(LA18_300>='\u3400' && LA18_300<='\u3D2D')||(LA18_300>='\u4E00' && LA18_300<='\u9FFF')||(LA18_300>='\uF900' && LA18_300<='\uFAFF')) ) {
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
                    case 'I':
                        {
                        int LA18_188 = input.LA(5);

                        if ( (LA18_188=='F') ) {
                            int LA18_247 = input.LA(6);

                            if ( (LA18_247=='$'||(LA18_247>='0' && LA18_247<='9')||(LA18_247>='A' && LA18_247<='Z')||LA18_247=='_'||(LA18_247>='a' && LA18_247<='z')||(LA18_247>='\u00C0' && LA18_247<='\u00D6')||(LA18_247>='\u00D8' && LA18_247<='\u00F6')||(LA18_247>='\u00F8' && LA18_247<='\u1FFF')||(LA18_247>='\u3040' && LA18_247<='\u318F')||(LA18_247>='\u3300' && LA18_247<='\u337F')||(LA18_247>='\u3400' && LA18_247<='\u3D2D')||(LA18_247>='\u4E00' && LA18_247<='\u9FFF')||(LA18_247>='\uF900' && LA18_247<='\uFAFF')) ) {
                                alt18=95;
                            }
                            else {
                                alt18=24;}
                        }
                        else {
                            alt18=95;}
                        }
                        break;
                    case 'P':
                        {
                        int LA18_189 = input.LA(5);

                        if ( (LA18_189=='R') ) {
                            int LA18_248 = input.LA(6);

                            if ( (LA18_248=='O') ) {
                                int LA18_302 = input.LA(7);

                                if ( (LA18_302=='T') ) {
                                    int LA18_344 = input.LA(8);

                                    if ( (LA18_344=='E') ) {
                                        int LA18_382 = input.LA(9);

                                        if ( (LA18_382=='C') ) {
                                            int LA18_404 = input.LA(10);

                                            if ( (LA18_404=='T') ) {
                                                int LA18_417 = input.LA(11);

                                                if ( (LA18_417=='$'||(LA18_417>='0' && LA18_417<='9')||(LA18_417>='A' && LA18_417<='Z')||LA18_417=='_'||(LA18_417>='a' && LA18_417<='z')||(LA18_417>='\u00C0' && LA18_417<='\u00D6')||(LA18_417>='\u00D8' && LA18_417<='\u00F6')||(LA18_417>='\u00F8' && LA18_417<='\u1FFF')||(LA18_417>='\u3040' && LA18_417<='\u318F')||(LA18_417>='\u3300' && LA18_417<='\u337F')||(LA18_417>='\u3400' && LA18_417<='\u3D2D')||(LA18_417>='\u4E00' && LA18_417<='\u9FFF')||(LA18_417>='\uF900' && LA18_417<='\uFAFF')) ) {
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
                    case 'A':
                        {
                        int LA18_190 = input.LA(5);

                        if ( (LA18_190=='R') ) {
                            int LA18_249 = input.LA(6);

                            if ( (LA18_249=='O') ) {
                                int LA18_303 = input.LA(7);

                                if ( (LA18_303=='U') ) {
                                    int LA18_345 = input.LA(8);

                                    if ( (LA18_345=='N') ) {
                                        int LA18_383 = input.LA(9);

                                        if ( (LA18_383=='D') ) {
                                            int LA18_405 = input.LA(10);

                                            if ( (LA18_405=='$'||(LA18_405>='0' && LA18_405<='9')||(LA18_405>='A' && LA18_405<='Z')||LA18_405=='_'||(LA18_405>='a' && LA18_405<='z')||(LA18_405>='\u00C0' && LA18_405<='\u00D6')||(LA18_405>='\u00D8' && LA18_405<='\u00F6')||(LA18_405>='\u00F8' && LA18_405<='\u1FFF')||(LA18_405>='\u3040' && LA18_405<='\u318F')||(LA18_405>='\u3300' && LA18_405<='\u337F')||(LA18_405>='\u3400' && LA18_405<='\u3D2D')||(LA18_405>='\u4E00' && LA18_405<='\u9FFF')||(LA18_405>='\uF900' && LA18_405<='\uFAFF')) ) {
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
                    default:
                        alt18=95;}

                }
                else {
                    alt18=95;}
                }
                break;
            case 'L':
                {
                int LA18_61 = input.LA(3);

                if ( (LA18_61=='S') ) {
                    int LA18_132 = input.LA(4);

                    if ( (LA18_132=='E') ) {
                        int LA18_191 = input.LA(5);

                        if ( (LA18_191=='I') ) {
                            int LA18_250 = input.LA(6);

                            if ( (LA18_250=='F') ) {
                                int LA18_304 = input.LA(7);

                                if ( (LA18_304=='$'||(LA18_304>='0' && LA18_304<='9')||(LA18_304>='A' && LA18_304<='Z')||LA18_304=='_'||(LA18_304>='a' && LA18_304<='z')||(LA18_304>='\u00C0' && LA18_304<='\u00D6')||(LA18_304>='\u00D8' && LA18_304<='\u00F6')||(LA18_304>='\u00F8' && LA18_304<='\u1FFF')||(LA18_304>='\u3040' && LA18_304<='\u318F')||(LA18_304>='\u3300' && LA18_304<='\u337F')||(LA18_304>='\u3400' && LA18_304<='\u3D2D')||(LA18_304>='\u4E00' && LA18_304<='\u9FFF')||(LA18_304>='\uF900' && LA18_304<='\uFAFF')) ) {
                                    alt18=95;
                                }
                                else {
                                    alt18=25;}
                            }
                            else {
                                alt18=95;}
                        }
                        else if ( (LA18_191=='$'||(LA18_191>='0' && LA18_191<='9')||(LA18_191>='A' && LA18_191<='H')||(LA18_191>='J' && LA18_191<='Z')||LA18_191=='_'||(LA18_191>='a' && LA18_191<='z')||(LA18_191>='\u00C0' && LA18_191<='\u00D6')||(LA18_191>='\u00D8' && LA18_191<='\u00F6')||(LA18_191>='\u00F8' && LA18_191<='\u1FFF')||(LA18_191>='\u3040' && LA18_191<='\u318F')||(LA18_191>='\u3300' && LA18_191<='\u337F')||(LA18_191>='\u3400' && LA18_191<='\u3D2D')||(LA18_191>='\u4E00' && LA18_191<='\u9FFF')||(LA18_191>='\uF900' && LA18_191<='\uFAFF')) ) {
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
            case 'X':
                {
                switch ( input.LA(3) ) {
                case 'P':
                    {
                    int LA18_133 = input.LA(4);

                    if ( (LA18_133=='A') ) {
                        int LA18_192 = input.LA(5);

                        if ( (LA18_192=='N') ) {
                            int LA18_252 = input.LA(6);

                            if ( (LA18_252=='D') ) {
                                int LA18_305 = input.LA(7);

                                if ( (LA18_305=='$'||(LA18_305>='0' && LA18_305<='9')||(LA18_305>='A' && LA18_305<='Z')||LA18_305=='_'||(LA18_305>='a' && LA18_305<='z')||(LA18_305>='\u00C0' && LA18_305<='\u00D6')||(LA18_305>='\u00D8' && LA18_305<='\u00F6')||(LA18_305>='\u00F8' && LA18_305<='\u1FFF')||(LA18_305>='\u3040' && LA18_305<='\u318F')||(LA18_305>='\u3300' && LA18_305<='\u337F')||(LA18_305>='\u3400' && LA18_305<='\u3D2D')||(LA18_305>='\u4E00' && LA18_305<='\u9FFF')||(LA18_305>='\uF900' && LA18_305<='\uFAFF')) ) {
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
                case 'T':
                    {
                    int LA18_134 = input.LA(4);

                    if ( (LA18_134=='E') ) {
                        int LA18_193 = input.LA(5);

                        if ( (LA18_193=='N') ) {
                            int LA18_253 = input.LA(6);

                            if ( (LA18_253=='S') ) {
                                int LA18_306 = input.LA(7);

                                if ( (LA18_306=='I') ) {
                                    int LA18_348 = input.LA(8);

                                    if ( (LA18_348=='O') ) {
                                        int LA18_384 = input.LA(9);

                                        if ( (LA18_384=='N') ) {
                                            int LA18_406 = input.LA(10);

                                            if ( (LA18_406=='$'||(LA18_406>='0' && LA18_406<='9')||(LA18_406>='A' && LA18_406<='Z')||LA18_406=='_'||(LA18_406>='a' && LA18_406<='z')||(LA18_406>='\u00C0' && LA18_406<='\u00D6')||(LA18_406>='\u00D8' && LA18_406<='\u00F6')||(LA18_406>='\u00F8' && LA18_406<='\u1FFF')||(LA18_406>='\u3040' && LA18_406<='\u318F')||(LA18_406>='\u3300' && LA18_406<='\u337F')||(LA18_406>='\u3400' && LA18_406<='\u3D2D')||(LA18_406>='\u4E00' && LA18_406<='\u9FFF')||(LA18_406>='\uF900' && LA18_406<='\uFAFF')) ) {
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
            case 'R':
                {
                int LA18_63 = input.LA(3);

                if ( (LA18_63=='R') ) {
                    int LA18_135 = input.LA(4);

                    if ( (LA18_135=='O') ) {
                        int LA18_194 = input.LA(5);

                        if ( (LA18_194=='R') ) {
                            int LA18_254 = input.LA(6);

                            if ( (LA18_254=='$'||(LA18_254>='0' && LA18_254<='9')||(LA18_254>='A' && LA18_254<='Z')||LA18_254=='_'||(LA18_254>='a' && LA18_254<='z')||(LA18_254>='\u00C0' && LA18_254<='\u00D6')||(LA18_254>='\u00D8' && LA18_254<='\u00F6')||(LA18_254>='\u00F8' && LA18_254<='\u1FFF')||(LA18_254>='\u3040' && LA18_254<='\u318F')||(LA18_254>='\u3300' && LA18_254<='\u337F')||(LA18_254>='\u3400' && LA18_254<='\u3D2D')||(LA18_254>='\u4E00' && LA18_254<='\u9FFF')||(LA18_254>='\uF900' && LA18_254<='\uFAFF')) ) {
                                alt18=95;
                            }
                            else {
                                alt18=13;}
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
        else if ( (LA18_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA18_64 = input.LA(3);

                if ( (LA18_64=='s') ) {
                    int LA18_136 = input.LA(4);

                    if ( (LA18_136=='e') ) {
                        int LA18_195 = input.LA(5);

                        if ( (LA18_195=='$'||(LA18_195>='0' && LA18_195<='9')||(LA18_195>='A' && LA18_195<='Z')||LA18_195=='_'||(LA18_195>='a' && LA18_195<='z')||(LA18_195>='\u00C0' && LA18_195<='\u00D6')||(LA18_195>='\u00D8' && LA18_195<='\u00F6')||(LA18_195>='\u00F8' && LA18_195<='\u1FFF')||(LA18_195>='\u3040' && LA18_195<='\u318F')||(LA18_195>='\u3300' && LA18_195<='\u337F')||(LA18_195>='\u3400' && LA18_195<='\u3D2D')||(LA18_195>='\u4E00' && LA18_195<='\u9FFF')||(LA18_195>='\uF900' && LA18_195<='\uFAFF')) ) {
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
                        int LA18_196 = input.LA(5);

                        if ( (LA18_196=='t') ) {
                            int LA18_256 = input.LA(6);

                            if ( (LA18_256=='s') ) {
                                int LA18_308 = input.LA(7);

                                if ( (LA18_308=='$'||(LA18_308>='0' && LA18_308<='9')||(LA18_308>='A' && LA18_308<='Z')||LA18_308=='_'||(LA18_308>='a' && LA18_308<='z')||(LA18_308>='\u00C0' && LA18_308<='\u00D6')||(LA18_308>='\u00D8' && LA18_308<='\u00F6')||(LA18_308>='\u00F8' && LA18_308<='\u1FFF')||(LA18_308>='\u3040' && LA18_308<='\u318F')||(LA18_308>='\u3300' && LA18_308<='\u337F')||(LA18_308>='\u3400' && LA18_308<='\u3D2D')||(LA18_308>='\u4E00' && LA18_308<='\u9FFF')||(LA18_308>='\uF900' && LA18_308<='\uFAFF')) ) {
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
                        int LA18_197 = input.LA(5);

                        if ( (LA18_197=='n') ) {
                            int LA18_257 = input.LA(6);

                            if ( (LA18_257=='s') ) {
                                int LA18_309 = input.LA(7);

                                if ( (LA18_309=='i') ) {
                                    int LA18_350 = input.LA(8);

                                    if ( (LA18_350=='o') ) {
                                        int LA18_385 = input.LA(9);

                                        if ( (LA18_385=='n') ) {
                                            int LA18_407 = input.LA(10);

                                            if ( (LA18_407=='$'||(LA18_407>='0' && LA18_407<='9')||(LA18_407>='A' && LA18_407<='Z')||LA18_407=='_'||(LA18_407>='a' && LA18_407<='z')||(LA18_407>='\u00C0' && LA18_407<='\u00D6')||(LA18_407>='\u00D8' && LA18_407<='\u00F6')||(LA18_407>='\u00F8' && LA18_407<='\u1FFF')||(LA18_407>='\u3040' && LA18_407<='\u318F')||(LA18_407>='\u3300' && LA18_407<='\u337F')||(LA18_407>='\u3400' && LA18_407<='\u3D2D')||(LA18_407>='\u4E00' && LA18_407<='\u9FFF')||(LA18_407>='\uF900' && LA18_407<='\uFAFF')) ) {
                                                alt18=95;
                                            }
                                            else {
                                                alt18=5;}
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
            int LA18_6 = input.LA(2);

            if ( (LA18_6=='e') ) {
                switch ( input.LA(3) ) {
                case 'e':
                    {
                    int LA18_139 = input.LA(4);

                    if ( (LA18_139=='x') ) {
                        int LA18_198 = input.LA(5);

                        if ( (LA18_198=='p') ) {
                            int LA18_258 = input.LA(6);

                            if ( (LA18_258=='o') ) {
                                int LA18_310 = input.LA(7);

                                if ( (LA18_310=='r') ) {
                                    int LA18_351 = input.LA(8);

                                    if ( (LA18_351=='t') ) {
                                        int LA18_386 = input.LA(9);

                                        if ( (LA18_386=='$'||(LA18_386>='0' && LA18_386<='9')||(LA18_386>='A' && LA18_386<='Z')||LA18_386=='_'||(LA18_386>='a' && LA18_386<='z')||(LA18_386>='\u00C0' && LA18_386<='\u00D6')||(LA18_386>='\u00D8' && LA18_386<='\u00F6')||(LA18_386>='\u00F8' && LA18_386<='\u1FFF')||(LA18_386>='\u3040' && LA18_386<='\u318F')||(LA18_386>='\u3300' && LA18_386<='\u337F')||(LA18_386>='\u3400' && LA18_386<='\u3D2D')||(LA18_386>='\u4E00' && LA18_386<='\u9FFF')||(LA18_386>='\uF900' && LA18_386<='\uFAFF')) ) {
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
                    break;
                case 'j':
                    {
                    int LA18_140 = input.LA(4);

                    if ( (LA18_140=='e') ) {
                        int LA18_199 = input.LA(5);

                        if ( (LA18_199=='c') ) {
                            int LA18_259 = input.LA(6);

                            if ( (LA18_259=='t') ) {
                                int LA18_311 = input.LA(7);

                                if ( (LA18_311=='$'||(LA18_311>='0' && LA18_311<='9')||(LA18_311>='A' && LA18_311<='Z')||LA18_311=='_'||(LA18_311>='a' && LA18_311<='z')||(LA18_311>='\u00C0' && LA18_311<='\u00D6')||(LA18_311>='\u00D8' && LA18_311<='\u00F6')||(LA18_311>='\u00F8' && LA18_311<='\u1FFF')||(LA18_311>='\u3040' && LA18_311<='\u318F')||(LA18_311>='\u3300' && LA18_311<='\u337F')||(LA18_311>='\u3400' && LA18_311<='\u3D2D')||(LA18_311>='\u4E00' && LA18_311<='\u9FFF')||(LA18_311>='\uF900' && LA18_311<='\uFAFF')) ) {
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
                int LA18_67 = input.LA(3);

                if ( (LA18_67=='R') ) {
                    int LA18_141 = input.LA(4);

                    if ( (LA18_141=='E') ) {
                        int LA18_200 = input.LA(5);

                        if ( (LA18_200=='A') ) {
                            int LA18_260 = input.LA(6);

                            if ( (LA18_260=='C') ) {
                                int LA18_312 = input.LA(7);

                                if ( (LA18_312=='H') ) {
                                    int LA18_353 = input.LA(8);

                                    if ( (LA18_353=='$'||(LA18_353>='0' && LA18_353<='9')||(LA18_353>='A' && LA18_353<='Z')||LA18_353=='_'||(LA18_353>='a' && LA18_353<='z')||(LA18_353>='\u00C0' && LA18_353<='\u00D6')||(LA18_353>='\u00D8' && LA18_353<='\u00F6')||(LA18_353>='\u00F8' && LA18_353<='\u1FFF')||(LA18_353>='\u3040' && LA18_353<='\u318F')||(LA18_353>='\u3300' && LA18_353<='\u337F')||(LA18_353>='\u3400' && LA18_353<='\u3D2D')||(LA18_353>='\u4E00' && LA18_353<='\u9FFF')||(LA18_353>='\uF900' && LA18_353<='\uFAFF')) ) {
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
                    else if ( (LA18_141=='$'||(LA18_141>='0' && LA18_141<='9')||(LA18_141>='A' && LA18_141<='D')||(LA18_141>='F' && LA18_141<='Z')||LA18_141=='_'||(LA18_141>='a' && LA18_141<='z')||(LA18_141>='\u00C0' && LA18_141<='\u00D6')||(LA18_141>='\u00D8' && LA18_141<='\u00F6')||(LA18_141>='\u00F8' && LA18_141<='\u1FFF')||(LA18_141>='\u3040' && LA18_141<='\u318F')||(LA18_141>='\u3300' && LA18_141<='\u337F')||(LA18_141>='\u3400' && LA18_141<='\u3D2D')||(LA18_141>='\u4E00' && LA18_141<='\u9FFF')||(LA18_141>='\uF900' && LA18_141<='\uFAFF')) ) {
                        alt18=95;
                    }
                    else {
                        alt18=11;}
                }
                else {
                    alt18=95;}
                }
                break;
            case 'I':
                {
                int LA18_68 = input.LA(3);

                if ( (LA18_68=='L') ) {
                    int LA18_142 = input.LA(4);

                    if ( (LA18_142=='E') ) {
                        int LA18_202 = input.LA(5);

                        if ( (LA18_202=='$'||(LA18_202>='0' && LA18_202<='9')||(LA18_202>='A' && LA18_202<='Z')||LA18_202=='_'||(LA18_202>='a' && LA18_202<='z')||(LA18_202>='\u00C0' && LA18_202<='\u00D6')||(LA18_202>='\u00D8' && LA18_202<='\u00F6')||(LA18_202>='\u00F8' && LA18_202<='\u1FFF')||(LA18_202>='\u3040' && LA18_202<='\u318F')||(LA18_202>='\u3300' && LA18_202<='\u337F')||(LA18_202>='\u3400' && LA18_202<='\u3D2D')||(LA18_202>='\u4E00' && LA18_202<='\u9FFF')||(LA18_202>='\uF900' && LA18_202<='\uFAFF')) ) {
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
                break;
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='-') ) {
            int LA18_12 = input.LA(2);

            if ( (LA18_12=='>') ) {
                alt18=51;
            }
            else {
                alt18=12;}
        }
        else if ( (LA18_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA18_71 = input.LA(3);

                if ( (LA18_71=='t') ) {
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
                int LA18_72 = input.LA(3);

                if ( (LA18_72=='P') ) {
                    int LA18_144 = input.LA(4);

                    if ( (LA18_144=='A') ) {
                        int LA18_204 = input.LA(5);

                        if ( (LA18_204=='R') ) {
                            int LA18_262 = input.LA(6);

                            if ( (LA18_262=='A') ) {
                                int LA18_313 = input.LA(7);

                                if ( (LA18_313=='T') ) {
                                    int LA18_354 = input.LA(8);

                                    if ( (LA18_354=='O') ) {
                                        int LA18_388 = input.LA(9);

                                        if ( (LA18_388=='R') ) {
                                            int LA18_409 = input.LA(10);

                                            if ( (LA18_409=='$'||(LA18_409>='0' && LA18_409<='9')||(LA18_409>='A' && LA18_409<='Z')||LA18_409=='_'||(LA18_409>='a' && LA18_409<='z')||(LA18_409>='\u00C0' && LA18_409<='\u00D6')||(LA18_409>='\u00D8' && LA18_409<='\u00F6')||(LA18_409>='\u00F8' && LA18_409<='\u1FFF')||(LA18_409>='\u3040' && LA18_409<='\u318F')||(LA18_409>='\u3300' && LA18_409<='\u337F')||(LA18_409>='\u3400' && LA18_409<='\u3D2D')||(LA18_409>='\u4E00' && LA18_409<='\u9FFF')||(LA18_409>='\uF900' && LA18_409<='\uFAFF')) ) {
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
        else if ( (LA18_0=='O') ) {
            int LA18_14 = input.LA(2);

            if ( (LA18_14=='N') ) {
                int LA18_73 = input.LA(3);

                if ( (LA18_73=='C') ) {
                    int LA18_145 = input.LA(4);

                    if ( (LA18_145=='E') ) {
                        int LA18_205 = input.LA(5);

                        if ( (LA18_205=='$'||(LA18_205>='0' && LA18_205<='9')||(LA18_205>='A' && LA18_205<='Z')||LA18_205=='_'||(LA18_205>='a' && LA18_205<='z')||(LA18_205>='\u00C0' && LA18_205<='\u00D6')||(LA18_205>='\u00D8' && LA18_205<='\u00F6')||(LA18_205>='\u00F8' && LA18_205<='\u1FFF')||(LA18_205>='\u3040' && LA18_205<='\u318F')||(LA18_205>='\u3300' && LA18_205<='\u337F')||(LA18_205>='\u3400' && LA18_205<='\u3D2D')||(LA18_205>='\u4E00' && LA18_205<='\u9FFF')||(LA18_205>='\uF900' && LA18_205<='\uFAFF')) ) {
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
            else {
                alt18=95;}
        }
        else if ( (LA18_0=='A') ) {
            switch ( input.LA(2) ) {
            case 'R':
                {
                int LA18_74 = input.LA(3);

                if ( (LA18_74=='O') ) {
                    int LA18_146 = input.LA(4);

                    if ( (LA18_146=='U') ) {
                        int LA18_206 = input.LA(5);

                        if ( (LA18_206=='N') ) {
                            int LA18_264 = input.LA(6);

                            if ( (LA18_264=='D') ) {
                                int LA18_314 = input.LA(7);

                                if ( (LA18_314=='$'||(LA18_314>='0' && LA18_314<='9')||(LA18_314>='A' && LA18_314<='Z')||LA18_314=='_'||(LA18_314>='a' && LA18_314<='z')||(LA18_314>='\u00C0' && LA18_314<='\u00D6')||(LA18_314>='\u00D8' && LA18_314<='\u00F6')||(LA18_314>='\u00F8' && LA18_314<='\u1FFF')||(LA18_314>='\u3040' && LA18_314<='\u318F')||(LA18_314>='\u3300' && LA18_314<='\u337F')||(LA18_314>='\u3400' && LA18_314<='\u3D2D')||(LA18_314>='\u4E00' && LA18_314<='\u9FFF')||(LA18_314>='\uF900' && LA18_314<='\uFAFF')) ) {
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
            case 'S':
                {
                int LA18_75 = input.LA(3);

                if ( (LA18_75=='$'||(LA18_75>='0' && LA18_75<='9')||(LA18_75>='A' && LA18_75<='Z')||LA18_75=='_'||(LA18_75>='a' && LA18_75<='z')||(LA18_75>='\u00C0' && LA18_75<='\u00D6')||(LA18_75>='\u00D8' && LA18_75<='\u00F6')||(LA18_75>='\u00F8' && LA18_75<='\u1FFF')||(LA18_75>='\u3040' && LA18_75<='\u318F')||(LA18_75>='\u3300' && LA18_75<='\u337F')||(LA18_75>='\u3400' && LA18_75<='\u3D2D')||(LA18_75>='\u4E00' && LA18_75<='\u9FFF')||(LA18_75>='\uF900' && LA18_75<='\uFAFF')) ) {
                    alt18=95;
                }
                else {
                    alt18=20;}
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
                    int LA18_148 = input.LA(4);

                    if ( (LA18_148=='t') ) {
                        int LA18_207 = input.LA(5);

                        if ( (LA18_207=='$'||(LA18_207>='0' && LA18_207<='9')||(LA18_207>='A' && LA18_207<='Z')||LA18_207=='_'||(LA18_207>='a' && LA18_207<='z')||(LA18_207>='\u00C0' && LA18_207<='\u00D6')||(LA18_207>='\u00D8' && LA18_207<='\u00F6')||(LA18_207>='\u00F8' && LA18_207<='\u1FFF')||(LA18_207>='\u3040' && LA18_207<='\u318F')||(LA18_207>='\u3300' && LA18_207<='\u337F')||(LA18_207>='\u3400' && LA18_207<='\u3D2D')||(LA18_207>='\u4E00' && LA18_207<='\u9FFF')||(LA18_207>='\uF900' && LA18_207<='\uFAFF')) ) {
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
                    int LA18_149 = input.LA(4);

                    if ( (LA18_149=='$'||(LA18_149>='0' && LA18_149<='9')||(LA18_149>='A' && LA18_149<='Z')||LA18_149=='_'||(LA18_149>='a' && LA18_149<='z')||(LA18_149>='\u00C0' && LA18_149<='\u00D6')||(LA18_149>='\u00D8' && LA18_149<='\u00F6')||(LA18_149>='\u00F8' && LA18_149<='\u1FFF')||(LA18_149>='\u3040' && LA18_149<='\u318F')||(LA18_149>='\u3300' && LA18_149<='\u337F')||(LA18_149>='\u3400' && LA18_149<='\u3D2D')||(LA18_149>='\u4E00' && LA18_149<='\u9FFF')||(LA18_149>='\uF900' && LA18_149<='\uFAFF')) ) {
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
                    int LA18_150 = input.LA(4);

                    if ( (LA18_150=='T') ) {
                        int LA18_209 = input.LA(5);

                        if ( (LA18_209=='E') ) {
                            int LA18_266 = input.LA(6);

                            if ( (LA18_266=='C') ) {
                                int LA18_315 = input.LA(7);

                                if ( (LA18_315=='T') ) {
                                    int LA18_356 = input.LA(8);

                                    if ( (LA18_356=='$'||(LA18_356>='0' && LA18_356<='9')||(LA18_356>='A' && LA18_356<='Z')||LA18_356=='_'||(LA18_356>='a' && LA18_356<='z')||(LA18_356>='\u00C0' && LA18_356<='\u00D6')||(LA18_356>='\u00D8' && LA18_356<='\u00F6')||(LA18_356>='\u00F8' && LA18_356<='\u1FFF')||(LA18_356>='\u3040' && LA18_356<='\u318F')||(LA18_356>='\u3300' && LA18_356<='\u337F')||(LA18_356>='\u3400' && LA18_356<='\u3D2D')||(LA18_356>='\u4E00' && LA18_356<='\u9FFF')||(LA18_356>='\uF900' && LA18_356<='\uFAFF')) ) {
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
                    int LA18_151 = input.LA(4);

                    if ( (LA18_151=='A') ) {
                        int LA18_210 = input.LA(5);

                        if ( (LA18_210=='R') ) {
                            int LA18_267 = input.LA(6);

                            if ( (LA18_267=='T') ) {
                                int LA18_316 = input.LA(7);

                                if ( (LA18_316=='$'||(LA18_316>='0' && LA18_316<='9')||(LA18_316>='A' && LA18_316<='Z')||LA18_316=='_'||(LA18_316>='a' && LA18_316<='z')||(LA18_316>='\u00C0' && LA18_316<='\u00D6')||(LA18_316>='\u00D8' && LA18_316<='\u00F6')||(LA18_316>='\u00F8' && LA18_316<='\u1FFF')||(LA18_316>='\u3040' && LA18_316<='\u318F')||(LA18_316>='\u3300' && LA18_316<='\u337F')||(LA18_316>='\u3400' && LA18_316<='\u3D2D')||(LA18_316>='\u4E00' && LA18_316<='\u9FFF')||(LA18_316>='\uF900' && LA18_316<='\uFAFF')) ) {
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
            case 'o':
                {
                int LA18_80 = input.LA(3);

                if ( (LA18_80=='l') ) {
                    int LA18_152 = input.LA(4);

                    if ( (LA18_152=='l') ) {
                        int LA18_211 = input.LA(5);

                        if ( (LA18_211=='e') ) {
                            int LA18_268 = input.LA(6);

                            if ( (LA18_268=='c') ) {
                                int LA18_317 = input.LA(7);

                                if ( (LA18_317=='t') ) {
                                    int LA18_358 = input.LA(8);

                                    if ( (LA18_358=='i') ) {
                                        int LA18_390 = input.LA(9);

                                        if ( (LA18_390=='o') ) {
                                            int LA18_410 = input.LA(10);

                                            if ( (LA18_410=='n') ) {
                                                int LA18_422 = input.LA(11);

                                                if ( (LA18_422=='$'||(LA18_422>='0' && LA18_422<='9')||(LA18_422>='A' && LA18_422<='Z')||LA18_422=='_'||(LA18_422>='a' && LA18_422<='z')||(LA18_422>='\u00C0' && LA18_422<='\u00D6')||(LA18_422>='\u00D8' && LA18_422<='\u00F6')||(LA18_422>='\u00F8' && LA18_422<='\u1FFF')||(LA18_422>='\u3040' && LA18_422<='\u318F')||(LA18_422>='\u3300' && LA18_422<='\u337F')||(LA18_422>='\u3400' && LA18_422<='\u3D2D')||(LA18_422>='\u4E00' && LA18_422<='\u9FFF')||(LA18_422>='\uF900' && LA18_422<='\uFAFF')) ) {
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
            case 'E':
                {
                int LA18_81 = input.LA(3);

                if ( (LA18_81=='N') ) {
                    int LA18_153 = input.LA(4);

                    if ( (LA18_153=='D') ) {
                        int LA18_212 = input.LA(5);

                        if ( (LA18_212=='$'||(LA18_212>='0' && LA18_212<='9')||(LA18_212>='A' && LA18_212<='Z')||LA18_212=='_'||(LA18_212>='a' && LA18_212<='z')||(LA18_212>='\u00C0' && LA18_212<='\u00D6')||(LA18_212>='\u00D8' && LA18_212<='\u00F6')||(LA18_212>='\u00F8' && LA18_212<='\u1FFF')||(LA18_212>='\u3040' && LA18_212<='\u318F')||(LA18_212>='\u3300' && LA18_212<='\u337F')||(LA18_212>='\u3400' && LA18_212<='\u3D2D')||(LA18_212>='\u4E00' && LA18_212<='\u9FFF')||(LA18_212>='\uF900' && LA18_212<='\uFAFF')) ) {
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
            default:
                alt18=95;}

        }
        else if ( (LA18_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA18_82 = input.LA(3);

                if ( (LA18_82=='F') ) {
                    int LA18_154 = input.LA(4);

                    if ( (LA18_154=='I') ) {
                        int LA18_213 = input.LA(5);

                        if ( (LA18_213=='N') ) {
                            int LA18_270 = input.LA(6);

                            if ( (LA18_270=='E') ) {
                                int LA18_318 = input.LA(7);

                                if ( (LA18_318=='$'||(LA18_318>='0' && LA18_318<='9')||(LA18_318>='A' && LA18_318<='Z')||LA18_318=='_'||(LA18_318>='a' && LA18_318<='z')||(LA18_318>='\u00C0' && LA18_318<='\u00D6')||(LA18_318>='\u00D8' && LA18_318<='\u00F6')||(LA18_318>='\u00F8' && LA18_318<='\u1FFF')||(LA18_318>='\u3040' && LA18_318<='\u318F')||(LA18_318>='\u3300' && LA18_318<='\u337F')||(LA18_318>='\u3400' && LA18_318<='\u3D2D')||(LA18_318>='\u4E00' && LA18_318<='\u9FFF')||(LA18_318>='\uF900' && LA18_318<='\uFAFF')) ) {
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
                    int LA18_155 = input.LA(4);

                    if ( (LA18_155=='A') ) {
                        int LA18_214 = input.LA(5);

                        if ( (LA18_214=='B') ) {
                            int LA18_271 = input.LA(6);

                            if ( (LA18_271=='L') ) {
                                int LA18_319 = input.LA(7);

                                if ( (LA18_319=='E') ) {
                                    int LA18_360 = input.LA(8);

                                    if ( (LA18_360=='$'||(LA18_360>='0' && LA18_360<='9')||(LA18_360>='A' && LA18_360<='Z')||LA18_360=='_'||(LA18_360>='a' && LA18_360<='z')||(LA18_360>='\u00C0' && LA18_360<='\u00D6')||(LA18_360>='\u00D8' && LA18_360<='\u00F6')||(LA18_360>='\u00F8' && LA18_360<='\u1FFF')||(LA18_360>='\u3040' && LA18_360<='\u318F')||(LA18_360>='\u3300' && LA18_360<='\u337F')||(LA18_360>='\u3400' && LA18_360<='\u3D2D')||(LA18_360>='\u4E00' && LA18_360<='\u9FFF')||(LA18_360>='\uF900' && LA18_360<='\uFAFF')) ) {
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
            case 'r':
                {
                int LA18_84 = input.LA(3);

                if ( (LA18_84=='e') ) {
                    int LA18_156 = input.LA(4);

                    if ( (LA18_156=='a') ) {
                        int LA18_215 = input.LA(5);

                        if ( (LA18_215=='t') ) {
                            int LA18_272 = input.LA(6);

                            if ( (LA18_272=='e') ) {
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
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA18_157 = input.LA(4);

                    if ( (LA18_157=='h') ) {
                        int LA18_216 = input.LA(5);

                        if ( (LA18_216=='e') ) {
                            int LA18_273 = input.LA(6);

                            if ( (LA18_273=='d') ) {
                                int LA18_321 = input.LA(7);

                                if ( (LA18_321=='$'||(LA18_321>='0' && LA18_321<='9')||(LA18_321>='A' && LA18_321<='Z')||LA18_321=='_'||(LA18_321>='a' && LA18_321<='z')||(LA18_321>='\u00C0' && LA18_321<='\u00D6')||(LA18_321>='\u00D8' && LA18_321<='\u00F6')||(LA18_321>='\u00F8' && LA18_321<='\u1FFF')||(LA18_321>='\u3040' && LA18_321<='\u318F')||(LA18_321>='\u3300' && LA18_321<='\u337F')||(LA18_321>='\u3400' && LA18_321<='\u3D2D')||(LA18_321>='\u4E00' && LA18_321<='\u9FFF')||(LA18_321>='\uF900' && LA18_321<='\uFAFF')) ) {
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
                    int LA18_158 = input.LA(4);

                    if ( (LA18_158=='e') ) {
                        int LA18_217 = input.LA(5);

                        if ( (LA18_217=='$'||(LA18_217>='0' && LA18_217<='9')||(LA18_217>='A' && LA18_217<='Z')||LA18_217=='_'||(LA18_217>='a' && LA18_217<='z')||(LA18_217>='\u00C0' && LA18_217<='\u00D6')||(LA18_217>='\u00D8' && LA18_217<='\u00F6')||(LA18_217>='\u00F8' && LA18_217<='\u1FFF')||(LA18_217>='\u3040' && LA18_217<='\u318F')||(LA18_217>='\u3300' && LA18_217<='\u337F')||(LA18_217>='\u3400' && LA18_217<='\u3D2D')||(LA18_217>='\u4E00' && LA18_217<='\u9FFF')||(LA18_217>='\uF900' && LA18_217<='\uFAFF')) ) {
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
                case 'n':
                    {
                    int LA18_159 = input.LA(4);

                    if ( (LA18_159=='t') ) {
                        int LA18_218 = input.LA(5);

                        if ( (LA18_218=='e') ) {
                            int LA18_275 = input.LA(6);

                            if ( (LA18_275=='x') ) {
                                int LA18_322 = input.LA(7);

                                if ( (LA18_322=='t') ) {
                                    int LA18_363 = input.LA(8);

                                    if ( (LA18_363=='$'||(LA18_363>='0' && LA18_363<='9')||(LA18_363>='A' && LA18_363<='Z')||LA18_363=='_'||(LA18_363>='a' && LA18_363<='z')||(LA18_363>='\u00C0' && LA18_363<='\u00D6')||(LA18_363>='\u00D8' && LA18_363<='\u00F6')||(LA18_363>='\u00F8' && LA18_363<='\u1FFF')||(LA18_363>='\u3040' && LA18_363<='\u318F')||(LA18_363>='\u3300' && LA18_363<='\u337F')||(LA18_363>='\u3400' && LA18_363<='\u3D2D')||(LA18_363>='\u4E00' && LA18_363<='\u9FFF')||(LA18_363>='\uF900' && LA18_363<='\uFAFF')) ) {
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
                case 'l':
                    {
                    int LA18_160 = input.LA(4);

                    if ( (LA18_160=='l') ) {
                        int LA18_219 = input.LA(5);

                        if ( (LA18_219=='e') ) {
                            int LA18_276 = input.LA(6);

                            if ( (LA18_276=='c') ) {
                                int LA18_323 = input.LA(7);

                                if ( (LA18_323=='t') ) {
                                    int LA18_364 = input.LA(8);

                                    if ( (LA18_364=='$'||(LA18_364>='0' && LA18_364<='9')||(LA18_364>='A' && LA18_364<='Z')||LA18_364=='_'||(LA18_364>='a' && LA18_364<='z')||(LA18_364>='\u00C0' && LA18_364<='\u00D6')||(LA18_364>='\u00D8' && LA18_364<='\u00F6')||(LA18_364>='\u00F8' && LA18_364<='\u1FFF')||(LA18_364>='\u3040' && LA18_364<='\u318F')||(LA18_364>='\u3300' && LA18_364<='\u337F')||(LA18_364>='\u3400' && LA18_364<='\u3D2D')||(LA18_364>='\u4E00' && LA18_364<='\u9FFF')||(LA18_364>='\uF900' && LA18_364<='\uFAFF')) ) {
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
                default:
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
                    int LA18_161 = input.LA(4);

                    if ( (LA18_161=='N') ) {
                        int LA18_220 = input.LA(5);

                        if ( (LA18_220=='I') ) {
                            int LA18_277 = input.LA(6);

                            if ( (LA18_277=='N') ) {
                                int LA18_324 = input.LA(7);

                                if ( (LA18_324=='G') ) {
                                    int LA18_365 = input.LA(8);

                                    if ( (LA18_365=='$'||(LA18_365>='0' && LA18_365<='9')||(LA18_365>='A' && LA18_365<='Z')||LA18_365=='_'||(LA18_365>='a' && LA18_365<='z')||(LA18_365>='\u00C0' && LA18_365<='\u00D6')||(LA18_365>='\u00D8' && LA18_365<='\u00F6')||(LA18_365>='\u00F8' && LA18_365<='\u1FFF')||(LA18_365>='\u3040' && LA18_365<='\u318F')||(LA18_365>='\u3300' && LA18_365<='\u337F')||(LA18_365>='\u3400' && LA18_365<='\u3D2D')||(LA18_365>='\u4E00' && LA18_365<='\u9FFF')||(LA18_365>='\uF900' && LA18_365<='\uFAFF')) ) {
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
                    int LA18_162 = input.LA(4);

                    if ( (LA18_162=='u') ) {
                        int LA18_221 = input.LA(5);

                        if ( (LA18_221=='n') ) {
                            int LA18_278 = input.LA(6);

                            if ( (LA18_278=='d') ) {
                                int LA18_325 = input.LA(7);

                                if ( (LA18_325=='$'||(LA18_325>='0' && LA18_325<='9')||(LA18_325>='A' && LA18_325<='Z')||LA18_325=='_'||(LA18_325>='a' && LA18_325<='z')||(LA18_325>='\u00C0' && LA18_325<='\u00D6')||(LA18_325>='\u00D8' && LA18_325<='\u00F6')||(LA18_325>='\u00F8' && LA18_325<='\u1FFF')||(LA18_325>='\u3040' && LA18_325<='\u318F')||(LA18_325>='\u3300' && LA18_325<='\u337F')||(LA18_325>='\u3400' && LA18_325<='\u3D2D')||(LA18_325>='\u4E00' && LA18_325<='\u9FFF')||(LA18_325>='\uF900' && LA18_325<='\uFAFF')) ) {
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
                    int LA18_163 = input.LA(4);

                    if ( (LA18_163=='v') ) {
                        int LA18_222 = input.LA(5);

                        if ( (LA18_222=='a') ) {
                            int LA18_279 = input.LA(6);

                            if ( (LA18_279=='t') ) {
                                int LA18_326 = input.LA(7);

                                if ( (LA18_326=='e') ) {
                                    int LA18_367 = input.LA(8);

                                    if ( (LA18_367=='$'||(LA18_367>='0' && LA18_367<='9')||(LA18_367>='A' && LA18_367<='Z')||LA18_367=='_'||(LA18_367>='a' && LA18_367<='z')||(LA18_367>='\u00C0' && LA18_367<='\u00D6')||(LA18_367>='\u00D8' && LA18_367<='\u00F6')||(LA18_367>='\u00F8' && LA18_367<='\u1FFF')||(LA18_367>='\u3040' && LA18_367<='\u318F')||(LA18_367>='\u3300' && LA18_367<='\u337F')||(LA18_367>='\u3400' && LA18_367<='\u3D2D')||(LA18_367>='\u4E00' && LA18_367<='\u9FFF')||(LA18_367>='\uF900' && LA18_367<='\uFAFF')) ) {
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
                    int LA18_164 = input.LA(4);

                    if ( (LA18_164=='A') ) {
                        int LA18_223 = input.LA(5);

                        if ( (LA18_223=='$'||(LA18_223>='0' && LA18_223<='9')||(LA18_223>='A' && LA18_223<='Z')||LA18_223=='_'||(LA18_223>='a' && LA18_223<='z')||(LA18_223>='\u00C0' && LA18_223<='\u00D6')||(LA18_223>='\u00D8' && LA18_223<='\u00F6')||(LA18_223>='\u00F8' && LA18_223<='\u1FFF')||(LA18_223>='\u3040' && LA18_223<='\u318F')||(LA18_223>='\u3300' && LA18_223<='\u337F')||(LA18_223>='\u3400' && LA18_223<='\u3D2D')||(LA18_223>='\u4E00' && LA18_223<='\u9FFF')||(LA18_223>='\uF900' && LA18_223<='\uFAFF')) ) {
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
                    int LA18_165 = input.LA(4);

                    if ( (LA18_165=='$'||(LA18_165>='0' && LA18_165<='9')||(LA18_165>='A' && LA18_165<='Z')||LA18_165=='_'||(LA18_165>='a' && LA18_165<='z')||(LA18_165>='\u00C0' && LA18_165<='\u00D6')||(LA18_165>='\u00D8' && LA18_165<='\u00F6')||(LA18_165>='\u00F8' && LA18_165<='\u1FFF')||(LA18_165>='\u3040' && LA18_165<='\u318F')||(LA18_165>='\u3300' && LA18_165<='\u337F')||(LA18_165>='\u3400' && LA18_165<='\u3D2D')||(LA18_165>='\u4E00' && LA18_165<='\u9FFF')||(LA18_165>='\uF900' && LA18_165<='\uFAFF')) ) {
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
            case 'y':
                {
                int LA18_96 = input.LA(3);

                if ( (LA18_96=='p') ) {
                    int LA18_166 = input.LA(4);

                    if ( (LA18_166=='e') ) {
                        int LA18_225 = input.LA(5);

                        if ( (LA18_225=='S') ) {
                            int LA18_281 = input.LA(6);

                            if ( (LA18_281=='e') ) {
                                int LA18_327 = input.LA(7);

                                if ( (LA18_327=='l') ) {
                                    int LA18_368 = input.LA(8);

                                    if ( (LA18_368=='e') ) {
                                        int LA18_396 = input.LA(9);

                                        if ( (LA18_396=='c') ) {
                                            int LA18_411 = input.LA(10);

                                            if ( (LA18_411=='t') ) {
                                                int LA18_423 = input.LA(11);

                                                if ( (LA18_423=='$'||(LA18_423>='0' && LA18_423<='9')||(LA18_423>='A' && LA18_423<='Z')||LA18_423=='_'||(LA18_423>='a' && LA18_423<='z')||(LA18_423>='\u00C0' && LA18_423<='\u00D6')||(LA18_423>='\u00D8' && LA18_423<='\u00F6')||(LA18_423>='\u00F8' && LA18_423<='\u1FFF')||(LA18_423>='\u3040' && LA18_423<='\u318F')||(LA18_423>='\u3300' && LA18_423<='\u337F')||(LA18_423>='\u3400' && LA18_423<='\u3D2D')||(LA18_423>='\u4E00' && LA18_423<='\u9FFF')||(LA18_423>='\uF900' && LA18_423<='\uFAFF')) ) {
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
            case 'r':
                {
                int LA18_97 = input.LA(3);

                if ( (LA18_97=='u') ) {
                    int LA18_167 = input.LA(4);

                    if ( (LA18_167=='e') ) {
                        int LA18_226 = input.LA(5);

                        if ( (LA18_226=='$'||(LA18_226>='0' && LA18_226<='9')||(LA18_226>='A' && LA18_226<='Z')||LA18_226=='_'||(LA18_226>='a' && LA18_226<='z')||(LA18_226>='\u00C0' && LA18_226<='\u00D6')||(LA18_226>='\u00D8' && LA18_226<='\u00F6')||(LA18_226>='\u00F8' && LA18_226<='\u1FFF')||(LA18_226>='\u3040' && LA18_226<='\u318F')||(LA18_226>='\u3300' && LA18_226<='\u337F')||(LA18_226>='\u3400' && LA18_226<='\u3D2D')||(LA18_226>='\u4E00' && LA18_226<='\u9FFF')||(LA18_226>='\uF900' && LA18_226<='\uFAFF')) ) {
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
            case 'h':
                {
                int LA18_98 = input.LA(3);

                if ( (LA18_98=='e') ) {
                    int LA18_168 = input.LA(4);

                    if ( (LA18_168=='n') ) {
                        int LA18_227 = input.LA(5);

                        if ( (LA18_227=='$'||(LA18_227>='0' && LA18_227<='9')||(LA18_227>='A' && LA18_227<='Z')||LA18_227=='_'||(LA18_227>='a' && LA18_227<='z')||(LA18_227>='\u00C0' && LA18_227<='\u00D6')||(LA18_227>='\u00D8' && LA18_227<='\u00F6')||(LA18_227>='\u00F8' && LA18_227<='\u1FFF')||(LA18_227>='\u3040' && LA18_227<='\u318F')||(LA18_227>='\u3300' && LA18_227<='\u337F')||(LA18_227>='\u3400' && LA18_227<='\u3D2D')||(LA18_227>='\u4E00' && LA18_227<='\u9FFF')||(LA18_227>='\uF900' && LA18_227<='\uFAFF')) ) {
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
                    int LA18_169 = input.LA(4);

                    if ( (LA18_169=='e') ) {
                        int LA18_228 = input.LA(5);

                        if ( (LA18_228=='c') ) {
                            int LA18_284 = input.LA(6);

                            if ( (LA18_284=='t') ) {
                                int LA18_328 = input.LA(7);

                                if ( (LA18_328=='F') ) {
                                    int LA18_369 = input.LA(8);

                                    if ( (LA18_369=='i') ) {
                                        int LA18_397 = input.LA(9);

                                        if ( (LA18_397=='r') ) {
                                            int LA18_412 = input.LA(10);

                                            if ( (LA18_412=='s') ) {
                                                int LA18_424 = input.LA(11);

                                                if ( (LA18_424=='t') ) {
                                                    int LA18_431 = input.LA(12);

                                                    if ( (LA18_431=='$'||(LA18_431>='0' && LA18_431<='9')||(LA18_431>='A' && LA18_431<='Z')||LA18_431=='_'||(LA18_431>='a' && LA18_431<='z')||(LA18_431>='\u00C0' && LA18_431<='\u00D6')||(LA18_431>='\u00D8' && LA18_431<='\u00F6')||(LA18_431>='\u00F8' && LA18_431<='\u1FFF')||(LA18_431>='\u3040' && LA18_431<='\u318F')||(LA18_431>='\u3300' && LA18_431<='\u337F')||(LA18_431>='\u3400' && LA18_431<='\u3D2D')||(LA18_431>='\u4E00' && LA18_431<='\u9FFF')||(LA18_431>='\uF900' && LA18_431<='\uFAFF')) ) {
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
                                else if ( (LA18_328=='$'||(LA18_328>='0' && LA18_328<='9')||(LA18_328>='A' && LA18_328<='E')||(LA18_328>='G' && LA18_328<='Z')||LA18_328=='_'||(LA18_328>='a' && LA18_328<='z')||(LA18_328>='\u00C0' && LA18_328<='\u00D6')||(LA18_328>='\u00D8' && LA18_328<='\u00F6')||(LA18_328>='\u00F8' && LA18_328<='\u1FFF')||(LA18_328>='\u3040' && LA18_328<='\u318F')||(LA18_328>='\u3300' && LA18_328<='\u337F')||(LA18_328>='\u3400' && LA18_328<='\u3D2D')||(LA18_328>='\u4E00' && LA18_328<='\u9FFF')||(LA18_328>='\uF900' && LA18_328<='\uFAFF')) ) {
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
                    int LA18_170 = input.LA(4);

                    if ( (LA18_170=='t') ) {
                        int LA18_229 = input.LA(5);

                        if ( (LA18_229=='B') ) {
                            int LA18_285 = input.LA(6);

                            if ( (LA18_285=='y') ) {
                                int LA18_329 = input.LA(7);

                                if ( (LA18_329=='$'||(LA18_329>='0' && LA18_329<='9')||(LA18_329>='A' && LA18_329<='Z')||LA18_329=='_'||(LA18_329>='a' && LA18_329<='z')||(LA18_329>='\u00C0' && LA18_329<='\u00D6')||(LA18_329>='\u00D8' && LA18_329<='\u00F6')||(LA18_329>='\u00F8' && LA18_329<='\u1FFF')||(LA18_329>='\u3040' && LA18_329<='\u318F')||(LA18_329>='\u3300' && LA18_329<='\u337F')||(LA18_329>='\u3400' && LA18_329<='\u3D2D')||(LA18_329>='\u4E00' && LA18_329<='\u9FFF')||(LA18_329>='\uF900' && LA18_329<='\uFAFF')) ) {
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
                    int LA18_171 = input.LA(4);

                    if ( (LA18_171=='t') ) {
                        int LA18_230 = input.LA(5);

                        if ( (LA18_230=='c') ) {
                            int LA18_286 = input.LA(6);

                            if ( (LA18_286=='h') ) {
                                int LA18_330 = input.LA(7);

                                if ( (LA18_330=='$'||(LA18_330>='0' && LA18_330<='9')||(LA18_330>='A' && LA18_330<='Z')||LA18_330=='_'||(LA18_330>='a' && LA18_330<='z')||(LA18_330>='\u00C0' && LA18_330<='\u00D6')||(LA18_330>='\u00D8' && LA18_330<='\u00F6')||(LA18_330>='\u00F8' && LA18_330<='\u1FFF')||(LA18_330>='\u3040' && LA18_330<='\u318F')||(LA18_330>='\u3300' && LA18_330<='\u337F')||(LA18_330>='\u3400' && LA18_330<='\u3D2D')||(LA18_330>='\u4E00' && LA18_330<='\u9FFF')||(LA18_330>='\uF900' && LA18_330<='\uFAFF')) ) {
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
                    int LA18_172 = input.LA(4);

                    if ( (LA18_172=='a') ) {
                        int LA18_231 = input.LA(5);

                        if ( (LA18_231=='u') ) {
                            int LA18_287 = input.LA(6);

                            if ( (LA18_287=='l') ) {
                                int LA18_331 = input.LA(7);

                                if ( (LA18_331=='t') ) {
                                    int LA18_373 = input.LA(8);

                                    if ( (LA18_373=='$'||(LA18_373>='0' && LA18_373<='9')||(LA18_373>='A' && LA18_373<='Z')||LA18_373=='_'||(LA18_373>='a' && LA18_373<='z')||(LA18_373>='\u00C0' && LA18_373<='\u00D6')||(LA18_373>='\u00D8' && LA18_373<='\u00F6')||(LA18_373>='\u00F8' && LA18_373<='\u1FFF')||(LA18_373>='\u3040' && LA18_373<='\u318F')||(LA18_373>='\u3300' && LA18_373<='\u337F')||(LA18_373>='\u3400' && LA18_373<='\u3D2D')||(LA18_373>='\u4E00' && LA18_373<='\u9FFF')||(LA18_373>='\uF900' && LA18_373<='\uFAFF')) ) {
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
                    int LA18_173 = input.LA(4);

                    if ( (LA18_173=='B') ) {
                        int LA18_232 = input.LA(5);

                        if ( (LA18_232=='A') ) {
                            int LA18_288 = input.LA(6);

                            if ( (LA18_288=='L') ) {
                                int LA18_332 = input.LA(7);

                                if ( (LA18_332=='V') ) {
                                    int LA18_374 = input.LA(8);

                                    if ( (LA18_374=='A') ) {
                                        int LA18_399 = input.LA(9);

                                        if ( (LA18_399=='R') ) {
                                            int LA18_413 = input.LA(10);

                                            if ( (LA18_413=='$'||(LA18_413>='0' && LA18_413<='9')||(LA18_413>='A' && LA18_413<='Z')||LA18_413=='_'||(LA18_413>='a' && LA18_413<='z')||(LA18_413>='\u00C0' && LA18_413<='\u00D6')||(LA18_413>='\u00D8' && LA18_413<='\u00F6')||(LA18_413>='\u00F8' && LA18_413<='\u1FFF')||(LA18_413>='\u3040' && LA18_413<='\u318F')||(LA18_413>='\u3300' && LA18_413<='\u337F')||(LA18_413>='\u3400' && LA18_413<='\u3D2D')||(LA18_413>='\u4E00' && LA18_413<='\u9FFF')||(LA18_413>='\uF900' && LA18_413<='\uFAFF')) ) {
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
                    int LA18_174 = input.LA(4);

                    if ( (LA18_174=='l') ) {
                        int LA18_233 = input.LA(5);

                        if ( (LA18_233=='$'||(LA18_233>='0' && LA18_233<='9')||(LA18_233>='A' && LA18_233<='Z')||LA18_233=='_'||(LA18_233>='a' && LA18_233<='z')||(LA18_233>='\u00C0' && LA18_233<='\u00D6')||(LA18_233>='\u00D8' && LA18_233<='\u00F6')||(LA18_233>='\u00F8' && LA18_233<='\u1FFF')||(LA18_233>='\u3040' && LA18_233<='\u318F')||(LA18_233>='\u3300' && LA18_233<='\u337F')||(LA18_233>='\u3400' && LA18_233<='\u3D2D')||(LA18_233>='\u4E00' && LA18_233<='\u9FFF')||(LA18_233>='\uF900' && LA18_233<='\uFAFF')) ) {
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
            case 'o':
                {
                int LA18_116 = input.LA(3);

                if ( (LA18_116=='t') ) {
                    int LA18_175 = input.LA(4);

                    if ( (LA18_175=='E') ) {
                        int LA18_234 = input.LA(5);

                        if ( (LA18_234=='x') ) {
                            int LA18_290 = input.LA(6);

                            if ( (LA18_290=='i') ) {
                                int LA18_333 = input.LA(7);

                                if ( (LA18_333=='s') ) {
                                    int LA18_375 = input.LA(8);

                                    if ( (LA18_375=='t') ) {
                                        int LA18_400 = input.LA(9);

                                        if ( (LA18_400=='s') ) {
                                            int LA18_414 = input.LA(10);

                                            if ( (LA18_414=='$'||(LA18_414>='0' && LA18_414<='9')||(LA18_414>='A' && LA18_414<='Z')||LA18_414=='_'||(LA18_414>='a' && LA18_414<='z')||(LA18_414>='\u00C0' && LA18_414<='\u00D6')||(LA18_414>='\u00D8' && LA18_414<='\u00F6')||(LA18_414>='\u00F8' && LA18_414<='\u1FFF')||(LA18_414>='\u3040' && LA18_414<='\u318F')||(LA18_414>='\u3300' && LA18_414<='\u337F')||(LA18_414>='\u3400' && LA18_414<='\u3D2D')||(LA18_414>='\u4E00' && LA18_414<='\u9FFF')||(LA18_414>='\uF900' && LA18_414<='\uFAFF')) ) {
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
            case 'e':
                {
                int LA18_117 = input.LA(3);

                if ( (LA18_117=='w') ) {
                    int LA18_176 = input.LA(4);

                    if ( (LA18_176=='$'||(LA18_176>='0' && LA18_176<='9')||(LA18_176>='A' && LA18_176<='Z')||LA18_176=='_'||(LA18_176>='a' && LA18_176<='z')||(LA18_176>='\u00C0' && LA18_176<='\u00D6')||(LA18_176>='\u00D8' && LA18_176<='\u00F6')||(LA18_176>='\u00F8' && LA18_176<='\u1FFF')||(LA18_176>='\u3040' && LA18_176<='\u318F')||(LA18_176>='\u3300' && LA18_176<='\u337F')||(LA18_176>='\u3400' && LA18_176<='\u3D2D')||(LA18_176>='\u4E00' && LA18_176<='\u9FFF')||(LA18_176>='\uF900' && LA18_176<='\uFAFF')) ) {
                        alt18=95;
                    }
                    else {
                        alt18=73;}
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
                    int LA18_177 = input.LA(4);

                    if ( (LA18_177=='s') ) {
                        int LA18_236 = input.LA(5);

                        if ( (LA18_236=='e') ) {
                            int LA18_291 = input.LA(6);

                            if ( (LA18_291=='$'||(LA18_291>='0' && LA18_291<='9')||(LA18_291>='A' && LA18_291<='Z')||LA18_291=='_'||(LA18_291>='a' && LA18_291<='z')||(LA18_291>='\u00C0' && LA18_291<='\u00D6')||(LA18_291>='\u00D8' && LA18_291<='\u00F6')||(LA18_291>='\u00F8' && LA18_291<='\u1FFF')||(LA18_291>='\u3040' && LA18_291<='\u318F')||(LA18_291>='\u3300' && LA18_291<='\u337F')||(LA18_291>='\u3400' && LA18_291<='\u3D2D')||(LA18_291>='\u4E00' && LA18_291<='\u9FFF')||(LA18_291>='\uF900' && LA18_291<='\uFAFF')) ) {
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
                    int LA18_178 = input.LA(4);

                    if ( (LA18_178=='A') ) {
                        int LA18_237 = input.LA(5);

                        if ( (LA18_237=='l') ) {
                            int LA18_292 = input.LA(6);

                            if ( (LA18_292=='l') ) {
                                int LA18_335 = input.LA(7);

                                if ( (LA18_335=='$'||(LA18_335>='0' && LA18_335<='9')||(LA18_335>='A' && LA18_335<='Z')||LA18_335=='_'||(LA18_335>='a' && LA18_335<='z')||(LA18_335>='\u00C0' && LA18_335<='\u00D6')||(LA18_335>='\u00D8' && LA18_335<='\u00F6')||(LA18_335>='\u00F8' && LA18_335<='\u1FFF')||(LA18_335>='\u3040' && LA18_335<='\u318F')||(LA18_335>='\u3300' && LA18_335<='\u337F')||(LA18_335>='\u3400' && LA18_335<='\u3D2D')||(LA18_335>='\u4E00' && LA18_335<='\u9FFF')||(LA18_335>='\uF900' && LA18_335<='\uFAFF')) ) {
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
        else if ( (LA18_0=='$'||LA18_0=='B'||LA18_0=='H'||LA18_0=='K'||(LA18_0>='M' && LA18_0<='N')||LA18_0=='Q'||(LA18_0>='T' && LA18_0<='V')||(LA18_0>='X' && LA18_0<='Z')||(LA18_0>='^' && LA18_0<='_')||LA18_0=='b'||(LA18_0>='g' && LA18_0<='h')||(LA18_0>='j' && LA18_0<='k')||LA18_0=='m'||LA18_0=='o'||LA18_0=='q'||(LA18_0>='u' && LA18_0<='z')||(LA18_0>='\u00C0' && LA18_0<='\u00D6')||(LA18_0>='\u00D8' && LA18_0<='\u00F6')||(LA18_0>='\u00F8' && LA18_0<='\u1FFF')||(LA18_0>='\u3040' && LA18_0<='\u318F')||(LA18_0>='\u3300' && LA18_0<='\u337F')||(LA18_0>='\u3400' && LA18_0<='\u3D2D')||(LA18_0>='\u4E00' && LA18_0<='\u9FFF')||(LA18_0>='\uF900' && LA18_0<='\uFAFF')) ) {
            alt18=95;
        }
        else if ( (LA18_0=='R') ) {
            int LA18_50 = input.LA(2);

            if ( (LA18_50=='E') ) {
                int LA18_120 = input.LA(3);

                if ( (LA18_120=='M') ) {
                    int LA18_179 = input.LA(4);

                    if ( (LA18_179=='\u00BB') && (xpandMode)) {
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
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:10: T25
                {
                mT25(); 

                }
                break;
            case 2 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:14: T26
                {
                mT26(); 

                }
                break;
            case 3 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:18: T27
                {
                mT27(); 

                }
                break;
            case 4 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:22: T28
                {
                mT28(); 

                }
                break;
            case 5 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:26: T29
                {
                mT29(); 

                }
                break;
            case 6 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:30: T30
                {
                mT30(); 

                }
                break;
            case 7 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:34: T31
                {
                mT31(); 

                }
                break;
            case 8 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:38: T32
                {
                mT32(); 

                }
                break;
            case 9 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:42: T33
                {
                mT33(); 

                }
                break;
            case 10 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:46: T34
                {
                mT34(); 

                }
                break;
            case 11 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:50: T35
                {
                mT35(); 

                }
                break;
            case 12 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:54: T36
                {
                mT36(); 

                }
                break;
            case 13 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:58: T37
                {
                mT37(); 

                }
                break;
            case 14 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:62: T38
                {
                mT38(); 

                }
                break;
            case 15 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:66: T39
                {
                mT39(); 

                }
                break;
            case 16 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:70: T40
                {
                mT40(); 

                }
                break;
            case 17 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:74: T41
                {
                mT41(); 

                }
                break;
            case 18 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:78: T42
                {
                mT42(); 

                }
                break;
            case 19 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:82: T43
                {
                mT43(); 

                }
                break;
            case 20 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:86: T44
                {
                mT44(); 

                }
                break;
            case 21 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:90: T45
                {
                mT45(); 

                }
                break;
            case 22 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:94: T46
                {
                mT46(); 

                }
                break;
            case 23 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:98: T47
                {
                mT47(); 

                }
                break;
            case 24 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:102: T48
                {
                mT48(); 

                }
                break;
            case 25 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:106: T49
                {
                mT49(); 

                }
                break;
            case 26 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:110: T50
                {
                mT50(); 

                }
                break;
            case 27 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:114: T51
                {
                mT51(); 

                }
                break;
            case 28 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:118: T52
                {
                mT52(); 

                }
                break;
            case 29 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:122: T53
                {
                mT53(); 

                }
                break;
            case 30 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:126: T54
                {
                mT54(); 

                }
                break;
            case 31 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:130: T55
                {
                mT55(); 

                }
                break;
            case 32 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:134: T56
                {
                mT56(); 

                }
                break;
            case 33 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:138: T57
                {
                mT57(); 

                }
                break;
            case 34 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:142: T58
                {
                mT58(); 

                }
                break;
            case 35 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:146: T59
                {
                mT59(); 

                }
                break;
            case 36 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:150: T60
                {
                mT60(); 

                }
                break;
            case 37 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:154: T61
                {
                mT61(); 

                }
                break;
            case 38 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:158: T62
                {
                mT62(); 

                }
                break;
            case 39 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:162: T63
                {
                mT63(); 

                }
                break;
            case 40 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:166: T64
                {
                mT64(); 

                }
                break;
            case 41 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:170: T65
                {
                mT65(); 

                }
                break;
            case 42 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:174: T66
                {
                mT66(); 

                }
                break;
            case 43 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:178: T67
                {
                mT67(); 

                }
                break;
            case 44 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:182: T68
                {
                mT68(); 

                }
                break;
            case 45 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:186: T69
                {
                mT69(); 

                }
                break;
            case 46 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:190: T70
                {
                mT70(); 

                }
                break;
            case 47 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:194: T71
                {
                mT71(); 

                }
                break;
            case 48 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:198: T72
                {
                mT72(); 

                }
                break;
            case 49 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:202: T73
                {
                mT73(); 

                }
                break;
            case 50 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:206: T74
                {
                mT74(); 

                }
                break;
            case 51 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:210: T75
                {
                mT75(); 

                }
                break;
            case 52 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:214: T76
                {
                mT76(); 

                }
                break;
            case 53 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:218: T77
                {
                mT77(); 

                }
                break;
            case 54 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:222: T78
                {
                mT78(); 

                }
                break;
            case 55 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:226: T79
                {
                mT79(); 

                }
                break;
            case 56 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:230: T80
                {
                mT80(); 

                }
                break;
            case 57 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:234: T81
                {
                mT81(); 

                }
                break;
            case 58 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:238: T82
                {
                mT82(); 

                }
                break;
            case 59 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:242: T83
                {
                mT83(); 

                }
                break;
            case 60 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:246: T84
                {
                mT84(); 

                }
                break;
            case 61 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:250: T85
                {
                mT85(); 

                }
                break;
            case 62 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:254: T86
                {
                mT86(); 

                }
                break;
            case 63 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:258: T87
                {
                mT87(); 

                }
                break;
            case 64 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:262: T88
                {
                mT88(); 

                }
                break;
            case 65 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:266: T89
                {
                mT89(); 

                }
                break;
            case 66 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:270: T90
                {
                mT90(); 

                }
                break;
            case 67 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:274: T91
                {
                mT91(); 

                }
                break;
            case 68 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:278: T92
                {
                mT92(); 

                }
                break;
            case 69 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:282: T93
                {
                mT93(); 

                }
                break;
            case 70 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:286: T94
                {
                mT94(); 

                }
                break;
            case 71 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:290: T95
                {
                mT95(); 

                }
                break;
            case 72 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:294: T96
                {
                mT96(); 

                }
                break;
            case 73 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:298: T97
                {
                mT97(); 

                }
                break;
            case 74 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:302: T98
                {
                mT98(); 

                }
                break;
            case 75 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:306: T99
                {
                mT99(); 

                }
                break;
            case 76 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:310: T100
                {
                mT100(); 

                }
                break;
            case 77 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:315: T101
                {
                mT101(); 

                }
                break;
            case 78 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:320: T102
                {
                mT102(); 

                }
                break;
            case 79 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:325: T103
                {
                mT103(); 

                }
                break;
            case 80 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:330: T104
                {
                mT104(); 

                }
                break;
            case 81 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:335: T105
                {
                mT105(); 

                }
                break;
            case 82 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:340: T106
                {
                mT106(); 

                }
                break;
            case 83 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:345: T107
                {
                mT107(); 

                }
                break;
            case 84 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:350: T108
                {
                mT108(); 

                }
                break;
            case 85 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:355: T109
                {
                mT109(); 

                }
                break;
            case 86 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:360: T110
                {
                mT110(); 

                }
                break;
            case 87 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:365: T111
                {
                mT111(); 

                }
                break;
            case 88 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:370: T112
                {
                mT112(); 

                }
                break;
            case 89 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:375: IntLiteral
                {
                mIntLiteral(); 

                }
                break;
            case 90 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:386: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 91 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:400: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 92 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:407: ENDDEFINE
                {
                mENDDEFINE(); 

                }
                break;
            case 93 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:417: AROUND
                {
                mAROUND(); 

                }
                break;
            case 94 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:424: ENDAROUND
                {
                mENDAROUND(); 

                }
                break;
            case 95 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:434: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 96 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:445: WS
                {
                mWS(); 

                }
                break;
            case 97 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:448: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 98 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:456: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 99 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:469: REM_COMMENT_OUT
                {
                mREM_COMMENT_OUT(); 

                }
                break;
            case 100 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:485: REM_COMMENT
                {
                mREM_COMMENT(); 

                }
                break;
            case 101 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:497: TEXT
                {
                mTEXT(); 

                }
                break;
            case 102 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:502: LG
                {
                mLG(); 

                }
                break;
            case 103 :
                // ./src-gen/org/eclipse/xpand3/internal/frontend/parser/Xpand3Node.g:1:505: RG
                {
                mRG(); 

                }
                break;

        }

    }


 

}