// $ANTLR 3.0.1 ECL.g 2008-07-23 13:38:31

	package com.okooo.osgi.ecl;
	import java.util.Map;
	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ECLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEWLINE", "DIGIT", "ALPHA", "WS", "';'", "'update'", "'start'", "'stop'", "'restart'", "'install '", "','", "'.'", "'_'", "'-'"
    };
    public static final int WS=7;
    public static final int NEWLINE=4;
    public static final int DIGIT=5;
    public static final int EOF=-1;
    public static final int ALPHA=6;

        public ECLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "ECL.g"; }

    
    	//define virtual memory to store variable data
    	private Map<String, String> memory=new HashMap<String, String>();



    // $ANTLR start prog
    // ECL.g:15:1: prog : ( line )* ;
    public final void prog() throws RecognitionException {
        try {
            // ECL.g:15:6: ( ( line )* )
            // ECL.g:15:8: ( line )*
            {
            // ECL.g:15:8: ( line )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=8 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ECL.g:15:8: line
            	    {
            	    pushFollow(FOLLOW_line_in_prog29);
            	    line();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
        return ;
    }
    // $ANTLR end prog


    // $ANTLR start line
    // ECL.g:17:1: line : ( actionStmt ';' ( NEWLINE )* | installStmt ';' ( NEWLINE )* | ';' ( NEWLINE )* );
    public final void line() throws RecognitionException {
        try {
            // ECL.g:17:6: ( actionStmt ';' ( NEWLINE )* | installStmt ';' ( NEWLINE )* | ';' ( NEWLINE )* )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 9:
            case 10:
            case 11:
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 8:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("17:1: line : ( actionStmt ';' ( NEWLINE )* | installStmt ';' ( NEWLINE )* | ';' ( NEWLINE )* );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ECL.g:17:8: actionStmt ';' ( NEWLINE )*
                    {
                    pushFollow(FOLLOW_actionStmt_in_line39);
                    actionStmt();
                    _fsp--;

                    match(input,8,FOLLOW_8_in_line41); 
                    // ECL.g:17:23: ( NEWLINE )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==NEWLINE) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ECL.g:17:23: NEWLINE
                    	    {
                    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_line43); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ECL.g:18:4: installStmt ';' ( NEWLINE )*
                    {
                    pushFollow(FOLLOW_installStmt_in_line49);
                    installStmt();
                    _fsp--;

                    match(input,8,FOLLOW_8_in_line51); 
                    // ECL.g:18:20: ( NEWLINE )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==NEWLINE) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ECL.g:18:20: NEWLINE
                    	    {
                    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_line53); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // ECL.g:19:4: ';' ( NEWLINE )*
                    {
                    match(input,8,FOLLOW_8_in_line59); 
                    // ECL.g:19:8: ( NEWLINE )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==NEWLINE) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ECL.g:19:8: NEWLINE
                    	    {
                    	    match(input,NEWLINE,FOLLOW_NEWLINE_in_line61); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
        return ;
    }
    // $ANTLR end line


    // $ANTLR start actionStmt
    // ECL.g:21:1: actionStmt : actionName idSet ;
    public final void actionStmt() throws RecognitionException {
        actionName_return actionName1 = null;

        java.util.Set<Long> idSet2 = null;


        try {
            // ECL.g:21:12: ( actionName idSet )
            // ECL.g:21:14: actionName idSet
            {
            pushFollow(FOLLOW_actionName_in_actionStmt71);
            actionName1=actionName();
            _fsp--;

            pushFollow(FOLLOW_idSet_in_actionStmt73);
            idSet2=idSet();
            _fsp--;

            
            				CommandUtil.performAction(input.toString(actionName1.start,actionName1.stop),idSet2);
            			

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
    // $ANTLR end actionStmt

    public static class actionName_return extends ParserRuleReturnScope {
    };

    // $ANTLR start actionName
    // ECL.g:25:1: actionName : ( 'update' | 'start' | 'stop' | 'restart' );
    public final actionName_return actionName() throws RecognitionException {
        actionName_return retval = new actionName_return();
        retval.start = input.LT(1);

        try {
            // ECL.g:25:12: ( 'update' | 'start' | 'stop' | 'restart' )
            // ECL.g:
            {
            if ( (input.LA(1)>=9 && input.LA(1)<=12) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_actionName0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end actionName


    // $ANTLR start installStmt
    // ECL.g:28:1: installStmt : 'install ' jarSet ;
    public final void installStmt() throws RecognitionException {
        java.util.Set<String> jarSet3 = null;


        try {
            // ECL.g:28:13: ( 'install ' jarSet )
            // ECL.g:28:15: 'install ' jarSet
            {
            match(input,13,FOLLOW_13_in_installStmt107); 
            pushFollow(FOLLOW_jarSet_in_installStmt109);
            jarSet3=jarSet();
            _fsp--;

            
            				CommandUtil.install(jarSet3);
            			

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
    // $ANTLR end installStmt


    // $ANTLR start idSet
    // ECL.g:33:1: idSet returns [java.util.Set<Long> idSet] : ( arrayIdSet | rangeIdSet );
    public final java.util.Set<Long> idSet() throws RecognitionException {
        java.util.Set<Long> idSet = null;

        java.util.Set<Long> arrayIdSet4 = null;

        java.util.Set<Long> rangeIdSet5 = null;


        try {
            // ECL.g:34:2: ( arrayIdSet | rangeIdSet )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DIGIT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==15) ) {
                    alt6=2;
                }
                else if ( (LA6_1==8||LA6_1==14) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("33:1: idSet returns [java.util.Set<Long> idSet] : ( arrayIdSet | rangeIdSet );", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("33:1: idSet returns [java.util.Set<Long> idSet] : ( arrayIdSet | rangeIdSet );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ECL.g:34:4: arrayIdSet
                    {
                    pushFollow(FOLLOW_arrayIdSet_in_idSet125);
                    arrayIdSet4=arrayIdSet();
                    _fsp--;

                    
                    			idSet =arrayIdSet4;
                    		

                    }
                    break;
                case 2 :
                    // ECL.g:37:4: rangeIdSet
                    {
                    pushFollow(FOLLOW_rangeIdSet_in_idSet131);
                    rangeIdSet5=rangeIdSet();
                    _fsp--;

                    
                    			idSet =rangeIdSet5;
                    		

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
        return idSet;
    }
    // $ANTLR end idSet


    // $ANTLR start arrayIdSet
    // ECL.g:41:1: arrayIdSet returns [java.util.Set<Long> idSet] : (id1= DIGIT ) ( ',' id2= DIGIT )* ;
    public final java.util.Set<Long> arrayIdSet() throws RecognitionException {
        java.util.Set<Long> idSet = null;

        Token id1=null;
        Token id2=null;

        
        		idSet =new java.util.HashSet<Long>();
        	
        try {
            // ECL.g:45:2: ( (id1= DIGIT ) ( ',' id2= DIGIT )* )
            // ECL.g:45:4: (id1= DIGIT ) ( ',' id2= DIGIT )*
            {
            // ECL.g:45:4: (id1= DIGIT )
            // ECL.g:45:5: id1= DIGIT
            {
            id1=(Token)input.LT(1);
            match(input,DIGIT,FOLLOW_DIGIT_in_arrayIdSet154); 
            
            			idSet.add(new Long(id1.getText()));
            		

            }

            // ECL.g:47:5: ( ',' id2= DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ECL.g:47:6: ',' id2= DIGIT
            	    {
            	    match(input,14,FOLLOW_14_in_arrayIdSet158); 
            	    id2=(Token)input.LT(1);
            	    match(input,DIGIT,FOLLOW_DIGIT_in_arrayIdSet162); 
            	    
            	    			idSet.add(new Long(id2.getText()));
            	    		

            	    }
            	    break;

            	default :
            	    break loop7;
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
        return idSet;
    }
    // $ANTLR end arrayIdSet


    // $ANTLR start rangeIdSet
    // ECL.g:51:1: rangeIdSet returns [java.util.Set<Long> idSet] : id1= DIGIT '.' '.' id2= DIGIT ;
    public final java.util.Set<Long> rangeIdSet() throws RecognitionException {
        java.util.Set<Long> idSet = null;

        Token id1=null;
        Token id2=null;

        
        		idSet =new java.util.HashSet<Long>();
        		Long start=0L;
        		Long end=0L;
        	
        try {
            // ECL.g:56:3: (id1= DIGIT '.' '.' id2= DIGIT )
            // ECL.g:56:6: id1= DIGIT '.' '.' id2= DIGIT
            {
            id1=(Token)input.LT(1);
            match(input,DIGIT,FOLLOW_DIGIT_in_rangeIdSet184); 
            
            			start=new Long(id1.getText());
            		
            match(input,15,FOLLOW_15_in_rangeIdSet187); 
            match(input,15,FOLLOW_15_in_rangeIdSet189); 
            id2=(Token)input.LT(1);
            match(input,DIGIT,FOLLOW_DIGIT_in_rangeIdSet193); 
            
            			end=new Long(id2.getText());
            		
            
            		if(end<start){
            			Long temp=end;
            			end=start;
            			start=temp;
            		}
            		for(Long id=start;id<=end;id++){
            			idSet.add(id);
            		}
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return idSet;
    }
    // $ANTLR end rangeIdSet


    // $ANTLR start jarSet
    // ECL.g:72:1: jarSet returns [java.util.Set<String> jarSet] : (j1= jar ) ( ',' j2= jar )* ;
    public final java.util.Set<String> jarSet() throws RecognitionException {
        java.util.Set<String> jarSet = null;

        jar_return j1 = null;

        jar_return j2 = null;


        try {
            // ECL.g:73:2: ( (j1= jar ) ( ',' j2= jar )* )
            // ECL.g:73:4: (j1= jar ) ( ',' j2= jar )*
            {
            // ECL.g:73:4: (j1= jar )
            // ECL.g:74:4: j1= jar
            {
            pushFollow(FOLLOW_jar_in_jarSet217);
            j1=jar();
            _fsp--;

            
            				jarSet.add(input.toString(j1.start,j1.stop));
            			

            }

            // ECL.g:78:3: ( ',' j2= jar )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ECL.g:79:4: ',' j2= jar
            	    {
            	    match(input,14,FOLLOW_14_in_jarSet231); 
            	    pushFollow(FOLLOW_jar_in_jarSet234);
            	    j2=jar();
            	    _fsp--;

            	    
            	    				jarSet.add(input.toString(j2.start,j2.stop));
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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
        return jarSet;
    }
    // $ANTLR end jarSet

    public static class jar_return extends ParserRuleReturnScope {
    };

    // $ANTLR start jar
    // ECL.g:85:1: jar : ( ALPHA | DIGIT | '.' | '_' | '-' )+ ;
    public final jar_return jar() throws RecognitionException {
        jar_return retval = new jar_return();
        retval.start = input.LT(1);

        try {
            // ECL.g:85:5: ( ( ALPHA | DIGIT | '.' | '_' | '-' )+ )
            // ECL.g:85:7: ( ALPHA | DIGIT | '.' | '_' | '-' )+
            {
            // ECL.g:85:7: ( ALPHA | DIGIT | '.' | '_' | '-' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=DIGIT && LA9_0<=ALPHA)||(LA9_0>=15 && LA9_0<=17)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ECL.g:
            	    {
            	    if ( (input.LA(1)>=DIGIT && input.LA(1)<=ALPHA)||(input.LA(1)>=15 && input.LA(1)<=17) ) {
            	        input.consume();
            	        errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_jar250);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end jar


 

    public static final BitSet FOLLOW_line_in_prog29 = new BitSet(new long[]{0x0000000000003F02L});
    public static final BitSet FOLLOW_actionStmt_in_line39 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_line41 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_NEWLINE_in_line43 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_installStmt_in_line49 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_line51 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_NEWLINE_in_line53 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8_in_line59 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_NEWLINE_in_line61 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_actionName_in_actionStmt71 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_idSet_in_actionStmt73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_actionName0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_installStmt107 = new BitSet(new long[]{0x0000000000038060L});
    public static final BitSet FOLLOW_jarSet_in_installStmt109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayIdSet_in_idSet125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeIdSet_in_idSet131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_arrayIdSet154 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_arrayIdSet158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DIGIT_in_arrayIdSet162 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_DIGIT_in_rangeIdSet184 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rangeIdSet187 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rangeIdSet189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DIGIT_in_rangeIdSet193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jar_in_jarSet217 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_jarSet231 = new BitSet(new long[]{0x0000000000038060L});
    public static final BitSet FOLLOW_jar_in_jarSet234 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_set_in_jar250 = new BitSet(new long[]{0x0000000000038062L});

}