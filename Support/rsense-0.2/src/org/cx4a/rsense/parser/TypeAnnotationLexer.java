// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g 2010-03-21 00:25:02

package org.cx4a.rsense.parser;

import org.cx4a.rsense.typing.annotation.TypeAnnotation;
import org.cx4a.rsense.typing.annotation.MethodType;
import org.cx4a.rsense.typing.annotation.TypeExpression;
import org.cx4a.rsense.typing.annotation.TypeVariable;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TypeAnnotationLexer extends Lexer {
    public static final int T__12=12;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__13=13;
    public static final int CONST_ID=5;
    public static final int T__21=21;
    public static final int T__19=19;
    public static final int METHOD_NAME_UNQUOTED=7;
    public static final int T__9=9;
    public static final int T__14=14;
    public static final int T__11=11;
    public static final int T__22=22;
    public static final int T__17=17;
    public static final int EOF=-1;
    public static final int T__16=16;
    public static final int T__24=24;
    public static final int T__10=10;
    public static final int WHITEESPACE=8;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int METHOD_NAME=6;
    public static final int T__18=18;
    public static final int T__15=15;
    public static final int ID=4;

    // delegates
    // delegators

    public TypeAnnotationLexer() {;} 
    public TypeAnnotationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TypeAnnotationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:12:6: ( '::' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:12:8: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:13:7: ( '.' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:14:7: ( '<' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:14:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:15:7: ( '|' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:15:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:16:7: ( '>' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:16:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:17:7: ( '(' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:18:7: ( ')' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:19:7: ( '->' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:19:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:20:7: ( '{' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:21:7: ( '}' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:21:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:22:7: ( '<=' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:22:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:23:7: ( ',' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:24:7: ( '!nobody' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:24:9: '!nobody'
            {
            match("!nobody"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:25:7: ( '[' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:25:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:26:7: ( ']' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:26:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:27:7: ( '?' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:27:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:28:7: ( '*' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:28:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:29:7: ( 'or' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:29:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:188:5: ( ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ( '\\'' )* )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:188:7: ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ( '\\'' )*
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:188:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:188:56: ( '\\'' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:188:56: '\\''
            	    {
            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "CONST_ID"
    public final void mCONST_ID() throws RecognitionException {
        try {
            int _type = CONST_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:192:5: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:192:7: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            matchRange('A','Z'); 
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:192:16: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST_ID"

    // $ANTLR start "METHOD_NAME"
    public final void mMETHOD_NAME() throws RecognitionException {
        try {
            int _type = METHOD_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:196:5: ( '\"' METHOD_NAME_UNQUOTED '\"' | METHOD_NAME_UNQUOTED )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='!'||(LA4_0>='%' && LA4_0<='&')||(LA4_0>='*' && LA4_0<='+')||(LA4_0>='-' && LA4_0<='/')||LA4_0==':'||(LA4_0>='<' && LA4_0<='>')||(LA4_0>='A' && LA4_0<='[')||(LA4_0>='^' && LA4_0<='z')||LA4_0=='|'||LA4_0=='~') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:196:7: '\"' METHOD_NAME_UNQUOTED '\"'
                    {
                    match('\"'); 
                    mMETHOD_NAME_UNQUOTED(); 
                    match('\"'); 

                    }
                    break;
                case 2 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:197:7: METHOD_NAME_UNQUOTED
                    {
                    mMETHOD_NAME_UNQUOTED(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "METHOD_NAME"

    // $ANTLR start "METHOD_NAME_UNQUOTED"
    public final void mMETHOD_NAME_UNQUOTED() throws RecognitionException {
        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:201:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ( '!' | '?' | '=' )? | ( '..' | '...' ) | ( '+' | '+@' ) | ( '-' | '-@' ) | ( '*' | '**' ) | '/' | '%' | '|' | '^' | '&' | ( '<' | '<<' | '<=' | '<=>' ) | ( '>' | '>>' | '>=' ) | ( '=' | '==' | '===' | '=~' ) | ( '!' | '!=' | '!~' | '!@' ) | ( '~' | '~@' ) | ( '[]' | '[]=' ) | '::' | '`' )
            int alt17=18;
            switch ( input.LA(1) ) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt17=1;
                }
                break;
            case '.':
                {
                alt17=2;
                }
                break;
            case '+':
                {
                alt17=3;
                }
                break;
            case '-':
                {
                alt17=4;
                }
                break;
            case '*':
                {
                alt17=5;
                }
                break;
            case '/':
                {
                alt17=6;
                }
                break;
            case '%':
                {
                alt17=7;
                }
                break;
            case '|':
                {
                alt17=8;
                }
                break;
            case '^':
                {
                alt17=9;
                }
                break;
            case '&':
                {
                alt17=10;
                }
                break;
            case '<':
                {
                alt17=11;
                }
                break;
            case '>':
                {
                alt17=12;
                }
                break;
            case '=':
                {
                alt17=13;
                }
                break;
            case '!':
                {
                alt17=14;
                }
                break;
            case '~':
                {
                alt17=15;
                }
                break;
            case '[':
                {
                alt17=16;
                }
                break;
            case ':':
                {
                alt17=17;
                }
                break;
            case '`':
                {
                alt17=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:201:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* ( '!' | '?' | '=' )?
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:201:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:201:65: ( '!' | '?' | '=' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='!'||LA6_0=='='||LA6_0=='?') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:
                            {
                            if ( input.LA(1)=='!'||input.LA(1)=='='||input.LA(1)=='?' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:202:7: ( '..' | '...' )
                    {
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:202:7: ( '..' | '...' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='.') ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1=='.') ) {
                            int LA7_2 = input.LA(3);

                            if ( (LA7_2=='.') ) {
                                alt7=2;
                            }
                            else {
                                alt7=1;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:202:8: '..'
                            {
                            match(".."); 


                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:202:13: '...'
                            {
                            match("..."); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:203:7: ( '+' | '+@' )
                    {
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:203:7: ( '+' | '+@' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+') ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1=='@') ) {
                            alt8=2;
                        }
                        else {
                            alt8=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:203:8: '+'
                            {
                            match('+'); 

                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:203:12: '+@'
                            {
                            match("+@"); 


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:204:7: ( '-' | '-@' )
                    {
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:204:7: ( '-' | '-@' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='-') ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1=='@') ) {
                            alt9=2;
                        }
                        else {
                            alt9=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:204:8: '-'
                            {
                            match('-'); 

                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:204:12: '-@'
                            {
                            match("-@"); 


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:205:7: ( '*' | '**' )
                    {
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:205:7: ( '*' | '**' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='*') ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1=='*') ) {
                            alt10=2;
                        }
                        else {
                            alt10=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:205:8: '*'
                            {
                            match('*'); 

                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:205:12: '**'
                            {
                            match("**"); 


                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:206:7: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 7 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:207:7: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 8 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:208:7: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 9 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:209:7: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 10 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:210:7: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 11 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:211:7: ( '<' | '<<' | '<=' | '<=>' )
                    {
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:211:7: ( '<' | '<<' | '<=' | '<=>' )
                    int alt11=4;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='<') ) {
                        switch ( input.LA(2) ) {
                        case '<':
                            {
                            alt11=2;
                            }
                            break;
                        case '=':
                            {
                            int LA11_3 = input.LA(3);

                            if ( (LA11_3=='>') ) {
                                alt11=4;
                            }
                            else {
                                alt11=3;}
                            }
                            break;
                        default:
                            alt11=1;}

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:211:8: '<'
                            {
                            match('<'); 

                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:211:12: '<<'
                            {
                            match("<<"); 


                            }
                            break;
                        case 3 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:211:17: '<='
                            {
                            match("<="); 


                            }
                            break;
                        case 4 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:211:22: '<=>'
                            {
                            match("<=>"); 


                            }
                            break;

                    }


                    }
                    break;
                case 12 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:212:7: ( '>' | '>>' | '>=' )
                    {
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:212:7: ( '>' | '>>' | '>=' )
                    int alt12=3;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='>') ) {
                        switch ( input.LA(2) ) {
                        case '>':
                            {
                            alt12=2;
                            }
                            break;
                        case '=':
                            {
                            alt12=3;
                            }
                            break;
                        default:
                            alt12=1;}

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:212:8: '>'
                            {
                            match('>'); 

                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:212:12: '>>'
                            {
                            match(">>"); 


                            }
                            break;
                        case 3 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:212:17: '>='
                            {
                            match(">="); 


                            }
                            break;

                    }


                    }
                    break;
                case 13 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:213:7: ( '=' | '==' | '===' | '=~' )
                    {
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:213:7: ( '=' | '==' | '===' | '=~' )
                    int alt13=4;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='=') ) {
                        switch ( input.LA(2) ) {
                        case '=':
                            {
                            int LA13_2 = input.LA(3);

                            if ( (LA13_2=='=') ) {
                                alt13=3;
                            }
                            else {
                                alt13=2;}
                            }
                            break;
                        case '~':
                            {
                            alt13=4;
                            }
                            break;
                        default:
                            alt13=1;}

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:213:8: '='
                            {
                            match('='); 

                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:213:12: '=='
                            {
                            match("=="); 


                            }
                            break;
                        case 3 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:213:17: '==='
                            {
                            match("==="); 


                            }
                            break;
                        case 4 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:213:23: '=~'
                            {
                            match("=~"); 


                            }
                            break;

                    }


                    }
                    break;
                case 14 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:214:7: ( '!' | '!=' | '!~' | '!@' )
                    {
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:214:7: ( '!' | '!=' | '!~' | '!@' )
                    int alt14=4;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='!') ) {
                        switch ( input.LA(2) ) {
                        case '=':
                            {
                            alt14=2;
                            }
                            break;
                        case '~':
                            {
                            alt14=3;
                            }
                            break;
                        case '@':
                            {
                            alt14=4;
                            }
                            break;
                        default:
                            alt14=1;}

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:214:8: '!'
                            {
                            match('!'); 

                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:214:12: '!='
                            {
                            match("!="); 


                            }
                            break;
                        case 3 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:214:17: '!~'
                            {
                            match("!~"); 


                            }
                            break;
                        case 4 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:214:22: '!@'
                            {
                            match("!@"); 


                            }
                            break;

                    }


                    }
                    break;
                case 15 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:215:7: ( '~' | '~@' )
                    {
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:215:7: ( '~' | '~@' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='~') ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1=='@') ) {
                            alt15=2;
                        }
                        else {
                            alt15=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:215:8: '~'
                            {
                            match('~'); 

                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:215:12: '~@'
                            {
                            match("~@"); 


                            }
                            break;

                    }


                    }
                    break;
                case 16 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:216:7: ( '[]' | '[]=' )
                    {
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:216:7: ( '[]' | '[]=' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='[') ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==']') ) {
                            int LA16_2 = input.LA(3);

                            if ( (LA16_2=='=') ) {
                                alt16=2;
                            }
                            else {
                                alt16=1;}
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:216:8: '[]'
                            {
                            match("[]"); 


                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:216:13: '[]='
                            {
                            match("[]="); 


                            }
                            break;

                    }


                    }
                    break;
                case 17 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:217:7: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 18 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:218:7: '`'
                    {
                    match('`'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "METHOD_NAME_UNQUOTED"

    // $ANTLR start "WHITEESPACE"
    public final void mWHITEESPACE() throws RecognitionException {
        try {
            int _type = WHITEESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:221:13: ( ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' ) )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:221:15: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITEESPACE"

    public void mTokens() throws RecognitionException {
        // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | CONST_ID | METHOD_NAME | WHITEESPACE )
        int alt18=22;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:117: ID
                {
                mID(); 

                }
                break;
            case 20 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:120: CONST_ID
                {
                mCONST_ID(); 

                }
                break;
            case 21 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:129: METHOD_NAME
                {
                mMETHOD_NAME(); 

                }
                break;
            case 22 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:1:141: WHITEESPACE
                {
                mWHITEESPACE(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\2\uffff\1\27\1\31\1\uffff\1\33\2\uffff\1\24\3\uffff\1\24\1\36\2"+
        "\uffff\1\37\2\42\1\44\4\uffff\1\46\7\uffff\1\47\1\42\1\uffff\1\44"+
        "\4\uffff";
    static final String DFA18_eofS =
        "\50\uffff";
    static final String DFA18_minS =
        "\1\11\1\72\1\56\1\74\1\uffff\1\75\2\uffff\1\76\3\uffff\1\156\1\135"+
        "\2\uffff\1\52\3\41\4\uffff\1\76\7\uffff\2\41\1\uffff\1\41\4\uffff";
    static final String DFA18_maxS =
        "\1\176\1\72\1\56\1\75\1\uffff\1\76\2\uffff\1\76\3\uffff\1\156\1"+
        "\135\2\uffff\1\52\3\172\4\uffff\1\76\7\uffff\2\172\1\uffff\1\172"+
        "\4\uffff";
    static final String DFA18_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\1\uffff\1\11\1\12\1\14\2\uffff\1\17"+
        "\1\20\4\uffff\1\25\1\26\1\1\1\2\1\uffff\1\3\1\4\1\5\1\10\1\15\1"+
        "\16\1\21\2\uffff\1\23\1\uffff\1\24\1\1\1\13\1\22";
    static final String DFA18_specialS =
        "\50\uffff}>";
    static final String[] DFA18_transitionS = {
            "\2\25\1\uffff\2\25\22\uffff\1\25\1\14\1\24\2\uffff\2\24\1\uffff"+
            "\1\6\1\7\1\20\1\24\1\13\1\10\1\2\1\24\12\uffff\1\1\1\uffff\1"+
            "\3\1\24\1\5\1\17\1\uffff\32\23\1\15\1\uffff\1\16\1\24\1\22\1"+
            "\24\16\22\1\21\13\22\1\11\1\4\1\12\1\24",
            "\1\26",
            "\1\24",
            "\1\24\1\30",
            "",
            "\2\24",
            "",
            "",
            "\1\34",
            "",
            "",
            "",
            "\1\35",
            "\1\24",
            "",
            "",
            "\1\24",
            "\1\24\16\uffff\12\41\3\uffff\1\24\1\uffff\1\24\1\uffff\32\41"+
            "\4\uffff\1\41\1\uffff\21\41\1\40\10\41",
            "\1\24\16\uffff\12\41\3\uffff\1\24\1\uffff\1\24\1\uffff\32\41"+
            "\4\uffff\1\41\1\uffff\32\41",
            "\1\24\16\uffff\12\43\3\uffff\1\24\1\uffff\1\24\1\uffff\32\43"+
            "\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\1\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24\5\uffff\1\42\10\uffff\12\41\3\uffff\1\24\1\uffff\1\24"+
            "\1\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\24\16\uffff\12\41\3\uffff\1\24\1\uffff\1\24\1\uffff\32\41"+
            "\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\24\16\uffff\12\43\3\uffff\1\24\1\uffff\1\24\1\uffff\32\43"+
            "\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | CONST_ID | METHOD_NAME | WHITEESPACE );";
        }
    }
 

}