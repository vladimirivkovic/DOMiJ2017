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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_EDATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GenealogyTree'", "'{'", "'familyName'", "'established'", "'persons'", "','", "'}'", "'year'", "'month'", "'day'", "'unknown'", "'birthPlace'", "'deathPlace'", "'restingPlace'", "'type'", "'gender'", "'otherNames'", "'nickname'", "'deathCause'", "'birthDate'", "'deathDate'", "'personhistory'", "'cohabitation'", "'marriage'", "'-'", "'PersonHistory'", "'givenName'", "'changed'", "'legitimate'", "'Cohabitation'", "'partners'", "'('", "')'", "'children'", "'Marriage'", "'spouses'", "'fromDate'", "'toDate'", "'true'", "'false'", "'BIOLOGICAL'", "'ADOPTED'", "'SEMIADOPTED'", "'MARRIED'", "'DISOWNED'", "'ILLEGITIMATE'", "'MALE'", "'FEMALE'", "'BIGENDER'", "'MONOGAMY'", "'POLYGAMY'", "'POLYFIDELITY'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_EDATE=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGenealogyTreeAccess().getGenealogyTreeKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGenealogyTreeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

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

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGsl.g:112:4: otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_3); 

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

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGsl.g:137:4: otherlv_6= 'persons' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGenealogyTreeAccess().getPersonsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getGenealogyTreeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGsl.g:145:4: ( (lv_person_8_0= rulePerson ) )
                    // InternalGsl.g:146:5: (lv_person_8_0= rulePerson )
                    {
                    // InternalGsl.g:146:5: (lv_person_8_0= rulePerson )
                    // InternalGsl.g:147:6: lv_person_8_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getGenealogyTreeAccess().getPersonPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalGsl.g:165:5: otherlv_9= ',' ( (lv_person_10_0= rulePerson ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGenealogyTreeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGsl.g:169:5: ( (lv_person_10_0= rulePerson ) )
                    	    // InternalGsl.g:170:6: (lv_person_10_0= rulePerson )
                    	    {
                    	    // InternalGsl.g:170:6: (lv_person_10_0= rulePerson )
                    	    // InternalGsl.g:171:7: lv_person_10_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getGenealogyTreeAccess().getPersonPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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

                    otherlv_11=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getGenealogyTreeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

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

            otherlv_1=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDateXAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGsl.g:262:3: (otherlv_2= 'year' ( (lv_year_3_0= ruleEInt ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGsl.g:263:4: otherlv_2= 'year' ( (lv_year_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_2, grammarAccess.getDateXAccess().getYearKeyword_2_0());
                    			
                    // InternalGsl.g:267:4: ( (lv_year_3_0= ruleEInt ) )
                    // InternalGsl.g:268:5: (lv_year_3_0= ruleEInt )
                    {
                    // InternalGsl.g:268:5: (lv_year_3_0= ruleEInt )
                    // InternalGsl.g:269:6: lv_year_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getYearEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGsl.g:288:4: otherlv_4= 'month' ( (lv_month_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getDateXAccess().getMonthKeyword_3_0());
                    			
                    // InternalGsl.g:292:4: ( (lv_month_5_0= ruleEInt ) )
                    // InternalGsl.g:293:5: (lv_month_5_0= ruleEInt )
                    {
                    // InternalGsl.g:293:5: (lv_month_5_0= ruleEInt )
                    // InternalGsl.g:294:6: lv_month_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getMonthEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGsl.g:313:4: otherlv_6= 'day' ( (lv_day_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getDateXAccess().getDayKeyword_4_0());
                    			
                    // InternalGsl.g:317:4: ( (lv_day_7_0= ruleEInt ) )
                    // InternalGsl.g:318:5: (lv_day_7_0= ruleEInt )
                    {
                    // InternalGsl.g:318:5: (lv_day_7_0= ruleEInt )
                    // InternalGsl.g:319:6: lv_day_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getDayEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalGsl.g:352:1: rulePerson returns [EObject current=null] : ( () ( (lv_givenName_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )* ) ) ) (otherlv_30= 'personhistory' otherlv_31= '{' ( (lv_personhistory_32_0= rulePersonHistory ) ) (otherlv_33= ',' ( (lv_personhistory_34_0= rulePersonHistory ) ) )* otherlv_35= '}' )? (otherlv_36= 'cohabitation' otherlv_37= '{' ( (lv_cohabitation_38_0= ruleCohabitation ) ) (otherlv_39= ',' ( (lv_cohabitation_40_0= ruleCohabitation ) ) )* otherlv_41= '}' )? (otherlv_42= 'marriage' otherlv_43= '{' ( (lv_marriage_44_0= ruleMarriage ) ) (otherlv_45= ',' ( (lv_marriage_46_0= ruleMarriage ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        AntlrDatatypeRuleToken lv_givenName_1_0 = null;

        AntlrDatatypeRuleToken lv_unknown_5_0 = null;

        AntlrDatatypeRuleToken lv_birthPlace_7_0 = null;

        AntlrDatatypeRuleToken lv_deathPlace_9_0 = null;

        AntlrDatatypeRuleToken lv_restingPlace_11_0 = null;

        Enumerator lv_type_13_0 = null;

        Enumerator lv_gender_15_0 = null;

        AntlrDatatypeRuleToken lv_otherNames_18_0 = null;

        AntlrDatatypeRuleToken lv_otherNames_20_0 = null;

        AntlrDatatypeRuleToken lv_nickname_23_0 = null;

        AntlrDatatypeRuleToken lv_deathCause_25_0 = null;

        EObject lv_birthDate_27_0 = null;

        EObject lv_deathDate_29_0 = null;

        EObject lv_personhistory_32_0 = null;

        EObject lv_personhistory_34_0 = null;

        EObject lv_cohabitation_38_0 = null;

        EObject lv_cohabitation_40_0 = null;

        EObject lv_marriage_44_0 = null;

        EObject lv_marriage_46_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:358:2: ( ( () ( (lv_givenName_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )* ) ) ) (otherlv_30= 'personhistory' otherlv_31= '{' ( (lv_personhistory_32_0= rulePersonHistory ) ) (otherlv_33= ',' ( (lv_personhistory_34_0= rulePersonHistory ) ) )* otherlv_35= '}' )? (otherlv_36= 'cohabitation' otherlv_37= '{' ( (lv_cohabitation_38_0= ruleCohabitation ) ) (otherlv_39= ',' ( (lv_cohabitation_40_0= ruleCohabitation ) ) )* otherlv_41= '}' )? (otherlv_42= 'marriage' otherlv_43= '{' ( (lv_marriage_44_0= ruleMarriage ) ) (otherlv_45= ',' ( (lv_marriage_46_0= ruleMarriage ) ) )* otherlv_47= '}' )? otherlv_48= '}' ) )
            // InternalGsl.g:359:2: ( () ( (lv_givenName_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )* ) ) ) (otherlv_30= 'personhistory' otherlv_31= '{' ( (lv_personhistory_32_0= rulePersonHistory ) ) (otherlv_33= ',' ( (lv_personhistory_34_0= rulePersonHistory ) ) )* otherlv_35= '}' )? (otherlv_36= 'cohabitation' otherlv_37= '{' ( (lv_cohabitation_38_0= ruleCohabitation ) ) (otherlv_39= ',' ( (lv_cohabitation_40_0= ruleCohabitation ) ) )* otherlv_41= '}' )? (otherlv_42= 'marriage' otherlv_43= '{' ( (lv_marriage_44_0= ruleMarriage ) ) (otherlv_45= ',' ( (lv_marriage_46_0= ruleMarriage ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            {
            // InternalGsl.g:359:2: ( () ( (lv_givenName_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )* ) ) ) (otherlv_30= 'personhistory' otherlv_31= '{' ( (lv_personhistory_32_0= rulePersonHistory ) ) (otherlv_33= ',' ( (lv_personhistory_34_0= rulePersonHistory ) ) )* otherlv_35= '}' )? (otherlv_36= 'cohabitation' otherlv_37= '{' ( (lv_cohabitation_38_0= ruleCohabitation ) ) (otherlv_39= ',' ( (lv_cohabitation_40_0= ruleCohabitation ) ) )* otherlv_41= '}' )? (otherlv_42= 'marriage' otherlv_43= '{' ( (lv_marriage_44_0= ruleMarriage ) ) (otherlv_45= ',' ( (lv_marriage_46_0= ruleMarriage ) ) )* otherlv_47= '}' )? otherlv_48= '}' )
            // InternalGsl.g:360:3: () ( (lv_givenName_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )* ) ) ) (otherlv_30= 'personhistory' otherlv_31= '{' ( (lv_personhistory_32_0= rulePersonHistory ) ) (otherlv_33= ',' ( (lv_personhistory_34_0= rulePersonHistory ) ) )* otherlv_35= '}' )? (otherlv_36= 'cohabitation' otherlv_37= '{' ( (lv_cohabitation_38_0= ruleCohabitation ) ) (otherlv_39= ',' ( (lv_cohabitation_40_0= ruleCohabitation ) ) )* otherlv_41= '}' )? (otherlv_42= 'marriage' otherlv_43= '{' ( (lv_marriage_44_0= ruleMarriage ) ) (otherlv_45= ',' ( (lv_marriage_46_0= ruleMarriage ) ) )* otherlv_47= '}' )? otherlv_48= '}'
            {
            // InternalGsl.g:360:3: ()
            // InternalGsl.g:361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonAccess().getPersonAction_0(),
            					current);
            			

            }

            // InternalGsl.g:367:3: ( (lv_givenName_1_0= ruleEString ) )
            // InternalGsl.g:368:4: (lv_givenName_1_0= ruleEString )
            {
            // InternalGsl.g:368:4: (lv_givenName_1_0= ruleEString )
            // InternalGsl.g:369:5: lv_givenName_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getGivenNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGsl.g:390:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )* ) ) )
            // InternalGsl.g:391:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )* ) )
            {
            // InternalGsl.g:391:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )* ) )
            // InternalGsl.g:392:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            				
            // InternalGsl.g:395:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )* )
            // InternalGsl.g:396:6: ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )*
            {
            // InternalGsl.g:396:6: ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )*
            loop9:
            do {
                int alt9=12;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // InternalGsl.g:397:4: ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:397:4: ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalGsl.g:398:5: {...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalGsl.g:398:103: ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalGsl.g:399:6: ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalGsl.g:402:9: ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) )
            	    // InternalGsl.g:402:10: {...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:402:19: (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) )
            	    // InternalGsl.g:402:20: otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_15); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getUnknownKeyword_3_0_0());
            	    								
            	    // InternalGsl.g:406:9: ( (lv_unknown_5_0= ruleEBoolean ) )
            	    // InternalGsl.g:407:10: (lv_unknown_5_0= ruleEBoolean )
            	    {
            	    // InternalGsl.g:407:10: (lv_unknown_5_0= ruleEBoolean )
            	    // InternalGsl.g:408:11: lv_unknown_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getUnknownEBooleanParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_unknown_5_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    											}
            	    											set(
            	    												current,
            	    												"unknown",
            	    												lv_unknown_5_0,
            	    												"org.xtext.genDSL2.gsl.Gsl.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGsl.g:431:4: ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:431:4: ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) )
            	    // InternalGsl.g:432:5: {...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalGsl.g:432:103: ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:433:6: ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalGsl.g:436:9: ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) )
            	    // InternalGsl.g:436:10: {...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:436:19: (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) )
            	    // InternalGsl.g:436:20: otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,23,FOLLOW_5); 

            	    									newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getBirthPlaceKeyword_3_1_0());
            	    								
            	    // InternalGsl.g:440:9: ( (lv_birthPlace_7_0= ruleEString ) )
            	    // InternalGsl.g:441:10: (lv_birthPlace_7_0= ruleEString )
            	    {
            	    // InternalGsl.g:441:10: (lv_birthPlace_7_0= ruleEString )
            	    // InternalGsl.g:442:11: lv_birthPlace_7_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getBirthPlaceEStringParserRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_birthPlace_7_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    											}
            	    											set(
            	    												current,
            	    												"birthPlace",
            	    												lv_birthPlace_7_0,
            	    												"org.xtext.genDSL2.gsl.Gsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGsl.g:465:4: ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:465:4: ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) )
            	    // InternalGsl.g:466:5: {...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalGsl.g:466:103: ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:467:6: ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalGsl.g:470:9: ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) )
            	    // InternalGsl.g:470:10: {...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:470:19: (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) )
            	    // InternalGsl.g:470:20: otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_5); 

            	    									newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getDeathPlaceKeyword_3_2_0());
            	    								
            	    // InternalGsl.g:474:9: ( (lv_deathPlace_9_0= ruleEString ) )
            	    // InternalGsl.g:475:10: (lv_deathPlace_9_0= ruleEString )
            	    {
            	    // InternalGsl.g:475:10: (lv_deathPlace_9_0= ruleEString )
            	    // InternalGsl.g:476:11: lv_deathPlace_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getDeathPlaceEStringParserRuleCall_3_2_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_deathPlace_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    											}
            	    											set(
            	    												current,
            	    												"deathPlace",
            	    												lv_deathPlace_9_0,
            	    												"org.xtext.genDSL2.gsl.Gsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalGsl.g:499:4: ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:499:4: ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) )
            	    // InternalGsl.g:500:5: {...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalGsl.g:500:103: ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:501:6: ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalGsl.g:504:9: ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) )
            	    // InternalGsl.g:504:10: {...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:504:19: (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) )
            	    // InternalGsl.g:504:20: otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,25,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getRestingPlaceKeyword_3_3_0());
            	    								
            	    // InternalGsl.g:508:9: ( (lv_restingPlace_11_0= ruleEString ) )
            	    // InternalGsl.g:509:10: (lv_restingPlace_11_0= ruleEString )
            	    {
            	    // InternalGsl.g:509:10: (lv_restingPlace_11_0= ruleEString )
            	    // InternalGsl.g:510:11: lv_restingPlace_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getRestingPlaceEStringParserRuleCall_3_3_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_restingPlace_11_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    											}
            	    											set(
            	    												current,
            	    												"restingPlace",
            	    												lv_restingPlace_11_0,
            	    												"org.xtext.genDSL2.gsl.Gsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalGsl.g:533:4: ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:533:4: ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) )
            	    // InternalGsl.g:534:5: {...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalGsl.g:534:103: ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) )
            	    // InternalGsl.g:535:6: ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalGsl.g:538:9: ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) )
            	    // InternalGsl.g:538:10: {...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:538:19: (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) )
            	    // InternalGsl.g:538:20: otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) )
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_16); 

            	    									newLeafNode(otherlv_12, grammarAccess.getPersonAccess().getTypeKeyword_3_4_0());
            	    								
            	    // InternalGsl.g:542:9: ( (lv_type_13_0= ruleTypeOfPerson ) )
            	    // InternalGsl.g:543:10: (lv_type_13_0= ruleTypeOfPerson )
            	    {
            	    // InternalGsl.g:543:10: (lv_type_13_0= ruleTypeOfPerson )
            	    // InternalGsl.g:544:11: lv_type_13_0= ruleTypeOfPerson
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getTypeTypeOfPersonEnumRuleCall_3_4_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_type_13_0=ruleTypeOfPerson();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_13_0,
            	    												"org.xtext.genDSL2.gsl.Gsl.TypeOfPerson");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalGsl.g:567:4: ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:567:4: ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) )
            	    // InternalGsl.g:568:5: {...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalGsl.g:568:103: ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) )
            	    // InternalGsl.g:569:6: ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalGsl.g:572:9: ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) )
            	    // InternalGsl.g:572:10: {...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:572:19: (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) )
            	    // InternalGsl.g:572:20: otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) )
            	    {
            	    otherlv_14=(Token)match(input,27,FOLLOW_17); 

            	    									newLeafNode(otherlv_14, grammarAccess.getPersonAccess().getGenderKeyword_3_5_0());
            	    								
            	    // InternalGsl.g:576:9: ( (lv_gender_15_0= ruleGender ) )
            	    // InternalGsl.g:577:10: (lv_gender_15_0= ruleGender )
            	    {
            	    // InternalGsl.g:577:10: (lv_gender_15_0= ruleGender )
            	    // InternalGsl.g:578:11: lv_gender_15_0= ruleGender
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getGenderGenderEnumRuleCall_3_5_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_gender_15_0=ruleGender();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    											}
            	    											set(
            	    												current,
            	    												"gender",
            	    												lv_gender_15_0,
            	    												"org.xtext.genDSL2.gsl.Gsl.Gender");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalGsl.g:601:4: ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) )
            	    {
            	    // InternalGsl.g:601:4: ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) )
            	    // InternalGsl.g:602:5: {...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalGsl.g:602:103: ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) )
            	    // InternalGsl.g:603:6: ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalGsl.g:606:9: ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) )
            	    // InternalGsl.g:606:10: {...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:606:19: (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' )
            	    // InternalGsl.g:606:20: otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}'
            	    {
            	    otherlv_16=(Token)match(input,28,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPersonAccess().getOtherNamesKeyword_3_6_0());
            	    								
            	    otherlv_17=(Token)match(input,13,FOLLOW_5); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_3_6_1());
            	    								
            	    // InternalGsl.g:614:9: ( (lv_otherNames_18_0= ruleEString ) )
            	    // InternalGsl.g:615:10: (lv_otherNames_18_0= ruleEString )
            	    {
            	    // InternalGsl.g:615:10: (lv_otherNames_18_0= ruleEString )
            	    // InternalGsl.g:616:11: lv_otherNames_18_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getOtherNamesEStringParserRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_8);
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

            	    // InternalGsl.g:633:9: (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==17) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalGsl.g:634:10: otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,17,FOLLOW_5); 

            	    	    										newLeafNode(otherlv_19, grammarAccess.getPersonAccess().getCommaKeyword_3_6_3_0());
            	    	    									
            	    	    // InternalGsl.g:638:10: ( (lv_otherNames_20_0= ruleEString ) )
            	    	    // InternalGsl.g:639:11: (lv_otherNames_20_0= ruleEString )
            	    	    {
            	    	    // InternalGsl.g:639:11: (lv_otherNames_20_0= ruleEString )
            	    	    // InternalGsl.g:640:12: lv_otherNames_20_0= ruleEString
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getPersonAccess().getOtherNamesEStringParserRuleCall_3_6_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_otherNames_20_0=ruleEString();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getPersonRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"otherNames",
            	    	    													lv_otherNames_20_0,
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

            	    otherlv_21=(Token)match(input,18,FOLLOW_14); 

            	    									newLeafNode(otherlv_21, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_3_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalGsl.g:668:4: ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:668:4: ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) )
            	    // InternalGsl.g:669:5: {...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalGsl.g:669:103: ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:670:6: ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalGsl.g:673:9: ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) )
            	    // InternalGsl.g:673:10: {...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:673:19: (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) )
            	    // InternalGsl.g:673:20: otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) )
            	    {
            	    otherlv_22=(Token)match(input,29,FOLLOW_5); 

            	    									newLeafNode(otherlv_22, grammarAccess.getPersonAccess().getNicknameKeyword_3_7_0());
            	    								
            	    // InternalGsl.g:677:9: ( (lv_nickname_23_0= ruleEString ) )
            	    // InternalGsl.g:678:10: (lv_nickname_23_0= ruleEString )
            	    {
            	    // InternalGsl.g:678:10: (lv_nickname_23_0= ruleEString )
            	    // InternalGsl.g:679:11: lv_nickname_23_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getNicknameEStringParserRuleCall_3_7_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_nickname_23_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    											}
            	    											set(
            	    												current,
            	    												"nickname",
            	    												lv_nickname_23_0,
            	    												"org.xtext.genDSL2.gsl.Gsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalGsl.g:702:4: ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:702:4: ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) )
            	    // InternalGsl.g:703:5: {...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalGsl.g:703:103: ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) )
            	    // InternalGsl.g:704:6: ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalGsl.g:707:9: ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) )
            	    // InternalGsl.g:707:10: {...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:707:19: (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) )
            	    // InternalGsl.g:707:20: otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,30,FOLLOW_5); 

            	    									newLeafNode(otherlv_24, grammarAccess.getPersonAccess().getDeathCauseKeyword_3_8_0());
            	    								
            	    // InternalGsl.g:711:9: ( (lv_deathCause_25_0= ruleEString ) )
            	    // InternalGsl.g:712:10: (lv_deathCause_25_0= ruleEString )
            	    {
            	    // InternalGsl.g:712:10: (lv_deathCause_25_0= ruleEString )
            	    // InternalGsl.g:713:11: lv_deathCause_25_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getDeathCauseEStringParserRuleCall_3_8_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_deathCause_25_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    											}
            	    											set(
            	    												current,
            	    												"deathCause",
            	    												lv_deathCause_25_0,
            	    												"org.xtext.genDSL2.gsl.Gsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalGsl.g:736:4: ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:736:4: ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) )
            	    // InternalGsl.g:737:5: {...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalGsl.g:737:103: ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) )
            	    // InternalGsl.g:738:6: ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalGsl.g:741:9: ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) )
            	    // InternalGsl.g:741:10: {...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:741:19: (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) )
            	    // InternalGsl.g:741:20: otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) )
            	    {
            	    otherlv_26=(Token)match(input,31,FOLLOW_3); 

            	    									newLeafNode(otherlv_26, grammarAccess.getPersonAccess().getBirthDateKeyword_3_9_0());
            	    								
            	    // InternalGsl.g:745:9: ( (lv_birthDate_27_0= ruleDateX ) )
            	    // InternalGsl.g:746:10: (lv_birthDate_27_0= ruleDateX )
            	    {
            	    // InternalGsl.g:746:10: (lv_birthDate_27_0= ruleDateX )
            	    // InternalGsl.g:747:11: lv_birthDate_27_0= ruleDateX
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getBirthDateDateXParserRuleCall_3_9_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_birthDate_27_0=ruleDateX();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    											}
            	    											set(
            	    												current,
            	    												"birthDate",
            	    												lv_birthDate_27_0,
            	    												"org.xtext.genDSL2.gsl.Gsl.DateX");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalGsl.g:770:4: ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) )
            	    {
            	    // InternalGsl.g:770:4: ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) )
            	    // InternalGsl.g:771:5: {...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalGsl.g:771:104: ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) )
            	    // InternalGsl.g:772:6: ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalGsl.g:775:9: ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) )
            	    // InternalGsl.g:775:10: {...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePerson", "true");
            	    }
            	    // InternalGsl.g:775:19: (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) )
            	    // InternalGsl.g:775:20: otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) )
            	    {
            	    otherlv_28=(Token)match(input,32,FOLLOW_3); 

            	    									newLeafNode(otherlv_28, grammarAccess.getPersonAccess().getDeathDateKeyword_3_10_0());
            	    								
            	    // InternalGsl.g:779:9: ( (lv_deathDate_29_0= ruleDateX ) )
            	    // InternalGsl.g:780:10: (lv_deathDate_29_0= ruleDateX )
            	    {
            	    // InternalGsl.g:780:10: (lv_deathDate_29_0= ruleDateX )
            	    // InternalGsl.g:781:11: lv_deathDate_29_0= ruleDateX
            	    {

            	    											newCompositeNode(grammarAccess.getPersonAccess().getDeathDateDateXParserRuleCall_3_10_1_0());
            	    										
            	    pushFollow(FOLLOW_14);
            	    lv_deathDate_29_0=ruleDateX();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPersonRule());
            	    											}
            	    											set(
            	    												current,
            	    												"deathDate",
            	    												lv_deathDate_29_0,
            	    												"org.xtext.genDSL2.gsl.Gsl.DateX");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPersonAccess().getUnorderedGroup_3());
            				

            }

            // InternalGsl.g:811:3: (otherlv_30= 'personhistory' otherlv_31= '{' ( (lv_personhistory_32_0= rulePersonHistory ) ) (otherlv_33= ',' ( (lv_personhistory_34_0= rulePersonHistory ) ) )* otherlv_35= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGsl.g:812:4: otherlv_30= 'personhistory' otherlv_31= '{' ( (lv_personhistory_32_0= rulePersonHistory ) ) (otherlv_33= ',' ( (lv_personhistory_34_0= rulePersonHistory ) ) )* otherlv_35= '}'
                    {
                    otherlv_30=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getPersonAccess().getPersonhistoryKeyword_4_0());
                    			
                    otherlv_31=(Token)match(input,13,FOLLOW_18); 

                    				newLeafNode(otherlv_31, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalGsl.g:820:4: ( (lv_personhistory_32_0= rulePersonHistory ) )
                    // InternalGsl.g:821:5: (lv_personhistory_32_0= rulePersonHistory )
                    {
                    // InternalGsl.g:821:5: (lv_personhistory_32_0= rulePersonHistory )
                    // InternalGsl.g:822:6: lv_personhistory_32_0= rulePersonHistory
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getPersonhistoryPersonHistoryParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalGsl.g:839:4: (otherlv_33= ',' ( (lv_personhistory_34_0= rulePersonHistory ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==17) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalGsl.g:840:5: otherlv_33= ',' ( (lv_personhistory_34_0= rulePersonHistory ) )
                    	    {
                    	    otherlv_33=(Token)match(input,17,FOLLOW_18); 

                    	    					newLeafNode(otherlv_33, grammarAccess.getPersonAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGsl.g:844:5: ( (lv_personhistory_34_0= rulePersonHistory ) )
                    	    // InternalGsl.g:845:6: (lv_personhistory_34_0= rulePersonHistory )
                    	    {
                    	    // InternalGsl.g:845:6: (lv_personhistory_34_0= rulePersonHistory )
                    	    // InternalGsl.g:846:7: lv_personhistory_34_0= rulePersonHistory
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getPersonhistoryPersonHistoryParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_personhistory_34_0=rulePersonHistory();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"personhistory",
                    	    								lv_personhistory_34_0,
                    	    								"org.xtext.genDSL2.gsl.Gsl.PersonHistory");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,18,FOLLOW_19); 

                    				newLeafNode(otherlv_35, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGsl.g:869:3: (otherlv_36= 'cohabitation' otherlv_37= '{' ( (lv_cohabitation_38_0= ruleCohabitation ) ) (otherlv_39= ',' ( (lv_cohabitation_40_0= ruleCohabitation ) ) )* otherlv_41= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGsl.g:870:4: otherlv_36= 'cohabitation' otherlv_37= '{' ( (lv_cohabitation_38_0= ruleCohabitation ) ) (otherlv_39= ',' ( (lv_cohabitation_40_0= ruleCohabitation ) ) )* otherlv_41= '}'
                    {
                    otherlv_36=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_36, grammarAccess.getPersonAccess().getCohabitationKeyword_5_0());
                    			
                    otherlv_37=(Token)match(input,13,FOLLOW_20); 

                    				newLeafNode(otherlv_37, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGsl.g:878:4: ( (lv_cohabitation_38_0= ruleCohabitation ) )
                    // InternalGsl.g:879:5: (lv_cohabitation_38_0= ruleCohabitation )
                    {
                    // InternalGsl.g:879:5: (lv_cohabitation_38_0= ruleCohabitation )
                    // InternalGsl.g:880:6: lv_cohabitation_38_0= ruleCohabitation
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getCohabitationCohabitationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalGsl.g:897:4: (otherlv_39= ',' ( (lv_cohabitation_40_0= ruleCohabitation ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGsl.g:898:5: otherlv_39= ',' ( (lv_cohabitation_40_0= ruleCohabitation ) )
                    	    {
                    	    otherlv_39=(Token)match(input,17,FOLLOW_20); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getPersonAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGsl.g:902:5: ( (lv_cohabitation_40_0= ruleCohabitation ) )
                    	    // InternalGsl.g:903:6: (lv_cohabitation_40_0= ruleCohabitation )
                    	    {
                    	    // InternalGsl.g:903:6: (lv_cohabitation_40_0= ruleCohabitation )
                    	    // InternalGsl.g:904:7: lv_cohabitation_40_0= ruleCohabitation
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getCohabitationCohabitationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_cohabitation_40_0=ruleCohabitation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cohabitation",
                    	    								lv_cohabitation_40_0,
                    	    								"org.xtext.genDSL2.gsl.Gsl.Cohabitation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,18,FOLLOW_21); 

                    				newLeafNode(otherlv_41, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGsl.g:927:3: (otherlv_42= 'marriage' otherlv_43= '{' ( (lv_marriage_44_0= ruleMarriage ) ) (otherlv_45= ',' ( (lv_marriage_46_0= ruleMarriage ) ) )* otherlv_47= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGsl.g:928:4: otherlv_42= 'marriage' otherlv_43= '{' ( (lv_marriage_44_0= ruleMarriage ) ) (otherlv_45= ',' ( (lv_marriage_46_0= ruleMarriage ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_42, grammarAccess.getPersonAccess().getMarriageKeyword_6_0());
                    			
                    otherlv_43=(Token)match(input,13,FOLLOW_22); 

                    				newLeafNode(otherlv_43, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGsl.g:936:4: ( (lv_marriage_44_0= ruleMarriage ) )
                    // InternalGsl.g:937:5: (lv_marriage_44_0= ruleMarriage )
                    {
                    // InternalGsl.g:937:5: (lv_marriage_44_0= ruleMarriage )
                    // InternalGsl.g:938:6: lv_marriage_44_0= ruleMarriage
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getMarriageMarriageParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalGsl.g:955:4: (otherlv_45= ',' ( (lv_marriage_46_0= ruleMarriage ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGsl.g:956:5: otherlv_45= ',' ( (lv_marriage_46_0= ruleMarriage ) )
                    	    {
                    	    otherlv_45=(Token)match(input,17,FOLLOW_22); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getPersonAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGsl.g:960:5: ( (lv_marriage_46_0= ruleMarriage ) )
                    	    // InternalGsl.g:961:6: (lv_marriage_46_0= ruleMarriage )
                    	    {
                    	    // InternalGsl.g:961:6: (lv_marriage_46_0= ruleMarriage )
                    	    // InternalGsl.g:962:7: lv_marriage_46_0= ruleMarriage
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getMarriageMarriageParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_marriage_46_0=ruleMarriage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"marriage",
                    	    								lv_marriage_46_0,
                    	    								"org.xtext.genDSL2.gsl.Gsl.Marriage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_47, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_48=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_48, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalGsl.g:993:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGsl.g:993:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGsl.g:994:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalGsl.g:1000:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGsl.g:1006:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGsl.g:1007:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGsl.g:1007:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGsl.g:1008:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGsl.g:1008:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGsl.g:1009:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_23); 

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
    // InternalGsl.g:1026:1: entryRulePersonHistory returns [EObject current=null] : iv_rulePersonHistory= rulePersonHistory EOF ;
    public final EObject entryRulePersonHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonHistory = null;


        try {
            // InternalGsl.g:1026:54: (iv_rulePersonHistory= rulePersonHistory EOF )
            // InternalGsl.g:1027:2: iv_rulePersonHistory= rulePersonHistory EOF
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
    // InternalGsl.g:1033:1: rulePersonHistory returns [EObject current=null] : ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )? ) ;
    public final EObject rulePersonHistory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_changed_7_0=null;
        Enumerator lv_gender_3_0 = null;

        AntlrDatatypeRuleToken lv_givenName_5_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1039:2: ( ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )? ) )
            // InternalGsl.g:1040:2: ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )? )
            {
            // InternalGsl.g:1040:2: ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )? )
            // InternalGsl.g:1041:3: () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )?
            {
            // InternalGsl.g:1041:3: ()
            // InternalGsl.g:1042:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonHistoryAccess().getPersonHistoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonHistoryAccess().getPersonHistoryKeyword_1());
            		
            // InternalGsl.g:1052:3: (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGsl.g:1053:4: otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getPersonHistoryAccess().getGenderKeyword_2_0());
                    			
                    // InternalGsl.g:1057:4: ( (lv_gender_3_0= ruleGender ) )
                    // InternalGsl.g:1058:5: (lv_gender_3_0= ruleGender )
                    {
                    // InternalGsl.g:1058:5: (lv_gender_3_0= ruleGender )
                    // InternalGsl.g:1059:6: lv_gender_3_0= ruleGender
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getGenderGenderEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
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

            // InternalGsl.g:1077:3: (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGsl.g:1078:4: otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonHistoryAccess().getGivenNameKeyword_3_0());
                    			
                    // InternalGsl.g:1082:4: ( (lv_givenName_5_0= ruleEString ) )
                    // InternalGsl.g:1083:5: (lv_givenName_5_0= ruleEString )
                    {
                    // InternalGsl.g:1083:5: (lv_givenName_5_0= ruleEString )
                    // InternalGsl.g:1084:6: lv_givenName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getGivenNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalGsl.g:1102:3: (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGsl.g:1103:4: otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) )
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getPersonHistoryAccess().getChangedKeyword_4_0());
                    			
                    // InternalGsl.g:1107:4: ( (lv_changed_7_0= RULE_EDATE ) )
                    // InternalGsl.g:1108:5: (lv_changed_7_0= RULE_EDATE )
                    {
                    // InternalGsl.g:1108:5: (lv_changed_7_0= RULE_EDATE )
                    // InternalGsl.g:1109:6: lv_changed_7_0= RULE_EDATE
                    {
                    lv_changed_7_0=(Token)match(input,RULE_EDATE,FOLLOW_2); 

                    						newLeafNode(lv_changed_7_0, grammarAccess.getPersonHistoryAccess().getChangedEDATETerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonHistoryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"changed",
                    							lv_changed_7_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EDATE");
                    					

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
    // InternalGsl.g:1130:1: entryRuleCohabitation returns [EObject current=null] : iv_ruleCohabitation= ruleCohabitation EOF ;
    public final EObject entryRuleCohabitation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCohabitation = null;


        try {
            // InternalGsl.g:1130:53: (iv_ruleCohabitation= ruleCohabitation EOF )
            // InternalGsl.g:1131:2: iv_ruleCohabitation= ruleCohabitation EOF
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
    // InternalGsl.g:1137:1: ruleCohabitation returns [EObject current=null] : ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalGsl.g:1143:2: ( ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalGsl.g:1144:2: ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalGsl.g:1144:2: ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalGsl.g:1145:3: () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalGsl.g:1145:3: ()
            // InternalGsl.g:1146:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCohabitationAccess().getCohabitationAction_0(),
            					current);
            			

            }

            // InternalGsl.g:1152:3: ( (lv_legitimate_1_0= 'legitimate' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGsl.g:1153:4: (lv_legitimate_1_0= 'legitimate' )
                    {
                    // InternalGsl.g:1153:4: (lv_legitimate_1_0= 'legitimate' )
                    // InternalGsl.g:1154:5: lv_legitimate_1_0= 'legitimate'
                    {
                    lv_legitimate_1_0=(Token)match(input,40,FOLLOW_28); 

                    					newLeafNode(lv_legitimate_1_0, grammarAccess.getCohabitationAccess().getLegitimateLegitimateKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCohabitationRule());
                    					}
                    					setWithLastConsumed(current, "legitimate", true, "legitimate");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCohabitationAccess().getCohabitationKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getCohabitationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGsl.g:1174:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGsl.g:1175:4: otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getCohabitationAccess().getTypeKeyword_4_0());
                    			
                    // InternalGsl.g:1179:4: ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) )
                    // InternalGsl.g:1180:5: (lv_type_5_0= ruleTypeOfIntimateRelationship )
                    {
                    // InternalGsl.g:1180:5: (lv_type_5_0= ruleTypeOfIntimateRelationship )
                    // InternalGsl.g:1181:6: lv_type_5_0= ruleTypeOfIntimateRelationship
                    {

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getTypeTypeOfIntimateRelationshipEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_type_5_0=ruleTypeOfIntimateRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCohabitationRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"org.xtext.genDSL2.gsl.Gsl.TypeOfIntimateRelationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1199:3: (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGsl.g:1200:4: otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getCohabitationAccess().getPartnersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getCohabitationAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalGsl.g:1208:4: ( ( ruleEString ) )
                    // InternalGsl.g:1209:5: ( ruleEString )
                    {
                    // InternalGsl.g:1209:5: ( ruleEString )
                    // InternalGsl.g:1210:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCohabitationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getPartnersPersonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:1224:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==17) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalGsl.g:1225:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCohabitationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGsl.g:1229:5: ( ( ruleEString ) )
                    	    // InternalGsl.g:1230:6: ( ruleEString )
                    	    {
                    	    // InternalGsl.g:1230:6: ( ruleEString )
                    	    // InternalGsl.g:1231:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCohabitationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCohabitationAccess().getPartnersPersonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,44,FOLLOW_34); 

                    				newLeafNode(otherlv_11, grammarAccess.getCohabitationAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGsl.g:1251:3: (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGsl.g:1252:4: otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getCohabitationAccess().getChildrenKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getCohabitationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGsl.g:1260:4: ( (lv_children_14_0= rulePerson ) )
                    // InternalGsl.g:1261:5: (lv_children_14_0= rulePerson )
                    {
                    // InternalGsl.g:1261:5: (lv_children_14_0= rulePerson )
                    // InternalGsl.g:1262:6: lv_children_14_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getChildrenPersonParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_children_14_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCohabitationRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_14_0,
                    							"org.xtext.genDSL2.gsl.Gsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:1279:4: (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==17) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalGsl.g:1280:5: otherlv_15= ',' ( (lv_children_16_0= rulePerson ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCohabitationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGsl.g:1284:5: ( (lv_children_16_0= rulePerson ) )
                    	    // InternalGsl.g:1285:6: (lv_children_16_0= rulePerson )
                    	    {
                    	    // InternalGsl.g:1285:6: (lv_children_16_0= rulePerson )
                    	    // InternalGsl.g:1286:7: lv_children_16_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getCohabitationAccess().getChildrenPersonParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_children_16_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCohabitationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_16_0,
                    	    								"org.xtext.genDSL2.gsl.Gsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getCohabitationAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMarriage"
    // InternalGsl.g:1317:1: entryRuleMarriage returns [EObject current=null] : iv_ruleMarriage= ruleMarriage EOF ;
    public final EObject entryRuleMarriage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarriage = null;


        try {
            // InternalGsl.g:1317:49: (iv_ruleMarriage= ruleMarriage EOF )
            // InternalGsl.g:1318:2: iv_ruleMarriage= ruleMarriage EOF
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
    // InternalGsl.g:1324:1: ruleMarriage returns [EObject current=null] : ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleMarriage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Enumerator lv_type_4_0 = null;

        EObject lv_fromDate_12_0 = null;

        EObject lv_toDate_14_0 = null;

        EObject lv_children_17_0 = null;

        EObject lv_children_19_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1330:2: ( ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalGsl.g:1331:2: ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalGsl.g:1331:2: ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalGsl.g:1332:3: () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalGsl.g:1332:3: ()
            // InternalGsl.g:1333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarriageAccess().getMarriageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMarriageAccess().getMarriageKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getMarriageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGsl.g:1347:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGsl.g:1348:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getMarriageAccess().getTypeKeyword_3_0());
                    			
                    // InternalGsl.g:1352:4: ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) )
                    // InternalGsl.g:1353:5: (lv_type_4_0= ruleTypeOfIntimateRelationship )
                    {
                    // InternalGsl.g:1353:5: (lv_type_4_0= ruleTypeOfIntimateRelationship )
                    // InternalGsl.g:1354:6: lv_type_4_0= ruleTypeOfIntimateRelationship
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getTypeTypeOfIntimateRelationshipEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_type_4_0=ruleTypeOfIntimateRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
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

            // InternalGsl.g:1372:3: (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGsl.g:1373:4: otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getMarriageAccess().getSpousesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getMarriageAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalGsl.g:1381:4: ( ( ruleEString ) )
                    // InternalGsl.g:1382:5: ( ruleEString )
                    {
                    // InternalGsl.g:1382:5: ( ruleEString )
                    // InternalGsl.g:1383:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMarriageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMarriageAccess().getSpousesPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:1397:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==17) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalGsl.g:1398:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMarriageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGsl.g:1402:5: ( ( ruleEString ) )
                    	    // InternalGsl.g:1403:6: ( ruleEString )
                    	    {
                    	    // InternalGsl.g:1403:6: ( ruleEString )
                    	    // InternalGsl.g:1404:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMarriageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMarriageAccess().getSpousesPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,44,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getMarriageAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGsl.g:1424:3: (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGsl.g:1425:4: otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) )
                    {
                    otherlv_11=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getMarriageAccess().getFromDateKeyword_5_0());
                    			
                    // InternalGsl.g:1429:4: ( (lv_fromDate_12_0= ruleDateX ) )
                    // InternalGsl.g:1430:5: (lv_fromDate_12_0= ruleDateX )
                    {
                    // InternalGsl.g:1430:5: (lv_fromDate_12_0= ruleDateX )
                    // InternalGsl.g:1431:6: lv_fromDate_12_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getFromDateDateXParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_fromDate_12_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"fromDate",
                    							lv_fromDate_12_0,
                    							"org.xtext.genDSL2.gsl.Gsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1449:3: (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGsl.g:1450:4: otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) )
                    {
                    otherlv_13=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getMarriageAccess().getToDateKeyword_6_0());
                    			
                    // InternalGsl.g:1454:4: ( (lv_toDate_14_0= ruleDateX ) )
                    // InternalGsl.g:1455:5: (lv_toDate_14_0= ruleDateX )
                    {
                    // InternalGsl.g:1455:5: (lv_toDate_14_0= ruleDateX )
                    // InternalGsl.g:1456:6: lv_toDate_14_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getToDateDateXParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_toDate_14_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"toDate",
                    							lv_toDate_14_0,
                    							"org.xtext.genDSL2.gsl.Gsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1474:3: (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGsl.g:1475:4: otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getMarriageAccess().getChildrenKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getMarriageAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalGsl.g:1483:4: ( (lv_children_17_0= rulePerson ) )
                    // InternalGsl.g:1484:5: (lv_children_17_0= rulePerson )
                    {
                    // InternalGsl.g:1484:5: (lv_children_17_0= rulePerson )
                    // InternalGsl.g:1485:6: lv_children_17_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getChildrenPersonParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_children_17_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_17_0,
                    							"org.xtext.genDSL2.gsl.Gsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:1502:4: (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==17) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalGsl.g:1503:5: otherlv_18= ',' ( (lv_children_19_0= rulePerson ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getMarriageAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalGsl.g:1507:5: ( (lv_children_19_0= rulePerson ) )
                    	    // InternalGsl.g:1508:6: (lv_children_19_0= rulePerson )
                    	    {
                    	    // InternalGsl.g:1508:6: (lv_children_19_0= rulePerson )
                    	    // InternalGsl.g:1509:7: lv_children_19_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getMarriageAccess().getChildrenPersonParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_children_19_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMarriageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_19_0,
                    	    								"org.xtext.genDSL2.gsl.Gsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_20, grammarAccess.getMarriageAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getMarriageAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalGsl.g:1540:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGsl.g:1540:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGsl.g:1541:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalGsl.g:1547:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGsl.g:1553:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGsl.g:1554:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGsl.g:1554:2: (kw= 'true' | kw= 'false' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            else if ( (LA33_0==51) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalGsl.g:1555:3: kw= 'true'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGsl.g:1561:3: kw= 'false'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

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


    // $ANTLR start "ruleTypeOfPerson"
    // InternalGsl.g:1570:1: ruleTypeOfPerson returns [Enumerator current=null] : ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) ) ;
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
            // InternalGsl.g:1576:2: ( ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) ) )
            // InternalGsl.g:1577:2: ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) )
            {
            // InternalGsl.g:1577:2: ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) )
            int alt34=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt34=1;
                }
                break;
            case 53:
                {
                alt34=2;
                }
                break;
            case 54:
                {
                alt34=3;
                }
                break;
            case 55:
                {
                alt34=4;
                }
                break;
            case 56:
                {
                alt34=5;
                }
                break;
            case 57:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalGsl.g:1578:3: (enumLiteral_0= 'BIOLOGICAL' )
                    {
                    // InternalGsl.g:1578:3: (enumLiteral_0= 'BIOLOGICAL' )
                    // InternalGsl.g:1579:4: enumLiteral_0= 'BIOLOGICAL'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getBIOLOGICALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfPersonAccess().getBIOLOGICALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:1586:3: (enumLiteral_1= 'ADOPTED' )
                    {
                    // InternalGsl.g:1586:3: (enumLiteral_1= 'ADOPTED' )
                    // InternalGsl.g:1587:4: enumLiteral_1= 'ADOPTED'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getADOPTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfPersonAccess().getADOPTEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGsl.g:1594:3: (enumLiteral_2= 'SEMIADOPTED' )
                    {
                    // InternalGsl.g:1594:3: (enumLiteral_2= 'SEMIADOPTED' )
                    // InternalGsl.g:1595:4: enumLiteral_2= 'SEMIADOPTED'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getSEMIADOPTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeOfPersonAccess().getSEMIADOPTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGsl.g:1602:3: (enumLiteral_3= 'MARRIED' )
                    {
                    // InternalGsl.g:1602:3: (enumLiteral_3= 'MARRIED' )
                    // InternalGsl.g:1603:4: enumLiteral_3= 'MARRIED'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getMARRIEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeOfPersonAccess().getMARRIEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGsl.g:1610:3: (enumLiteral_4= 'DISOWNED' )
                    {
                    // InternalGsl.g:1610:3: (enumLiteral_4= 'DISOWNED' )
                    // InternalGsl.g:1611:4: enumLiteral_4= 'DISOWNED'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getDISOWNEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeOfPersonAccess().getDISOWNEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGsl.g:1618:3: (enumLiteral_5= 'ILLEGITIMATE' )
                    {
                    // InternalGsl.g:1618:3: (enumLiteral_5= 'ILLEGITIMATE' )
                    // InternalGsl.g:1619:4: enumLiteral_5= 'ILLEGITIMATE'
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
    // InternalGsl.g:1629:1: ruleGender returns [Enumerator current=null] : ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) ) ;
    public final Enumerator ruleGender() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGsl.g:1635:2: ( ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) ) )
            // InternalGsl.g:1636:2: ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) )
            {
            // InternalGsl.g:1636:2: ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt35=1;
                }
                break;
            case 59:
                {
                alt35=2;
                }
                break;
            case 60:
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
                    // InternalGsl.g:1637:3: (enumLiteral_0= 'MALE' )
                    {
                    // InternalGsl.g:1637:3: (enumLiteral_0= 'MALE' )
                    // InternalGsl.g:1638:4: enumLiteral_0= 'MALE'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getMALEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGenderAccess().getMALEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:1645:3: (enumLiteral_1= 'FEMALE' )
                    {
                    // InternalGsl.g:1645:3: (enumLiteral_1= 'FEMALE' )
                    // InternalGsl.g:1646:4: enumLiteral_1= 'FEMALE'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getFEMALEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGenderAccess().getFEMALEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGsl.g:1653:3: (enumLiteral_2= 'BIGENDER' )
                    {
                    // InternalGsl.g:1653:3: (enumLiteral_2= 'BIGENDER' )
                    // InternalGsl.g:1654:4: enumLiteral_2= 'BIGENDER'
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
    // InternalGsl.g:1664:1: ruleTypeOfIntimateRelationship returns [Enumerator current=null] : ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) ) ;
    public final Enumerator ruleTypeOfIntimateRelationship() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGsl.g:1670:2: ( ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) ) )
            // InternalGsl.g:1671:2: ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) )
            {
            // InternalGsl.g:1671:2: ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt36=1;
                }
                break;
            case 62:
                {
                alt36=2;
                }
                break;
            case 63:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalGsl.g:1672:3: (enumLiteral_0= 'MONOGAMY' )
                    {
                    // InternalGsl.g:1672:3: (enumLiteral_0= 'MONOGAMY' )
                    // InternalGsl.g:1673:4: enumLiteral_0= 'MONOGAMY'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getMONOGAMYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfIntimateRelationshipAccess().getMONOGAMYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:1680:3: (enumLiteral_1= 'POLYGAMY' )
                    {
                    // InternalGsl.g:1680:3: (enumLiteral_1= 'POLYGAMY' )
                    // InternalGsl.g:1681:4: enumLiteral_1= 'POLYGAMY'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYGAMYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYGAMYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGsl.g:1688:3: (enumLiteral_2= 'POLYFIDELITY' )
                    {
                    // InternalGsl.g:1688:3: (enumLiteral_2= 'POLYFIDELITY' )
                    // InternalGsl.g:1689:4: enumLiteral_2= 'POLYFIDELITY'
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


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\22\14\uffff";
    static final String dfa_3s = "\1\43\14\uffff";
    static final String dfa_4s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_5s = "\1\0\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\3\1",
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
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 396:6: ( ({...}? => ( ({...}? => (otherlv_4= 'unknown' ( (lv_unknown_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'birthDate' ( (lv_birthDate_27_0= ruleDateX ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'deathDate' ( (lv_deathDate_29_0= ruleDateX ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                         
                        int index9_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_0==18||(LA9_0>=33 && LA9_0<=35)) ) {s = 1;}

                        else if ( LA9_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA9_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA9_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA9_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA9_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA9_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA9_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA9_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA9_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA9_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                        else if ( LA9_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPersonAccess().getUnorderedGroup_3(), 10) ) {s = 12;}

                         
                        input.seek(index9_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000FFFC40000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000C00040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000C008000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000240004040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000240000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0003A00004040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0003A00000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0003200000040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002200000040000L});

}
