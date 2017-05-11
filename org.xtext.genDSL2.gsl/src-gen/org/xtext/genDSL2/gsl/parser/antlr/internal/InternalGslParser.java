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
    // InternalGsl.g:352:1: rulePerson returns [EObject current=null] : ( () ( (lv_givenName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'unknown' ( (lv_unknown_4_0= ruleEBoolean ) ) )? (otherlv_5= 'birthPlace' ( (lv_birthPlace_6_0= ruleEString ) ) )? (otherlv_7= 'deathPlace' ( (lv_deathPlace_8_0= ruleEString ) ) )? (otherlv_9= 'restingPlace' ( (lv_restingPlace_10_0= ruleEString ) ) )? (otherlv_11= 'type' ( (lv_type_12_0= ruleTypeOfPerson ) ) )? (otherlv_13= 'gender' ( (lv_gender_14_0= ruleGender ) ) )? (otherlv_15= 'otherNames' otherlv_16= '{' ( (lv_otherNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_otherNames_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'nickname' ( (lv_nickname_22_0= ruleEString ) ) )? (otherlv_23= 'deathCause' ( (lv_deathCause_24_0= ruleEString ) ) )? (otherlv_25= 'birthDate' ( (lv_birthDate_26_0= ruleDateX ) ) )? (otherlv_27= 'deathDate' ( (lv_deathDate_28_0= ruleDateX ) ) )? (otherlv_29= 'personhistory' otherlv_30= '{' ( (lv_personhistory_31_0= rulePersonHistory ) ) (otherlv_32= ',' ( (lv_personhistory_33_0= rulePersonHistory ) ) )* otherlv_34= '}' )? (otherlv_35= 'cohabitation' otherlv_36= '{' ( (lv_cohabitation_37_0= ruleCohabitation ) ) (otherlv_38= ',' ( (lv_cohabitation_39_0= ruleCohabitation ) ) )* otherlv_40= '}' )? (otherlv_41= 'marriage' otherlv_42= '{' ( (lv_marriage_43_0= ruleMarriage ) ) (otherlv_44= ',' ( (lv_marriage_45_0= ruleMarriage ) ) )* otherlv_46= '}' )? otherlv_47= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        AntlrDatatypeRuleToken lv_givenName_1_0 = null;

        AntlrDatatypeRuleToken lv_unknown_4_0 = null;

        AntlrDatatypeRuleToken lv_birthPlace_6_0 = null;

        AntlrDatatypeRuleToken lv_deathPlace_8_0 = null;

        AntlrDatatypeRuleToken lv_restingPlace_10_0 = null;

        Enumerator lv_type_12_0 = null;

        Enumerator lv_gender_14_0 = null;

        AntlrDatatypeRuleToken lv_otherNames_17_0 = null;

        AntlrDatatypeRuleToken lv_otherNames_19_0 = null;

        AntlrDatatypeRuleToken lv_nickname_22_0 = null;

        AntlrDatatypeRuleToken lv_deathCause_24_0 = null;

        EObject lv_birthDate_26_0 = null;

        EObject lv_deathDate_28_0 = null;

        EObject lv_personhistory_31_0 = null;

        EObject lv_personhistory_33_0 = null;

        EObject lv_cohabitation_37_0 = null;

        EObject lv_cohabitation_39_0 = null;

        EObject lv_marriage_43_0 = null;

        EObject lv_marriage_45_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:358:2: ( ( () ( (lv_givenName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'unknown' ( (lv_unknown_4_0= ruleEBoolean ) ) )? (otherlv_5= 'birthPlace' ( (lv_birthPlace_6_0= ruleEString ) ) )? (otherlv_7= 'deathPlace' ( (lv_deathPlace_8_0= ruleEString ) ) )? (otherlv_9= 'restingPlace' ( (lv_restingPlace_10_0= ruleEString ) ) )? (otherlv_11= 'type' ( (lv_type_12_0= ruleTypeOfPerson ) ) )? (otherlv_13= 'gender' ( (lv_gender_14_0= ruleGender ) ) )? (otherlv_15= 'otherNames' otherlv_16= '{' ( (lv_otherNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_otherNames_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'nickname' ( (lv_nickname_22_0= ruleEString ) ) )? (otherlv_23= 'deathCause' ( (lv_deathCause_24_0= ruleEString ) ) )? (otherlv_25= 'birthDate' ( (lv_birthDate_26_0= ruleDateX ) ) )? (otherlv_27= 'deathDate' ( (lv_deathDate_28_0= ruleDateX ) ) )? (otherlv_29= 'personhistory' otherlv_30= '{' ( (lv_personhistory_31_0= rulePersonHistory ) ) (otherlv_32= ',' ( (lv_personhistory_33_0= rulePersonHistory ) ) )* otherlv_34= '}' )? (otherlv_35= 'cohabitation' otherlv_36= '{' ( (lv_cohabitation_37_0= ruleCohabitation ) ) (otherlv_38= ',' ( (lv_cohabitation_39_0= ruleCohabitation ) ) )* otherlv_40= '}' )? (otherlv_41= 'marriage' otherlv_42= '{' ( (lv_marriage_43_0= ruleMarriage ) ) (otherlv_44= ',' ( (lv_marriage_45_0= ruleMarriage ) ) )* otherlv_46= '}' )? otherlv_47= '}' ) )
            // InternalGsl.g:359:2: ( () ( (lv_givenName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'unknown' ( (lv_unknown_4_0= ruleEBoolean ) ) )? (otherlv_5= 'birthPlace' ( (lv_birthPlace_6_0= ruleEString ) ) )? (otherlv_7= 'deathPlace' ( (lv_deathPlace_8_0= ruleEString ) ) )? (otherlv_9= 'restingPlace' ( (lv_restingPlace_10_0= ruleEString ) ) )? (otherlv_11= 'type' ( (lv_type_12_0= ruleTypeOfPerson ) ) )? (otherlv_13= 'gender' ( (lv_gender_14_0= ruleGender ) ) )? (otherlv_15= 'otherNames' otherlv_16= '{' ( (lv_otherNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_otherNames_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'nickname' ( (lv_nickname_22_0= ruleEString ) ) )? (otherlv_23= 'deathCause' ( (lv_deathCause_24_0= ruleEString ) ) )? (otherlv_25= 'birthDate' ( (lv_birthDate_26_0= ruleDateX ) ) )? (otherlv_27= 'deathDate' ( (lv_deathDate_28_0= ruleDateX ) ) )? (otherlv_29= 'personhistory' otherlv_30= '{' ( (lv_personhistory_31_0= rulePersonHistory ) ) (otherlv_32= ',' ( (lv_personhistory_33_0= rulePersonHistory ) ) )* otherlv_34= '}' )? (otherlv_35= 'cohabitation' otherlv_36= '{' ( (lv_cohabitation_37_0= ruleCohabitation ) ) (otherlv_38= ',' ( (lv_cohabitation_39_0= ruleCohabitation ) ) )* otherlv_40= '}' )? (otherlv_41= 'marriage' otherlv_42= '{' ( (lv_marriage_43_0= ruleMarriage ) ) (otherlv_44= ',' ( (lv_marriage_45_0= ruleMarriage ) ) )* otherlv_46= '}' )? otherlv_47= '}' )
            {
            // InternalGsl.g:359:2: ( () ( (lv_givenName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'unknown' ( (lv_unknown_4_0= ruleEBoolean ) ) )? (otherlv_5= 'birthPlace' ( (lv_birthPlace_6_0= ruleEString ) ) )? (otherlv_7= 'deathPlace' ( (lv_deathPlace_8_0= ruleEString ) ) )? (otherlv_9= 'restingPlace' ( (lv_restingPlace_10_0= ruleEString ) ) )? (otherlv_11= 'type' ( (lv_type_12_0= ruleTypeOfPerson ) ) )? (otherlv_13= 'gender' ( (lv_gender_14_0= ruleGender ) ) )? (otherlv_15= 'otherNames' otherlv_16= '{' ( (lv_otherNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_otherNames_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'nickname' ( (lv_nickname_22_0= ruleEString ) ) )? (otherlv_23= 'deathCause' ( (lv_deathCause_24_0= ruleEString ) ) )? (otherlv_25= 'birthDate' ( (lv_birthDate_26_0= ruleDateX ) ) )? (otherlv_27= 'deathDate' ( (lv_deathDate_28_0= ruleDateX ) ) )? (otherlv_29= 'personhistory' otherlv_30= '{' ( (lv_personhistory_31_0= rulePersonHistory ) ) (otherlv_32= ',' ( (lv_personhistory_33_0= rulePersonHistory ) ) )* otherlv_34= '}' )? (otherlv_35= 'cohabitation' otherlv_36= '{' ( (lv_cohabitation_37_0= ruleCohabitation ) ) (otherlv_38= ',' ( (lv_cohabitation_39_0= ruleCohabitation ) ) )* otherlv_40= '}' )? (otherlv_41= 'marriage' otherlv_42= '{' ( (lv_marriage_43_0= ruleMarriage ) ) (otherlv_44= ',' ( (lv_marriage_45_0= ruleMarriage ) ) )* otherlv_46= '}' )? otherlv_47= '}' )
            // InternalGsl.g:360:3: () ( (lv_givenName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'unknown' ( (lv_unknown_4_0= ruleEBoolean ) ) )? (otherlv_5= 'birthPlace' ( (lv_birthPlace_6_0= ruleEString ) ) )? (otherlv_7= 'deathPlace' ( (lv_deathPlace_8_0= ruleEString ) ) )? (otherlv_9= 'restingPlace' ( (lv_restingPlace_10_0= ruleEString ) ) )? (otherlv_11= 'type' ( (lv_type_12_0= ruleTypeOfPerson ) ) )? (otherlv_13= 'gender' ( (lv_gender_14_0= ruleGender ) ) )? (otherlv_15= 'otherNames' otherlv_16= '{' ( (lv_otherNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_otherNames_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'nickname' ( (lv_nickname_22_0= ruleEString ) ) )? (otherlv_23= 'deathCause' ( (lv_deathCause_24_0= ruleEString ) ) )? (otherlv_25= 'birthDate' ( (lv_birthDate_26_0= ruleDateX ) ) )? (otherlv_27= 'deathDate' ( (lv_deathDate_28_0= ruleDateX ) ) )? (otherlv_29= 'personhistory' otherlv_30= '{' ( (lv_personhistory_31_0= rulePersonHistory ) ) (otherlv_32= ',' ( (lv_personhistory_33_0= rulePersonHistory ) ) )* otherlv_34= '}' )? (otherlv_35= 'cohabitation' otherlv_36= '{' ( (lv_cohabitation_37_0= ruleCohabitation ) ) (otherlv_38= ',' ( (lv_cohabitation_39_0= ruleCohabitation ) ) )* otherlv_40= '}' )? (otherlv_41= 'marriage' otherlv_42= '{' ( (lv_marriage_43_0= ruleMarriage ) ) (otherlv_44= ',' ( (lv_marriage_45_0= ruleMarriage ) ) )* otherlv_46= '}' )? otherlv_47= '}'
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
            		
            // InternalGsl.g:390:3: (otherlv_3= 'unknown' ( (lv_unknown_4_0= ruleEBoolean ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGsl.g:391:4: otherlv_3= 'unknown' ( (lv_unknown_4_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getUnknownKeyword_3_0());
                    			
                    // InternalGsl.g:395:4: ( (lv_unknown_4_0= ruleEBoolean ) )
                    // InternalGsl.g:396:5: (lv_unknown_4_0= ruleEBoolean )
                    {
                    // InternalGsl.g:396:5: (lv_unknown_4_0= ruleEBoolean )
                    // InternalGsl.g:397:6: lv_unknown_4_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getUnknownEBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_unknown_4_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"unknown",
                    							lv_unknown_4_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:415:3: (otherlv_5= 'birthPlace' ( (lv_birthPlace_6_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGsl.g:416:4: otherlv_5= 'birthPlace' ( (lv_birthPlace_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getBirthPlaceKeyword_4_0());
                    			
                    // InternalGsl.g:420:4: ( (lv_birthPlace_6_0= ruleEString ) )
                    // InternalGsl.g:421:5: (lv_birthPlace_6_0= ruleEString )
                    {
                    // InternalGsl.g:421:5: (lv_birthPlace_6_0= ruleEString )
                    // InternalGsl.g:422:6: lv_birthPlace_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getBirthPlaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_birthPlace_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"birthPlace",
                    							lv_birthPlace_6_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:440:3: (otherlv_7= 'deathPlace' ( (lv_deathPlace_8_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGsl.g:441:4: otherlv_7= 'deathPlace' ( (lv_deathPlace_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getPersonAccess().getDeathPlaceKeyword_5_0());
                    			
                    // InternalGsl.g:445:4: ( (lv_deathPlace_8_0= ruleEString ) )
                    // InternalGsl.g:446:5: (lv_deathPlace_8_0= ruleEString )
                    {
                    // InternalGsl.g:446:5: (lv_deathPlace_8_0= ruleEString )
                    // InternalGsl.g:447:6: lv_deathPlace_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getDeathPlaceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_deathPlace_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"deathPlace",
                    							lv_deathPlace_8_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:465:3: (otherlv_9= 'restingPlace' ( (lv_restingPlace_10_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGsl.g:466:4: otherlv_9= 'restingPlace' ( (lv_restingPlace_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getPersonAccess().getRestingPlaceKeyword_6_0());
                    			
                    // InternalGsl.g:470:4: ( (lv_restingPlace_10_0= ruleEString ) )
                    // InternalGsl.g:471:5: (lv_restingPlace_10_0= ruleEString )
                    {
                    // InternalGsl.g:471:5: (lv_restingPlace_10_0= ruleEString )
                    // InternalGsl.g:472:6: lv_restingPlace_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getRestingPlaceEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_restingPlace_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"restingPlace",
                    							lv_restingPlace_10_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:490:3: (otherlv_11= 'type' ( (lv_type_12_0= ruleTypeOfPerson ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGsl.g:491:4: otherlv_11= 'type' ( (lv_type_12_0= ruleTypeOfPerson ) )
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getPersonAccess().getTypeKeyword_7_0());
                    			
                    // InternalGsl.g:495:4: ( (lv_type_12_0= ruleTypeOfPerson ) )
                    // InternalGsl.g:496:5: (lv_type_12_0= ruleTypeOfPerson )
                    {
                    // InternalGsl.g:496:5: (lv_type_12_0= ruleTypeOfPerson )
                    // InternalGsl.g:497:6: lv_type_12_0= ruleTypeOfPerson
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getTypeTypeOfPersonEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_type_12_0=ruleTypeOfPerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_12_0,
                    							"org.xtext.genDSL2.gsl.Gsl.TypeOfPerson");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:515:3: (otherlv_13= 'gender' ( (lv_gender_14_0= ruleGender ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGsl.g:516:4: otherlv_13= 'gender' ( (lv_gender_14_0= ruleGender ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getPersonAccess().getGenderKeyword_8_0());
                    			
                    // InternalGsl.g:520:4: ( (lv_gender_14_0= ruleGender ) )
                    // InternalGsl.g:521:5: (lv_gender_14_0= ruleGender )
                    {
                    // InternalGsl.g:521:5: (lv_gender_14_0= ruleGender )
                    // InternalGsl.g:522:6: lv_gender_14_0= ruleGender
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getGenderGenderEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_gender_14_0=ruleGender();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"gender",
                    							lv_gender_14_0,
                    							"org.xtext.genDSL2.gsl.Gsl.Gender");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:540:3: (otherlv_15= 'otherNames' otherlv_16= '{' ( (lv_otherNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_otherNames_19_0= ruleEString ) ) )* otherlv_20= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGsl.g:541:4: otherlv_15= 'otherNames' otherlv_16= '{' ( (lv_otherNames_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_otherNames_19_0= ruleEString ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getPersonAccess().getOtherNamesKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalGsl.g:549:4: ( (lv_otherNames_17_0= ruleEString ) )
                    // InternalGsl.g:550:5: (lv_otherNames_17_0= ruleEString )
                    {
                    // InternalGsl.g:550:5: (lv_otherNames_17_0= ruleEString )
                    // InternalGsl.g:551:6: lv_otherNames_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getOtherNamesEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_otherNames_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						add(
                    							current,
                    							"otherNames",
                    							lv_otherNames_17_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:568:4: (otherlv_18= ',' ( (lv_otherNames_19_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGsl.g:569:5: otherlv_18= ',' ( (lv_otherNames_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getPersonAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalGsl.g:573:5: ( (lv_otherNames_19_0= ruleEString ) )
                    	    // InternalGsl.g:574:6: (lv_otherNames_19_0= ruleEString )
                    	    {
                    	    // InternalGsl.g:574:6: (lv_otherNames_19_0= ruleEString )
                    	    // InternalGsl.g:575:7: lv_otherNames_19_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getOtherNamesEStringParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_otherNames_19_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"otherNames",
                    	    								lv_otherNames_19_0,
                    	    								"org.xtext.genDSL2.gsl.Gsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_20, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalGsl.g:598:3: (otherlv_21= 'nickname' ( (lv_nickname_22_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGsl.g:599:4: otherlv_21= 'nickname' ( (lv_nickname_22_0= ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_21, grammarAccess.getPersonAccess().getNicknameKeyword_10_0());
                    			
                    // InternalGsl.g:603:4: ( (lv_nickname_22_0= ruleEString ) )
                    // InternalGsl.g:604:5: (lv_nickname_22_0= ruleEString )
                    {
                    // InternalGsl.g:604:5: (lv_nickname_22_0= ruleEString )
                    // InternalGsl.g:605:6: lv_nickname_22_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getNicknameEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_nickname_22_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"nickname",
                    							lv_nickname_22_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:623:3: (otherlv_23= 'deathCause' ( (lv_deathCause_24_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGsl.g:624:4: otherlv_23= 'deathCause' ( (lv_deathCause_24_0= ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_23, grammarAccess.getPersonAccess().getDeathCauseKeyword_11_0());
                    			
                    // InternalGsl.g:628:4: ( (lv_deathCause_24_0= ruleEString ) )
                    // InternalGsl.g:629:5: (lv_deathCause_24_0= ruleEString )
                    {
                    // InternalGsl.g:629:5: (lv_deathCause_24_0= ruleEString )
                    // InternalGsl.g:630:6: lv_deathCause_24_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getDeathCauseEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_deathCause_24_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"deathCause",
                    							lv_deathCause_24_0,
                    							"org.xtext.genDSL2.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:648:3: (otherlv_25= 'birthDate' ( (lv_birthDate_26_0= ruleDateX ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGsl.g:649:4: otherlv_25= 'birthDate' ( (lv_birthDate_26_0= ruleDateX ) )
                    {
                    otherlv_25=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getPersonAccess().getBirthDateKeyword_12_0());
                    			
                    // InternalGsl.g:653:4: ( (lv_birthDate_26_0= ruleDateX ) )
                    // InternalGsl.g:654:5: (lv_birthDate_26_0= ruleDateX )
                    {
                    // InternalGsl.g:654:5: (lv_birthDate_26_0= ruleDateX )
                    // InternalGsl.g:655:6: lv_birthDate_26_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getBirthDateDateXParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_birthDate_26_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"birthDate",
                    							lv_birthDate_26_0,
                    							"org.xtext.genDSL2.gsl.Gsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:673:3: (otherlv_27= 'deathDate' ( (lv_deathDate_28_0= ruleDateX ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGsl.g:674:4: otherlv_27= 'deathDate' ( (lv_deathDate_28_0= ruleDateX ) )
                    {
                    otherlv_27=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getPersonAccess().getDeathDateKeyword_13_0());
                    			
                    // InternalGsl.g:678:4: ( (lv_deathDate_28_0= ruleDateX ) )
                    // InternalGsl.g:679:5: (lv_deathDate_28_0= ruleDateX )
                    {
                    // InternalGsl.g:679:5: (lv_deathDate_28_0= ruleDateX )
                    // InternalGsl.g:680:6: lv_deathDate_28_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getDeathDateDateXParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_deathDate_28_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"deathDate",
                    							lv_deathDate_28_0,
                    							"org.xtext.genDSL2.gsl.Gsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:698:3: (otherlv_29= 'personhistory' otherlv_30= '{' ( (lv_personhistory_31_0= rulePersonHistory ) ) (otherlv_32= ',' ( (lv_personhistory_33_0= rulePersonHistory ) ) )* otherlv_34= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGsl.g:699:4: otherlv_29= 'personhistory' otherlv_30= '{' ( (lv_personhistory_31_0= rulePersonHistory ) ) (otherlv_32= ',' ( (lv_personhistory_33_0= rulePersonHistory ) ) )* otherlv_34= '}'
                    {
                    otherlv_29=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_29, grammarAccess.getPersonAccess().getPersonhistoryKeyword_14_0());
                    			
                    otherlv_30=(Token)match(input,13,FOLLOW_29); 

                    				newLeafNode(otherlv_30, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalGsl.g:707:4: ( (lv_personhistory_31_0= rulePersonHistory ) )
                    // InternalGsl.g:708:5: (lv_personhistory_31_0= rulePersonHistory )
                    {
                    // InternalGsl.g:708:5: (lv_personhistory_31_0= rulePersonHistory )
                    // InternalGsl.g:709:6: lv_personhistory_31_0= rulePersonHistory
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getPersonhistoryPersonHistoryParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_personhistory_31_0=rulePersonHistory();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						add(
                    							current,
                    							"personhistory",
                    							lv_personhistory_31_0,
                    							"org.xtext.genDSL2.gsl.Gsl.PersonHistory");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:726:4: (otherlv_32= ',' ( (lv_personhistory_33_0= rulePersonHistory ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==17) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalGsl.g:727:5: otherlv_32= ',' ( (lv_personhistory_33_0= rulePersonHistory ) )
                    	    {
                    	    otherlv_32=(Token)match(input,17,FOLLOW_29); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getPersonAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalGsl.g:731:5: ( (lv_personhistory_33_0= rulePersonHistory ) )
                    	    // InternalGsl.g:732:6: (lv_personhistory_33_0= rulePersonHistory )
                    	    {
                    	    // InternalGsl.g:732:6: (lv_personhistory_33_0= rulePersonHistory )
                    	    // InternalGsl.g:733:7: lv_personhistory_33_0= rulePersonHistory
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getPersonhistoryPersonHistoryParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_personhistory_33_0=rulePersonHistory();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"personhistory",
                    	    								lv_personhistory_33_0,
                    	    								"org.xtext.genDSL2.gsl.Gsl.PersonHistory");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_34, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalGsl.g:756:3: (otherlv_35= 'cohabitation' otherlv_36= '{' ( (lv_cohabitation_37_0= ruleCohabitation ) ) (otherlv_38= ',' ( (lv_cohabitation_39_0= ruleCohabitation ) ) )* otherlv_40= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGsl.g:757:4: otherlv_35= 'cohabitation' otherlv_36= '{' ( (lv_cohabitation_37_0= ruleCohabitation ) ) (otherlv_38= ',' ( (lv_cohabitation_39_0= ruleCohabitation ) ) )* otherlv_40= '}'
                    {
                    otherlv_35=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_35, grammarAccess.getPersonAccess().getCohabitationKeyword_15_0());
                    			
                    otherlv_36=(Token)match(input,13,FOLLOW_31); 

                    				newLeafNode(otherlv_36, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalGsl.g:765:4: ( (lv_cohabitation_37_0= ruleCohabitation ) )
                    // InternalGsl.g:766:5: (lv_cohabitation_37_0= ruleCohabitation )
                    {
                    // InternalGsl.g:766:5: (lv_cohabitation_37_0= ruleCohabitation )
                    // InternalGsl.g:767:6: lv_cohabitation_37_0= ruleCohabitation
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getCohabitationCohabitationParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_cohabitation_37_0=ruleCohabitation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						add(
                    							current,
                    							"cohabitation",
                    							lv_cohabitation_37_0,
                    							"org.xtext.genDSL2.gsl.Gsl.Cohabitation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:784:4: (otherlv_38= ',' ( (lv_cohabitation_39_0= ruleCohabitation ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==17) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalGsl.g:785:5: otherlv_38= ',' ( (lv_cohabitation_39_0= ruleCohabitation ) )
                    	    {
                    	    otherlv_38=(Token)match(input,17,FOLLOW_31); 

                    	    					newLeafNode(otherlv_38, grammarAccess.getPersonAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalGsl.g:789:5: ( (lv_cohabitation_39_0= ruleCohabitation ) )
                    	    // InternalGsl.g:790:6: (lv_cohabitation_39_0= ruleCohabitation )
                    	    {
                    	    // InternalGsl.g:790:6: (lv_cohabitation_39_0= ruleCohabitation )
                    	    // InternalGsl.g:791:7: lv_cohabitation_39_0= ruleCohabitation
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getCohabitationCohabitationParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_cohabitation_39_0=ruleCohabitation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cohabitation",
                    	    								lv_cohabitation_39_0,
                    	    								"org.xtext.genDSL2.gsl.Gsl.Cohabitation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,18,FOLLOW_32); 

                    				newLeafNode(otherlv_40, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalGsl.g:814:3: (otherlv_41= 'marriage' otherlv_42= '{' ( (lv_marriage_43_0= ruleMarriage ) ) (otherlv_44= ',' ( (lv_marriage_45_0= ruleMarriage ) ) )* otherlv_46= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGsl.g:815:4: otherlv_41= 'marriage' otherlv_42= '{' ( (lv_marriage_43_0= ruleMarriage ) ) (otherlv_44= ',' ( (lv_marriage_45_0= ruleMarriage ) ) )* otherlv_46= '}'
                    {
                    otherlv_41=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_41, grammarAccess.getPersonAccess().getMarriageKeyword_16_0());
                    			
                    otherlv_42=(Token)match(input,13,FOLLOW_33); 

                    				newLeafNode(otherlv_42, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalGsl.g:823:4: ( (lv_marriage_43_0= ruleMarriage ) )
                    // InternalGsl.g:824:5: (lv_marriage_43_0= ruleMarriage )
                    {
                    // InternalGsl.g:824:5: (lv_marriage_43_0= ruleMarriage )
                    // InternalGsl.g:825:6: lv_marriage_43_0= ruleMarriage
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getMarriageMarriageParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_marriage_43_0=ruleMarriage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						add(
                    							current,
                    							"marriage",
                    							lv_marriage_43_0,
                    							"org.xtext.genDSL2.gsl.Gsl.Marriage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:842:4: (otherlv_44= ',' ( (lv_marriage_45_0= ruleMarriage ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==17) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalGsl.g:843:5: otherlv_44= ',' ( (lv_marriage_45_0= ruleMarriage ) )
                    	    {
                    	    otherlv_44=(Token)match(input,17,FOLLOW_33); 

                    	    					newLeafNode(otherlv_44, grammarAccess.getPersonAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalGsl.g:847:5: ( (lv_marriage_45_0= ruleMarriage ) )
                    	    // InternalGsl.g:848:6: (lv_marriage_45_0= ruleMarriage )
                    	    {
                    	    // InternalGsl.g:848:6: (lv_marriage_45_0= ruleMarriage )
                    	    // InternalGsl.g:849:7: lv_marriage_45_0= ruleMarriage
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getMarriageMarriageParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_marriage_45_0=ruleMarriage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"marriage",
                    	    								lv_marriage_45_0,
                    	    								"org.xtext.genDSL2.gsl.Gsl.Marriage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_46=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_46, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            otherlv_47=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_47, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_17());
            		

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
    // InternalGsl.g:880:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGsl.g:880:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGsl.g:881:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalGsl.g:887:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGsl.g:893:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGsl.g:894:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGsl.g:894:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGsl.g:895:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGsl.g:895:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGsl.g:896:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_34); 

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
    // InternalGsl.g:913:1: entryRulePersonHistory returns [EObject current=null] : iv_rulePersonHistory= rulePersonHistory EOF ;
    public final EObject entryRulePersonHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonHistory = null;


        try {
            // InternalGsl.g:913:54: (iv_rulePersonHistory= rulePersonHistory EOF )
            // InternalGsl.g:914:2: iv_rulePersonHistory= rulePersonHistory EOF
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
    // InternalGsl.g:920:1: rulePersonHistory returns [EObject current=null] : ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )? ) ;
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
            // InternalGsl.g:926:2: ( ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )? ) )
            // InternalGsl.g:927:2: ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )? )
            {
            // InternalGsl.g:927:2: ( () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )? )
            // InternalGsl.g:928:3: () otherlv_1= 'PersonHistory' (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )? (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )?
            {
            // InternalGsl.g:928:3: ()
            // InternalGsl.g:929:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonHistoryAccess().getPersonHistoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonHistoryAccess().getPersonHistoryKeyword_1());
            		
            // InternalGsl.g:939:3: (otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGsl.g:940:4: otherlv_2= 'gender' ( (lv_gender_3_0= ruleGender ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getPersonHistoryAccess().getGenderKeyword_2_0());
                    			
                    // InternalGsl.g:944:4: ( (lv_gender_3_0= ruleGender ) )
                    // InternalGsl.g:945:5: (lv_gender_3_0= ruleGender )
                    {
                    // InternalGsl.g:945:5: (lv_gender_3_0= ruleGender )
                    // InternalGsl.g:946:6: lv_gender_3_0= ruleGender
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getGenderGenderEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

            // InternalGsl.g:964:3: (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGsl.g:965:4: otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonHistoryAccess().getGivenNameKeyword_3_0());
                    			
                    // InternalGsl.g:969:4: ( (lv_givenName_5_0= ruleEString ) )
                    // InternalGsl.g:970:5: (lv_givenName_5_0= ruleEString )
                    {
                    // InternalGsl.g:970:5: (lv_givenName_5_0= ruleEString )
                    // InternalGsl.g:971:6: lv_givenName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getGivenNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

            // InternalGsl.g:989:3: (otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGsl.g:990:4: otherlv_6= 'changed' ( (lv_changed_7_0= RULE_EDATE ) )
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getPersonHistoryAccess().getChangedKeyword_4_0());
                    			
                    // InternalGsl.g:994:4: ( (lv_changed_7_0= RULE_EDATE ) )
                    // InternalGsl.g:995:5: (lv_changed_7_0= RULE_EDATE )
                    {
                    // InternalGsl.g:995:5: (lv_changed_7_0= RULE_EDATE )
                    // InternalGsl.g:996:6: lv_changed_7_0= RULE_EDATE
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
    // InternalGsl.g:1017:1: entryRuleCohabitation returns [EObject current=null] : iv_ruleCohabitation= ruleCohabitation EOF ;
    public final EObject entryRuleCohabitation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCohabitation = null;


        try {
            // InternalGsl.g:1017:53: (iv_ruleCohabitation= ruleCohabitation EOF )
            // InternalGsl.g:1018:2: iv_ruleCohabitation= ruleCohabitation EOF
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
    // InternalGsl.g:1024:1: ruleCohabitation returns [EObject current=null] : ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalGsl.g:1030:2: ( ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalGsl.g:1031:2: ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalGsl.g:1031:2: ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalGsl.g:1032:3: () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalGsl.g:1032:3: ()
            // InternalGsl.g:1033:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCohabitationAccess().getCohabitationAction_0(),
            					current);
            			

            }

            // InternalGsl.g:1039:3: ( (lv_legitimate_1_0= 'legitimate' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGsl.g:1040:4: (lv_legitimate_1_0= 'legitimate' )
                    {
                    // InternalGsl.g:1040:4: (lv_legitimate_1_0= 'legitimate' )
                    // InternalGsl.g:1041:5: lv_legitimate_1_0= 'legitimate'
                    {
                    lv_legitimate_1_0=(Token)match(input,40,FOLLOW_39); 

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
            		
            otherlv_3=(Token)match(input,13,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getCohabitationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGsl.g:1061:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGsl.g:1062:4: otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getCohabitationAccess().getTypeKeyword_4_0());
                    			
                    // InternalGsl.g:1066:4: ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) )
                    // InternalGsl.g:1067:5: (lv_type_5_0= ruleTypeOfIntimateRelationship )
                    {
                    // InternalGsl.g:1067:5: (lv_type_5_0= ruleTypeOfIntimateRelationship )
                    // InternalGsl.g:1068:6: lv_type_5_0= ruleTypeOfIntimateRelationship
                    {

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getTypeTypeOfIntimateRelationshipEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalGsl.g:1086:3: (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGsl.g:1087:4: otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getCohabitationAccess().getPartnersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getCohabitationAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalGsl.g:1095:4: ( ( ruleEString ) )
                    // InternalGsl.g:1096:5: ( ruleEString )
                    {
                    // InternalGsl.g:1096:5: ( ruleEString )
                    // InternalGsl.g:1097:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCohabitationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getPartnersPersonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:1111:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==17) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalGsl.g:1112:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCohabitationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGsl.g:1116:5: ( ( ruleEString ) )
                    	    // InternalGsl.g:1117:6: ( ruleEString )
                    	    {
                    	    // InternalGsl.g:1117:6: ( ruleEString )
                    	    // InternalGsl.g:1118:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCohabitationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCohabitationAccess().getPartnersPersonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,44,FOLLOW_45); 

                    				newLeafNode(otherlv_11, grammarAccess.getCohabitationAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGsl.g:1138:3: (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGsl.g:1139:4: otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getCohabitationAccess().getChildrenKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getCohabitationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGsl.g:1147:4: ( (lv_children_14_0= rulePerson ) )
                    // InternalGsl.g:1148:5: (lv_children_14_0= rulePerson )
                    {
                    // InternalGsl.g:1148:5: (lv_children_14_0= rulePerson )
                    // InternalGsl.g:1149:6: lv_children_14_0= rulePerson
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

                    // InternalGsl.g:1166:4: (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==17) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalGsl.g:1167:5: otherlv_15= ',' ( (lv_children_16_0= rulePerson ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCohabitationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGsl.g:1171:5: ( (lv_children_16_0= rulePerson ) )
                    	    // InternalGsl.g:1172:6: (lv_children_16_0= rulePerson )
                    	    {
                    	    // InternalGsl.g:1172:6: (lv_children_16_0= rulePerson )
                    	    // InternalGsl.g:1173:7: lv_children_16_0= rulePerson
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
                    	    break loop34;
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
    // InternalGsl.g:1204:1: entryRuleMarriage returns [EObject current=null] : iv_ruleMarriage= ruleMarriage EOF ;
    public final EObject entryRuleMarriage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarriage = null;


        try {
            // InternalGsl.g:1204:49: (iv_ruleMarriage= ruleMarriage EOF )
            // InternalGsl.g:1205:2: iv_ruleMarriage= ruleMarriage EOF
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
    // InternalGsl.g:1211:1: ruleMarriage returns [EObject current=null] : ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
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
            // InternalGsl.g:1217:2: ( ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalGsl.g:1218:2: ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalGsl.g:1218:2: ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalGsl.g:1219:3: () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalGsl.g:1219:3: ()
            // InternalGsl.g:1220:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarriageAccess().getMarriageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMarriageAccess().getMarriageKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getMarriageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGsl.g:1234:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGsl.g:1235:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_41); 

                    				newLeafNode(otherlv_3, grammarAccess.getMarriageAccess().getTypeKeyword_3_0());
                    			
                    // InternalGsl.g:1239:4: ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) )
                    // InternalGsl.g:1240:5: (lv_type_4_0= ruleTypeOfIntimateRelationship )
                    {
                    // InternalGsl.g:1240:5: (lv_type_4_0= ruleTypeOfIntimateRelationship )
                    // InternalGsl.g:1241:6: lv_type_4_0= ruleTypeOfIntimateRelationship
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getTypeTypeOfIntimateRelationshipEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

            // InternalGsl.g:1259:3: (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGsl.g:1260:4: otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_43); 

                    				newLeafNode(otherlv_5, grammarAccess.getMarriageAccess().getSpousesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getMarriageAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalGsl.g:1268:4: ( ( ruleEString ) )
                    // InternalGsl.g:1269:5: ( ruleEString )
                    {
                    // InternalGsl.g:1269:5: ( ruleEString )
                    // InternalGsl.g:1270:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMarriageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMarriageAccess().getSpousesPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_44);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGsl.g:1284:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==17) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalGsl.g:1285:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMarriageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGsl.g:1289:5: ( ( ruleEString ) )
                    	    // InternalGsl.g:1290:6: ( ruleEString )
                    	    {
                    	    // InternalGsl.g:1290:6: ( ruleEString )
                    	    // InternalGsl.g:1291:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMarriageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMarriageAccess().getSpousesPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_44);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,44,FOLLOW_48); 

                    				newLeafNode(otherlv_10, grammarAccess.getMarriageAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGsl.g:1311:3: (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGsl.g:1312:4: otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) )
                    {
                    otherlv_11=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getMarriageAccess().getFromDateKeyword_5_0());
                    			
                    // InternalGsl.g:1316:4: ( (lv_fromDate_12_0= ruleDateX ) )
                    // InternalGsl.g:1317:5: (lv_fromDate_12_0= ruleDateX )
                    {
                    // InternalGsl.g:1317:5: (lv_fromDate_12_0= ruleDateX )
                    // InternalGsl.g:1318:6: lv_fromDate_12_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getFromDateDateXParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_49);
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

            // InternalGsl.g:1336:3: (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==49) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGsl.g:1337:4: otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) )
                    {
                    otherlv_13=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getMarriageAccess().getToDateKeyword_6_0());
                    			
                    // InternalGsl.g:1341:4: ( (lv_toDate_14_0= ruleDateX ) )
                    // InternalGsl.g:1342:5: (lv_toDate_14_0= ruleDateX )
                    {
                    // InternalGsl.g:1342:5: (lv_toDate_14_0= ruleDateX )
                    // InternalGsl.g:1343:6: lv_toDate_14_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getToDateDateXParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalGsl.g:1361:3: (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGsl.g:1362:4: otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getMarriageAccess().getChildrenKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getMarriageAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalGsl.g:1370:4: ( (lv_children_17_0= rulePerson ) )
                    // InternalGsl.g:1371:5: (lv_children_17_0= rulePerson )
                    {
                    // InternalGsl.g:1371:5: (lv_children_17_0= rulePerson )
                    // InternalGsl.g:1372:6: lv_children_17_0= rulePerson
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

                    // InternalGsl.g:1389:4: (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==17) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalGsl.g:1390:5: otherlv_18= ',' ( (lv_children_19_0= rulePerson ) )
                    	    {
                    	    otherlv_18=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getMarriageAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalGsl.g:1394:5: ( (lv_children_19_0= rulePerson ) )
                    	    // InternalGsl.g:1395:6: (lv_children_19_0= rulePerson )
                    	    {
                    	    // InternalGsl.g:1395:6: (lv_children_19_0= rulePerson )
                    	    // InternalGsl.g:1396:7: lv_children_19_0= rulePerson
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
                    	    break loop41;
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
    // InternalGsl.g:1427:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGsl.g:1427:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGsl.g:1428:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalGsl.g:1434:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGsl.g:1440:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGsl.g:1441:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGsl.g:1441:2: (kw= 'true' | kw= 'false' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==50) ) {
                alt43=1;
            }
            else if ( (LA43_0==51) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalGsl.g:1442:3: kw= 'true'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGsl.g:1448:3: kw= 'false'
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
    // InternalGsl.g:1457:1: ruleTypeOfPerson returns [Enumerator current=null] : ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) ) ;
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
            // InternalGsl.g:1463:2: ( ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) ) )
            // InternalGsl.g:1464:2: ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) )
            {
            // InternalGsl.g:1464:2: ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt44=1;
                }
                break;
            case 53:
                {
                alt44=2;
                }
                break;
            case 54:
                {
                alt44=3;
                }
                break;
            case 55:
                {
                alt44=4;
                }
                break;
            case 56:
                {
                alt44=5;
                }
                break;
            case 57:
                {
                alt44=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalGsl.g:1465:3: (enumLiteral_0= 'BIOLOGICAL' )
                    {
                    // InternalGsl.g:1465:3: (enumLiteral_0= 'BIOLOGICAL' )
                    // InternalGsl.g:1466:4: enumLiteral_0= 'BIOLOGICAL'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getBIOLOGICALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfPersonAccess().getBIOLOGICALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:1473:3: (enumLiteral_1= 'ADOPTED' )
                    {
                    // InternalGsl.g:1473:3: (enumLiteral_1= 'ADOPTED' )
                    // InternalGsl.g:1474:4: enumLiteral_1= 'ADOPTED'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getADOPTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfPersonAccess().getADOPTEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGsl.g:1481:3: (enumLiteral_2= 'SEMIADOPTED' )
                    {
                    // InternalGsl.g:1481:3: (enumLiteral_2= 'SEMIADOPTED' )
                    // InternalGsl.g:1482:4: enumLiteral_2= 'SEMIADOPTED'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getSEMIADOPTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeOfPersonAccess().getSEMIADOPTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGsl.g:1489:3: (enumLiteral_3= 'MARRIED' )
                    {
                    // InternalGsl.g:1489:3: (enumLiteral_3= 'MARRIED' )
                    // InternalGsl.g:1490:4: enumLiteral_3= 'MARRIED'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getMARRIEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeOfPersonAccess().getMARRIEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGsl.g:1497:3: (enumLiteral_4= 'DISOWNED' )
                    {
                    // InternalGsl.g:1497:3: (enumLiteral_4= 'DISOWNED' )
                    // InternalGsl.g:1498:4: enumLiteral_4= 'DISOWNED'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getDISOWNEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeOfPersonAccess().getDISOWNEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGsl.g:1505:3: (enumLiteral_5= 'ILLEGITIMATE' )
                    {
                    // InternalGsl.g:1505:3: (enumLiteral_5= 'ILLEGITIMATE' )
                    // InternalGsl.g:1506:4: enumLiteral_5= 'ILLEGITIMATE'
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
    // InternalGsl.g:1516:1: ruleGender returns [Enumerator current=null] : ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) ) ;
    public final Enumerator ruleGender() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGsl.g:1522:2: ( ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) ) )
            // InternalGsl.g:1523:2: ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) )
            {
            // InternalGsl.g:1523:2: ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt45=1;
                }
                break;
            case 59:
                {
                alt45=2;
                }
                break;
            case 60:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalGsl.g:1524:3: (enumLiteral_0= 'MALE' )
                    {
                    // InternalGsl.g:1524:3: (enumLiteral_0= 'MALE' )
                    // InternalGsl.g:1525:4: enumLiteral_0= 'MALE'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getMALEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGenderAccess().getMALEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:1532:3: (enumLiteral_1= 'FEMALE' )
                    {
                    // InternalGsl.g:1532:3: (enumLiteral_1= 'FEMALE' )
                    // InternalGsl.g:1533:4: enumLiteral_1= 'FEMALE'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getFEMALEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGenderAccess().getFEMALEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGsl.g:1540:3: (enumLiteral_2= 'BIGENDER' )
                    {
                    // InternalGsl.g:1540:3: (enumLiteral_2= 'BIGENDER' )
                    // InternalGsl.g:1541:4: enumLiteral_2= 'BIGENDER'
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
    // InternalGsl.g:1551:1: ruleTypeOfIntimateRelationship returns [Enumerator current=null] : ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) ) ;
    public final Enumerator ruleTypeOfIntimateRelationship() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGsl.g:1557:2: ( ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) ) )
            // InternalGsl.g:1558:2: ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) )
            {
            // InternalGsl.g:1558:2: ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt46=1;
                }
                break;
            case 62:
                {
                alt46=2;
                }
                break;
            case 63:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalGsl.g:1559:3: (enumLiteral_0= 'MONOGAMY' )
                    {
                    // InternalGsl.g:1559:3: (enumLiteral_0= 'MONOGAMY' )
                    // InternalGsl.g:1560:4: enumLiteral_0= 'MONOGAMY'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getMONOGAMYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfIntimateRelationshipAccess().getMONOGAMYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:1567:3: (enumLiteral_1= 'POLYGAMY' )
                    {
                    // InternalGsl.g:1567:3: (enumLiteral_1= 'POLYGAMY' )
                    // InternalGsl.g:1568:4: enumLiteral_1= 'POLYGAMY'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYGAMYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYGAMYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGsl.g:1575:3: (enumLiteral_2= 'POLYFIDELITY' )
                    {
                    // InternalGsl.g:1575:3: (enumLiteral_2= 'POLYFIDELITY' )
                    // InternalGsl.g:1576:4: enumLiteral_2= 'POLYFIDELITY'
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000FFF840000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000FFF040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000FFE040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000FFC040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x03F0000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000FF8040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000FF0040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000FE0040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000FC0040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000F80040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000F00040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000E00040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000C00040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000C008000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000240004040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xE000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000240000040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0003A00004040000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0003A00000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0003200000040000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002200000040000L});

}