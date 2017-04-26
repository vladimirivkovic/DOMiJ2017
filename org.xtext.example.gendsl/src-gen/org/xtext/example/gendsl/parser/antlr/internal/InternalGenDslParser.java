package org.xtext.example.gendsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.gendsl.services.GenDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GenealogyTree'", "'{'", "'familyName'", "'established'", "'persons'", "','", "'}'", "'year'", "'month'", "'day'", "'unknown'", "'birthPlace'", "'deathPlace'", "'restingPlace'", "'type'", "'gender'", "'otherNames'", "'nickname'", "'deathCause'", "'marriages'", "'('", "')'", "'cohabitations'", "'birthDate'", "'deathDate'", "'personhistory'", "'cohabitation'", "'marriage'", "'-'", "'Marriage'", "'spouses'", "'fromDate'", "'toDate'", "'children'", "'legitimate'", "'Cohabitation'", "'partners'", "'PersonHistory'", "'givenName'", "'changed'", "'true'", "'false'", "'EDate'", "'BIOLOGICAL'", "'ADOPTED'", "'SEMIADOPTED'", "'MARRIED'", "'DISOWNED'", "'ILLEGITIMATE'", "'MALE'", "'FEMALE'", "'BIGENDER'", "'MONOGAMY'", "'POLYGAMY'", "'POLYFIDELITY'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGenDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGenDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGenDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenDsl.g"; }



     	private GenDslGrammarAccess grammarAccess;

        public InternalGenDslParser(TokenStream input, GenDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GenealogyTree";
       	}

       	@Override
       	protected GenDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGenealogyTree"
    // InternalGenDsl.g:65:1: entryRuleGenealogyTree returns [EObject current=null] : iv_ruleGenealogyTree= ruleGenealogyTree EOF ;
    public final EObject entryRuleGenealogyTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenealogyTree = null;


        try {
            // InternalGenDsl.g:65:54: (iv_ruleGenealogyTree= ruleGenealogyTree EOF )
            // InternalGenDsl.g:66:2: iv_ruleGenealogyTree= ruleGenealogyTree EOF
            {
             newCompositeNode(grammarAccess.getGenealogyTreeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenealogyTree=ruleGenealogyTree();

            state._fsp--;

             current =iv_ruleGenealogyTree; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenealogyTree"


    // $ANTLR start "ruleGenealogyTree"
    // InternalGenDsl.g:72:1: ruleGenealogyTree returns [EObject current=null] : (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleGenealogyTree() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_familyName_3_0 = null;

        EObject lv_established_5_0 = null;

        EObject lv_person_8_0 = null;

        EObject lv_person_10_0 = null;



        	enterRule();

        try {
            // InternalGenDsl.g:78:2: ( (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalGenDsl.g:79:2: (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalGenDsl.g:79:2: (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalGenDsl.g:80:3: otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGenealogyTreeAccess().getGenealogyTreeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGenealogyTreeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGenealogyTreeAccess().getFamilyNameKeyword_2());
            		
            // InternalGenDsl.g:92:3: ( (lv_familyName_3_0= ruleEString ) )
            // InternalGenDsl.g:93:4: (lv_familyName_3_0= ruleEString )
            {
            // InternalGenDsl.g:93:4: (lv_familyName_3_0= ruleEString )
            // InternalGenDsl.g:94:5: lv_familyName_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGenealogyTreeAccess().getFamilyNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_familyName_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenealogyTreeRule());
            					}
            					set(
            						current,
            						"familyName",
            						lv_familyName_3_0,
            						"org.xtext.example.gendsl.GenDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenDsl.g:111:3: (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGenDsl.g:112:4: otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGenealogyTreeAccess().getEstablishedKeyword_4_0());
                    			
                    // InternalGenDsl.g:116:4: ( (lv_established_5_0= ruleDateX ) )
                    // InternalGenDsl.g:117:5: (lv_established_5_0= ruleDateX )
                    {
                    // InternalGenDsl.g:117:5: (lv_established_5_0= ruleDateX )
                    // InternalGenDsl.g:118:6: lv_established_5_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getGenealogyTreeAccess().getEstablishedDateXParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_established_5_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenealogyTreeRule());
                    						}
                    						set(
                    							current,
                    							"established",
                    							lv_established_5_0,
                    							"org.xtext.example.gendsl.GenDsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:136:3: (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGenDsl.g:137:4: otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGenealogyTreeAccess().getPersonsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getGenealogyTreeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGenDsl.g:145:4: ( (lv_person_8_0= rulePerson ) )
                    // InternalGenDsl.g:146:5: (lv_person_8_0= rulePerson )
                    {
                    // InternalGenDsl.g:146:5: (lv_person_8_0= rulePerson )
                    // InternalGenDsl.g:147:6: lv_person_8_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getGenealogyTreeAccess().getPersonPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_person_8_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGenealogyTreeRule());
                    						}
                    						add(
                    							current,
                    							"person",
                    							lv_person_8_0,
                    							"org.xtext.example.gendsl.GenDsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenDsl.g:164:4: (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalGenDsl.g:165:5: otherlv_9= ',' ( (lv_person_10_0= rulePerson ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGenealogyTreeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGenDsl.g:169:5: ( (lv_person_10_0= rulePerson ) )
                    	    // InternalGenDsl.g:170:6: (lv_person_10_0= rulePerson )
                    	    {
                    	    // InternalGenDsl.g:170:6: (lv_person_10_0= rulePerson )
                    	    // InternalGenDsl.g:171:7: lv_person_10_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getGenealogyTreeAccess().getPersonPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_person_10_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGenealogyTreeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"person",
                    	    								lv_person_10_0,
                    	    								"org.xtext.example.gendsl.GenDsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getGenealogyTreeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getGenealogyTreeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenealogyTree"


    // $ANTLR start "entryRuleEString"
    // InternalGenDsl.g:202:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGenDsl.g:202:47: (iv_ruleEString= ruleEString EOF )
            // InternalGenDsl.g:203:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGenDsl.g:209:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGenDsl.g:215:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGenDsl.g:216:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGenDsl.g:216:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGenDsl.g:217:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGenDsl.g:225:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDateX"
    // InternalGenDsl.g:236:1: entryRuleDateX returns [EObject current=null] : iv_ruleDateX= ruleDateX EOF ;
    public final EObject entryRuleDateX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateX = null;


        try {
            // InternalGenDsl.g:236:46: (iv_ruleDateX= ruleDateX EOF )
            // InternalGenDsl.g:237:2: iv_ruleDateX= ruleDateX EOF
            {
             newCompositeNode(grammarAccess.getDateXRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateX=ruleDateX();

            state._fsp--;

             current =iv_ruleDateX; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateX"


    // $ANTLR start "ruleDateX"
    // InternalGenDsl.g:243:1: ruleDateX returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'year' ( (lv_year_3_0= ruleEIntegerObject ) ) )? (otherlv_4= 'month' ( (lv_month_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'day' ( (lv_day_7_0= ruleEIntegerObject ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleDateX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_year_3_0 = null;

        AntlrDatatypeRuleToken lv_month_5_0 = null;

        AntlrDatatypeRuleToken lv_day_7_0 = null;



        	enterRule();

        try {
            // InternalGenDsl.g:249:2: ( ( () otherlv_1= '{' (otherlv_2= 'year' ( (lv_year_3_0= ruleEIntegerObject ) ) )? (otherlv_4= 'month' ( (lv_month_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'day' ( (lv_day_7_0= ruleEIntegerObject ) ) )? otherlv_8= '}' ) )
            // InternalGenDsl.g:250:2: ( () otherlv_1= '{' (otherlv_2= 'year' ( (lv_year_3_0= ruleEIntegerObject ) ) )? (otherlv_4= 'month' ( (lv_month_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'day' ( (lv_day_7_0= ruleEIntegerObject ) ) )? otherlv_8= '}' )
            {
            // InternalGenDsl.g:250:2: ( () otherlv_1= '{' (otherlv_2= 'year' ( (lv_year_3_0= ruleEIntegerObject ) ) )? (otherlv_4= 'month' ( (lv_month_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'day' ( (lv_day_7_0= ruleEIntegerObject ) ) )? otherlv_8= '}' )
            // InternalGenDsl.g:251:3: () otherlv_1= '{' (otherlv_2= 'year' ( (lv_year_3_0= ruleEIntegerObject ) ) )? (otherlv_4= 'month' ( (lv_month_5_0= ruleEIntegerObject ) ) )? (otherlv_6= 'day' ( (lv_day_7_0= ruleEIntegerObject ) ) )? otherlv_8= '}'
            {
            // InternalGenDsl.g:251:3: ()
            // InternalGenDsl.g:252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateXAccess().getDateXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDateXAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGenDsl.g:262:3: (otherlv_2= 'year' ( (lv_year_3_0= ruleEIntegerObject ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGenDsl.g:263:4: otherlv_2= 'year' ( (lv_year_3_0= ruleEIntegerObject ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getDateXAccess().getYearKeyword_2_0());
                    			
                    // InternalGenDsl.g:267:4: ( (lv_year_3_0= ruleEIntegerObject ) )
                    // InternalGenDsl.g:268:5: (lv_year_3_0= ruleEIntegerObject )
                    {
                    // InternalGenDsl.g:268:5: (lv_year_3_0= ruleEIntegerObject )
                    // InternalGenDsl.g:269:6: lv_year_3_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getYearEIntegerObjectParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_year_3_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateXRule());
                    						}
                    						set(
                    							current,
                    							"year",
                    							lv_year_3_0,
                    							"org.xtext.example.gendsl.GenDsl.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:287:3: (otherlv_4= 'month' ( (lv_month_5_0= ruleEIntegerObject ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGenDsl.g:288:4: otherlv_4= 'month' ( (lv_month_5_0= ruleEIntegerObject ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getDateXAccess().getMonthKeyword_3_0());
                    			
                    // InternalGenDsl.g:292:4: ( (lv_month_5_0= ruleEIntegerObject ) )
                    // InternalGenDsl.g:293:5: (lv_month_5_0= ruleEIntegerObject )
                    {
                    // InternalGenDsl.g:293:5: (lv_month_5_0= ruleEIntegerObject )
                    // InternalGenDsl.g:294:6: lv_month_5_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getMonthEIntegerObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_month_5_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateXRule());
                    						}
                    						set(
                    							current,
                    							"month",
                    							lv_month_5_0,
                    							"org.xtext.example.gendsl.GenDsl.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:312:3: (otherlv_6= 'day' ( (lv_day_7_0= ruleEIntegerObject ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGenDsl.g:313:4: otherlv_6= 'day' ( (lv_day_7_0= ruleEIntegerObject ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getDateXAccess().getDayKeyword_4_0());
                    			
                    // InternalGenDsl.g:317:4: ( (lv_day_7_0= ruleEIntegerObject ) )
                    // InternalGenDsl.g:318:5: (lv_day_7_0= ruleEIntegerObject )
                    {
                    // InternalGenDsl.g:318:5: (lv_day_7_0= ruleEIntegerObject )
                    // InternalGenDsl.g:319:6: lv_day_7_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getDayEIntegerObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_day_7_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateXRule());
                    						}
                    						set(
                    							current,
                    							"day",
                    							lv_day_7_0,
                    							"org.xtext.example.gendsl.GenDsl.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDateXAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateX"


    // $ANTLR start "entryRulePerson"
    // InternalGenDsl.g:345:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalGenDsl.g:345:47: (iv_rulePerson= rulePerson EOF )
            // InternalGenDsl.g:346:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalGenDsl.g:352:1: rulePerson returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        AntlrDatatypeRuleToken lv_givenName_1_0 = null;

        AntlrDatatypeRuleToken lv_unknown_3_0 = null;

        AntlrDatatypeRuleToken lv_birthPlace_5_0 = null;

        AntlrDatatypeRuleToken lv_deathPlace_7_0 = null;

        AntlrDatatypeRuleToken lv_restingPlace_9_0 = null;

        Enumerator lv_type_11_0 = null;

        Enumerator lv_gender_13_0 = null;

        AntlrDatatypeRuleToken lv_otherNames_16_0 = null;

        AntlrDatatypeRuleToken lv_otherNames_18_0 = null;

        AntlrDatatypeRuleToken lv_nickname_21_0 = null;

        AntlrDatatypeRuleToken lv_deathCause_23_0 = null;

        EObject lv_birthDate_37_0 = null;

        EObject lv_deathDate_39_0 = null;

        EObject lv_personhistory_42_0 = null;

        EObject lv_personhistory_44_0 = null;

        EObject lv_cohabitation_48_0 = null;

        EObject lv_cohabitation_50_0 = null;

        EObject lv_marriage_54_0 = null;

        EObject lv_marriage_56_0 = null;



        	enterRule();

        try {
            // InternalGenDsl.g:358:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalGenDsl.g:359:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalGenDsl.g:359:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+ {...}?) ) )
            // InternalGenDsl.g:360:3: ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalGenDsl.g:360:3: ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+ {...}?) )
            // InternalGenDsl.g:361:4: ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPersonAccess().getUnorderedGroup());
            			
            // InternalGenDsl.g:364:4: ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+ {...}?)
            // InternalGenDsl.g:365:5: ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+ {...}?
            {
            // InternalGenDsl.g:365:5: ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=18;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalGenDsl.g:366:3: ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:366:3: ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) )
            	    // InternalGenDsl.g:367:4: {...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalGenDsl.g:367:100: ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) )
            	    // InternalGenDsl.g:368:5: ({...}? => ( (lv_givenName_1_0= ruleEString ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalGenDsl.g:371:8: ({...}? => ( (lv_givenName_1_0= ruleEString ) ) )
            	    // InternalGenDsl.g:371:9: {...}? => ( (lv_givenName_1_0= ruleEString ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:371:18: ( (lv_givenName_1_0= ruleEString ) )
            	    // InternalGenDsl.g:371:19: (lv_givenName_1_0= ruleEString )
            	    {
            	    // InternalGenDsl.g:371:19: (lv_givenName_1_0= ruleEString )
            	    // InternalGenDsl.g:372:9: lv_givenName_1_0= ruleEString
            	    {

            	    									newCompositeNode(grammarAccess.getPersonAccess().getGivenNameEStringParserRuleCall_0_0());
            	    								
            	    pushFollow(FOLLOW_15);
            	    lv_givenName_1_0=ruleEString();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPersonRule());
            	    									}
            	    									set(
            	    										current,
            	    										"givenName",
            	    										lv_givenName_1_0,
            	    										"org.xtext.example.gendsl.GenDsl.EString");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGenDsl.g:394:3: ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:394:3: ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalGenDsl.g:395:4: {...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalGenDsl.g:395:100: ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) )
            	    // InternalGenDsl.g:396:5: ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalGenDsl.g:399:8: ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) )
            	    // InternalGenDsl.g:399:9: {...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:399:18: (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) )
            	    // InternalGenDsl.g:399:19: otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_16); 

            	    								newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getUnknownKeyword_1_0());
            	    							
            	    // InternalGenDsl.g:403:8: ( (lv_unknown_3_0= ruleEBoolean ) )
            	    // InternalGenDsl.g:404:9: (lv_unknown_3_0= ruleEBoolean )
            	    {
            	    // InternalGenDsl.g:404:9: (lv_unknown_3_0= ruleEBoolean )
            	    // InternalGenDsl.g:405:10: lv_unknown_3_0= ruleEBoolean
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getUnknownEBooleanParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_unknown_3_0=ruleEBoolean();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"unknown",
            	    											lv_unknown_3_0,
            	    											"org.xtext.example.gendsl.GenDsl.EBoolean");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGenDsl.g:428:3: ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:428:3: ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) )
            	    // InternalGenDsl.g:429:4: {...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalGenDsl.g:429:100: ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) )
            	    // InternalGenDsl.g:430:5: ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalGenDsl.g:433:8: ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) )
            	    // InternalGenDsl.g:433:9: {...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:433:18: (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) )
            	    // InternalGenDsl.g:433:19: otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_5); 

            	    								newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getBirthPlaceKeyword_2_0());
            	    							
            	    // InternalGenDsl.g:437:8: ( (lv_birthPlace_5_0= ruleEString ) )
            	    // InternalGenDsl.g:438:9: (lv_birthPlace_5_0= ruleEString )
            	    {
            	    // InternalGenDsl.g:438:9: (lv_birthPlace_5_0= ruleEString )
            	    // InternalGenDsl.g:439:10: lv_birthPlace_5_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getBirthPlaceEStringParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_birthPlace_5_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"birthPlace",
            	    											lv_birthPlace_5_0,
            	    											"org.xtext.example.gendsl.GenDsl.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalGenDsl.g:462:3: ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:462:3: ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) )
            	    // InternalGenDsl.g:463:4: {...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalGenDsl.g:463:100: ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) )
            	    // InternalGenDsl.g:464:5: ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalGenDsl.g:467:8: ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) )
            	    // InternalGenDsl.g:467:9: {...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:467:18: (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) )
            	    // InternalGenDsl.g:467:19: otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FOLLOW_5); 

            	    								newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getDeathPlaceKeyword_3_0());
            	    							
            	    // InternalGenDsl.g:471:8: ( (lv_deathPlace_7_0= ruleEString ) )
            	    // InternalGenDsl.g:472:9: (lv_deathPlace_7_0= ruleEString )
            	    {
            	    // InternalGenDsl.g:472:9: (lv_deathPlace_7_0= ruleEString )
            	    // InternalGenDsl.g:473:10: lv_deathPlace_7_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getDeathPlaceEStringParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_deathPlace_7_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"deathPlace",
            	    											lv_deathPlace_7_0,
            	    											"org.xtext.example.gendsl.GenDsl.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalGenDsl.g:496:3: ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:496:3: ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) )
            	    // InternalGenDsl.g:497:4: {...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalGenDsl.g:497:100: ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) )
            	    // InternalGenDsl.g:498:5: ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalGenDsl.g:501:8: ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) )
            	    // InternalGenDsl.g:501:9: {...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:501:18: (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) )
            	    // InternalGenDsl.g:501:19: otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_5); 

            	    								newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getRestingPlaceKeyword_4_0());
            	    							
            	    // InternalGenDsl.g:505:8: ( (lv_restingPlace_9_0= ruleEString ) )
            	    // InternalGenDsl.g:506:9: (lv_restingPlace_9_0= ruleEString )
            	    {
            	    // InternalGenDsl.g:506:9: (lv_restingPlace_9_0= ruleEString )
            	    // InternalGenDsl.g:507:10: lv_restingPlace_9_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getRestingPlaceEStringParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_restingPlace_9_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"restingPlace",
            	    											lv_restingPlace_9_0,
            	    											"org.xtext.example.gendsl.GenDsl.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalGenDsl.g:530:3: ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:530:3: ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) )
            	    // InternalGenDsl.g:531:4: {...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalGenDsl.g:531:100: ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) )
            	    // InternalGenDsl.g:532:5: ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalGenDsl.g:535:8: ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) )
            	    // InternalGenDsl.g:535:9: {...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:535:18: (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) )
            	    // InternalGenDsl.g:535:19: otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) )
            	    {
            	    otherlv_10=(Token)match(input,25,FOLLOW_17); 

            	    								newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getTypeKeyword_5_0());
            	    							
            	    // InternalGenDsl.g:539:8: ( (lv_type_11_0= ruleTypeOfPerson ) )
            	    // InternalGenDsl.g:540:9: (lv_type_11_0= ruleTypeOfPerson )
            	    {
            	    // InternalGenDsl.g:540:9: (lv_type_11_0= ruleTypeOfPerson )
            	    // InternalGenDsl.g:541:10: lv_type_11_0= ruleTypeOfPerson
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getTypeTypeOfPersonEnumRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_type_11_0=ruleTypeOfPerson();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_11_0,
            	    											"org.xtext.example.gendsl.GenDsl.TypeOfPerson");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalGenDsl.g:564:3: ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:564:3: ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) )
            	    // InternalGenDsl.g:565:4: {...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalGenDsl.g:565:100: ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) )
            	    // InternalGenDsl.g:566:5: ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalGenDsl.g:569:8: ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) )
            	    // InternalGenDsl.g:569:9: {...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:569:18: (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) )
            	    // InternalGenDsl.g:569:19: otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) )
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_18); 

            	    								newLeafNode(otherlv_12, grammarAccess.getPersonAccess().getGenderKeyword_6_0());
            	    							
            	    // InternalGenDsl.g:573:8: ( (lv_gender_13_0= ruleGender ) )
            	    // InternalGenDsl.g:574:9: (lv_gender_13_0= ruleGender )
            	    {
            	    // InternalGenDsl.g:574:9: (lv_gender_13_0= ruleGender )
            	    // InternalGenDsl.g:575:10: lv_gender_13_0= ruleGender
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getGenderGenderEnumRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_gender_13_0=ruleGender();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"gender",
            	    											lv_gender_13_0,
            	    											"org.xtext.example.gendsl.GenDsl.Gender");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalGenDsl.g:598:3: ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) )
            	    {
            	    // InternalGenDsl.g:598:3: ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) )
            	    // InternalGenDsl.g:599:4: {...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalGenDsl.g:599:100: ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) )
            	    // InternalGenDsl.g:600:5: ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalGenDsl.g:603:8: ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) )
            	    // InternalGenDsl.g:603:9: {...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:603:18: (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' )
            	    // InternalGenDsl.g:603:19: otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}'
            	    {
            	    otherlv_14=(Token)match(input,27,FOLLOW_3); 

            	    								newLeafNode(otherlv_14, grammarAccess.getPersonAccess().getOtherNamesKeyword_7_0());
            	    							
            	    otherlv_15=(Token)match(input,12,FOLLOW_5); 

            	    								newLeafNode(otherlv_15, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_7_1());
            	    							
            	    // InternalGenDsl.g:611:8: ( (lv_otherNames_16_0= ruleEString ) )
            	    // InternalGenDsl.g:612:9: (lv_otherNames_16_0= ruleEString )
            	    {
            	    // InternalGenDsl.g:612:9: (lv_otherNames_16_0= ruleEString )
            	    // InternalGenDsl.g:613:10: lv_otherNames_16_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getOtherNamesEStringParserRuleCall_7_2_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_otherNames_16_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										add(
            	    											current,
            	    											"otherNames",
            	    											lv_otherNames_16_0,
            	    											"org.xtext.example.gendsl.GenDsl.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalGenDsl.g:630:8: (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==16) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalGenDsl.g:631:9: otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,16,FOLLOW_5); 

            	    	    									newLeafNode(otherlv_17, grammarAccess.getPersonAccess().getCommaKeyword_7_3_0());
            	    	    								
            	    	    // InternalGenDsl.g:635:9: ( (lv_otherNames_18_0= ruleEString ) )
            	    	    // InternalGenDsl.g:636:10: (lv_otherNames_18_0= ruleEString )
            	    	    {
            	    	    // InternalGenDsl.g:636:10: (lv_otherNames_18_0= ruleEString )
            	    	    // InternalGenDsl.g:637:11: lv_otherNames_18_0= ruleEString
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPersonAccess().getOtherNamesEStringParserRuleCall_7_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_otherNames_18_0=ruleEString();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"otherNames",
            	    	    												lv_otherNames_18_0,
            	    	    												"org.xtext.example.gendsl.GenDsl.EString");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,17,FOLLOW_15); 

            	    								newLeafNode(otherlv_19, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_7_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalGenDsl.g:665:3: ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:665:3: ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) )
            	    // InternalGenDsl.g:666:4: {...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalGenDsl.g:666:100: ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) )
            	    // InternalGenDsl.g:667:5: ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalGenDsl.g:670:8: ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) )
            	    // InternalGenDsl.g:670:9: {...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:670:18: (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) )
            	    // InternalGenDsl.g:670:19: otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) )
            	    {
            	    otherlv_20=(Token)match(input,28,FOLLOW_5); 

            	    								newLeafNode(otherlv_20, grammarAccess.getPersonAccess().getNicknameKeyword_8_0());
            	    							
            	    // InternalGenDsl.g:674:8: ( (lv_nickname_21_0= ruleEString ) )
            	    // InternalGenDsl.g:675:9: (lv_nickname_21_0= ruleEString )
            	    {
            	    // InternalGenDsl.g:675:9: (lv_nickname_21_0= ruleEString )
            	    // InternalGenDsl.g:676:10: lv_nickname_21_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getNicknameEStringParserRuleCall_8_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_nickname_21_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nickname",
            	    											lv_nickname_21_0,
            	    											"org.xtext.example.gendsl.GenDsl.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalGenDsl.g:699:3: ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:699:3: ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) )
            	    // InternalGenDsl.g:700:4: {...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalGenDsl.g:700:100: ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) )
            	    // InternalGenDsl.g:701:5: ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalGenDsl.g:704:8: ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) )
            	    // InternalGenDsl.g:704:9: {...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:704:18: (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) )
            	    // InternalGenDsl.g:704:19: otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) )
            	    {
            	    otherlv_22=(Token)match(input,29,FOLLOW_5); 

            	    								newLeafNode(otherlv_22, grammarAccess.getPersonAccess().getDeathCauseKeyword_9_0());
            	    							
            	    // InternalGenDsl.g:708:8: ( (lv_deathCause_23_0= ruleEString ) )
            	    // InternalGenDsl.g:709:9: (lv_deathCause_23_0= ruleEString )
            	    {
            	    // InternalGenDsl.g:709:9: (lv_deathCause_23_0= ruleEString )
            	    // InternalGenDsl.g:710:10: lv_deathCause_23_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getDeathCauseEStringParserRuleCall_9_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_deathCause_23_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"deathCause",
            	    											lv_deathCause_23_0,
            	    											"org.xtext.example.gendsl.GenDsl.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalGenDsl.g:733:3: ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) )
            	    {
            	    // InternalGenDsl.g:733:3: ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) )
            	    // InternalGenDsl.g:734:4: {...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalGenDsl.g:734:101: ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) )
            	    // InternalGenDsl.g:735:5: ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalGenDsl.g:738:8: ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) )
            	    // InternalGenDsl.g:738:9: {...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:738:18: (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )
            	    // InternalGenDsl.g:738:19: otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')'
            	    {
            	    otherlv_24=(Token)match(input,30,FOLLOW_19); 

            	    								newLeafNode(otherlv_24, grammarAccess.getPersonAccess().getMarriagesKeyword_10_0());
            	    							
            	    otherlv_25=(Token)match(input,31,FOLLOW_5); 

            	    								newLeafNode(otherlv_25, grammarAccess.getPersonAccess().getLeftParenthesisKeyword_10_1());
            	    							
            	    // InternalGenDsl.g:746:8: ( ( ruleEString ) )
            	    // InternalGenDsl.g:747:9: ( ruleEString )
            	    {
            	    // InternalGenDsl.g:747:9: ( ruleEString )
            	    // InternalGenDsl.g:748:10: ruleEString
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPersonRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getPersonAccess().getMarriagesMarriageCrossReference_10_2_0());
            	    									
            	    pushFollow(FOLLOW_20);
            	    ruleEString();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalGenDsl.g:762:8: (otherlv_27= ',' ( ( ruleEString ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==16) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalGenDsl.g:763:9: otherlv_27= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,16,FOLLOW_5); 

            	    	    									newLeafNode(otherlv_27, grammarAccess.getPersonAccess().getCommaKeyword_10_3_0());
            	    	    								
            	    	    // InternalGenDsl.g:767:9: ( ( ruleEString ) )
            	    	    // InternalGenDsl.g:768:10: ( ruleEString )
            	    	    {
            	    	    // InternalGenDsl.g:768:10: ( ruleEString )
            	    	    // InternalGenDsl.g:769:11: ruleEString
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getPersonRule());
            	    	    											}
            	    	    										

            	    	    											newCompositeNode(grammarAccess.getPersonAccess().getMarriagesMarriageCrossReference_10_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_20);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_29=(Token)match(input,32,FOLLOW_15); 

            	    								newLeafNode(otherlv_29, grammarAccess.getPersonAccess().getRightParenthesisKeyword_10_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalGenDsl.g:794:3: ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) )
            	    {
            	    // InternalGenDsl.g:794:3: ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) )
            	    // InternalGenDsl.g:795:4: {...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 11) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 11)");
            	    }
            	    // InternalGenDsl.g:795:101: ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) )
            	    // InternalGenDsl.g:796:5: ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 11);
            	    				
            	    // InternalGenDsl.g:799:8: ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) )
            	    // InternalGenDsl.g:799:9: {...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:799:18: (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' )
            	    // InternalGenDsl.g:799:19: otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')'
            	    {
            	    otherlv_30=(Token)match(input,33,FOLLOW_19); 

            	    								newLeafNode(otherlv_30, grammarAccess.getPersonAccess().getCohabitationsKeyword_11_0());
            	    							
            	    otherlv_31=(Token)match(input,31,FOLLOW_5); 

            	    								newLeafNode(otherlv_31, grammarAccess.getPersonAccess().getLeftParenthesisKeyword_11_1());
            	    							
            	    // InternalGenDsl.g:807:8: ( ( ruleEString ) )
            	    // InternalGenDsl.g:808:9: ( ruleEString )
            	    {
            	    // InternalGenDsl.g:808:9: ( ruleEString )
            	    // InternalGenDsl.g:809:10: ruleEString
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPersonRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getPersonAccess().getCohabitationsCohabitationCrossReference_11_2_0());
            	    									
            	    pushFollow(FOLLOW_20);
            	    ruleEString();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalGenDsl.g:823:8: (otherlv_33= ',' ( ( ruleEString ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==16) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalGenDsl.g:824:9: otherlv_33= ',' ( ( ruleEString ) )
            	    	    {
            	    	    otherlv_33=(Token)match(input,16,FOLLOW_5); 

            	    	    									newLeafNode(otherlv_33, grammarAccess.getPersonAccess().getCommaKeyword_11_3_0());
            	    	    								
            	    	    // InternalGenDsl.g:828:9: ( ( ruleEString ) )
            	    	    // InternalGenDsl.g:829:10: ( ruleEString )
            	    	    {
            	    	    // InternalGenDsl.g:829:10: ( ruleEString )
            	    	    // InternalGenDsl.g:830:11: ruleEString
            	    	    {

            	    	    											if (current==null) {
            	    	    												current = createModelElement(grammarAccess.getPersonRule());
            	    	    											}
            	    	    										

            	    	    											newCompositeNode(grammarAccess.getPersonAccess().getCohabitationsCohabitationCrossReference_11_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_20);
            	    	    ruleEString();

            	    	    state._fsp--;


            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    otherlv_35=(Token)match(input,32,FOLLOW_15); 

            	    								newLeafNode(otherlv_35, grammarAccess.getPersonAccess().getRightParenthesisKeyword_11_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalGenDsl.g:855:3: ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:855:3: ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) )
            	    // InternalGenDsl.g:856:4: {...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 12) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 12)");
            	    }
            	    // InternalGenDsl.g:856:101: ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) )
            	    // InternalGenDsl.g:857:5: ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 12);
            	    				
            	    // InternalGenDsl.g:860:8: ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) )
            	    // InternalGenDsl.g:860:9: {...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:860:18: (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) )
            	    // InternalGenDsl.g:860:19: otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) )
            	    {
            	    otherlv_36=(Token)match(input,34,FOLLOW_3); 

            	    								newLeafNode(otherlv_36, grammarAccess.getPersonAccess().getBirthDateKeyword_12_0());
            	    							
            	    // InternalGenDsl.g:864:8: ( (lv_birthDate_37_0= ruleDateX ) )
            	    // InternalGenDsl.g:865:9: (lv_birthDate_37_0= ruleDateX )
            	    {
            	    // InternalGenDsl.g:865:9: (lv_birthDate_37_0= ruleDateX )
            	    // InternalGenDsl.g:866:10: lv_birthDate_37_0= ruleDateX
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getBirthDateDateXParserRuleCall_12_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_birthDate_37_0=ruleDateX();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"birthDate",
            	    											lv_birthDate_37_0,
            	    											"org.xtext.example.gendsl.GenDsl.DateX");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalGenDsl.g:889:3: ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) )
            	    {
            	    // InternalGenDsl.g:889:3: ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) )
            	    // InternalGenDsl.g:890:4: {...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 13) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 13)");
            	    }
            	    // InternalGenDsl.g:890:101: ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) )
            	    // InternalGenDsl.g:891:5: ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 13);
            	    				
            	    // InternalGenDsl.g:894:8: ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) )
            	    // InternalGenDsl.g:894:9: {...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:894:18: (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) )
            	    // InternalGenDsl.g:894:19: otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) )
            	    {
            	    otherlv_38=(Token)match(input,35,FOLLOW_3); 

            	    								newLeafNode(otherlv_38, grammarAccess.getPersonAccess().getDeathDateKeyword_13_0());
            	    							
            	    // InternalGenDsl.g:898:8: ( (lv_deathDate_39_0= ruleDateX ) )
            	    // InternalGenDsl.g:899:9: (lv_deathDate_39_0= ruleDateX )
            	    {
            	    // InternalGenDsl.g:899:9: (lv_deathDate_39_0= ruleDateX )
            	    // InternalGenDsl.g:900:10: lv_deathDate_39_0= ruleDateX
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getDeathDateDateXParserRuleCall_13_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_deathDate_39_0=ruleDateX();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"deathDate",
            	    											lv_deathDate_39_0,
            	    											"org.xtext.example.gendsl.GenDsl.DateX");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalGenDsl.g:923:3: ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) )
            	    {
            	    // InternalGenDsl.g:923:3: ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) )
            	    // InternalGenDsl.g:924:4: {...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 14) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 14)");
            	    }
            	    // InternalGenDsl.g:924:101: ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) )
            	    // InternalGenDsl.g:925:5: ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 14);
            	    				
            	    // InternalGenDsl.g:928:8: ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) )
            	    // InternalGenDsl.g:928:9: {...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:928:18: (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' )
            	    // InternalGenDsl.g:928:19: otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}'
            	    {
            	    otherlv_40=(Token)match(input,36,FOLLOW_3); 

            	    								newLeafNode(otherlv_40, grammarAccess.getPersonAccess().getPersonhistoryKeyword_14_0());
            	    							
            	    otherlv_41=(Token)match(input,12,FOLLOW_21); 

            	    								newLeafNode(otherlv_41, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_14_1());
            	    							
            	    // InternalGenDsl.g:936:8: ( (lv_personhistory_42_0= rulePersonHistory ) )
            	    // InternalGenDsl.g:937:9: (lv_personhistory_42_0= rulePersonHistory )
            	    {
            	    // InternalGenDsl.g:937:9: (lv_personhistory_42_0= rulePersonHistory )
            	    // InternalGenDsl.g:938:10: lv_personhistory_42_0= rulePersonHistory
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getPersonhistoryPersonHistoryParserRuleCall_14_2_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_personhistory_42_0=rulePersonHistory();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										add(
            	    											current,
            	    											"personhistory",
            	    											lv_personhistory_42_0,
            	    											"org.xtext.example.gendsl.GenDsl.PersonHistory");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalGenDsl.g:955:8: (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==16) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalGenDsl.g:956:9: otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,16,FOLLOW_21); 

            	    	    									newLeafNode(otherlv_43, grammarAccess.getPersonAccess().getCommaKeyword_14_3_0());
            	    	    								
            	    	    // InternalGenDsl.g:960:9: ( (lv_personhistory_44_0= rulePersonHistory ) )
            	    	    // InternalGenDsl.g:961:10: (lv_personhistory_44_0= rulePersonHistory )
            	    	    {
            	    	    // InternalGenDsl.g:961:10: (lv_personhistory_44_0= rulePersonHistory )
            	    	    // InternalGenDsl.g:962:11: lv_personhistory_44_0= rulePersonHistory
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPersonAccess().getPersonhistoryPersonHistoryParserRuleCall_14_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_personhistory_44_0=rulePersonHistory();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"personhistory",
            	    	    												lv_personhistory_44_0,
            	    	    												"org.xtext.example.gendsl.GenDsl.PersonHistory");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_45=(Token)match(input,17,FOLLOW_15); 

            	    								newLeafNode(otherlv_45, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_14_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalGenDsl.g:990:3: ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) )
            	    {
            	    // InternalGenDsl.g:990:3: ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) )
            	    // InternalGenDsl.g:991:4: {...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 15) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 15)");
            	    }
            	    // InternalGenDsl.g:991:101: ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) )
            	    // InternalGenDsl.g:992:5: ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 15);
            	    				
            	    // InternalGenDsl.g:995:8: ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) )
            	    // InternalGenDsl.g:995:9: {...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:995:18: (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' )
            	    // InternalGenDsl.g:995:19: otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}'
            	    {
            	    otherlv_46=(Token)match(input,37,FOLLOW_3); 

            	    								newLeafNode(otherlv_46, grammarAccess.getPersonAccess().getCohabitationKeyword_15_0());
            	    							
            	    otherlv_47=(Token)match(input,12,FOLLOW_22); 

            	    								newLeafNode(otherlv_47, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_15_1());
            	    							
            	    // InternalGenDsl.g:1003:8: ( (lv_cohabitation_48_0= ruleCohabitation ) )
            	    // InternalGenDsl.g:1004:9: (lv_cohabitation_48_0= ruleCohabitation )
            	    {
            	    // InternalGenDsl.g:1004:9: (lv_cohabitation_48_0= ruleCohabitation )
            	    // InternalGenDsl.g:1005:10: lv_cohabitation_48_0= ruleCohabitation
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getCohabitationCohabitationParserRuleCall_15_2_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_cohabitation_48_0=ruleCohabitation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										add(
            	    											current,
            	    											"cohabitation",
            	    											lv_cohabitation_48_0,
            	    											"org.xtext.example.gendsl.GenDsl.Cohabitation");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalGenDsl.g:1022:8: (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==16) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalGenDsl.g:1023:9: otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) )
            	    	    {
            	    	    otherlv_49=(Token)match(input,16,FOLLOW_22); 

            	    	    									newLeafNode(otherlv_49, grammarAccess.getPersonAccess().getCommaKeyword_15_3_0());
            	    	    								
            	    	    // InternalGenDsl.g:1027:9: ( (lv_cohabitation_50_0= ruleCohabitation ) )
            	    	    // InternalGenDsl.g:1028:10: (lv_cohabitation_50_0= ruleCohabitation )
            	    	    {
            	    	    // InternalGenDsl.g:1028:10: (lv_cohabitation_50_0= ruleCohabitation )
            	    	    // InternalGenDsl.g:1029:11: lv_cohabitation_50_0= ruleCohabitation
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPersonAccess().getCohabitationCohabitationParserRuleCall_15_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_cohabitation_50_0=ruleCohabitation();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"cohabitation",
            	    	    												lv_cohabitation_50_0,
            	    	    												"org.xtext.example.gendsl.GenDsl.Cohabitation");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    otherlv_51=(Token)match(input,17,FOLLOW_15); 

            	    								newLeafNode(otherlv_51, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_15_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalGenDsl.g:1057:3: ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) )
            	    {
            	    // InternalGenDsl.g:1057:3: ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) )
            	    // InternalGenDsl.g:1058:4: {...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 16) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 16)");
            	    }
            	    // InternalGenDsl.g:1058:101: ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) )
            	    // InternalGenDsl.g:1059:5: ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 16);
            	    				
            	    // InternalGenDsl.g:1062:8: ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) )
            	    // InternalGenDsl.g:1062:9: {...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGenDsl.g:1062:18: (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' )
            	    // InternalGenDsl.g:1062:19: otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}'
            	    {
            	    otherlv_52=(Token)match(input,38,FOLLOW_3); 

            	    								newLeafNode(otherlv_52, grammarAccess.getPersonAccess().getMarriageKeyword_16_0());
            	    							
            	    otherlv_53=(Token)match(input,12,FOLLOW_23); 

            	    								newLeafNode(otherlv_53, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_16_1());
            	    							
            	    // InternalGenDsl.g:1070:8: ( (lv_marriage_54_0= ruleMarriage ) )
            	    // InternalGenDsl.g:1071:9: (lv_marriage_54_0= ruleMarriage )
            	    {
            	    // InternalGenDsl.g:1071:9: (lv_marriage_54_0= ruleMarriage )
            	    // InternalGenDsl.g:1072:10: lv_marriage_54_0= ruleMarriage
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getMarriageMarriageParserRuleCall_16_2_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_marriage_54_0=ruleMarriage();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										add(
            	    											current,
            	    											"marriage",
            	    											lv_marriage_54_0,
            	    											"org.xtext.example.gendsl.GenDsl.Marriage");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalGenDsl.g:1089:8: (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==16) ) {
            	            alt13=1;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalGenDsl.g:1090:9: otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) )
            	    	    {
            	    	    otherlv_55=(Token)match(input,16,FOLLOW_23); 

            	    	    									newLeafNode(otherlv_55, grammarAccess.getPersonAccess().getCommaKeyword_16_3_0());
            	    	    								
            	    	    // InternalGenDsl.g:1094:9: ( (lv_marriage_56_0= ruleMarriage ) )
            	    	    // InternalGenDsl.g:1095:10: (lv_marriage_56_0= ruleMarriage )
            	    	    {
            	    	    // InternalGenDsl.g:1095:10: (lv_marriage_56_0= ruleMarriage )
            	    	    // InternalGenDsl.g:1096:11: lv_marriage_56_0= ruleMarriage
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPersonAccess().getMarriageMarriageParserRuleCall_16_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_marriage_56_0=ruleMarriage();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"marriage",
            	    	    												lv_marriage_56_0,
            	    	    												"org.xtext.example.gendsl.GenDsl.Marriage");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    otherlv_57=(Token)match(input,17,FOLLOW_15); 

            	    								newLeafNode(otherlv_57, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_16_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPersonAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canLeave(grammarAccess.getPersonAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getPersonAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleEIntegerObject"
    // InternalGenDsl.g:1135:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalGenDsl.g:1135:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalGenDsl.g:1136:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
            {
             newCompositeNode(grammarAccess.getEIntegerObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIntegerObject=ruleEIntegerObject();

            state._fsp--;

             current =iv_ruleEIntegerObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIntegerObject"


    // $ANTLR start "ruleEIntegerObject"
    // InternalGenDsl.g:1142:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1148:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGenDsl.g:1149:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGenDsl.g:1149:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGenDsl.g:1150:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGenDsl.g:1150:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGenDsl.g:1151:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntegerObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntegerObjectAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEIntegerObject"


    // $ANTLR start "entryRuleMarriage"
    // InternalGenDsl.g:1168:1: entryRuleMarriage returns [EObject current=null] : iv_ruleMarriage= ruleMarriage EOF ;
    public final EObject entryRuleMarriage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarriage = null;


        try {
            // InternalGenDsl.g:1168:49: (iv_ruleMarriage= ruleMarriage EOF )
            // InternalGenDsl.g:1169:2: iv_ruleMarriage= ruleMarriage EOF
            {
             newCompositeNode(grammarAccess.getMarriageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarriage=ruleMarriage();

            state._fsp--;

             current =iv_ruleMarriage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMarriage"


    // $ANTLR start "ruleMarriage"
    // InternalGenDsl.g:1175:1: ruleMarriage returns [EObject current=null] : ( () otherlv_1= 'Marriage' (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )? (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )? ) ;
    public final EObject ruleMarriage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_fromDate_11_0 = null;

        EObject lv_toDate_13_0 = null;

        EObject lv_children_16_0 = null;

        EObject lv_children_18_0 = null;



        	enterRule();

        try {
            // InternalGenDsl.g:1181:2: ( ( () otherlv_1= 'Marriage' (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )? (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )? ) )
            // InternalGenDsl.g:1182:2: ( () otherlv_1= 'Marriage' (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )? (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )? )
            {
            // InternalGenDsl.g:1182:2: ( () otherlv_1= 'Marriage' (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )? (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )? )
            // InternalGenDsl.g:1183:3: () otherlv_1= 'Marriage' (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )? (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )?
            {
            // InternalGenDsl.g:1183:3: ()
            // InternalGenDsl.g:1184:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarriageAccess().getMarriageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getMarriageAccess().getMarriageKeyword_1());
            		
            // InternalGenDsl.g:1194:3: (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGenDsl.g:1195:4: otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getMarriageAccess().getTypeKeyword_2_0());
                    			
                    // InternalGenDsl.g:1199:4: ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) )
                    // InternalGenDsl.g:1200:5: (lv_type_3_0= ruleTypeOfIntimateRelationship )
                    {
                    // InternalGenDsl.g:1200:5: (lv_type_3_0= ruleTypeOfIntimateRelationship )
                    // InternalGenDsl.g:1201:6: lv_type_3_0= ruleTypeOfIntimateRelationship
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getTypeTypeOfIntimateRelationshipEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_type_3_0=ruleTypeOfIntimateRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.xtext.example.gendsl.GenDsl.TypeOfIntimateRelationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:1219:3: (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGenDsl.g:1220:4: otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getMarriageAccess().getSpousesKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getMarriageAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalGenDsl.g:1228:4: ( ( ruleEString ) )
                    // InternalGenDsl.g:1229:5: ( ruleEString )
                    {
                    // InternalGenDsl.g:1229:5: ( ruleEString )
                    // InternalGenDsl.g:1230:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMarriageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMarriageAccess().getSpousesPersonCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenDsl.g:1244:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalGenDsl.g:1245:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMarriageAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGenDsl.g:1249:5: ( ( ruleEString ) )
                    	    // InternalGenDsl.g:1250:6: ( ruleEString )
                    	    {
                    	    // InternalGenDsl.g:1250:6: ( ruleEString )
                    	    // InternalGenDsl.g:1251:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMarriageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMarriageAccess().getSpousesPersonCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,32,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getMarriageAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalGenDsl.g:1271:3: (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGenDsl.g:1272:4: otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) )
                    {
                    otherlv_10=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getMarriageAccess().getFromDateKeyword_4_0());
                    			
                    // InternalGenDsl.g:1276:4: ( (lv_fromDate_11_0= ruleDateX ) )
                    // InternalGenDsl.g:1277:5: (lv_fromDate_11_0= ruleDateX )
                    {
                    // InternalGenDsl.g:1277:5: (lv_fromDate_11_0= ruleDateX )
                    // InternalGenDsl.g:1278:6: lv_fromDate_11_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getFromDateDateXParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_fromDate_11_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"fromDate",
                    							lv_fromDate_11_0,
                    							"org.xtext.example.gendsl.GenDsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:1296:3: (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGenDsl.g:1297:4: otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) )
                    {
                    otherlv_12=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getMarriageAccess().getToDateKeyword_5_0());
                    			
                    // InternalGenDsl.g:1301:4: ( (lv_toDate_13_0= ruleDateX ) )
                    // InternalGenDsl.g:1302:5: (lv_toDate_13_0= ruleDateX )
                    {
                    // InternalGenDsl.g:1302:5: (lv_toDate_13_0= ruleDateX )
                    // InternalGenDsl.g:1303:6: lv_toDate_13_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getToDateDateXParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_toDate_13_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"toDate",
                    							lv_toDate_13_0,
                    							"org.xtext.example.gendsl.GenDsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:1321:3: (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGenDsl.g:1322:4: otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getMarriageAccess().getChildrenKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getMarriageAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGenDsl.g:1330:4: ( (lv_children_16_0= rulePerson ) )
                    // InternalGenDsl.g:1331:5: (lv_children_16_0= rulePerson )
                    {
                    // InternalGenDsl.g:1331:5: (lv_children_16_0= rulePerson )
                    // InternalGenDsl.g:1332:6: lv_children_16_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getChildrenPersonParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_children_16_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_16_0,
                    							"org.xtext.example.gendsl.GenDsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenDsl.g:1349:4: (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalGenDsl.g:1350:5: otherlv_17= ',' ( (lv_children_18_0= rulePerson ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getMarriageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGenDsl.g:1354:5: ( (lv_children_18_0= rulePerson ) )
                    	    // InternalGenDsl.g:1355:6: (lv_children_18_0= rulePerson )
                    	    {
                    	    // InternalGenDsl.g:1355:6: (lv_children_18_0= rulePerson )
                    	    // InternalGenDsl.g:1356:7: lv_children_18_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getMarriageAccess().getChildrenPersonParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_children_18_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMarriageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_18_0,
                    	    								"org.xtext.example.gendsl.GenDsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getMarriageAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMarriage"


    // $ANTLR start "entryRuleCohabitation"
    // InternalGenDsl.g:1383:1: entryRuleCohabitation returns [EObject current=null] : iv_ruleCohabitation= ruleCohabitation EOF ;
    public final EObject entryRuleCohabitation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCohabitation = null;


        try {
            // InternalGenDsl.g:1383:53: (iv_ruleCohabitation= ruleCohabitation EOF )
            // InternalGenDsl.g:1384:2: iv_ruleCohabitation= ruleCohabitation EOF
            {
             newCompositeNode(grammarAccess.getCohabitationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCohabitation=ruleCohabitation();

            state._fsp--;

             current =iv_ruleCohabitation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCohabitation"


    // $ANTLR start "ruleCohabitation"
    // InternalGenDsl.g:1390:1: ruleCohabitation returns [EObject current=null] : ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleCohabitation() throws RecognitionException {
        EObject current = null;

        Token lv_legitimate_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Enumerator lv_type_5_0 = null;

        EObject lv_children_14_0 = null;

        EObject lv_children_16_0 = null;



        	enterRule();

        try {
            // InternalGenDsl.g:1396:2: ( ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalGenDsl.g:1397:2: ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalGenDsl.g:1397:2: ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalGenDsl.g:1398:3: () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalGenDsl.g:1398:3: ()
            // InternalGenDsl.g:1399:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCohabitationAccess().getCohabitationAction_0(),
            					current);
            			

            }

            // InternalGenDsl.g:1405:3: ( (lv_legitimate_1_0= 'legitimate' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGenDsl.g:1406:4: (lv_legitimate_1_0= 'legitimate' )
                    {
                    // InternalGenDsl.g:1406:4: (lv_legitimate_1_0= 'legitimate' )
                    // InternalGenDsl.g:1407:5: lv_legitimate_1_0= 'legitimate'
                    {
                    lv_legitimate_1_0=(Token)match(input,45,FOLLOW_31); 

                    					newLeafNode(lv_legitimate_1_0, grammarAccess.getCohabitationAccess().getLegitimateLegitimateKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCohabitationRule());
                    					}
                    					setWithLastConsumed(current, "legitimate", true, "legitimate");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCohabitationAccess().getCohabitationKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getCohabitationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGenDsl.g:1427:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGenDsl.g:1428:4: otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getCohabitationAccess().getTypeKeyword_4_0());
                    			
                    // InternalGenDsl.g:1432:4: ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) )
                    // InternalGenDsl.g:1433:5: (lv_type_5_0= ruleTypeOfIntimateRelationship )
                    {
                    // InternalGenDsl.g:1433:5: (lv_type_5_0= ruleTypeOfIntimateRelationship )
                    // InternalGenDsl.g:1434:6: lv_type_5_0= ruleTypeOfIntimateRelationship
                    {

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getTypeTypeOfIntimateRelationshipEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_type_5_0=ruleTypeOfIntimateRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCohabitationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.example.gendsl.GenDsl.TypeOfIntimateRelationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:1452:3: (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGenDsl.g:1453:4: otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,47,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getCohabitationAccess().getPartnersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getCohabitationAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalGenDsl.g:1461:4: ( ( ruleEString ) )
                    // InternalGenDsl.g:1462:5: ( ruleEString )
                    {
                    // InternalGenDsl.g:1462:5: ( ruleEString )
                    // InternalGenDsl.g:1463:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCohabitationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getPartnersPersonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenDsl.g:1477:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==16) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalGenDsl.g:1478:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCohabitationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGenDsl.g:1482:5: ( ( ruleEString ) )
                    	    // InternalGenDsl.g:1483:6: ( ruleEString )
                    	    {
                    	    // InternalGenDsl.g:1483:6: ( ruleEString )
                    	    // InternalGenDsl.g:1484:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCohabitationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCohabitationAccess().getPartnersPersonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,32,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getCohabitationAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGenDsl.g:1504:3: (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGenDsl.g:1505:4: otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getCohabitationAccess().getChildrenKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getCohabitationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGenDsl.g:1513:4: ( (lv_children_14_0= rulePerson ) )
                    // InternalGenDsl.g:1514:5: (lv_children_14_0= rulePerson )
                    {
                    // InternalGenDsl.g:1514:5: (lv_children_14_0= rulePerson )
                    // InternalGenDsl.g:1515:6: lv_children_14_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getChildrenPersonParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_children_14_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCohabitationRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_14_0,
                    							"org.xtext.example.gendsl.GenDsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenDsl.g:1532:4: (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGenDsl.g:1533:5: otherlv_15= ',' ( (lv_children_16_0= rulePerson ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCohabitationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGenDsl.g:1537:5: ( (lv_children_16_0= rulePerson ) )
                    	    // InternalGenDsl.g:1538:6: (lv_children_16_0= rulePerson )
                    	    {
                    	    // InternalGenDsl.g:1538:6: (lv_children_16_0= rulePerson )
                    	    // InternalGenDsl.g:1539:7: lv_children_16_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getCohabitationAccess().getChildrenPersonParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_children_16_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCohabitationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_16_0,
                    	    								"org.xtext.example.gendsl.GenDsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_17, grammarAccess.getCohabitationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getCohabitationAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCohabitation"


    // $ANTLR start "entryRulePersonHistory"
    // InternalGenDsl.g:1570:1: entryRulePersonHistory returns [EObject current=null] : iv_rulePersonHistory= rulePersonHistory EOF ;
    public final EObject entryRulePersonHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonHistory = null;


        try {
            // InternalGenDsl.g:1570:54: (iv_rulePersonHistory= rulePersonHistory EOF )
            // InternalGenDsl.g:1571:2: iv_rulePersonHistory= rulePersonHistory EOF
            {
             newCompositeNode(grammarAccess.getPersonHistoryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonHistory=rulePersonHistory();

            state._fsp--;

             current =iv_rulePersonHistory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePersonHistory"


    // $ANTLR start "rulePersonHistory"
    // InternalGenDsl.g:1577:1: rulePersonHistory returns [EObject current=null] : ( () otherlv_1= 'PersonHistory' otherlv_2= '{' (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )? (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )? (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )? otherlv_9= '}' ) ;
    public final EObject rulePersonHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_gender_4_0 = null;

        AntlrDatatypeRuleToken lv_givenName_6_0 = null;

        AntlrDatatypeRuleToken lv_changed_8_0 = null;



        	enterRule();

        try {
            // InternalGenDsl.g:1583:2: ( ( () otherlv_1= 'PersonHistory' otherlv_2= '{' (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )? (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )? (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )? otherlv_9= '}' ) )
            // InternalGenDsl.g:1584:2: ( () otherlv_1= 'PersonHistory' otherlv_2= '{' (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )? (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )? (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )? otherlv_9= '}' )
            {
            // InternalGenDsl.g:1584:2: ( () otherlv_1= 'PersonHistory' otherlv_2= '{' (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )? (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )? (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )? otherlv_9= '}' )
            // InternalGenDsl.g:1585:3: () otherlv_1= 'PersonHistory' otherlv_2= '{' (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )? (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )? (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )? otherlv_9= '}'
            {
            // InternalGenDsl.g:1585:3: ()
            // InternalGenDsl.g:1586:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonHistoryAccess().getPersonHistoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonHistoryAccess().getPersonHistoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonHistoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGenDsl.g:1600:3: (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGenDsl.g:1601:4: otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonHistoryAccess().getGenderKeyword_3_0());
                    			
                    // InternalGenDsl.g:1605:4: ( (lv_gender_4_0= ruleGender ) )
                    // InternalGenDsl.g:1606:5: (lv_gender_4_0= ruleGender )
                    {
                    // InternalGenDsl.g:1606:5: (lv_gender_4_0= ruleGender )
                    // InternalGenDsl.g:1607:6: lv_gender_4_0= ruleGender
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getGenderGenderEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_gender_4_0=ruleGender();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonHistoryRule());
                    						}
                    						set(
                    							current,
                    							"gender",
                    							lv_gender_4_0,
                    							"org.xtext.example.gendsl.GenDsl.Gender");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:1625:3: (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGenDsl.g:1626:4: otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,49,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonHistoryAccess().getGivenNameKeyword_4_0());
                    			
                    // InternalGenDsl.g:1630:4: ( (lv_givenName_6_0= ruleEString ) )
                    // InternalGenDsl.g:1631:5: (lv_givenName_6_0= ruleEString )
                    {
                    // InternalGenDsl.g:1631:5: (lv_givenName_6_0= ruleEString )
                    // InternalGenDsl.g:1632:6: lv_givenName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getGivenNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_givenName_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonHistoryRule());
                    						}
                    						set(
                    							current,
                    							"givenName",
                    							lv_givenName_6_0,
                    							"org.xtext.example.gendsl.GenDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:1650:3: (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGenDsl.g:1651:4: otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) )
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_38); 

                    				newLeafNode(otherlv_7, grammarAccess.getPersonHistoryAccess().getChangedKeyword_5_0());
                    			
                    // InternalGenDsl.g:1655:4: ( (lv_changed_8_0= ruleEDate ) )
                    // InternalGenDsl.g:1656:5: (lv_changed_8_0= ruleEDate )
                    {
                    // InternalGenDsl.g:1656:5: (lv_changed_8_0= ruleEDate )
                    // InternalGenDsl.g:1657:6: lv_changed_8_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getChangedEDateParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_changed_8_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonHistoryRule());
                    						}
                    						set(
                    							current,
                    							"changed",
                    							lv_changed_8_0,
                    							"org.xtext.example.gendsl.GenDsl.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPersonHistoryAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePersonHistory"


    // $ANTLR start "entryRuleEBoolean"
    // InternalGenDsl.g:1683:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGenDsl.g:1683:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGenDsl.g:1684:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalGenDsl.g:1690:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1696:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGenDsl.g:1697:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGenDsl.g:1697:2: (kw= 'true' | kw= 'false' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            else if ( (LA32_0==52) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalGenDsl.g:1698:3: kw= 'true'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGenDsl.g:1704:3: kw= 'false'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEDate"
    // InternalGenDsl.g:1713:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalGenDsl.g:1713:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalGenDsl.g:1714:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalGenDsl.g:1720:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1726:2: (kw= 'EDate' )
            // InternalGenDsl.g:1727:2: kw= 'EDate'
            {
            kw=(Token)match(input,53,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "ruleTypeOfPerson"
    // InternalGenDsl.g:1735:1: ruleTypeOfPerson returns [Enumerator current=null] : ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) ) ;
    public final Enumerator ruleTypeOfPerson() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1741:2: ( ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) ) )
            // InternalGenDsl.g:1742:2: ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) )
            {
            // InternalGenDsl.g:1742:2: ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt33=1;
                }
                break;
            case 55:
                {
                alt33=2;
                }
                break;
            case 56:
                {
                alt33=3;
                }
                break;
            case 57:
                {
                alt33=4;
                }
                break;
            case 58:
                {
                alt33=5;
                }
                break;
            case 59:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalGenDsl.g:1743:3: (enumLiteral_0= 'BIOLOGICAL' )
                    {
                    // InternalGenDsl.g:1743:3: (enumLiteral_0= 'BIOLOGICAL' )
                    // InternalGenDsl.g:1744:4: enumLiteral_0= 'BIOLOGICAL'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getBIOLOGICALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfPersonAccess().getBIOLOGICALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenDsl.g:1751:3: (enumLiteral_1= 'ADOPTED' )
                    {
                    // InternalGenDsl.g:1751:3: (enumLiteral_1= 'ADOPTED' )
                    // InternalGenDsl.g:1752:4: enumLiteral_1= 'ADOPTED'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getADOPTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfPersonAccess().getADOPTEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenDsl.g:1759:3: (enumLiteral_2= 'SEMIADOPTED' )
                    {
                    // InternalGenDsl.g:1759:3: (enumLiteral_2= 'SEMIADOPTED' )
                    // InternalGenDsl.g:1760:4: enumLiteral_2= 'SEMIADOPTED'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getSEMIADOPTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeOfPersonAccess().getSEMIADOPTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGenDsl.g:1767:3: (enumLiteral_3= 'MARRIED' )
                    {
                    // InternalGenDsl.g:1767:3: (enumLiteral_3= 'MARRIED' )
                    // InternalGenDsl.g:1768:4: enumLiteral_3= 'MARRIED'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getMARRIEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeOfPersonAccess().getMARRIEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGenDsl.g:1775:3: (enumLiteral_4= 'DISOWNED' )
                    {
                    // InternalGenDsl.g:1775:3: (enumLiteral_4= 'DISOWNED' )
                    // InternalGenDsl.g:1776:4: enumLiteral_4= 'DISOWNED'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getDISOWNEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeOfPersonAccess().getDISOWNEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGenDsl.g:1783:3: (enumLiteral_5= 'ILLEGITIMATE' )
                    {
                    // InternalGenDsl.g:1783:3: (enumLiteral_5= 'ILLEGITIMATE' )
                    // InternalGenDsl.g:1784:4: enumLiteral_5= 'ILLEGITIMATE'
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getILLEGITIMATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTypeOfPersonAccess().getILLEGITIMATEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeOfPerson"


    // $ANTLR start "ruleGender"
    // InternalGenDsl.g:1794:1: ruleGender returns [Enumerator current=null] : ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) ) ;
    public final Enumerator ruleGender() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1800:2: ( ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) ) )
            // InternalGenDsl.g:1801:2: ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) )
            {
            // InternalGenDsl.g:1801:2: ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt34=1;
                }
                break;
            case 61:
                {
                alt34=2;
                }
                break;
            case 62:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalGenDsl.g:1802:3: (enumLiteral_0= 'MALE' )
                    {
                    // InternalGenDsl.g:1802:3: (enumLiteral_0= 'MALE' )
                    // InternalGenDsl.g:1803:4: enumLiteral_0= 'MALE'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getMALEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGenderAccess().getMALEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenDsl.g:1810:3: (enumLiteral_1= 'FEMALE' )
                    {
                    // InternalGenDsl.g:1810:3: (enumLiteral_1= 'FEMALE' )
                    // InternalGenDsl.g:1811:4: enumLiteral_1= 'FEMALE'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getFEMALEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGenderAccess().getFEMALEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenDsl.g:1818:3: (enumLiteral_2= 'BIGENDER' )
                    {
                    // InternalGenDsl.g:1818:3: (enumLiteral_2= 'BIGENDER' )
                    // InternalGenDsl.g:1819:4: enumLiteral_2= 'BIGENDER'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getBIGENDEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGenderAccess().getBIGENDEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGender"


    // $ANTLR start "ruleTypeOfIntimateRelationship"
    // InternalGenDsl.g:1829:1: ruleTypeOfIntimateRelationship returns [Enumerator current=null] : ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) ) ;
    public final Enumerator ruleTypeOfIntimateRelationship() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1835:2: ( ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) ) )
            // InternalGenDsl.g:1836:2: ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) )
            {
            // InternalGenDsl.g:1836:2: ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt35=1;
                }
                break;
            case 64:
                {
                alt35=2;
                }
                break;
            case 65:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalGenDsl.g:1837:3: (enumLiteral_0= 'MONOGAMY' )
                    {
                    // InternalGenDsl.g:1837:3: (enumLiteral_0= 'MONOGAMY' )
                    // InternalGenDsl.g:1838:4: enumLiteral_0= 'MONOGAMY'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getMONOGAMYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfIntimateRelationshipAccess().getMONOGAMYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenDsl.g:1845:3: (enumLiteral_1= 'POLYGAMY' )
                    {
                    // InternalGenDsl.g:1845:3: (enumLiteral_1= 'POLYGAMY' )
                    // InternalGenDsl.g:1846:4: enumLiteral_1= 'POLYGAMY'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYGAMYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYGAMYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenDsl.g:1853:3: (enumLiteral_2= 'POLYFIDELITY' )
                    {
                    // InternalGenDsl.g:1853:3: (enumLiteral_2= 'POLYFIDELITY' )
                    // InternalGenDsl.g:1854:4: enumLiteral_2= 'POLYFIDELITY'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYFIDELITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYFIDELITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeOfIntimateRelationship"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\1\22\uffff";
    static final String dfa_3s = "\1\4\22\uffff";
    static final String dfa_4s = "\1\46\22\uffff";
    static final String dfa_5s = "\1\uffff\1\22\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21";
    static final String dfa_6s = "\1\0\22\uffff}>";
    static final String[] dfa_7s = {
            "\2\2\12\uffff\2\1\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff\1\15\1\16\1\17\1\20\1\21\1\22",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 365:5: ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'marriages' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'cohabitations' otherlv_31= '(' ( ( ruleEString ) ) (otherlv_33= ',' ( ( ruleEString ) ) )* otherlv_35= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'birthDate' ( (lv_birthDate_37_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'deathDate' ( (lv_deathDate_39_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'personhistory' otherlv_41= '{' ( (lv_personhistory_42_0= rulePersonHistory ) ) (otherlv_43= ',' ( (lv_personhistory_44_0= rulePersonHistory ) ) )* otherlv_45= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= 'cohabitation' otherlv_47= '{' ( (lv_cohabitation_48_0= ruleCohabitation ) ) (otherlv_49= ',' ( (lv_cohabitation_50_0= ruleCohabitation ) ) )* otherlv_51= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_52= 'marriage' otherlv_53= '{' ( (lv_marriage_54_0= ruleMarriage ) ) (otherlv_55= ',' ( (lv_marriage_56_0= ruleMarriage ) ) )* otherlv_57= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==EOF||(LA14_0>=16 && LA14_0<=17)) ) {s = 1;}

                        else if ( LA14_0 >= RULE_STRING && LA14_0 <= RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA14_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA14_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA14_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA14_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA14_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA14_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA14_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA14_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA14_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA14_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 10) ) {s = 12;}

                        else if ( LA14_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 11) ) {s = 13;}

                        else if ( LA14_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 12) ) {s = 14;}

                        else if ( LA14_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 13) ) {s = 15;}

                        else if ( LA14_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 14) ) {s = 16;}

                        else if ( LA14_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 15) ) {s = 17;}

                        else if ( LA14_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 16) ) {s = 18;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000007E7FE00030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000007E7FE00032L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00001E0002000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000900002020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000900000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0006000004020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0006000000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000000L});

}
