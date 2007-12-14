/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
// $ANTLR 3.0 ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g 2007-08-13 15:52:06
 	
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
    public static final int Tokens=82;
    public static final int T53=53;
    public static final int T60=60;
    public static final int T31=31;
    public static final int OctalEscape=9;
    public static final int T49=49;
    public static final int T27=27;
    public static final int T52=52;
    public static final int XPAND_TAG_CLOSE=17;
    public static final int T30=30;
    public XtendLexer() {;} 
    public XtendLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g"; }

    // $ANTLR start T18
    public void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:13:7: ( 'import' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:13:7: 'import'
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
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:14:7: ( ';' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:14:7: ';'
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
    public void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:15:7: ( 'extension' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:15:7: 'extension'
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
    public void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:16:7: ( 'reexport' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:16:7: 'reexport'
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
    public void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:17:7: ( 'context' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:17:7: 'context'
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
    public void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:18:7: ( 'if' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:18:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:19:7: ( 'ERROR' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:19:7: 'ERROR'
            {
            match("ERROR"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:20:7: ( 'WARNING' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:20:7: 'WARNING'
            {
            match("WARNING"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:21:7: ( ':' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:21:7: ':'
            {
            match(':'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:22:7: ( 'around' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:22:7: 'around'
            {
            match("around"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:23:7: ( '(' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:23:7: '('
            {
            match('('); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:24:7: ( ',' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:24:7: ','
            {
            match(','); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:25:7: ( '*' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:25:7: '*'
            {
            match('*'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:26:7: ( ')' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:26:7: ')'
            {
            match(')'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:27:7: ( '::' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:27:7: '::'
            {
            match("::"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:28:7: ( 'private' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:28:7: 'private'
            {
            match("private"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:29:7: ( 'cached' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:29:7: 'cached'
            {
            match("cached"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:30:7: ( 'JAVA' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:30:7: 'JAVA'
            {
            match("JAVA"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:31:7: ( '.' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:31:7: '.'
            {
            match('.'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:32:7: ( 'create' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:32:7: 'create'
            {
            match("create"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:33:7: ( 'Collection' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:33:7: 'Collection'
            {
            match("Collection"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:34:7: ( 'List' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:34:7: 'List'
            {
            match("List"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:35:7: ( 'Set' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:35:7: 'Set'
            {
            match("Set"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:36:7: ( 'let' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:36:7: 'let'
            {
            match("let"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:37:7: ( '=' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:37:7: '='
            {
            match('='); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:38:7: ( '->' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:38:7: '->'
            {
            match("->"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:39:7: ( '?' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:39:7: '?'
            {
            match('?'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:40:7: ( 'then' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:40:7: 'then'
            {
            match("then"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:41:7: ( 'else' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:41:7: 'else'
            {
            match("else"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:42:7: ( 'switch' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:42:7: 'switch'
            {
            match("switch"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:43:7: ( '{' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:43:7: '{'
            {
            match('{'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:44:7: ( 'case' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:44:7: 'case'
            {
            match("case"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:45:7: ( 'default' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:45:7: 'default'
            {
            match("default"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:46:7: ( '}' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:46:7: '}'
            {
            match('}'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:47:7: ( '||' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:47:7: '||'
            {
            match("||"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:48:7: ( '&&' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:48:7: '&&'
            {
            match("&&"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:49:7: ( 'implies' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:49:7: 'implies'
            {
            match("implies"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:50:7: ( '==' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:50:7: '=='
            {
            match("=="); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:51:7: ( '!=' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:51:7: '!='
            {
            match("!="); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:52:7: ( '>=' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:52:7: '>='
            {
            match(">="); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:53:7: ( '<=' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:53:7: '<='
            {
            match("<="); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:54:7: ( '>' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:54:7: '>'
            {
            match('>'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:55:7: ( '<' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:55:7: '<'
            {
            match('<'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:56:7: ( '+' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:56:7: '+'
            {
            match('+'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:57:7: ( '-' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:57:7: '-'
            {
            match('-'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:58:7: ( '/' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:58:7: '/'
            {
            match('/'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:59:7: ( '!' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:59:7: '!'
            {
            match('!'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:60:7: ( 'GLOBALVAR' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:60:7: 'GLOBALVAR'
            {
            match("GLOBALVAR"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:61:7: ( 'new' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:61:7: 'new'
            {
            match("new"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:62:7: ( 'false' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:62:7: 'false'
            {
            match("false"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:63:7: ( 'true' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:63:7: 'true'
            {
            match("true"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:64:7: ( 'null' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:64:7: 'null'
            {
            match("null"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:65:7: ( 'typeSelect' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:65:7: 'typeSelect'
            {
            match("typeSelect"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:66:7: ( 'collect' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:66:7: 'collect'
            {
            match("collect"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:7: ( 'select' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:67:7: 'select'
            {
            match("select"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:68:7: ( 'selectFirst' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:68:7: 'selectFirst'
            {
            match("selectFirst"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:69:7: ( 'reject' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:69:7: 'reject'
            {
            match("reject"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:70:7: ( 'exists' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:70:7: 'exists'
            {
            match("exists"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:71:7: ( 'notExists' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:71:7: 'notExists'
            {
            match("notExists"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:72:7: ( 'sortBy' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:72:7: 'sortBy'
            {
            match("sortBy"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:73:7: ( 'forAll' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:73:7: 'forAll'
            {
            match("forAll"); 


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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:74:7: ( '|' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:74:7: '|'
            {
            match('|'); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:75:7: ( '[' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:75:7: '['
            {
            match('['); 

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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:76:7: ( ']' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:76:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start IntLiteral
    public void mIntLiteral() throws RecognitionException {
        try {
            int _type = IntLiteral;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:284:14: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:284:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:284:14: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:284:15: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:284:21: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:284:30: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:284:30: '0' .. '9'
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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:287:8: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' | '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
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
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:287:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:287:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
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
                    	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:287:14: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:287:31: ~ ( '\\\\' | '\"' )
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
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:288:8: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
                    {
                    match('\''); 
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:288:13: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
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
                    	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:288:15: EscapeSequence
                    	    {
                    	    mEscapeSequence(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:288:32: ~ ( '\\'' | '\\\\' )
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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:293:9: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
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
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:293:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:294:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:295:9: OctalEscape
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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:300:9: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:300:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:300:14: ( '0' .. '3' )
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:300:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:300:25: ( '0' .. '7' )
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:300:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:300:36: ( '0' .. '7' )
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:300:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:301:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:301:14: ( '0' .. '7' )
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:301:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:301:25: ( '0' .. '7' )
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:301:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:302:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:302:14: ( '0' .. '7' )
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:302:15: '0' .. '7'
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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:307:9: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:307:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:310:12: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:310:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
    public void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:313:9: ( ( '^' )? Letter ( Letter | JavaIDDigit )* )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:313:9: ( '^' )? Letter ( Letter | JavaIDDigit )*
            {
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:313:9: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:313:10: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            mLetter(); 
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:313:23: ( Letter | JavaIDDigit )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='$'||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')||(LA9_0>='\u00C0' && LA9_0<='\u00D6')||(LA9_0>='\u00D8' && LA9_0<='\u00F6')||(LA9_0>='\u00F8' && LA9_0<='\u1FFF')||(LA9_0>='\u3040' && LA9_0<='\u318F')||(LA9_0>='\u3300' && LA9_0<='\u337F')||(LA9_0>='\u3400' && LA9_0<='\u3D2D')||(LA9_0>='\u4E00' && LA9_0<='\u9FFF')||(LA9_0>='\uF900' && LA9_0<='\uFAFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:
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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:318:8: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:
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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:335:8: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:
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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:352:8: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:352:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:356:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:356:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:356:14: ( options {greedy=false; } : . )*
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
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:356:42: .
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
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:360:7: ( '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF ) )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:360:7: '//' (~ ( '\\n' | '\\r' ) )* ( ( '\\r' )? '\\n' | EOF )
            {
            match("//"); 

            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:360:12: (~ ( '\\n' | '\\r' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFE')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:360:12: ~ ( '\\n' | '\\r' )
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

            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:360:26: ( ( '\\r' )? '\\n' | EOF )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            else {
                alt13=2;}
            switch (alt13) {
                case 1 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:360:27: ( '\\r' )? '\\n'
                    {
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:360:27: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:360:27: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;
                case 2 :
                    // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:360:38: EOF
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
    public void mXPAND_TAG_OPEN() throws RecognitionException {
        try {
            int _type = XPAND_TAG_OPEN;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:365:4: ( '\\u00AB' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:365:4: '\\u00AB'
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
    public void mXPAND_TAG_CLOSE() throws RecognitionException {
        try {
            int _type = XPAND_TAG_CLOSE;
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:367:4: ( '\\u00BB' )
            // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:367:4: '\\u00BB'
            {
            match('\u00BB'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end XPAND_TAG_CLOSE

    public void mTokens() throws RecognitionException {
        // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:10: ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | IntLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT | XPAND_TAG_OPEN | XPAND_TAG_CLOSE )
        int alt14=72;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'f':
                {
                int LA14_47 = input.LA(3);

                if ( (LA14_47=='$'||(LA14_47>='0' && LA14_47<='9')||(LA14_47>='A' && LA14_47<='Z')||LA14_47=='_'||(LA14_47>='a' && LA14_47<='z')||(LA14_47>='\u00C0' && LA14_47<='\u00D6')||(LA14_47>='\u00D8' && LA14_47<='\u00F6')||(LA14_47>='\u00F8' && LA14_47<='\u1FFF')||(LA14_47>='\u3040' && LA14_47<='\u318F')||(LA14_47>='\u3300' && LA14_47<='\u337F')||(LA14_47>='\u3400' && LA14_47<='\u3D2D')||(LA14_47>='\u4E00' && LA14_47<='\u9FFF')||(LA14_47>='\uF900' && LA14_47<='\uFAFF')) ) {
                    alt14=67;
                }
                else {
                    alt14=6;}
                }
                break;
            case 'm':
                {
                int LA14_48 = input.LA(3);

                if ( (LA14_48=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA14_128 = input.LA(5);

                        if ( (LA14_128=='r') ) {
                            int LA14_162 = input.LA(6);

                            if ( (LA14_162=='t') ) {
                                int LA14_193 = input.LA(7);

                                if ( (LA14_193=='$'||(LA14_193>='0' && LA14_193<='9')||(LA14_193>='A' && LA14_193<='Z')||LA14_193=='_'||(LA14_193>='a' && LA14_193<='z')||(LA14_193>='\u00C0' && LA14_193<='\u00D6')||(LA14_193>='\u00D8' && LA14_193<='\u00F6')||(LA14_193>='\u00F8' && LA14_193<='\u1FFF')||(LA14_193>='\u3040' && LA14_193<='\u318F')||(LA14_193>='\u3300' && LA14_193<='\u337F')||(LA14_193>='\u3400' && LA14_193<='\u3D2D')||(LA14_193>='\u4E00' && LA14_193<='\u9FFF')||(LA14_193>='\uF900' && LA14_193<='\uFAFF')) ) {
                                    alt14=67;
                                }
                                else {
                                    alt14=1;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                        }
                        break;
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
                                        alt14=67;
                                    }
                                    else {
                                        alt14=37;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                        }
                        break;
                    default:
                        alt14=67;}

                }
                else {
                    alt14=67;}
                }
                break;
            default:
                alt14=67;}

        }
        else if ( (LA14_0==';') ) {
            alt14=2;
        }
        else if ( (LA14_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'x':
                {
                switch ( input.LA(3) ) {
                case 'i':
                    {
                    int LA14_96 = input.LA(4);

                    if ( (LA14_96=='s') ) {
                        int LA14_130 = input.LA(5);

                        if ( (LA14_130=='t') ) {
                            int LA14_164 = input.LA(6);

                            if ( (LA14_164=='s') ) {
                                int LA14_195 = input.LA(7);

                                if ( (LA14_195=='$'||(LA14_195>='0' && LA14_195<='9')||(LA14_195>='A' && LA14_195<='Z')||LA14_195=='_'||(LA14_195>='a' && LA14_195<='z')||(LA14_195>='\u00C0' && LA14_195<='\u00D6')||(LA14_195>='\u00D8' && LA14_195<='\u00F6')||(LA14_195>='\u00F8' && LA14_195<='\u1FFF')||(LA14_195>='\u3040' && LA14_195<='\u318F')||(LA14_195>='\u3300' && LA14_195<='\u337F')||(LA14_195>='\u3400' && LA14_195<='\u3D2D')||(LA14_195>='\u4E00' && LA14_195<='\u9FFF')||(LA14_195>='\uF900' && LA14_195<='\uFAFF')) ) {
                                    alt14=67;
                                }
                                else {
                                    alt14=58;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                    }
                    break;
                case 't':
                    {
                    int LA14_97 = input.LA(4);

                    if ( (LA14_97=='e') ) {
                        int LA14_131 = input.LA(5);

                        if ( (LA14_131=='n') ) {
                            int LA14_165 = input.LA(6);

                            if ( (LA14_165=='s') ) {
                                int LA14_196 = input.LA(7);

                                if ( (LA14_196=='i') ) {
                                    int LA14_220 = input.LA(8);

                                    if ( (LA14_220=='o') ) {
                                        int LA14_241 = input.LA(9);

                                        if ( (LA14_241=='n') ) {
                                            int LA14_253 = input.LA(10);

                                            if ( (LA14_253=='$'||(LA14_253>='0' && LA14_253<='9')||(LA14_253>='A' && LA14_253<='Z')||LA14_253=='_'||(LA14_253>='a' && LA14_253<='z')||(LA14_253>='\u00C0' && LA14_253<='\u00D6')||(LA14_253>='\u00D8' && LA14_253<='\u00F6')||(LA14_253>='\u00F8' && LA14_253<='\u1FFF')||(LA14_253>='\u3040' && LA14_253<='\u318F')||(LA14_253>='\u3300' && LA14_253<='\u337F')||(LA14_253>='\u3400' && LA14_253<='\u3D2D')||(LA14_253>='\u4E00' && LA14_253<='\u9FFF')||(LA14_253>='\uF900' && LA14_253<='\uFAFF')) ) {
                                                alt14=67;
                                            }
                                            else {
                                                alt14=3;}
                                        }
                                        else {
                                            alt14=67;}
                                    }
                                    else {
                                        alt14=67;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                    }
                    break;
                default:
                    alt14=67;}

                }
                break;
            case 'l':
                {
                int LA14_50 = input.LA(3);

                if ( (LA14_50=='s') ) {
                    int LA14_98 = input.LA(4);

                    if ( (LA14_98=='e') ) {
                        int LA14_132 = input.LA(5);

                        if ( (LA14_132=='$'||(LA14_132>='0' && LA14_132<='9')||(LA14_132>='A' && LA14_132<='Z')||LA14_132=='_'||(LA14_132>='a' && LA14_132<='z')||(LA14_132>='\u00C0' && LA14_132<='\u00D6')||(LA14_132>='\u00D8' && LA14_132<='\u00F6')||(LA14_132>='\u00F8' && LA14_132<='\u1FFF')||(LA14_132>='\u3040' && LA14_132<='\u318F')||(LA14_132>='\u3300' && LA14_132<='\u337F')||(LA14_132>='\u3400' && LA14_132<='\u3D2D')||(LA14_132>='\u4E00' && LA14_132<='\u9FFF')||(LA14_132>='\uF900' && LA14_132<='\uFAFF')) ) {
                            alt14=67;
                        }
                        else {
                            alt14=29;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            default:
                alt14=67;}

        }
        else if ( (LA14_0=='r') ) {
            int LA14_4 = input.LA(2);

            if ( (LA14_4=='e') ) {
                switch ( input.LA(3) ) {
                case 'j':
                    {
                    int LA14_99 = input.LA(4);

                    if ( (LA14_99=='e') ) {
                        int LA14_133 = input.LA(5);

                        if ( (LA14_133=='c') ) {
                            int LA14_167 = input.LA(6);

                            if ( (LA14_167=='t') ) {
                                int LA14_197 = input.LA(7);

                                if ( (LA14_197=='$'||(LA14_197>='0' && LA14_197<='9')||(LA14_197>='A' && LA14_197<='Z')||LA14_197=='_'||(LA14_197>='a' && LA14_197<='z')||(LA14_197>='\u00C0' && LA14_197<='\u00D6')||(LA14_197>='\u00D8' && LA14_197<='\u00F6')||(LA14_197>='\u00F8' && LA14_197<='\u1FFF')||(LA14_197>='\u3040' && LA14_197<='\u318F')||(LA14_197>='\u3300' && LA14_197<='\u337F')||(LA14_197>='\u3400' && LA14_197<='\u3D2D')||(LA14_197>='\u4E00' && LA14_197<='\u9FFF')||(LA14_197>='\uF900' && LA14_197<='\uFAFF')) ) {
                                    alt14=67;
                                }
                                else {
                                    alt14=57;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                    }
                    break;
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
                                        int LA14_242 = input.LA(9);

                                        if ( (LA14_242=='$'||(LA14_242>='0' && LA14_242<='9')||(LA14_242>='A' && LA14_242<='Z')||LA14_242=='_'||(LA14_242>='a' && LA14_242<='z')||(LA14_242>='\u00C0' && LA14_242<='\u00D6')||(LA14_242>='\u00D8' && LA14_242<='\u00F6')||(LA14_242>='\u00F8' && LA14_242<='\u1FFF')||(LA14_242>='\u3040' && LA14_242<='\u318F')||(LA14_242>='\u3300' && LA14_242<='\u337F')||(LA14_242>='\u3400' && LA14_242<='\u3D2D')||(LA14_242>='\u4E00' && LA14_242<='\u9FFF')||(LA14_242>='\uF900' && LA14_242<='\uFAFF')) ) {
                                            alt14=67;
                                        }
                                        else {
                                            alt14=4;}
                                    }
                                    else {
                                        alt14=67;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                    }
                    break;
                default:
                    alt14=67;}

            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                switch ( input.LA(3) ) {
                case 'c':
                    {
                    int LA14_101 = input.LA(4);

                    if ( (LA14_101=='h') ) {
                        int LA14_135 = input.LA(5);

                        if ( (LA14_135=='e') ) {
                            int LA14_169 = input.LA(6);

                            if ( (LA14_169=='d') ) {
                                int LA14_199 = input.LA(7);

                                if ( (LA14_199=='$'||(LA14_199>='0' && LA14_199<='9')||(LA14_199>='A' && LA14_199<='Z')||LA14_199=='_'||(LA14_199>='a' && LA14_199<='z')||(LA14_199>='\u00C0' && LA14_199<='\u00D6')||(LA14_199>='\u00D8' && LA14_199<='\u00F6')||(LA14_199>='\u00F8' && LA14_199<='\u1FFF')||(LA14_199>='\u3040' && LA14_199<='\u318F')||(LA14_199>='\u3300' && LA14_199<='\u337F')||(LA14_199>='\u3400' && LA14_199<='\u3D2D')||(LA14_199>='\u4E00' && LA14_199<='\u9FFF')||(LA14_199>='\uF900' && LA14_199<='\uFAFF')) ) {
                                    alt14=67;
                                }
                                else {
                                    alt14=17;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                    }
                    break;
                case 's':
                    {
                    int LA14_102 = input.LA(4);

                    if ( (LA14_102=='e') ) {
                        int LA14_136 = input.LA(5);

                        if ( (LA14_136=='$'||(LA14_136>='0' && LA14_136<='9')||(LA14_136>='A' && LA14_136<='Z')||LA14_136=='_'||(LA14_136>='a' && LA14_136<='z')||(LA14_136>='\u00C0' && LA14_136<='\u00D6')||(LA14_136>='\u00D8' && LA14_136<='\u00F6')||(LA14_136>='\u00F8' && LA14_136<='\u1FFF')||(LA14_136>='\u3040' && LA14_136<='\u318F')||(LA14_136>='\u3300' && LA14_136<='\u337F')||(LA14_136>='\u3400' && LA14_136<='\u3D2D')||(LA14_136>='\u4E00' && LA14_136<='\u9FFF')||(LA14_136>='\uF900' && LA14_136<='\uFAFF')) ) {
                            alt14=67;
                        }
                        else {
                            alt14=32;}
                    }
                    else {
                        alt14=67;}
                    }
                    break;
                default:
                    alt14=67;}

                }
                break;
            case 'r':
                {
                int LA14_53 = input.LA(3);

                if ( (LA14_53=='e') ) {
                    int LA14_103 = input.LA(4);

                    if ( (LA14_103=='a') ) {
                        int LA14_137 = input.LA(5);

                        if ( (LA14_137=='t') ) {
                            int LA14_171 = input.LA(6);

                            if ( (LA14_171=='e') ) {
                                int LA14_200 = input.LA(7);

                                if ( (LA14_200=='$'||(LA14_200>='0' && LA14_200<='9')||(LA14_200>='A' && LA14_200<='Z')||LA14_200=='_'||(LA14_200>='a' && LA14_200<='z')||(LA14_200>='\u00C0' && LA14_200<='\u00D6')||(LA14_200>='\u00D8' && LA14_200<='\u00F6')||(LA14_200>='\u00F8' && LA14_200<='\u1FFF')||(LA14_200>='\u3040' && LA14_200<='\u318F')||(LA14_200>='\u3300' && LA14_200<='\u337F')||(LA14_200>='\u3400' && LA14_200<='\u3D2D')||(LA14_200>='\u4E00' && LA14_200<='\u9FFF')||(LA14_200>='\uF900' && LA14_200<='\uFAFF')) ) {
                                    alt14=67;
                                }
                                else {
                                    alt14=20;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            case 'o':
                {
                switch ( input.LA(3) ) {
                case 'n':
                    {
                    int LA14_104 = input.LA(4);

                    if ( (LA14_104=='t') ) {
                        int LA14_138 = input.LA(5);

                        if ( (LA14_138=='e') ) {
                            int LA14_172 = input.LA(6);

                            if ( (LA14_172=='x') ) {
                                int LA14_201 = input.LA(7);

                                if ( (LA14_201=='t') ) {
                                    int LA14_225 = input.LA(8);

                                    if ( (LA14_225=='$'||(LA14_225>='0' && LA14_225<='9')||(LA14_225>='A' && LA14_225<='Z')||LA14_225=='_'||(LA14_225>='a' && LA14_225<='z')||(LA14_225>='\u00C0' && LA14_225<='\u00D6')||(LA14_225>='\u00D8' && LA14_225<='\u00F6')||(LA14_225>='\u00F8' && LA14_225<='\u1FFF')||(LA14_225>='\u3040' && LA14_225<='\u318F')||(LA14_225>='\u3300' && LA14_225<='\u337F')||(LA14_225>='\u3400' && LA14_225<='\u3D2D')||(LA14_225>='\u4E00' && LA14_225<='\u9FFF')||(LA14_225>='\uF900' && LA14_225<='\uFAFF')) ) {
                                        alt14=67;
                                    }
                                    else {
                                        alt14=5;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                    }
                    break;
                case 'l':
                    {
                    int LA14_105 = input.LA(4);

                    if ( (LA14_105=='l') ) {
                        int LA14_139 = input.LA(5);

                        if ( (LA14_139=='e') ) {
                            int LA14_173 = input.LA(6);

                            if ( (LA14_173=='c') ) {
                                int LA14_202 = input.LA(7);

                                if ( (LA14_202=='t') ) {
                                    int LA14_226 = input.LA(8);

                                    if ( (LA14_226=='$'||(LA14_226>='0' && LA14_226<='9')||(LA14_226>='A' && LA14_226<='Z')||LA14_226=='_'||(LA14_226>='a' && LA14_226<='z')||(LA14_226>='\u00C0' && LA14_226<='\u00D6')||(LA14_226>='\u00D8' && LA14_226<='\u00F6')||(LA14_226>='\u00F8' && LA14_226<='\u1FFF')||(LA14_226>='\u3040' && LA14_226<='\u318F')||(LA14_226>='\u3300' && LA14_226<='\u337F')||(LA14_226>='\u3400' && LA14_226<='\u3D2D')||(LA14_226>='\u4E00' && LA14_226<='\u9FFF')||(LA14_226>='\uF900' && LA14_226<='\uFAFF')) ) {
                                        alt14=67;
                                    }
                                    else {
                                        alt14=54;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                    }
                    break;
                default:
                    alt14=67;}

                }
                break;
            default:
                alt14=67;}

        }
        else if ( (LA14_0=='E') ) {
            int LA14_6 = input.LA(2);

            if ( (LA14_6=='R') ) {
                int LA14_55 = input.LA(3);

                if ( (LA14_55=='R') ) {
                    int LA14_106 = input.LA(4);

                    if ( (LA14_106=='O') ) {
                        int LA14_140 = input.LA(5);

                        if ( (LA14_140=='R') ) {
                            int LA14_174 = input.LA(6);

                            if ( (LA14_174=='$'||(LA14_174>='0' && LA14_174<='9')||(LA14_174>='A' && LA14_174<='Z')||LA14_174=='_'||(LA14_174>='a' && LA14_174<='z')||(LA14_174>='\u00C0' && LA14_174<='\u00D6')||(LA14_174>='\u00D8' && LA14_174<='\u00F6')||(LA14_174>='\u00F8' && LA14_174<='\u1FFF')||(LA14_174>='\u3040' && LA14_174<='\u318F')||(LA14_174>='\u3300' && LA14_174<='\u337F')||(LA14_174>='\u3400' && LA14_174<='\u3D2D')||(LA14_174>='\u4E00' && LA14_174<='\u9FFF')||(LA14_174>='\uF900' && LA14_174<='\uFAFF')) ) {
                                alt14=67;
                            }
                            else {
                                alt14=7;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='W') ) {
            int LA14_7 = input.LA(2);

            if ( (LA14_7=='A') ) {
                int LA14_56 = input.LA(3);

                if ( (LA14_56=='R') ) {
                    int LA14_107 = input.LA(4);

                    if ( (LA14_107=='N') ) {
                        int LA14_141 = input.LA(5);

                        if ( (LA14_141=='I') ) {
                            int LA14_175 = input.LA(6);

                            if ( (LA14_175=='N') ) {
                                int LA14_204 = input.LA(7);

                                if ( (LA14_204=='G') ) {
                                    int LA14_227 = input.LA(8);

                                    if ( (LA14_227=='$'||(LA14_227>='0' && LA14_227<='9')||(LA14_227>='A' && LA14_227<='Z')||LA14_227=='_'||(LA14_227>='a' && LA14_227<='z')||(LA14_227>='\u00C0' && LA14_227<='\u00D6')||(LA14_227>='\u00D8' && LA14_227<='\u00F6')||(LA14_227>='\u00F8' && LA14_227<='\u1FFF')||(LA14_227>='\u3040' && LA14_227<='\u318F')||(LA14_227>='\u3300' && LA14_227<='\u337F')||(LA14_227>='\u3400' && LA14_227<='\u3D2D')||(LA14_227>='\u4E00' && LA14_227<='\u9FFF')||(LA14_227>='\uF900' && LA14_227<='\uFAFF')) ) {
                                        alt14=67;
                                    }
                                    else {
                                        alt14=8;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0==':') ) {
            int LA14_8 = input.LA(2);

            if ( (LA14_8==':') ) {
                alt14=15;
            }
            else {
                alt14=9;}
        }
        else if ( (LA14_0=='a') ) {
            int LA14_9 = input.LA(2);

            if ( (LA14_9=='r') ) {
                int LA14_59 = input.LA(3);

                if ( (LA14_59=='o') ) {
                    int LA14_108 = input.LA(4);

                    if ( (LA14_108=='u') ) {
                        int LA14_142 = input.LA(5);

                        if ( (LA14_142=='n') ) {
                            int LA14_176 = input.LA(6);

                            if ( (LA14_176=='d') ) {
                                int LA14_205 = input.LA(7);

                                if ( (LA14_205=='$'||(LA14_205>='0' && LA14_205<='9')||(LA14_205>='A' && LA14_205<='Z')||LA14_205=='_'||(LA14_205>='a' && LA14_205<='z')||(LA14_205>='\u00C0' && LA14_205<='\u00D6')||(LA14_205>='\u00D8' && LA14_205<='\u00F6')||(LA14_205>='\u00F8' && LA14_205<='\u1FFF')||(LA14_205>='\u3040' && LA14_205<='\u318F')||(LA14_205>='\u3300' && LA14_205<='\u337F')||(LA14_205>='\u3400' && LA14_205<='\u3D2D')||(LA14_205>='\u4E00' && LA14_205<='\u9FFF')||(LA14_205>='\uF900' && LA14_205<='\uFAFF')) ) {
                                    alt14=67;
                                }
                                else {
                                    alt14=10;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='(') ) {
            alt14=11;
        }
        else if ( (LA14_0==',') ) {
            alt14=12;
        }
        else if ( (LA14_0=='*') ) {
            alt14=13;
        }
        else if ( (LA14_0==')') ) {
            alt14=14;
        }
        else if ( (LA14_0=='p') ) {
            int LA14_14 = input.LA(2);

            if ( (LA14_14=='r') ) {
                int LA14_60 = input.LA(3);

                if ( (LA14_60=='i') ) {
                    int LA14_109 = input.LA(4);

                    if ( (LA14_109=='v') ) {
                        int LA14_143 = input.LA(5);

                        if ( (LA14_143=='a') ) {
                            int LA14_177 = input.LA(6);

                            if ( (LA14_177=='t') ) {
                                int LA14_206 = input.LA(7);

                                if ( (LA14_206=='e') ) {
                                    int LA14_229 = input.LA(8);

                                    if ( (LA14_229=='$'||(LA14_229>='0' && LA14_229<='9')||(LA14_229>='A' && LA14_229<='Z')||LA14_229=='_'||(LA14_229>='a' && LA14_229<='z')||(LA14_229>='\u00C0' && LA14_229<='\u00D6')||(LA14_229>='\u00D8' && LA14_229<='\u00F6')||(LA14_229>='\u00F8' && LA14_229<='\u1FFF')||(LA14_229>='\u3040' && LA14_229<='\u318F')||(LA14_229>='\u3300' && LA14_229<='\u337F')||(LA14_229>='\u3400' && LA14_229<='\u3D2D')||(LA14_229>='\u4E00' && LA14_229<='\u9FFF')||(LA14_229>='\uF900' && LA14_229<='\uFAFF')) ) {
                                        alt14=67;
                                    }
                                    else {
                                        alt14=16;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='J') ) {
            int LA14_15 = input.LA(2);

            if ( (LA14_15=='A') ) {
                int LA14_61 = input.LA(3);

                if ( (LA14_61=='V') ) {
                    int LA14_110 = input.LA(4);

                    if ( (LA14_110=='A') ) {
                        int LA14_144 = input.LA(5);

                        if ( (LA14_144=='$'||(LA14_144>='0' && LA14_144<='9')||(LA14_144>='A' && LA14_144<='Z')||LA14_144=='_'||(LA14_144>='a' && LA14_144<='z')||(LA14_144>='\u00C0' && LA14_144<='\u00D6')||(LA14_144>='\u00D8' && LA14_144<='\u00F6')||(LA14_144>='\u00F8' && LA14_144<='\u1FFF')||(LA14_144>='\u3040' && LA14_144<='\u318F')||(LA14_144>='\u3300' && LA14_144<='\u337F')||(LA14_144>='\u3400' && LA14_144<='\u3D2D')||(LA14_144>='\u4E00' && LA14_144<='\u9FFF')||(LA14_144>='\uF900' && LA14_144<='\uFAFF')) ) {
                            alt14=67;
                        }
                        else {
                            alt14=18;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='.') ) {
            alt14=19;
        }
        else if ( (LA14_0=='C') ) {
            int LA14_17 = input.LA(2);

            if ( (LA14_17=='o') ) {
                int LA14_62 = input.LA(3);

                if ( (LA14_62=='l') ) {
                    int LA14_111 = input.LA(4);

                    if ( (LA14_111=='l') ) {
                        int LA14_145 = input.LA(5);

                        if ( (LA14_145=='e') ) {
                            int LA14_179 = input.LA(6);

                            if ( (LA14_179=='c') ) {
                                int LA14_207 = input.LA(7);

                                if ( (LA14_207=='t') ) {
                                    int LA14_230 = input.LA(8);

                                    if ( (LA14_230=='i') ) {
                                        int LA14_247 = input.LA(9);

                                        if ( (LA14_247=='o') ) {
                                            int LA14_255 = input.LA(10);

                                            if ( (LA14_255=='n') ) {
                                                int LA14_261 = input.LA(11);

                                                if ( (LA14_261=='$'||(LA14_261>='0' && LA14_261<='9')||(LA14_261>='A' && LA14_261<='Z')||LA14_261=='_'||(LA14_261>='a' && LA14_261<='z')||(LA14_261>='\u00C0' && LA14_261<='\u00D6')||(LA14_261>='\u00D8' && LA14_261<='\u00F6')||(LA14_261>='\u00F8' && LA14_261<='\u1FFF')||(LA14_261>='\u3040' && LA14_261<='\u318F')||(LA14_261>='\u3300' && LA14_261<='\u337F')||(LA14_261>='\u3400' && LA14_261<='\u3D2D')||(LA14_261>='\u4E00' && LA14_261<='\u9FFF')||(LA14_261>='\uF900' && LA14_261<='\uFAFF')) ) {
                                                    alt14=67;
                                                }
                                                else {
                                                    alt14=21;}
                                            }
                                            else {
                                                alt14=67;}
                                        }
                                        else {
                                            alt14=67;}
                                    }
                                    else {
                                        alt14=67;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='L') ) {
            int LA14_18 = input.LA(2);

            if ( (LA14_18=='i') ) {
                int LA14_63 = input.LA(3);

                if ( (LA14_63=='s') ) {
                    int LA14_112 = input.LA(4);

                    if ( (LA14_112=='t') ) {
                        int LA14_146 = input.LA(5);

                        if ( (LA14_146=='$'||(LA14_146>='0' && LA14_146<='9')||(LA14_146>='A' && LA14_146<='Z')||LA14_146=='_'||(LA14_146>='a' && LA14_146<='z')||(LA14_146>='\u00C0' && LA14_146<='\u00D6')||(LA14_146>='\u00D8' && LA14_146<='\u00F6')||(LA14_146>='\u00F8' && LA14_146<='\u1FFF')||(LA14_146>='\u3040' && LA14_146<='\u318F')||(LA14_146>='\u3300' && LA14_146<='\u337F')||(LA14_146>='\u3400' && LA14_146<='\u3D2D')||(LA14_146>='\u4E00' && LA14_146<='\u9FFF')||(LA14_146>='\uF900' && LA14_146<='\uFAFF')) ) {
                            alt14=67;
                        }
                        else {
                            alt14=22;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='S') ) {
            int LA14_19 = input.LA(2);

            if ( (LA14_19=='e') ) {
                int LA14_64 = input.LA(3);

                if ( (LA14_64=='t') ) {
                    int LA14_113 = input.LA(4);

                    if ( (LA14_113=='$'||(LA14_113>='0' && LA14_113<='9')||(LA14_113>='A' && LA14_113<='Z')||LA14_113=='_'||(LA14_113>='a' && LA14_113<='z')||(LA14_113>='\u00C0' && LA14_113<='\u00D6')||(LA14_113>='\u00D8' && LA14_113<='\u00F6')||(LA14_113>='\u00F8' && LA14_113<='\u1FFF')||(LA14_113>='\u3040' && LA14_113<='\u318F')||(LA14_113>='\u3300' && LA14_113<='\u337F')||(LA14_113>='\u3400' && LA14_113<='\u3D2D')||(LA14_113>='\u4E00' && LA14_113<='\u9FFF')||(LA14_113>='\uF900' && LA14_113<='\uFAFF')) ) {
                        alt14=67;
                    }
                    else {
                        alt14=23;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='l') ) {
            int LA14_20 = input.LA(2);

            if ( (LA14_20=='e') ) {
                int LA14_65 = input.LA(3);

                if ( (LA14_65=='t') ) {
                    int LA14_114 = input.LA(4);

                    if ( (LA14_114=='$'||(LA14_114>='0' && LA14_114<='9')||(LA14_114>='A' && LA14_114<='Z')||LA14_114=='_'||(LA14_114>='a' && LA14_114<='z')||(LA14_114>='\u00C0' && LA14_114<='\u00D6')||(LA14_114>='\u00D8' && LA14_114<='\u00F6')||(LA14_114>='\u00F8' && LA14_114<='\u1FFF')||(LA14_114>='\u3040' && LA14_114<='\u318F')||(LA14_114>='\u3300' && LA14_114<='\u337F')||(LA14_114>='\u3400' && LA14_114<='\u3D2D')||(LA14_114>='\u4E00' && LA14_114<='\u9FFF')||(LA14_114>='\uF900' && LA14_114<='\uFAFF')) ) {
                        alt14=67;
                    }
                    else {
                        alt14=24;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='=') ) {
            int LA14_21 = input.LA(2);

            if ( (LA14_21=='=') ) {
                alt14=38;
            }
            else {
                alt14=25;}
        }
        else if ( (LA14_0=='-') ) {
            int LA14_22 = input.LA(2);

            if ( (LA14_22=='>') ) {
                alt14=26;
            }
            else {
                alt14=45;}
        }
        else if ( (LA14_0=='?') ) {
            alt14=27;
        }
        else if ( (LA14_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA14_70 = input.LA(3);

                if ( (LA14_70=='e') ) {
                    int LA14_115 = input.LA(4);

                    if ( (LA14_115=='n') ) {
                        int LA14_149 = input.LA(5);

                        if ( (LA14_149=='$'||(LA14_149>='0' && LA14_149<='9')||(LA14_149>='A' && LA14_149<='Z')||LA14_149=='_'||(LA14_149>='a' && LA14_149<='z')||(LA14_149>='\u00C0' && LA14_149<='\u00D6')||(LA14_149>='\u00D8' && LA14_149<='\u00F6')||(LA14_149>='\u00F8' && LA14_149<='\u1FFF')||(LA14_149>='\u3040' && LA14_149<='\u318F')||(LA14_149>='\u3300' && LA14_149<='\u337F')||(LA14_149>='\u3400' && LA14_149<='\u3D2D')||(LA14_149>='\u4E00' && LA14_149<='\u9FFF')||(LA14_149>='\uF900' && LA14_149<='\uFAFF')) ) {
                            alt14=67;
                        }
                        else {
                            alt14=28;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            case 'r':
                {
                int LA14_71 = input.LA(3);

                if ( (LA14_71=='u') ) {
                    int LA14_116 = input.LA(4);

                    if ( (LA14_116=='e') ) {
                        int LA14_150 = input.LA(5);

                        if ( (LA14_150=='$'||(LA14_150>='0' && LA14_150<='9')||(LA14_150>='A' && LA14_150<='Z')||LA14_150=='_'||(LA14_150>='a' && LA14_150<='z')||(LA14_150>='\u00C0' && LA14_150<='\u00D6')||(LA14_150>='\u00D8' && LA14_150<='\u00F6')||(LA14_150>='\u00F8' && LA14_150<='\u1FFF')||(LA14_150>='\u3040' && LA14_150<='\u318F')||(LA14_150>='\u3300' && LA14_150<='\u337F')||(LA14_150>='\u3400' && LA14_150<='\u3D2D')||(LA14_150>='\u4E00' && LA14_150<='\u9FFF')||(LA14_150>='\uF900' && LA14_150<='\uFAFF')) ) {
                            alt14=67;
                        }
                        else {
                            alt14=51;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            case 'y':
                {
                int LA14_72 = input.LA(3);

                if ( (LA14_72=='p') ) {
                    int LA14_117 = input.LA(4);

                    if ( (LA14_117=='e') ) {
                        int LA14_151 = input.LA(5);

                        if ( (LA14_151=='S') ) {
                            int LA14_183 = input.LA(6);

                            if ( (LA14_183=='e') ) {
                                int LA14_208 = input.LA(7);

                                if ( (LA14_208=='l') ) {
                                    int LA14_231 = input.LA(8);

                                    if ( (LA14_231=='e') ) {
                                        int LA14_248 = input.LA(9);

                                        if ( (LA14_248=='c') ) {
                                            int LA14_256 = input.LA(10);

                                            if ( (LA14_256=='t') ) {
                                                int LA14_262 = input.LA(11);

                                                if ( (LA14_262=='$'||(LA14_262>='0' && LA14_262<='9')||(LA14_262>='A' && LA14_262<='Z')||LA14_262=='_'||(LA14_262>='a' && LA14_262<='z')||(LA14_262>='\u00C0' && LA14_262<='\u00D6')||(LA14_262>='\u00D8' && LA14_262<='\u00F6')||(LA14_262>='\u00F8' && LA14_262<='\u1FFF')||(LA14_262>='\u3040' && LA14_262<='\u318F')||(LA14_262>='\u3300' && LA14_262<='\u337F')||(LA14_262>='\u3400' && LA14_262<='\u3D2D')||(LA14_262>='\u4E00' && LA14_262<='\u9FFF')||(LA14_262>='\uF900' && LA14_262<='\uFAFF')) ) {
                                                    alt14=67;
                                                }
                                                else {
                                                    alt14=53;}
                                            }
                                            else {
                                                alt14=67;}
                                        }
                                        else {
                                            alt14=67;}
                                    }
                                    else {
                                        alt14=67;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            default:
                alt14=67;}

        }
        else if ( (LA14_0=='s') ) {
            switch ( input.LA(2) ) {
            case 'w':
                {
                int LA14_73 = input.LA(3);

                if ( (LA14_73=='i') ) {
                    int LA14_118 = input.LA(4);

                    if ( (LA14_118=='t') ) {
                        int LA14_152 = input.LA(5);

                        if ( (LA14_152=='c') ) {
                            int LA14_184 = input.LA(6);

                            if ( (LA14_184=='h') ) {
                                int LA14_209 = input.LA(7);

                                if ( (LA14_209=='$'||(LA14_209>='0' && LA14_209<='9')||(LA14_209>='A' && LA14_209<='Z')||LA14_209=='_'||(LA14_209>='a' && LA14_209<='z')||(LA14_209>='\u00C0' && LA14_209<='\u00D6')||(LA14_209>='\u00D8' && LA14_209<='\u00F6')||(LA14_209>='\u00F8' && LA14_209<='\u1FFF')||(LA14_209>='\u3040' && LA14_209<='\u318F')||(LA14_209>='\u3300' && LA14_209<='\u337F')||(LA14_209>='\u3400' && LA14_209<='\u3D2D')||(LA14_209>='\u4E00' && LA14_209<='\u9FFF')||(LA14_209>='\uF900' && LA14_209<='\uFAFF')) ) {
                                    alt14=67;
                                }
                                else {
                                    alt14=30;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            case 'e':
                {
                int LA14_74 = input.LA(3);

                if ( (LA14_74=='l') ) {
                    int LA14_119 = input.LA(4);

                    if ( (LA14_119=='e') ) {
                        int LA14_153 = input.LA(5);

                        if ( (LA14_153=='c') ) {
                            int LA14_185 = input.LA(6);

                            if ( (LA14_185=='t') ) {
                                int LA14_210 = input.LA(7);

                                if ( (LA14_210=='F') ) {
                                    int LA14_233 = input.LA(8);

                                    if ( (LA14_233=='i') ) {
                                        int LA14_249 = input.LA(9);

                                        if ( (LA14_249=='r') ) {
                                            int LA14_257 = input.LA(10);

                                            if ( (LA14_257=='s') ) {
                                                int LA14_263 = input.LA(11);

                                                if ( (LA14_263=='t') ) {
                                                    int LA14_268 = input.LA(12);

                                                    if ( (LA14_268=='$'||(LA14_268>='0' && LA14_268<='9')||(LA14_268>='A' && LA14_268<='Z')||LA14_268=='_'||(LA14_268>='a' && LA14_268<='z')||(LA14_268>='\u00C0' && LA14_268<='\u00D6')||(LA14_268>='\u00D8' && LA14_268<='\u00F6')||(LA14_268>='\u00F8' && LA14_268<='\u1FFF')||(LA14_268>='\u3040' && LA14_268<='\u318F')||(LA14_268>='\u3300' && LA14_268<='\u337F')||(LA14_268>='\u3400' && LA14_268<='\u3D2D')||(LA14_268>='\u4E00' && LA14_268<='\u9FFF')||(LA14_268>='\uF900' && LA14_268<='\uFAFF')) ) {
                                                        alt14=67;
                                                    }
                                                    else {
                                                        alt14=56;}
                                                }
                                                else {
                                                    alt14=67;}
                                            }
                                            else {
                                                alt14=67;}
                                        }
                                        else {
                                            alt14=67;}
                                    }
                                    else {
                                        alt14=67;}
                                }
                                else if ( (LA14_210=='$'||(LA14_210>='0' && LA14_210<='9')||(LA14_210>='A' && LA14_210<='E')||(LA14_210>='G' && LA14_210<='Z')||LA14_210=='_'||(LA14_210>='a' && LA14_210<='z')||(LA14_210>='\u00C0' && LA14_210<='\u00D6')||(LA14_210>='\u00D8' && LA14_210<='\u00F6')||(LA14_210>='\u00F8' && LA14_210<='\u1FFF')||(LA14_210>='\u3040' && LA14_210<='\u318F')||(LA14_210>='\u3300' && LA14_210<='\u337F')||(LA14_210>='\u3400' && LA14_210<='\u3D2D')||(LA14_210>='\u4E00' && LA14_210<='\u9FFF')||(LA14_210>='\uF900' && LA14_210<='\uFAFF')) ) {
                                    alt14=67;
                                }
                                else {
                                    alt14=55;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            case 'o':
                {
                int LA14_75 = input.LA(3);

                if ( (LA14_75=='r') ) {
                    int LA14_120 = input.LA(4);

                    if ( (LA14_120=='t') ) {
                        int LA14_154 = input.LA(5);

                        if ( (LA14_154=='B') ) {
                            int LA14_186 = input.LA(6);

                            if ( (LA14_186=='y') ) {
                                int LA14_211 = input.LA(7);

                                if ( (LA14_211=='$'||(LA14_211>='0' && LA14_211<='9')||(LA14_211>='A' && LA14_211<='Z')||LA14_211=='_'||(LA14_211>='a' && LA14_211<='z')||(LA14_211>='\u00C0' && LA14_211<='\u00D6')||(LA14_211>='\u00D8' && LA14_211<='\u00F6')||(LA14_211>='\u00F8' && LA14_211<='\u1FFF')||(LA14_211>='\u3040' && LA14_211<='\u318F')||(LA14_211>='\u3300' && LA14_211<='\u337F')||(LA14_211>='\u3400' && LA14_211<='\u3D2D')||(LA14_211>='\u4E00' && LA14_211<='\u9FFF')||(LA14_211>='\uF900' && LA14_211<='\uFAFF')) ) {
                                    alt14=67;
                                }
                                else {
                                    alt14=60;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            default:
                alt14=67;}

        }
        else if ( (LA14_0=='{') ) {
            alt14=31;
        }
        else if ( (LA14_0=='d') ) {
            int LA14_27 = input.LA(2);

            if ( (LA14_27=='e') ) {
                int LA14_76 = input.LA(3);

                if ( (LA14_76=='f') ) {
                    int LA14_121 = input.LA(4);

                    if ( (LA14_121=='a') ) {
                        int LA14_155 = input.LA(5);

                        if ( (LA14_155=='u') ) {
                            int LA14_187 = input.LA(6);

                            if ( (LA14_187=='l') ) {
                                int LA14_212 = input.LA(7);

                                if ( (LA14_212=='t') ) {
                                    int LA14_236 = input.LA(8);

                                    if ( (LA14_236=='$'||(LA14_236>='0' && LA14_236<='9')||(LA14_236>='A' && LA14_236<='Z')||LA14_236=='_'||(LA14_236>='a' && LA14_236<='z')||(LA14_236>='\u00C0' && LA14_236<='\u00D6')||(LA14_236>='\u00D8' && LA14_236<='\u00F6')||(LA14_236>='\u00F8' && LA14_236<='\u1FFF')||(LA14_236>='\u3040' && LA14_236<='\u318F')||(LA14_236>='\u3300' && LA14_236<='\u337F')||(LA14_236>='\u3400' && LA14_236<='\u3D2D')||(LA14_236>='\u4E00' && LA14_236<='\u9FFF')||(LA14_236>='\uF900' && LA14_236<='\uFAFF')) ) {
                                        alt14=67;
                                    }
                                    else {
                                        alt14=33;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='}') ) {
            alt14=34;
        }
        else if ( (LA14_0=='|') ) {
            int LA14_29 = input.LA(2);

            if ( (LA14_29=='|') ) {
                alt14=35;
            }
            else {
                alt14=62;}
        }
        else if ( (LA14_0=='&') ) {
            alt14=36;
        }
        else if ( (LA14_0=='!') ) {
            int LA14_31 = input.LA(2);

            if ( (LA14_31=='=') ) {
                alt14=39;
            }
            else {
                alt14=47;}
        }
        else if ( (LA14_0=='>') ) {
            int LA14_32 = input.LA(2);

            if ( (LA14_32=='=') ) {
                alt14=40;
            }
            else {
                alt14=42;}
        }
        else if ( (LA14_0=='<') ) {
            int LA14_33 = input.LA(2);

            if ( (LA14_33=='=') ) {
                alt14=41;
            }
            else {
                alt14=43;}
        }
        else if ( (LA14_0=='+') ) {
            alt14=44;
        }
        else if ( (LA14_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt14=69;
                }
                break;
            case '/':
                {
                alt14=70;
                }
                break;
            default:
                alt14=46;}

        }
        else if ( (LA14_0=='G') ) {
            int LA14_36 = input.LA(2);

            if ( (LA14_36=='L') ) {
                int LA14_88 = input.LA(3);

                if ( (LA14_88=='O') ) {
                    int LA14_122 = input.LA(4);

                    if ( (LA14_122=='B') ) {
                        int LA14_156 = input.LA(5);

                        if ( (LA14_156=='A') ) {
                            int LA14_188 = input.LA(6);

                            if ( (LA14_188=='L') ) {
                                int LA14_213 = input.LA(7);

                                if ( (LA14_213=='V') ) {
                                    int LA14_237 = input.LA(8);

                                    if ( (LA14_237=='A') ) {
                                        int LA14_251 = input.LA(9);

                                        if ( (LA14_251=='R') ) {
                                            int LA14_258 = input.LA(10);

                                            if ( (LA14_258=='$'||(LA14_258>='0' && LA14_258<='9')||(LA14_258>='A' && LA14_258<='Z')||LA14_258=='_'||(LA14_258>='a' && LA14_258<='z')||(LA14_258>='\u00C0' && LA14_258<='\u00D6')||(LA14_258>='\u00D8' && LA14_258<='\u00F6')||(LA14_258>='\u00F8' && LA14_258<='\u1FFF')||(LA14_258>='\u3040' && LA14_258<='\u318F')||(LA14_258>='\u3300' && LA14_258<='\u337F')||(LA14_258>='\u3400' && LA14_258<='\u3D2D')||(LA14_258>='\u4E00' && LA14_258<='\u9FFF')||(LA14_258>='\uF900' && LA14_258<='\uFAFF')) ) {
                                                alt14=67;
                                            }
                                            else {
                                                alt14=48;}
                                        }
                                        else {
                                            alt14=67;}
                                    }
                                    else {
                                        alt14=67;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
            }
            else {
                alt14=67;}
        }
        else if ( (LA14_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA14_89 = input.LA(3);

                if ( (LA14_89=='l') ) {
                    int LA14_123 = input.LA(4);

                    if ( (LA14_123=='l') ) {
                        int LA14_157 = input.LA(5);

                        if ( (LA14_157=='$'||(LA14_157>='0' && LA14_157<='9')||(LA14_157>='A' && LA14_157<='Z')||LA14_157=='_'||(LA14_157>='a' && LA14_157<='z')||(LA14_157>='\u00C0' && LA14_157<='\u00D6')||(LA14_157>='\u00D8' && LA14_157<='\u00F6')||(LA14_157>='\u00F8' && LA14_157<='\u1FFF')||(LA14_157>='\u3040' && LA14_157<='\u318F')||(LA14_157>='\u3300' && LA14_157<='\u337F')||(LA14_157>='\u3400' && LA14_157<='\u3D2D')||(LA14_157>='\u4E00' && LA14_157<='\u9FFF')||(LA14_157>='\uF900' && LA14_157<='\uFAFF')) ) {
                            alt14=67;
                        }
                        else {
                            alt14=52;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            case 'o':
                {
                int LA14_90 = input.LA(3);

                if ( (LA14_90=='t') ) {
                    int LA14_124 = input.LA(4);

                    if ( (LA14_124=='E') ) {
                        int LA14_158 = input.LA(5);

                        if ( (LA14_158=='x') ) {
                            int LA14_190 = input.LA(6);

                            if ( (LA14_190=='i') ) {
                                int LA14_214 = input.LA(7);

                                if ( (LA14_214=='s') ) {
                                    int LA14_238 = input.LA(8);

                                    if ( (LA14_238=='t') ) {
                                        int LA14_252 = input.LA(9);

                                        if ( (LA14_252=='s') ) {
                                            int LA14_259 = input.LA(10);

                                            if ( (LA14_259=='$'||(LA14_259>='0' && LA14_259<='9')||(LA14_259>='A' && LA14_259<='Z')||LA14_259=='_'||(LA14_259>='a' && LA14_259<='z')||(LA14_259>='\u00C0' && LA14_259<='\u00D6')||(LA14_259>='\u00D8' && LA14_259<='\u00F6')||(LA14_259>='\u00F8' && LA14_259<='\u1FFF')||(LA14_259>='\u3040' && LA14_259<='\u318F')||(LA14_259>='\u3300' && LA14_259<='\u337F')||(LA14_259>='\u3400' && LA14_259<='\u3D2D')||(LA14_259>='\u4E00' && LA14_259<='\u9FFF')||(LA14_259>='\uF900' && LA14_259<='\uFAFF')) ) {
                                                alt14=67;
                                            }
                                            else {
                                                alt14=59;}
                                        }
                                        else {
                                            alt14=67;}
                                    }
                                    else {
                                        alt14=67;}
                                }
                                else {
                                    alt14=67;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            case 'e':
                {
                int LA14_91 = input.LA(3);

                if ( (LA14_91=='w') ) {
                    int LA14_125 = input.LA(4);

                    if ( (LA14_125=='$'||(LA14_125>='0' && LA14_125<='9')||(LA14_125>='A' && LA14_125<='Z')||LA14_125=='_'||(LA14_125>='a' && LA14_125<='z')||(LA14_125>='\u00C0' && LA14_125<='\u00D6')||(LA14_125>='\u00D8' && LA14_125<='\u00F6')||(LA14_125>='\u00F8' && LA14_125<='\u1FFF')||(LA14_125>='\u3040' && LA14_125<='\u318F')||(LA14_125>='\u3300' && LA14_125<='\u337F')||(LA14_125>='\u3400' && LA14_125<='\u3D2D')||(LA14_125>='\u4E00' && LA14_125<='\u9FFF')||(LA14_125>='\uF900' && LA14_125<='\uFAFF')) ) {
                        alt14=67;
                    }
                    else {
                        alt14=49;}
                }
                else {
                    alt14=67;}
                }
                break;
            default:
                alt14=67;}

        }
        else if ( (LA14_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA14_92 = input.LA(3);

                if ( (LA14_92=='l') ) {
                    int LA14_126 = input.LA(4);

                    if ( (LA14_126=='s') ) {
                        int LA14_160 = input.LA(5);

                        if ( (LA14_160=='e') ) {
                            int LA14_191 = input.LA(6);

                            if ( (LA14_191=='$'||(LA14_191>='0' && LA14_191<='9')||(LA14_191>='A' && LA14_191<='Z')||LA14_191=='_'||(LA14_191>='a' && LA14_191<='z')||(LA14_191>='\u00C0' && LA14_191<='\u00D6')||(LA14_191>='\u00D8' && LA14_191<='\u00F6')||(LA14_191>='\u00F8' && LA14_191<='\u1FFF')||(LA14_191>='\u3040' && LA14_191<='\u318F')||(LA14_191>='\u3300' && LA14_191<='\u337F')||(LA14_191>='\u3400' && LA14_191<='\u3D2D')||(LA14_191>='\u4E00' && LA14_191<='\u9FFF')||(LA14_191>='\uF900' && LA14_191<='\uFAFF')) ) {
                                alt14=67;
                            }
                            else {
                                alt14=50;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            case 'o':
                {
                int LA14_93 = input.LA(3);

                if ( (LA14_93=='r') ) {
                    int LA14_127 = input.LA(4);

                    if ( (LA14_127=='A') ) {
                        int LA14_161 = input.LA(5);

                        if ( (LA14_161=='l') ) {
                            int LA14_192 = input.LA(6);

                            if ( (LA14_192=='l') ) {
                                int LA14_216 = input.LA(7);

                                if ( (LA14_216=='$'||(LA14_216>='0' && LA14_216<='9')||(LA14_216>='A' && LA14_216<='Z')||LA14_216=='_'||(LA14_216>='a' && LA14_216<='z')||(LA14_216>='\u00C0' && LA14_216<='\u00D6')||(LA14_216>='\u00D8' && LA14_216<='\u00F6')||(LA14_216>='\u00F8' && LA14_216<='\u1FFF')||(LA14_216>='\u3040' && LA14_216<='\u318F')||(LA14_216>='\u3300' && LA14_216<='\u337F')||(LA14_216>='\u3400' && LA14_216<='\u3D2D')||(LA14_216>='\u4E00' && LA14_216<='\u9FFF')||(LA14_216>='\uF900' && LA14_216<='\uFAFF')) ) {
                                    alt14=67;
                                }
                                else {
                                    alt14=61;}
                            }
                            else {
                                alt14=67;}
                        }
                        else {
                            alt14=67;}
                    }
                    else {
                        alt14=67;}
                }
                else {
                    alt14=67;}
                }
                break;
            default:
                alt14=67;}

        }
        else if ( (LA14_0=='[') ) {
            alt14=63;
        }
        else if ( (LA14_0==']') ) {
            alt14=64;
        }
        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {
            alt14=65;
        }
        else if ( (LA14_0=='\"'||LA14_0=='\'') ) {
            alt14=66;
        }
        else if ( (LA14_0=='$'||(LA14_0>='A' && LA14_0<='B')||LA14_0=='D'||LA14_0=='F'||(LA14_0>='H' && LA14_0<='I')||LA14_0=='K'||(LA14_0>='M' && LA14_0<='R')||(LA14_0>='T' && LA14_0<='V')||(LA14_0>='X' && LA14_0<='Z')||(LA14_0>='^' && LA14_0<='_')||LA14_0=='b'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||LA14_0=='m'||LA14_0=='o'||LA14_0=='q'||(LA14_0>='u' && LA14_0<='z')||(LA14_0>='\u00C0' && LA14_0<='\u00D6')||(LA14_0>='\u00D8' && LA14_0<='\u00F6')||(LA14_0>='\u00F8' && LA14_0<='\u1FFF')||(LA14_0>='\u3040' && LA14_0<='\u318F')||(LA14_0>='\u3300' && LA14_0<='\u337F')||(LA14_0>='\u3400' && LA14_0<='\u3D2D')||(LA14_0>='\u4E00' && LA14_0<='\u9FFF')||(LA14_0>='\uF900' && LA14_0<='\uFAFF')) ) {
            alt14=67;
        }
        else if ( ((LA14_0>='\t' && LA14_0<='\n')||(LA14_0>='\f' && LA14_0<='\r')||LA14_0==' ') ) {
            alt14=68;
        }
        else if ( (LA14_0=='\u00AB') ) {
            alt14=71;
        }
        else if ( (LA14_0=='\u00BB') ) {
            alt14=72;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | IntLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT | XPAND_TAG_OPEN | XPAND_TAG_CLOSE );", 14, 0, input);

            throw nvae;
        }
        switch (alt14) {
            case 1 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:10: T18
                {
                mT18(); 

                }
                break;
            case 2 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:14: T19
                {
                mT19(); 

                }
                break;
            case 3 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:18: T20
                {
                mT20(); 

                }
                break;
            case 4 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:22: T21
                {
                mT21(); 

                }
                break;
            case 5 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:26: T22
                {
                mT22(); 

                }
                break;
            case 6 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:30: T23
                {
                mT23(); 

                }
                break;
            case 7 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:34: T24
                {
                mT24(); 

                }
                break;
            case 8 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:38: T25
                {
                mT25(); 

                }
                break;
            case 9 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:42: T26
                {
                mT26(); 

                }
                break;
            case 10 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:46: T27
                {
                mT27(); 

                }
                break;
            case 11 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:50: T28
                {
                mT28(); 

                }
                break;
            case 12 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:54: T29
                {
                mT29(); 

                }
                break;
            case 13 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:58: T30
                {
                mT30(); 

                }
                break;
            case 14 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:62: T31
                {
                mT31(); 

                }
                break;
            case 15 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:66: T32
                {
                mT32(); 

                }
                break;
            case 16 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:70: T33
                {
                mT33(); 

                }
                break;
            case 17 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:74: T34
                {
                mT34(); 

                }
                break;
            case 18 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:78: T35
                {
                mT35(); 

                }
                break;
            case 19 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:82: T36
                {
                mT36(); 

                }
                break;
            case 20 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:86: T37
                {
                mT37(); 

                }
                break;
            case 21 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:90: T38
                {
                mT38(); 

                }
                break;
            case 22 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:94: T39
                {
                mT39(); 

                }
                break;
            case 23 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:98: T40
                {
                mT40(); 

                }
                break;
            case 24 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:102: T41
                {
                mT41(); 

                }
                break;
            case 25 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:106: T42
                {
                mT42(); 

                }
                break;
            case 26 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:110: T43
                {
                mT43(); 

                }
                break;
            case 27 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:114: T44
                {
                mT44(); 

                }
                break;
            case 28 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:118: T45
                {
                mT45(); 

                }
                break;
            case 29 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:122: T46
                {
                mT46(); 

                }
                break;
            case 30 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:126: T47
                {
                mT47(); 

                }
                break;
            case 31 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:130: T48
                {
                mT48(); 

                }
                break;
            case 32 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:134: T49
                {
                mT49(); 

                }
                break;
            case 33 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:138: T50
                {
                mT50(); 

                }
                break;
            case 34 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:142: T51
                {
                mT51(); 

                }
                break;
            case 35 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:146: T52
                {
                mT52(); 

                }
                break;
            case 36 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:150: T53
                {
                mT53(); 

                }
                break;
            case 37 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:154: T54
                {
                mT54(); 

                }
                break;
            case 38 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:158: T55
                {
                mT55(); 

                }
                break;
            case 39 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:162: T56
                {
                mT56(); 

                }
                break;
            case 40 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:166: T57
                {
                mT57(); 

                }
                break;
            case 41 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:170: T58
                {
                mT58(); 

                }
                break;
            case 42 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:174: T59
                {
                mT59(); 

                }
                break;
            case 43 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:178: T60
                {
                mT60(); 

                }
                break;
            case 44 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:182: T61
                {
                mT61(); 

                }
                break;
            case 45 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:186: T62
                {
                mT62(); 

                }
                break;
            case 46 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:190: T63
                {
                mT63(); 

                }
                break;
            case 47 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:194: T64
                {
                mT64(); 

                }
                break;
            case 48 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:198: T65
                {
                mT65(); 

                }
                break;
            case 49 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:202: T66
                {
                mT66(); 

                }
                break;
            case 50 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:206: T67
                {
                mT67(); 

                }
                break;
            case 51 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:210: T68
                {
                mT68(); 

                }
                break;
            case 52 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:214: T69
                {
                mT69(); 

                }
                break;
            case 53 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:218: T70
                {
                mT70(); 

                }
                break;
            case 54 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:222: T71
                {
                mT71(); 

                }
                break;
            case 55 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:226: T72
                {
                mT72(); 

                }
                break;
            case 56 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:230: T73
                {
                mT73(); 

                }
                break;
            case 57 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:234: T74
                {
                mT74(); 

                }
                break;
            case 58 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:238: T75
                {
                mT75(); 

                }
                break;
            case 59 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:242: T76
                {
                mT76(); 

                }
                break;
            case 60 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:246: T77
                {
                mT77(); 

                }
                break;
            case 61 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:250: T78
                {
                mT78(); 

                }
                break;
            case 62 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:254: T79
                {
                mT79(); 

                }
                break;
            case 63 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:258: T80
                {
                mT80(); 

                }
                break;
            case 64 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:262: T81
                {
                mT81(); 

                }
                break;
            case 65 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:266: IntLiteral
                {
                mIntLiteral(); 

                }
                break;
            case 66 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:277: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 67 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:291: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 68 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:302: WS
                {
                mWS(); 

                }
                break;
            case 69 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:305: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 70 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:313: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 71 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:326: XPAND_TAG_OPEN
                {
                mXPAND_TAG_OPEN(); 

                }
                break;
            case 72 :
                // ../core.expressions/main/src/org/openarchitectureware/xtend/parser/Xtend.g:1:341: XPAND_TAG_CLOSE
                {
                mXPAND_TAG_CLOSE(); 

                }
                break;

        }

    }


 

}