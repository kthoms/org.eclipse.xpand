// $ANTLR 3.0.1 src/org/eclipse/internal/xtend/xtend/parser/Xtend.g 2009-12-21 22:01:25
 	
package org.eclipse.internal.xtend.xtend.parser; 
	
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;

public class XtendLexer extends Lexer {
    public static final int T79=79;
    public static final int IntLiteral=5;
    public static final int T29=29;
    public static final int HexDigit=10;
    public static final int T36=36;
    public static final int T58=58;
    public static final int T70=70;
    public static final int T74=74;
    public static final int T35=35;
    public static final int T61=61;
    public static final int T45=45;
    public static final int T20=20;
    public static final int T34=34;
    public static final int T64=64;
    public static final int Letter=11;
    public static final int T25=25;
    public static final int T18=18;
    public static final int T37=37;
    public static final int EscapeSequence=7;
    public static final int T26=26;
    public static final int T32=32;
    public static final int T81=81;
    public static final int T51=51;
    public static final int T46=46;
    public static final int T77=77;
    public static final int T38=38;
    public static final int T41=41;
    public static final int T24=24;
    public static final int T19=19;
    public static final int T69=69;
    public static final int T39=39;
    public static final int T21=21;
    public static final int T62=62;
    public static final int T44=44;
    public static final int T55=55;
    public static final int T73=73;
    public static final int T68=68;
    public static final int T33=33;
    public static final int Identifier=6;
    public static final int T22=22;
    public static final int T50=50;
    public static final int T78=78;
    public static final int WS=13;
    public static final int T43=43;
    public static final int T23=23;
    public static final int T28=28;
    public static final int T42=42;
    public static final int T66=66;
    public static final int T40=40;
    public static final int COMMENT=14;
    public static final int T71=71;
    public static final int StringLiteral=4;
    public static final int T63=63;
    public static final int T57=57;
    public static final int LINE_COMMENT=15;
    public static final int T72=72;
    public static final int T65=65;
    public static final int T56=56;
    public static final int T76=76;
    public static final int T80=80;
    public static final int XPAND_TAG_OPEN=16;
    public static final int JavaIDDigit=12;
    public static final int UnicodeEscape=8;
    public static final int T75=75;
    public static final int T59=59;
    public static final int T48=48;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T67=67;
    public static final int T47=47;
    public static final int Tokens=83;
    public static final int T53=53;
    public static final int T60=60;
    public static final int T31=31;
    public static final int T82=82;
    public static final int OctalEscape=9;
    public static final int T49=49;
    public static final int T27=27;
    public static final int T52=52;
    public static final int XPAND_TAG_CLOSE=17;
    public static final int T30=30;
    public XtendLexer() {} 
    public XtendLexer(CharStream input) {
        super(input);
    }
    @Override
	public String getGrammarFileName() { return "src/org/eclipse/internal/xtend/xtend/parser/Xtend.g"; }

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:13:5: ( 'import' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:13:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:14:5: ( ';' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:14:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:15:5: ( 'extension' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:15:7: 'extension'
            {
            match("extension"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:16:5: ( 'reexport' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:16:7: 'reexport'
            {
            match("reexport"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:17:5: ( 'context' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:17:7: 'context'
            {
            match("context"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:18:5: ( '#' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:18:7: '#'
            {
            match('#'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:19:5: ( 'if' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:19:7: 'if'
            {
            match("if"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:20:5: ( 'ERROR' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:20:7: 'ERROR'
            {
            match("ERROR"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:21:5: ( 'WARNING' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:21:7: 'WARNING'
            {
            match("WARNING"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:22:5: ( ':' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:22:7: ':'
            {
            match(':'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:23:5: ( 'around' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:23:7: 'around'
            {
            match("around"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:24:5: ( '(' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:24:7: '('
            {
            match('('); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:25:5: ( ',' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:25:7: ','
            {
            match(','); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:26:5: ( '*' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:26:7: '*'
            {
            match('*'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:27:5: ( ')' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:27:7: ')'
            {
            match(')'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:28:5: ( '::' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:28:7: '::'
            {
            match("::"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:29:5: ( 'private' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:29:7: 'private'
            {
            match("private"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:30:5: ( 'cached' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:30:7: 'cached'
            {
            match("cached"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:31:5: ( 'JAVA' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:31:7: 'JAVA'
            {
            match("JAVA"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:32:5: ( '.' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:32:7: '.'
            {
            match('.'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:33:5: ( 'create' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:33:7: 'create'
            {
            match("create"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:34:5: ( 'Collection' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:34:7: 'Collection'
            {
            match("Collection"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:35:5: ( 'List' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:35:7: 'List'
            {
            match("List"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:36:5: ( 'Set' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:36:7: 'Set'
            {
            match("Set"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:37:5: ( 'let' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:37:7: 'let'
            {
            match("let"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:38:5: ( '=' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:38:7: '='
            {
            match('='); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:39:5: ( '->' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:39:7: '->'
            {
            match("->"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:40:5: ( '?' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:40:7: '?'
            {
            match('?'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:41:5: ( 'then' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:41:7: 'then'
            {
            match("then"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:42:5: ( 'else' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:42:7: 'else'
            {
            match("else"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:43:5: ( 'switch' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:43:7: 'switch'
            {
            match("switch"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:44:5: ( '{' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:44:7: '{'
            {
            match('{'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:45:5: ( 'case' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:45:7: 'case'
            {
            match("case"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:46:5: ( 'default' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:46:7: 'default'
            {
            match("default"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:47:5: ( '}' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:47:7: '}'
            {
            match('}'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:48:5: ( '||' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:48:7: '||'
            {
            match("||"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:49:5: ( '&&' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:49:7: '&&'
            {
            match("&&"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:50:5: ( 'implies' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:50:7: 'implies'
            {
            match("implies"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:51:5: ( '==' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:51:7: '=='
            {
            match("=="); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:52:5: ( '!=' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:52:7: '!='
            {
            match("!="); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:53:5: ( '>=' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:53:7: '>='
            {
            match(">="); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:54:5: ( '<=' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:54:7: '<='
            {
            match("<="); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:55:5: ( '>' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:55:7: '>'
            {
            match('>'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:56:5: ( '<' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:56:7: '<'
            {
            match('<'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:57:5: ( '+' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:57:7: '+'
            {
            match('+'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:58:5: ( '-' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:58:7: '-'
            {
            match('-'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:59:5: ( '/' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:59:7: '/'
            {
            match('/'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:60:5: ( '!' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:60:7: '!'
            {
            match('!'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:61:5: ( 'GLOBALVAR' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:61:7: 'GLOBALVAR'
            {
            match("GLOBALVAR"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:62:5: ( 'new' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:62:7: 'new'
            {
            match("new"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:63:5: ( 'false' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:63:7: 'false'
            {
            match("false"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:64:5: ( 'true' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:64:7: 'true'
            {
            match("true"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:65:5: ( 'null' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:65:7: 'null'
            {
            match("null"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:66:5: ( 'typeSelect' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:66:7: 'typeSelect'
            {
            match("typeSelect"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:67:5: ( 'collect' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:67:7: 'collect'
            {
            match("collect"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:68:5: ( 'select' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:68:7: 'select'
            {
            match("select"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:69:5: ( 'selectFirst' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:69:7: 'selectFirst'
            {
            match("selectFirst"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:70:5: ( 'reject' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:70:7: 'reject'
            {
            match("reject"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:71:5: ( 'exists' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:71:7: 'exists'
            {
            match("exists"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:72:5: ( 'notExists' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:72:7: 'notExists'
            {
            match("notExists"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:73:5: ( 'sortBy' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:73:7: 'sortBy'
            {
            match("sortBy"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:74:5: ( 'forAll' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:74:7: 'forAll'
            {
            match("forAll"); 


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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:75:5: ( '|' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:75:7: '|'
            {
            match('|'); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:76:5: ( '[' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:76:7: '['
            {
            match('['); 

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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:77:5: ( ']' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:77:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start IntLiteral
    public final void mIntLiteral() throws RecognitionException {
        try {
            int _type = IntLiteral;
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:284:12: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:284:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:284:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    new NoViableAltException("284:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:284:15: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:284:21: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:284:30: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:284:30: '0' .. '9'
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:287:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
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
                    new NoViableAltException("286:1: StringLiteral : ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:287:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:287:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
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
                    	    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:287:14: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:287:31: ~ ( '\\\\' | '\"' )
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
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:288:8: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
                    {
                    match('\''); 
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:288:13: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
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
                    	    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:288:15: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:288:32: ~ ( '\\'' | '\\\\' )
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:293:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
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
                        new NoViableAltException("291:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("291:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:293:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:294:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:295:9: OctalEscape
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:300:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                        new NoViableAltException("298:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("298:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:300:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:300:14: ( '0' .. '3' )
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:300:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:300:25: ( '0' .. '7' )
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:300:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:300:36: ( '0' .. '7' )
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:300:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:301:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:301:14: ( '0' .. '7' )
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:301:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:301:25: ( '0' .. '7' )
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:301:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:302:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:302:14: ( '0' .. '7' )
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:302:15: '0' .. '7'
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:307:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:307:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:310:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:310:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:313:5: ( ( '^' )? Letter ( Letter | JavaIDDigit )* )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:313:9: ( '^' )? Letter ( Letter | JavaIDDigit )*
            {
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:313:9: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:313:10: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            mLetter(); 
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:313:23: ( Letter | JavaIDDigit )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')||(LA9_0>='\u00C0' && LA9_0<='\u00D6')||(LA9_0>='\u00D8' && LA9_0<='\u00F6')||(LA9_0>='\u00F8' && LA9_0<='\u1FFF')||(LA9_0>='\u3040' && LA9_0<='\u318F')||(LA9_0>='\u3300' && LA9_0<='\u337F')||(LA9_0>='\u3400' && LA9_0<='\u3D2D')||(LA9_0>='\u4E00' && LA9_0<='\u9FFF')||(LA9_0>='\uF900' && LA9_0<='\uFAFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:318:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:335:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:352:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:352:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:356:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:356:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:356:14: ( options {greedy=false; } : . )*
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
            	    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:356:42: .
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
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:360:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF ) )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:360:7: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF )
            {
            match("//"); 

            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:360:12: (~ ( '\\n' | '\\r' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:360:12: ~ ( '\\n' | '\\r' )
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

            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:360:26: ( ( '\\r' )? '\\n' | EOF )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            else {
                alt13=2;}
            switch (alt13) {
                case 1 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:360:27: ( '\\r' )? '\\n'
                    {
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:360:27: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:360:27: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;
                case 2 :
                    // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:360:38: EOF
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

    // $ANTLR start XPAND_TAG_OPEN
    public final void mXPAND_TAG_OPEN() throws RecognitionException {
        try {
            int _type = XPAND_TAG_OPEN;
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:365:2: ( '\\u00AB' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:365:4: '\\u00AB'
            {
            match('\u00AB'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XPAND_TAG_OPEN

    // $ANTLR start XPAND_TAG_CLOSE
    public final void mXPAND_TAG_CLOSE() throws RecognitionException {
        try {
            int _type = XPAND_TAG_CLOSE;
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:367:2: ( '\\u00BB' )
            // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:367:4: '\\u00BB'
            {
            match('\u00BB'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XPAND_TAG_CLOSE

    @Override
	public void mTokens() throws RecognitionException {
        // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:8: ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | IntLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT | XPAND_TAG_OPEN | XPAND_TAG_CLOSE )
        int alt14=73;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA14_48 = input.LA(3);

                if ( (LA14_48=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'l':
                        {
                        int LA14_129 = input.LA(5);

                        if ( (LA14_129=='i') ) {
                            int LA14_163 = input.LA(6);

                            if ( (LA14_163=='e') ) {
                                int LA14_194 = input.LA(7);

                                if ( (LA14_194=='s') ) {
                                    int LA14_218 = input.LA(8);

                                    if ( (LA14_218=='$'||(LA14_218>='0' && LA14_218<='9')||(LA14_218>='A' && LA14_218<='Z')||LA14_218=='_'||(LA14_218>='a' && LA14_218<='z')||(LA14_218>='\u00C0' && LA14_218<='\u00D6')||(LA14_218>='\u00D8' && LA14_218<='\u00F6')||(LA14_218>='\u00F8' && LA14_218<='\u1FFF')||(LA14_218>='\u3040' && LA14_218<='\u318F')||(LA14_218>='\u3300' && LA14_218<='\u337F')||(LA14_218>='\u3400' && LA14_218<='\u3D2D')||(LA14_218>='\u4E00' && LA14_218<='\u9FFF')||(LA14_218>='\uF900' && LA14_218<='\uFAFF')) ) {
                                        alt14=68;
                                    }
                                    else {
                                        alt14=38;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                        }
                        break;
                    case 'o':
                        {
                        int LA14_130 = input.LA(5);

                        if ( (LA14_130=='r') ) {
                            int LA14_164 = input.LA(6);

                            if ( (LA14_164=='t') ) {
                                int LA14_195 = input.LA(7);

                                if ( (LA14_195=='$'||(LA14_195>='0' && LA14_195<='9')||(LA14_195>='A' && LA14_195<='Z')||LA14_195=='_'||(LA14_195>='a' && LA14_195<='z')||(LA14_195>='\u00C0' && LA14_195<='\u00D6')||(LA14_195>='\u00D8' && LA14_195<='\u00F6')||(LA14_195>='\u00F8' && LA14_195<='\u1FFF')||(LA14_195>='\u3040' && LA14_195<='\u318F')||(LA14_195>='\u3300' && LA14_195<='\u337F')||(LA14_195>='\u3400' && LA14_195<='\u3D2D')||(LA14_195>='\u4E00' && LA14_195<='\u9FFF')||(LA14_195>='\uF900' && LA14_195<='\uFAFF')) ) {
                                    alt14=68;
                                }
                                else {
                                    alt14=1;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                        }
                        break;
                    default:
                        alt14=68;}

                }
                else {
                    alt14=68;}
                }
                break;
            case 'f':
                {
                int LA14_49 = input.LA(3);

                if ( (LA14_49=='$'||(LA14_49>='0' && LA14_49<='9')||(LA14_49>='A' && LA14_49<='Z')||LA14_49=='_'||(LA14_49>='a' && LA14_49<='z')||(LA14_49>='\u00C0' && LA14_49<='\u00D6')||(LA14_49>='\u00D8' && LA14_49<='\u00F6')||(LA14_49>='\u00F8' && LA14_49<='\u1FFF')||(LA14_49>='\u3040' && LA14_49<='\u318F')||(LA14_49>='\u3300' && LA14_49<='\u337F')||(LA14_49>='\u3400' && LA14_49<='\u3D2D')||(LA14_49>='\u4E00' && LA14_49<='\u9FFF')||(LA14_49>='\uF900' && LA14_49<='\uFAFF')) ) {
                    alt14=68;
                }
                else {
                    alt14=7;}
                }
                break;
            default:
                alt14=68;}

        }
        else if ( (LA14_0==';') ) {
            alt14=2;
        }
        else if ( (LA14_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA14_50 = input.LA(3);

                if ( (LA14_50=='s') ) {
                    int LA14_97 = input.LA(4);

                    if ( (LA14_97=='e') ) {
                        int LA14_131 = input.LA(5);

                        if ( (LA14_131=='$'||(LA14_131>='0' && LA14_131<='9')||(LA14_131>='A' && LA14_131<='Z')||LA14_131=='_'||(LA14_131>='a' && LA14_131<='z')||(LA14_131>='\u00C0' && LA14_131<='\u00D6')||(LA14_131>='\u00D8' && LA14_131<='\u00F6')||(LA14_131>='\u00F8' && LA14_131<='\u1FFF')||(LA14_131>='\u3040' && LA14_131<='\u318F')||(LA14_131>='\u3300' && LA14_131<='\u337F')||(LA14_131>='\u3400' && LA14_131<='\u3D2D')||(LA14_131>='\u4E00' && LA14_131<='\u9FFF')||(LA14_131>='\uF900' && LA14_131<='\uFAFF')) ) {
                            alt14=68;
                        }
                        else {
                            alt14=30;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA14_98 = input.LA(4);

                    if ( (LA14_98=='e') ) {
                        int LA14_132 = input.LA(5);

                        if ( (LA14_132=='n') ) {
                            int LA14_166 = input.LA(6);

                            if ( (LA14_166=='s') ) {
                                int LA14_196 = input.LA(7);

                                if ( (LA14_196=='i') ) {
                                    int LA14_220 = input.LA(8);

                                    if ( (LA14_220=='o') ) {
                                        int LA14_242 = input.LA(9);

                                        if ( (LA14_242=='n') ) {
                                            int LA14_254 = input.LA(10);

                                            if ( (LA14_254=='$'||(LA14_254>='0' && LA14_254<='9')||(LA14_254>='A' && LA14_254<='Z')||LA14_254=='_'||(LA14_254>='a' && LA14_254<='z')||(LA14_254>='\u00C0' && LA14_254<='\u00D6')||(LA14_254>='\u00D8' && LA14_254<='\u00F6')||(LA14_254>='\u00F8' && LA14_254<='\u1FFF')||(LA14_254>='\u3040' && LA14_254<='\u318F')||(LA14_254>='\u3300' && LA14_254<='\u337F')||(LA14_254>='\u3400' && LA14_254<='\u3D2D')||(LA14_254>='\u4E00' && LA14_254<='\u9FFF')||(LA14_254>='\uF900' && LA14_254<='\uFAFF')) ) {
                                                alt14=68;
                                            }
                                            else {
                                                alt14=3;}
                                        }
                                        else {
                                            alt14=68;}
                                    }
                                    else {
                                        alt14=68;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                    }
                    break;
                case 'i':
                    {
                    int LA14_99 = input.LA(4);

                    if ( (LA14_99=='s') ) {
                        int LA14_133 = input.LA(5);

                        if ( (LA14_133=='t') ) {
                            int LA14_167 = input.LA(6);

                            if ( (LA14_167=='s') ) {
                                int LA14_197 = input.LA(7);

                                if ( (LA14_197=='$'||(LA14_197>='0' && LA14_197<='9')||(LA14_197>='A' && LA14_197<='Z')||LA14_197=='_'||(LA14_197>='a' && LA14_197<='z')||(LA14_197>='\u00C0' && LA14_197<='\u00D6')||(LA14_197>='\u00D8' && LA14_197<='\u00F6')||(LA14_197>='\u00F8' && LA14_197<='\u1FFF')||(LA14_197>='\u3040' && LA14_197<='\u318F')||(LA14_197>='\u3300' && LA14_197<='\u337F')||(LA14_197>='\u3400' && LA14_197<='\u3D2D')||(LA14_197>='\u4E00' && LA14_197<='\u9FFF')||(LA14_197>='\uF900' && LA14_197<='\uFAFF')) ) {
                                    alt14=68;
                                }
                                else {
                                    alt14=59;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                    }
                    break;
                default:
                    alt14=68;}

                }
                break;
            default:
                alt14=68;}

        }
        else if ( (LA14_0=='r') ) {
            int LA14_4 = input.LA(2);

            if ( (LA14_4=='e') ) {
                switch ( input.LA(3) ) {
                case 'e':
                    {
                    int LA14_100 = input.LA(4);

                    if ( (LA14_100=='x') ) {
                        int LA14_134 = input.LA(5);

                        if ( (LA14_134=='p') ) {
                            int LA14_168 = input.LA(6);

                            if ( (LA14_168=='o') ) {
                                int LA14_198 = input.LA(7);

                                if ( (LA14_198=='r') ) {
                                    int LA14_222 = input.LA(8);

                                    if ( (LA14_222=='t') ) {
                                        int LA14_243 = input.LA(9);

                                        if ( (LA14_243=='$'||(LA14_243>='0' && LA14_243<='9')||(LA14_243>='A' && LA14_243<='Z')||LA14_243=='_'||(LA14_243>='a' && LA14_243<='z')||(LA14_243>='\u00C0' && LA14_243<='\u00D6')||(LA14_243>='\u00D8' && LA14_243<='\u00F6')||(LA14_243>='\u00F8' && LA14_243<='\u1FFF')||(LA14_243>='\u3040' && LA14_243<='\u318F')||(LA14_243>='\u3300' && LA14_243<='\u337F')||(LA14_243>='\u3400' && LA14_243<='\u3D2D')||(LA14_243>='\u4E00' && LA14_243<='\u9FFF')||(LA14_243>='\uF900' && LA14_243<='\uFAFF')) ) {
                                            alt14=68;
                                        }
                                        else {
                                            alt14=4;}
                                    }
                                    else {
                                        alt14=68;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                    }
                    break;
                case 'j':
                    {
                    int LA14_101 = input.LA(4);

                    if ( (LA14_101=='e') ) {
                        int LA14_135 = input.LA(5);

                        if ( (LA14_135=='c') ) {
                            int LA14_169 = input.LA(6);

                            if ( (LA14_169=='t') ) {
                                int LA14_199 = input.LA(7);

                                if ( (LA14_199=='$'||(LA14_199>='0' && LA14_199<='9')||(LA14_199>='A' && LA14_199<='Z')||LA14_199=='_'||(LA14_199>='a' && LA14_199<='z')||(LA14_199>='\u00C0' && LA14_199<='\u00D6')||(LA14_199>='\u00D8' && LA14_199<='\u00F6')||(LA14_199>='\u00F8' && LA14_199<='\u1FFF')||(LA14_199>='\u3040' && LA14_199<='\u318F')||(LA14_199>='\u3300' && LA14_199<='\u337F')||(LA14_199>='\u3400' && LA14_199<='\u3D2D')||(LA14_199>='\u4E00' && LA14_199<='\u9FFF')||(LA14_199>='\uF900' && LA14_199<='\uFAFF')) ) {
                                    alt14=68;
                                }
                                else {
                                    alt14=58;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                    }
                    break;
                default:
                    alt14=68;}

            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA14_102 = input.LA(4);

                    if ( (LA14_102=='l') ) {
                        int LA14_136 = input.LA(5);

                        if ( (LA14_136=='e') ) {
                            int LA14_170 = input.LA(6);

                            if ( (LA14_170=='c') ) {
                                int LA14_200 = input.LA(7);

                                if ( (LA14_200=='t') ) {
                                    int LA14_224 = input.LA(8);

                                    if ( (LA14_224=='$'||(LA14_224>='0' && LA14_224<='9')||(LA14_224>='A' && LA14_224<='Z')||LA14_224=='_'||(LA14_224>='a' && LA14_224<='z')||(LA14_224>='\u00C0' && LA14_224<='\u00D6')||(LA14_224>='\u00D8' && LA14_224<='\u00F6')||(LA14_224>='\u00F8' && LA14_224<='\u1FFF')||(LA14_224>='\u3040' && LA14_224<='\u318F')||(LA14_224>='\u3300' && LA14_224<='\u337F')||(LA14_224>='\u3400' && LA14_224<='\u3D2D')||(LA14_224>='\u4E00' && LA14_224<='\u9FFF')||(LA14_224>='\uF900' && LA14_224<='\uFAFF')) ) {
                                        alt14=68;
                                    }
                                    else {
                                        alt14=55;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                    }
                    break;
                case 'n':
                    {
                    int LA14_103 = input.LA(4);

                    if ( (LA14_103=='t') ) {
                        int LA14_137 = input.LA(5);

                        if ( (LA14_137=='e') ) {
                            int LA14_171 = input.LA(6);

                            if ( (LA14_171=='x') ) {
                                int LA14_201 = input.LA(7);

                                if ( (LA14_201=='t') ) {
                                    int LA14_225 = input.LA(8);

                                    if ( (LA14_225=='$'||(LA14_225>='0' && LA14_225<='9')||(LA14_225>='A' && LA14_225<='Z')||LA14_225=='_'||(LA14_225>='a' && LA14_225<='z')||(LA14_225>='\u00C0' && LA14_225<='\u00D6')||(LA14_225>='\u00D8' && LA14_225<='\u00F6')||(LA14_225>='\u00F8' && LA14_225<='\u1FFF')||(LA14_225>='\u3040' && LA14_225<='\u318F')||(LA14_225>='\u3300' && LA14_225<='\u337F')||(LA14_225>='\u3400' && LA14_225<='\u3D2D')||(LA14_225>='\u4E00' && LA14_225<='\u9FFF')||(LA14_225>='\uF900' && LA14_225<='\uFAFF')) ) {
                                        alt14=68;
                                    }
                                    else {
                                        alt14=5;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                    }
                    break;
                default:
                    alt14=68;}

                }
                break;
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA14_104 = input.LA(4);

                    if ( (LA14_104=='h') ) {
                        int LA14_138 = input.LA(5);

                        if ( (LA14_138=='e') ) {
                            int LA14_172 = input.LA(6);

                            if ( (LA14_172=='d') ) {
                                int LA14_202 = input.LA(7);

                                if ( (LA14_202=='$'||(LA14_202>='0' && LA14_202<='9')||(LA14_202>='A' && LA14_202<='Z')||LA14_202=='_'||(LA14_202>='a' && LA14_202<='z')||(LA14_202>='\u00C0' && LA14_202<='\u00D6')||(LA14_202>='\u00D8' && LA14_202<='\u00F6')||(LA14_202>='\u00F8' && LA14_202<='\u1FFF')||(LA14_202>='\u3040' && LA14_202<='\u318F')||(LA14_202>='\u3300' && LA14_202<='\u337F')||(LA14_202>='\u3400' && LA14_202<='\u3D2D')||(LA14_202>='\u4E00' && LA14_202<='\u9FFF')||(LA14_202>='\uF900' && LA14_202<='\uFAFF')) ) {
                                    alt14=68;
                                }
                                else {
                                    alt14=18;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                    }
                    break;
                case 's':
                    {
                    int LA14_105 = input.LA(4);

                    if ( (LA14_105=='e') ) {
                        int LA14_139 = input.LA(5);

                        if ( (LA14_139=='$'||(LA14_139>='0' && LA14_139<='9')||(LA14_139>='A' && LA14_139<='Z')||LA14_139=='_'||(LA14_139>='a' && LA14_139<='z')||(LA14_139>='\u00C0' && LA14_139<='\u00D6')||(LA14_139>='\u00D8' && LA14_139<='\u00F6')||(LA14_139>='\u00F8' && LA14_139<='\u1FFF')||(LA14_139>='\u3040' && LA14_139<='\u318F')||(LA14_139>='\u3300' && LA14_139<='\u337F')||(LA14_139>='\u3400' && LA14_139<='\u3D2D')||(LA14_139>='\u4E00' && LA14_139<='\u9FFF')||(LA14_139>='\uF900' && LA14_139<='\uFAFF')) ) {
                            alt14=68;
                        }
                        else {
                            alt14=33;}
                    }
                    else {
                        alt14=68;}
                    }
                    break;
                default:
                    alt14=68;}

                }
                break;
            case 'r':
                {
                int LA14_55 = input.LA(3);

                if ( (LA14_55=='e') ) {
                    int LA14_106 = input.LA(4);

                    if ( (LA14_106=='a') ) {
                        int LA14_140 = input.LA(5);

                        if ( (LA14_140=='t') ) {
                            int LA14_174 = input.LA(6);

                            if ( (LA14_174=='e') ) {
                                int LA14_203 = input.LA(7);

                                if ( (LA14_203=='$'||(LA14_203>='0' && LA14_203<='9')||(LA14_203>='A' && LA14_203<='Z')||LA14_203=='_'||(LA14_203>='a' && LA14_203<='z')||(LA14_203>='\u00C0' && LA14_203<='\u00D6')||(LA14_203>='\u00D8' && LA14_203<='\u00F6')||(LA14_203>='\u00F8' && LA14_203<='\u1FFF')||(LA14_203>='\u3040' && LA14_203<='\u318F')||(LA14_203>='\u3300' && LA14_203<='\u337F')||(LA14_203>='\u3400' && LA14_203<='\u3D2D')||(LA14_203>='\u4E00' && LA14_203<='\u9FFF')||(LA14_203>='\uF900' && LA14_203<='\uFAFF')) ) {
                                    alt14=68;
                                }
                                else {
                                    alt14=21;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            default:
                alt14=68;}

        }
        else if ( (LA14_0=='#') ) {
            alt14=6;
        }
        else if ( (LA14_0=='E') ) {
            int LA14_7 = input.LA(2);

            if ( (LA14_7=='R') ) {
                int LA14_56 = input.LA(3);

                if ( (LA14_56=='R') ) {
                    int LA14_107 = input.LA(4);

                    if ( (LA14_107=='O') ) {
                        int LA14_141 = input.LA(5);

                        if ( (LA14_141=='R') ) {
                            int LA14_175 = input.LA(6);

                            if ( (LA14_175=='$'||(LA14_175>='0' && LA14_175<='9')||(LA14_175>='A' && LA14_175<='Z')||LA14_175=='_'||(LA14_175>='a' && LA14_175<='z')||(LA14_175>='\u00C0' && LA14_175<='\u00D6')||(LA14_175>='\u00D8' && LA14_175<='\u00F6')||(LA14_175>='\u00F8' && LA14_175<='\u1FFF')||(LA14_175>='\u3040' && LA14_175<='\u318F')||(LA14_175>='\u3300' && LA14_175<='\u337F')||(LA14_175>='\u3400' && LA14_175<='\u3D2D')||(LA14_175>='\u4E00' && LA14_175<='\u9FFF')||(LA14_175>='\uF900' && LA14_175<='\uFAFF')) ) {
                                alt14=68;
                            }
                            else {
                                alt14=8;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='W') ) {
            int LA14_8 = input.LA(2);

            if ( (LA14_8=='A') ) {
                int LA14_57 = input.LA(3);

                if ( (LA14_57=='R') ) {
                    int LA14_108 = input.LA(4);

                    if ( (LA14_108=='N') ) {
                        int LA14_142 = input.LA(5);

                        if ( (LA14_142=='I') ) {
                            int LA14_176 = input.LA(6);

                            if ( (LA14_176=='N') ) {
                                int LA14_205 = input.LA(7);

                                if ( (LA14_205=='G') ) {
                                    int LA14_228 = input.LA(8);

                                    if ( (LA14_228=='$'||(LA14_228>='0' && LA14_228<='9')||(LA14_228>='A' && LA14_228<='Z')||LA14_228=='_'||(LA14_228>='a' && LA14_228<='z')||(LA14_228>='\u00C0' && LA14_228<='\u00D6')||(LA14_228>='\u00D8' && LA14_228<='\u00F6')||(LA14_228>='\u00F8' && LA14_228<='\u1FFF')||(LA14_228>='\u3040' && LA14_228<='\u318F')||(LA14_228>='\u3300' && LA14_228<='\u337F')||(LA14_228>='\u3400' && LA14_228<='\u3D2D')||(LA14_228>='\u4E00' && LA14_228<='\u9FFF')||(LA14_228>='\uF900' && LA14_228<='\uFAFF')) ) {
                                        alt14=68;
                                    }
                                    else {
                                        alt14=9;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0==':') ) {
            int LA14_9 = input.LA(2);

            if ( (LA14_9==':') ) {
                alt14=16;
            }
            else {
                alt14=10;}
        }
        else if ( (LA14_0=='a') ) {
            int LA14_10 = input.LA(2);

            if ( (LA14_10=='r') ) {
                int LA14_60 = input.LA(3);

                if ( (LA14_60=='o') ) {
                    int LA14_109 = input.LA(4);

                    if ( (LA14_109=='u') ) {
                        int LA14_143 = input.LA(5);

                        if ( (LA14_143=='n') ) {
                            int LA14_177 = input.LA(6);

                            if ( (LA14_177=='d') ) {
                                int LA14_206 = input.LA(7);

                                if ( (LA14_206=='$'||(LA14_206>='0' && LA14_206<='9')||(LA14_206>='A' && LA14_206<='Z')||LA14_206=='_'||(LA14_206>='a' && LA14_206<='z')||(LA14_206>='\u00C0' && LA14_206<='\u00D6')||(LA14_206>='\u00D8' && LA14_206<='\u00F6')||(LA14_206>='\u00F8' && LA14_206<='\u1FFF')||(LA14_206>='\u3040' && LA14_206<='\u318F')||(LA14_206>='\u3300' && LA14_206<='\u337F')||(LA14_206>='\u3400' && LA14_206<='\u3D2D')||(LA14_206>='\u4E00' && LA14_206<='\u9FFF')||(LA14_206>='\uF900' && LA14_206<='\uFAFF')) ) {
                                    alt14=68;
                                }
                                else {
                                    alt14=11;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='(') ) {
            alt14=12;
        }
        else if ( (LA14_0==',') ) {
            alt14=13;
        }
        else if ( (LA14_0=='*') ) {
            alt14=14;
        }
        else if ( (LA14_0==')') ) {
            alt14=15;
        }
        else if ( (LA14_0=='p') ) {
            int LA14_15 = input.LA(2);

            if ( (LA14_15=='r') ) {
                int LA14_61 = input.LA(3);

                if ( (LA14_61=='i') ) {
                    int LA14_110 = input.LA(4);

                    if ( (LA14_110=='v') ) {
                        int LA14_144 = input.LA(5);

                        if ( (LA14_144=='a') ) {
                            int LA14_178 = input.LA(6);

                            if ( (LA14_178=='t') ) {
                                int LA14_207 = input.LA(7);

                                if ( (LA14_207=='e') ) {
                                    int LA14_230 = input.LA(8);

                                    if ( (LA14_230=='$'||(LA14_230>='0' && LA14_230<='9')||(LA14_230>='A' && LA14_230<='Z')||LA14_230=='_'||(LA14_230>='a' && LA14_230<='z')||(LA14_230>='\u00C0' && LA14_230<='\u00D6')||(LA14_230>='\u00D8' && LA14_230<='\u00F6')||(LA14_230>='\u00F8' && LA14_230<='\u1FFF')||(LA14_230>='\u3040' && LA14_230<='\u318F')||(LA14_230>='\u3300' && LA14_230<='\u337F')||(LA14_230>='\u3400' && LA14_230<='\u3D2D')||(LA14_230>='\u4E00' && LA14_230<='\u9FFF')||(LA14_230>='\uF900' && LA14_230<='\uFAFF')) ) {
                                        alt14=68;
                                    }
                                    else {
                                        alt14=17;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='J') ) {
            int LA14_16 = input.LA(2);

            if ( (LA14_16=='A') ) {
                int LA14_62 = input.LA(3);

                if ( (LA14_62=='V') ) {
                    int LA14_111 = input.LA(4);

                    if ( (LA14_111=='A') ) {
                        int LA14_145 = input.LA(5);

                        if ( (LA14_145=='$'||(LA14_145>='0' && LA14_145<='9')||(LA14_145>='A' && LA14_145<='Z')||LA14_145=='_'||(LA14_145>='a' && LA14_145<='z')||(LA14_145>='\u00C0' && LA14_145<='\u00D6')||(LA14_145>='\u00D8' && LA14_145<='\u00F6')||(LA14_145>='\u00F8' && LA14_145<='\u1FFF')||(LA14_145>='\u3040' && LA14_145<='\u318F')||(LA14_145>='\u3300' && LA14_145<='\u337F')||(LA14_145>='\u3400' && LA14_145<='\u3D2D')||(LA14_145>='\u4E00' && LA14_145<='\u9FFF')||(LA14_145>='\uF900' && LA14_145<='\uFAFF')) ) {
                            alt14=68;
                        }
                        else {
                            alt14=19;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='.') ) {
            alt14=20;
        }
        else if ( (LA14_0=='C') ) {
            int LA14_18 = input.LA(2);

            if ( (LA14_18=='o') ) {
                int LA14_63 = input.LA(3);

                if ( (LA14_63=='l') ) {
                    int LA14_112 = input.LA(4);

                    if ( (LA14_112=='l') ) {
                        int LA14_146 = input.LA(5);

                        if ( (LA14_146=='e') ) {
                            int LA14_180 = input.LA(6);

                            if ( (LA14_180=='c') ) {
                                int LA14_208 = input.LA(7);

                                if ( (LA14_208=='t') ) {
                                    int LA14_231 = input.LA(8);

                                    if ( (LA14_231=='i') ) {
                                        int LA14_248 = input.LA(9);

                                        if ( (LA14_248=='o') ) {
                                            int LA14_256 = input.LA(10);

                                            if ( (LA14_256=='n') ) {
                                                int LA14_262 = input.LA(11);

                                                if ( (LA14_262=='$'||(LA14_262>='0' && LA14_262<='9')||(LA14_262>='A' && LA14_262<='Z')||LA14_262=='_'||(LA14_262>='a' && LA14_262<='z')||(LA14_262>='\u00C0' && LA14_262<='\u00D6')||(LA14_262>='\u00D8' && LA14_262<='\u00F6')||(LA14_262>='\u00F8' && LA14_262<='\u1FFF')||(LA14_262>='\u3040' && LA14_262<='\u318F')||(LA14_262>='\u3300' && LA14_262<='\u337F')||(LA14_262>='\u3400' && LA14_262<='\u3D2D')||(LA14_262>='\u4E00' && LA14_262<='\u9FFF')||(LA14_262>='\uF900' && LA14_262<='\uFAFF')) ) {
                                                    alt14=68;
                                                }
                                                else {
                                                    alt14=22;}
                                            }
                                            else {
                                                alt14=68;}
                                        }
                                        else {
                                            alt14=68;}
                                    }
                                    else {
                                        alt14=68;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='L') ) {
            int LA14_19 = input.LA(2);

            if ( (LA14_19=='i') ) {
                int LA14_64 = input.LA(3);

                if ( (LA14_64=='s') ) {
                    int LA14_113 = input.LA(4);

                    if ( (LA14_113=='t') ) {
                        int LA14_147 = input.LA(5);

                        if ( (LA14_147=='$'||(LA14_147>='0' && LA14_147<='9')||(LA14_147>='A' && LA14_147<='Z')||LA14_147=='_'||(LA14_147>='a' && LA14_147<='z')||(LA14_147>='\u00C0' && LA14_147<='\u00D6')||(LA14_147>='\u00D8' && LA14_147<='\u00F6')||(LA14_147>='\u00F8' && LA14_147<='\u1FFF')||(LA14_147>='\u3040' && LA14_147<='\u318F')||(LA14_147>='\u3300' && LA14_147<='\u337F')||(LA14_147>='\u3400' && LA14_147<='\u3D2D')||(LA14_147>='\u4E00' && LA14_147<='\u9FFF')||(LA14_147>='\uF900' && LA14_147<='\uFAFF')) ) {
                            alt14=68;
                        }
                        else {
                            alt14=23;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='S') ) {
            int LA14_20 = input.LA(2);

            if ( (LA14_20=='e') ) {
                int LA14_65 = input.LA(3);

                if ( (LA14_65=='t') ) {
                    int LA14_114 = input.LA(4);

                    if ( (LA14_114=='$'||(LA14_114>='0' && LA14_114<='9')||(LA14_114>='A' && LA14_114<='Z')||LA14_114=='_'||(LA14_114>='a' && LA14_114<='z')||(LA14_114>='\u00C0' && LA14_114<='\u00D6')||(LA14_114>='\u00D8' && LA14_114<='\u00F6')||(LA14_114>='\u00F8' && LA14_114<='\u1FFF')||(LA14_114>='\u3040' && LA14_114<='\u318F')||(LA14_114>='\u3300' && LA14_114<='\u337F')||(LA14_114>='\u3400' && LA14_114<='\u3D2D')||(LA14_114>='\u4E00' && LA14_114<='\u9FFF')||(LA14_114>='\uF900' && LA14_114<='\uFAFF')) ) {
                        alt14=68;
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='l') ) {
            int LA14_21 = input.LA(2);

            if ( (LA14_21=='e') ) {
                int LA14_66 = input.LA(3);

                if ( (LA14_66=='t') ) {
                    int LA14_115 = input.LA(4);

                    if ( (LA14_115=='$'||(LA14_115>='0' && LA14_115<='9')||(LA14_115>='A' && LA14_115<='Z')||LA14_115=='_'||(LA14_115>='a' && LA14_115<='z')||(LA14_115>='\u00C0' && LA14_115<='\u00D6')||(LA14_115>='\u00D8' && LA14_115<='\u00F6')||(LA14_115>='\u00F8' && LA14_115<='\u1FFF')||(LA14_115>='\u3040' && LA14_115<='\u318F')||(LA14_115>='\u3300' && LA14_115<='\u337F')||(LA14_115>='\u3400' && LA14_115<='\u3D2D')||(LA14_115>='\u4E00' && LA14_115<='\u9FFF')||(LA14_115>='\uF900' && LA14_115<='\uFAFF')) ) {
                        alt14=68;
                    }
                    else {
                        alt14=25;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='=') ) {
            int LA14_22 = input.LA(2);

            if ( (LA14_22=='=') ) {
                alt14=39;
            }
            else {
                alt14=26;}
        }
        else if ( (LA14_0=='-') ) {
            int LA14_23 = input.LA(2);

            if ( (LA14_23=='>') ) {
                alt14=27;
            }
            else {
                alt14=46;}
        }
        else if ( (LA14_0=='?') ) {
            alt14=28;
        }
        else if ( (LA14_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA14_71 = input.LA(3);

                if ( (LA14_71=='u') ) {
                    int LA14_116 = input.LA(4);

                    if ( (LA14_116=='e') ) {
                        int LA14_150 = input.LA(5);

                        if ( (LA14_150=='$'||(LA14_150>='0' && LA14_150<='9')||(LA14_150>='A' && LA14_150<='Z')||LA14_150=='_'||(LA14_150>='a' && LA14_150<='z')||(LA14_150>='\u00C0' && LA14_150<='\u00D6')||(LA14_150>='\u00D8' && LA14_150<='\u00F6')||(LA14_150>='\u00F8' && LA14_150<='\u1FFF')||(LA14_150>='\u3040' && LA14_150<='\u318F')||(LA14_150>='\u3300' && LA14_150<='\u337F')||(LA14_150>='\u3400' && LA14_150<='\u3D2D')||(LA14_150>='\u4E00' && LA14_150<='\u9FFF')||(LA14_150>='\uF900' && LA14_150<='\uFAFF')) ) {
                            alt14=68;
                        }
                        else {
                            alt14=52;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            case 'h':
                {
                int LA14_72 = input.LA(3);

                if ( (LA14_72=='e') ) {
                    int LA14_117 = input.LA(4);

                    if ( (LA14_117=='n') ) {
                        int LA14_151 = input.LA(5);

                        if ( (LA14_151=='$'||(LA14_151>='0' && LA14_151<='9')||(LA14_151>='A' && LA14_151<='Z')||LA14_151=='_'||(LA14_151>='a' && LA14_151<='z')||(LA14_151>='\u00C0' && LA14_151<='\u00D6')||(LA14_151>='\u00D8' && LA14_151<='\u00F6')||(LA14_151>='\u00F8' && LA14_151<='\u1FFF')||(LA14_151>='\u3040' && LA14_151<='\u318F')||(LA14_151>='\u3300' && LA14_151<='\u337F')||(LA14_151>='\u3400' && LA14_151<='\u3D2D')||(LA14_151>='\u4E00' && LA14_151<='\u9FFF')||(LA14_151>='\uF900' && LA14_151<='\uFAFF')) ) {
                            alt14=68;
                        }
                        else {
                            alt14=29;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            case 'y':
                {
                int LA14_73 = input.LA(3);

                if ( (LA14_73=='p') ) {
                    int LA14_118 = input.LA(4);

                    if ( (LA14_118=='e') ) {
                        int LA14_152 = input.LA(5);

                        if ( (LA14_152=='S') ) {
                            int LA14_184 = input.LA(6);

                            if ( (LA14_184=='e') ) {
                                int LA14_209 = input.LA(7);

                                if ( (LA14_209=='l') ) {
                                    int LA14_232 = input.LA(8);

                                    if ( (LA14_232=='e') ) {
                                        int LA14_249 = input.LA(9);

                                        if ( (LA14_249=='c') ) {
                                            int LA14_257 = input.LA(10);

                                            if ( (LA14_257=='t') ) {
                                                int LA14_263 = input.LA(11);

                                                if ( (LA14_263=='$'||(LA14_263>='0' && LA14_263<='9')||(LA14_263>='A' && LA14_263<='Z')||LA14_263=='_'||(LA14_263>='a' && LA14_263<='z')||(LA14_263>='\u00C0' && LA14_263<='\u00D6')||(LA14_263>='\u00D8' && LA14_263<='\u00F6')||(LA14_263>='\u00F8' && LA14_263<='\u1FFF')||(LA14_263>='\u3040' && LA14_263<='\u318F')||(LA14_263>='\u3300' && LA14_263<='\u337F')||(LA14_263>='\u3400' && LA14_263<='\u3D2D')||(LA14_263>='\u4E00' && LA14_263<='\u9FFF')||(LA14_263>='\uF900' && LA14_263<='\uFAFF')) ) {
                                                    alt14=68;
                                                }
                                                else {
                                                    alt14=54;}
                                            }
                                            else {
                                                alt14=68;}
                                        }
                                        else {
                                            alt14=68;}
                                    }
                                    else {
                                        alt14=68;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            default:
                alt14=68;}

        }
        else if ( (LA14_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'w':
                {
                int LA14_74 = input.LA(3);

                if ( (LA14_74=='i') ) {
                    int LA14_119 = input.LA(4);

                    if ( (LA14_119=='t') ) {
                        int LA14_153 = input.LA(5);

                        if ( (LA14_153=='c') ) {
                            int LA14_185 = input.LA(6);

                            if ( (LA14_185=='h') ) {
                                int LA14_210 = input.LA(7);

                                if ( (LA14_210=='$'||(LA14_210>='0' && LA14_210<='9')||(LA14_210>='A' && LA14_210<='Z')||LA14_210=='_'||(LA14_210>='a' && LA14_210<='z')||(LA14_210>='\u00C0' && LA14_210<='\u00D6')||(LA14_210>='\u00D8' && LA14_210<='\u00F6')||(LA14_210>='\u00F8' && LA14_210<='\u1FFF')||(LA14_210>='\u3040' && LA14_210<='\u318F')||(LA14_210>='\u3300' && LA14_210<='\u337F')||(LA14_210>='\u3400' && LA14_210<='\u3D2D')||(LA14_210>='\u4E00' && LA14_210<='\u9FFF')||(LA14_210>='\uF900' && LA14_210<='\uFAFF')) ) {
                                    alt14=68;
                                }
                                else {
                                    alt14=31;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            case 'e':
                {
                int LA14_75 = input.LA(3);

                if ( (LA14_75=='l') ) {
                    int LA14_120 = input.LA(4);

                    if ( (LA14_120=='e') ) {
                        int LA14_154 = input.LA(5);

                        if ( (LA14_154=='c') ) {
                            int LA14_186 = input.LA(6);

                            if ( (LA14_186=='t') ) {
                                int LA14_211 = input.LA(7);

                                if ( (LA14_211=='F') ) {
                                    int LA14_234 = input.LA(8);

                                    if ( (LA14_234=='i') ) {
                                        int LA14_250 = input.LA(9);

                                        if ( (LA14_250=='r') ) {
                                            int LA14_258 = input.LA(10);

                                            if ( (LA14_258=='s') ) {
                                                int LA14_264 = input.LA(11);

                                                if ( (LA14_264=='t') ) {
                                                    int LA14_269 = input.LA(12);

                                                    if ( (LA14_269=='$'||(LA14_269>='0' && LA14_269<='9')||(LA14_269>='A' && LA14_269<='Z')||LA14_269=='_'||(LA14_269>='a' && LA14_269<='z')||(LA14_269>='\u00C0' && LA14_269<='\u00D6')||(LA14_269>='\u00D8' && LA14_269<='\u00F6')||(LA14_269>='\u00F8' && LA14_269<='\u1FFF')||(LA14_269>='\u3040' && LA14_269<='\u318F')||(LA14_269>='\u3300' && LA14_269<='\u337F')||(LA14_269>='\u3400' && LA14_269<='\u3D2D')||(LA14_269>='\u4E00' && LA14_269<='\u9FFF')||(LA14_269>='\uF900' && LA14_269<='\uFAFF')) ) {
                                                        alt14=68;
                                                    }
                                                    else {
                                                        alt14=57;}
                                                }
                                                else {
                                                    alt14=68;}
                                            }
                                            else {
                                                alt14=68;}
                                        }
                                        else {
                                            alt14=68;}
                                    }
                                    else {
                                        alt14=68;}
                                }
                                else if ( (LA14_211=='$'||(LA14_211>='0' && LA14_211<='9')||(LA14_211>='A' && LA14_211<='E')||(LA14_211>='G' && LA14_211<='Z')||LA14_211=='_'||(LA14_211>='a' && LA14_211<='z')||(LA14_211>='\u00C0' && LA14_211<='\u00D6')||(LA14_211>='\u00D8' && LA14_211<='\u00F6')||(LA14_211>='\u00F8' && LA14_211<='\u1FFF')||(LA14_211>='\u3040' && LA14_211<='\u318F')||(LA14_211>='\u3300' && LA14_211<='\u337F')||(LA14_211>='\u3400' && LA14_211<='\u3D2D')||(LA14_211>='\u4E00' && LA14_211<='\u9FFF')||(LA14_211>='\uF900' && LA14_211<='\uFAFF')) ) {
                                    alt14=68;
                                }
                                else {
                                    alt14=56;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            case 'o':
                {
                int LA14_76 = input.LA(3);

                if ( (LA14_76=='r') ) {
                    int LA14_121 = input.LA(4);

                    if ( (LA14_121=='t') ) {
                        int LA14_155 = input.LA(5);

                        if ( (LA14_155=='B') ) {
                            int LA14_187 = input.LA(6);

                            if ( (LA14_187=='y') ) {
                                int LA14_212 = input.LA(7);

                                if ( (LA14_212=='$'||(LA14_212>='0' && LA14_212<='9')||(LA14_212>='A' && LA14_212<='Z')||LA14_212=='_'||(LA14_212>='a' && LA14_212<='z')||(LA14_212>='\u00C0' && LA14_212<='\u00D6')||(LA14_212>='\u00D8' && LA14_212<='\u00F6')||(LA14_212>='\u00F8' && LA14_212<='\u1FFF')||(LA14_212>='\u3040' && LA14_212<='\u318F')||(LA14_212>='\u3300' && LA14_212<='\u337F')||(LA14_212>='\u3400' && LA14_212<='\u3D2D')||(LA14_212>='\u4E00' && LA14_212<='\u9FFF')||(LA14_212>='\uF900' && LA14_212<='\uFAFF')) ) {
                                    alt14=68;
                                }
                                else {
                                    alt14=61;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            default:
                alt14=68;}

        }
        else if ( (LA14_0=='{') ) {
            alt14=32;
        }
        else if ( (LA14_0=='d') ) {
            int LA14_28 = input.LA(2);

            if ( (LA14_28=='e') ) {
                int LA14_77 = input.LA(3);

                if ( (LA14_77=='f') ) {
                    int LA14_122 = input.LA(4);

                    if ( (LA14_122=='a') ) {
                        int LA14_156 = input.LA(5);

                        if ( (LA14_156=='u') ) {
                            int LA14_188 = input.LA(6);

                            if ( (LA14_188=='l') ) {
                                int LA14_213 = input.LA(7);

                                if ( (LA14_213=='t') ) {
                                    int LA14_237 = input.LA(8);

                                    if ( (LA14_237=='$'||(LA14_237>='0' && LA14_237<='9')||(LA14_237>='A' && LA14_237<='Z')||LA14_237=='_'||(LA14_237>='a' && LA14_237<='z')||(LA14_237>='\u00C0' && LA14_237<='\u00D6')||(LA14_237>='\u00D8' && LA14_237<='\u00F6')||(LA14_237>='\u00F8' && LA14_237<='\u1FFF')||(LA14_237>='\u3040' && LA14_237<='\u318F')||(LA14_237>='\u3300' && LA14_237<='\u337F')||(LA14_237>='\u3400' && LA14_237<='\u3D2D')||(LA14_237>='\u4E00' && LA14_237<='\u9FFF')||(LA14_237>='\uF900' && LA14_237<='\uFAFF')) ) {
                                        alt14=68;
                                    }
                                    else {
                                        alt14=34;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='}') ) {
            alt14=35;
        }
        else if ( (LA14_0=='|') ) {
            int LA14_30 = input.LA(2);

            if ( (LA14_30=='|') ) {
                alt14=36;
            }
            else {
                alt14=63;}
        }
        else if ( (LA14_0=='&') ) {
            alt14=37;
        }
        else if ( (LA14_0=='!') ) {
            int LA14_32 = input.LA(2);

            if ( (LA14_32=='=') ) {
                alt14=40;
            }
            else {
                alt14=48;}
        }
        else if ( (LA14_0=='>') ) {
            int LA14_33 = input.LA(2);

            if ( (LA14_33=='=') ) {
                alt14=41;
            }
            else {
                alt14=43;}
        }
        else if ( (LA14_0=='<') ) {
            int LA14_34 = input.LA(2);

            if ( (LA14_34=='=') ) {
                alt14=42;
            }
            else {
                alt14=44;}
        }
        else if ( (LA14_0=='+') ) {
            alt14=45;
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt14=71;
                }
                break;
            case '*':
                {
                alt14=70;
                }
                break;
            default:
                alt14=47;}

        }
        else if ( (LA14_0=='G') ) {
            int LA14_37 = input.LA(2);

            if ( (LA14_37=='L') ) {
                int LA14_89 = input.LA(3);

                if ( (LA14_89=='O') ) {
                    int LA14_123 = input.LA(4);

                    if ( (LA14_123=='B') ) {
                        int LA14_157 = input.LA(5);

                        if ( (LA14_157=='A') ) {
                            int LA14_189 = input.LA(6);

                            if ( (LA14_189=='L') ) {
                                int LA14_214 = input.LA(7);

                                if ( (LA14_214=='V') ) {
                                    int LA14_238 = input.LA(8);

                                    if ( (LA14_238=='A') ) {
                                        int LA14_252 = input.LA(9);

                                        if ( (LA14_252=='R') ) {
                                            int LA14_259 = input.LA(10);

                                            if ( (LA14_259=='$'||(LA14_259>='0' && LA14_259<='9')||(LA14_259>='A' && LA14_259<='Z')||LA14_259=='_'||(LA14_259>='a' && LA14_259<='z')||(LA14_259>='\u00C0' && LA14_259<='\u00D6')||(LA14_259>='\u00D8' && LA14_259<='\u00F6')||(LA14_259>='\u00F8' && LA14_259<='\u1FFF')||(LA14_259>='\u3040' && LA14_259<='\u318F')||(LA14_259>='\u3300' && LA14_259<='\u337F')||(LA14_259>='\u3400' && LA14_259<='\u3D2D')||(LA14_259>='\u4E00' && LA14_259<='\u9FFF')||(LA14_259>='\uF900' && LA14_259<='\uFAFF')) ) {
                                                alt14=68;
                                            }
                                            else {
                                                alt14=49;}
                                        }
                                        else {
                                            alt14=68;}
                                    }
                                    else {
                                        alt14=68;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
            }
            else {
                alt14=68;}
        }
        else if ( (LA14_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'e':
                {
                int LA14_90 = input.LA(3);

                if ( (LA14_90=='w') ) {
                    int LA14_124 = input.LA(4);

                    if ( (LA14_124=='$'||(LA14_124>='0' && LA14_124<='9')||(LA14_124>='A' && LA14_124<='Z')||LA14_124=='_'||(LA14_124>='a' && LA14_124<='z')||(LA14_124>='\u00C0' && LA14_124<='\u00D6')||(LA14_124>='\u00D8' && LA14_124<='\u00F6')||(LA14_124>='\u00F8' && LA14_124<='\u1FFF')||(LA14_124>='\u3040' && LA14_124<='\u318F')||(LA14_124>='\u3300' && LA14_124<='\u337F')||(LA14_124>='\u3400' && LA14_124<='\u3D2D')||(LA14_124>='\u4E00' && LA14_124<='\u9FFF')||(LA14_124>='\uF900' && LA14_124<='\uFAFF')) ) {
                        alt14=68;
                    }
                    else {
                        alt14=50;}
                }
                else {
                    alt14=68;}
                }
                break;
            case 'u':
                {
                int LA14_91 = input.LA(3);

                if ( (LA14_91=='l') ) {
                    int LA14_125 = input.LA(4);

                    if ( (LA14_125=='l') ) {
                        int LA14_159 = input.LA(5);

                        if ( (LA14_159=='$'||(LA14_159>='0' && LA14_159<='9')||(LA14_159>='A' && LA14_159<='Z')||LA14_159=='_'||(LA14_159>='a' && LA14_159<='z')||(LA14_159>='\u00C0' && LA14_159<='\u00D6')||(LA14_159>='\u00D8' && LA14_159<='\u00F6')||(LA14_159>='\u00F8' && LA14_159<='\u1FFF')||(LA14_159>='\u3040' && LA14_159<='\u318F')||(LA14_159>='\u3300' && LA14_159<='\u337F')||(LA14_159>='\u3400' && LA14_159<='\u3D2D')||(LA14_159>='\u4E00' && LA14_159<='\u9FFF')||(LA14_159>='\uF900' && LA14_159<='\uFAFF')) ) {
                            alt14=68;
                        }
                        else {
                            alt14=53;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            case 'o':
                {
                int LA14_92 = input.LA(3);

                if ( (LA14_92=='t') ) {
                    int LA14_126 = input.LA(4);

                    if ( (LA14_126=='E') ) {
                        int LA14_160 = input.LA(5);

                        if ( (LA14_160=='x') ) {
                            int LA14_191 = input.LA(6);

                            if ( (LA14_191=='i') ) {
                                int LA14_215 = input.LA(7);

                                if ( (LA14_215=='s') ) {
                                    int LA14_239 = input.LA(8);

                                    if ( (LA14_239=='t') ) {
                                        int LA14_253 = input.LA(9);

                                        if ( (LA14_253=='s') ) {
                                            int LA14_260 = input.LA(10);

                                            if ( (LA14_260=='$'||(LA14_260>='0' && LA14_260<='9')||(LA14_260>='A' && LA14_260<='Z')||LA14_260=='_'||(LA14_260>='a' && LA14_260<='z')||(LA14_260>='\u00C0' && LA14_260<='\u00D6')||(LA14_260>='\u00D8' && LA14_260<='\u00F6')||(LA14_260>='\u00F8' && LA14_260<='\u1FFF')||(LA14_260>='\u3040' && LA14_260<='\u318F')||(LA14_260>='\u3300' && LA14_260<='\u337F')||(LA14_260>='\u3400' && LA14_260<='\u3D2D')||(LA14_260>='\u4E00' && LA14_260<='\u9FFF')||(LA14_260>='\uF900' && LA14_260<='\uFAFF')) ) {
                                                alt14=68;
                                            }
                                            else {
                                                alt14=60;}
                                        }
                                        else {
                                            alt14=68;}
                                    }
                                    else {
                                        alt14=68;}
                                }
                                else {
                                    alt14=68;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            default:
                alt14=68;}

        }
        else if ( (LA14_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA14_93 = input.LA(3);

                if ( (LA14_93=='l') ) {
                    int LA14_127 = input.LA(4);

                    if ( (LA14_127=='s') ) {
                        int LA14_161 = input.LA(5);

                        if ( (LA14_161=='e') ) {
                            int LA14_192 = input.LA(6);

                            if ( (LA14_192=='$'||(LA14_192>='0' && LA14_192<='9')||(LA14_192>='A' && LA14_192<='Z')||LA14_192=='_'||(LA14_192>='a' && LA14_192<='z')||(LA14_192>='\u00C0' && LA14_192<='\u00D6')||(LA14_192>='\u00D8' && LA14_192<='\u00F6')||(LA14_192>='\u00F8' && LA14_192<='\u1FFF')||(LA14_192>='\u3040' && LA14_192<='\u318F')||(LA14_192>='\u3300' && LA14_192<='\u337F')||(LA14_192>='\u3400' && LA14_192<='\u3D2D')||(LA14_192>='\u4E00' && LA14_192<='\u9FFF')||(LA14_192>='\uF900' && LA14_192<='\uFAFF')) ) {
                                alt14=68;
                            }
                            else {
                                alt14=51;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            case 'o':
                {
                int LA14_94 = input.LA(3);

                if ( (LA14_94=='r') ) {
                    int LA14_128 = input.LA(4);

                    if ( (LA14_128=='A') ) {
                        int LA14_162 = input.LA(5);

                        if ( (LA14_162=='l') ) {
                            int LA14_193 = input.LA(6);

                            if ( (LA14_193=='l') ) {
                                int LA14_217 = input.LA(7);

                                if ( (LA14_217=='$'||(LA14_217>='0' && LA14_217<='9')||(LA14_217>='A' && LA14_217<='Z')||LA14_217=='_'||(LA14_217>='a' && LA14_217<='z')||(LA14_217>='\u00C0' && LA14_217<='\u00D6')||(LA14_217>='\u00D8' && LA14_217<='\u00F6')||(LA14_217>='\u00F8' && LA14_217<='\u1FFF')||(LA14_217>='\u3040' && LA14_217<='\u318F')||(LA14_217>='\u3300' && LA14_217<='\u337F')||(LA14_217>='\u3400' && LA14_217<='\u3D2D')||(LA14_217>='\u4E00' && LA14_217<='\u9FFF')||(LA14_217>='\uF900' && LA14_217<='\uFAFF')) ) {
                                    alt14=68;
                                }
                                else {
                                    alt14=62;}
                            }
                            else {
                                alt14=68;}
                        }
                        else {
                            alt14=68;}
                    }
                    else {
                        alt14=68;}
                }
                else {
                    alt14=68;}
                }
                break;
            default:
                alt14=68;}

        }
        else if ( (LA14_0=='[') ) {
            alt14=64;
        }
        else if ( (LA14_0==']') ) {
            alt14=65;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=66;
        }
        else if ( (LA14_0=='\"'||LA14_0=='\'') ) {
            alt14=67;
        }
        else if ( (LA14_0=='$'||(LA14_0>='A' && LA14_0<='B')||LA14_0=='D'||LA14_0=='F'||(LA14_0>='H' && LA14_0<='I')||LA14_0=='K'||(LA14_0>='M' && LA14_0<='R')||(LA14_0>='T' && LA14_0<='V')||(LA14_0>='X' && LA14_0<='Z')||(LA14_0>='^' && LA14_0<='_')||LA14_0=='b'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||LA14_0=='m'||LA14_0=='o'||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')||(LA14_0>='\u00C0' && LA14_0<='\u00D6')||(LA14_0>='\u00D8' && LA14_0<='\u00F6')||(LA14_0>='\u00F8' && LA14_0<='\u1FFF')||(LA14_0>='\u3040' && LA14_0<='\u318F')||(LA14_0>='\u3300' && LA14_0<='\u337F')||(LA14_0>='\u3400' && LA14_0<='\u3D2D')||(LA14_0>='\u4E00' && LA14_0<='\u9FFF')||(LA14_0>='\uF900' && LA14_0<='\uFAFF')) ) {
            alt14=68;
        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||(LA14_0>='\f' && LA14_0<='\r')||LA14_0==' ') ) {
            alt14=69;
        }
        else if ( (LA14_0=='\u00AB') ) {
            alt14=72;
        }
        else if ( (LA14_0=='\u00BB') ) {
            alt14=73;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | IntLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT | XPAND_TAG_OPEN | XPAND_TAG_CLOSE );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:10: T18
                {
                mT18(); 

                }
                break;
            case 2 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:14: T19
                {
                mT19(); 

                }
                break;
            case 3 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:18: T20
                {
                mT20(); 

                }
                break;
            case 4 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:22: T21
                {
                mT21(); 

                }
                break;
            case 5 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:26: T22
                {
                mT22(); 

                }
                break;
            case 6 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:30: T23
                {
                mT23(); 

                }
                break;
            case 7 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:34: T24
                {
                mT24(); 

                }
                break;
            case 8 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:38: T25
                {
                mT25(); 

                }
                break;
            case 9 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:42: T26
                {
                mT26(); 

                }
                break;
            case 10 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:46: T27
                {
                mT27(); 

                }
                break;
            case 11 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:50: T28
                {
                mT28(); 

                }
                break;
            case 12 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:54: T29
                {
                mT29(); 

                }
                break;
            case 13 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:58: T30
                {
                mT30(); 

                }
                break;
            case 14 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:62: T31
                {
                mT31(); 

                }
                break;
            case 15 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:66: T32
                {
                mT32(); 

                }
                break;
            case 16 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:70: T33
                {
                mT33(); 

                }
                break;
            case 17 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:74: T34
                {
                mT34(); 

                }
                break;
            case 18 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:78: T35
                {
                mT35(); 

                }
                break;
            case 19 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:82: T36
                {
                mT36(); 

                }
                break;
            case 20 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:86: T37
                {
                mT37(); 

                }
                break;
            case 21 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:90: T38
                {
                mT38(); 

                }
                break;
            case 22 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:94: T39
                {
                mT39(); 

                }
                break;
            case 23 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:98: T40
                {
                mT40(); 

                }
                break;
            case 24 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:102: T41
                {
                mT41(); 

                }
                break;
            case 25 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:106: T42
                {
                mT42(); 

                }
                break;
            case 26 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:110: T43
                {
                mT43(); 

                }
                break;
            case 27 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:114: T44
                {
                mT44(); 

                }
                break;
            case 28 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:118: T45
                {
                mT45(); 

                }
                break;
            case 29 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:122: T46
                {
                mT46(); 

                }
                break;
            case 30 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:126: T47
                {
                mT47(); 

                }
                break;
            case 31 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:130: T48
                {
                mT48(); 

                }
                break;
            case 32 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:134: T49
                {
                mT49(); 

                }
                break;
            case 33 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:138: T50
                {
                mT50(); 

                }
                break;
            case 34 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:142: T51
                {
                mT51(); 

                }
                break;
            case 35 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:146: T52
                {
                mT52(); 

                }
                break;
            case 36 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:150: T53
                {
                mT53(); 

                }
                break;
            case 37 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:154: T54
                {
                mT54(); 

                }
                break;
            case 38 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:158: T55
                {
                mT55(); 

                }
                break;
            case 39 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:162: T56
                {
                mT56(); 

                }
                break;
            case 40 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:166: T57
                {
                mT57(); 

                }
                break;
            case 41 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:170: T58
                {
                mT58(); 

                }
                break;
            case 42 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:174: T59
                {
                mT59(); 

                }
                break;
            case 43 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:178: T60
                {
                mT60(); 

                }
                break;
            case 44 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:182: T61
                {
                mT61(); 

                }
                break;
            case 45 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:186: T62
                {
                mT62(); 

                }
                break;
            case 46 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:190: T63
                {
                mT63(); 

                }
                break;
            case 47 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:194: T64
                {
                mT64(); 

                }
                break;
            case 48 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:198: T65
                {
                mT65(); 

                }
                break;
            case 49 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:202: T66
                {
                mT66(); 

                }
                break;
            case 50 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:206: T67
                {
                mT67(); 

                }
                break;
            case 51 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:210: T68
                {
                mT68(); 

                }
                break;
            case 52 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:214: T69
                {
                mT69(); 

                }
                break;
            case 53 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:218: T70
                {
                mT70(); 

                }
                break;
            case 54 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:222: T71
                {
                mT71(); 

                }
                break;
            case 55 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:226: T72
                {
                mT72(); 

                }
                break;
            case 56 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:230: T73
                {
                mT73(); 

                }
                break;
            case 57 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:234: T74
                {
                mT74(); 

                }
                break;
            case 58 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:238: T75
                {
                mT75(); 

                }
                break;
            case 59 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:242: T76
                {
                mT76(); 

                }
                break;
            case 60 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:246: T77
                {
                mT77(); 

                }
                break;
            case 61 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:250: T78
                {
                mT78(); 

                }
                break;
            case 62 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:254: T79
                {
                mT79(); 

                }
                break;
            case 63 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:258: T80
                {
                mT80(); 

                }
                break;
            case 64 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:262: T81
                {
                mT81(); 

                }
                break;
            case 65 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:266: T82
                {
                mT82(); 

                }
                break;
            case 66 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:270: IntLiteral
                {
                mIntLiteral(); 

                }
                break;
            case 67 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:281: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 68 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:295: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 69 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:306: WS
                {
                mWS(); 

                }
                break;
            case 70 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:309: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 71 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:317: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 72 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:330: XPAND_TAG_OPEN
                {
                mXPAND_TAG_OPEN(); 

                }
                break;
            case 73 :
                // src/org/eclipse/internal/xtend/xtend/parser/Xtend.g:1:345: XPAND_TAG_CLOSE
                {
                mXPAND_TAG_CLOSE(); 

                }
                break;

        }

    }


 

}