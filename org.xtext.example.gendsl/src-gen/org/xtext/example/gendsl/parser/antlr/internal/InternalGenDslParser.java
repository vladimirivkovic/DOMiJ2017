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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GenealogyTree'", "'{'", "'familyName'", "'established'", "'person'", "','", "'}'", "'DateX'", "'year'", "'month'", "'day'", "'Person'", "'unknown'", "'givenName'", "'birthPlace'", "'deathPlace'", "'restingPlace'", "'type'", "'gender'", "'otherNames'", "'nickname'", "'deathCause'", "'marriages'", "'('", "')'", "'cohabitations'", "'birthDate'", "'deathDate'", "'personhistory'", "'cohabitation'", "'marriage'", "'-'", "'Marriage'", "'spouses'", "'fromDate'", "'toDate'", "'children'", "'legitimate'", "'Cohabitation'", "'partners'", "'PersonHistory'", "'changed'", "'true'", "'false'", "'EDate'", "'BIOLOGICAL'", "'ADOPTED'", "'SEMIADOPTED'", "'MARRIED'", "'DISOWNED'", "'ILLEGITIMATE'", "'MALE'", "'FEMALE'", "'BIGENDER'", "'MONOGAMY'", "'POLYGAMY'", "'POLYFIDELITY'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
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
    // InternalGenDsl.g:72:1: ruleGenealogyTree returns [EObject current=null] : (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'person' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalGenDsl.g:78:2: ( (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'person' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalGenDsl.g:79:2: (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'person' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalGenDsl.g:79:2: (otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'person' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalGenDsl.g:80:3: otherlv_0= 'GenealogyTree' otherlv_1= '{' otherlv_2= 'familyName' ( (lv_familyName_3_0= ruleEString ) ) (otherlv_4= 'established' ( (lv_established_5_0= ruleDateX ) ) )? (otherlv_6= 'person' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )? otherlv_12= '}'
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
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getGenealogyTreeAccess().getEstablishedKeyword_4_0());
                    			
                    // InternalGenDsl.g:116:4: ( (lv_established_5_0= ruleDateX ) )
                    // InternalGenDsl.g:117:5: (lv_established_5_0= ruleDateX )
                    {
                    // InternalGenDsl.g:117:5: (lv_established_5_0= ruleDateX )
                    // InternalGenDsl.g:118:6: lv_established_5_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getGenealogyTreeAccess().getEstablishedDateXParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

            // InternalGenDsl.g:136:3: (otherlv_6= 'person' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGenDsl.g:137:4: otherlv_6= 'person' otherlv_7= '{' ( (lv_person_8_0= rulePerson ) ) (otherlv_9= ',' ( (lv_person_10_0= rulePerson ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getGenealogyTreeAccess().getPersonKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getGenealogyTreeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGenDsl.g:145:4: ( (lv_person_8_0= rulePerson ) )
                    // InternalGenDsl.g:146:5: (lv_person_8_0= rulePerson )
                    {
                    // InternalGenDsl.g:146:5: (lv_person_8_0= rulePerson )
                    // InternalGenDsl.g:147:6: lv_person_8_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getGenealogyTreeAccess().getPersonPersonParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
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
                    	    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getGenealogyTreeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGenDsl.g:169:5: ( (lv_person_10_0= rulePerson ) )
                    	    // InternalGenDsl.g:170:6: (lv_person_10_0= rulePerson )
                    	    {
                    	    // InternalGenDsl.g:170:6: (lv_person_10_0= rulePerson )
                    	    // InternalGenDsl.g:171:7: lv_person_10_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getGenealogyTreeAccess().getPersonPersonParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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

                    otherlv_11=(Token)match(input,17,FOLLOW_11); 

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
    // InternalGenDsl.g:243:1: ruleDateX returns [EObject current=null] : ( () otherlv_1= 'DateX' otherlv_2= '{' (otherlv_3= 'year' ( (lv_year_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'day' ( (lv_day_8_0= ruleEIntegerObject ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleDateX() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_year_4_0 = null;

        AntlrDatatypeRuleToken lv_month_6_0 = null;

        AntlrDatatypeRuleToken lv_day_8_0 = null;



        	enterRule();

        try {
            // InternalGenDsl.g:249:2: ( ( () otherlv_1= 'DateX' otherlv_2= '{' (otherlv_3= 'year' ( (lv_year_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'day' ( (lv_day_8_0= ruleEIntegerObject ) ) )? otherlv_9= '}' ) )
            // InternalGenDsl.g:250:2: ( () otherlv_1= 'DateX' otherlv_2= '{' (otherlv_3= 'year' ( (lv_year_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'day' ( (lv_day_8_0= ruleEIntegerObject ) ) )? otherlv_9= '}' )
            {
            // InternalGenDsl.g:250:2: ( () otherlv_1= 'DateX' otherlv_2= '{' (otherlv_3= 'year' ( (lv_year_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'day' ( (lv_day_8_0= ruleEIntegerObject ) ) )? otherlv_9= '}' )
            // InternalGenDsl.g:251:3: () otherlv_1= 'DateX' otherlv_2= '{' (otherlv_3= 'year' ( (lv_year_4_0= ruleEIntegerObject ) ) )? (otherlv_5= 'month' ( (lv_month_6_0= ruleEIntegerObject ) ) )? (otherlv_7= 'day' ( (lv_day_8_0= ruleEIntegerObject ) ) )? otherlv_9= '}'
            {
            // InternalGenDsl.g:251:3: ()
            // InternalGenDsl.g:252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateXAccess().getDateXAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDateXAccess().getDateXKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getDateXAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGenDsl.g:266:3: (otherlv_3= 'year' ( (lv_year_4_0= ruleEIntegerObject ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGenDsl.g:267:4: otherlv_3= 'year' ( (lv_year_4_0= ruleEIntegerObject ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getDateXAccess().getYearKeyword_3_0());
                    			
                    // InternalGenDsl.g:271:4: ( (lv_year_4_0= ruleEIntegerObject ) )
                    // InternalGenDsl.g:272:5: (lv_year_4_0= ruleEIntegerObject )
                    {
                    // InternalGenDsl.g:272:5: (lv_year_4_0= ruleEIntegerObject )
                    // InternalGenDsl.g:273:6: lv_year_4_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getYearEIntegerObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_year_4_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateXRule());
                    						}
                    						set(
                    							current,
                    							"year",
                    							lv_year_4_0,
                    							"org.xtext.example.gendsl.GenDsl.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:291:3: (otherlv_5= 'month' ( (lv_month_6_0= ruleEIntegerObject ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGenDsl.g:292:4: otherlv_5= 'month' ( (lv_month_6_0= ruleEIntegerObject ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_5, grammarAccess.getDateXAccess().getMonthKeyword_4_0());
                    			
                    // InternalGenDsl.g:296:4: ( (lv_month_6_0= ruleEIntegerObject ) )
                    // InternalGenDsl.g:297:5: (lv_month_6_0= ruleEIntegerObject )
                    {
                    // InternalGenDsl.g:297:5: (lv_month_6_0= ruleEIntegerObject )
                    // InternalGenDsl.g:298:6: lv_month_6_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getMonthEIntegerObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_month_6_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateXRule());
                    						}
                    						set(
                    							current,
                    							"month",
                    							lv_month_6_0,
                    							"org.xtext.example.gendsl.GenDsl.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:316:3: (otherlv_7= 'day' ( (lv_day_8_0= ruleEIntegerObject ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGenDsl.g:317:4: otherlv_7= 'day' ( (lv_day_8_0= ruleEIntegerObject ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getDateXAccess().getDayKeyword_5_0());
                    			
                    // InternalGenDsl.g:321:4: ( (lv_day_8_0= ruleEIntegerObject ) )
                    // InternalGenDsl.g:322:5: (lv_day_8_0= ruleEIntegerObject )
                    {
                    // InternalGenDsl.g:322:5: (lv_day_8_0= ruleEIntegerObject )
                    // InternalGenDsl.g:323:6: lv_day_8_0= ruleEIntegerObject
                    {

                    						newCompositeNode(grammarAccess.getDateXAccess().getDayEIntegerObjectParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_day_8_0=ruleEIntegerObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDateXRule());
                    						}
                    						set(
                    							current,
                    							"day",
                    							lv_day_8_0,
                    							"org.xtext.example.gendsl.GenDsl.EIntegerObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDateXAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalGenDsl.g:349:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalGenDsl.g:349:47: (iv_rulePerson= rulePerson EOF )
            // InternalGenDsl.g:350:2: iv_rulePerson= rulePerson EOF
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
    // InternalGenDsl.g:356:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' otherlv_1= '{' (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) )? (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) )? (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) )? (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) )? (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) )? (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) )? (otherlv_26= 'marriages' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )? (otherlv_32= 'cohabitations' otherlv_33= '(' ( ( ruleEString ) ) (otherlv_35= ',' ( ( ruleEString ) ) )* otherlv_37= ')' )? (otherlv_38= 'birthDate' ( (lv_birthDate_39_0= ruleDateX ) ) )? (otherlv_40= 'deathDate' ( (lv_deathDate_41_0= ruleDateX ) ) )? (otherlv_42= 'personhistory' otherlv_43= '{' ( (lv_personhistory_44_0= rulePersonHistory ) ) (otherlv_45= ',' ( (lv_personhistory_46_0= rulePersonHistory ) ) )* otherlv_47= '}' )? (otherlv_48= 'cohabitation' otherlv_49= '{' ( (lv_cohabitation_50_0= ruleCohabitation ) ) (otherlv_51= ',' ( (lv_cohabitation_52_0= ruleCohabitation ) ) )* otherlv_53= '}' )? (otherlv_54= 'marriage' otherlv_55= '{' ( (lv_marriage_56_0= ruleMarriage ) ) (otherlv_57= ',' ( (lv_marriage_58_0= ruleMarriage ) ) )* otherlv_59= '}' )? otherlv_60= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
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
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        AntlrDatatypeRuleToken lv_unknown_3_0 = null;

        AntlrDatatypeRuleToken lv_givenName_5_0 = null;

        AntlrDatatypeRuleToken lv_birthPlace_7_0 = null;

        AntlrDatatypeRuleToken lv_deathPlace_9_0 = null;

        AntlrDatatypeRuleToken lv_restingPlace_11_0 = null;

        Enumerator lv_type_13_0 = null;

        Enumerator lv_gender_15_0 = null;

        AntlrDatatypeRuleToken lv_otherNames_18_0 = null;

        AntlrDatatypeRuleToken lv_otherNames_20_0 = null;

        AntlrDatatypeRuleToken lv_nickname_23_0 = null;

        AntlrDatatypeRuleToken lv_deathCause_25_0 = null;

        EObject lv_birthDate_39_0 = null;

        EObject lv_deathDate_41_0 = null;

        EObject lv_personhistory_44_0 = null;

        EObject lv_personhistory_46_0 = null;

        EObject lv_cohabitation_50_0 = null;

        EObject lv_cohabitation_52_0 = null;

        EObject lv_marriage_56_0 = null;

        EObject lv_marriage_58_0 = null;



        	enterRule();

        try {
            // InternalGenDsl.g:362:2: ( (otherlv_0= 'Person' otherlv_1= '{' (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) )? (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) )? (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) )? (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) )? (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) )? (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) )? (otherlv_26= 'marriages' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )? (otherlv_32= 'cohabitations' otherlv_33= '(' ( ( ruleEString ) ) (otherlv_35= ',' ( ( ruleEString ) ) )* otherlv_37= ')' )? (otherlv_38= 'birthDate' ( (lv_birthDate_39_0= ruleDateX ) ) )? (otherlv_40= 'deathDate' ( (lv_deathDate_41_0= ruleDateX ) ) )? (otherlv_42= 'personhistory' otherlv_43= '{' ( (lv_personhistory_44_0= rulePersonHistory ) ) (otherlv_45= ',' ( (lv_personhistory_46_0= rulePersonHistory ) ) )* otherlv_47= '}' )? (otherlv_48= 'cohabitation' otherlv_49= '{' ( (lv_cohabitation_50_0= ruleCohabitation ) ) (otherlv_51= ',' ( (lv_cohabitation_52_0= ruleCohabitation ) ) )* otherlv_53= '}' )? (otherlv_54= 'marriage' otherlv_55= '{' ( (lv_marriage_56_0= ruleMarriage ) ) (otherlv_57= ',' ( (lv_marriage_58_0= ruleMarriage ) ) )* otherlv_59= '}' )? otherlv_60= '}' ) )
            // InternalGenDsl.g:363:2: (otherlv_0= 'Person' otherlv_1= '{' (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) )? (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) )? (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) )? (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) )? (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) )? (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) )? (otherlv_26= 'marriages' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )? (otherlv_32= 'cohabitations' otherlv_33= '(' ( ( ruleEString ) ) (otherlv_35= ',' ( ( ruleEString ) ) )* otherlv_37= ')' )? (otherlv_38= 'birthDate' ( (lv_birthDate_39_0= ruleDateX ) ) )? (otherlv_40= 'deathDate' ( (lv_deathDate_41_0= ruleDateX ) ) )? (otherlv_42= 'personhistory' otherlv_43= '{' ( (lv_personhistory_44_0= rulePersonHistory ) ) (otherlv_45= ',' ( (lv_personhistory_46_0= rulePersonHistory ) ) )* otherlv_47= '}' )? (otherlv_48= 'cohabitation' otherlv_49= '{' ( (lv_cohabitation_50_0= ruleCohabitation ) ) (otherlv_51= ',' ( (lv_cohabitation_52_0= ruleCohabitation ) ) )* otherlv_53= '}' )? (otherlv_54= 'marriage' otherlv_55= '{' ( (lv_marriage_56_0= ruleMarriage ) ) (otherlv_57= ',' ( (lv_marriage_58_0= ruleMarriage ) ) )* otherlv_59= '}' )? otherlv_60= '}' )
            {
            // InternalGenDsl.g:363:2: (otherlv_0= 'Person' otherlv_1= '{' (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) )? (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) )? (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) )? (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) )? (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) )? (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) )? (otherlv_26= 'marriages' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )? (otherlv_32= 'cohabitations' otherlv_33= '(' ( ( ruleEString ) ) (otherlv_35= ',' ( ( ruleEString ) ) )* otherlv_37= ')' )? (otherlv_38= 'birthDate' ( (lv_birthDate_39_0= ruleDateX ) ) )? (otherlv_40= 'deathDate' ( (lv_deathDate_41_0= ruleDateX ) ) )? (otherlv_42= 'personhistory' otherlv_43= '{' ( (lv_personhistory_44_0= rulePersonHistory ) ) (otherlv_45= ',' ( (lv_personhistory_46_0= rulePersonHistory ) ) )* otherlv_47= '}' )? (otherlv_48= 'cohabitation' otherlv_49= '{' ( (lv_cohabitation_50_0= ruleCohabitation ) ) (otherlv_51= ',' ( (lv_cohabitation_52_0= ruleCohabitation ) ) )* otherlv_53= '}' )? (otherlv_54= 'marriage' otherlv_55= '{' ( (lv_marriage_56_0= ruleMarriage ) ) (otherlv_57= ',' ( (lv_marriage_58_0= ruleMarriage ) ) )* otherlv_59= '}' )? otherlv_60= '}' )
            // InternalGenDsl.g:364:3: otherlv_0= 'Person' otherlv_1= '{' (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) ) (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )? (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) )? (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) )? (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) )? (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) )? (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) )? (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' )? (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) )? (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) )? (otherlv_26= 'marriages' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )? (otherlv_32= 'cohabitations' otherlv_33= '(' ( ( ruleEString ) ) (otherlv_35= ',' ( ( ruleEString ) ) )* otherlv_37= ')' )? (otherlv_38= 'birthDate' ( (lv_birthDate_39_0= ruleDateX ) ) )? (otherlv_40= 'deathDate' ( (lv_deathDate_41_0= ruleDateX ) ) )? (otherlv_42= 'personhistory' otherlv_43= '{' ( (lv_personhistory_44_0= rulePersonHistory ) ) (otherlv_45= ',' ( (lv_personhistory_46_0= rulePersonHistory ) ) )* otherlv_47= '}' )? (otherlv_48= 'cohabitation' otherlv_49= '{' ( (lv_cohabitation_50_0= ruleCohabitation ) ) (otherlv_51= ',' ( (lv_cohabitation_52_0= ruleCohabitation ) ) )* otherlv_53= '}' )? (otherlv_54= 'marriage' otherlv_55= '{' ( (lv_marriage_56_0= ruleMarriage ) ) (otherlv_57= ',' ( (lv_marriage_58_0= ruleMarriage ) ) )* otherlv_59= '}' )? otherlv_60= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGenDsl.g:372:3: (otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) ) )
            // InternalGenDsl.g:373:4: otherlv_2= 'unknown' ( (lv_unknown_3_0= ruleEBoolean ) )
            {
            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            				newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getUnknownKeyword_2_0());
            			
            // InternalGenDsl.g:377:4: ( (lv_unknown_3_0= ruleEBoolean ) )
            // InternalGenDsl.g:378:5: (lv_unknown_3_0= ruleEBoolean )
            {
            // InternalGenDsl.g:378:5: (lv_unknown_3_0= ruleEBoolean )
            // InternalGenDsl.g:379:6: lv_unknown_3_0= ruleEBoolean
            {

            						newCompositeNode(grammarAccess.getPersonAccess().getUnknownEBooleanParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_18);
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

            // InternalGenDsl.g:397:3: (otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGenDsl.g:398:4: otherlv_4= 'givenName' ( (lv_givenName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getGivenNameKeyword_3_0());
                    			
                    // InternalGenDsl.g:402:4: ( (lv_givenName_5_0= ruleEString ) )
                    // InternalGenDsl.g:403:5: (lv_givenName_5_0= ruleEString )
                    {
                    // InternalGenDsl.g:403:5: (lv_givenName_5_0= ruleEString )
                    // InternalGenDsl.g:404:6: lv_givenName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getGivenNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_givenName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"givenName",
                    							lv_givenName_5_0,
                    							"org.xtext.example.gendsl.GenDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:422:3: (otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGenDsl.g:423:4: otherlv_6= 'birthPlace' ( (lv_birthPlace_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getBirthPlaceKeyword_4_0());
                    			
                    // InternalGenDsl.g:427:4: ( (lv_birthPlace_7_0= ruleEString ) )
                    // InternalGenDsl.g:428:5: (lv_birthPlace_7_0= ruleEString )
                    {
                    // InternalGenDsl.g:428:5: (lv_birthPlace_7_0= ruleEString )
                    // InternalGenDsl.g:429:6: lv_birthPlace_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getBirthPlaceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_birthPlace_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"birthPlace",
                    							lv_birthPlace_7_0,
                    							"org.xtext.example.gendsl.GenDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:447:3: (otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGenDsl.g:448:4: otherlv_8= 'deathPlace' ( (lv_deathPlace_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getPersonAccess().getDeathPlaceKeyword_5_0());
                    			
                    // InternalGenDsl.g:452:4: ( (lv_deathPlace_9_0= ruleEString ) )
                    // InternalGenDsl.g:453:5: (lv_deathPlace_9_0= ruleEString )
                    {
                    // InternalGenDsl.g:453:5: (lv_deathPlace_9_0= ruleEString )
                    // InternalGenDsl.g:454:6: lv_deathPlace_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getDeathPlaceEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_deathPlace_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"deathPlace",
                    							lv_deathPlace_9_0,
                    							"org.xtext.example.gendsl.GenDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:472:3: (otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalGenDsl.g:473:4: otherlv_10= 'restingPlace' ( (lv_restingPlace_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getPersonAccess().getRestingPlaceKeyword_6_0());
                    			
                    // InternalGenDsl.g:477:4: ( (lv_restingPlace_11_0= ruleEString ) )
                    // InternalGenDsl.g:478:5: (lv_restingPlace_11_0= ruleEString )
                    {
                    // InternalGenDsl.g:478:5: (lv_restingPlace_11_0= ruleEString )
                    // InternalGenDsl.g:479:6: lv_restingPlace_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getRestingPlaceEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_restingPlace_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"restingPlace",
                    							lv_restingPlace_11_0,
                    							"org.xtext.example.gendsl.GenDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:497:3: (otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGenDsl.g:498:4: otherlv_12= 'type' ( (lv_type_13_0= ruleTypeOfPerson ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getPersonAccess().getTypeKeyword_7_0());
                    			
                    // InternalGenDsl.g:502:4: ( (lv_type_13_0= ruleTypeOfPerson ) )
                    // InternalGenDsl.g:503:5: (lv_type_13_0= ruleTypeOfPerson )
                    {
                    // InternalGenDsl.g:503:5: (lv_type_13_0= ruleTypeOfPerson )
                    // InternalGenDsl.g:504:6: lv_type_13_0= ruleTypeOfPerson
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getTypeTypeOfPersonEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_type_13_0=ruleTypeOfPerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_13_0,
                    							"org.xtext.example.gendsl.GenDsl.TypeOfPerson");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:522:3: (otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGenDsl.g:523:4: otherlv_14= 'gender' ( (lv_gender_15_0= ruleGender ) )
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getPersonAccess().getGenderKeyword_8_0());
                    			
                    // InternalGenDsl.g:527:4: ( (lv_gender_15_0= ruleGender ) )
                    // InternalGenDsl.g:528:5: (lv_gender_15_0= ruleGender )
                    {
                    // InternalGenDsl.g:528:5: (lv_gender_15_0= ruleGender )
                    // InternalGenDsl.g:529:6: lv_gender_15_0= ruleGender
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getGenderGenderEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_gender_15_0=ruleGender();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"gender",
                    							lv_gender_15_0,
                    							"org.xtext.example.gendsl.GenDsl.Gender");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:547:3: (otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGenDsl.g:548:4: otherlv_16= 'otherNames' otherlv_17= '{' ( (lv_otherNames_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getPersonAccess().getOtherNamesKeyword_9_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalGenDsl.g:556:4: ( (lv_otherNames_18_0= ruleEString ) )
                    // InternalGenDsl.g:557:5: (lv_otherNames_18_0= ruleEString )
                    {
                    // InternalGenDsl.g:557:5: (lv_otherNames_18_0= ruleEString )
                    // InternalGenDsl.g:558:6: lv_otherNames_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getOtherNamesEStringParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalGenDsl.g:575:4: (otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalGenDsl.g:576:5: otherlv_19= ',' ( (lv_otherNames_20_0= ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getPersonAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalGenDsl.g:580:5: ( (lv_otherNames_20_0= ruleEString ) )
                    	    // InternalGenDsl.g:581:6: (lv_otherNames_20_0= ruleEString )
                    	    {
                    	    // InternalGenDsl.g:581:6: (lv_otherNames_20_0= ruleEString )
                    	    // InternalGenDsl.g:582:7: lv_otherNames_20_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getOtherNamesEStringParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_otherNames_20_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"otherNames",
                    	    								lv_otherNames_20_0,
                    	    								"org.xtext.example.gendsl.GenDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_27); 

                    				newLeafNode(otherlv_21, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalGenDsl.g:605:3: (otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGenDsl.g:606:4: otherlv_22= 'nickname' ( (lv_nickname_23_0= ruleEString ) )
                    {
                    otherlv_22=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_22, grammarAccess.getPersonAccess().getNicknameKeyword_10_0());
                    			
                    // InternalGenDsl.g:610:4: ( (lv_nickname_23_0= ruleEString ) )
                    // InternalGenDsl.g:611:5: (lv_nickname_23_0= ruleEString )
                    {
                    // InternalGenDsl.g:611:5: (lv_nickname_23_0= ruleEString )
                    // InternalGenDsl.g:612:6: lv_nickname_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getNicknameEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_nickname_23_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"nickname",
                    							lv_nickname_23_0,
                    							"org.xtext.example.gendsl.GenDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:630:3: (otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGenDsl.g:631:4: otherlv_24= 'deathCause' ( (lv_deathCause_25_0= ruleEString ) )
                    {
                    otherlv_24=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_24, grammarAccess.getPersonAccess().getDeathCauseKeyword_11_0());
                    			
                    // InternalGenDsl.g:635:4: ( (lv_deathCause_25_0= ruleEString ) )
                    // InternalGenDsl.g:636:5: (lv_deathCause_25_0= ruleEString )
                    {
                    // InternalGenDsl.g:636:5: (lv_deathCause_25_0= ruleEString )
                    // InternalGenDsl.g:637:6: lv_deathCause_25_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getDeathCauseEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_deathCause_25_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"deathCause",
                    							lv_deathCause_25_0,
                    							"org.xtext.example.gendsl.GenDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:655:3: (otherlv_26= 'marriages' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalGenDsl.g:656:4: otherlv_26= 'marriages' otherlv_27= '(' ( ( ruleEString ) ) (otherlv_29= ',' ( ( ruleEString ) ) )* otherlv_31= ')'
                    {
                    otherlv_26=(Token)match(input,33,FOLLOW_30); 

                    				newLeafNode(otherlv_26, grammarAccess.getPersonAccess().getMarriagesKeyword_12_0());
                    			
                    otherlv_27=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_27, grammarAccess.getPersonAccess().getLeftParenthesisKeyword_12_1());
                    			
                    // InternalGenDsl.g:664:4: ( ( ruleEString ) )
                    // InternalGenDsl.g:665:5: ( ruleEString )
                    {
                    // InternalGenDsl.g:665:5: ( ruleEString )
                    // InternalGenDsl.g:666:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPersonAccess().getMarriagesMarriageCrossReference_12_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenDsl.g:680:4: (otherlv_29= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalGenDsl.g:681:5: otherlv_29= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_29=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_29, grammarAccess.getPersonAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalGenDsl.g:685:5: ( ( ruleEString ) )
                    	    // InternalGenDsl.g:686:6: ( ruleEString )
                    	    {
                    	    // InternalGenDsl.g:686:6: ( ruleEString )
                    	    // InternalGenDsl.g:687:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPersonRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getMarriagesMarriageCrossReference_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,35,FOLLOW_32); 

                    				newLeafNode(otherlv_31, grammarAccess.getPersonAccess().getRightParenthesisKeyword_12_4());
                    			

                    }
                    break;

            }

            // InternalGenDsl.g:707:3: (otherlv_32= 'cohabitations' otherlv_33= '(' ( ( ruleEString ) ) (otherlv_35= ',' ( ( ruleEString ) ) )* otherlv_37= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGenDsl.g:708:4: otherlv_32= 'cohabitations' otherlv_33= '(' ( ( ruleEString ) ) (otherlv_35= ',' ( ( ruleEString ) ) )* otherlv_37= ')'
                    {
                    otherlv_32=(Token)match(input,36,FOLLOW_30); 

                    				newLeafNode(otherlv_32, grammarAccess.getPersonAccess().getCohabitationsKeyword_13_0());
                    			
                    otherlv_33=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_33, grammarAccess.getPersonAccess().getLeftParenthesisKeyword_13_1());
                    			
                    // InternalGenDsl.g:716:4: ( ( ruleEString ) )
                    // InternalGenDsl.g:717:5: ( ruleEString )
                    {
                    // InternalGenDsl.g:717:5: ( ruleEString )
                    // InternalGenDsl.g:718:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPersonAccess().getCohabitationsCohabitationCrossReference_13_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenDsl.g:732:4: (otherlv_35= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalGenDsl.g:733:5: otherlv_35= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_35=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_35, grammarAccess.getPersonAccess().getCommaKeyword_13_3_0());
                    	    				
                    	    // InternalGenDsl.g:737:5: ( ( ruleEString ) )
                    	    // InternalGenDsl.g:738:6: ( ruleEString )
                    	    {
                    	    // InternalGenDsl.g:738:6: ( ruleEString )
                    	    // InternalGenDsl.g:739:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPersonRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getCohabitationsCohabitationCrossReference_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_37=(Token)match(input,35,FOLLOW_33); 

                    				newLeafNode(otherlv_37, grammarAccess.getPersonAccess().getRightParenthesisKeyword_13_4());
                    			

                    }
                    break;

            }

            // InternalGenDsl.g:759:3: (otherlv_38= 'birthDate' ( (lv_birthDate_39_0= ruleDateX ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGenDsl.g:760:4: otherlv_38= 'birthDate' ( (lv_birthDate_39_0= ruleDateX ) )
                    {
                    otherlv_38=(Token)match(input,37,FOLLOW_7); 

                    				newLeafNode(otherlv_38, grammarAccess.getPersonAccess().getBirthDateKeyword_14_0());
                    			
                    // InternalGenDsl.g:764:4: ( (lv_birthDate_39_0= ruleDateX ) )
                    // InternalGenDsl.g:765:5: (lv_birthDate_39_0= ruleDateX )
                    {
                    // InternalGenDsl.g:765:5: (lv_birthDate_39_0= ruleDateX )
                    // InternalGenDsl.g:766:6: lv_birthDate_39_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getBirthDateDateXParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_birthDate_39_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"birthDate",
                    							lv_birthDate_39_0,
                    							"org.xtext.example.gendsl.GenDsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:784:3: (otherlv_40= 'deathDate' ( (lv_deathDate_41_0= ruleDateX ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGenDsl.g:785:4: otherlv_40= 'deathDate' ( (lv_deathDate_41_0= ruleDateX ) )
                    {
                    otherlv_40=(Token)match(input,38,FOLLOW_7); 

                    				newLeafNode(otherlv_40, grammarAccess.getPersonAccess().getDeathDateKeyword_15_0());
                    			
                    // InternalGenDsl.g:789:4: ( (lv_deathDate_41_0= ruleDateX ) )
                    // InternalGenDsl.g:790:5: (lv_deathDate_41_0= ruleDateX )
                    {
                    // InternalGenDsl.g:790:5: (lv_deathDate_41_0= ruleDateX )
                    // InternalGenDsl.g:791:6: lv_deathDate_41_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getDeathDateDateXParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_deathDate_41_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						set(
                    							current,
                    							"deathDate",
                    							lv_deathDate_41_0,
                    							"org.xtext.example.gendsl.GenDsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:809:3: (otherlv_42= 'personhistory' otherlv_43= '{' ( (lv_personhistory_44_0= rulePersonHistory ) ) (otherlv_45= ',' ( (lv_personhistory_46_0= rulePersonHistory ) ) )* otherlv_47= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGenDsl.g:810:4: otherlv_42= 'personhistory' otherlv_43= '{' ( (lv_personhistory_44_0= rulePersonHistory ) ) (otherlv_45= ',' ( (lv_personhistory_46_0= rulePersonHistory ) ) )* otherlv_47= '}'
                    {
                    otherlv_42=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_42, grammarAccess.getPersonAccess().getPersonhistoryKeyword_16_0());
                    			
                    otherlv_43=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_43, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalGenDsl.g:818:4: ( (lv_personhistory_44_0= rulePersonHistory ) )
                    // InternalGenDsl.g:819:5: (lv_personhistory_44_0= rulePersonHistory )
                    {
                    // InternalGenDsl.g:819:5: (lv_personhistory_44_0= rulePersonHistory )
                    // InternalGenDsl.g:820:6: lv_personhistory_44_0= rulePersonHistory
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getPersonhistoryPersonHistoryParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalGenDsl.g:837:4: (otherlv_45= ',' ( (lv_personhistory_46_0= rulePersonHistory ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalGenDsl.g:838:5: otherlv_45= ',' ( (lv_personhistory_46_0= rulePersonHistory ) )
                    	    {
                    	    otherlv_45=(Token)match(input,16,FOLLOW_36); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getPersonAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalGenDsl.g:842:5: ( (lv_personhistory_46_0= rulePersonHistory ) )
                    	    // InternalGenDsl.g:843:6: (lv_personhistory_46_0= rulePersonHistory )
                    	    {
                    	    // InternalGenDsl.g:843:6: (lv_personhistory_46_0= rulePersonHistory )
                    	    // InternalGenDsl.g:844:7: lv_personhistory_46_0= rulePersonHistory
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getPersonhistoryPersonHistoryParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_personhistory_46_0=rulePersonHistory();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"personhistory",
                    	    								lv_personhistory_46_0,
                    	    								"org.xtext.example.gendsl.GenDsl.PersonHistory");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,17,FOLLOW_37); 

                    				newLeafNode(otherlv_47, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            // InternalGenDsl.g:867:3: (otherlv_48= 'cohabitation' otherlv_49= '{' ( (lv_cohabitation_50_0= ruleCohabitation ) ) (otherlv_51= ',' ( (lv_cohabitation_52_0= ruleCohabitation ) ) )* otherlv_53= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGenDsl.g:868:4: otherlv_48= 'cohabitation' otherlv_49= '{' ( (lv_cohabitation_50_0= ruleCohabitation ) ) (otherlv_51= ',' ( (lv_cohabitation_52_0= ruleCohabitation ) ) )* otherlv_53= '}'
                    {
                    otherlv_48=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_48, grammarAccess.getPersonAccess().getCohabitationKeyword_17_0());
                    			
                    otherlv_49=(Token)match(input,12,FOLLOW_38); 

                    				newLeafNode(otherlv_49, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_17_1());
                    			
                    // InternalGenDsl.g:876:4: ( (lv_cohabitation_50_0= ruleCohabitation ) )
                    // InternalGenDsl.g:877:5: (lv_cohabitation_50_0= ruleCohabitation )
                    {
                    // InternalGenDsl.g:877:5: (lv_cohabitation_50_0= ruleCohabitation )
                    // InternalGenDsl.g:878:6: lv_cohabitation_50_0= ruleCohabitation
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getCohabitationCohabitationParserRuleCall_17_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalGenDsl.g:895:4: (otherlv_51= ',' ( (lv_cohabitation_52_0= ruleCohabitation ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalGenDsl.g:896:5: otherlv_51= ',' ( (lv_cohabitation_52_0= ruleCohabitation ) )
                    	    {
                    	    otherlv_51=(Token)match(input,16,FOLLOW_38); 

                    	    					newLeafNode(otherlv_51, grammarAccess.getPersonAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalGenDsl.g:900:5: ( (lv_cohabitation_52_0= ruleCohabitation ) )
                    	    // InternalGenDsl.g:901:6: (lv_cohabitation_52_0= ruleCohabitation )
                    	    {
                    	    // InternalGenDsl.g:901:6: (lv_cohabitation_52_0= ruleCohabitation )
                    	    // InternalGenDsl.g:902:7: lv_cohabitation_52_0= ruleCohabitation
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getCohabitationCohabitationParserRuleCall_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_cohabitation_52_0=ruleCohabitation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cohabitation",
                    	    								lv_cohabitation_52_0,
                    	    								"org.xtext.example.gendsl.GenDsl.Cohabitation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_53=(Token)match(input,17,FOLLOW_39); 

                    				newLeafNode(otherlv_53, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_17_4());
                    			

                    }
                    break;

            }

            // InternalGenDsl.g:925:3: (otherlv_54= 'marriage' otherlv_55= '{' ( (lv_marriage_56_0= ruleMarriage ) ) (otherlv_57= ',' ( (lv_marriage_58_0= ruleMarriage ) ) )* otherlv_59= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGenDsl.g:926:4: otherlv_54= 'marriage' otherlv_55= '{' ( (lv_marriage_56_0= ruleMarriage ) ) (otherlv_57= ',' ( (lv_marriage_58_0= ruleMarriage ) ) )* otherlv_59= '}'
                    {
                    otherlv_54=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_54, grammarAccess.getPersonAccess().getMarriageKeyword_18_0());
                    			
                    otherlv_55=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_55, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_18_1());
                    			
                    // InternalGenDsl.g:934:4: ( (lv_marriage_56_0= ruleMarriage ) )
                    // InternalGenDsl.g:935:5: (lv_marriage_56_0= ruleMarriage )
                    {
                    // InternalGenDsl.g:935:5: (lv_marriage_56_0= ruleMarriage )
                    // InternalGenDsl.g:936:6: lv_marriage_56_0= ruleMarriage
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getMarriageMarriageParserRuleCall_18_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalGenDsl.g:953:4: (otherlv_57= ',' ( (lv_marriage_58_0= ruleMarriage ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==16) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalGenDsl.g:954:5: otherlv_57= ',' ( (lv_marriage_58_0= ruleMarriage ) )
                    	    {
                    	    otherlv_57=(Token)match(input,16,FOLLOW_40); 

                    	    					newLeafNode(otherlv_57, grammarAccess.getPersonAccess().getCommaKeyword_18_3_0());
                    	    				
                    	    // InternalGenDsl.g:958:5: ( (lv_marriage_58_0= ruleMarriage ) )
                    	    // InternalGenDsl.g:959:6: (lv_marriage_58_0= ruleMarriage )
                    	    {
                    	    // InternalGenDsl.g:959:6: (lv_marriage_58_0= ruleMarriage )
                    	    // InternalGenDsl.g:960:7: lv_marriage_58_0= ruleMarriage
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getMarriageMarriageParserRuleCall_18_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_marriage_58_0=ruleMarriage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"marriage",
                    	    								lv_marriage_58_0,
                    	    								"org.xtext.example.gendsl.GenDsl.Marriage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_59=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_59, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_18_4());
                    			

                    }
                    break;

            }

            otherlv_60=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_60, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_19());
            		

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
    // InternalGenDsl.g:991:1: entryRuleEIntegerObject returns [String current=null] : iv_ruleEIntegerObject= ruleEIntegerObject EOF ;
    public final String entryRuleEIntegerObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEIntegerObject = null;


        try {
            // InternalGenDsl.g:991:54: (iv_ruleEIntegerObject= ruleEIntegerObject EOF )
            // InternalGenDsl.g:992:2: iv_ruleEIntegerObject= ruleEIntegerObject EOF
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
    // InternalGenDsl.g:998:1: ruleEIntegerObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEIntegerObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1004:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGenDsl.g:1005:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGenDsl.g:1005:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGenDsl.g:1006:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGenDsl.g:1006:3: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGenDsl.g:1007:4: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_41); 

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
    // InternalGenDsl.g:1024:1: entryRuleMarriage returns [EObject current=null] : iv_ruleMarriage= ruleMarriage EOF ;
    public final EObject entryRuleMarriage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarriage = null;


        try {
            // InternalGenDsl.g:1024:49: (iv_ruleMarriage= ruleMarriage EOF )
            // InternalGenDsl.g:1025:2: iv_ruleMarriage= ruleMarriage EOF
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
    // InternalGenDsl.g:1031:1: ruleMarriage returns [EObject current=null] : ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
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
            // InternalGenDsl.g:1037:2: ( ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalGenDsl.g:1038:2: ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalGenDsl.g:1038:2: ( () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalGenDsl.g:1039:3: () otherlv_1= 'Marriage' otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )? (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )? (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalGenDsl.g:1039:3: ()
            // InternalGenDsl.g:1040:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMarriageAccess().getMarriageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMarriageAccess().getMarriageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getMarriageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGenDsl.g:1054:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGenDsl.g:1055:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_43); 

                    				newLeafNode(otherlv_3, grammarAccess.getMarriageAccess().getTypeKeyword_3_0());
                    			
                    // InternalGenDsl.g:1059:4: ( (lv_type_4_0= ruleTypeOfIntimateRelationship ) )
                    // InternalGenDsl.g:1060:5: (lv_type_4_0= ruleTypeOfIntimateRelationship )
                    {
                    // InternalGenDsl.g:1060:5: (lv_type_4_0= ruleTypeOfIntimateRelationship )
                    // InternalGenDsl.g:1061:6: lv_type_4_0= ruleTypeOfIntimateRelationship
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getTypeTypeOfIntimateRelationshipEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_type_4_0=ruleTypeOfIntimateRelationship();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.example.gendsl.GenDsl.TypeOfIntimateRelationship");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:1079:3: (otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGenDsl.g:1080:4: otherlv_5= 'spouses' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getMarriageAccess().getSpousesKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getMarriageAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalGenDsl.g:1088:4: ( ( ruleEString ) )
                    // InternalGenDsl.g:1089:5: ( ruleEString )
                    {
                    // InternalGenDsl.g:1089:5: ( ruleEString )
                    // InternalGenDsl.g:1090:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMarriageRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMarriageAccess().getSpousesPersonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenDsl.g:1104:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==16) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalGenDsl.g:1105:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMarriageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGenDsl.g:1109:5: ( ( ruleEString ) )
                    	    // InternalGenDsl.g:1110:6: ( ruleEString )
                    	    {
                    	    // InternalGenDsl.g:1110:6: ( ruleEString )
                    	    // InternalGenDsl.g:1111:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMarriageRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMarriageAccess().getSpousesPersonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
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

                    otherlv_10=(Token)match(input,35,FOLLOW_45); 

                    				newLeafNode(otherlv_10, grammarAccess.getMarriageAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGenDsl.g:1131:3: (otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGenDsl.g:1132:4: otherlv_11= 'fromDate' ( (lv_fromDate_12_0= ruleDateX ) )
                    {
                    otherlv_11=(Token)match(input,45,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getMarriageAccess().getFromDateKeyword_5_0());
                    			
                    // InternalGenDsl.g:1136:4: ( (lv_fromDate_12_0= ruleDateX ) )
                    // InternalGenDsl.g:1137:5: (lv_fromDate_12_0= ruleDateX )
                    {
                    // InternalGenDsl.g:1137:5: (lv_fromDate_12_0= ruleDateX )
                    // InternalGenDsl.g:1138:6: lv_fromDate_12_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getFromDateDateXParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_fromDate_12_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"fromDate",
                    							lv_fromDate_12_0,
                    							"org.xtext.example.gendsl.GenDsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:1156:3: (otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGenDsl.g:1157:4: otherlv_13= 'toDate' ( (lv_toDate_14_0= ruleDateX ) )
                    {
                    otherlv_13=(Token)match(input,46,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getMarriageAccess().getToDateKeyword_6_0());
                    			
                    // InternalGenDsl.g:1161:4: ( (lv_toDate_14_0= ruleDateX ) )
                    // InternalGenDsl.g:1162:5: (lv_toDate_14_0= ruleDateX )
                    {
                    // InternalGenDsl.g:1162:5: (lv_toDate_14_0= ruleDateX )
                    // InternalGenDsl.g:1163:6: lv_toDate_14_0= ruleDateX
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getToDateDateXParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_toDate_14_0=ruleDateX();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						set(
                    							current,
                    							"toDate",
                    							lv_toDate_14_0,
                    							"org.xtext.example.gendsl.GenDsl.DateX");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGenDsl.g:1181:3: (otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGenDsl.g:1182:4: otherlv_15= 'children' otherlv_16= '{' ( (lv_children_17_0= rulePerson ) ) (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getMarriageAccess().getChildrenKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getMarriageAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalGenDsl.g:1190:4: ( (lv_children_17_0= rulePerson ) )
                    // InternalGenDsl.g:1191:5: (lv_children_17_0= rulePerson )
                    {
                    // InternalGenDsl.g:1191:5: (lv_children_17_0= rulePerson )
                    // InternalGenDsl.g:1192:6: lv_children_17_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getMarriageAccess().getChildrenPersonParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_children_17_0=rulePerson();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMarriageRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_17_0,
                    							"org.xtext.example.gendsl.GenDsl.Person");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenDsl.g:1209:4: (otherlv_18= ',' ( (lv_children_19_0= rulePerson ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==16) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalGenDsl.g:1210:5: otherlv_18= ',' ( (lv_children_19_0= rulePerson ) )
                    	    {
                    	    otherlv_18=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getMarriageAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalGenDsl.g:1214:5: ( (lv_children_19_0= rulePerson ) )
                    	    // InternalGenDsl.g:1215:6: (lv_children_19_0= rulePerson )
                    	    {
                    	    // InternalGenDsl.g:1215:6: (lv_children_19_0= rulePerson )
                    	    // InternalGenDsl.g:1216:7: lv_children_19_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getMarriageAccess().getChildrenPersonParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_children_19_0=rulePerson();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMarriageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_19_0,
                    	    								"org.xtext.example.gendsl.GenDsl.Person");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getMarriageAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,17,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCohabitation"
    // InternalGenDsl.g:1247:1: entryRuleCohabitation returns [EObject current=null] : iv_ruleCohabitation= ruleCohabitation EOF ;
    public final EObject entryRuleCohabitation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCohabitation = null;


        try {
            // InternalGenDsl.g:1247:53: (iv_ruleCohabitation= ruleCohabitation EOF )
            // InternalGenDsl.g:1248:2: iv_ruleCohabitation= ruleCohabitation EOF
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
    // InternalGenDsl.g:1254:1: ruleCohabitation returns [EObject current=null] : ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalGenDsl.g:1260:2: ( ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalGenDsl.g:1261:2: ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalGenDsl.g:1261:2: ( () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalGenDsl.g:1262:3: () ( (lv_legitimate_1_0= 'legitimate' ) )? otherlv_2= 'Cohabitation' otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )? (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalGenDsl.g:1262:3: ()
            // InternalGenDsl.g:1263:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCohabitationAccess().getCohabitationAction_0(),
            					current);
            			

            }

            // InternalGenDsl.g:1269:3: ( (lv_legitimate_1_0= 'legitimate' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGenDsl.g:1270:4: (lv_legitimate_1_0= 'legitimate' )
                    {
                    // InternalGenDsl.g:1270:4: (lv_legitimate_1_0= 'legitimate' )
                    // InternalGenDsl.g:1271:5: lv_legitimate_1_0= 'legitimate'
                    {
                    lv_legitimate_1_0=(Token)match(input,48,FOLLOW_48); 

                    					newLeafNode(lv_legitimate_1_0, grammarAccess.getCohabitationAccess().getLegitimateLegitimateKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCohabitationRule());
                    					}
                    					setWithLastConsumed(current, "legitimate", true, "legitimate");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCohabitationAccess().getCohabitationKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getCohabitationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGenDsl.g:1291:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGenDsl.g:1292:4: otherlv_4= 'type' ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getCohabitationAccess().getTypeKeyword_4_0());
                    			
                    // InternalGenDsl.g:1296:4: ( (lv_type_5_0= ruleTypeOfIntimateRelationship ) )
                    // InternalGenDsl.g:1297:5: (lv_type_5_0= ruleTypeOfIntimateRelationship )
                    {
                    // InternalGenDsl.g:1297:5: (lv_type_5_0= ruleTypeOfIntimateRelationship )
                    // InternalGenDsl.g:1298:6: lv_type_5_0= ruleTypeOfIntimateRelationship
                    {

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getTypeTypeOfIntimateRelationshipEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_50);
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

            // InternalGenDsl.g:1316:3: (otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGenDsl.g:1317:4: otherlv_6= 'partners' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getCohabitationAccess().getPartnersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getCohabitationAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalGenDsl.g:1325:4: ( ( ruleEString ) )
                    // InternalGenDsl.g:1326:5: ( ruleEString )
                    {
                    // InternalGenDsl.g:1326:5: ( ruleEString )
                    // InternalGenDsl.g:1327:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCohabitationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getPartnersPersonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGenDsl.g:1341:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==16) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalGenDsl.g:1342:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCohabitationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGenDsl.g:1346:5: ( ( ruleEString ) )
                    	    // InternalGenDsl.g:1347:6: ( ruleEString )
                    	    {
                    	    // InternalGenDsl.g:1347:6: ( ruleEString )
                    	    // InternalGenDsl.g:1348:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCohabitationRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCohabitationAccess().getPartnersPersonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,35,FOLLOW_47); 

                    				newLeafNode(otherlv_11, grammarAccess.getCohabitationAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGenDsl.g:1368:3: (otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGenDsl.g:1369:4: otherlv_12= 'children' otherlv_13= '{' ( (lv_children_14_0= rulePerson ) ) (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getCohabitationAccess().getChildrenKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getCohabitationAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGenDsl.g:1377:4: ( (lv_children_14_0= rulePerson ) )
                    // InternalGenDsl.g:1378:5: (lv_children_14_0= rulePerson )
                    {
                    // InternalGenDsl.g:1378:5: (lv_children_14_0= rulePerson )
                    // InternalGenDsl.g:1379:6: lv_children_14_0= rulePerson
                    {

                    						newCompositeNode(grammarAccess.getCohabitationAccess().getChildrenPersonParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalGenDsl.g:1396:4: (otherlv_15= ',' ( (lv_children_16_0= rulePerson ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==16) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalGenDsl.g:1397:5: otherlv_15= ',' ( (lv_children_16_0= rulePerson ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getCohabitationAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGenDsl.g:1401:5: ( (lv_children_16_0= rulePerson ) )
                    	    // InternalGenDsl.g:1402:6: (lv_children_16_0= rulePerson )
                    	    {
                    	    // InternalGenDsl.g:1402:6: (lv_children_16_0= rulePerson )
                    	    // InternalGenDsl.g:1403:7: lv_children_16_0= rulePerson
                    	    {

                    	    							newCompositeNode(grammarAccess.getCohabitationAccess().getChildrenPersonParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_11); 

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
    // InternalGenDsl.g:1434:1: entryRulePersonHistory returns [EObject current=null] : iv_rulePersonHistory= rulePersonHistory EOF ;
    public final EObject entryRulePersonHistory() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonHistory = null;


        try {
            // InternalGenDsl.g:1434:54: (iv_rulePersonHistory= rulePersonHistory EOF )
            // InternalGenDsl.g:1435:2: iv_rulePersonHistory= rulePersonHistory EOF
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
    // InternalGenDsl.g:1441:1: rulePersonHistory returns [EObject current=null] : ( () otherlv_1= 'PersonHistory' otherlv_2= '{' (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )? (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )? (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )? otherlv_9= '}' ) ;
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
            // InternalGenDsl.g:1447:2: ( ( () otherlv_1= 'PersonHistory' otherlv_2= '{' (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )? (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )? (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )? otherlv_9= '}' ) )
            // InternalGenDsl.g:1448:2: ( () otherlv_1= 'PersonHistory' otherlv_2= '{' (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )? (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )? (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )? otherlv_9= '}' )
            {
            // InternalGenDsl.g:1448:2: ( () otherlv_1= 'PersonHistory' otherlv_2= '{' (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )? (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )? (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )? otherlv_9= '}' )
            // InternalGenDsl.g:1449:3: () otherlv_1= 'PersonHistory' otherlv_2= '{' (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )? (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )? (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )? otherlv_9= '}'
            {
            // InternalGenDsl.g:1449:3: ()
            // InternalGenDsl.g:1450:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonHistoryAccess().getPersonHistoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonHistoryAccess().getPersonHistoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonHistoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGenDsl.g:1464:3: (otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==29) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGenDsl.g:1465:4: otherlv_3= 'gender' ( (lv_gender_4_0= ruleGender ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonHistoryAccess().getGenderKeyword_3_0());
                    			
                    // InternalGenDsl.g:1469:4: ( (lv_gender_4_0= ruleGender ) )
                    // InternalGenDsl.g:1470:5: (lv_gender_4_0= ruleGender )
                    {
                    // InternalGenDsl.g:1470:5: (lv_gender_4_0= ruleGender )
                    // InternalGenDsl.g:1471:6: lv_gender_4_0= ruleGender
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getGenderGenderEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_52);
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

            // InternalGenDsl.g:1489:3: (otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==24) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGenDsl.g:1490:4: otherlv_5= 'givenName' ( (lv_givenName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonHistoryAccess().getGivenNameKeyword_4_0());
                    			
                    // InternalGenDsl.g:1494:4: ( (lv_givenName_6_0= ruleEString ) )
                    // InternalGenDsl.g:1495:5: (lv_givenName_6_0= ruleEString )
                    {
                    // InternalGenDsl.g:1495:5: (lv_givenName_6_0= ruleEString )
                    // InternalGenDsl.g:1496:6: lv_givenName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getGivenNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalGenDsl.g:1514:3: (otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGenDsl.g:1515:4: otherlv_7= 'changed' ( (lv_changed_8_0= ruleEDate ) )
                    {
                    otherlv_7=(Token)match(input,52,FOLLOW_54); 

                    				newLeafNode(otherlv_7, grammarAccess.getPersonHistoryAccess().getChangedKeyword_5_0());
                    			
                    // InternalGenDsl.g:1519:4: ( (lv_changed_8_0= ruleEDate ) )
                    // InternalGenDsl.g:1520:5: (lv_changed_8_0= ruleEDate )
                    {
                    // InternalGenDsl.g:1520:5: (lv_changed_8_0= ruleEDate )
                    // InternalGenDsl.g:1521:6: lv_changed_8_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getPersonHistoryAccess().getChangedEDateParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
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
    // InternalGenDsl.g:1547:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGenDsl.g:1547:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGenDsl.g:1548:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalGenDsl.g:1554:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1560:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGenDsl.g:1561:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGenDsl.g:1561:2: (kw= 'true' | kw= 'false' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            else if ( (LA47_0==54) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalGenDsl.g:1562:3: kw= 'true'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGenDsl.g:1568:3: kw= 'false'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

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
    // InternalGenDsl.g:1577:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalGenDsl.g:1577:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalGenDsl.g:1578:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalGenDsl.g:1584:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1590:2: (kw= 'EDate' )
            // InternalGenDsl.g:1591:2: kw= 'EDate'
            {
            kw=(Token)match(input,55,FOLLOW_2); 

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
    // InternalGenDsl.g:1599:1: ruleTypeOfPerson returns [Enumerator current=null] : ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) ) ;
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
            // InternalGenDsl.g:1605:2: ( ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) ) )
            // InternalGenDsl.g:1606:2: ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) )
            {
            // InternalGenDsl.g:1606:2: ( (enumLiteral_0= 'BIOLOGICAL' ) | (enumLiteral_1= 'ADOPTED' ) | (enumLiteral_2= 'SEMIADOPTED' ) | (enumLiteral_3= 'MARRIED' ) | (enumLiteral_4= 'DISOWNED' ) | (enumLiteral_5= 'ILLEGITIMATE' ) )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt48=1;
                }
                break;
            case 57:
                {
                alt48=2;
                }
                break;
            case 58:
                {
                alt48=3;
                }
                break;
            case 59:
                {
                alt48=4;
                }
                break;
            case 60:
                {
                alt48=5;
                }
                break;
            case 61:
                {
                alt48=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalGenDsl.g:1607:3: (enumLiteral_0= 'BIOLOGICAL' )
                    {
                    // InternalGenDsl.g:1607:3: (enumLiteral_0= 'BIOLOGICAL' )
                    // InternalGenDsl.g:1608:4: enumLiteral_0= 'BIOLOGICAL'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getBIOLOGICALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfPersonAccess().getBIOLOGICALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenDsl.g:1615:3: (enumLiteral_1= 'ADOPTED' )
                    {
                    // InternalGenDsl.g:1615:3: (enumLiteral_1= 'ADOPTED' )
                    // InternalGenDsl.g:1616:4: enumLiteral_1= 'ADOPTED'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getADOPTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfPersonAccess().getADOPTEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenDsl.g:1623:3: (enumLiteral_2= 'SEMIADOPTED' )
                    {
                    // InternalGenDsl.g:1623:3: (enumLiteral_2= 'SEMIADOPTED' )
                    // InternalGenDsl.g:1624:4: enumLiteral_2= 'SEMIADOPTED'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getSEMIADOPTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeOfPersonAccess().getSEMIADOPTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGenDsl.g:1631:3: (enumLiteral_3= 'MARRIED' )
                    {
                    // InternalGenDsl.g:1631:3: (enumLiteral_3= 'MARRIED' )
                    // InternalGenDsl.g:1632:4: enumLiteral_3= 'MARRIED'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getMARRIEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeOfPersonAccess().getMARRIEDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGenDsl.g:1639:3: (enumLiteral_4= 'DISOWNED' )
                    {
                    // InternalGenDsl.g:1639:3: (enumLiteral_4= 'DISOWNED' )
                    // InternalGenDsl.g:1640:4: enumLiteral_4= 'DISOWNED'
                    {
                    enumLiteral_4=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfPersonAccess().getDISOWNEDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeOfPersonAccess().getDISOWNEDEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGenDsl.g:1647:3: (enumLiteral_5= 'ILLEGITIMATE' )
                    {
                    // InternalGenDsl.g:1647:3: (enumLiteral_5= 'ILLEGITIMATE' )
                    // InternalGenDsl.g:1648:4: enumLiteral_5= 'ILLEGITIMATE'
                    {
                    enumLiteral_5=(Token)match(input,61,FOLLOW_2); 

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
    // InternalGenDsl.g:1658:1: ruleGender returns [Enumerator current=null] : ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) ) ;
    public final Enumerator ruleGender() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1664:2: ( ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) ) )
            // InternalGenDsl.g:1665:2: ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) )
            {
            // InternalGenDsl.g:1665:2: ( (enumLiteral_0= 'MALE' ) | (enumLiteral_1= 'FEMALE' ) | (enumLiteral_2= 'BIGENDER' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt49=1;
                }
                break;
            case 63:
                {
                alt49=2;
                }
                break;
            case 64:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalGenDsl.g:1666:3: (enumLiteral_0= 'MALE' )
                    {
                    // InternalGenDsl.g:1666:3: (enumLiteral_0= 'MALE' )
                    // InternalGenDsl.g:1667:4: enumLiteral_0= 'MALE'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getMALEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGenderAccess().getMALEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenDsl.g:1674:3: (enumLiteral_1= 'FEMALE' )
                    {
                    // InternalGenDsl.g:1674:3: (enumLiteral_1= 'FEMALE' )
                    // InternalGenDsl.g:1675:4: enumLiteral_1= 'FEMALE'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getGenderAccess().getFEMALEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGenderAccess().getFEMALEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenDsl.g:1682:3: (enumLiteral_2= 'BIGENDER' )
                    {
                    // InternalGenDsl.g:1682:3: (enumLiteral_2= 'BIGENDER' )
                    // InternalGenDsl.g:1683:4: enumLiteral_2= 'BIGENDER'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

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
    // InternalGenDsl.g:1693:1: ruleTypeOfIntimateRelationship returns [Enumerator current=null] : ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) ) ;
    public final Enumerator ruleTypeOfIntimateRelationship() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGenDsl.g:1699:2: ( ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) ) )
            // InternalGenDsl.g:1700:2: ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) )
            {
            // InternalGenDsl.g:1700:2: ( (enumLiteral_0= 'MONOGAMY' ) | (enumLiteral_1= 'POLYGAMY' ) | (enumLiteral_2= 'POLYFIDELITY' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt50=1;
                }
                break;
            case 66:
                {
                alt50=2;
                }
                break;
            case 67:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalGenDsl.g:1701:3: (enumLiteral_0= 'MONOGAMY' )
                    {
                    // InternalGenDsl.g:1701:3: (enumLiteral_0= 'MONOGAMY' )
                    // InternalGenDsl.g:1702:4: enumLiteral_0= 'MONOGAMY'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getMONOGAMYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfIntimateRelationshipAccess().getMONOGAMYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGenDsl.g:1709:3: (enumLiteral_1= 'POLYGAMY' )
                    {
                    // InternalGenDsl.g:1709:3: (enumLiteral_1= 'POLYGAMY' )
                    // InternalGenDsl.g:1710:4: enumLiteral_1= 'POLYGAMY'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYGAMYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfIntimateRelationshipAccess().getPOLYGAMYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGenDsl.g:1717:3: (enumLiteral_2= 'POLYFIDELITY' )
                    {
                    // InternalGenDsl.g:1717:3: (enumLiteral_2= 'POLYFIDELITY' )
                    // InternalGenDsl.g:1718:4: enumLiteral_2= 'POLYFIDELITY'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000002C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003A0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000320000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000003F3FF020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000003F3FE020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000003F3FC020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000003F3F8020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000003F3F0020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x3F00000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000003F3E0020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000003F3C0020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000003F380020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000003F300020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003F200020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000003F000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000003E000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000003C000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000038000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000030000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000F00010020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000F00000020000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000E00000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000C00000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004800010020000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004800000020000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000021020000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000001020000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000020000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000000000000L});

}