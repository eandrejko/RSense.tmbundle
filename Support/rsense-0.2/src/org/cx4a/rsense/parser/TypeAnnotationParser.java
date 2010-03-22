// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g 2010-03-21 00:25:01

package org.cx4a.rsense.parser;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.cx4a.rsense.typing.annotation.TypeAnnotation;
import org.cx4a.rsense.typing.annotation.MethodType;
import org.cx4a.rsense.typing.annotation.ClassType;
import org.cx4a.rsense.typing.annotation.TypeExpression;
import org.cx4a.rsense.typing.annotation.TypeVariable;
import org.cx4a.rsense.typing.annotation.TypeUnion;
import org.cx4a.rsense.typing.annotation.TypeIdentity;
import org.cx4a.rsense.typing.annotation.TypeAny;
import org.cx4a.rsense.typing.annotation.TypeOptional;
import org.cx4a.rsense.typing.annotation.TypeTuple;
import org.cx4a.rsense.typing.annotation.TypeSplat;
import org.cx4a.rsense.typing.annotation.TypeApplication;
import org.cx4a.rsense.typing.annotation.TypeConstraint;
import org.cx4a.rsense.typing.annotation.TypePragma;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class TypeAnnotationParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "CONST_ID", "METHOD_NAME", "METHOD_NAME_UNQUOTED", "WHITEESPACE", "'::'", "'.'", "'<'", "'|'", "'>'", "'('", "')'", "'->'", "'{'", "'}'", "'<='", "','", "'!nobody'", "'['", "']'", "'?'", "'*'", "'or'"
    };
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
    public static final int WHITEESPACE=8;
    public static final int T__10=10;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int METHOD_NAME=6;
    public static final int T__18=18;
    public static final int T__15=15;
    public static final int ID=4;

    // delegates
    // delegators


        public TypeAnnotationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TypeAnnotationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return TypeAnnotationParser.tokenNames; }
    public String getGrammarFileName() { return "/home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g"; }





    // $ANTLR start "type"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:42:1: type returns [TypeAnnotation value] : ( method_type | class_type );
    public final TypeAnnotation type() throws RecognitionException {
        TypeAnnotation value = null;

        MethodType method_type1 = null;

        ClassType class_type2 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:43:5: ( method_type | class_type )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 9:
                {
                int LA1_1 = input.LA(2);

                if ( (synpred1_TypeAnnotation()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case CONST_ID:
                {
                int LA1_2 = input.LA(2);

                if ( (synpred1_TypeAnnotation()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
            case METHOD_NAME:
                {
                alt1=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:43:7: method_type
                    {
                    pushFollow(FOLLOW_method_type_in_type53);
                    method_type1=method_type();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = method_type1; 
                    }

                    }
                    break;
                case 2 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:44:7: class_type
                    {
                    pushFollow(FOLLOW_class_type_in_type63);
                    class_type2=class_type();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = class_type2; 
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
        return value;
    }
    // $ANTLR end "type"


    // $ANTLR start "method_type"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:47:1: method_type returns [MethodType value] : name= ( ( '::' )? ( ( ID | CONST_ID ) ( '.' | '::' ) )* method_name ) ( '<' ( type_var_list )? ( '|' constraint_list )? '>' )? method_sig ;
    public final MethodType method_type() throws RecognitionException {
        MethodType value = null;

        Token name=null;
        List<TypeVariable> type_var_list3 = null;

        List<TypeConstraint> constraint_list4 = null;

        MethodType.Signature method_sig5 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:5: (name= ( ( '::' )? ( ( ID | CONST_ID ) ( '.' | '::' ) )* method_name ) ( '<' ( type_var_list )? ( '|' constraint_list )? '>' )? method_sig )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:7: name= ( ( '::' )? ( ( ID | CONST_ID ) ( '.' | '::' ) )* method_name ) ( '<' ( type_var_list )? ( '|' constraint_list )? '>' )? method_sig
            {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:12: ( ( '::' )? ( ( ID | CONST_ID ) ( '.' | '::' ) )* method_name )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:13: ( '::' )? ( ( ID | CONST_ID ) ( '.' | '::' ) )* method_name
            {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:13: ( '::' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: '::'
                    {
                    match(input,9,FOLLOW_9_in_method_type89); if (state.failed) return value;

                    }
                    break;

            }

            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:19: ( ( ID | CONST_ID ) ( '.' | '::' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=ID && LA3_0<=CONST_ID)) ) {
                    int LA3_1 = input.LA(2);

                    if ( (synpred5_TypeAnnotation()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:20: ( ID | CONST_ID ) ( '.' | '::' )
            	    {
            	    if ( (input.LA(1)>=ID && input.LA(1)<=CONST_ID) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return value;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    if ( (input.LA(1)>=9 && input.LA(1)<=10) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return value;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_method_name_in_method_type107);
            method_name();

            state._fsp--;
            if (state.failed) return value;

            }

            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:60: ( '<' ( type_var_list )? ( '|' constraint_list )? '>' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:61: '<' ( type_var_list )? ( '|' constraint_list )? '>'
                    {
                    match(input,11,FOLLOW_11_in_method_type111); if (state.failed) return value;
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:65: ( type_var_list )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ID) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: type_var_list
                            {
                            pushFollow(FOLLOW_type_var_list_in_method_type113);
                            type_var_list3=type_var_list();

                            state._fsp--;
                            if (state.failed) return value;

                            }
                            break;

                    }

                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:80: ( '|' constraint_list )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==12) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:81: '|' constraint_list
                            {
                            match(input,12,FOLLOW_12_in_method_type117); if (state.failed) return value;
                            pushFollow(FOLLOW_constraint_list_in_method_type119);
                            constraint_list4=constraint_list();

                            state._fsp--;
                            if (state.failed) return value;

                            }
                            break;

                    }

                    match(input,13,FOLLOW_13_in_method_type123); if (state.failed) return value;

                    }
                    break;

            }

            pushFollow(FOLLOW_method_sig_in_method_type127);
            method_sig5=method_sig();

            state._fsp--;
            if (state.failed) return value;
            if ( state.backtracking==0 ) {

                          value = new MethodType((name!=null?name.getText():null), type_var_list3, constraint_list4, method_sig5);
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "method_type"


    // $ANTLR start "method_sig"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:53:1: method_sig returns [MethodType.Signature value] : ( '(' ')' ( block )? '->' type_expr | t1= type_expr ( block )? '->' t2= type_expr );
    public final MethodType.Signature method_sig() throws RecognitionException {
        MethodType.Signature value = null;

        TypeExpression t1 = null;

        TypeExpression t2 = null;

        MethodType.Block block6 = null;

        TypeExpression type_expr7 = null;

        MethodType.Block block8 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:54:5: ( '(' ')' ( block )? '->' type_expr | t1= type_expr ( block )? '->' t2= type_expr )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==15) ) {
                    alt9=1;
                }
                else if ( ((LA9_1>=ID && LA9_1<=CONST_ID)||LA9_1==9||LA9_1==14||LA9_1==22||(LA9_1>=24 && LA9_1<=25)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA9_0>=ID && LA9_0<=CONST_ID)||LA9_0==9||LA9_0==22||(LA9_0>=24 && LA9_0<=25)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:54:7: '(' ')' ( block )? '->' type_expr
                    {
                    match(input,14,FOLLOW_14_in_method_sig150); if (state.failed) return value;
                    match(input,15,FOLLOW_15_in_method_sig152); if (state.failed) return value;
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:54:15: ( block )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==17) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_method_sig154);
                            block6=block();

                            state._fsp--;
                            if (state.failed) return value;

                            }
                            break;

                    }

                    match(input,16,FOLLOW_16_in_method_sig157); if (state.failed) return value;
                    pushFollow(FOLLOW_type_expr_in_method_sig159);
                    type_expr7=type_expr();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = new MethodType.Signature(null, block6, type_expr7); 
                    }

                    }
                    break;
                case 2 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:55:7: t1= type_expr ( block )? '->' t2= type_expr
                    {
                    pushFollow(FOLLOW_type_expr_in_method_sig171);
                    t1=type_expr();

                    state._fsp--;
                    if (state.failed) return value;
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:55:20: ( block )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==17) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_method_sig173);
                            block8=block();

                            state._fsp--;
                            if (state.failed) return value;

                            }
                            break;

                    }

                    match(input,16,FOLLOW_16_in_method_sig176); if (state.failed) return value;
                    pushFollow(FOLLOW_type_expr_in_method_sig180);
                    t2=type_expr();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = new MethodType.Signature(t1, block8, t2); 
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
        return value;
    }
    // $ANTLR end "method_sig"


    // $ANTLR start "block"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:58:1: block returns [MethodType.Block value] : '{' method_sig '}' ;
    public final MethodType.Block block() throws RecognitionException {
        MethodType.Block value = null;

        MethodType.Signature method_sig9 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:59:5: ( '{' method_sig '}' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:59:7: '{' method_sig '}'
            {
            match(input,17,FOLLOW_17_in_block203); if (state.failed) return value;
            pushFollow(FOLLOW_method_sig_in_block205);
            method_sig9=method_sig();

            state._fsp--;
            if (state.failed) return value;
            match(input,18,FOLLOW_18_in_block207); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new MethodType.Block(method_sig9); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "block"


    // $ANTLR start "method_name"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:62:1: method_name : ( METHOD_NAME | ID | CONST_ID );
    public final void method_name() throws RecognitionException {
        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:63:5: ( METHOD_NAME | ID | CONST_ID )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:
            {
            if ( (input.LA(1)>=ID && input.LA(1)<=METHOD_NAME) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
        return ;
    }
    // $ANTLR end "method_name"


    // $ANTLR start "class_type"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:68:1: class_type returns [ClassType value] : name= ( ( '::' )? ( CONST_ID '::' )* CONST_ID ) ( '<' ( type_var_list )? ( '|' constraint_list )? '>' )? ( pragma_list )? ;
    public final ClassType class_type() throws RecognitionException {
        ClassType value = null;

        Token name=null;
        List<TypeVariable> type_var_list10 = null;

        List<TypeConstraint> constraint_list11 = null;

        List<TypePragma> pragma_list12 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:5: (name= ( ( '::' )? ( CONST_ID '::' )* CONST_ID ) ( '<' ( type_var_list )? ( '|' constraint_list )? '>' )? ( pragma_list )? )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:7: name= ( ( '::' )? ( CONST_ID '::' )* CONST_ID ) ( '<' ( type_var_list )? ( '|' constraint_list )? '>' )? ( pragma_list )?
            {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:12: ( ( '::' )? ( CONST_ID '::' )* CONST_ID )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:13: ( '::' )? ( CONST_ID '::' )* CONST_ID
            {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:13: ( '::' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==9) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: '::'
                    {
                    match(input,9,FOLLOW_9_in_class_type266); if (state.failed) return value;

                    }
                    break;

            }

            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:19: ( CONST_ID '::' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CONST_ID) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==9) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:20: CONST_ID '::'
            	    {
            	    match(input,CONST_ID,FOLLOW_CONST_ID_in_class_type270); if (state.failed) return value;
            	    match(input,9,FOLLOW_9_in_class_type272); if (state.failed) return value;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,CONST_ID,FOLLOW_CONST_ID_in_class_type276); if (state.failed) return value;

            }

            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:46: ( '<' ( type_var_list )? ( '|' constraint_list )? '>' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==11) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:47: '<' ( type_var_list )? ( '|' constraint_list )? '>'
                    {
                    match(input,11,FOLLOW_11_in_class_type280); if (state.failed) return value;
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:51: ( type_var_list )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: type_var_list
                            {
                            pushFollow(FOLLOW_type_var_list_in_class_type282);
                            type_var_list10=type_var_list();

                            state._fsp--;
                            if (state.failed) return value;

                            }
                            break;

                    }

                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:66: ( '|' constraint_list )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==12) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:67: '|' constraint_list
                            {
                            match(input,12,FOLLOW_12_in_class_type286); if (state.failed) return value;
                            pushFollow(FOLLOW_constraint_list_in_class_type288);
                            constraint_list11=constraint_list();

                            state._fsp--;
                            if (state.failed) return value;

                            }
                            break;

                    }

                    match(input,13,FOLLOW_13_in_class_type292); if (state.failed) return value;

                    }
                    break;

            }

            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:69:95: ( pragma_list )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: pragma_list
                    {
                    pushFollow(FOLLOW_pragma_list_in_class_type296);
                    pragma_list12=pragma_list();

                    state._fsp--;
                    if (state.failed) return value;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          value = new ClassType((name!=null?name.getText():null), type_var_list10, constraint_list11, pragma_list12);
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "class_type"


    // $ANTLR start "constraint_list"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:74:1: constraint_list returns [List<TypeConstraint> value] : e1= type_expr '<=' e2= type_expr ( ',' rest= constraint_list )? ;
    public final List<TypeConstraint> constraint_list() throws RecognitionException {
        List<TypeConstraint> value = null;

        TypeExpression e1 = null;

        TypeExpression e2 = null;

        List<TypeConstraint> rest = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:75:5: (e1= type_expr '<=' e2= type_expr ( ',' rest= constraint_list )? )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:75:7: e1= type_expr '<=' e2= type_expr ( ',' rest= constraint_list )?
            {
            pushFollow(FOLLOW_type_expr_in_constraint_list322);
            e1=type_expr();

            state._fsp--;
            if (state.failed) return value;
            match(input,19,FOLLOW_19_in_constraint_list324); if (state.failed) return value;
            pushFollow(FOLLOW_type_expr_in_constraint_list328);
            e2=type_expr();

            state._fsp--;
            if (state.failed) return value;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:75:38: ( ',' rest= constraint_list )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:75:39: ',' rest= constraint_list
                    {
                    match(input,20,FOLLOW_20_in_constraint_list331); if (state.failed) return value;
                    pushFollow(FOLLOW_constraint_list_in_constraint_list335);
                    rest=constraint_list();

                    state._fsp--;
                    if (state.failed) return value;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          value = new ArrayList<TypeConstraint>();
                          value.add(new TypeConstraint(TypeExpression.Type.SUBTYPE_CONS, e1, e2));
                          if (rest != null) {
                              value.addAll(rest);
                          }
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "constraint_list"


    // $ANTLR start "pragma_list"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:84:1: pragma_list returns [List<TypePragma> value] : pragma ( ',' rest= pragma_list )? ;
    public final List<TypePragma> pragma_list() throws RecognitionException {
        List<TypePragma> value = null;

        List<TypePragma> rest = null;

        TypePragma pragma13 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:85:5: ( pragma ( ',' rest= pragma_list )? )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:85:7: pragma ( ',' rest= pragma_list )?
            {
            pushFollow(FOLLOW_pragma_in_pragma_list360);
            pragma13=pragma();

            state._fsp--;
            if (state.failed) return value;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:85:14: ( ',' rest= pragma_list )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:85:15: ',' rest= pragma_list
                    {
                    match(input,20,FOLLOW_20_in_pragma_list363); if (state.failed) return value;
                    pushFollow(FOLLOW_pragma_list_in_pragma_list367);
                    rest=pragma_list();

                    state._fsp--;
                    if (state.failed) return value;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          value = new ArrayList<TypePragma>();
                          value.add(pragma13);
                          if (rest != null) {
                              value.addAll(rest);
                          }
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "pragma_list"


    // $ANTLR start "pragma"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:94:1: pragma returns [TypePragma value] : '!nobody' ;
    public final TypePragma pragma() throws RecognitionException {
        TypePragma value = null;

        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:95:5: ( '!nobody' )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:95:7: '!nobody'
            {
            match(input,21,FOLLOW_21_in_pragma392); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new TypePragma(TypeExpression.Type.NOBODY_PRAGMA); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "pragma"


    // $ANTLR start "type_expr"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:98:1: type_expr returns [TypeExpression value] : single_type_expr ( or_type_list )? ;
    public final TypeExpression type_expr() throws RecognitionException {
        TypeExpression value = null;

        List<TypeExpression> or_type_list14 = null;

        TypeExpression single_type_expr15 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:99:5: ( single_type_expr ( or_type_list )? )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:99:7: single_type_expr ( or_type_list )?
            {
            pushFollow(FOLLOW_single_type_expr_in_type_expr415);
            single_type_expr15=single_type_expr();

            state._fsp--;
            if (state.failed) return value;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:99:24: ( or_type_list )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: or_type_list
                    {
                    pushFollow(FOLLOW_or_type_list_in_type_expr417);
                    or_type_list14=or_type_list();

                    state._fsp--;
                    if (state.failed) return value;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          if (or_type_list14 != null) {
                              TypeUnion union = new TypeUnion();
                              union.add(single_type_expr15);
                              union.addAll(or_type_list14);
                              value = union;
                          } else {
                              value = single_type_expr15;
                          }
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "type_expr"


    // $ANTLR start "type_expr_comma_list"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:111:1: type_expr_comma_list returns [List<TypeExpression> value] : type_expr ( ',' rest= type_expr_comma_list )? ;
    public final List<TypeExpression> type_expr_comma_list() throws RecognitionException {
        List<TypeExpression> value = null;

        List<TypeExpression> rest = null;

        TypeExpression type_expr16 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:112:5: ( type_expr ( ',' rest= type_expr_comma_list )? )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:112:7: type_expr ( ',' rest= type_expr_comma_list )?
            {
            pushFollow(FOLLOW_type_expr_in_type_expr_comma_list441);
            type_expr16=type_expr();

            state._fsp--;
            if (state.failed) return value;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:112:17: ( ',' rest= type_expr_comma_list )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:112:18: ',' rest= type_expr_comma_list
                    {
                    match(input,20,FOLLOW_20_in_type_expr_comma_list444); if (state.failed) return value;
                    pushFollow(FOLLOW_type_expr_comma_list_in_type_expr_comma_list448);
                    rest=type_expr_comma_list();

                    state._fsp--;
                    if (state.failed) return value;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          value = new ArrayList<TypeExpression>();
                          value.add(type_expr16);
                          if (rest != null) {
                              value.addAll(rest);
                          }
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "type_expr_comma_list"


    // $ANTLR start "tuple"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:121:1: tuple returns [TypeTuple value] : ( '(' type_expr_comma_list ')' | '[' type_expr_comma_list ']' );
    public final TypeTuple tuple() throws RecognitionException {
        TypeTuple value = null;

        List<TypeExpression> type_expr_comma_list17 = null;

        List<TypeExpression> type_expr_comma_list18 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:122:5: ( '(' type_expr_comma_list ')' | '[' type_expr_comma_list ']' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==14) ) {
                alt20=1;
            }
            else if ( (LA20_0==22) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:122:7: '(' type_expr_comma_list ')'
                    {
                    match(input,14,FOLLOW_14_in_tuple481); if (state.failed) return value;
                    pushFollow(FOLLOW_type_expr_comma_list_in_tuple483);
                    type_expr_comma_list17=type_expr_comma_list();

                    state._fsp--;
                    if (state.failed) return value;
                    match(input,15,FOLLOW_15_in_tuple485); if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                                  value = new TypeTuple(type_expr_comma_list17);
                              
                    }

                    }
                    break;
                case 2 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:125:7: '[' type_expr_comma_list ']'
                    {
                    match(input,22,FOLLOW_22_in_tuple495); if (state.failed) return value;
                    pushFollow(FOLLOW_type_expr_comma_list_in_tuple497);
                    type_expr_comma_list18=type_expr_comma_list();

                    state._fsp--;
                    if (state.failed) return value;
                    match(input,23,FOLLOW_23_in_tuple499); if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       // syntax sugar
                                  value = new TypeTuple(type_expr_comma_list18);
                              
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
        return value;
    }
    // $ANTLR end "tuple"


    // $ANTLR start "single_type_expr"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:130:1: single_type_expr returns [TypeExpression value] : ( type_var | type_ident ( '<' type_expr_comma_list '>' )? | tuple | '?' ( (expr= single_type_expr )? | '(' expr= type_expr ')' ) | '*' (expr= single_type_expr | '(' expr= type_expr ')' ) );
    public final TypeExpression single_type_expr() throws RecognitionException {
        TypeExpression value = null;

        TypeExpression expr = null;

        TypeVariable type_var19 = null;

        List<TypeExpression> type_expr_comma_list20 = null;

        TypeIdentity type_ident21 = null;

        TypeTuple tuple22 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:131:5: ( type_var | type_ident ( '<' type_expr_comma_list '>' )? | tuple | '?' ( (expr= single_type_expr )? | '(' expr= type_expr ')' ) | '*' (expr= single_type_expr | '(' expr= type_expr ')' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt25=1;
                }
                break;
            case CONST_ID:
            case 9:
                {
                alt25=2;
                }
                break;
            case 14:
            case 22:
                {
                alt25=3;
                }
                break;
            case 24:
                {
                alt25=4;
                }
                break;
            case 25:
                {
                alt25=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:131:7: type_var
                    {
                    pushFollow(FOLLOW_type_var_in_single_type_expr522);
                    type_var19=type_var();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = type_var19; 
                    }

                    }
                    break;
                case 2 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:132:7: type_ident ( '<' type_expr_comma_list '>' )?
                    {
                    pushFollow(FOLLOW_type_ident_in_single_type_expr532);
                    type_ident21=type_ident();

                    state._fsp--;
                    if (state.failed) return value;
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:132:18: ( '<' type_expr_comma_list '>' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==11) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:132:19: '<' type_expr_comma_list '>'
                            {
                            match(input,11,FOLLOW_11_in_single_type_expr535); if (state.failed) return value;
                            pushFollow(FOLLOW_type_expr_comma_list_in_single_type_expr537);
                            type_expr_comma_list20=type_expr_comma_list();

                            state._fsp--;
                            if (state.failed) return value;
                            match(input,13,FOLLOW_13_in_single_type_expr539); if (state.failed) return value;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                                  if (type_expr_comma_list20 != null) {
                                      value = new TypeApplication(type_ident21, type_expr_comma_list20);
                                  } else {
                                      value = type_ident21;
                                  }
                              
                    }

                    }
                    break;
                case 3 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:139:7: tuple
                    {
                    pushFollow(FOLLOW_tuple_in_single_type_expr551);
                    tuple22=tuple();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {
                       value = tuple22; 
                    }

                    }
                    break;
                case 4 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:140:7: '?' ( (expr= single_type_expr )? | '(' expr= type_expr ')' )
                    {
                    match(input,24,FOLLOW_24_in_single_type_expr561); if (state.failed) return value;
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:140:11: ( (expr= single_type_expr )? | '(' expr= type_expr ')' )
                    int alt23=2;
                    alt23 = dfa23.predict(input);
                    switch (alt23) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:140:12: (expr= single_type_expr )?
                            {
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:140:16: (expr= single_type_expr )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( ((LA22_0>=ID && LA22_0<=CONST_ID)||LA22_0==9||LA22_0==14||LA22_0==22||(LA22_0>=24 && LA22_0<=25)) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: expr= single_type_expr
                                    {
                                    pushFollow(FOLLOW_single_type_expr_in_single_type_expr566);
                                    expr=single_type_expr();

                                    state._fsp--;
                                    if (state.failed) return value;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:140:37: '(' expr= type_expr ')'
                            {
                            match(input,14,FOLLOW_14_in_single_type_expr571); if (state.failed) return value;
                            pushFollow(FOLLOW_type_expr_in_single_type_expr575);
                            expr=type_expr();

                            state._fsp--;
                            if (state.failed) return value;
                            match(input,15,FOLLOW_15_in_single_type_expr577); if (state.failed) return value;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                                  if (expr != null) {
                                      value = new TypeOptional(expr);
                                  } else {
                                      value = new TypeAny();
                                  }
                              
                    }

                    }
                    break;
                case 5 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:147:7: '*' (expr= single_type_expr | '(' expr= type_expr ')' )
                    {
                    match(input,25,FOLLOW_25_in_single_type_expr588); if (state.failed) return value;
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:147:11: (expr= single_type_expr | '(' expr= type_expr ')' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=ID && LA24_0<=CONST_ID)||LA24_0==9||LA24_0==22||(LA24_0>=24 && LA24_0<=25)) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==14) ) {
                        int LA24_4 = input.LA(2);

                        if ( (synpred32_TypeAnnotation()) ) {
                            alt24=1;
                        }
                        else if ( (true) ) {
                            alt24=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:147:12: expr= single_type_expr
                            {
                            pushFollow(FOLLOW_single_type_expr_in_single_type_expr593);
                            expr=single_type_expr();

                            state._fsp--;
                            if (state.failed) return value;

                            }
                            break;
                        case 2 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:147:36: '(' expr= type_expr ')'
                            {
                            match(input,14,FOLLOW_14_in_single_type_expr597); if (state.failed) return value;
                            pushFollow(FOLLOW_type_expr_in_single_type_expr601);
                            expr=type_expr();

                            state._fsp--;
                            if (state.failed) return value;
                            match(input,15,FOLLOW_15_in_single_type_expr603); if (state.failed) return value;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       value = new TypeSplat(expr); 
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
        return value;
    }
    // $ANTLR end "single_type_expr"


    // $ANTLR start "or_type_list"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:150:1: or_type_list returns [List<TypeExpression> value] : 'or' single_type_expr (rest= or_type_list )? ;
    public final List<TypeExpression> or_type_list() throws RecognitionException {
        List<TypeExpression> value = null;

        List<TypeExpression> rest = null;

        TypeExpression single_type_expr23 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:151:5: ( 'or' single_type_expr (rest= or_type_list )? )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:151:7: 'or' single_type_expr (rest= or_type_list )?
            {
            match(input,26,FOLLOW_26_in_or_type_list627); if (state.failed) return value;
            pushFollow(FOLLOW_single_type_expr_in_or_type_list629);
            single_type_expr23=single_type_expr();

            state._fsp--;
            if (state.failed) return value;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:151:33: (rest= or_type_list )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: rest= or_type_list
                    {
                    pushFollow(FOLLOW_or_type_list_in_or_type_list633);
                    rest=or_type_list();

                    state._fsp--;
                    if (state.failed) return value;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          value = new ArrayList<TypeExpression>();
                          value.add(single_type_expr23);
                          if (rest != null) {
                              value.addAll(rest);
                          }
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "or_type_list"


    // $ANTLR start "type_ident"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:160:1: type_ident returns [TypeIdentity value] : ( CONST_ID ( '::' id= type_ident )? | '::' id= type_ident );
    public final TypeIdentity type_ident() throws RecognitionException {
        TypeIdentity value = null;

        Token CONST_ID24=null;
        TypeIdentity id = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:161:5: ( CONST_ID ( '::' id= type_ident )? | '::' id= type_ident )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CONST_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==9) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:161:7: CONST_ID ( '::' id= type_ident )?
                    {
                    CONST_ID24=(Token)match(input,CONST_ID,FOLLOW_CONST_ID_in_type_ident657); if (state.failed) return value;
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:161:16: ( '::' id= type_ident )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==9) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:161:17: '::' id= type_ident
                            {
                            match(input,9,FOLLOW_9_in_type_ident660); if (state.failed) return value;
                            pushFollow(FOLLOW_type_ident_in_type_ident664);
                            id=type_ident();

                            state._fsp--;
                            if (state.failed) return value;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                                  if (id != null) {
                                      value = TypeIdentity.newScopedIdentity((CONST_ID24!=null?CONST_ID24.getText():null), id);
                                  } else {
                                      value = TypeIdentity.newRelativeIdentity((CONST_ID24!=null?CONST_ID24.getText():null));
                                  }
                              
                    }

                    }
                    break;
                case 2 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:168:7: '::' id= type_ident
                    {
                    match(input,9,FOLLOW_9_in_type_ident676); if (state.failed) return value;
                    pushFollow(FOLLOW_type_ident_in_type_ident680);
                    id=type_ident();

                    state._fsp--;
                    if (state.failed) return value;
                    if ( state.backtracking==0 ) {

                                  value = TypeIdentity.newAbsoluteIdentity(id);
                              
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
        return value;
    }
    // $ANTLR end "type_ident"


    // $ANTLR start "type_var"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:173:1: type_var returns [TypeVariable value] : ID ;
    public final TypeVariable type_var() throws RecognitionException {
        TypeVariable value = null;

        Token ID25=null;

        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:174:5: ( ID )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:174:7: ID
            {
            ID25=(Token)match(input,ID,FOLLOW_ID_in_type_var703); if (state.failed) return value;
            if ( state.backtracking==0 ) {
               value = new TypeVariable((ID25!=null?ID25.getText():null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "type_var"


    // $ANTLR start "type_var_list"
    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:177:1: type_var_list returns [List<TypeVariable> value] : type_var ( ',' rest= type_var_list )? ;
    public final List<TypeVariable> type_var_list() throws RecognitionException {
        List<TypeVariable> value = null;

        List<TypeVariable> rest = null;

        TypeVariable type_var26 = null;


        try {
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:178:5: ( type_var ( ',' rest= type_var_list )? )
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:178:7: type_var ( ',' rest= type_var_list )?
            {
            pushFollow(FOLLOW_type_var_in_type_var_list726);
            type_var26=type_var();

            state._fsp--;
            if (state.failed) return value;
            // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:178:16: ( ',' rest= type_var_list )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:178:17: ',' rest= type_var_list
                    {
                    match(input,20,FOLLOW_20_in_type_var_list729); if (state.failed) return value;
                    pushFollow(FOLLOW_type_var_list_in_type_var_list733);
                    rest=type_var_list();

                    state._fsp--;
                    if (state.failed) return value;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                          value = new ArrayList<TypeVariable>();
                          value.add(type_var26);
                          if (rest != null) {
                              value.addAll(rest);
                          }
                      
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "type_var_list"

    // $ANTLR start synpred1_TypeAnnotation
    public final void synpred1_TypeAnnotation_fragment() throws RecognitionException {   
        // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:43:7: ( method_type )
        // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:43:7: method_type
        {
        pushFollow(FOLLOW_method_type_in_synpred1_TypeAnnotation53);
        method_type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_TypeAnnotation

    // $ANTLR start synpred5_TypeAnnotation
    public final void synpred5_TypeAnnotation_fragment() throws RecognitionException {   
        // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:20: ( ( ID | CONST_ID ) ( '.' | '::' ) )
        // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:48:20: ( ID | CONST_ID ) ( '.' | '::' )
        {
        if ( (input.LA(1)>=ID && input.LA(1)<=CONST_ID) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        if ( (input.LA(1)>=9 && input.LA(1)<=10) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred5_TypeAnnotation

    // $ANTLR start synpred30_TypeAnnotation
    public final void synpred30_TypeAnnotation_fragment() throws RecognitionException {   
        TypeExpression expr = null;


        // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:140:12: ( (expr= single_type_expr )? )
        // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:140:12: (expr= single_type_expr )?
        {
        // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:140:16: (expr= single_type_expr )?
        int alt36=2;
        int LA36_0 = input.LA(1);

        if ( ((LA36_0>=ID && LA36_0<=CONST_ID)||LA36_0==9||LA36_0==14||LA36_0==22||(LA36_0>=24 && LA36_0<=25)) ) {
            alt36=1;
        }
        switch (alt36) {
            case 1 :
                // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:0:0: expr= single_type_expr
                {
                pushFollow(FOLLOW_single_type_expr_in_synpred30_TypeAnnotation566);
                expr=single_type_expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred30_TypeAnnotation

    // $ANTLR start synpred32_TypeAnnotation
    public final void synpred32_TypeAnnotation_fragment() throws RecognitionException {   
        TypeExpression expr = null;


        // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:147:12: (expr= single_type_expr )
        // /home/tomo/src/rsense/src/org/cx4a/rsense/parser/TypeAnnotation.g:147:12: expr= single_type_expr
        {
        pushFollow(FOLLOW_single_type_expr_in_synpred32_TypeAnnotation593);
        expr=single_type_expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_TypeAnnotation

    // Delegated rules

    public final boolean synpred30_TypeAnnotation() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_TypeAnnotation_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_TypeAnnotation() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_TypeAnnotation_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_TypeAnnotation() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_TypeAnnotation_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_TypeAnnotation() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_TypeAnnotation_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\23\uffff";
    static final String DFA23_eofS =
        "\1\1\22\uffff";
    static final String DFA23_minS =
        "\1\4\3\uffff\1\0\16\uffff";
    static final String DFA23_maxS =
        "\1\32\3\uffff\1\0\16\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\20\uffff\1\2";
    static final String DFA23_specialS =
        "\4\uffff\1\0\16\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\1\3\uffff\1\1\3\uffff\1\1\1\4\6\1\1\uffff\5\1",
            "",
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
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "140:11: ( (expr= single_type_expr )? | '(' expr= type_expr ')' )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_4 = input.LA(1);

                         
                        int index23_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_TypeAnnotation()) ) {s = 1;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index23_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_method_type_in_type53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_type_in_type63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_method_type89 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_set_in_method_type93 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_set_in_method_type99 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_method_name_in_method_type107 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_11_in_method_type111 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_type_var_list_in_method_type113 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_method_type117 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_constraint_list_in_method_type119 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_method_type123 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_method_sig_in_method_type127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_method_sig150 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_method_sig152 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_block_in_method_sig154 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_method_sig157 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_type_expr_in_method_sig159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_expr_in_method_sig171 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_block_in_method_sig173 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_method_sig176 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_type_expr_in_method_sig180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_block203 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_method_sig_in_block205 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_block207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_method_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_class_type266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CONST_ID_in_class_type270 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_class_type272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CONST_ID_in_class_type276 = new BitSet(new long[]{0x0000000000200802L});
    public static final BitSet FOLLOW_11_in_class_type280 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_type_var_list_in_class_type282 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_class_type286 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_constraint_list_in_class_type288 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_class_type292 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_pragma_list_in_class_type296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_expr_in_constraint_list322 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_constraint_list324 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_type_expr_in_constraint_list328 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_constraint_list331 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_constraint_list_in_constraint_list335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_pragma_list360 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_pragma_list363 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_pragma_list_in_pragma_list367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_pragma392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_type_expr_in_type_expr415 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_or_type_list_in_type_expr417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_expr_in_type_expr_comma_list441 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_type_expr_comma_list444 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_type_expr_comma_list_in_type_expr_comma_list448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_tuple481 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_type_expr_comma_list_in_tuple483 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_tuple485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_tuple495 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_type_expr_comma_list_in_tuple497 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_tuple499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_var_in_single_type_expr522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_ident_in_single_type_expr532 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_single_type_expr535 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_type_expr_comma_list_in_single_type_expr537 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_single_type_expr539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tuple_in_single_type_expr551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_single_type_expr561 = new BitSet(new long[]{0x0000000003404A32L});
    public static final BitSet FOLLOW_single_type_expr_in_single_type_expr566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_single_type_expr571 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_type_expr_in_single_type_expr575 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_single_type_expr577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_single_type_expr588 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_single_type_expr_in_single_type_expr593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_single_type_expr597 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_type_expr_in_single_type_expr601 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_single_type_expr603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_or_type_list627 = new BitSet(new long[]{0x0000000003404A30L});
    public static final BitSet FOLLOW_single_type_expr_in_or_type_list629 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_or_type_list_in_or_type_list633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_ID_in_type_ident657 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_type_ident660 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_type_ident_in_type_ident664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_type_ident676 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_type_ident_in_type_ident680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_var703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_var_in_type_var_list726 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_type_var_list729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_type_var_list_in_type_var_list733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_type_in_synpred1_TypeAnnotation53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_TypeAnnotation93 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_set_in_synpred5_TypeAnnotation99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_type_expr_in_synpred30_TypeAnnotation566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_type_expr_in_synpred32_TypeAnnotation593 = new BitSet(new long[]{0x0000000000000002L});

}