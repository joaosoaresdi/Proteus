package org.xtext.parser.antlr.internal;

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
import org.xtext.services.AgenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAgenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_CODE_BOX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RunConfiguration'", "'{'", "'CoordinatorLocation'", "'='", "';'", "'}'", "'Node'", "'('", "'firstAttachPoint'", "'location'", "'logData'", "')'", "'Logging'", "'extraData'", "'stateBasedVariables'", "'Syncpoint'", "'type'", "'onFailure'", "'faultCond'", "'Fault'", "'pointcut'", "'ExecParams'", "'where'", "'whenToExecute{'", "'whatToExecute{'", "'repeatExecution'", "'skipExecution'", "'alterPacketFault'", "','", "'leakFault'", "'bigPacketFault'", "'exit'", "'sleep'", "'cpuLoader'", "'BlockID'", "'CodeBlock'", "'imports'", "'code'", "'FaultCond'", "'whenToIncrement{'", "'ifCondition'", "'syncpoint'", "'random'", "'betweenSeconds'", "'betweenRound'", "'randomBetweenRound'", "'CondID'", "'Condition'", "'whereToExecute'", "'continue'", "'retry'", "'onetime'", "'recurrent'", "'zero'", "'Before'", "'After'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int RULE_CODE_BOX=7;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


        public InternalAgenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAgenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAgenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAgen.g"; }



     	private AgenGrammarAccess grammarAccess;

        public InternalAgenParser(TokenStream input, AgenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AgenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAgen.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAgen.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalAgen.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAgen.g:72:1: ruleModel returns [EObject current=null] : ( (lv_types_0_0= ruleTypes ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:78:2: ( ( (lv_types_0_0= ruleTypes ) )* )
            // InternalAgen.g:79:2: ( (lv_types_0_0= ruleTypes ) )*
            {
            // InternalAgen.g:79:2: ( (lv_types_0_0= ruleTypes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==24||LA1_0==27||LA1_0==31||(LA1_0>=46 && LA1_0<=47)||LA1_0==50||(LA1_0>=58 && LA1_0<=60)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAgen.g:80:3: (lv_types_0_0= ruleTypes )
            	    {
            	    // InternalAgen.g:80:3: (lv_types_0_0= ruleTypes )
            	    // InternalAgen.g:81:4: lv_types_0_0= ruleTypes
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getTypesTypesParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_types_0_0=ruleTypes();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"types",
            	    					lv_types_0_0,
            	    					"org.xtext.Agen.Types");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypes"
    // InternalAgen.g:101:1: entryRuleTypes returns [EObject current=null] : iv_ruleTypes= ruleTypes EOF ;
    public final EObject entryRuleTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypes = null;


        try {
            // InternalAgen.g:101:46: (iv_ruleTypes= ruleTypes EOF )
            // InternalAgen.g:102:2: iv_ruleTypes= ruleTypes EOF
            {
             newCompositeNode(grammarAccess.getTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypes=ruleTypes();

            state._fsp--;

             current =iv_ruleTypes; 
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
    // $ANTLR end "entryRuleTypes"


    // $ANTLR start "ruleTypes"
    // InternalAgen.g:108:1: ruleTypes returns [EObject current=null] : (this_RunConfiguration_0= ruleRunConfiguration | this_Fault_1= ruleFault | this_FaultCond_2= ruleFaultCond | this_Where_3= ruleWhere | this_CodeBlock_4= ruleCodeBlock | this_Condition_5= ruleCondition | this_Syncpoint_6= ruleSyncpoint | this_Log_7= ruleLog ) ;
    public final EObject ruleTypes() throws RecognitionException {
        EObject current = null;

        EObject this_RunConfiguration_0 = null;

        EObject this_Fault_1 = null;

        EObject this_FaultCond_2 = null;

        EObject this_Where_3 = null;

        EObject this_CodeBlock_4 = null;

        EObject this_Condition_5 = null;

        EObject this_Syncpoint_6 = null;

        EObject this_Log_7 = null;



        	enterRule();

        try {
            // InternalAgen.g:114:2: ( (this_RunConfiguration_0= ruleRunConfiguration | this_Fault_1= ruleFault | this_FaultCond_2= ruleFaultCond | this_Where_3= ruleWhere | this_CodeBlock_4= ruleCodeBlock | this_Condition_5= ruleCondition | this_Syncpoint_6= ruleSyncpoint | this_Log_7= ruleLog ) )
            // InternalAgen.g:115:2: (this_RunConfiguration_0= ruleRunConfiguration | this_Fault_1= ruleFault | this_FaultCond_2= ruleFaultCond | this_Where_3= ruleWhere | this_CodeBlock_4= ruleCodeBlock | this_Condition_5= ruleCondition | this_Syncpoint_6= ruleSyncpoint | this_Log_7= ruleLog )
            {
            // InternalAgen.g:115:2: (this_RunConfiguration_0= ruleRunConfiguration | this_Fault_1= ruleFault | this_FaultCond_2= ruleFaultCond | this_Where_3= ruleWhere | this_CodeBlock_4= ruleCodeBlock | this_Condition_5= ruleCondition | this_Syncpoint_6= ruleSyncpoint | this_Log_7= ruleLog )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 50:
                {
                alt2=3;
                }
                break;
            case 60:
                {
                alt2=4;
                }
                break;
            case 46:
            case 47:
                {
                alt2=5;
                }
                break;
            case 58:
            case 59:
                {
                alt2=6;
                }
                break;
            case 27:
                {
                alt2=7;
                }
                break;
            case 24:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAgen.g:116:3: this_RunConfiguration_0= ruleRunConfiguration
                    {

                    			newCompositeNode(grammarAccess.getTypesAccess().getRunConfigurationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RunConfiguration_0=ruleRunConfiguration();

                    state._fsp--;


                    			current = this_RunConfiguration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAgen.g:125:3: this_Fault_1= ruleFault
                    {

                    			newCompositeNode(grammarAccess.getTypesAccess().getFaultParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fault_1=ruleFault();

                    state._fsp--;


                    			current = this_Fault_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAgen.g:134:3: this_FaultCond_2= ruleFaultCond
                    {

                    			newCompositeNode(grammarAccess.getTypesAccess().getFaultCondParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FaultCond_2=ruleFaultCond();

                    state._fsp--;


                    			current = this_FaultCond_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAgen.g:143:3: this_Where_3= ruleWhere
                    {

                    			newCompositeNode(grammarAccess.getTypesAccess().getWhereParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Where_3=ruleWhere();

                    state._fsp--;


                    			current = this_Where_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAgen.g:152:3: this_CodeBlock_4= ruleCodeBlock
                    {

                    			newCompositeNode(grammarAccess.getTypesAccess().getCodeBlockParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CodeBlock_4=ruleCodeBlock();

                    state._fsp--;


                    			current = this_CodeBlock_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAgen.g:161:3: this_Condition_5= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getTypesAccess().getConditionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_5=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAgen.g:170:3: this_Syncpoint_6= ruleSyncpoint
                    {

                    			newCompositeNode(grammarAccess.getTypesAccess().getSyncpointParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Syncpoint_6=ruleSyncpoint();

                    state._fsp--;


                    			current = this_Syncpoint_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAgen.g:179:3: this_Log_7= ruleLog
                    {

                    			newCompositeNode(grammarAccess.getTypesAccess().getLogParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Log_7=ruleLog();

                    state._fsp--;


                    			current = this_Log_7;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleTypes"


    // $ANTLR start "entryRuleRunConfiguration"
    // InternalAgen.g:191:1: entryRuleRunConfiguration returns [EObject current=null] : iv_ruleRunConfiguration= ruleRunConfiguration EOF ;
    public final EObject entryRuleRunConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunConfiguration = null;


        try {
            // InternalAgen.g:191:57: (iv_ruleRunConfiguration= ruleRunConfiguration EOF )
            // InternalAgen.g:192:2: iv_ruleRunConfiguration= ruleRunConfiguration EOF
            {
             newCompositeNode(grammarAccess.getRunConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunConfiguration=ruleRunConfiguration();

            state._fsp--;

             current =iv_ruleRunConfiguration; 
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
    // $ANTLR end "entryRuleRunConfiguration"


    // $ANTLR start "ruleRunConfiguration"
    // InternalAgen.g:198:1: ruleRunConfiguration returns [EObject current=null] : (otherlv_0= 'RunConfiguration' otherlv_1= '{' otherlv_2= 'CoordinatorLocation' otherlv_3= '=' ( (lv_CoordinatorLocation_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_nodes_6_0= ruleNode ) )* otherlv_7= '}' ) ;
    public final EObject ruleRunConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_CoordinatorLocation_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_nodes_6_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:204:2: ( (otherlv_0= 'RunConfiguration' otherlv_1= '{' otherlv_2= 'CoordinatorLocation' otherlv_3= '=' ( (lv_CoordinatorLocation_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_nodes_6_0= ruleNode ) )* otherlv_7= '}' ) )
            // InternalAgen.g:205:2: (otherlv_0= 'RunConfiguration' otherlv_1= '{' otherlv_2= 'CoordinatorLocation' otherlv_3= '=' ( (lv_CoordinatorLocation_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_nodes_6_0= ruleNode ) )* otherlv_7= '}' )
            {
            // InternalAgen.g:205:2: (otherlv_0= 'RunConfiguration' otherlv_1= '{' otherlv_2= 'CoordinatorLocation' otherlv_3= '=' ( (lv_CoordinatorLocation_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_nodes_6_0= ruleNode ) )* otherlv_7= '}' )
            // InternalAgen.g:206:3: otherlv_0= 'RunConfiguration' otherlv_1= '{' otherlv_2= 'CoordinatorLocation' otherlv_3= '=' ( (lv_CoordinatorLocation_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_nodes_6_0= ruleNode ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRunConfigurationAccess().getRunConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRunConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRunConfigurationAccess().getCoordinatorLocationKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRunConfigurationAccess().getEqualsSignKeyword_3());
            		
            // InternalAgen.g:222:3: ( (lv_CoordinatorLocation_4_0= RULE_STRING ) )
            // InternalAgen.g:223:4: (lv_CoordinatorLocation_4_0= RULE_STRING )
            {
            // InternalAgen.g:223:4: (lv_CoordinatorLocation_4_0= RULE_STRING )
            // InternalAgen.g:224:5: lv_CoordinatorLocation_4_0= RULE_STRING
            {
            lv_CoordinatorLocation_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_CoordinatorLocation_4_0, grammarAccess.getRunConfigurationAccess().getCoordinatorLocationSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"CoordinatorLocation",
            						lv_CoordinatorLocation_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getRunConfigurationAccess().getSemicolonKeyword_5());
            		
            // InternalAgen.g:244:3: ( (lv_nodes_6_0= ruleNode ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAgen.g:245:4: (lv_nodes_6_0= ruleNode )
            	    {
            	    // InternalAgen.g:245:4: (lv_nodes_6_0= ruleNode )
            	    // InternalAgen.g:246:5: lv_nodes_6_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getRunConfigurationAccess().getNodesNodeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_nodes_6_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRunConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_6_0,
            	    						"org.xtext.Agen.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRunConfigurationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRunConfiguration"


    // $ANTLR start "entryRuleNode"
    // InternalAgen.g:271:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalAgen.g:271:45: (iv_ruleNode= ruleNode EOF )
            // InternalAgen.g:272:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalAgen.g:278:1: ruleNode returns [EObject current=null] : (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'firstAttachPoint' otherlv_4= '=' ( (lv_firstAttachPoint_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'location' otherlv_8= '=' ( (lv_nodeLocation_9_0= RULE_STRING ) ) (otherlv_10= ';' otherlv_11= 'logData' otherlv_12= '=' ( (lv_logLocations_13_0= RULE_ID ) )* )? otherlv_14= ';' ( (lv_faultIDs_15_0= RULE_ID ) )* otherlv_16= ')' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_firstAttachPoint_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_nodeLocation_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_logLocations_13_0=null;
        Token otherlv_14=null;
        Token lv_faultIDs_15_0=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalAgen.g:284:2: ( (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'firstAttachPoint' otherlv_4= '=' ( (lv_firstAttachPoint_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'location' otherlv_8= '=' ( (lv_nodeLocation_9_0= RULE_STRING ) ) (otherlv_10= ';' otherlv_11= 'logData' otherlv_12= '=' ( (lv_logLocations_13_0= RULE_ID ) )* )? otherlv_14= ';' ( (lv_faultIDs_15_0= RULE_ID ) )* otherlv_16= ')' ) )
            // InternalAgen.g:285:2: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'firstAttachPoint' otherlv_4= '=' ( (lv_firstAttachPoint_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'location' otherlv_8= '=' ( (lv_nodeLocation_9_0= RULE_STRING ) ) (otherlv_10= ';' otherlv_11= 'logData' otherlv_12= '=' ( (lv_logLocations_13_0= RULE_ID ) )* )? otherlv_14= ';' ( (lv_faultIDs_15_0= RULE_ID ) )* otherlv_16= ')' )
            {
            // InternalAgen.g:285:2: (otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'firstAttachPoint' otherlv_4= '=' ( (lv_firstAttachPoint_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'location' otherlv_8= '=' ( (lv_nodeLocation_9_0= RULE_STRING ) ) (otherlv_10= ';' otherlv_11= 'logData' otherlv_12= '=' ( (lv_logLocations_13_0= RULE_ID ) )* )? otherlv_14= ';' ( (lv_faultIDs_15_0= RULE_ID ) )* otherlv_16= ')' )
            // InternalAgen.g:286:3: otherlv_0= 'Node' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= 'firstAttachPoint' otherlv_4= '=' ( (lv_firstAttachPoint_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'location' otherlv_8= '=' ( (lv_nodeLocation_9_0= RULE_STRING ) ) (otherlv_10= ';' otherlv_11= 'logData' otherlv_12= '=' ( (lv_logLocations_13_0= RULE_ID ) )* )? otherlv_14= ';' ( (lv_faultIDs_15_0= RULE_ID ) )* otherlv_16= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalAgen.g:290:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAgen.g:291:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAgen.g:291:4: (lv_name_1_0= RULE_ID )
            // InternalAgen.g:292:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getFirstAttachPointKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getEqualsSignKeyword_4());
            		
            // InternalAgen.g:320:3: ( (lv_firstAttachPoint_5_0= RULE_STRING ) )
            // InternalAgen.g:321:4: (lv_firstAttachPoint_5_0= RULE_STRING )
            {
            // InternalAgen.g:321:4: (lv_firstAttachPoint_5_0= RULE_STRING )
            // InternalAgen.g:322:5: lv_firstAttachPoint_5_0= RULE_STRING
            {
            lv_firstAttachPoint_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_firstAttachPoint_5_0, grammarAccess.getNodeAccess().getFirstAttachPointSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"firstAttachPoint",
            						lv_firstAttachPoint_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getLocationKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getEqualsSignKeyword_8());
            		
            // InternalAgen.g:350:3: ( (lv_nodeLocation_9_0= RULE_STRING ) )
            // InternalAgen.g:351:4: (lv_nodeLocation_9_0= RULE_STRING )
            {
            // InternalAgen.g:351:4: (lv_nodeLocation_9_0= RULE_STRING )
            // InternalAgen.g:352:5: lv_nodeLocation_9_0= RULE_STRING
            {
            lv_nodeLocation_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_nodeLocation_9_0, grammarAccess.getNodeAccess().getNodeLocationSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nodeLocation",
            						lv_nodeLocation_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAgen.g:368:3: (otherlv_10= ';' otherlv_11= 'logData' otherlv_12= '=' ( (lv_logLocations_13_0= RULE_ID ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==22) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalAgen.g:369:4: otherlv_10= ';' otherlv_11= 'logData' otherlv_12= '=' ( (lv_logLocations_13_0= RULE_ID ) )*
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getSemicolonKeyword_10_0());
                    			
                    otherlv_11=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getLogDataKeyword_10_1());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getEqualsSignKeyword_10_2());
                    			
                    // InternalAgen.g:381:4: ( (lv_logLocations_13_0= RULE_ID ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAgen.g:382:5: (lv_logLocations_13_0= RULE_ID )
                    	    {
                    	    // InternalAgen.g:382:5: (lv_logLocations_13_0= RULE_ID )
                    	    // InternalAgen.g:383:6: lv_logLocations_13_0= RULE_ID
                    	    {
                    	    lv_logLocations_13_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    						newLeafNode(lv_logLocations_13_0, grammarAccess.getNodeAccess().getLogLocationsIDTerminalRuleCall_10_3_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getNodeRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"logLocations",
                    	    							lv_logLocations_13_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getSemicolonKeyword_11());
            		
            // InternalAgen.g:404:3: ( (lv_faultIDs_15_0= RULE_ID ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAgen.g:405:4: (lv_faultIDs_15_0= RULE_ID )
            	    {
            	    // InternalAgen.g:405:4: (lv_faultIDs_15_0= RULE_ID )
            	    // InternalAgen.g:406:5: lv_faultIDs_15_0= RULE_ID
            	    {
            	    lv_faultIDs_15_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    					newLeafNode(lv_faultIDs_15_0, grammarAccess.getNodeAccess().getFaultIDsIDTerminalRuleCall_12_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getNodeRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"faultIDs",
            	    						lv_faultIDs_15_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_16=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getRightParenthesisKeyword_13());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleLog"
    // InternalAgen.g:430:1: entryRuleLog returns [EObject current=null] : iv_ruleLog= ruleLog EOF ;
    public final EObject entryRuleLog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLog = null;


        try {
            // InternalAgen.g:430:44: (iv_ruleLog= ruleLog EOF )
            // InternalAgen.g:431:2: iv_ruleLog= ruleLog EOF
            {
             newCompositeNode(grammarAccess.getLogRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLog=ruleLog();

            state._fsp--;

             current =iv_ruleLog; 
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
    // $ANTLR end "entryRuleLog"


    // $ANTLR start "ruleLog"
    // InternalAgen.g:437:1: ruleLog returns [EObject current=null] : (otherlv_0= 'Logging' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_faultCond_3_0= RULE_ID ) ) (otherlv_4= ';' otherlv_5= 'extraData' otherlv_6= '=' ( (lv_extraData_7_0= ruleCodeBlock ) ) )? (otherlv_8= ';' otherlv_9= 'stateBasedVariables' otherlv_10= '=' ( (lv_stateBased_11_0= ruleCodeBlock ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleLog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_faultCond_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_extraData_7_0 = null;

        EObject lv_stateBased_11_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:443:2: ( (otherlv_0= 'Logging' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_faultCond_3_0= RULE_ID ) ) (otherlv_4= ';' otherlv_5= 'extraData' otherlv_6= '=' ( (lv_extraData_7_0= ruleCodeBlock ) ) )? (otherlv_8= ';' otherlv_9= 'stateBasedVariables' otherlv_10= '=' ( (lv_stateBased_11_0= ruleCodeBlock ) ) )? otherlv_12= '}' ) )
            // InternalAgen.g:444:2: (otherlv_0= 'Logging' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_faultCond_3_0= RULE_ID ) ) (otherlv_4= ';' otherlv_5= 'extraData' otherlv_6= '=' ( (lv_extraData_7_0= ruleCodeBlock ) ) )? (otherlv_8= ';' otherlv_9= 'stateBasedVariables' otherlv_10= '=' ( (lv_stateBased_11_0= ruleCodeBlock ) ) )? otherlv_12= '}' )
            {
            // InternalAgen.g:444:2: (otherlv_0= 'Logging' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_faultCond_3_0= RULE_ID ) ) (otherlv_4= ';' otherlv_5= 'extraData' otherlv_6= '=' ( (lv_extraData_7_0= ruleCodeBlock ) ) )? (otherlv_8= ';' otherlv_9= 'stateBasedVariables' otherlv_10= '=' ( (lv_stateBased_11_0= ruleCodeBlock ) ) )? otherlv_12= '}' )
            // InternalAgen.g:445:3: otherlv_0= 'Logging' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_faultCond_3_0= RULE_ID ) ) (otherlv_4= ';' otherlv_5= 'extraData' otherlv_6= '=' ( (lv_extraData_7_0= ruleCodeBlock ) ) )? (otherlv_8= ';' otherlv_9= 'stateBasedVariables' otherlv_10= '=' ( (lv_stateBased_11_0= ruleCodeBlock ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLogAccess().getLoggingKeyword_0());
            		
            // InternalAgen.g:449:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAgen.g:450:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAgen.g:450:4: (lv_name_1_0= RULE_ID )
            // InternalAgen.g:451:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLogAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getLogAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAgen.g:471:3: ( (lv_faultCond_3_0= RULE_ID ) )
            // InternalAgen.g:472:4: (lv_faultCond_3_0= RULE_ID )
            {
            // InternalAgen.g:472:4: (lv_faultCond_3_0= RULE_ID )
            // InternalAgen.g:473:5: lv_faultCond_3_0= RULE_ID
            {
            lv_faultCond_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_faultCond_3_0, grammarAccess.getLogAccess().getFaultCondIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogRule());
            					}
            					setWithLastConsumed(
            						current,
            						"faultCond",
            						lv_faultCond_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAgen.g:489:3: (otherlv_4= ';' otherlv_5= 'extraData' otherlv_6= '=' ( (lv_extraData_7_0= ruleCodeBlock ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==25) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalAgen.g:490:4: otherlv_4= ';' otherlv_5= 'extraData' otherlv_6= '=' ( (lv_extraData_7_0= ruleCodeBlock ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getLogAccess().getSemicolonKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getLogAccess().getExtraDataKeyword_4_1());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getLogAccess().getEqualsSignKeyword_4_2());
                    			
                    // InternalAgen.g:502:4: ( (lv_extraData_7_0= ruleCodeBlock ) )
                    // InternalAgen.g:503:5: (lv_extraData_7_0= ruleCodeBlock )
                    {
                    // InternalAgen.g:503:5: (lv_extraData_7_0= ruleCodeBlock )
                    // InternalAgen.g:504:6: lv_extraData_7_0= ruleCodeBlock
                    {

                    						newCompositeNode(grammarAccess.getLogAccess().getExtraDataCodeBlockParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_extraData_7_0=ruleCodeBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogRule());
                    						}
                    						set(
                    							current,
                    							"extraData",
                    							lv_extraData_7_0,
                    							"org.xtext.Agen.CodeBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAgen.g:522:3: (otherlv_8= ';' otherlv_9= 'stateBasedVariables' otherlv_10= '=' ( (lv_stateBased_11_0= ruleCodeBlock ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAgen.g:523:4: otherlv_8= ';' otherlv_9= 'stateBasedVariables' otherlv_10= '=' ( (lv_stateBased_11_0= ruleCodeBlock ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getLogAccess().getSemicolonKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getLogAccess().getStateBasedVariablesKeyword_5_1());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getLogAccess().getEqualsSignKeyword_5_2());
                    			
                    // InternalAgen.g:535:4: ( (lv_stateBased_11_0= ruleCodeBlock ) )
                    // InternalAgen.g:536:5: (lv_stateBased_11_0= ruleCodeBlock )
                    {
                    // InternalAgen.g:536:5: (lv_stateBased_11_0= ruleCodeBlock )
                    // InternalAgen.g:537:6: lv_stateBased_11_0= ruleCodeBlock
                    {

                    						newCompositeNode(grammarAccess.getLogAccess().getStateBasedCodeBlockParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_stateBased_11_0=ruleCodeBlock();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLogRule());
                    						}
                    						set(
                    							current,
                    							"stateBased",
                    							lv_stateBased_11_0,
                    							"org.xtext.Agen.CodeBlock");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLogAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLog"


    // $ANTLR start "entryRuleSyncpoint"
    // InternalAgen.g:563:1: entryRuleSyncpoint returns [EObject current=null] : iv_ruleSyncpoint= ruleSyncpoint EOF ;
    public final EObject entryRuleSyncpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyncpoint = null;


        try {
            // InternalAgen.g:563:50: (iv_ruleSyncpoint= ruleSyncpoint EOF )
            // InternalAgen.g:564:2: iv_ruleSyncpoint= ruleSyncpoint EOF
            {
             newCompositeNode(grammarAccess.getSyncpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSyncpoint=ruleSyncpoint();

            state._fsp--;

             current =iv_ruleSyncpoint; 
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
    // $ANTLR end "entryRuleSyncpoint"


    // $ANTLR start "ruleSyncpoint"
    // InternalAgen.g:570:1: ruleSyncpoint returns [EObject current=null] : (otherlv_0= 'Syncpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_nodesDependant_3_0= RULE_ID ) )* otherlv_4= ';' otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= rulesyncpointType ) ) otherlv_8= ';' otherlv_9= 'onFailure' otherlv_10= '=' ( (lv_onFail_11_0= rulesyncpointOnFail ) ) otherlv_12= ';' otherlv_13= 'faultCond' otherlv_14= '=' ( (lv_faultCond_15_0= ruleFaultCond ) ) otherlv_16= ')' ) ;
    public final EObject ruleSyncpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_nodesDependant_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Enumerator lv_type_7_0 = null;

        Enumerator lv_onFail_11_0 = null;

        EObject lv_faultCond_15_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:576:2: ( (otherlv_0= 'Syncpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_nodesDependant_3_0= RULE_ID ) )* otherlv_4= ';' otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= rulesyncpointType ) ) otherlv_8= ';' otherlv_9= 'onFailure' otherlv_10= '=' ( (lv_onFail_11_0= rulesyncpointOnFail ) ) otherlv_12= ';' otherlv_13= 'faultCond' otherlv_14= '=' ( (lv_faultCond_15_0= ruleFaultCond ) ) otherlv_16= ')' ) )
            // InternalAgen.g:577:2: (otherlv_0= 'Syncpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_nodesDependant_3_0= RULE_ID ) )* otherlv_4= ';' otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= rulesyncpointType ) ) otherlv_8= ';' otherlv_9= 'onFailure' otherlv_10= '=' ( (lv_onFail_11_0= rulesyncpointOnFail ) ) otherlv_12= ';' otherlv_13= 'faultCond' otherlv_14= '=' ( (lv_faultCond_15_0= ruleFaultCond ) ) otherlv_16= ')' )
            {
            // InternalAgen.g:577:2: (otherlv_0= 'Syncpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_nodesDependant_3_0= RULE_ID ) )* otherlv_4= ';' otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= rulesyncpointType ) ) otherlv_8= ';' otherlv_9= 'onFailure' otherlv_10= '=' ( (lv_onFail_11_0= rulesyncpointOnFail ) ) otherlv_12= ';' otherlv_13= 'faultCond' otherlv_14= '=' ( (lv_faultCond_15_0= ruleFaultCond ) ) otherlv_16= ')' )
            // InternalAgen.g:578:3: otherlv_0= 'Syncpoint' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_nodesDependant_3_0= RULE_ID ) )* otherlv_4= ';' otherlv_5= 'type' otherlv_6= '=' ( (lv_type_7_0= rulesyncpointType ) ) otherlv_8= ';' otherlv_9= 'onFailure' otherlv_10= '=' ( (lv_onFail_11_0= rulesyncpointOnFail ) ) otherlv_12= ';' otherlv_13= 'faultCond' otherlv_14= '=' ( (lv_faultCond_15_0= ruleFaultCond ) ) otherlv_16= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSyncpointAccess().getSyncpointKeyword_0());
            		
            // InternalAgen.g:582:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAgen.g:583:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAgen.g:583:4: (lv_name_1_0= RULE_ID )
            // InternalAgen.g:584:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSyncpointAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSyncpointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSyncpointAccess().getLeftParenthesisKeyword_2());
            		
            // InternalAgen.g:604:3: ( (lv_nodesDependant_3_0= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAgen.g:605:4: (lv_nodesDependant_3_0= RULE_ID )
            	    {
            	    // InternalAgen.g:605:4: (lv_nodesDependant_3_0= RULE_ID )
            	    // InternalAgen.g:606:5: lv_nodesDependant_3_0= RULE_ID
            	    {
            	    lv_nodesDependant_3_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    					newLeafNode(lv_nodesDependant_3_0, grammarAccess.getSyncpointAccess().getNodesDependantIDTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSyncpointRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"nodesDependant",
            	    						lv_nodesDependant_3_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getSyncpointAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSyncpointAccess().getTypeKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getSyncpointAccess().getEqualsSignKeyword_6());
            		
            // InternalAgen.g:634:3: ( (lv_type_7_0= rulesyncpointType ) )
            // InternalAgen.g:635:4: (lv_type_7_0= rulesyncpointType )
            {
            // InternalAgen.g:635:4: (lv_type_7_0= rulesyncpointType )
            // InternalAgen.g:636:5: lv_type_7_0= rulesyncpointType
            {

            					newCompositeNode(grammarAccess.getSyncpointAccess().getTypeSyncpointTypeEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_7_0=rulesyncpointType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSyncpointRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"org.xtext.Agen.syncpointType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getSyncpointAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getSyncpointAccess().getOnFailureKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_10, grammarAccess.getSyncpointAccess().getEqualsSignKeyword_10());
            		
            // InternalAgen.g:665:3: ( (lv_onFail_11_0= rulesyncpointOnFail ) )
            // InternalAgen.g:666:4: (lv_onFail_11_0= rulesyncpointOnFail )
            {
            // InternalAgen.g:666:4: (lv_onFail_11_0= rulesyncpointOnFail )
            // InternalAgen.g:667:5: lv_onFail_11_0= rulesyncpointOnFail
            {

            					newCompositeNode(grammarAccess.getSyncpointAccess().getOnFailSyncpointOnFailEnumRuleCall_11_0());
            				
            pushFollow(FOLLOW_8);
            lv_onFail_11_0=rulesyncpointOnFail();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSyncpointRule());
            					}
            					set(
            						current,
            						"onFail",
            						lv_onFail_11_0,
            						"org.xtext.Agen.syncpointOnFail");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_12, grammarAccess.getSyncpointAccess().getSemicolonKeyword_12());
            		
            otherlv_13=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getSyncpointAccess().getFaultCondKeyword_13());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_27); 

            			newLeafNode(otherlv_14, grammarAccess.getSyncpointAccess().getEqualsSignKeyword_14());
            		
            // InternalAgen.g:696:3: ( (lv_faultCond_15_0= ruleFaultCond ) )
            // InternalAgen.g:697:4: (lv_faultCond_15_0= ruleFaultCond )
            {
            // InternalAgen.g:697:4: (lv_faultCond_15_0= ruleFaultCond )
            // InternalAgen.g:698:5: lv_faultCond_15_0= ruleFaultCond
            {

            					newCompositeNode(grammarAccess.getSyncpointAccess().getFaultCondFaultCondParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_28);
            lv_faultCond_15_0=ruleFaultCond();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSyncpointRule());
            					}
            					set(
            						current,
            						"faultCond",
            						lv_faultCond_15_0,
            						"org.xtext.Agen.FaultCond");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getSyncpointAccess().getRightParenthesisKeyword_16());
            		

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
    // $ANTLR end "ruleSyncpoint"


    // $ANTLR start "entryRuleFault"
    // InternalAgen.g:723:1: entryRuleFault returns [EObject current=null] : iv_ruleFault= ruleFault EOF ;
    public final EObject entryRuleFault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFault = null;


        try {
            // InternalAgen.g:723:46: (iv_ruleFault= ruleFault EOF )
            // InternalAgen.g:724:2: iv_ruleFault= ruleFault EOF
            {
             newCompositeNode(grammarAccess.getFaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFault=ruleFault();

            state._fsp--;

             current =iv_ruleFault; 
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
    // $ANTLR end "entryRuleFault"


    // $ANTLR start "ruleFault"
    // InternalAgen.g:730:1: ruleFault returns [EObject current=null] : (otherlv_0= 'Fault' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pointcut' otherlv_4= '=' ( (lv_pointcut_5_0= RULE_STRING ) ) otherlv_6= ';' ( (lv_execParams_7_0= ruleExecParams ) )* otherlv_8= '}' ) ;
    public final EObject ruleFault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_pointcut_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_execParams_7_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:736:2: ( (otherlv_0= 'Fault' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pointcut' otherlv_4= '=' ( (lv_pointcut_5_0= RULE_STRING ) ) otherlv_6= ';' ( (lv_execParams_7_0= ruleExecParams ) )* otherlv_8= '}' ) )
            // InternalAgen.g:737:2: (otherlv_0= 'Fault' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pointcut' otherlv_4= '=' ( (lv_pointcut_5_0= RULE_STRING ) ) otherlv_6= ';' ( (lv_execParams_7_0= ruleExecParams ) )* otherlv_8= '}' )
            {
            // InternalAgen.g:737:2: (otherlv_0= 'Fault' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pointcut' otherlv_4= '=' ( (lv_pointcut_5_0= RULE_STRING ) ) otherlv_6= ';' ( (lv_execParams_7_0= ruleExecParams ) )* otherlv_8= '}' )
            // InternalAgen.g:738:3: otherlv_0= 'Fault' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pointcut' otherlv_4= '=' ( (lv_pointcut_5_0= RULE_STRING ) ) otherlv_6= ';' ( (lv_execParams_7_0= ruleExecParams ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFaultAccess().getFaultKeyword_0());
            		
            // InternalAgen.g:742:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAgen.g:743:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAgen.g:743:4: (lv_name_1_0= RULE_ID )
            // InternalAgen.g:744:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFaultAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getFaultAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getFaultAccess().getPointcutKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getFaultAccess().getEqualsSignKeyword_4());
            		
            // InternalAgen.g:772:3: ( (lv_pointcut_5_0= RULE_STRING ) )
            // InternalAgen.g:773:4: (lv_pointcut_5_0= RULE_STRING )
            {
            // InternalAgen.g:773:4: (lv_pointcut_5_0= RULE_STRING )
            // InternalAgen.g:774:5: lv_pointcut_5_0= RULE_STRING
            {
            lv_pointcut_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_pointcut_5_0, grammarAccess.getFaultAccess().getPointcutSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pointcut",
            						lv_pointcut_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getFaultAccess().getSemicolonKeyword_6());
            		
            // InternalAgen.g:794:3: ( (lv_execParams_7_0= ruleExecParams ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAgen.g:795:4: (lv_execParams_7_0= ruleExecParams )
            	    {
            	    // InternalAgen.g:795:4: (lv_execParams_7_0= ruleExecParams )
            	    // InternalAgen.g:796:5: lv_execParams_7_0= ruleExecParams
            	    {

            	    					newCompositeNode(grammarAccess.getFaultAccess().getExecParamsExecParamsParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_execParams_7_0=ruleExecParams();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFaultRule());
            	    					}
            	    					add(
            	    						current,
            	    						"execParams",
            	    						lv_execParams_7_0,
            	    						"org.xtext.Agen.ExecParams");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getFaultAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFault"


    // $ANTLR start "entryRuleExecParams"
    // InternalAgen.g:821:1: entryRuleExecParams returns [EObject current=null] : iv_ruleExecParams= ruleExecParams EOF ;
    public final EObject entryRuleExecParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecParams = null;


        try {
            // InternalAgen.g:821:51: (iv_ruleExecParams= ruleExecParams EOF )
            // InternalAgen.g:822:2: iv_ruleExecParams= ruleExecParams EOF
            {
             newCompositeNode(grammarAccess.getExecParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecParams=ruleExecParams();

            state._fsp--;

             current =iv_ruleExecParams; 
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
    // $ANTLR end "entryRuleExecParams"


    // $ANTLR start "ruleExecParams"
    // InternalAgen.g:828:1: ruleExecParams returns [EObject current=null] : ( (otherlv_0= 'ExecParams' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'ExecParams' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' otherlv_7= 'where' otherlv_8= '=' ( (lv_where_9_0= ruleJOIN_TYPE ) ) (otherlv_10= ';' otherlv_11= 'whenToExecute{' ( (lv_when_12_0= ruleWhen ) ) otherlv_13= '}' )? otherlv_14= ';' otherlv_15= 'whatToExecute{' ( (lv_what_16_0= ruleWhat ) ) otherlv_17= '}' otherlv_18= '}' ) ) ;
    public final EObject ruleExecParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Enumerator lv_where_9_0 = null;

        EObject lv_when_12_0 = null;

        EObject lv_what_16_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:834:2: ( ( (otherlv_0= 'ExecParams' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'ExecParams' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' otherlv_7= 'where' otherlv_8= '=' ( (lv_where_9_0= ruleJOIN_TYPE ) ) (otherlv_10= ';' otherlv_11= 'whenToExecute{' ( (lv_when_12_0= ruleWhen ) ) otherlv_13= '}' )? otherlv_14= ';' otherlv_15= 'whatToExecute{' ( (lv_what_16_0= ruleWhat ) ) otherlv_17= '}' otherlv_18= '}' ) ) )
            // InternalAgen.g:835:2: ( (otherlv_0= 'ExecParams' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'ExecParams' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' otherlv_7= 'where' otherlv_8= '=' ( (lv_where_9_0= ruleJOIN_TYPE ) ) (otherlv_10= ';' otherlv_11= 'whenToExecute{' ( (lv_when_12_0= ruleWhen ) ) otherlv_13= '}' )? otherlv_14= ';' otherlv_15= 'whatToExecute{' ( (lv_what_16_0= ruleWhat ) ) otherlv_17= '}' otherlv_18= '}' ) )
            {
            // InternalAgen.g:835:2: ( (otherlv_0= 'ExecParams' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'ExecParams' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' otherlv_7= 'where' otherlv_8= '=' ( (lv_where_9_0= ruleJOIN_TYPE ) ) (otherlv_10= ';' otherlv_11= 'whenToExecute{' ( (lv_when_12_0= ruleWhen ) ) otherlv_13= '}' )? otherlv_14= ';' otherlv_15= 'whatToExecute{' ( (lv_what_16_0= ruleWhat ) ) otherlv_17= '}' otherlv_18= '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==19) ) {
                    alt13=1;
                }
                else if ( (LA13_1==RULE_ID||LA13_1==13) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalAgen.g:836:3: (otherlv_0= 'ExecParams' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // InternalAgen.g:836:3: (otherlv_0= 'ExecParams' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    // InternalAgen.g:837:4: otherlv_0= 'ExecParams' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getExecParamsAccess().getExecParamsKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getExecParamsAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalAgen.g:845:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalAgen.g:846:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalAgen.g:846:5: (lv_name_2_0= RULE_ID )
                    // InternalAgen.g:847:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getExecParamsAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExecParamsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExecParamsAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgen.g:869:3: (otherlv_4= 'ExecParams' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' otherlv_7= 'where' otherlv_8= '=' ( (lv_where_9_0= ruleJOIN_TYPE ) ) (otherlv_10= ';' otherlv_11= 'whenToExecute{' ( (lv_when_12_0= ruleWhen ) ) otherlv_13= '}' )? otherlv_14= ';' otherlv_15= 'whatToExecute{' ( (lv_what_16_0= ruleWhat ) ) otherlv_17= '}' otherlv_18= '}' )
                    {
                    // InternalAgen.g:869:3: (otherlv_4= 'ExecParams' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' otherlv_7= 'where' otherlv_8= '=' ( (lv_where_9_0= ruleJOIN_TYPE ) ) (otherlv_10= ';' otherlv_11= 'whenToExecute{' ( (lv_when_12_0= ruleWhen ) ) otherlv_13= '}' )? otherlv_14= ';' otherlv_15= 'whatToExecute{' ( (lv_what_16_0= ruleWhat ) ) otherlv_17= '}' otherlv_18= '}' )
                    // InternalAgen.g:870:4: otherlv_4= 'ExecParams' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' otherlv_7= 'where' otherlv_8= '=' ( (lv_where_9_0= ruleJOIN_TYPE ) ) (otherlv_10= ';' otherlv_11= 'whenToExecute{' ( (lv_when_12_0= ruleWhen ) ) otherlv_13= '}' )? otherlv_14= ';' otherlv_15= 'whatToExecute{' ( (lv_what_16_0= ruleWhat ) ) otherlv_17= '}' otherlv_18= '}'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getExecParamsAccess().getExecParamsKeyword_1_0());
                    			
                    // InternalAgen.g:874:4: ( (lv_name_5_0= RULE_ID ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalAgen.g:875:5: (lv_name_5_0= RULE_ID )
                            {
                            // InternalAgen.g:875:5: (lv_name_5_0= RULE_ID )
                            // InternalAgen.g:876:6: lv_name_5_0= RULE_ID
                            {
                            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                            						newLeafNode(lv_name_5_0, grammarAccess.getExecParamsAccess().getNameIDTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getExecParamsRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_5_0,
                            							"org.eclipse.xtext.common.Terminals.ID");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getExecParamsAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    otherlv_7=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getExecParamsAccess().getWhereKeyword_1_3());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_33); 

                    				newLeafNode(otherlv_8, grammarAccess.getExecParamsAccess().getEqualsSignKeyword_1_4());
                    			
                    // InternalAgen.g:904:4: ( (lv_where_9_0= ruleJOIN_TYPE ) )
                    // InternalAgen.g:905:5: (lv_where_9_0= ruleJOIN_TYPE )
                    {
                    // InternalAgen.g:905:5: (lv_where_9_0= ruleJOIN_TYPE )
                    // InternalAgen.g:906:6: lv_where_9_0= ruleJOIN_TYPE
                    {

                    						newCompositeNode(grammarAccess.getExecParamsAccess().getWhereJOIN_TYPEEnumRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_where_9_0=ruleJOIN_TYPE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExecParamsRule());
                    						}
                    						set(
                    							current,
                    							"where",
                    							lv_where_9_0,
                    							"org.xtext.Agen.JOIN_TYPE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAgen.g:923:4: (otherlv_10= ';' otherlv_11= 'whenToExecute{' ( (lv_when_12_0= ruleWhen ) ) otherlv_13= '}' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==16) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==35) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalAgen.g:924:5: otherlv_10= ';' otherlv_11= 'whenToExecute{' ( (lv_when_12_0= ruleWhen ) ) otherlv_13= '}'
                            {
                            otherlv_10=(Token)match(input,16,FOLLOW_34); 

                            					newLeafNode(otherlv_10, grammarAccess.getExecParamsAccess().getSemicolonKeyword_1_6_0());
                            				
                            otherlv_11=(Token)match(input,35,FOLLOW_35); 

                            					newLeafNode(otherlv_11, grammarAccess.getExecParamsAccess().getWhenToExecuteKeyword_1_6_1());
                            				
                            // InternalAgen.g:932:5: ( (lv_when_12_0= ruleWhen ) )
                            // InternalAgen.g:933:6: (lv_when_12_0= ruleWhen )
                            {
                            // InternalAgen.g:933:6: (lv_when_12_0= ruleWhen )
                            // InternalAgen.g:934:7: lv_when_12_0= ruleWhen
                            {

                            							newCompositeNode(grammarAccess.getExecParamsAccess().getWhenWhenParserRuleCall_1_6_2_0());
                            						
                            pushFollow(FOLLOW_21);
                            lv_when_12_0=ruleWhen();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getExecParamsRule());
                            							}
                            							set(
                            								current,
                            								"when",
                            								lv_when_12_0,
                            								"org.xtext.Agen.When");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_13=(Token)match(input,17,FOLLOW_8); 

                            					newLeafNode(otherlv_13, grammarAccess.getExecParamsAccess().getRightCurlyBracketKeyword_1_6_3());
                            				

                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,16,FOLLOW_36); 

                    				newLeafNode(otherlv_14, grammarAccess.getExecParamsAccess().getSemicolonKeyword_1_7());
                    			
                    otherlv_15=(Token)match(input,36,FOLLOW_37); 

                    				newLeafNode(otherlv_15, grammarAccess.getExecParamsAccess().getWhatToExecuteKeyword_1_8());
                    			
                    // InternalAgen.g:964:4: ( (lv_what_16_0= ruleWhat ) )
                    // InternalAgen.g:965:5: (lv_what_16_0= ruleWhat )
                    {
                    // InternalAgen.g:965:5: (lv_what_16_0= ruleWhat )
                    // InternalAgen.g:966:6: lv_what_16_0= ruleWhat
                    {

                    						newCompositeNode(grammarAccess.getExecParamsAccess().getWhatWhatParserRuleCall_1_9_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_what_16_0=ruleWhat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExecParamsRule());
                    						}
                    						set(
                    							current,
                    							"what",
                    							lv_what_16_0,
                    							"org.xtext.Agen.What");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getExecParamsAccess().getRightCurlyBracketKeyword_1_10());
                    			
                    otherlv_18=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getExecParamsAccess().getRightCurlyBracketKeyword_1_11());
                    			

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
    // $ANTLR end "ruleExecParams"


    // $ANTLR start "entryRuleWhat"
    // InternalAgen.g:996:1: entryRuleWhat returns [EObject current=null] : iv_ruleWhat= ruleWhat EOF ;
    public final EObject entryRuleWhat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhat = null;


        try {
            // InternalAgen.g:996:45: (iv_ruleWhat= ruleWhat EOF )
            // InternalAgen.g:997:2: iv_ruleWhat= ruleWhat EOF
            {
             newCompositeNode(grammarAccess.getWhatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhat=ruleWhat();

            state._fsp--;

             current =iv_ruleWhat; 
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
    // $ANTLR end "entryRuleWhat"


    // $ANTLR start "ruleWhat"
    // InternalAgen.g:1003:1: ruleWhat returns [EObject current=null] : ( ( (lv_codeBlock_0_0= ruleCodeBlock ) ) | ( (lv_sleep_1_0= ruleSleep ) ) | ( (lv_exit_2_0= ruleExit ) ) | ( (lv_bigPacketFault_3_0= ruleBigPacketFault ) ) | ( (lv_leakFault_4_0= ruleLeakFault ) ) | ( (lv_alterPacketFault_5_0= ruleAlterPacketFault ) ) | ( (lv_cpuLoader_6_0= ruleCPULoader ) ) | ( (lv_skipExecution_7_0= ruleSkipExecution ) ) | ( (lv_repeatExecution_8_0= ruleRepeatExecution ) ) ) ;
    public final EObject ruleWhat() throws RecognitionException {
        EObject current = null;

        EObject lv_codeBlock_0_0 = null;

        EObject lv_sleep_1_0 = null;

        EObject lv_exit_2_0 = null;

        EObject lv_bigPacketFault_3_0 = null;

        EObject lv_leakFault_4_0 = null;

        EObject lv_alterPacketFault_5_0 = null;

        EObject lv_cpuLoader_6_0 = null;

        AntlrDatatypeRuleToken lv_skipExecution_7_0 = null;

        EObject lv_repeatExecution_8_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:1009:2: ( ( ( (lv_codeBlock_0_0= ruleCodeBlock ) ) | ( (lv_sleep_1_0= ruleSleep ) ) | ( (lv_exit_2_0= ruleExit ) ) | ( (lv_bigPacketFault_3_0= ruleBigPacketFault ) ) | ( (lv_leakFault_4_0= ruleLeakFault ) ) | ( (lv_alterPacketFault_5_0= ruleAlterPacketFault ) ) | ( (lv_cpuLoader_6_0= ruleCPULoader ) ) | ( (lv_skipExecution_7_0= ruleSkipExecution ) ) | ( (lv_repeatExecution_8_0= ruleRepeatExecution ) ) ) )
            // InternalAgen.g:1010:2: ( ( (lv_codeBlock_0_0= ruleCodeBlock ) ) | ( (lv_sleep_1_0= ruleSleep ) ) | ( (lv_exit_2_0= ruleExit ) ) | ( (lv_bigPacketFault_3_0= ruleBigPacketFault ) ) | ( (lv_leakFault_4_0= ruleLeakFault ) ) | ( (lv_alterPacketFault_5_0= ruleAlterPacketFault ) ) | ( (lv_cpuLoader_6_0= ruleCPULoader ) ) | ( (lv_skipExecution_7_0= ruleSkipExecution ) ) | ( (lv_repeatExecution_8_0= ruleRepeatExecution ) ) )
            {
            // InternalAgen.g:1010:2: ( ( (lv_codeBlock_0_0= ruleCodeBlock ) ) | ( (lv_sleep_1_0= ruleSleep ) ) | ( (lv_exit_2_0= ruleExit ) ) | ( (lv_bigPacketFault_3_0= ruleBigPacketFault ) ) | ( (lv_leakFault_4_0= ruleLeakFault ) ) | ( (lv_alterPacketFault_5_0= ruleAlterPacketFault ) ) | ( (lv_cpuLoader_6_0= ruleCPULoader ) ) | ( (lv_skipExecution_7_0= ruleSkipExecution ) ) | ( (lv_repeatExecution_8_0= ruleRepeatExecution ) ) )
            int alt14=9;
            switch ( input.LA(1) ) {
            case 46:
            case 47:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 43:
                {
                alt14=3;
                }
                break;
            case 42:
                {
                alt14=4;
                }
                break;
            case 41:
                {
                alt14=5;
                }
                break;
            case 39:
                {
                alt14=6;
                }
                break;
            case 45:
                {
                alt14=7;
                }
                break;
            case 38:
                {
                alt14=8;
                }
                break;
            case 37:
                {
                alt14=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAgen.g:1011:3: ( (lv_codeBlock_0_0= ruleCodeBlock ) )
                    {
                    // InternalAgen.g:1011:3: ( (lv_codeBlock_0_0= ruleCodeBlock ) )
                    // InternalAgen.g:1012:4: (lv_codeBlock_0_0= ruleCodeBlock )
                    {
                    // InternalAgen.g:1012:4: (lv_codeBlock_0_0= ruleCodeBlock )
                    // InternalAgen.g:1013:5: lv_codeBlock_0_0= ruleCodeBlock
                    {

                    					newCompositeNode(grammarAccess.getWhatAccess().getCodeBlockCodeBlockParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_codeBlock_0_0=ruleCodeBlock();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhatRule());
                    					}
                    					set(
                    						current,
                    						"codeBlock",
                    						lv_codeBlock_0_0,
                    						"org.xtext.Agen.CodeBlock");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAgen.g:1031:3: ( (lv_sleep_1_0= ruleSleep ) )
                    {
                    // InternalAgen.g:1031:3: ( (lv_sleep_1_0= ruleSleep ) )
                    // InternalAgen.g:1032:4: (lv_sleep_1_0= ruleSleep )
                    {
                    // InternalAgen.g:1032:4: (lv_sleep_1_0= ruleSleep )
                    // InternalAgen.g:1033:5: lv_sleep_1_0= ruleSleep
                    {

                    					newCompositeNode(grammarAccess.getWhatAccess().getSleepSleepParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sleep_1_0=ruleSleep();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhatRule());
                    					}
                    					set(
                    						current,
                    						"sleep",
                    						lv_sleep_1_0,
                    						"org.xtext.Agen.Sleep");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAgen.g:1051:3: ( (lv_exit_2_0= ruleExit ) )
                    {
                    // InternalAgen.g:1051:3: ( (lv_exit_2_0= ruleExit ) )
                    // InternalAgen.g:1052:4: (lv_exit_2_0= ruleExit )
                    {
                    // InternalAgen.g:1052:4: (lv_exit_2_0= ruleExit )
                    // InternalAgen.g:1053:5: lv_exit_2_0= ruleExit
                    {

                    					newCompositeNode(grammarAccess.getWhatAccess().getExitExitParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exit_2_0=ruleExit();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhatRule());
                    					}
                    					set(
                    						current,
                    						"exit",
                    						lv_exit_2_0,
                    						"org.xtext.Agen.Exit");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAgen.g:1071:3: ( (lv_bigPacketFault_3_0= ruleBigPacketFault ) )
                    {
                    // InternalAgen.g:1071:3: ( (lv_bigPacketFault_3_0= ruleBigPacketFault ) )
                    // InternalAgen.g:1072:4: (lv_bigPacketFault_3_0= ruleBigPacketFault )
                    {
                    // InternalAgen.g:1072:4: (lv_bigPacketFault_3_0= ruleBigPacketFault )
                    // InternalAgen.g:1073:5: lv_bigPacketFault_3_0= ruleBigPacketFault
                    {

                    					newCompositeNode(grammarAccess.getWhatAccess().getBigPacketFaultBigPacketFaultParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bigPacketFault_3_0=ruleBigPacketFault();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhatRule());
                    					}
                    					set(
                    						current,
                    						"bigPacketFault",
                    						lv_bigPacketFault_3_0,
                    						"org.xtext.Agen.BigPacketFault");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAgen.g:1091:3: ( (lv_leakFault_4_0= ruleLeakFault ) )
                    {
                    // InternalAgen.g:1091:3: ( (lv_leakFault_4_0= ruleLeakFault ) )
                    // InternalAgen.g:1092:4: (lv_leakFault_4_0= ruleLeakFault )
                    {
                    // InternalAgen.g:1092:4: (lv_leakFault_4_0= ruleLeakFault )
                    // InternalAgen.g:1093:5: lv_leakFault_4_0= ruleLeakFault
                    {

                    					newCompositeNode(grammarAccess.getWhatAccess().getLeakFaultLeakFaultParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_leakFault_4_0=ruleLeakFault();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhatRule());
                    					}
                    					set(
                    						current,
                    						"leakFault",
                    						lv_leakFault_4_0,
                    						"org.xtext.Agen.LeakFault");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAgen.g:1111:3: ( (lv_alterPacketFault_5_0= ruleAlterPacketFault ) )
                    {
                    // InternalAgen.g:1111:3: ( (lv_alterPacketFault_5_0= ruleAlterPacketFault ) )
                    // InternalAgen.g:1112:4: (lv_alterPacketFault_5_0= ruleAlterPacketFault )
                    {
                    // InternalAgen.g:1112:4: (lv_alterPacketFault_5_0= ruleAlterPacketFault )
                    // InternalAgen.g:1113:5: lv_alterPacketFault_5_0= ruleAlterPacketFault
                    {

                    					newCompositeNode(grammarAccess.getWhatAccess().getAlterPacketFaultAlterPacketFaultParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_alterPacketFault_5_0=ruleAlterPacketFault();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhatRule());
                    					}
                    					set(
                    						current,
                    						"alterPacketFault",
                    						lv_alterPacketFault_5_0,
                    						"org.xtext.Agen.AlterPacketFault");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAgen.g:1131:3: ( (lv_cpuLoader_6_0= ruleCPULoader ) )
                    {
                    // InternalAgen.g:1131:3: ( (lv_cpuLoader_6_0= ruleCPULoader ) )
                    // InternalAgen.g:1132:4: (lv_cpuLoader_6_0= ruleCPULoader )
                    {
                    // InternalAgen.g:1132:4: (lv_cpuLoader_6_0= ruleCPULoader )
                    // InternalAgen.g:1133:5: lv_cpuLoader_6_0= ruleCPULoader
                    {

                    					newCompositeNode(grammarAccess.getWhatAccess().getCpuLoaderCPULoaderParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cpuLoader_6_0=ruleCPULoader();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhatRule());
                    					}
                    					set(
                    						current,
                    						"cpuLoader",
                    						lv_cpuLoader_6_0,
                    						"org.xtext.Agen.CPULoader");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAgen.g:1151:3: ( (lv_skipExecution_7_0= ruleSkipExecution ) )
                    {
                    // InternalAgen.g:1151:3: ( (lv_skipExecution_7_0= ruleSkipExecution ) )
                    // InternalAgen.g:1152:4: (lv_skipExecution_7_0= ruleSkipExecution )
                    {
                    // InternalAgen.g:1152:4: (lv_skipExecution_7_0= ruleSkipExecution )
                    // InternalAgen.g:1153:5: lv_skipExecution_7_0= ruleSkipExecution
                    {

                    					newCompositeNode(grammarAccess.getWhatAccess().getSkipExecutionSkipExecutionParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_skipExecution_7_0=ruleSkipExecution();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhatRule());
                    					}
                    					set(
                    						current,
                    						"skipExecution",
                    						lv_skipExecution_7_0,
                    						"org.xtext.Agen.SkipExecution");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalAgen.g:1171:3: ( (lv_repeatExecution_8_0= ruleRepeatExecution ) )
                    {
                    // InternalAgen.g:1171:3: ( (lv_repeatExecution_8_0= ruleRepeatExecution ) )
                    // InternalAgen.g:1172:4: (lv_repeatExecution_8_0= ruleRepeatExecution )
                    {
                    // InternalAgen.g:1172:4: (lv_repeatExecution_8_0= ruleRepeatExecution )
                    // InternalAgen.g:1173:5: lv_repeatExecution_8_0= ruleRepeatExecution
                    {

                    					newCompositeNode(grammarAccess.getWhatAccess().getRepeatExecutionRepeatExecutionParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_repeatExecution_8_0=ruleRepeatExecution();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhatRule());
                    					}
                    					set(
                    						current,
                    						"repeatExecution",
                    						lv_repeatExecution_8_0,
                    						"org.xtext.Agen.RepeatExecution");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleWhat"


    // $ANTLR start "entryRuleRepeatExecution"
    // InternalAgen.g:1194:1: entryRuleRepeatExecution returns [EObject current=null] : iv_ruleRepeatExecution= ruleRepeatExecution EOF ;
    public final EObject entryRuleRepeatExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatExecution = null;


        try {
            // InternalAgen.g:1194:56: (iv_ruleRepeatExecution= ruleRepeatExecution EOF )
            // InternalAgen.g:1195:2: iv_ruleRepeatExecution= ruleRepeatExecution EOF
            {
             newCompositeNode(grammarAccess.getRepeatExecutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeatExecution=ruleRepeatExecution();

            state._fsp--;

             current =iv_ruleRepeatExecution; 
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
    // $ANTLR end "entryRuleRepeatExecution"


    // $ANTLR start "ruleRepeatExecution"
    // InternalAgen.g:1201:1: ruleRepeatExecution returns [EObject current=null] : (otherlv_0= 'repeatExecution' otherlv_1= '(' ( (lv_times_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRepeatExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_times_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgen.g:1207:2: ( (otherlv_0= 'repeatExecution' otherlv_1= '(' ( (lv_times_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalAgen.g:1208:2: (otherlv_0= 'repeatExecution' otherlv_1= '(' ( (lv_times_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalAgen.g:1208:2: (otherlv_0= 'repeatExecution' otherlv_1= '(' ( (lv_times_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalAgen.g:1209:3: otherlv_0= 'repeatExecution' otherlv_1= '(' ( (lv_times_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatExecutionAccess().getRepeatExecutionKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRepeatExecutionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:1217:3: ( (lv_times_2_0= RULE_INT ) )
            // InternalAgen.g:1218:4: (lv_times_2_0= RULE_INT )
            {
            // InternalAgen.g:1218:4: (lv_times_2_0= RULE_INT )
            // InternalAgen.g:1219:5: lv_times_2_0= RULE_INT
            {
            lv_times_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_times_2_0, grammarAccess.getRepeatExecutionAccess().getTimesINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepeatExecutionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"times",
            						lv_times_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRepeatExecutionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleRepeatExecution"


    // $ANTLR start "entryRuleSkipExecution"
    // InternalAgen.g:1243:1: entryRuleSkipExecution returns [String current=null] : iv_ruleSkipExecution= ruleSkipExecution EOF ;
    public final String entryRuleSkipExecution() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSkipExecution = null;


        try {
            // InternalAgen.g:1243:53: (iv_ruleSkipExecution= ruleSkipExecution EOF )
            // InternalAgen.g:1244:2: iv_ruleSkipExecution= ruleSkipExecution EOF
            {
             newCompositeNode(grammarAccess.getSkipExecutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkipExecution=ruleSkipExecution();

            state._fsp--;

             current =iv_ruleSkipExecution.getText(); 
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
    // $ANTLR end "entryRuleSkipExecution"


    // $ANTLR start "ruleSkipExecution"
    // InternalAgen.g:1250:1: ruleSkipExecution returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'skipExecution' ;
    public final AntlrDatatypeRuleToken ruleSkipExecution() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAgen.g:1256:2: (kw= 'skipExecution' )
            // InternalAgen.g:1257:2: kw= 'skipExecution'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getSkipExecutionAccess().getSkipExecutionKeyword());
            	

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
    // $ANTLR end "ruleSkipExecution"


    // $ANTLR start "entryRuleAlterPacketFault"
    // InternalAgen.g:1265:1: entryRuleAlterPacketFault returns [EObject current=null] : iv_ruleAlterPacketFault= ruleAlterPacketFault EOF ;
    public final EObject entryRuleAlterPacketFault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlterPacketFault = null;


        try {
            // InternalAgen.g:1265:57: (iv_ruleAlterPacketFault= ruleAlterPacketFault EOF )
            // InternalAgen.g:1266:2: iv_ruleAlterPacketFault= ruleAlterPacketFault EOF
            {
             newCompositeNode(grammarAccess.getAlterPacketFaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlterPacketFault=ruleAlterPacketFault();

            state._fsp--;

             current =iv_ruleAlterPacketFault; 
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
    // $ANTLR end "entryRuleAlterPacketFault"


    // $ANTLR start "ruleAlterPacketFault"
    // InternalAgen.g:1272:1: ruleAlterPacketFault returns [EObject current=null] : (otherlv_0= 'alterPacketFault' otherlv_1= '(' ( (lv_originalData_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_kindOfAlteration_4_0= ruleAlterPacketFaultType ) ) otherlv_5= ')' ) ;
    public final EObject ruleAlterPacketFault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_originalData_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_kindOfAlteration_4_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:1278:2: ( (otherlv_0= 'alterPacketFault' otherlv_1= '(' ( (lv_originalData_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_kindOfAlteration_4_0= ruleAlterPacketFaultType ) ) otherlv_5= ')' ) )
            // InternalAgen.g:1279:2: (otherlv_0= 'alterPacketFault' otherlv_1= '(' ( (lv_originalData_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_kindOfAlteration_4_0= ruleAlterPacketFaultType ) ) otherlv_5= ')' )
            {
            // InternalAgen.g:1279:2: (otherlv_0= 'alterPacketFault' otherlv_1= '(' ( (lv_originalData_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_kindOfAlteration_4_0= ruleAlterPacketFaultType ) ) otherlv_5= ')' )
            // InternalAgen.g:1280:3: otherlv_0= 'alterPacketFault' otherlv_1= '(' ( (lv_originalData_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_kindOfAlteration_4_0= ruleAlterPacketFaultType ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAlterPacketFaultAccess().getAlterPacketFaultKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getAlterPacketFaultAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:1288:3: ( (lv_originalData_2_0= RULE_INT ) )
            // InternalAgen.g:1289:4: (lv_originalData_2_0= RULE_INT )
            {
            // InternalAgen.g:1289:4: (lv_originalData_2_0= RULE_INT )
            // InternalAgen.g:1290:5: lv_originalData_2_0= RULE_INT
            {
            lv_originalData_2_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_originalData_2_0, grammarAccess.getAlterPacketFaultAccess().getOriginalDataINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlterPacketFaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"originalData",
            						lv_originalData_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getAlterPacketFaultAccess().getCommaKeyword_3());
            		
            // InternalAgen.g:1310:3: ( (lv_kindOfAlteration_4_0= ruleAlterPacketFaultType ) )
            // InternalAgen.g:1311:4: (lv_kindOfAlteration_4_0= ruleAlterPacketFaultType )
            {
            // InternalAgen.g:1311:4: (lv_kindOfAlteration_4_0= ruleAlterPacketFaultType )
            // InternalAgen.g:1312:5: lv_kindOfAlteration_4_0= ruleAlterPacketFaultType
            {

            					newCompositeNode(grammarAccess.getAlterPacketFaultAccess().getKindOfAlterationAlterPacketFaultTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_kindOfAlteration_4_0=ruleAlterPacketFaultType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlterPacketFaultRule());
            					}
            					set(
            						current,
            						"kindOfAlteration",
            						lv_kindOfAlteration_4_0,
            						"org.xtext.Agen.AlterPacketFaultType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAlterPacketFaultAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleAlterPacketFault"


    // $ANTLR start "entryRuleLeakFault"
    // InternalAgen.g:1337:1: entryRuleLeakFault returns [EObject current=null] : iv_ruleLeakFault= ruleLeakFault EOF ;
    public final EObject entryRuleLeakFault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeakFault = null;


        try {
            // InternalAgen.g:1337:50: (iv_ruleLeakFault= ruleLeakFault EOF )
            // InternalAgen.g:1338:2: iv_ruleLeakFault= ruleLeakFault EOF
            {
             newCompositeNode(grammarAccess.getLeakFaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeakFault=ruleLeakFault();

            state._fsp--;

             current =iv_ruleLeakFault; 
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
    // $ANTLR end "entryRuleLeakFault"


    // $ANTLR start "ruleLeakFault"
    // InternalAgen.g:1344:1: ruleLeakFault returns [EObject current=null] : (otherlv_0= 'leakFault' otherlv_1= '(' ( (lv_nrofLeaks_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeakFault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nrofLeaks_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgen.g:1350:2: ( (otherlv_0= 'leakFault' otherlv_1= '(' ( (lv_nrofLeaks_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalAgen.g:1351:2: (otherlv_0= 'leakFault' otherlv_1= '(' ( (lv_nrofLeaks_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalAgen.g:1351:2: (otherlv_0= 'leakFault' otherlv_1= '(' ( (lv_nrofLeaks_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalAgen.g:1352:3: otherlv_0= 'leakFault' otherlv_1= '(' ( (lv_nrofLeaks_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLeakFaultAccess().getLeakFaultKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getLeakFaultAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:1360:3: ( (lv_nrofLeaks_2_0= RULE_INT ) )
            // InternalAgen.g:1361:4: (lv_nrofLeaks_2_0= RULE_INT )
            {
            // InternalAgen.g:1361:4: (lv_nrofLeaks_2_0= RULE_INT )
            // InternalAgen.g:1362:5: lv_nrofLeaks_2_0= RULE_INT
            {
            lv_nrofLeaks_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_nrofLeaks_2_0, grammarAccess.getLeakFaultAccess().getNrofLeaksINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeakFaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nrofLeaks",
            						lv_nrofLeaks_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLeakFaultAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleLeakFault"


    // $ANTLR start "entryRuleBigPacketFault"
    // InternalAgen.g:1386:1: entryRuleBigPacketFault returns [EObject current=null] : iv_ruleBigPacketFault= ruleBigPacketFault EOF ;
    public final EObject entryRuleBigPacketFault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigPacketFault = null;


        try {
            // InternalAgen.g:1386:55: (iv_ruleBigPacketFault= ruleBigPacketFault EOF )
            // InternalAgen.g:1387:2: iv_ruleBigPacketFault= ruleBigPacketFault EOF
            {
             newCompositeNode(grammarAccess.getBigPacketFaultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBigPacketFault=ruleBigPacketFault();

            state._fsp--;

             current =iv_ruleBigPacketFault; 
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
    // $ANTLR end "entryRuleBigPacketFault"


    // $ANTLR start "ruleBigPacketFault"
    // InternalAgen.g:1393:1: ruleBigPacketFault returns [EObject current=null] : (otherlv_0= 'bigPacketFault' otherlv_1= '(' ( (lv_originalData_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_timesLarger_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject ruleBigPacketFault() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_originalData_2_0=null;
        Token otherlv_3=null;
        Token lv_timesLarger_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAgen.g:1399:2: ( (otherlv_0= 'bigPacketFault' otherlv_1= '(' ( (lv_originalData_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_timesLarger_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalAgen.g:1400:2: (otherlv_0= 'bigPacketFault' otherlv_1= '(' ( (lv_originalData_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_timesLarger_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalAgen.g:1400:2: (otherlv_0= 'bigPacketFault' otherlv_1= '(' ( (lv_originalData_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_timesLarger_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalAgen.g:1401:3: otherlv_0= 'bigPacketFault' otherlv_1= '(' ( (lv_originalData_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_timesLarger_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBigPacketFaultAccess().getBigPacketFaultKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getBigPacketFaultAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:1409:3: ( (lv_originalData_2_0= RULE_INT ) )
            // InternalAgen.g:1410:4: (lv_originalData_2_0= RULE_INT )
            {
            // InternalAgen.g:1410:4: (lv_originalData_2_0= RULE_INT )
            // InternalAgen.g:1411:5: lv_originalData_2_0= RULE_INT
            {
            lv_originalData_2_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_originalData_2_0, grammarAccess.getBigPacketFaultAccess().getOriginalDataINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBigPacketFaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"originalData",
            						lv_originalData_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getBigPacketFaultAccess().getCommaKeyword_3());
            		
            // InternalAgen.g:1431:3: ( (lv_timesLarger_4_0= RULE_INT ) )
            // InternalAgen.g:1432:4: (lv_timesLarger_4_0= RULE_INT )
            {
            // InternalAgen.g:1432:4: (lv_timesLarger_4_0= RULE_INT )
            // InternalAgen.g:1433:5: lv_timesLarger_4_0= RULE_INT
            {
            lv_timesLarger_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_timesLarger_4_0, grammarAccess.getBigPacketFaultAccess().getTimesLargerINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBigPacketFaultRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timesLarger",
            						lv_timesLarger_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBigPacketFaultAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleBigPacketFault"


    // $ANTLR start "entryRuleExit"
    // InternalAgen.g:1457:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // InternalAgen.g:1457:45: (iv_ruleExit= ruleExit EOF )
            // InternalAgen.g:1458:2: iv_ruleExit= ruleExit EOF
            {
             newCompositeNode(grammarAccess.getExitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExit=ruleExit();

            state._fsp--;

             current =iv_ruleExit; 
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
    // $ANTLR end "entryRuleExit"


    // $ANTLR start "ruleExit"
    // InternalAgen.g:1464:1: ruleExit returns [EObject current=null] : (otherlv_0= 'exit' otherlv_1= '(' ( (lv_type_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgen.g:1470:2: ( (otherlv_0= 'exit' otherlv_1= '(' ( (lv_type_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalAgen.g:1471:2: (otherlv_0= 'exit' otherlv_1= '(' ( (lv_type_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalAgen.g:1471:2: (otherlv_0= 'exit' otherlv_1= '(' ( (lv_type_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalAgen.g:1472:3: otherlv_0= 'exit' otherlv_1= '(' ( (lv_type_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getExitAccess().getExitKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getExitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:1480:3: ( (lv_type_2_0= RULE_INT ) )
            // InternalAgen.g:1481:4: (lv_type_2_0= RULE_INT )
            {
            // InternalAgen.g:1481:4: (lv_type_2_0= RULE_INT )
            // InternalAgen.g:1482:5: lv_type_2_0= RULE_INT
            {
            lv_type_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_type_2_0, grammarAccess.getExitAccess().getTypeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExitAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleExit"


    // $ANTLR start "entryRuleSleep"
    // InternalAgen.g:1506:1: entryRuleSleep returns [EObject current=null] : iv_ruleSleep= ruleSleep EOF ;
    public final EObject entryRuleSleep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSleep = null;


        try {
            // InternalAgen.g:1506:46: (iv_ruleSleep= ruleSleep EOF )
            // InternalAgen.g:1507:2: iv_ruleSleep= ruleSleep EOF
            {
             newCompositeNode(grammarAccess.getSleepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSleep=ruleSleep();

            state._fsp--;

             current =iv_ruleSleep; 
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
    // $ANTLR end "entryRuleSleep"


    // $ANTLR start "ruleSleep"
    // InternalAgen.g:1513:1: ruleSleep returns [EObject current=null] : (otherlv_0= 'sleep' otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleSleep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_time_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgen.g:1519:2: ( (otherlv_0= 'sleep' otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalAgen.g:1520:2: (otherlv_0= 'sleep' otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalAgen.g:1520:2: (otherlv_0= 'sleep' otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalAgen.g:1521:3: otherlv_0= 'sleep' otherlv_1= '(' ( (lv_time_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSleepAccess().getSleepKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getSleepAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:1529:3: ( (lv_time_2_0= RULE_INT ) )
            // InternalAgen.g:1530:4: (lv_time_2_0= RULE_INT )
            {
            // InternalAgen.g:1530:4: (lv_time_2_0= RULE_INT )
            // InternalAgen.g:1531:5: lv_time_2_0= RULE_INT
            {
            lv_time_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_time_2_0, grammarAccess.getSleepAccess().getTimeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSleepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSleepAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSleep"


    // $ANTLR start "entryRuleCPULoader"
    // InternalAgen.g:1555:1: entryRuleCPULoader returns [EObject current=null] : iv_ruleCPULoader= ruleCPULoader EOF ;
    public final EObject entryRuleCPULoader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCPULoader = null;


        try {
            // InternalAgen.g:1555:50: (iv_ruleCPULoader= ruleCPULoader EOF )
            // InternalAgen.g:1556:2: iv_ruleCPULoader= ruleCPULoader EOF
            {
             newCompositeNode(grammarAccess.getCPULoaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCPULoader=ruleCPULoader();

            state._fsp--;

             current =iv_ruleCPULoader; 
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
    // $ANTLR end "entryRuleCPULoader"


    // $ANTLR start "ruleCPULoader"
    // InternalAgen.g:1562:1: ruleCPULoader returns [EObject current=null] : (otherlv_0= 'cpuLoader' otherlv_1= '(' ( (lv_amount_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleCPULoader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_amount_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgen.g:1568:2: ( (otherlv_0= 'cpuLoader' otherlv_1= '(' ( (lv_amount_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalAgen.g:1569:2: (otherlv_0= 'cpuLoader' otherlv_1= '(' ( (lv_amount_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalAgen.g:1569:2: (otherlv_0= 'cpuLoader' otherlv_1= '(' ( (lv_amount_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalAgen.g:1570:3: otherlv_0= 'cpuLoader' otherlv_1= '(' ( (lv_amount_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getCPULoaderAccess().getCpuLoaderKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getCPULoaderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:1578:3: ( (lv_amount_2_0= RULE_INT ) )
            // InternalAgen.g:1579:4: (lv_amount_2_0= RULE_INT )
            {
            // InternalAgen.g:1579:4: (lv_amount_2_0= RULE_INT )
            // InternalAgen.g:1580:5: lv_amount_2_0= RULE_INT
            {
            lv_amount_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_amount_2_0, grammarAccess.getCPULoaderAccess().getAmountINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCPULoaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getCPULoaderAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleCPULoader"


    // $ANTLR start "entryRuleCodeBlock"
    // InternalAgen.g:1604:1: entryRuleCodeBlock returns [EObject current=null] : iv_ruleCodeBlock= ruleCodeBlock EOF ;
    public final EObject entryRuleCodeBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeBlock = null;


        try {
            // InternalAgen.g:1604:50: (iv_ruleCodeBlock= ruleCodeBlock EOF )
            // InternalAgen.g:1605:2: iv_ruleCodeBlock= ruleCodeBlock EOF
            {
             newCompositeNode(grammarAccess.getCodeBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCodeBlock=ruleCodeBlock();

            state._fsp--;

             current =iv_ruleCodeBlock; 
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
    // $ANTLR end "entryRuleCodeBlock"


    // $ANTLR start "ruleCodeBlock"
    // InternalAgen.g:1611:1: ruleCodeBlock returns [EObject current=null] : ( (otherlv_0= 'BlockID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'CodeBlock' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' ) ) ;
    public final EObject ruleCodeBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_imports_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_code_14_0=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalAgen.g:1617:2: ( ( (otherlv_0= 'BlockID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'CodeBlock' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' ) ) )
            // InternalAgen.g:1618:2: ( (otherlv_0= 'BlockID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'CodeBlock' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' ) )
            {
            // InternalAgen.g:1618:2: ( (otherlv_0= 'BlockID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'CodeBlock' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==46) ) {
                alt17=1;
            }
            else if ( (LA17_0==47) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAgen.g:1619:3: (otherlv_0= 'BlockID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // InternalAgen.g:1619:3: (otherlv_0= 'BlockID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    // InternalAgen.g:1620:4: otherlv_0= 'BlockID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getCodeBlockAccess().getBlockIDKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getCodeBlockAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalAgen.g:1628:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalAgen.g:1629:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalAgen.g:1629:5: (lv_name_2_0= RULE_ID )
                    // InternalAgen.g:1630:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getCodeBlockAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCodeBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getCodeBlockAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgen.g:1652:3: (otherlv_4= 'CodeBlock' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' )
                    {
                    // InternalAgen.g:1652:3: (otherlv_4= 'CodeBlock' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' )
                    // InternalAgen.g:1653:4: otherlv_4= 'CodeBlock' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}'
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getCodeBlockAccess().getCodeBlockKeyword_1_0());
                    			
                    // InternalAgen.g:1657:4: ( (lv_name_5_0= RULE_ID ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalAgen.g:1658:5: (lv_name_5_0= RULE_ID )
                            {
                            // InternalAgen.g:1658:5: (lv_name_5_0= RULE_ID )
                            // InternalAgen.g:1659:6: lv_name_5_0= RULE_ID
                            {
                            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                            						newLeafNode(lv_name_5_0, grammarAccess.getCodeBlockAccess().getNameIDTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getCodeBlockRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_5_0,
                            							"org.eclipse.xtext.common.Terminals.ID");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    // InternalAgen.g:1679:4: (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==48) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalAgen.g:1680:5: otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{'
                            {
                            otherlv_7=(Token)match(input,48,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getCodeBlockAccess().getImportsKeyword_1_3_0());
                            				
                            otherlv_8=(Token)match(input,13,FOLLOW_42); 

                            					newLeafNode(otherlv_8, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_3_1());
                            				
                            // InternalAgen.g:1688:5: ( (lv_imports_9_0= RULE_CODE_BOX ) )
                            // InternalAgen.g:1689:6: (lv_imports_9_0= RULE_CODE_BOX )
                            {
                            // InternalAgen.g:1689:6: (lv_imports_9_0= RULE_CODE_BOX )
                            // InternalAgen.g:1690:7: lv_imports_9_0= RULE_CODE_BOX
                            {
                            lv_imports_9_0=(Token)match(input,RULE_CODE_BOX,FOLLOW_21); 

                            							newLeafNode(lv_imports_9_0, grammarAccess.getCodeBlockAccess().getImportsCODE_BOXTerminalRuleCall_1_3_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCodeBlockRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"imports",
                            								lv_imports_9_0,
                            								"org.xtext.Agen.CODE_BOX");
                            						

                            }


                            }

                            otherlv_10=(Token)match(input,17,FOLLOW_39); 

                            					newLeafNode(otherlv_10, grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_3_3());
                            				
                            otherlv_11=(Token)match(input,40,FOLLOW_43); 

                            					newLeafNode(otherlv_11, grammarAccess.getCodeBlockAccess().getCommaKeyword_1_3_4());
                            				
                            otherlv_12=(Token)match(input,49,FOLLOW_4); 

                            					newLeafNode(otherlv_12, grammarAccess.getCodeBlockAccess().getCodeKeyword_1_3_5());
                            				
                            otherlv_13=(Token)match(input,13,FOLLOW_42); 

                            					newLeafNode(otherlv_13, grammarAccess.getCodeBlockAccess().getLeftCurlyBracketKeyword_1_3_6());
                            				

                            }
                            break;

                    }

                    // InternalAgen.g:1723:4: ( (lv_code_14_0= RULE_CODE_BOX ) )
                    // InternalAgen.g:1724:5: (lv_code_14_0= RULE_CODE_BOX )
                    {
                    // InternalAgen.g:1724:5: (lv_code_14_0= RULE_CODE_BOX )
                    // InternalAgen.g:1725:6: lv_code_14_0= RULE_CODE_BOX
                    {
                    lv_code_14_0=(Token)match(input,RULE_CODE_BOX,FOLLOW_21); 

                    						newLeafNode(lv_code_14_0, grammarAccess.getCodeBlockAccess().getCodeCODE_BOXTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCodeBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"code",
                    							lv_code_14_0,
                    							"org.xtext.Agen.CODE_BOX");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getCodeBlockAccess().getRightCurlyBracketKeyword_1_5());
                    			

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
    // $ANTLR end "ruleCodeBlock"


    // $ANTLR start "entryRuleFaultCond"
    // InternalAgen.g:1750:1: entryRuleFaultCond returns [EObject current=null] : iv_ruleFaultCond= ruleFaultCond EOF ;
    public final EObject entryRuleFaultCond() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFaultCond = null;


        try {
            // InternalAgen.g:1750:50: (iv_ruleFaultCond= ruleFaultCond EOF )
            // InternalAgen.g:1751:2: iv_ruleFaultCond= ruleFaultCond EOF
            {
             newCompositeNode(grammarAccess.getFaultCondRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFaultCond=ruleFaultCond();

            state._fsp--;

             current =iv_ruleFaultCond; 
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
    // $ANTLR end "entryRuleFaultCond"


    // $ANTLR start "ruleFaultCond"
    // InternalAgen.g:1757:1: ruleFaultCond returns [EObject current=null] : ( (otherlv_0= 'FaultCond' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'FaultCond' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_where_5_0= ruleWhere ) ) otherlv_6= ';' (otherlv_7= 'whenToIncrement{' ( (lv_when_8_0= ruleWhen ) ) otherlv_9= '}' )? ( (lv_extraData_10_0= ruleCodeBlock ) )? otherlv_11= '}' ) ) ;
    public final EObject ruleFaultCond() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_where_5_0 = null;

        EObject lv_when_8_0 = null;

        EObject lv_extraData_10_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:1763:2: ( ( (otherlv_0= 'FaultCond' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'FaultCond' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_where_5_0= ruleWhere ) ) otherlv_6= ';' (otherlv_7= 'whenToIncrement{' ( (lv_when_8_0= ruleWhen ) ) otherlv_9= '}' )? ( (lv_extraData_10_0= ruleCodeBlock ) )? otherlv_11= '}' ) ) )
            // InternalAgen.g:1764:2: ( (otherlv_0= 'FaultCond' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'FaultCond' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_where_5_0= ruleWhere ) ) otherlv_6= ';' (otherlv_7= 'whenToIncrement{' ( (lv_when_8_0= ruleWhen ) ) otherlv_9= '}' )? ( (lv_extraData_10_0= ruleCodeBlock ) )? otherlv_11= '}' ) )
            {
            // InternalAgen.g:1764:2: ( (otherlv_0= 'FaultCond' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= 'FaultCond' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_where_5_0= ruleWhere ) ) otherlv_6= ';' (otherlv_7= 'whenToIncrement{' ( (lv_when_8_0= ruleWhen ) ) otherlv_9= '}' )? ( (lv_extraData_10_0= ruleCodeBlock ) )? otherlv_11= '}' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==RULE_ID) ) {
                    int LA21_2 = input.LA(3);

                    if ( (LA21_2==13) ) {
                        alt21=2;
                    }
                    else if ( (LA21_2==EOF||LA21_2==12||LA21_2==17||(LA21_2>=23 && LA21_2<=24)||LA21_2==27||LA21_2==31||(LA21_2>=46 && LA21_2<=47)||LA21_2==50||(LA21_2>=58 && LA21_2<=60)) ) {
                        alt21=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA21_1==13) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalAgen.g:1765:3: (otherlv_0= 'FaultCond' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalAgen.g:1765:3: (otherlv_0= 'FaultCond' ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalAgen.g:1766:4: otherlv_0= 'FaultCond' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,50,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getFaultCondAccess().getFaultCondKeyword_0_0());
                    			
                    // InternalAgen.g:1770:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalAgen.g:1771:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalAgen.g:1771:5: (lv_name_1_0= RULE_ID )
                    // InternalAgen.g:1772:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getFaultCondAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFaultCondRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAgen.g:1790:3: (otherlv_2= 'FaultCond' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_where_5_0= ruleWhere ) ) otherlv_6= ';' (otherlv_7= 'whenToIncrement{' ( (lv_when_8_0= ruleWhen ) ) otherlv_9= '}' )? ( (lv_extraData_10_0= ruleCodeBlock ) )? otherlv_11= '}' )
                    {
                    // InternalAgen.g:1790:3: (otherlv_2= 'FaultCond' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_where_5_0= ruleWhere ) ) otherlv_6= ';' (otherlv_7= 'whenToIncrement{' ( (lv_when_8_0= ruleWhen ) ) otherlv_9= '}' )? ( (lv_extraData_10_0= ruleCodeBlock ) )? otherlv_11= '}' )
                    // InternalAgen.g:1791:4: otherlv_2= 'FaultCond' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= '{' ( (lv_where_5_0= ruleWhere ) ) otherlv_6= ';' (otherlv_7= 'whenToIncrement{' ( (lv_when_8_0= ruleWhen ) ) otherlv_9= '}' )? ( (lv_extraData_10_0= ruleCodeBlock ) )? otherlv_11= '}'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getFaultCondAccess().getFaultCondKeyword_1_0());
                    			
                    // InternalAgen.g:1795:4: ( (lv_name_3_0= RULE_ID ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalAgen.g:1796:5: (lv_name_3_0= RULE_ID )
                            {
                            // InternalAgen.g:1796:5: (lv_name_3_0= RULE_ID )
                            // InternalAgen.g:1797:6: lv_name_3_0= RULE_ID
                            {
                            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                            						newLeafNode(lv_name_3_0, grammarAccess.getFaultCondAccess().getNameIDTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFaultCondRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_3_0,
                            							"org.eclipse.xtext.common.Terminals.ID");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_44); 

                    				newLeafNode(otherlv_4, grammarAccess.getFaultCondAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    // InternalAgen.g:1817:4: ( (lv_where_5_0= ruleWhere ) )
                    // InternalAgen.g:1818:5: (lv_where_5_0= ruleWhere )
                    {
                    // InternalAgen.g:1818:5: (lv_where_5_0= ruleWhere )
                    // InternalAgen.g:1819:6: lv_where_5_0= ruleWhere
                    {

                    						newCompositeNode(grammarAccess.getFaultCondAccess().getWhereWhereParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_where_5_0=ruleWhere();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFaultCondRule());
                    						}
                    						set(
                    							current,
                    							"where",
                    							lv_where_5_0,
                    							"org.xtext.Agen.Where");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_45); 

                    				newLeafNode(otherlv_6, grammarAccess.getFaultCondAccess().getSemicolonKeyword_1_4());
                    			
                    // InternalAgen.g:1840:4: (otherlv_7= 'whenToIncrement{' ( (lv_when_8_0= ruleWhen ) ) otherlv_9= '}' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==51) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalAgen.g:1841:5: otherlv_7= 'whenToIncrement{' ( (lv_when_8_0= ruleWhen ) ) otherlv_9= '}'
                            {
                            otherlv_7=(Token)match(input,51,FOLLOW_35); 

                            					newLeafNode(otherlv_7, grammarAccess.getFaultCondAccess().getWhenToIncrementKeyword_1_5_0());
                            				
                            // InternalAgen.g:1845:5: ( (lv_when_8_0= ruleWhen ) )
                            // InternalAgen.g:1846:6: (lv_when_8_0= ruleWhen )
                            {
                            // InternalAgen.g:1846:6: (lv_when_8_0= ruleWhen )
                            // InternalAgen.g:1847:7: lv_when_8_0= ruleWhen
                            {

                            							newCompositeNode(grammarAccess.getFaultCondAccess().getWhenWhenParserRuleCall_1_5_1_0());
                            						
                            pushFollow(FOLLOW_21);
                            lv_when_8_0=ruleWhen();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFaultCondRule());
                            							}
                            							set(
                            								current,
                            								"when",
                            								lv_when_8_0,
                            								"org.xtext.Agen.When");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_9=(Token)match(input,17,FOLLOW_46); 

                            					newLeafNode(otherlv_9, grammarAccess.getFaultCondAccess().getRightCurlyBracketKeyword_1_5_2());
                            				

                            }
                            break;

                    }

                    // InternalAgen.g:1869:4: ( (lv_extraData_10_0= ruleCodeBlock ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=46 && LA20_0<=47)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalAgen.g:1870:5: (lv_extraData_10_0= ruleCodeBlock )
                            {
                            // InternalAgen.g:1870:5: (lv_extraData_10_0= ruleCodeBlock )
                            // InternalAgen.g:1871:6: lv_extraData_10_0= ruleCodeBlock
                            {

                            						newCompositeNode(grammarAccess.getFaultCondAccess().getExtraDataCodeBlockParserRuleCall_1_6_0());
                            					
                            pushFollow(FOLLOW_21);
                            lv_extraData_10_0=ruleCodeBlock();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getFaultCondRule());
                            						}
                            						set(
                            							current,
                            							"extraData",
                            							lv_extraData_10_0,
                            							"org.xtext.Agen.CodeBlock");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getFaultCondAccess().getRightCurlyBracketKeyword_1_7());
                    			

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
    // $ANTLR end "ruleFaultCond"


    // $ANTLR start "entryRuleWhen"
    // InternalAgen.g:1897:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalAgen.g:1897:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalAgen.g:1898:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalAgen.g:1904:1: ruleWhen returns [EObject current=null] : ( ( (lv_betweenRounds_0_0= rulebetweenRounds ) ) | ( (lv_betweenSeconds_1_0= rulebetweenSeconds ) ) | ( (lv_random_2_0= ruleRandom ) ) | ( (lv_randomBetweenRound_3_0= rulerandomBetweenRound ) ) | (otherlv_4= 'ifCondition' otherlv_5= '(' ( (lv_ifCondition_6_0= ruleCondition ) ) otherlv_7= ')' ) | ( (lv_faultCond_8_0= ruleFaultCond ) ) | (otherlv_9= 'syncpoint' otherlv_10= '=' ( (lv_syncpoint_11_0= RULE_ID ) ) ) ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_syncpoint_11_0=null;
        EObject lv_betweenRounds_0_0 = null;

        EObject lv_betweenSeconds_1_0 = null;

        EObject lv_random_2_0 = null;

        EObject lv_randomBetweenRound_3_0 = null;

        EObject lv_ifCondition_6_0 = null;

        EObject lv_faultCond_8_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:1910:2: ( ( ( (lv_betweenRounds_0_0= rulebetweenRounds ) ) | ( (lv_betweenSeconds_1_0= rulebetweenSeconds ) ) | ( (lv_random_2_0= ruleRandom ) ) | ( (lv_randomBetweenRound_3_0= rulerandomBetweenRound ) ) | (otherlv_4= 'ifCondition' otherlv_5= '(' ( (lv_ifCondition_6_0= ruleCondition ) ) otherlv_7= ')' ) | ( (lv_faultCond_8_0= ruleFaultCond ) ) | (otherlv_9= 'syncpoint' otherlv_10= '=' ( (lv_syncpoint_11_0= RULE_ID ) ) ) ) )
            // InternalAgen.g:1911:2: ( ( (lv_betweenRounds_0_0= rulebetweenRounds ) ) | ( (lv_betweenSeconds_1_0= rulebetweenSeconds ) ) | ( (lv_random_2_0= ruleRandom ) ) | ( (lv_randomBetweenRound_3_0= rulerandomBetweenRound ) ) | (otherlv_4= 'ifCondition' otherlv_5= '(' ( (lv_ifCondition_6_0= ruleCondition ) ) otherlv_7= ')' ) | ( (lv_faultCond_8_0= ruleFaultCond ) ) | (otherlv_9= 'syncpoint' otherlv_10= '=' ( (lv_syncpoint_11_0= RULE_ID ) ) ) )
            {
            // InternalAgen.g:1911:2: ( ( (lv_betweenRounds_0_0= rulebetweenRounds ) ) | ( (lv_betweenSeconds_1_0= rulebetweenSeconds ) ) | ( (lv_random_2_0= ruleRandom ) ) | ( (lv_randomBetweenRound_3_0= rulerandomBetweenRound ) ) | (otherlv_4= 'ifCondition' otherlv_5= '(' ( (lv_ifCondition_6_0= ruleCondition ) ) otherlv_7= ')' ) | ( (lv_faultCond_8_0= ruleFaultCond ) ) | (otherlv_9= 'syncpoint' otherlv_10= '=' ( (lv_syncpoint_11_0= RULE_ID ) ) ) )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt22=1;
                }
                break;
            case 55:
                {
                alt22=2;
                }
                break;
            case 54:
                {
                alt22=3;
                }
                break;
            case 57:
                {
                alt22=4;
                }
                break;
            case 52:
                {
                alt22=5;
                }
                break;
            case 50:
                {
                alt22=6;
                }
                break;
            case 53:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAgen.g:1912:3: ( (lv_betweenRounds_0_0= rulebetweenRounds ) )
                    {
                    // InternalAgen.g:1912:3: ( (lv_betweenRounds_0_0= rulebetweenRounds ) )
                    // InternalAgen.g:1913:4: (lv_betweenRounds_0_0= rulebetweenRounds )
                    {
                    // InternalAgen.g:1913:4: (lv_betweenRounds_0_0= rulebetweenRounds )
                    // InternalAgen.g:1914:5: lv_betweenRounds_0_0= rulebetweenRounds
                    {

                    					newCompositeNode(grammarAccess.getWhenAccess().getBetweenRoundsBetweenRoundsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_betweenRounds_0_0=rulebetweenRounds();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhenRule());
                    					}
                    					set(
                    						current,
                    						"betweenRounds",
                    						lv_betweenRounds_0_0,
                    						"org.xtext.Agen.betweenRounds");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAgen.g:1932:3: ( (lv_betweenSeconds_1_0= rulebetweenSeconds ) )
                    {
                    // InternalAgen.g:1932:3: ( (lv_betweenSeconds_1_0= rulebetweenSeconds ) )
                    // InternalAgen.g:1933:4: (lv_betweenSeconds_1_0= rulebetweenSeconds )
                    {
                    // InternalAgen.g:1933:4: (lv_betweenSeconds_1_0= rulebetweenSeconds )
                    // InternalAgen.g:1934:5: lv_betweenSeconds_1_0= rulebetweenSeconds
                    {

                    					newCompositeNode(grammarAccess.getWhenAccess().getBetweenSecondsBetweenSecondsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_betweenSeconds_1_0=rulebetweenSeconds();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhenRule());
                    					}
                    					set(
                    						current,
                    						"betweenSeconds",
                    						lv_betweenSeconds_1_0,
                    						"org.xtext.Agen.betweenSeconds");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAgen.g:1952:3: ( (lv_random_2_0= ruleRandom ) )
                    {
                    // InternalAgen.g:1952:3: ( (lv_random_2_0= ruleRandom ) )
                    // InternalAgen.g:1953:4: (lv_random_2_0= ruleRandom )
                    {
                    // InternalAgen.g:1953:4: (lv_random_2_0= ruleRandom )
                    // InternalAgen.g:1954:5: lv_random_2_0= ruleRandom
                    {

                    					newCompositeNode(grammarAccess.getWhenAccess().getRandomRandomParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_random_2_0=ruleRandom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhenRule());
                    					}
                    					set(
                    						current,
                    						"random",
                    						lv_random_2_0,
                    						"org.xtext.Agen.Random");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAgen.g:1972:3: ( (lv_randomBetweenRound_3_0= rulerandomBetweenRound ) )
                    {
                    // InternalAgen.g:1972:3: ( (lv_randomBetweenRound_3_0= rulerandomBetweenRound ) )
                    // InternalAgen.g:1973:4: (lv_randomBetweenRound_3_0= rulerandomBetweenRound )
                    {
                    // InternalAgen.g:1973:4: (lv_randomBetweenRound_3_0= rulerandomBetweenRound )
                    // InternalAgen.g:1974:5: lv_randomBetweenRound_3_0= rulerandomBetweenRound
                    {

                    					newCompositeNode(grammarAccess.getWhenAccess().getRandomBetweenRoundRandomBetweenRoundParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_randomBetweenRound_3_0=rulerandomBetweenRound();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhenRule());
                    					}
                    					set(
                    						current,
                    						"randomBetweenRound",
                    						lv_randomBetweenRound_3_0,
                    						"org.xtext.Agen.randomBetweenRound");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAgen.g:1992:3: (otherlv_4= 'ifCondition' otherlv_5= '(' ( (lv_ifCondition_6_0= ruleCondition ) ) otherlv_7= ')' )
                    {
                    // InternalAgen.g:1992:3: (otherlv_4= 'ifCondition' otherlv_5= '(' ( (lv_ifCondition_6_0= ruleCondition ) ) otherlv_7= ')' )
                    // InternalAgen.g:1993:4: otherlv_4= 'ifCondition' otherlv_5= '(' ( (lv_ifCondition_6_0= ruleCondition ) ) otherlv_7= ')'
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getWhenAccess().getIfConditionKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,19,FOLLOW_47); 

                    				newLeafNode(otherlv_5, grammarAccess.getWhenAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalAgen.g:2001:4: ( (lv_ifCondition_6_0= ruleCondition ) )
                    // InternalAgen.g:2002:5: (lv_ifCondition_6_0= ruleCondition )
                    {
                    // InternalAgen.g:2002:5: (lv_ifCondition_6_0= ruleCondition )
                    // InternalAgen.g:2003:6: lv_ifCondition_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getWhenAccess().getIfConditionConditionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_ifCondition_6_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhenRule());
                    						}
                    						set(
                    							current,
                    							"ifCondition",
                    							lv_ifCondition_6_0,
                    							"org.xtext.Agen.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getWhenAccess().getRightParenthesisKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAgen.g:2026:3: ( (lv_faultCond_8_0= ruleFaultCond ) )
                    {
                    // InternalAgen.g:2026:3: ( (lv_faultCond_8_0= ruleFaultCond ) )
                    // InternalAgen.g:2027:4: (lv_faultCond_8_0= ruleFaultCond )
                    {
                    // InternalAgen.g:2027:4: (lv_faultCond_8_0= ruleFaultCond )
                    // InternalAgen.g:2028:5: lv_faultCond_8_0= ruleFaultCond
                    {

                    					newCompositeNode(grammarAccess.getWhenAccess().getFaultCondFaultCondParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_faultCond_8_0=ruleFaultCond();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhenRule());
                    					}
                    					set(
                    						current,
                    						"faultCond",
                    						lv_faultCond_8_0,
                    						"org.xtext.Agen.FaultCond");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAgen.g:2046:3: (otherlv_9= 'syncpoint' otherlv_10= '=' ( (lv_syncpoint_11_0= RULE_ID ) ) )
                    {
                    // InternalAgen.g:2046:3: (otherlv_9= 'syncpoint' otherlv_10= '=' ( (lv_syncpoint_11_0= RULE_ID ) ) )
                    // InternalAgen.g:2047:4: otherlv_9= 'syncpoint' otherlv_10= '=' ( (lv_syncpoint_11_0= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,53,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getWhenAccess().getSyncpointKeyword_6_0());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getWhenAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalAgen.g:2055:4: ( (lv_syncpoint_11_0= RULE_ID ) )
                    // InternalAgen.g:2056:5: (lv_syncpoint_11_0= RULE_ID )
                    {
                    // InternalAgen.g:2056:5: (lv_syncpoint_11_0= RULE_ID )
                    // InternalAgen.g:2057:6: lv_syncpoint_11_0= RULE_ID
                    {
                    lv_syncpoint_11_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_syncpoint_11_0, grammarAccess.getWhenAccess().getSyncpointIDTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhenRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"syncpoint",
                    							lv_syncpoint_11_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


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
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleRandom"
    // InternalAgen.g:2078:1: entryRuleRandom returns [EObject current=null] : iv_ruleRandom= ruleRandom EOF ;
    public final EObject entryRuleRandom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandom = null;


        try {
            // InternalAgen.g:2078:47: (iv_ruleRandom= ruleRandom EOF )
            // InternalAgen.g:2079:2: iv_ruleRandom= ruleRandom EOF
            {
             newCompositeNode(grammarAccess.getRandomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandom=ruleRandom();

            state._fsp--;

             current =iv_ruleRandom; 
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
    // $ANTLR end "entryRuleRandom"


    // $ANTLR start "ruleRandom"
    // InternalAgen.g:2085:1: ruleRandom returns [EObject current=null] : (otherlv_0= 'random' otherlv_1= '(' ( (lv_chance_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleRandom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_chance_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAgen.g:2091:2: ( (otherlv_0= 'random' otherlv_1= '(' ( (lv_chance_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalAgen.g:2092:2: (otherlv_0= 'random' otherlv_1= '(' ( (lv_chance_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalAgen.g:2092:2: (otherlv_0= 'random' otherlv_1= '(' ( (lv_chance_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalAgen.g:2093:3: otherlv_0= 'random' otherlv_1= '(' ( (lv_chance_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRandomAccess().getRandomKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRandomAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:2101:3: ( (lv_chance_2_0= RULE_INT ) )
            // InternalAgen.g:2102:4: (lv_chance_2_0= RULE_INT )
            {
            // InternalAgen.g:2102:4: (lv_chance_2_0= RULE_INT )
            // InternalAgen.g:2103:5: lv_chance_2_0= RULE_INT
            {
            lv_chance_2_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_chance_2_0, grammarAccess.getRandomAccess().getChanceINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"chance",
            						lv_chance_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRandomAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleRandom"


    // $ANTLR start "entryRulebetweenSeconds"
    // InternalAgen.g:2127:1: entryRulebetweenSeconds returns [EObject current=null] : iv_rulebetweenSeconds= rulebetweenSeconds EOF ;
    public final EObject entryRulebetweenSeconds() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebetweenSeconds = null;


        try {
            // InternalAgen.g:2127:55: (iv_rulebetweenSeconds= rulebetweenSeconds EOF )
            // InternalAgen.g:2128:2: iv_rulebetweenSeconds= rulebetweenSeconds EOF
            {
             newCompositeNode(grammarAccess.getBetweenSecondsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebetweenSeconds=rulebetweenSeconds();

            state._fsp--;

             current =iv_rulebetweenSeconds; 
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
    // $ANTLR end "entryRulebetweenSeconds"


    // $ANTLR start "rulebetweenSeconds"
    // InternalAgen.g:2134:1: rulebetweenSeconds returns [EObject current=null] : (otherlv_0= 'betweenSeconds' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ')' ) ;
    public final EObject rulebetweenSeconds() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAgen.g:2140:2: ( (otherlv_0= 'betweenSeconds' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ')' ) )
            // InternalAgen.g:2141:2: (otherlv_0= 'betweenSeconds' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ')' )
            {
            // InternalAgen.g:2141:2: (otherlv_0= 'betweenSeconds' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ')' )
            // InternalAgen.g:2142:3: otherlv_0= 'betweenSeconds' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBetweenSecondsAccess().getBetweenSecondsKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getBetweenSecondsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:2150:3: ( (lv_start_2_0= RULE_INT ) )
            // InternalAgen.g:2151:4: (lv_start_2_0= RULE_INT )
            {
            // InternalAgen.g:2151:4: (lv_start_2_0= RULE_INT )
            // InternalAgen.g:2152:5: lv_start_2_0= RULE_INT
            {
            lv_start_2_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_start_2_0, grammarAccess.getBetweenSecondsAccess().getStartINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBetweenSecondsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getBetweenSecondsAccess().getCommaKeyword_3());
            		
            // InternalAgen.g:2172:3: ( (lv_end_4_0= RULE_INT ) )
            // InternalAgen.g:2173:4: (lv_end_4_0= RULE_INT )
            {
            // InternalAgen.g:2173:4: (lv_end_4_0= RULE_INT )
            // InternalAgen.g:2174:5: lv_end_4_0= RULE_INT
            {
            lv_end_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_end_4_0, grammarAccess.getBetweenSecondsAccess().getEndINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBetweenSecondsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBetweenSecondsAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "rulebetweenSeconds"


    // $ANTLR start "entryRulebetweenRounds"
    // InternalAgen.g:2198:1: entryRulebetweenRounds returns [EObject current=null] : iv_rulebetweenRounds= rulebetweenRounds EOF ;
    public final EObject entryRulebetweenRounds() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebetweenRounds = null;


        try {
            // InternalAgen.g:2198:54: (iv_rulebetweenRounds= rulebetweenRounds EOF )
            // InternalAgen.g:2199:2: iv_rulebetweenRounds= rulebetweenRounds EOF
            {
             newCompositeNode(grammarAccess.getBetweenRoundsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebetweenRounds=rulebetweenRounds();

            state._fsp--;

             current =iv_rulebetweenRounds; 
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
    // $ANTLR end "entryRulebetweenRounds"


    // $ANTLR start "rulebetweenRounds"
    // InternalAgen.g:2205:1: rulebetweenRounds returns [EObject current=null] : (otherlv_0= 'betweenRound' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_interval_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_condition_8_0= ruleCondition ) ) )? (otherlv_9= ',' ( (lv_random_10_0= ruleRandom ) ) )? otherlv_11= ')' ) ;
    public final EObject rulebetweenRounds() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;
        Token lv_interval_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_condition_8_0 = null;

        EObject lv_random_10_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:2211:2: ( (otherlv_0= 'betweenRound' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_interval_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_condition_8_0= ruleCondition ) ) )? (otherlv_9= ',' ( (lv_random_10_0= ruleRandom ) ) )? otherlv_11= ')' ) )
            // InternalAgen.g:2212:2: (otherlv_0= 'betweenRound' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_interval_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_condition_8_0= ruleCondition ) ) )? (otherlv_9= ',' ( (lv_random_10_0= ruleRandom ) ) )? otherlv_11= ')' )
            {
            // InternalAgen.g:2212:2: (otherlv_0= 'betweenRound' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_interval_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_condition_8_0= ruleCondition ) ) )? (otherlv_9= ',' ( (lv_random_10_0= ruleRandom ) ) )? otherlv_11= ')' )
            // InternalAgen.g:2213:3: otherlv_0= 'betweenRound' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_interval_6_0= RULE_INT ) ) (otherlv_7= ',' ( (lv_condition_8_0= ruleCondition ) ) )? (otherlv_9= ',' ( (lv_random_10_0= ruleRandom ) ) )? otherlv_11= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBetweenRoundsAccess().getBetweenRoundKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getBetweenRoundsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:2221:3: ( (lv_start_2_0= RULE_INT ) )
            // InternalAgen.g:2222:4: (lv_start_2_0= RULE_INT )
            {
            // InternalAgen.g:2222:4: (lv_start_2_0= RULE_INT )
            // InternalAgen.g:2223:5: lv_start_2_0= RULE_INT
            {
            lv_start_2_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_start_2_0, grammarAccess.getBetweenRoundsAccess().getStartINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBetweenRoundsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getBetweenRoundsAccess().getCommaKeyword_3());
            		
            // InternalAgen.g:2243:3: ( (lv_end_4_0= RULE_INT ) )
            // InternalAgen.g:2244:4: (lv_end_4_0= RULE_INT )
            {
            // InternalAgen.g:2244:4: (lv_end_4_0= RULE_INT )
            // InternalAgen.g:2245:5: lv_end_4_0= RULE_INT
            {
            lv_end_4_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_end_4_0, grammarAccess.getBetweenRoundsAccess().getEndINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBetweenRoundsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getBetweenRoundsAccess().getCommaKeyword_5());
            		
            // InternalAgen.g:2265:3: ( (lv_interval_6_0= RULE_INT ) )
            // InternalAgen.g:2266:4: (lv_interval_6_0= RULE_INT )
            {
            // InternalAgen.g:2266:4: (lv_interval_6_0= RULE_INT )
            // InternalAgen.g:2267:5: lv_interval_6_0= RULE_INT
            {
            lv_interval_6_0=(Token)match(input,RULE_INT,FOLLOW_48); 

            					newLeafNode(lv_interval_6_0, grammarAccess.getBetweenRoundsAccess().getIntervalINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBetweenRoundsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interval",
            						lv_interval_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalAgen.g:2283:3: (otherlv_7= ',' ( (lv_condition_8_0= ruleCondition ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                int LA23_1 = input.LA(2);

                if ( ((LA23_1>=58 && LA23_1<=59)) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalAgen.g:2284:4: otherlv_7= ',' ( (lv_condition_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_47); 

                    				newLeafNode(otherlv_7, grammarAccess.getBetweenRoundsAccess().getCommaKeyword_7_0());
                    			
                    // InternalAgen.g:2288:4: ( (lv_condition_8_0= ruleCondition ) )
                    // InternalAgen.g:2289:5: (lv_condition_8_0= ruleCondition )
                    {
                    // InternalAgen.g:2289:5: (lv_condition_8_0= ruleCondition )
                    // InternalAgen.g:2290:6: lv_condition_8_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getBetweenRoundsAccess().getConditionConditionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_condition_8_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBetweenRoundsRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_8_0,
                    							"org.xtext.Agen.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAgen.g:2308:3: (otherlv_9= ',' ( (lv_random_10_0= ruleRandom ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAgen.g:2309:4: otherlv_9= ',' ( (lv_random_10_0= ruleRandom ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_49); 

                    				newLeafNode(otherlv_9, grammarAccess.getBetweenRoundsAccess().getCommaKeyword_8_0());
                    			
                    // InternalAgen.g:2313:4: ( (lv_random_10_0= ruleRandom ) )
                    // InternalAgen.g:2314:5: (lv_random_10_0= ruleRandom )
                    {
                    // InternalAgen.g:2314:5: (lv_random_10_0= ruleRandom )
                    // InternalAgen.g:2315:6: lv_random_10_0= ruleRandom
                    {

                    						newCompositeNode(grammarAccess.getBetweenRoundsAccess().getRandomRandomParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_random_10_0=ruleRandom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBetweenRoundsRule());
                    						}
                    						set(
                    							current,
                    							"random",
                    							lv_random_10_0,
                    							"org.xtext.Agen.Random");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getBetweenRoundsAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "rulebetweenRounds"


    // $ANTLR start "entryRulerandomBetweenRound"
    // InternalAgen.g:2341:1: entryRulerandomBetweenRound returns [EObject current=null] : iv_rulerandomBetweenRound= rulerandomBetweenRound EOF ;
    public final EObject entryRulerandomBetweenRound() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerandomBetweenRound = null;


        try {
            // InternalAgen.g:2341:59: (iv_rulerandomBetweenRound= rulerandomBetweenRound EOF )
            // InternalAgen.g:2342:2: iv_rulerandomBetweenRound= rulerandomBetweenRound EOF
            {
             newCompositeNode(grammarAccess.getRandomBetweenRoundRule()); 
            pushFollow(FOLLOW_1);
            iv_rulerandomBetweenRound=rulerandomBetweenRound();

            state._fsp--;

             current =iv_rulerandomBetweenRound; 
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
    // $ANTLR end "entryRulerandomBetweenRound"


    // $ANTLR start "rulerandomBetweenRound"
    // InternalAgen.g:2348:1: rulerandomBetweenRound returns [EObject current=null] : (otherlv_0= 'randomBetweenRound' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_interval_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_chance_8_0= RULE_INT ) ) otherlv_9= ')' ) ;
    public final EObject rulerandomBetweenRound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;
        Token lv_interval_6_0=null;
        Token otherlv_7=null;
        Token lv_chance_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalAgen.g:2354:2: ( (otherlv_0= 'randomBetweenRound' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_interval_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_chance_8_0= RULE_INT ) ) otherlv_9= ')' ) )
            // InternalAgen.g:2355:2: (otherlv_0= 'randomBetweenRound' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_interval_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_chance_8_0= RULE_INT ) ) otherlv_9= ')' )
            {
            // InternalAgen.g:2355:2: (otherlv_0= 'randomBetweenRound' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_interval_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_chance_8_0= RULE_INT ) ) otherlv_9= ')' )
            // InternalAgen.g:2356:3: otherlv_0= 'randomBetweenRound' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_interval_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_chance_8_0= RULE_INT ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getRandomBetweenRoundAccess().getRandomBetweenRoundKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getRandomBetweenRoundAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAgen.g:2364:3: ( (lv_start_2_0= RULE_INT ) )
            // InternalAgen.g:2365:4: (lv_start_2_0= RULE_INT )
            {
            // InternalAgen.g:2365:4: (lv_start_2_0= RULE_INT )
            // InternalAgen.g:2366:5: lv_start_2_0= RULE_INT
            {
            lv_start_2_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_start_2_0, grammarAccess.getRandomBetweenRoundAccess().getStartINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandomBetweenRoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getRandomBetweenRoundAccess().getCommaKeyword_3());
            		
            // InternalAgen.g:2386:3: ( (lv_end_4_0= RULE_INT ) )
            // InternalAgen.g:2387:4: (lv_end_4_0= RULE_INT )
            {
            // InternalAgen.g:2387:4: (lv_end_4_0= RULE_INT )
            // InternalAgen.g:2388:5: lv_end_4_0= RULE_INT
            {
            lv_end_4_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_end_4_0, grammarAccess.getRandomBetweenRoundAccess().getEndINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandomBetweenRoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_5, grammarAccess.getRandomBetweenRoundAccess().getCommaKeyword_5());
            		
            // InternalAgen.g:2408:3: ( (lv_interval_6_0= RULE_INT ) )
            // InternalAgen.g:2409:4: (lv_interval_6_0= RULE_INT )
            {
            // InternalAgen.g:2409:4: (lv_interval_6_0= RULE_INT )
            // InternalAgen.g:2410:5: lv_interval_6_0= RULE_INT
            {
            lv_interval_6_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_interval_6_0, grammarAccess.getRandomBetweenRoundAccess().getIntervalINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandomBetweenRoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interval",
            						lv_interval_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,40,FOLLOW_38); 

            			newLeafNode(otherlv_7, grammarAccess.getRandomBetweenRoundAccess().getCommaKeyword_7());
            		
            // InternalAgen.g:2430:3: ( (lv_chance_8_0= RULE_INT ) )
            // InternalAgen.g:2431:4: (lv_chance_8_0= RULE_INT )
            {
            // InternalAgen.g:2431:4: (lv_chance_8_0= RULE_INT )
            // InternalAgen.g:2432:5: lv_chance_8_0= RULE_INT
            {
            lv_chance_8_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            					newLeafNode(lv_chance_8_0, grammarAccess.getRandomBetweenRoundAccess().getChanceINTTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandomBetweenRoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"chance",
            						lv_chance_8_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRandomBetweenRoundAccess().getRightParenthesisKeyword_9());
            		

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
    // $ANTLR end "rulerandomBetweenRound"


    // $ANTLR start "entryRuleCondition"
    // InternalAgen.g:2456:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalAgen.g:2456:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalAgen.g:2457:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalAgen.g:2463:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= 'CondID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Condition' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_imports_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_code_14_0=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalAgen.g:2469:2: ( ( (otherlv_0= 'CondID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Condition' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' ) ) )
            // InternalAgen.g:2470:2: ( (otherlv_0= 'CondID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Condition' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' ) )
            {
            // InternalAgen.g:2470:2: ( (otherlv_0= 'CondID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Condition' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==58) ) {
                alt27=1;
            }
            else if ( (LA27_0==59) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalAgen.g:2471:3: (otherlv_0= 'CondID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // InternalAgen.g:2471:3: (otherlv_0= 'CondID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    // InternalAgen.g:2472:4: otherlv_0= 'CondID' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,58,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getCondIDKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalAgen.g:2480:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalAgen.g:2481:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalAgen.g:2481:5: (lv_name_2_0= RULE_ID )
                    // InternalAgen.g:2482:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgen.g:2504:3: (otherlv_4= 'Condition' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' )
                    {
                    // InternalAgen.g:2504:3: (otherlv_4= 'Condition' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}' )
                    // InternalAgen.g:2505:4: otherlv_4= 'Condition' ( (lv_name_5_0= RULE_ID ) )? otherlv_6= '{' (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )? ( (lv_code_14_0= RULE_CODE_BOX ) ) otherlv_15= '}'
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getConditionKeyword_1_0());
                    			
                    // InternalAgen.g:2509:4: ( (lv_name_5_0= RULE_ID ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalAgen.g:2510:5: (lv_name_5_0= RULE_ID )
                            {
                            // InternalAgen.g:2510:5: (lv_name_5_0= RULE_ID )
                            // InternalAgen.g:2511:6: lv_name_5_0= RULE_ID
                            {
                            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                            						newLeafNode(lv_name_5_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getConditionRule());
                            						}
                            						setWithLastConsumed(
                            							current,
                            							"name",
                            							lv_name_5_0,
                            							"org.eclipse.xtext.common.Terminals.ID");
                            					

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    // InternalAgen.g:2531:4: (otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==48) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalAgen.g:2532:5: otherlv_7= 'imports' otherlv_8= '{' ( (lv_imports_9_0= RULE_CODE_BOX ) ) otherlv_10= '}' otherlv_11= ',' otherlv_12= 'code' otherlv_13= '{'
                            {
                            otherlv_7=(Token)match(input,48,FOLLOW_4); 

                            					newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getImportsKeyword_1_3_0());
                            				
                            otherlv_8=(Token)match(input,13,FOLLOW_42); 

                            					newLeafNode(otherlv_8, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_1_3_1());
                            				
                            // InternalAgen.g:2540:5: ( (lv_imports_9_0= RULE_CODE_BOX ) )
                            // InternalAgen.g:2541:6: (lv_imports_9_0= RULE_CODE_BOX )
                            {
                            // InternalAgen.g:2541:6: (lv_imports_9_0= RULE_CODE_BOX )
                            // InternalAgen.g:2542:7: lv_imports_9_0= RULE_CODE_BOX
                            {
                            lv_imports_9_0=(Token)match(input,RULE_CODE_BOX,FOLLOW_21); 

                            							newLeafNode(lv_imports_9_0, grammarAccess.getConditionAccess().getImportsCODE_BOXTerminalRuleCall_1_3_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getConditionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"imports",
                            								lv_imports_9_0,
                            								"org.xtext.Agen.CODE_BOX");
                            						

                            }


                            }

                            otherlv_10=(Token)match(input,17,FOLLOW_39); 

                            					newLeafNode(otherlv_10, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_1_3_3());
                            				
                            otherlv_11=(Token)match(input,40,FOLLOW_43); 

                            					newLeafNode(otherlv_11, grammarAccess.getConditionAccess().getCommaKeyword_1_3_4());
                            				
                            otherlv_12=(Token)match(input,49,FOLLOW_4); 

                            					newLeafNode(otherlv_12, grammarAccess.getConditionAccess().getCodeKeyword_1_3_5());
                            				
                            otherlv_13=(Token)match(input,13,FOLLOW_42); 

                            					newLeafNode(otherlv_13, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_1_3_6());
                            				

                            }
                            break;

                    }

                    // InternalAgen.g:2575:4: ( (lv_code_14_0= RULE_CODE_BOX ) )
                    // InternalAgen.g:2576:5: (lv_code_14_0= RULE_CODE_BOX )
                    {
                    // InternalAgen.g:2576:5: (lv_code_14_0= RULE_CODE_BOX )
                    // InternalAgen.g:2577:6: lv_code_14_0= RULE_CODE_BOX
                    {
                    lv_code_14_0=(Token)match(input,RULE_CODE_BOX,FOLLOW_21); 

                    						newLeafNode(lv_code_14_0, grammarAccess.getConditionAccess().getCodeCODE_BOXTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"code",
                    							lv_code_14_0,
                    							"org.xtext.Agen.CODE_BOX");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_1_5());
                    			

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleWhere"
    // InternalAgen.g:2602:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalAgen.g:2602:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalAgen.g:2603:2: iv_ruleWhere= ruleWhere EOF
            {
             newCompositeNode(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhere=ruleWhere();

            state._fsp--;

             current =iv_ruleWhere; 
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
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalAgen.g:2609:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'whereToExecute' otherlv_1= '{' ( ( (lv_joinType_2_0= ruleJOIN_TYPE ) ) otherlv_3= ';' )? ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_joinType_2_0 = null;



        	enterRule();

        try {
            // InternalAgen.g:2615:2: ( (otherlv_0= 'whereToExecute' otherlv_1= '{' ( ( (lv_joinType_2_0= ruleJOIN_TYPE ) ) otherlv_3= ';' )? ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalAgen.g:2616:2: (otherlv_0= 'whereToExecute' otherlv_1= '{' ( ( (lv_joinType_2_0= ruleJOIN_TYPE ) ) otherlv_3= ';' )? ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalAgen.g:2616:2: (otherlv_0= 'whereToExecute' otherlv_1= '{' ( ( (lv_joinType_2_0= ruleJOIN_TYPE ) ) otherlv_3= ';' )? ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalAgen.g:2617:3: otherlv_0= 'whereToExecute' otherlv_1= '{' ( ( (lv_joinType_2_0= ruleJOIN_TYPE ) ) otherlv_3= ';' )? ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereToExecuteKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAgen.g:2625:3: ( ( (lv_joinType_2_0= ruleJOIN_TYPE ) ) otherlv_3= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=66 && LA28_0<=67)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAgen.g:2626:4: ( (lv_joinType_2_0= ruleJOIN_TYPE ) ) otherlv_3= ';'
                    {
                    // InternalAgen.g:2626:4: ( (lv_joinType_2_0= ruleJOIN_TYPE ) )
                    // InternalAgen.g:2627:5: (lv_joinType_2_0= ruleJOIN_TYPE )
                    {
                    // InternalAgen.g:2627:5: (lv_joinType_2_0= ruleJOIN_TYPE )
                    // InternalAgen.g:2628:6: lv_joinType_2_0= ruleJOIN_TYPE
                    {

                    						newCompositeNode(grammarAccess.getWhereAccess().getJoinTypeJOIN_TYPEEnumRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_joinType_2_0=ruleJOIN_TYPE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhereRule());
                    						}
                    						set(
                    							current,
                    							"joinType",
                    							lv_joinType_2_0,
                    							"org.xtext.Agen.JOIN_TYPE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getWhereAccess().getSemicolonKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalAgen.g:2650:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalAgen.g:2651:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalAgen.g:2651:4: (lv_name_4_0= RULE_STRING )
            // InternalAgen.g:2652:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_name_4_0, grammarAccess.getWhereAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhereRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleWhere"


    // $ANTLR start "rulesyncpointOnFail"
    // InternalAgen.g:2676:1: rulesyncpointOnFail returns [Enumerator current=null] : ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'retry' ) ) ;
    public final Enumerator rulesyncpointOnFail() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAgen.g:2682:2: ( ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'retry' ) ) )
            // InternalAgen.g:2683:2: ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'retry' ) )
            {
            // InternalAgen.g:2683:2: ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'retry' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==61) ) {
                alt29=1;
            }
            else if ( (LA29_0==62) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalAgen.g:2684:3: (enumLiteral_0= 'continue' )
                    {
                    // InternalAgen.g:2684:3: (enumLiteral_0= 'continue' )
                    // InternalAgen.g:2685:4: enumLiteral_0= 'continue'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSyncpointOnFailAccess().getContinueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSyncpointOnFailAccess().getContinueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgen.g:2692:3: (enumLiteral_1= 'retry' )
                    {
                    // InternalAgen.g:2692:3: (enumLiteral_1= 'retry' )
                    // InternalAgen.g:2693:4: enumLiteral_1= 'retry'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getSyncpointOnFailAccess().getRetryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSyncpointOnFailAccess().getRetryEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulesyncpointOnFail"


    // $ANTLR start "rulesyncpointType"
    // InternalAgen.g:2703:1: rulesyncpointType returns [Enumerator current=null] : ( (enumLiteral_0= 'onetime' ) | (enumLiteral_1= 'recurrent' ) ) ;
    public final Enumerator rulesyncpointType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAgen.g:2709:2: ( ( (enumLiteral_0= 'onetime' ) | (enumLiteral_1= 'recurrent' ) ) )
            // InternalAgen.g:2710:2: ( (enumLiteral_0= 'onetime' ) | (enumLiteral_1= 'recurrent' ) )
            {
            // InternalAgen.g:2710:2: ( (enumLiteral_0= 'onetime' ) | (enumLiteral_1= 'recurrent' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            else if ( (LA30_0==64) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalAgen.g:2711:3: (enumLiteral_0= 'onetime' )
                    {
                    // InternalAgen.g:2711:3: (enumLiteral_0= 'onetime' )
                    // InternalAgen.g:2712:4: enumLiteral_0= 'onetime'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSyncpointTypeAccess().getOneTimeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSyncpointTypeAccess().getOneTimeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgen.g:2719:3: (enumLiteral_1= 'recurrent' )
                    {
                    // InternalAgen.g:2719:3: (enumLiteral_1= 'recurrent' )
                    // InternalAgen.g:2720:4: enumLiteral_1= 'recurrent'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getSyncpointTypeAccess().getRecurrentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSyncpointTypeAccess().getRecurrentEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "rulesyncpointType"


    // $ANTLR start "ruleAlterPacketFaultType"
    // InternalAgen.g:2730:1: ruleAlterPacketFaultType returns [Enumerator current=null] : ( (enumLiteral_0= 'random' ) | (enumLiteral_1= 'zero' ) ) ;
    public final Enumerator ruleAlterPacketFaultType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAgen.g:2736:2: ( ( (enumLiteral_0= 'random' ) | (enumLiteral_1= 'zero' ) ) )
            // InternalAgen.g:2737:2: ( (enumLiteral_0= 'random' ) | (enumLiteral_1= 'zero' ) )
            {
            // InternalAgen.g:2737:2: ( (enumLiteral_0= 'random' ) | (enumLiteral_1= 'zero' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            else if ( (LA31_0==65) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalAgen.g:2738:3: (enumLiteral_0= 'random' )
                    {
                    // InternalAgen.g:2738:3: (enumLiteral_0= 'random' )
                    // InternalAgen.g:2739:4: enumLiteral_0= 'random'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getAlterPacketFaultTypeAccess().getRANDOMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlterPacketFaultTypeAccess().getRANDOMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgen.g:2746:3: (enumLiteral_1= 'zero' )
                    {
                    // InternalAgen.g:2746:3: (enumLiteral_1= 'zero' )
                    // InternalAgen.g:2747:4: enumLiteral_1= 'zero'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getAlterPacketFaultTypeAccess().getZEROEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlterPacketFaultTypeAccess().getZEROEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAlterPacketFaultType"


    // $ANTLR start "ruleJOIN_TYPE"
    // InternalAgen.g:2757:1: ruleJOIN_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'Before' ) | (enumLiteral_1= 'After' ) ) ;
    public final Enumerator ruleJOIN_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAgen.g:2763:2: ( ( (enumLiteral_0= 'Before' ) | (enumLiteral_1= 'After' ) ) )
            // InternalAgen.g:2764:2: ( (enumLiteral_0= 'Before' ) | (enumLiteral_1= 'After' ) )
            {
            // InternalAgen.g:2764:2: ( (enumLiteral_0= 'Before' ) | (enumLiteral_1= 'After' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==66) ) {
                alt32=1;
            }
            else if ( (LA32_0==67) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalAgen.g:2765:3: (enumLiteral_0= 'Before' )
                    {
                    // InternalAgen.g:2765:3: (enumLiteral_0= 'Before' )
                    // InternalAgen.g:2766:4: enumLiteral_0= 'Before'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getJOIN_TYPEAccess().getBEFOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJOIN_TYPEAccess().getBEFOREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAgen.g:2773:3: (enumLiteral_1= 'After' )
                    {
                    // InternalAgen.g:2773:3: (enumLiteral_1= 'After' )
                    // InternalAgen.g:2774:4: enumLiteral_1= 'After'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getJOIN_TYPEAccess().getAFTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJOIN_TYPEAccess().getAFTEREnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleJOIN_TYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x1C04C00089001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x03F4000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000FEE000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008C00000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000C00000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000010000800000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000010L,0x000000000000000CL});

}