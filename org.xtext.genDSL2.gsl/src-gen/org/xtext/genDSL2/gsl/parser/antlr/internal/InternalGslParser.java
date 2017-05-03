package org.xtext.genDSL2.gsl.parser.antlr.internal;

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
import org.xtext.genDSL2.gsl.services.GslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GenealogyTree'", "'{'", "'familyName'", "'established'", "'persons'", "','", "'}'", "'year'", "'month'", "'day'", "'unknown'", "'birthPlace'", "'deathPlace'", "'restingPlace'", "'type'", "'gender'", "'otherNames'", "'nickname'", "'deathCause'", "'birthDate'", "'deathDate'", "'personhistory'", "'cohabitation'", "'marriage'", "'-'", "'PersonHistory'", "'givenName'", "'changed'", "'legitimate'", "'Cohabitation'", "'partners'", "'children'", "'Marriage'", "'spouses'", "'('", "')'", "'fromDate'", "'toDate'", "'true'", "'false'", "'EDate'", "'BIOLOGICAL'", "'ADOPTED'", "'SEMIADOPTED'", "'MARRIED'", "'DISOWNED'", "'ILLEGITIMATE'", "'MALE'", "'FEMALE'", "'BIGENDER'", "'MONOGAMY'", "'POLYGAMY'", "'POLYFIDELITY'"
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
    public static final int T__21=21;
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


        public InternalGslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGsl.g"; }



     	private GslGrammarAccess grammarAccess;

        public InternalGslParser(TokenStream input, GslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GenealogyTree";
       	}

       	@Override
       	protected GslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGenealogyTree"
    // InternalGsl.g:65:1: entryRuleGenealogyTree returns [EObject current=null] : iv_ruleGenealogyTree= ruleGenealogyTree EOF ;
    public final EObject entryRuleGenealogyTree() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenealogyTree = null;


        try {
            // InternalGsl.g:65:54: (iv_ruleGenealogyTree= ruleGenealogyTree EOF )
            // InternalGsl.g:66:2: iv_ruleGenealogyTree= ruleGenealogyTree EOF
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
    // InternalGsl.g:72:1: ruleGenealogyTree returns [EObject current=null] : (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalGsl.g:78:2: ( (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalGsl.g:79:2: (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalGsl.g:79:2: (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalGsl.g:80:3: otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGenealogyTreeAccess().getGenealogyTreeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGenealogyTreeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGenealogyTreeAccess().getFamilyNameKeyword_2());
            		
            // InternalGsl.g:92:3: ( (lv_familyName_3_0= ruleEString ) )
            // InternalGsl.g:93:4: (lv_familyName_3_0= ruleEString )
            {
            // InternalGsl.g:93:4: (lv_familyName_3_0= ruleEString )
            // InternalGsl.g:94:5: lv_familyName_3_0= ruleEString
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
            						"org.xtext.genDSL2.gsl.Gsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:111:3: (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGsl.g:112:4: otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getGenealogyTreeAccess().getEstablishedKeyword_4_0());
                    			
                    // InternalGsl.g:116:4: ( (lv_established_5_0= ruleDateX ) )
                    // InternalGsl.g:117:5: (lv_established_5_0= ruleDateX )
                    {
                    // InternalGsl.g:117:5: (lv_established_5_0= ruleDateX )
                    // InternalGsl.g:118:6: lv_established_5_0= ruleDateX
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
                    							"org.xtext.genDSL2.gsl.Gsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:136:3: (otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGsl.g:137:4: otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGenealogyTreeAccess().getPersonsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getGenealogyTreeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGsl.g:145:4: ( (lv_person_8_0= rulePerson ) )
                    // InternalGsl.g:146:5: (lv_person_8_0= rulePerson )
                    {
                    // InternalGsl.g:146:5: (lv_person_8_0= rulePerson )
                    // InternalGsl.g:147:6: lv_person_8_0= rulePerson
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
                    							"org.xtext.genDSL2.gsl.Gsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:164:4: (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalGsl.g:165:5: otherlv_9= ',' ( (lv_person_10_0= rulePerson ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGenealogyTreeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGsl.g:169:5: ( (lv_person_10_0= rulePerson ) )
                    	    // InternalGsl.g:170:6: (lv_person_10_0= rulePerson )
                    	    {
                    	    // InternalGsl.g:170:6: (lv_person_10_0= rulePerson )
                    	    // InternalGsl.g:171:7: lv_person_10_0= rulePerson
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
                    	    								"org.xtext.genDSL2.gsl.Gsl.Person");
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
    // InternalGsl.g:202:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGsl.g:202:47: (iv_ruleEString= ruleEString EOF )
            // InternalGsl.g:203:2: iv_ruleEString= ruleEString EOF
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
    // InternalGsl.g:209:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGsl.g:215:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGsl.g:216:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGsl.g:216:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalGsl.g:217:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGsl.g:225:3: this_ID_1= RULE_ID
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
    // InternalGsl.g:236:1: entryRuleDateX returns [EObject current=null] : iv_ruleDateX= ruleDateX EOF ;
    public final EObject entryRuleDateX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateX = null;


        try {
            // InternalGsl.g:236:46: (iv_ruleDateX= ruleDateX EOF )
            // InternalGsl.g:237:2: iv_ruleDateX= ruleDateX EOF
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
    // InternalGsl.g:243:1: ruleDateX returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'year' ( (lv_year_3_0= ruleEInt ) ) )? (otherlv_4= 'month' ( (lv_month_5_0= ruleEInt ) ) )? (otherlv_6= 'day' ( (lv_day_7_0= ruleEInt ) ) )? otherlv_8= '}' ) ;
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
            // InternalGsl.g:249:2: ( ( () otherlv_1= '{' (otherlv_2= 'year' ( (lv_year_3_0= ruleEInt ) ) )? (otherlv_4= 'month' ( (lv_month_5_0= ruleEInt ) ) )? (otherlv_6= 'day' ( (lv_day_7_0= ruleEInt ) ) )? otherlv_8= '}' ) )
            // InternalGsl.g:250:2: ( () otherlv_1= '{' (otherlv_2= 'year' ( (lv_year_3_0= ruleEInt ) ) )? (otherlv_4= 'month' ( (lv_month_5_0= ruleEInt ) ) )? (otherlv_6= 'day' ( (lv_day_7_0= ruleEInt ) ) )? otherlv_8= '}' )
            {
            // InternalGsl.g:250:2: ( () otherlv_1= '{' (otherlv_2= 'year' ( (lv_year_3_0= ruleEInt ) ) )? (otherlv_4= 'month' ( (lv_month_5_0= ruleEInt ) ) )? (otherlv_6= 'day' ( (lv_day_7_0= ruleEInt ) ) )? otherlv_8= '}' )
            // InternalGsl.g:251:3: () otherlv_1= '{' (otherlv_2= 'year' ( (lv_year_3_0= ruleEInt ) ) )? (otherlv_4= 'month' ( (lv_month_5_0= ruleEInt ) ) )? (otherlv_6= 'day' ( (lv_day_7_0= ruleEInt ) ) )? otherlv_8= '}'
            {
            // InternalGsl.g:251:3: ()
            // InternalGsl.g:252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateXAccess().getDateXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDateXAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGsl.g:262:3: (otherlv_2= 'year' ( (lv_year_3_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGsl.g:263:4: otherlv_2= 'year' ( (lv_year_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getDateXAccess().getYearKeyword_2_0());
                    			
                    // InternalGsl.g:267:4: ( (lv_year_3_0= ruleEInt ) )
                    // InternalGsl.g:268:5: (lv_year_3_0= ruleEInt )
                    {
                    // InternalGsl.g:268:5: (lv_year_3_0= ruleEInt )
                    // InternalGsl.g:269:6: lv_year_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getYearEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_year_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateXRule());
                    						}
                    						set(
                    							current,
                    							"year",
                    							lv_year_3_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:287:3: (otherlv_4= 'month' ( (lv_month_5_0= ruleEInt ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGsl.g:288:4: otherlv_4= 'month' ( (lv_month_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getDateXAccess().getMonthKeyword_3_0());
                    			
                    // InternalGsl.g:292:4: ( (lv_month_5_0= ruleEInt ) )
                    // InternalGsl.g:293:5: (lv_month_5_0= ruleEInt )
                    {
                    // InternalGsl.g:293:5: (lv_month_5_0= ruleEInt )
                    // InternalGsl.g:294:6: lv_month_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getMonthEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_month_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateXRule());
                    						}
                    						set(
                    							current,
                    							"month",
                    							lv_month_5_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:312:3: (otherlv_6= 'day' ( (lv_day_7_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGsl.g:313:4: otherlv_6= 'day' ( (lv_day_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getDateXAccess().getDayKeyword_4_0());
                    			
                    // InternalGsl.g:317:4: ( (lv_day_7_0= ruleEInt ) )
                    // InternalGsl.g:318:5: (lv_day_7_0= ruleEInt )
                    {
                    // InternalGsl.g:318:5: (lv_day_7_0= ruleEInt )
                    // InternalGsl.g:319:6: lv_day_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getDayEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_day_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateXRule());
                    						}
                    						set(
                    							current,
                    							"day",
                    							lv_day_7_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EInt");
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
    // InternalGsl.g:345:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalGsl.g:345:47: (iv_rulePerson= rulePerson EOF )
            // InternalGsl.g:346:2: iv_rulePerson= rulePerson EOF
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
    // InternalGsl.g:352:1: rulePerson returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+ {...}?) ) ) ;
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
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
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

        EObject lv_birthDate_25_0 = null;

        EObject lv_deathDate_27_0 = null;

        EObject lv_personhistory_30_0 = null;

        EObject lv_personhistory_32_0 = null;

        EObject lv_cohabitation_36_0 = null;

        EObject lv_cohabitation_38_0 = null;

        EObject lv_marriage_42_0 = null;

        EObject lv_marriage_44_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:358:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalGsl.g:359:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalGsl.g:359:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+ {...}?) ) )
            // InternalGsl.g:360:3: ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalGsl.g:360:3: ( ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+ {...}?) )
            // InternalGsl.g:361:4: ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPersonAccess().getUnorderedGroup());
            			
            // InternalGsl.g:364:4: ( ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+ {...}?)
            // InternalGsl.g:365:5: ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+ {...}?
            {
            // InternalGsl.g:365:5: ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=16;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalGsl.g:366:3: ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) )
            	    {
            	    // InternalGsl.g:366:3: ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:367:4: {...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalGsl.g:367:100: ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) )
            	    // InternalGsl.g:368:5: ({...}? => ( (lv_givenName_1_0= ruleEString ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalGsl.g:371:8: ({...}? => ( (lv_givenName_1_0= ruleEString ) ) )
            	    // InternalGsl.g:371:9: {...}? => ( (lv_givenName_1_0= ruleEString ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:371:18: ( (lv_givenName_1_0= ruleEString ) )
            	    // InternalGsl.g:371:19: (lv_givenName_1_0= ruleEString )
            	    {
            	    // InternalGsl.g:371:19: (lv_givenName_1_0= ruleEString )
            	    // InternalGsl.g:372:9: lv_givenName_1_0= ruleEString
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
            	    										"org.xtext.genDSL2.gsl.Gsl.EString");
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
            	    // InternalGsl.g:394:3: ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:394:3: ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalGsl.g:395:4: {...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalGsl.g:395:100: ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) )
            	    // InternalGsl.g:396:5: ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalGsl.g:399:8: ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) )
            	    // InternalGsl.g:399:9: {...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:399:18: (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) )
            	    // InternalGsl.g:399:19: otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_16); 

            	    								newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getUnknownKeyword_1_0());
            	    							
            	    // InternalGsl.g:403:8: ( (lv_unknown_3_0= ruleEBoolean ) )
            	    // InternalGsl.g:404:9: (lv_unknown_3_0= ruleEBoolean )
            	    {
            	    // InternalGsl.g:404:9: (lv_unknown_3_0= ruleEBoolean )
            	    // InternalGsl.g:405:10: lv_unknown_3_0= ruleEBoolean
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
            	    											"org.xtext.genDSL2.gsl.Gsl.EBoolean");
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
            	    // InternalGsl.g:428:3: ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:428:3: ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) )
            	    // InternalGsl.g:429:4: {...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalGsl.g:429:100: ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:430:5: ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalGsl.g:433:8: ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) )
            	    // InternalGsl.g:433:9: {...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:433:18: (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) )
            	    // InternalGsl.g:433:19: otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_5); 

            	    								newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getBirthPlaceKeyword_2_0());
            	    							
            	    // InternalGsl.g:437:8: ( (lv_birthPlace_5_0= ruleEString ) )
            	    // InternalGsl.g:438:9: (lv_birthPlace_5_0= ruleEString )
            	    {
            	    // InternalGsl.g:438:9: (lv_birthPlace_5_0= ruleEString )
            	    // InternalGsl.g:439:10: lv_birthPlace_5_0= ruleEString
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
            	    											"org.xtext.genDSL2.gsl.Gsl.EString");
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
            	    // InternalGsl.g:462:3: ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:462:3: ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) )
            	    // InternalGsl.g:463:4: {...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalGsl.g:463:100: ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:464:5: ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalGsl.g:467:8: ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) )
            	    // InternalGsl.g:467:9: {...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:467:18: (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) )
            	    // InternalGsl.g:467:19: otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FOLLOW_5); 

            	    								newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getDeathPlaceKeyword_3_0());
            	    							
            	    // InternalGsl.g:471:8: ( (lv_deathPlace_7_0= ruleEString ) )
            	    // InternalGsl.g:472:9: (lv_deathPlace_7_0= ruleEString )
            	    {
            	    // InternalGsl.g:472:9: (lv_deathPlace_7_0= ruleEString )
            	    // InternalGsl.g:473:10: lv_deathPlace_7_0= ruleEString
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
            	    											"org.xtext.genDSL2.gsl.Gsl.EString");
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
            	    // InternalGsl.g:496:3: ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:496:3: ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) )
            	    // InternalGsl.g:497:4: {...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalGsl.g:497:100: ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:498:5: ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalGsl.g:501:8: ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) )
            	    // InternalGsl.g:501:9: {...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:501:18: (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) )
            	    // InternalGsl.g:501:19: otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_5); 

            	    								newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getRestingPlaceKeyword_4_0());
            	    							
            	    // InternalGsl.g:505:8: ( (lv_restingPlace_9_0= ruleEString ) )
            	    // InternalGsl.g:506:9: (lv_restingPlace_9_0= ruleEString )
            	    {
            	    // InternalGsl.g:506:9: (lv_restingPlace_9_0= ruleEString )
            	    // InternalGsl.g:507:10: lv_restingPlace_9_0= ruleEString
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
            	    											"org.xtext.genDSL2.gsl.Gsl.EString");
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
            	    // InternalGsl.g:530:3: ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:530:3: ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) )
            	    // InternalGsl.g:531:4: {...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalGsl.g:531:100: ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) )
            	    // InternalGsl.g:532:5: ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalGsl.g:535:8: ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) )
            	    // InternalGsl.g:535:9: {...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:535:18: (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) )
            	    // InternalGsl.g:535:19: otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) )
            	    {
            	    otherlv_10=(Token)match(input,25,FOLLOW_17); 

            	    								newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getTypeKeyword_5_0());
            	    							
            	    // InternalGsl.g:539:8: ( (lv_type_11_0= ruleTypeOfPerson ) )
            	    // InternalGsl.g:540:9: (lv_type_11_0= ruleTypeOfPerson )
            	    {
            	    // InternalGsl.g:540:9: (lv_type_11_0= ruleTypeOfPerson )
            	    // InternalGsl.g:541:10: lv_type_11_0= ruleTypeOfPerson
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
            	    											"org.xtext.genDSL2.gsl.Gsl.TypeOfPerson");
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
            	    // InternalGsl.g:564:3: ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:564:3: ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) )
            	    // InternalGsl.g:565:4: {...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalGsl.g:565:100: ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) )
            	    // InternalGsl.g:566:5: ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalGsl.g:569:8: ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) )
            	    // InternalGsl.g:569:9: {...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:569:18: (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) )
            	    // InternalGsl.g:569:19: otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) )
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_18); 

            	    								newLeafNode(otherlv_12, grammarAccess.getPersonAccess().getGenderKeyword_6_0());
            	    							
            	    // InternalGsl.g:573:8: ( (lv_gender_13_0= ruleGender ) )
            	    // InternalGsl.g:574:9: (lv_gender_13_0= ruleGender )
            	    {
            	    // InternalGsl.g:574:9: (lv_gender_13_0= ruleGender )
            	    // InternalGsl.g:575:10: lv_gender_13_0= ruleGender
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
            	    											"org.xtext.genDSL2.gsl.Gsl.Gender");
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
            	    // InternalGsl.g:598:3: ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) )
            	    {
            	    // InternalGsl.g:598:3: ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) )
            	    // InternalGsl.g:599:4: {...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalGsl.g:599:100: ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) )
            	    // InternalGsl.g:600:5: ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalGsl.g:603:8: ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) )
            	    // InternalGsl.g:603:9: {...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:603:18: (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' )
            	    // InternalGsl.g:603:19: otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}'
            	    {
            	    otherlv_14=(Token)match(input,27,FOLLOW_3); 

            	    								newLeafNode(otherlv_14, grammarAccess.getPersonAccess().getOtherNamesKeyword_7_0());
            	    							
            	    otherlv_15=(Token)match(input,12,FOLLOW_5); 

            	    								newLeafNode(otherlv_15, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_7_1());
            	    							
            	    // InternalGsl.g:611:8: ( (lv_otherNames_16_0= ruleEString ) )
            	    // InternalGsl.g:612:9: (lv_otherNames_16_0= ruleEString )
            	    {
            	    // InternalGsl.g:612:9: (lv_otherNames_16_0= ruleEString )
            	    // InternalGsl.g:613:10: lv_otherNames_16_0= ruleEString
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
            	    											"org.xtext.genDSL2.gsl.Gsl.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalGsl.g:630:8: (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==16) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalGsl.g:631:9: otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,16,FOLLOW_5); 

            	    	    									newLeafNode(otherlv_17, grammarAccess.getPersonAccess().getCommaKeyword_7_3_0());
            	    	    								
            	    	    // InternalGsl.g:635:9: ( (lv_otherNames_18_0= ruleEString ) )
            	    	    // InternalGsl.g:636:10: (lv_otherNames_18_0= ruleEString )
            	    	    {
            	    	    // InternalGsl.g:636:10: (lv_otherNames_18_0= ruleEString )
            	    	    // InternalGsl.g:637:11: lv_otherNames_18_0= ruleEString
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
            	    	    												"org.xtext.genDSL2.gsl.Gsl.EString");
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
            	    // InternalGsl.g:665:3: ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:665:3: ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) )
            	    // InternalGsl.g:666:4: {...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalGsl.g:666:100: ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:667:5: ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalGsl.g:670:8: ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) )
            	    // InternalGsl.g:670:9: {...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:670:18: (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) )
            	    // InternalGsl.g:670:19: otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) )
            	    {
            	    otherlv_20=(Token)match(input,28,FOLLOW_5); 

            	    								newLeafNode(otherlv_20, grammarAccess.getPersonAccess().getNicknameKeyword_8_0());
            	    							
            	    // InternalGsl.g:674:8: ( (lv_nickname_21_0= ruleEString ) )
            	    // InternalGsl.g:675:9: (lv_nickname_21_0= ruleEString )
            	    {
            	    // InternalGsl.g:675:9: (lv_nickname_21_0= ruleEString )
            	    // InternalGsl.g:676:10: lv_nickname_21_0= ruleEString
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
            	    											"org.xtext.genDSL2.gsl.Gsl.EString");
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
            	    // InternalGsl.g:699:3: ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:699:3: ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) )
            	    // InternalGsl.g:700:4: {...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalGsl.g:700:100: ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:701:5: ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalGsl.g:704:8: ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) )
            	    // InternalGsl.g:704:9: {...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:704:18: (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) )
            	    // InternalGsl.g:704:19: otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) )
            	    {
            	    otherlv_22=(Token)match(input,29,FOLLOW_5); 

            	    								newLeafNode(otherlv_22, grammarAccess.getPersonAccess().getDeathCauseKeyword_9_0());
            	    							
            	    // InternalGsl.g:708:8: ( (lv_deathCause_23_0= ruleEString ) )
            	    // InternalGsl.g:709:9: (lv_deathCause_23_0= ruleEString )
            	    {
            	    // InternalGsl.g:709:9: (lv_deathCause_23_0= ruleEString )
            	    // InternalGsl.g:710:10: lv_deathCause_23_0= ruleEString
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
            	    											"org.xtext.genDSL2.gsl.Gsl.EString");
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
            	    // InternalGsl.g:733:3: ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:733:3: ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) )
            	    // InternalGsl.g:734:4: {...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalGsl.g:734:101: ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) )
            	    // InternalGsl.g:735:5: ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalGsl.g:738:8: ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) )
            	    // InternalGsl.g:738:9: {...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:738:18: (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) )
            	    // InternalGsl.g:738:19: otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) )
            	    {
            	    otherlv_24=(Token)match(input,30,FOLLOW_3); 

            	    								newLeafNode(otherlv_24, grammarAccess.getPersonAccess().getBirthDateKeyword_10_0());
            	    							
            	    // InternalGsl.g:742:8: ( (lv_birthDate_25_0= ruleDateX ) )
            	    // InternalGsl.g:743:9: (lv_birthDate_25_0= ruleDateX )
            	    {
            	    // InternalGsl.g:743:9: (lv_birthDate_25_0= ruleDateX )
            	    // InternalGsl.g:744:10: lv_birthDate_25_0= ruleDateX
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getBirthDateDateXParserRuleCall_10_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_birthDate_25_0=ruleDateX();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"birthDate",
            	    											lv_birthDate_25_0,
            	    											"org.xtext.genDSL2.gsl.Gsl.DateX");
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
            	case 12 :
            	    // InternalGsl.g:767:3: ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:767:3: ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) )
            	    // InternalGsl.g:768:4: {...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 11) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 11)");
            	    }
            	    // InternalGsl.g:768:101: ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) )
            	    // InternalGsl.g:769:5: ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 11);
            	    				
            	    // InternalGsl.g:772:8: ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) )
            	    // InternalGsl.g:772:9: {...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:772:18: (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) )
            	    // InternalGsl.g:772:19: otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) )
            	    {
            	    otherlv_26=(Token)match(input,31,FOLLOW_3); 

            	    								newLeafNode(otherlv_26, grammarAccess.getPersonAccess().getDeathDateKeyword_11_0());
            	    							
            	    // InternalGsl.g:776:8: ( (lv_deathDate_27_0= ruleDateX ) )
            	    // InternalGsl.g:777:9: (lv_deathDate_27_0= ruleDateX )
            	    {
            	    // InternalGsl.g:777:9: (lv_deathDate_27_0= ruleDateX )
            	    // InternalGsl.g:778:10: lv_deathDate_27_0= ruleDateX
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getDeathDateDateXParserRuleCall_11_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_deathDate_27_0=ruleDateX();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										set(
            	    											current,
            	    											"deathDate",
            	    											lv_deathDate_27_0,
            	    											"org.xtext.genDSL2.gsl.Gsl.DateX");
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
            	case 13 :
            	    // InternalGsl.g:801:3: ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) )
            	    {
            	    // InternalGsl.g:801:3: ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) )
            	    // InternalGsl.g:802:4: {...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 12) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 12)");
            	    }
            	    // InternalGsl.g:802:101: ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) )
            	    // InternalGsl.g:803:5: ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 12);
            	    				
            	    // InternalGsl.g:806:8: ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) )
            	    // InternalGsl.g:806:9: {...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:806:18: (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' )
            	    // InternalGsl.g:806:19: otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}'
            	    {
            	    otherlv_28=(Token)match(input,32,FOLLOW_3); 

            	    								newLeafNode(otherlv_28, grammarAccess.getPersonAccess().getPersonhistoryKeyword_12_0());
            	    							
            	    otherlv_29=(Token)match(input,12,FOLLOW_19); 

            	    								newLeafNode(otherlv_29, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_12_1());
            	    							
            	    // InternalGsl.g:814:8: ( (lv_personhistory_30_0= rulePersonHistory ) )
            	    // InternalGsl.g:815:9: (lv_personhistory_30_0= rulePersonHistory )
            	    {
            	    // InternalGsl.g:815:9: (lv_personhistory_30_0= rulePersonHistory )
            	    // InternalGsl.g:816:10: lv_personhistory_30_0= rulePersonHistory
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getPersonhistoryPersonHistoryParserRuleCall_12_2_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_personhistory_30_0=rulePersonHistory();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										add(
            	    											current,
            	    											"personhistory",
            	    											lv_personhistory_30_0,
            	    											"org.xtext.genDSL2.gsl.Gsl.PersonHistory");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalGsl.g:833:8: (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==16) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalGsl.g:834:9: otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,16,FOLLOW_19); 

            	    	    									newLeafNode(otherlv_31, grammarAccess.getPersonAccess().getCommaKeyword_12_3_0());
            	    	    								
            	    	    // InternalGsl.g:838:9: ( (lv_personhistory_32_0= rulePersonHistory ) )
            	    	    // InternalGsl.g:839:10: (lv_personhistory_32_0= rulePersonHistory )
            	    	    {
            	    	    // InternalGsl.g:839:10: (lv_personhistory_32_0= rulePersonHistory )
            	    	    // InternalGsl.g:840:11: lv_personhistory_32_0= rulePersonHistory
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPersonAccess().getPersonhistoryPersonHistoryParserRuleCall_12_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_personhistory_32_0=rulePersonHistory();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"personhistory",
            	    	    												lv_personhistory_32_0,
            	    	    												"org.xtext.genDSL2.gsl.Gsl.PersonHistory");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,17,FOLLOW_15); 

            	    								newLeafNode(otherlv_33, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_12_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalGsl.g:868:3: ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) )
            	    {
            	    // InternalGsl.g:868:3: ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) )
            	    // InternalGsl.g:869:4: {...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 13) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 13)");
            	    }
            	    // InternalGsl.g:869:101: ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) )
            	    // InternalGsl.g:870:5: ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 13);
            	    				
            	    // InternalGsl.g:873:8: ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) )
            	    // InternalGsl.g:873:9: {...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:873:18: (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' )
            	    // InternalGsl.g:873:19: otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}'
            	    {
            	    otherlv_34=(Token)match(input,33,FOLLOW_3); 

            	    								newLeafNode(otherlv_34, grammarAccess.getPersonAccess().getCohabitationKeyword_13_0());
            	    							
            	    otherlv_35=(Token)match(input,12,FOLLOW_20); 

            	    								newLeafNode(otherlv_35, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_13_1());
            	    							
            	    // InternalGsl.g:881:8: ( (lv_cohabitation_36_0= ruleCohabitation ) )
            	    // InternalGsl.g:882:9: (lv_cohabitation_36_0= ruleCohabitation )
            	    {
            	    // InternalGsl.g:882:9: (lv_cohabitation_36_0= ruleCohabitation )
            	    // InternalGsl.g:883:10: lv_cohabitation_36_0= ruleCohabitation
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getCohabitationCohabitationParserRuleCall_13_2_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_cohabitation_36_0=ruleCohabitation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										add(
            	    											current,
            	    											"cohabitation",
            	    											lv_cohabitation_36_0,
            	    											"org.xtext.genDSL2.gsl.Gsl.Cohabitation");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalGsl.g:900:8: (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==16) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalGsl.g:901:9: otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) )
            	    	    {
            	    	    otherlv_37=(Token)match(input,16,FOLLOW_20); 

            	    	    									newLeafNode(otherlv_37, grammarAccess.getPersonAccess().getCommaKeyword_13_3_0());
            	    	    								
            	    	    // InternalGsl.g:905:9: ( (lv_cohabitation_38_0= ruleCohabitation ) )
            	    	    // InternalGsl.g:906:10: (lv_cohabitation_38_0= ruleCohabitation )
            	    	    {
            	    	    // InternalGsl.g:906:10: (lv_cohabitation_38_0= ruleCohabitation )
            	    	    // InternalGsl.g:907:11: lv_cohabitation_38_0= ruleCohabitation
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPersonAccess().getCohabitationCohabitationParserRuleCall_13_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_cohabitation_38_0=ruleCohabitation();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"cohabitation",
            	    	    												lv_cohabitation_38_0,
            	    	    												"org.xtext.genDSL2.gsl.Gsl.Cohabitation");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    otherlv_39=(Token)match(input,17,FOLLOW_15); 

            	    								newLeafNode(otherlv_39, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_13_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalGsl.g:935:3: ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) )
            	    {
            	    // InternalGsl.g:935:3: ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) )
            	    // InternalGsl.g:936:4: {...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 14) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 14)");
            	    }
            	    // InternalGsl.g:936:101: ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) )
            	    // InternalGsl.g:937:5: ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup(), 14);
            	    				
            	    // InternalGsl.g:940:8: ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) )
            	    // InternalGsl.g:940:9: {...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:940:18: (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' )
            	    // InternalGsl.g:940:19: otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}'
            	    {
            	    otherlv_40=(Token)match(input,34,FOLLOW_3); 

            	    								newLeafNode(otherlv_40, grammarAccess.getPersonAccess().getMarriageKeyword_14_0());
            	    							
            	    otherlv_41=(Token)match(input,12,FOLLOW_21); 

            	    								newLeafNode(otherlv_41, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_14_1());
            	    							
            	    // InternalGsl.g:948:8: ( (lv_marriage_42_0= ruleMarriage ) )
            	    // InternalGsl.g:949:9: (lv_marriage_42_0= ruleMarriage )
            	    {
            	    // InternalGsl.g:949:9: (lv_marriage_42_0= ruleMarriage )
            	    // InternalGsl.g:950:10: lv_marriage_42_0= ruleMarriage
            	    {

            	    										newCompositeNode(grammarAccess.getPersonAccess().getMarriageMarriageParserRuleCall_14_2_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_marriage_42_0=ruleMarriage();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPersonRule());
            	    										}
            	    										add(
            	    											current,
            	    											"marriage",
            	    											lv_marriage_42_0,
            	    											"org.xtext.genDSL2.gsl.Gsl.Marriage");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalGsl.g:967:8: (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==16) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalGsl.g:968:9: otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,16,FOLLOW_21); 

            	    	    									newLeafNode(otherlv_43, grammarAccess.getPersonAccess().getCommaKeyword_14_3_0());
            	    	    								
            	    	    // InternalGsl.g:972:9: ( (lv_marriage_44_0= ruleMarriage ) )
            	    	    // InternalGsl.g:973:10: (lv_marriage_44_0= ruleMarriage )
            	    	    {
            	    	    // InternalGsl.g:973:10: (lv_marriage_44_0= ruleMarriage )
            	    	    // InternalGsl.g:974:11: lv_marriage_44_0= ruleMarriage
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getPersonAccess().getMarriageMarriageParserRuleCall_14_3_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_marriage_44_0=ruleMarriage();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"marriage",
            	    	    												lv_marriage_44_0,
            	    	    												"org.xtext.genDSL2.gsl.Gsl.Marriage");
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

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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


    // $ANTLR start "entryRuleEInt"
    // InternalGsl.g:1013:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGsl.g:1013:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGsl.g:1014:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalGsl.g:1020:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGsl.g:1026:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGsl.g:1027:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGsl.g:1027:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGsl.g:1028:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGsl.g:1028:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGsl.g:1029:4: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePersonHistory"
    // InternalGsl.g:1046:1: entryRulePersonHistory returns [EObject current=null] : iv_rulePersonHistory= rulePersonHistory EOF ;
    public final EObject entryRulePersonHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonHistory = null;


        try {
            // InternalGsl.g:1046:54: (iv_rulePersonHistory= rulePersonHistory EOF )
            // InternalGsl.g:1047:2: iv_rulePersonHistory= rulePersonHistory EOF
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
    // InternalGsl.g:1053:1: rulePersonHistory returns [EObject current=null] : ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= ruleEDate ) ) )? ) ;
    public final EObject rulePersonHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_gender_3_0 = null;

        AntlrDatatypeRuleToken lv_givenName_5_0 = null;

        AntlrDatatypeRuleToken lv_changed_7_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1059:2: ( ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= ruleEDate ) ) )? ) )
            // InternalGsl.g:1060:2: ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= ruleEDate ) ) )? )
            {
            // InternalGsl.g:1060:2: ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= ruleEDate ) ) )? )
            // InternalGsl.g:1061:3: () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= ruleEDate ) ) )?
            {
            // InternalGsl.g:1061:3: ()
            // InternalGsl.g:1062:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonHistoryAccess().getPersonHistoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonHistoryAccess().getPersonHistoryKeyword_1());
            		
            // InternalGsl.g:1072:3: (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGsl.g:1073:4: otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getPersonHistoryAccess().getGenderKeyword_2_0());
                    			
                    // InternalGsl.g:1077:4: ( (lv_gender_3_0= ruleGender ) )
                    // InternalGsl.g:1078:5: (lv_gender_3_0= ruleGender )
                    {
                    // InternalGsl.g:1078:5: (lv_gender_3_0= ruleGender )
                    // InternalGsl.g:1079:6: lv_gender_3_0= ruleGender
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getGenderGenderEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_gender_3_0=ruleGender();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonHistoryRule());
                    						}
                    						set(
                    							current,
                    							"gender",
                    							lv_gender_3_0,
                    							"org.xtext.genDSL2.gsl.Gsl.Gender");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1097:3: (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGsl.g:1098:4: otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonHistoryAccess().getGivenNameKeyword_3_0());
                    			
                    // InternalGsl.g:1102:4: ( (lv_givenName_5_0= ruleEString ) )
                    // InternalGsl.g:1103:5: (lv_givenName_5_0= ruleEString )
                    {
                    // InternalGsl.g:1103:5: (lv_givenName_5_0= ruleEString )
                    // InternalGsl.g:1104:6: lv_givenName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getGivenNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_givenName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonHistoryRule());
                    						}
                    						set(
                    							current,
                    							"givenName",
                    							lv_givenName_5_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1122:3: (otherlv_6= 'changed' ( (lv_changed_7_0= ruleEDate ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGsl.g:1123:4: otherlv_6= 'changed' ( (lv_changed_7_0= ruleEDate ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getPersonHistoryAccess().getChangedKeyword_4_0());
                    			
                    // InternalGsl.g:1127:4: ( (lv_changed_7_0= ruleEDate ) )
                    // InternalGsl.g:1128:5: (lv_changed_7_0= ruleEDate )
                    {
                    // InternalGsl.g:1128:5: (lv_changed_7_0= ruleEDate )
                    // InternalGsl.g:1129:6: lv_changed_7_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getChangedEDateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_changed_7_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonHistoryRule());
                    						}
                    						set(
                    							current,
                    							"changed",
                    							lv_changed_7_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "rulePersonHistory"


    // $ANTLR start "entryRuleCohabitation"
    // InternalGsl.g:1151:1: entryRuleCohabitation returns [EObject current=null] : iv_ruleCohabitation= ruleCohabitation EOF ;
    public final EObject entryRuleCohabitation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCohabitation = null;


        try {
            // InternalGsl.g:1151:53: (iv_ruleCohabitation= ruleCohabitation EOF )
            // InternalGsl.g:1152:2: iv_ruleCohabitation= ruleCohabitation EOF
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
    // InternalGsl.g:1158:1: ruleCohabitation returns [EObject current=null] : ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'partners' ( ( ruleEString ) ) )? (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_children_11_0= rulePerson ) ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleCohabitation() throws RecognitionException {
        EObject current = null;

        Token lv_legitimate_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_children_9_0 = null;

        EObject lv_children_11_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1164:2: ( ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'partners' ( ( ruleEString ) ) )? (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_children_11_0= rulePerson ) ) )* otherlv_12= '}' )? ) )
            // InternalGsl.g:1165:2: ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'partners' ( ( ruleEString ) ) )? (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_children_11_0= rulePerson ) ) )* otherlv_12= '}' )? )
            {
            // InternalGsl.g:1165:2: ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'partners' ( ( ruleEString ) ) )? (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_children_11_0= rulePerson ) ) )* otherlv_12= '}' )? )
            // InternalGsl.g:1166:3: () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'partners' ( ( ruleEString ) ) )? (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_children_11_0= rulePerson ) ) )* otherlv_12= '}' )?
            {
            // InternalGsl.g:1166:3: ()
            // InternalGsl.g:1167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCohabitationAccess().getCohabitationAction_0(),
            					current);
            			

            }

            // InternalGsl.g:1173:3: ( (lv_legitimate_1_0= 'legitimate' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGsl.g:1174:4: (lv_legitimate_1_0= 'legitimate' )
                    {
                    // InternalGsl.g:1174:4: (lv_legitimate_1_0= 'legitimate' )
                    // InternalGsl.g:1175:5: lv_legitimate_1_0= 'legitimate'
                    {
                    lv_legitimate_1_0=(Token)match(input,39,FOLLOW_27); 

                    					newLeafNode(lv_legitimate_1_0, grammarAccess.getCohabitationAccess().getLegitimateLegitimateKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCohabitationRule());
                    					}
                    					setWithLastConsumed(current, "legitimate", true, "legitimate");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getCohabitationAccess().getCohabitationKeyword_2());
            		
            // InternalGsl.g:1191:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGsl.g:1192:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getCohabitationAccess().getTypeKeyword_3_0());
                    			
                    // InternalGsl.g:1196:4: ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) )
                    // InternalGsl.g:1197:5: (lv_type_4_0= ruleTypeOfIntimateRelationship )
                    {
                    // InternalGsl.g:1197:5: (lv_type_4_0= ruleTypeOfIntimateRelationship )
                    // InternalGsl.g:1198:6: lv_type_4_0= ruleTypeOfIntimateRelationship
                    {

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getTypeTypeOfIntimateRelationshipEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_type_4_0=ruleTypeOfIntimateRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCohabitationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.genDSL2.gsl.Gsl.TypeOfIntimateRelationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1216:3: (otherlv_5= 'partners' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGsl.g:1217:4: otherlv_5= 'partners' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getCohabitationAccess().getPartnersKeyword_4_0());
                    			
                    // InternalGsl.g:1221:4: ( ( ruleEString ) )
                    // InternalGsl.g:1222:5: ( ruleEString )
                    {
                    // InternalGsl.g:1222:5: ( ruleEString )
                    // InternalGsl.g:1223:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCohabitationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getPartnersPersonCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1238:3: (otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_children_11_0= rulePerson ) ) )* otherlv_12= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGsl.g:1239:4: otherlv_7= 'children' otherlv_8= '{' ( (lv_children_9_0= rulePerson ) ) (otherlv_10= ',' ( (lv_children_11_0= rulePerson ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getCohabitationAccess().getChildrenKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getCohabitationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGsl.g:1247:4: ( (lv_children_9_0= rulePerson ) )
                    // InternalGsl.g:1248:5: (lv_children_9_0= rulePerson )
                    {
                    // InternalGsl.g:1248:5: (lv_children_9_0= rulePerson )
                    // InternalGsl.g:1249:6: lv_children_9_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getChildrenPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_children_9_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCohabitationRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_9_0,
                    							"org.xtext.genDSL2.gsl.Gsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:1266:4: (otherlv_10= ',' ( (lv_children_11_0= rulePerson ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalGsl.g:1267:5: otherlv_10= ',' ( (lv_children_11_0= rulePerson ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getCohabitationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGsl.g:1271:5: ( (lv_children_11_0= rulePerson ) )
                    	    // InternalGsl.g:1272:6: (lv_children_11_0= rulePerson )
                    	    {
                    	    // InternalGsl.g:1272:6: (lv_children_11_0= rulePerson )
                    	    // InternalGsl.g:1273:7: lv_children_11_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getCohabitationAccess().getChildrenPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_children_11_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCohabitationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_11_0,
                    	    								"org.xtext.genDSL2.gsl.Gsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getCohabitationAccess().getRightCurlyBracketKeyword_5_4());
                    			

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
    // $ANTLR end "ruleCohabitation"


    // $ANTLR start "entryRuleMarriage"
    // InternalGsl.g:1300:1: entryRuleMarriage returns [EObject current=null] : iv_ruleMarriage= ruleMarriage EOF ;
    public final EObject entryRuleMarriage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarriage = null;


        try {
            // InternalGsl.g:1300:49: (iv_ruleMarriage= ruleMarriage EOF )
            // InternalGsl.g:1301:2: iv_ruleMarriage= ruleMarriage EOF
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
    // InternalGsl.g:1307:1: ruleMarriage returns [EObject current=null] : ( () otherlv_1= 'Marriage' (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )? (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )? ) ;
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
            // InternalGsl.g:1313:2: ( ( () otherlv_1= 'Marriage' (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )? (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )? ) )
            // InternalGsl.g:1314:2: ( () otherlv_1= 'Marriage' (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )? (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )? )
            {
            // InternalGsl.g:1314:2: ( () otherlv_1= 'Marriage' (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )? (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )? )
            // InternalGsl.g:1315:3: () otherlv_1= 'Marriage' (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )? (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )?
            {
            // InternalGsl.g:1315:3: ()
            // InternalGsl.g:1316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarriageAccess().getMarriageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getMarriageAccess().getMarriageKeyword_1());
            		
            // InternalGsl.g:1326:3: (otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGsl.g:1327:4: otherlv_2= 'type' ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getMarriageAccess().getTypeKeyword_2_0());
                    			
                    // InternalGsl.g:1331:4: ( (lv_type_3_0= ruleTypeOfIntimateRelationship ) )
                    // InternalGsl.g:1332:5: (lv_type_3_0= ruleTypeOfIntimateRelationship )
                    {
                    // InternalGsl.g:1332:5: (lv_type_3_0= ruleTypeOfIntimateRelationship )
                    // InternalGsl.g:1333:6: lv_type_3_0= ruleTypeOfIntimateRelationship
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getTypeTypeOfIntimateRelationshipEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_type_3_0=ruleTypeOfIntimateRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"org.xtext.genDSL2.gsl.Gsl.TypeOfIntimateRelationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1351:3: (otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGsl.g:1352:4: otherlv_4= 'spouses' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_4, grammarAccess.getMarriageAccess().getSpousesKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,45,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getMarriageAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalGsl.g:1360:4: ( ( ruleEString ) )
                    // InternalGsl.g:1361:5: ( ruleEString )
                    {
                    // InternalGsl.g:1361:5: ( ruleEString )
                    // InternalGsl.g:1362:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMarriageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMarriageAccess().getSpousesPersonCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:1376:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalGsl.g:1377:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMarriageAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGsl.g:1381:5: ( ( ruleEString ) )
                    	    // InternalGsl.g:1382:6: ( ruleEString )
                    	    {
                    	    // InternalGsl.g:1382:6: ( ruleEString )
                    	    // InternalGsl.g:1383:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMarriageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMarriageAccess().getSpousesPersonCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,46,FOLLOW_36); 

                    				newLeafNode(otherlv_9, grammarAccess.getMarriageAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalGsl.g:1403:3: (otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGsl.g:1404:4: otherlv_10= 'fromDate' ( (lv_fromDate_11_0= ruleDateX ) )
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getMarriageAccess().getFromDateKeyword_4_0());
                    			
                    // InternalGsl.g:1408:4: ( (lv_fromDate_11_0= ruleDateX ) )
                    // InternalGsl.g:1409:5: (lv_fromDate_11_0= ruleDateX )
                    {
                    // InternalGsl.g:1409:5: (lv_fromDate_11_0= ruleDateX )
                    // InternalGsl.g:1410:6: lv_fromDate_11_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getFromDateDateXParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_fromDate_11_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"fromDate",
                    							lv_fromDate_11_0,
                    							"org.xtext.genDSL2.gsl.Gsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1428:3: (otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGsl.g:1429:4: otherlv_12= 'toDate' ( (lv_toDate_13_0= ruleDateX ) )
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getMarriageAccess().getToDateKeyword_5_0());
                    			
                    // InternalGsl.g:1433:4: ( (lv_toDate_13_0= ruleDateX ) )
                    // InternalGsl.g:1434:5: (lv_toDate_13_0= ruleDateX )
                    {
                    // InternalGsl.g:1434:5: (lv_toDate_13_0= ruleDateX )
                    // InternalGsl.g:1435:6: lv_toDate_13_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getToDateDateXParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_toDate_13_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"toDate",
                    							lv_toDate_13_0,
                    							"org.xtext.genDSL2.gsl.Gsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1453:3: (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGsl.g:1454:4: otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= rulePerson ) ) (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getMarriageAccess().getChildrenKeyword_6_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getMarriageAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGsl.g:1462:4: ( (lv_children_16_0= rulePerson ) )
                    // InternalGsl.g:1463:5: (lv_children_16_0= rulePerson )
                    {
                    // InternalGsl.g:1463:5: (lv_children_16_0= rulePerson )
                    // InternalGsl.g:1464:6: lv_children_16_0= rulePerson
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
                    							"org.xtext.genDSL2.gsl.Gsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:1481:4: (otherlv_17= ',' ( (lv_children_18_0= rulePerson ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGsl.g:1482:5: otherlv_17= ',' ( (lv_children_18_0= rulePerson ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getMarriageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGsl.g:1486:5: ( (lv_children_18_0= rulePerson ) )
                    	    // InternalGsl.g:1487:6: (lv_children_18_0= rulePerson )
                    	    {
                    	    // InternalGsl.g:1487:6: (lv_children_18_0= rulePerson )
                    	    // InternalGsl.g:1488:7: lv_children_18_0= rulePerson
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
                    	    								"org.xtext.genDSL2.gsl.Gsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalGsl.g:1515:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGsl.g:1515:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGsl.g:1516:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalGsl.g:1522:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGsl.g:1528:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGsl.g:1529:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGsl.g:1529:2: (kw= 'true' | kw= 'false' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            else if ( (LA29_0==50) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalGsl.g:1530:3: kw= 'true'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGsl.g:1536:3: kw= 'false'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

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
    // InternalGsl.g:1545:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalGsl.g:1545:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalGsl.g:1546:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalGsl.g:1552:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGsl.g:1558:2: (kw= 'EDate' )
            // InternalGsl.g:1559:2: kw= 'EDate'
            {
            kw=(Token)match(input,51,FOLLOW_2); 

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
    // InternalGsl.g:1567:1: ruleTypeOfPerson returns [Enumerator current=null] : ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) ) ;
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
            // InternalGsl.g:1573:2: ( ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) ) )
            // InternalGsl.g:1574:2: ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) )
            {
            // InternalGsl.g:1574:2: ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) )
            int alt30=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt30=1;
                }
                break;
            case 53:
                {
                alt30=2;
                }
                break;
            case 54:
                {
                alt30=3;
                }
                break;
            case 55:
                {
                alt30=4;
                }
                break;
            case 56:
                {
                alt30=5;
                }
                break;
            case 57:
                {
                alt30=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalGsl.g:1575:3: (enumLiteral_0= 'BIOLOGICAL' )
                    {
                    // InternalGsl.g:1575:3: (enumLiteral_0= 'BIOLOGICAL' )
                    // InternalGsl.g:1576:4: enumLiteral_0= 'BIOLOGICAL'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getBIOLOGICALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfPersonAccess().getBIOLOGICALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:1583:3: (enumLiteral_1= 'ADOPTED' )
                    {
                    // InternalGsl.g:1583:3: (enumLiteral_1= 'ADOPTED' )
                    // InternalGsl.g:1584:4: enumLiteral_1= 'ADOPTED'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getADOPTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfPersonAccess().getADOPTEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGsl.g:1591:3: (enumLiteral_2= 'SEMIADOPTED' )
                    {
                    // InternalGsl.g:1591:3: (enumLiteral_2= 'SEMIADOPTED' )
                    // InternalGsl.g:1592:4: enumLiteral_2= 'SEMIADOPTED'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getSEMIADOPTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeOfPersonAccess().getSEMIADOPTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGsl.g:1599:3: (enumLiteral_3= 'MARRIED' )
                    {
                    // InternalGsl.g:1599:3: (enumLiteral_3= 'MARRIED' )
                    // InternalGsl.g:1600:4: enumLiteral_3= 'MARRIED'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getMARRIEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeOfPersonAccess().getMARRIEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGsl.g:1607:3: (enumLiteral_4= 'DISOWNED' )
                    {
                    // InternalGsl.g:1607:3: (enumLiteral_4= 'DISOWNED' )
                    // InternalGsl.g:1608:4: enumLiteral_4= 'DISOWNED'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getDISOWNEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeOfPersonAccess().getDISOWNEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGsl.g:1615:3: (enumLiteral_5= 'ILLEGITIMATE' )
                    {
                    // InternalGsl.g:1615:3: (enumLiteral_5= 'ILLEGITIMATE' )
                    // InternalGsl.g:1616:4: enumLiteral_5= 'ILLEGITIMATE'
                    {
                    enumLiteral_5=(Token)match(input,57,FOLLOW_2); 

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
    // InternalGsl.g:1626:1: ruleGender returns [Enumerator current=null] : ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) ) ;
    public final Enumerator ruleGender() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGsl.g:1632:2: ( ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) ) )
            // InternalGsl.g:1633:2: ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) )
            {
            // InternalGsl.g:1633:2: ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt31=1;
                }
                break;
            case 59:
                {
                alt31=2;
                }
                break;
            case 60:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalGsl.g:1634:3: (enumLiteral_0= 'MALE' )
                    {
                    // InternalGsl.g:1634:3: (enumLiteral_0= 'MALE' )
                    // InternalGsl.g:1635:4: enumLiteral_0= 'MALE'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getMALEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGenderAccess().getMALEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:1642:3: (enumLiteral_1= 'FEMALE' )
                    {
                    // InternalGsl.g:1642:3: (enumLiteral_1= 'FEMALE' )
                    // InternalGsl.g:1643:4: enumLiteral_1= 'FEMALE'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getFEMALEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGenderAccess().getFEMALEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGsl.g:1650:3: (enumLiteral_2= 'BIGENDER' )
                    {
                    // InternalGsl.g:1650:3: (enumLiteral_2= 'BIGENDER' )
                    // InternalGsl.g:1651:4: enumLiteral_2= 'BIGENDER'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

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
    // InternalGsl.g:1661:1: ruleTypeOfIntimateRelationship returns [Enumerator current=null] : ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) ) ;
    public final Enumerator ruleTypeOfIntimateRelationship() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGsl.g:1667:2: ( ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) ) )
            // InternalGsl.g:1668:2: ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) )
            {
            // InternalGsl.g:1668:2: ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt32=1;
                }
                break;
            case 62:
                {
                alt32=2;
                }
                break;
            case 63:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalGsl.g:1669:3: (enumLiteral_0= 'MONOGAMY' )
                    {
                    // InternalGsl.g:1669:3: (enumLiteral_0= 'MONOGAMY' )
                    // InternalGsl.g:1670:4: enumLiteral_0= 'MONOGAMY'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getMONOGAMYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfIntimateRelationshipAccess().getMONOGAMYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:1677:3: (enumLiteral_1= 'POLYGAMY' )
                    {
                    // InternalGsl.g:1677:3: (enumLiteral_1= 'POLYGAMY' )
                    // InternalGsl.g:1678:4: enumLiteral_1= 'POLYGAMY'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYGAMYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYGAMYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGsl.g:1685:3: (enumLiteral_2= 'POLYFIDELITY' )
                    {
                    // InternalGsl.g:1685:3: (enumLiteral_2= 'POLYFIDELITY' )
                    // InternalGsl.g:1686:4: enumLiteral_2= 'POLYFIDELITY'
                    {
                    enumLiteral_2=(Token)match(input,63,FOLLOW_2); 

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


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\1\20\uffff";
    static final String dfa_3s = "\1\4\20\uffff";
    static final String dfa_4s = "\1\42\20\uffff";
    static final String dfa_5s = "\1\uffff\1\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17";
    static final String dfa_6s = "\1\0\20\uffff}>";
    static final String[] dfa_7s = {
            "\2\2\12\uffff\2\1\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 365:5: ( ({...}? => ( ({...}? => ( (lv_givenName_1_0= ruleEString ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'birthPlace' ( (lv_birthPlace_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'deathPlace' ( (lv_deathPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'restingPlace' ( (lv_restingPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'type' ( (lv_type_11_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'gender' ( (lv_gender_13_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'otherNames' otherlv_15= '{' ( (lv_otherNames_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_otherNames_18_0= ruleEString ) ) )* otherlv_19= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'nickname' ( (lv_nickname_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'deathCause' ( (lv_deathCause_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'birthDate' ( (lv_birthDate_25_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'deathDate' ( (lv_deathDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'personhistory' otherlv_29= '{' ( (lv_personhistory_30_0= rulePersonHistory ) ) (otherlv_31= ',' ( (lv_personhistory_32_0= rulePersonHistory ) ) )* otherlv_33= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'cohabitation' otherlv_35= '{' ( (lv_cohabitation_36_0= ruleCohabitation ) ) (otherlv_37= ',' ( (lv_cohabitation_38_0= ruleCohabitation ) ) )* otherlv_39= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'marriage' otherlv_41= '{' ( (lv_marriage_42_0= ruleMarriage ) ) (otherlv_43= ',' ( (lv_marriage_44_0= ruleMarriage ) ) )* otherlv_45= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                         
                        int index12_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_0==EOF||(LA12_0>=16 && LA12_0<=17)) ) {s = 1;}

                        else if ( LA12_0 >= RULE_STRING && LA12_0 <= RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA12_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA12_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA12_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA12_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA12_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA12_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA12_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA12_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 10) ) {s = 12;}

                        else if ( LA12_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 11) ) {s = 13;}

                        else if ( LA12_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 12) ) {s = 14;}

                        else if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 13) ) {s = 15;}

                        else if ( LA12_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup(), 14) ) {s = 16;}

                         
                        input.seek(index12_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000007FFE00030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000007FFE00032L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000006004000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000060002000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001940002000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001940000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001840000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001040000000002L});

}
