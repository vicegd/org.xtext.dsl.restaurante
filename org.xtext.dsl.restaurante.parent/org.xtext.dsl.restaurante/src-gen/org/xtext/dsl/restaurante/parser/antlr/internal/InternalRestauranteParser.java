package org.xtext.dsl.restaurante.parser.antlr.internal;

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
import org.xtext.dsl.restaurante.services.RestauranteGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestauranteParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_FECHA", "RULE_ID", "RULE_URL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Restaurantes'", "'fecha'", "'Ingredientes'", "'{'", "'}'", "'Productos'", "'Menus'", "'Ingrediente:'", "'infoURL:'", "'foto:'", "'alergenico'", "'Principal:'", "'ensalada'", "'Descripcion:'", "'Foto:'", "'Ingredientes:'", "','", "'Salsa recomendada:'", "'Nutricional'", "'Complemento:'", "'Bebida fria:'", "'Distribuidor:'", "'Bebida caliente:'", "'Postre:'", "'helado'", "'cantidad:'", "'medida:'", "'energia:'", "'grasas:'", "'hidratos:'", "'proteinas:'", "'sal:'", "'Menu:'", "'Tama\\u00F1o:'", "'Productos:'", "'Y'", "'('", "'O'", "')'", "'NINGUNA'", "'ACEITE_Y_VINAGRE'", "'CESAR'", "'MODENA'", "'MOSTAZA'", "'NORMAL'", "'GRANDE'", "'NORMAL_Y_GRANDE'", "'COCA_COLA'", "'AQUABONA'", "'MAHOU'", "'ALVALLE'", "'TROPICANA'", "'OREO'", "'MILKA'", "'DANONE'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int RULE_URL=7;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_FECHA=5;
    public static final int RULE_ANY_OTHER=12;
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


        public InternalRestauranteParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRestauranteParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRestauranteParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRestaurante.g"; }



     	private RestauranteGrammarAccess grammarAccess;

        public InternalRestauranteParser(TokenStream input, RestauranteGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Restaurante";
       	}

       	@Override
       	protected RestauranteGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRestaurante"
    // InternalRestaurante.g:65:1: entryRuleRestaurante returns [EObject current=null] : iv_ruleRestaurante= ruleRestaurante EOF ;
    public final EObject entryRuleRestaurante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestaurante = null;


        try {
            // InternalRestaurante.g:65:52: (iv_ruleRestaurante= ruleRestaurante EOF )
            // InternalRestaurante.g:66:2: iv_ruleRestaurante= ruleRestaurante EOF
            {
             newCompositeNode(grammarAccess.getRestauranteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestaurante=ruleRestaurante();

            state._fsp--;

             current =iv_ruleRestaurante; 
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
    // $ANTLR end "entryRuleRestaurante"


    // $ANTLR start "ruleRestaurante"
    // InternalRestaurante.g:72:1: ruleRestaurante returns [EObject current=null] : (otherlv_0= 'Restaurantes' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'fecha' ( (lv_fecha_3_0= RULE_FECHA ) ) otherlv_4= 'Ingredientes' otherlv_5= '{' ( (lv_ingredientes_6_0= ruleIngrediente ) )* otherlv_7= '}' otherlv_8= 'Productos' otherlv_9= '{' ( (lv_productos_10_0= ruleProducto ) )* otherlv_11= '}' otherlv_12= 'Menus' otherlv_13= '{' ( (lv_menus_14_0= ruleMenu ) )* otherlv_15= '}' ) ;
    public final EObject ruleRestaurante() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;
        Token otherlv_2=null;
        Token lv_fecha_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_ingredientes_6_0 = null;

        EObject lv_productos_10_0 = null;

        EObject lv_menus_14_0 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:78:2: ( (otherlv_0= 'Restaurantes' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'fecha' ( (lv_fecha_3_0= RULE_FECHA ) ) otherlv_4= 'Ingredientes' otherlv_5= '{' ( (lv_ingredientes_6_0= ruleIngrediente ) )* otherlv_7= '}' otherlv_8= 'Productos' otherlv_9= '{' ( (lv_productos_10_0= ruleProducto ) )* otherlv_11= '}' otherlv_12= 'Menus' otherlv_13= '{' ( (lv_menus_14_0= ruleMenu ) )* otherlv_15= '}' ) )
            // InternalRestaurante.g:79:2: (otherlv_0= 'Restaurantes' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'fecha' ( (lv_fecha_3_0= RULE_FECHA ) ) otherlv_4= 'Ingredientes' otherlv_5= '{' ( (lv_ingredientes_6_0= ruleIngrediente ) )* otherlv_7= '}' otherlv_8= 'Productos' otherlv_9= '{' ( (lv_productos_10_0= ruleProducto ) )* otherlv_11= '}' otherlv_12= 'Menus' otherlv_13= '{' ( (lv_menus_14_0= ruleMenu ) )* otherlv_15= '}' )
            {
            // InternalRestaurante.g:79:2: (otherlv_0= 'Restaurantes' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'fecha' ( (lv_fecha_3_0= RULE_FECHA ) ) otherlv_4= 'Ingredientes' otherlv_5= '{' ( (lv_ingredientes_6_0= ruleIngrediente ) )* otherlv_7= '}' otherlv_8= 'Productos' otherlv_9= '{' ( (lv_productos_10_0= ruleProducto ) )* otherlv_11= '}' otherlv_12= 'Menus' otherlv_13= '{' ( (lv_menus_14_0= ruleMenu ) )* otherlv_15= '}' )
            // InternalRestaurante.g:80:3: otherlv_0= 'Restaurantes' ( (lv_nombre_1_0= RULE_STRING ) ) otherlv_2= 'fecha' ( (lv_fecha_3_0= RULE_FECHA ) ) otherlv_4= 'Ingredientes' otherlv_5= '{' ( (lv_ingredientes_6_0= ruleIngrediente ) )* otherlv_7= '}' otherlv_8= 'Productos' otherlv_9= '{' ( (lv_productos_10_0= ruleProducto ) )* otherlv_11= '}' otherlv_12= 'Menus' otherlv_13= '{' ( (lv_menus_14_0= ruleMenu ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRestauranteAccess().getRestaurantesKeyword_0());
            		
            // InternalRestaurante.g:84:3: ( (lv_nombre_1_0= RULE_STRING ) )
            // InternalRestaurante.g:85:4: (lv_nombre_1_0= RULE_STRING )
            {
            // InternalRestaurante.g:85:4: (lv_nombre_1_0= RULE_STRING )
            // InternalRestaurante.g:86:5: lv_nombre_1_0= RULE_STRING
            {
            lv_nombre_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_nombre_1_0, grammarAccess.getRestauranteAccess().getNombreSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestauranteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRestauranteAccess().getFechaKeyword_2());
            		
            // InternalRestaurante.g:106:3: ( (lv_fecha_3_0= RULE_FECHA ) )
            // InternalRestaurante.g:107:4: (lv_fecha_3_0= RULE_FECHA )
            {
            // InternalRestaurante.g:107:4: (lv_fecha_3_0= RULE_FECHA )
            // InternalRestaurante.g:108:5: lv_fecha_3_0= RULE_FECHA
            {
            lv_fecha_3_0=(Token)match(input,RULE_FECHA,FOLLOW_6); 

            					newLeafNode(lv_fecha_3_0, grammarAccess.getRestauranteAccess().getFechaFECHATerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestauranteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fecha",
            						lv_fecha_3_0,
            						"org.xtext.dsl.restaurante.Restaurante.FECHA");
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getRestauranteAccess().getIngredientesKeyword_4());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRestaurante.g:132:3: ( (lv_ingredientes_6_0= ruleIngrediente ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRestaurante.g:133:4: (lv_ingredientes_6_0= ruleIngrediente )
            	    {
            	    // InternalRestaurante.g:133:4: (lv_ingredientes_6_0= ruleIngrediente )
            	    // InternalRestaurante.g:134:5: lv_ingredientes_6_0= ruleIngrediente
            	    {

            	    					newCompositeNode(grammarAccess.getRestauranteAccess().getIngredientesIngredienteParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ingredientes_6_0=ruleIngrediente();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestauranteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ingredientes",
            	    						lv_ingredientes_6_0,
            	    						"org.xtext.dsl.restaurante.Restaurante.Ingrediente");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getRestauranteAccess().getProductosKeyword_8());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalRestaurante.g:163:3: ( (lv_productos_10_0= ruleProducto ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24||(LA2_0>=32 && LA2_0<=33)||(LA2_0>=35 && LA2_0<=36)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRestaurante.g:164:4: (lv_productos_10_0= ruleProducto )
            	    {
            	    // InternalRestaurante.g:164:4: (lv_productos_10_0= ruleProducto )
            	    // InternalRestaurante.g:165:5: lv_productos_10_0= ruleProducto
            	    {

            	    					newCompositeNode(grammarAccess.getRestauranteAccess().getProductosProductoParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_productos_10_0=ruleProducto();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestauranteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"productos",
            	    						lv_productos_10_0,
            	    						"org.xtext.dsl.restaurante.Restaurante.Producto");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getRestauranteAccess().getMenusKeyword_12());
            		
            otherlv_13=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalRestaurante.g:194:3: ( (lv_menus_14_0= ruleMenu ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==45) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRestaurante.g:195:4: (lv_menus_14_0= ruleMenu )
            	    {
            	    // InternalRestaurante.g:195:4: (lv_menus_14_0= ruleMenu )
            	    // InternalRestaurante.g:196:5: lv_menus_14_0= ruleMenu
            	    {

            	    					newCompositeNode(grammarAccess.getRestauranteAccess().getMenusMenuParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_menus_14_0=ruleMenu();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestauranteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"menus",
            	    						lv_menus_14_0,
            	    						"org.xtext.dsl.restaurante.Restaurante.Menu");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleRestaurante"


    // $ANTLR start "entryRuleIngrediente"
    // InternalRestaurante.g:221:1: entryRuleIngrediente returns [EObject current=null] : iv_ruleIngrediente= ruleIngrediente EOF ;
    public final EObject entryRuleIngrediente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngrediente = null;


        try {
            // InternalRestaurante.g:221:52: (iv_ruleIngrediente= ruleIngrediente EOF )
            // InternalRestaurante.g:222:2: iv_ruleIngrediente= ruleIngrediente EOF
            {
             newCompositeNode(grammarAccess.getIngredienteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngrediente=ruleIngrediente();

            state._fsp--;

             current =iv_ruleIngrediente; 
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
    // $ANTLR end "entryRuleIngrediente"


    // $ANTLR start "ruleIngrediente"
    // InternalRestaurante.g:228:1: ruleIngrediente returns [EObject current=null] : (otherlv_0= 'Ingrediente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )? (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )? ( (lv_alergenico_7_0= 'alergenico' ) )? ) ;
    public final EObject ruleIngrediente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token lv_infoURL_4_0=null;
        Token otherlv_5=null;
        Token lv_foto_6_0=null;
        Token lv_alergenico_7_0=null;


        	enterRule();

        try {
            // InternalRestaurante.g:234:2: ( (otherlv_0= 'Ingrediente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )? (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )? ( (lv_alergenico_7_0= 'alergenico' ) )? ) )
            // InternalRestaurante.g:235:2: (otherlv_0= 'Ingrediente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )? (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )? ( (lv_alergenico_7_0= 'alergenico' ) )? )
            {
            // InternalRestaurante.g:235:2: (otherlv_0= 'Ingrediente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )? (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )? ( (lv_alergenico_7_0= 'alergenico' ) )? )
            // InternalRestaurante.g:236:3: otherlv_0= 'Ingrediente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )? (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )? ( (lv_alergenico_7_0= 'alergenico' ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIngredienteAccess().getIngredienteKeyword_0());
            		
            // InternalRestaurante.g:240:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestaurante.g:241:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestaurante.g:241:4: (lv_name_1_0= RULE_ID )
            // InternalRestaurante.g:242:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredienteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestaurante.g:258:3: ( (lv_nombre_2_0= RULE_STRING ) )
            // InternalRestaurante.g:259:4: (lv_nombre_2_0= RULE_STRING )
            {
            // InternalRestaurante.g:259:4: (lv_nombre_2_0= RULE_STRING )
            // InternalRestaurante.g:260:5: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getIngredienteAccess().getNombreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngredienteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:276:3: (otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRestaurante.g:277:4: otherlv_3= 'infoURL:' ( (lv_infoURL_4_0= RULE_URL ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getIngredienteAccess().getInfoURLKeyword_3_0());
                    			
                    // InternalRestaurante.g:281:4: ( (lv_infoURL_4_0= RULE_URL ) )
                    // InternalRestaurante.g:282:5: (lv_infoURL_4_0= RULE_URL )
                    {
                    // InternalRestaurante.g:282:5: (lv_infoURL_4_0= RULE_URL )
                    // InternalRestaurante.g:283:6: lv_infoURL_4_0= RULE_URL
                    {
                    lv_infoURL_4_0=(Token)match(input,RULE_URL,FOLLOW_16); 

                    						newLeafNode(lv_infoURL_4_0, grammarAccess.getIngredienteAccess().getInfoURLURLTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngredienteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"infoURL",
                    							lv_infoURL_4_0,
                    							"org.xtext.dsl.restaurante.Restaurante.URL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRestaurante.g:300:3: (otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRestaurante.g:301:4: otherlv_5= 'foto:' ( (lv_foto_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getIngredienteAccess().getFotoKeyword_4_0());
                    			
                    // InternalRestaurante.g:305:4: ( (lv_foto_6_0= RULE_STRING ) )
                    // InternalRestaurante.g:306:5: (lv_foto_6_0= RULE_STRING )
                    {
                    // InternalRestaurante.g:306:5: (lv_foto_6_0= RULE_STRING )
                    // InternalRestaurante.g:307:6: lv_foto_6_0= RULE_STRING
                    {
                    lv_foto_6_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_foto_6_0, grammarAccess.getIngredienteAccess().getFotoSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIngredienteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"foto",
                    							lv_foto_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRestaurante.g:324:3: ( (lv_alergenico_7_0= 'alergenico' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRestaurante.g:325:4: (lv_alergenico_7_0= 'alergenico' )
                    {
                    // InternalRestaurante.g:325:4: (lv_alergenico_7_0= 'alergenico' )
                    // InternalRestaurante.g:326:5: lv_alergenico_7_0= 'alergenico'
                    {
                    lv_alergenico_7_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_alergenico_7_0, grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIngredienteRule());
                    					}
                    					setWithLastConsumed(current, "alergenico", true, "alergenico");
                    				

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
    // $ANTLR end "ruleIngrediente"


    // $ANTLR start "entryRuleProducto"
    // InternalRestaurante.g:342:1: entryRuleProducto returns [EObject current=null] : iv_ruleProducto= ruleProducto EOF ;
    public final EObject entryRuleProducto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProducto = null;


        try {
            // InternalRestaurante.g:342:49: (iv_ruleProducto= ruleProducto EOF )
            // InternalRestaurante.g:343:2: iv_ruleProducto= ruleProducto EOF
            {
             newCompositeNode(grammarAccess.getProductoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProducto=ruleProducto();

            state._fsp--;

             current =iv_ruleProducto; 
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
    // $ANTLR end "entryRuleProducto"


    // $ANTLR start "ruleProducto"
    // InternalRestaurante.g:349:1: ruleProducto returns [EObject current=null] : (this_Principal_0= rulePrincipal | this_Complemento_1= ruleComplemento | this_Bebida_2= ruleBebida | this_Postre_3= rulePostre ) ;
    public final EObject ruleProducto() throws RecognitionException {
        EObject current = null;

        EObject this_Principal_0 = null;

        EObject this_Complemento_1 = null;

        EObject this_Bebida_2 = null;

        EObject this_Postre_3 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:355:2: ( (this_Principal_0= rulePrincipal | this_Complemento_1= ruleComplemento | this_Bebida_2= ruleBebida | this_Postre_3= rulePostre ) )
            // InternalRestaurante.g:356:2: (this_Principal_0= rulePrincipal | this_Complemento_1= ruleComplemento | this_Bebida_2= ruleBebida | this_Postre_3= rulePostre )
            {
            // InternalRestaurante.g:356:2: (this_Principal_0= rulePrincipal | this_Complemento_1= ruleComplemento | this_Bebida_2= ruleBebida | this_Postre_3= rulePostre )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
            case 35:
                {
                alt7=3;
                }
                break;
            case 36:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRestaurante.g:357:3: this_Principal_0= rulePrincipal
                    {

                    			newCompositeNode(grammarAccess.getProductoAccess().getPrincipalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Principal_0=rulePrincipal();

                    state._fsp--;


                    			current = this_Principal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:366:3: this_Complemento_1= ruleComplemento
                    {

                    			newCompositeNode(grammarAccess.getProductoAccess().getComplementoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Complemento_1=ruleComplemento();

                    state._fsp--;


                    			current = this_Complemento_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRestaurante.g:375:3: this_Bebida_2= ruleBebida
                    {

                    			newCompositeNode(grammarAccess.getProductoAccess().getBebidaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bebida_2=ruleBebida();

                    state._fsp--;


                    			current = this_Bebida_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRestaurante.g:384:3: this_Postre_3= rulePostre
                    {

                    			newCompositeNode(grammarAccess.getProductoAccess().getPostreParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Postre_3=rulePostre();

                    state._fsp--;


                    			current = this_Postre_3;
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
    // $ANTLR end "ruleProducto"


    // $ANTLR start "entryRulePrincipal"
    // InternalRestaurante.g:396:1: entryRulePrincipal returns [EObject current=null] : iv_rulePrincipal= rulePrincipal EOF ;
    public final EObject entryRulePrincipal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrincipal = null;


        try {
            // InternalRestaurante.g:396:50: (iv_rulePrincipal= rulePrincipal EOF )
            // InternalRestaurante.g:397:2: iv_rulePrincipal= rulePrincipal EOF
            {
             newCompositeNode(grammarAccess.getPrincipalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrincipal=rulePrincipal();

            state._fsp--;

             current =iv_rulePrincipal; 
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
    // $ANTLR end "entryRulePrincipal"


    // $ANTLR start "rulePrincipal"
    // InternalRestaurante.g:403:1: rulePrincipal returns [EObject current=null] : (otherlv_0= 'Principal:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_ensalada_3_0= 'ensalada' ) )? otherlv_4= '{' otherlv_5= 'Descripcion:' ( (lv_descripcion_6_0= RULE_STRING ) ) otherlv_7= 'Foto:' ( (lv_foto_8_0= RULE_STRING ) ) (otherlv_9= 'Ingredientes:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= 'Salsa recomendada:' ( (lv_salsa_14_0= ruleSalsaRecomendada ) ) (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )? otherlv_17= '}' ) ;
    public final EObject rulePrincipal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nombre_2_0=null;
        Token lv_ensalada_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_descripcion_6_0=null;
        Token otherlv_7=null;
        Token lv_foto_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_salsa_14_0 = null;

        EObject lv_nutricional_16_0 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:409:2: ( (otherlv_0= 'Principal:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_ensalada_3_0= 'ensalada' ) )? otherlv_4= '{' otherlv_5= 'Descripcion:' ( (lv_descripcion_6_0= RULE_STRING ) ) otherlv_7= 'Foto:' ( (lv_foto_8_0= RULE_STRING ) ) (otherlv_9= 'Ingredientes:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= 'Salsa recomendada:' ( (lv_salsa_14_0= ruleSalsaRecomendada ) ) (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )? otherlv_17= '}' ) )
            // InternalRestaurante.g:410:2: (otherlv_0= 'Principal:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_ensalada_3_0= 'ensalada' ) )? otherlv_4= '{' otherlv_5= 'Descripcion:' ( (lv_descripcion_6_0= RULE_STRING ) ) otherlv_7= 'Foto:' ( (lv_foto_8_0= RULE_STRING ) ) (otherlv_9= 'Ingredientes:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= 'Salsa recomendada:' ( (lv_salsa_14_0= ruleSalsaRecomendada ) ) (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )? otherlv_17= '}' )
            {
            // InternalRestaurante.g:410:2: (otherlv_0= 'Principal:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_ensalada_3_0= 'ensalada' ) )? otherlv_4= '{' otherlv_5= 'Descripcion:' ( (lv_descripcion_6_0= RULE_STRING ) ) otherlv_7= 'Foto:' ( (lv_foto_8_0= RULE_STRING ) ) (otherlv_9= 'Ingredientes:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= 'Salsa recomendada:' ( (lv_salsa_14_0= ruleSalsaRecomendada ) ) (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )? otherlv_17= '}' )
            // InternalRestaurante.g:411:3: otherlv_0= 'Principal:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_ensalada_3_0= 'ensalada' ) )? otherlv_4= '{' otherlv_5= 'Descripcion:' ( (lv_descripcion_6_0= RULE_STRING ) ) otherlv_7= 'Foto:' ( (lv_foto_8_0= RULE_STRING ) ) (otherlv_9= 'Ingredientes:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )? otherlv_13= 'Salsa recomendada:' ( (lv_salsa_14_0= ruleSalsaRecomendada ) ) (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPrincipalAccess().getPrincipalKeyword_0());
            		
            // InternalRestaurante.g:415:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestaurante.g:416:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestaurante.g:416:4: (lv_name_1_0= RULE_ID )
            // InternalRestaurante.g:417:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrincipalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrincipalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestaurante.g:433:3: ( (lv_nombre_2_0= RULE_STRING ) )
            // InternalRestaurante.g:434:4: (lv_nombre_2_0= RULE_STRING )
            {
            // InternalRestaurante.g:434:4: (lv_nombre_2_0= RULE_STRING )
            // InternalRestaurante.g:435:5: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getPrincipalAccess().getNombreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrincipalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:451:3: ( (lv_ensalada_3_0= 'ensalada' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRestaurante.g:452:4: (lv_ensalada_3_0= 'ensalada' )
                    {
                    // InternalRestaurante.g:452:4: (lv_ensalada_3_0= 'ensalada' )
                    // InternalRestaurante.g:453:5: lv_ensalada_3_0= 'ensalada'
                    {
                    lv_ensalada_3_0=(Token)match(input,25,FOLLOW_7); 

                    					newLeafNode(lv_ensalada_3_0, grammarAccess.getPrincipalAccess().getEnsaladaEnsaladaKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrincipalRule());
                    					}
                    					setWithLastConsumed(current, "ensalada", true, "ensalada");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPrincipalAccess().getDescripcionKeyword_5());
            		
            // InternalRestaurante.g:473:3: ( (lv_descripcion_6_0= RULE_STRING ) )
            // InternalRestaurante.g:474:4: (lv_descripcion_6_0= RULE_STRING )
            {
            // InternalRestaurante.g:474:4: (lv_descripcion_6_0= RULE_STRING )
            // InternalRestaurante.g:475:5: lv_descripcion_6_0= RULE_STRING
            {
            lv_descripcion_6_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_descripcion_6_0, grammarAccess.getPrincipalAccess().getDescripcionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrincipalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descripcion",
            						lv_descripcion_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getPrincipalAccess().getFotoKeyword_7());
            		
            // InternalRestaurante.g:495:3: ( (lv_foto_8_0= RULE_STRING ) )
            // InternalRestaurante.g:496:4: (lv_foto_8_0= RULE_STRING )
            {
            // InternalRestaurante.g:496:4: (lv_foto_8_0= RULE_STRING )
            // InternalRestaurante.g:497:5: lv_foto_8_0= RULE_STRING
            {
            lv_foto_8_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_foto_8_0, grammarAccess.getPrincipalAccess().getFotoSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrincipalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"foto",
            						lv_foto_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:513:3: (otherlv_9= 'Ingredientes:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRestaurante.g:514:4: otherlv_9= 'Ingredientes:' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrincipalAccess().getIngredientesKeyword_9_0());
                    			
                    // InternalRestaurante.g:518:4: ( (otherlv_10= RULE_ID ) )
                    // InternalRestaurante.g:519:5: (otherlv_10= RULE_ID )
                    {
                    // InternalRestaurante.g:519:5: (otherlv_10= RULE_ID )
                    // InternalRestaurante.g:520:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrincipalRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_10, grammarAccess.getPrincipalAccess().getIngredientesIngredienteCrossReference_9_1_0());
                    					

                    }


                    }

                    // InternalRestaurante.g:531:4: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==29) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRestaurante.g:532:5: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,29,FOLLOW_13); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPrincipalAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalRestaurante.g:536:5: ( (otherlv_12= RULE_ID ) )
                    	    // InternalRestaurante.g:537:6: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalRestaurante.g:537:6: (otherlv_12= RULE_ID )
                    	    // InternalRestaurante.g:538:7: otherlv_12= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPrincipalRule());
                    	    							}
                    	    						
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getPrincipalAccess().getIngredientesIngredienteCrossReference_9_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_13, grammarAccess.getPrincipalAccess().getSalsaRecomendadaKeyword_10());
            		
            // InternalRestaurante.g:555:3: ( (lv_salsa_14_0= ruleSalsaRecomendada ) )
            // InternalRestaurante.g:556:4: (lv_salsa_14_0= ruleSalsaRecomendada )
            {
            // InternalRestaurante.g:556:4: (lv_salsa_14_0= ruleSalsaRecomendada )
            // InternalRestaurante.g:557:5: lv_salsa_14_0= ruleSalsaRecomendada
            {

            					newCompositeNode(grammarAccess.getPrincipalAccess().getSalsaSalsaRecomendadaEnumRuleCall_11_0());
            				
            pushFollow(FOLLOW_24);
            lv_salsa_14_0=ruleSalsaRecomendada();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrincipalRule());
            					}
            					set(
            						current,
            						"salsa",
            						lv_salsa_14_0,
            						"org.xtext.dsl.restaurante.Restaurante.SalsaRecomendada");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRestaurante.g:574:3: (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRestaurante.g:575:4: otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) )
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrincipalAccess().getNutricionalKeyword_12_0());
                    			
                    // InternalRestaurante.g:579:4: ( (lv_nutricional_16_0= ruleNutricional ) )
                    // InternalRestaurante.g:580:5: (lv_nutricional_16_0= ruleNutricional )
                    {
                    // InternalRestaurante.g:580:5: (lv_nutricional_16_0= ruleNutricional )
                    // InternalRestaurante.g:581:6: lv_nutricional_16_0= ruleNutricional
                    {

                    						newCompositeNode(grammarAccess.getPrincipalAccess().getNutricionalNutricionalParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_nutricional_16_0=ruleNutricional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrincipalRule());
                    						}
                    						set(
                    							current,
                    							"nutricional",
                    							lv_nutricional_16_0,
                    							"org.xtext.dsl.restaurante.Restaurante.Nutricional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "rulePrincipal"


    // $ANTLR start "entryRuleComplemento"
    // InternalRestaurante.g:607:1: entryRuleComplemento returns [EObject current=null] : iv_ruleComplemento= ruleComplemento EOF ;
    public final EObject entryRuleComplemento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplemento = null;


        try {
            // InternalRestaurante.g:607:52: (iv_ruleComplemento= ruleComplemento EOF )
            // InternalRestaurante.g:608:2: iv_ruleComplemento= ruleComplemento EOF
            {
             newCompositeNode(grammarAccess.getComplementoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplemento=ruleComplemento();

            state._fsp--;

             current =iv_ruleComplemento; 
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
    // $ANTLR end "entryRuleComplemento"


    // $ANTLR start "ruleComplemento"
    // InternalRestaurante.g:614:1: ruleComplemento returns [EObject current=null] : (otherlv_0= 'Complemento:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Foto:' ( (lv_foto_7_0= RULE_STRING ) ) (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleComplemento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_descripcion_5_0=null;
        Token otherlv_6=null;
        Token lv_foto_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_nutricional_9_0 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:620:2: ( (otherlv_0= 'Complemento:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Foto:' ( (lv_foto_7_0= RULE_STRING ) ) (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )? otherlv_10= '}' ) )
            // InternalRestaurante.g:621:2: (otherlv_0= 'Complemento:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Foto:' ( (lv_foto_7_0= RULE_STRING ) ) (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )? otherlv_10= '}' )
            {
            // InternalRestaurante.g:621:2: (otherlv_0= 'Complemento:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Foto:' ( (lv_foto_7_0= RULE_STRING ) ) (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )? otherlv_10= '}' )
            // InternalRestaurante.g:622:3: otherlv_0= 'Complemento:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Foto:' ( (lv_foto_7_0= RULE_STRING ) ) (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getComplementoAccess().getComplementoKeyword_0());
            		
            // InternalRestaurante.g:626:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestaurante.g:627:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestaurante.g:627:4: (lv_name_1_0= RULE_ID )
            // InternalRestaurante.g:628:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComplementoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplementoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestaurante.g:644:3: ( (lv_nombre_2_0= RULE_STRING ) )
            // InternalRestaurante.g:645:4: (lv_nombre_2_0= RULE_STRING )
            {
            // InternalRestaurante.g:645:4: (lv_nombre_2_0= RULE_STRING )
            // InternalRestaurante.g:646:5: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getComplementoAccess().getNombreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplementoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getComplementoAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getComplementoAccess().getDescripcionKeyword_4());
            		
            // InternalRestaurante.g:670:3: ( (lv_descripcion_5_0= RULE_STRING ) )
            // InternalRestaurante.g:671:4: (lv_descripcion_5_0= RULE_STRING )
            {
            // InternalRestaurante.g:671:4: (lv_descripcion_5_0= RULE_STRING )
            // InternalRestaurante.g:672:5: lv_descripcion_5_0= RULE_STRING
            {
            lv_descripcion_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_descripcion_5_0, grammarAccess.getComplementoAccess().getDescripcionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplementoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descripcion",
            						lv_descripcion_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getComplementoAccess().getFotoKeyword_6());
            		
            // InternalRestaurante.g:692:3: ( (lv_foto_7_0= RULE_STRING ) )
            // InternalRestaurante.g:693:4: (lv_foto_7_0= RULE_STRING )
            {
            // InternalRestaurante.g:693:4: (lv_foto_7_0= RULE_STRING )
            // InternalRestaurante.g:694:5: lv_foto_7_0= RULE_STRING
            {
            lv_foto_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_foto_7_0, grammarAccess.getComplementoAccess().getFotoSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplementoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"foto",
            						lv_foto_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:710:3: (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRestaurante.g:711:4: otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getComplementoAccess().getNutricionalKeyword_8_0());
                    			
                    // InternalRestaurante.g:715:4: ( (lv_nutricional_9_0= ruleNutricional ) )
                    // InternalRestaurante.g:716:5: (lv_nutricional_9_0= ruleNutricional )
                    {
                    // InternalRestaurante.g:716:5: (lv_nutricional_9_0= ruleNutricional )
                    // InternalRestaurante.g:717:6: lv_nutricional_9_0= ruleNutricional
                    {

                    						newCompositeNode(grammarAccess.getComplementoAccess().getNutricionalNutricionalParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_nutricional_9_0=ruleNutricional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplementoRule());
                    						}
                    						set(
                    							current,
                    							"nutricional",
                    							lv_nutricional_9_0,
                    							"org.xtext.dsl.restaurante.Restaurante.Nutricional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getComplementoAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleComplemento"


    // $ANTLR start "entryRuleBebida"
    // InternalRestaurante.g:743:1: entryRuleBebida returns [EObject current=null] : iv_ruleBebida= ruleBebida EOF ;
    public final EObject entryRuleBebida() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBebida = null;


        try {
            // InternalRestaurante.g:743:47: (iv_ruleBebida= ruleBebida EOF )
            // InternalRestaurante.g:744:2: iv_ruleBebida= ruleBebida EOF
            {
             newCompositeNode(grammarAccess.getBebidaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBebida=ruleBebida();

            state._fsp--;

             current =iv_ruleBebida; 
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
    // $ANTLR end "entryRuleBebida"


    // $ANTLR start "ruleBebida"
    // InternalRestaurante.g:750:1: ruleBebida returns [EObject current=null] : (this_BebidaFria_0= ruleBebidaFria | this_BebidaCaliente_1= ruleBebidaCaliente ) ;
    public final EObject ruleBebida() throws RecognitionException {
        EObject current = null;

        EObject this_BebidaFria_0 = null;

        EObject this_BebidaCaliente_1 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:756:2: ( (this_BebidaFria_0= ruleBebidaFria | this_BebidaCaliente_1= ruleBebidaCaliente ) )
            // InternalRestaurante.g:757:2: (this_BebidaFria_0= ruleBebidaFria | this_BebidaCaliente_1= ruleBebidaCaliente )
            {
            // InternalRestaurante.g:757:2: (this_BebidaFria_0= ruleBebidaFria | this_BebidaCaliente_1= ruleBebidaCaliente )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==35) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRestaurante.g:758:3: this_BebidaFria_0= ruleBebidaFria
                    {

                    			newCompositeNode(grammarAccess.getBebidaAccess().getBebidaFriaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BebidaFria_0=ruleBebidaFria();

                    state._fsp--;


                    			current = this_BebidaFria_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:767:3: this_BebidaCaliente_1= ruleBebidaCaliente
                    {

                    			newCompositeNode(grammarAccess.getBebidaAccess().getBebidaCalienteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BebidaCaliente_1=ruleBebidaCaliente();

                    state._fsp--;


                    			current = this_BebidaCaliente_1;
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
    // $ANTLR end "ruleBebida"


    // $ANTLR start "entryRuleBebidaFria"
    // InternalRestaurante.g:779:1: entryRuleBebidaFria returns [EObject current=null] : iv_ruleBebidaFria= ruleBebidaFria EOF ;
    public final EObject entryRuleBebidaFria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBebidaFria = null;


        try {
            // InternalRestaurante.g:779:51: (iv_ruleBebidaFria= ruleBebidaFria EOF )
            // InternalRestaurante.g:780:2: iv_ruleBebidaFria= ruleBebidaFria EOF
            {
             newCompositeNode(grammarAccess.getBebidaFriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBebidaFria=ruleBebidaFria();

            state._fsp--;

             current =iv_ruleBebidaFria; 
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
    // $ANTLR end "entryRuleBebidaFria"


    // $ANTLR start "ruleBebidaFria"
    // InternalRestaurante.g:786:1: ruleBebidaFria returns [EObject current=null] : (otherlv_0= 'Bebida fria:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Distribuidor:' ( (lv_distribuidor_7_0= ruleDistribuidor ) ) otherlv_8= 'Foto:' ( (lv_foto_9_0= RULE_STRING ) ) (otherlv_10= 'Nutricional' ( (lv_nutricional_11_0= ruleNutricional ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleBebidaFria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_descripcion_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_foto_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_distribuidor_7_0 = null;

        EObject lv_nutricional_11_0 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:792:2: ( (otherlv_0= 'Bebida fria:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Distribuidor:' ( (lv_distribuidor_7_0= ruleDistribuidor ) ) otherlv_8= 'Foto:' ( (lv_foto_9_0= RULE_STRING ) ) (otherlv_10= 'Nutricional' ( (lv_nutricional_11_0= ruleNutricional ) ) )? otherlv_12= '}' ) )
            // InternalRestaurante.g:793:2: (otherlv_0= 'Bebida fria:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Distribuidor:' ( (lv_distribuidor_7_0= ruleDistribuidor ) ) otherlv_8= 'Foto:' ( (lv_foto_9_0= RULE_STRING ) ) (otherlv_10= 'Nutricional' ( (lv_nutricional_11_0= ruleNutricional ) ) )? otherlv_12= '}' )
            {
            // InternalRestaurante.g:793:2: (otherlv_0= 'Bebida fria:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Distribuidor:' ( (lv_distribuidor_7_0= ruleDistribuidor ) ) otherlv_8= 'Foto:' ( (lv_foto_9_0= RULE_STRING ) ) (otherlv_10= 'Nutricional' ( (lv_nutricional_11_0= ruleNutricional ) ) )? otherlv_12= '}' )
            // InternalRestaurante.g:794:3: otherlv_0= 'Bebida fria:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Distribuidor:' ( (lv_distribuidor_7_0= ruleDistribuidor ) ) otherlv_8= 'Foto:' ( (lv_foto_9_0= RULE_STRING ) ) (otherlv_10= 'Nutricional' ( (lv_nutricional_11_0= ruleNutricional ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBebidaFriaAccess().getBebidaFriaKeyword_0());
            		
            // InternalRestaurante.g:798:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestaurante.g:799:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestaurante.g:799:4: (lv_name_1_0= RULE_ID )
            // InternalRestaurante.g:800:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBebidaFriaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBebidaFriaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestaurante.g:816:3: ( (lv_nombre_2_0= RULE_STRING ) )
            // InternalRestaurante.g:817:4: (lv_nombre_2_0= RULE_STRING )
            {
            // InternalRestaurante.g:817:4: (lv_nombre_2_0= RULE_STRING )
            // InternalRestaurante.g:818:5: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getBebidaFriaAccess().getNombreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBebidaFriaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getBebidaFriaAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBebidaFriaAccess().getDescripcionKeyword_4());
            		
            // InternalRestaurante.g:842:3: ( (lv_descripcion_5_0= RULE_STRING ) )
            // InternalRestaurante.g:843:4: (lv_descripcion_5_0= RULE_STRING )
            {
            // InternalRestaurante.g:843:4: (lv_descripcion_5_0= RULE_STRING )
            // InternalRestaurante.g:844:5: lv_descripcion_5_0= RULE_STRING
            {
            lv_descripcion_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_descripcion_5_0, grammarAccess.getBebidaFriaAccess().getDescripcionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBebidaFriaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descripcion",
            						lv_descripcion_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getBebidaFriaAccess().getDistribuidorKeyword_6());
            		
            // InternalRestaurante.g:864:3: ( (lv_distribuidor_7_0= ruleDistribuidor ) )
            // InternalRestaurante.g:865:4: (lv_distribuidor_7_0= ruleDistribuidor )
            {
            // InternalRestaurante.g:865:4: (lv_distribuidor_7_0= ruleDistribuidor )
            // InternalRestaurante.g:866:5: lv_distribuidor_7_0= ruleDistribuidor
            {

            					newCompositeNode(grammarAccess.getBebidaFriaAccess().getDistribuidorDistribuidorEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
            lv_distribuidor_7_0=ruleDistribuidor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBebidaFriaRule());
            					}
            					set(
            						current,
            						"distribuidor",
            						lv_distribuidor_7_0,
            						"org.xtext.dsl.restaurante.Restaurante.Distribuidor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getBebidaFriaAccess().getFotoKeyword_8());
            		
            // InternalRestaurante.g:887:3: ( (lv_foto_9_0= RULE_STRING ) )
            // InternalRestaurante.g:888:4: (lv_foto_9_0= RULE_STRING )
            {
            // InternalRestaurante.g:888:4: (lv_foto_9_0= RULE_STRING )
            // InternalRestaurante.g:889:5: lv_foto_9_0= RULE_STRING
            {
            lv_foto_9_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_foto_9_0, grammarAccess.getBebidaFriaAccess().getFotoSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBebidaFriaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"foto",
            						lv_foto_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:905:3: (otherlv_10= 'Nutricional' ( (lv_nutricional_11_0= ruleNutricional ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRestaurante.g:906:4: otherlv_10= 'Nutricional' ( (lv_nutricional_11_0= ruleNutricional ) )
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getBebidaFriaAccess().getNutricionalKeyword_10_0());
                    			
                    // InternalRestaurante.g:910:4: ( (lv_nutricional_11_0= ruleNutricional ) )
                    // InternalRestaurante.g:911:5: (lv_nutricional_11_0= ruleNutricional )
                    {
                    // InternalRestaurante.g:911:5: (lv_nutricional_11_0= ruleNutricional )
                    // InternalRestaurante.g:912:6: lv_nutricional_11_0= ruleNutricional
                    {

                    						newCompositeNode(grammarAccess.getBebidaFriaAccess().getNutricionalNutricionalParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_nutricional_11_0=ruleNutricional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBebidaFriaRule());
                    						}
                    						set(
                    							current,
                    							"nutricional",
                    							lv_nutricional_11_0,
                    							"org.xtext.dsl.restaurante.Restaurante.Nutricional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getBebidaFriaAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleBebidaFria"


    // $ANTLR start "entryRuleBebidaCaliente"
    // InternalRestaurante.g:938:1: entryRuleBebidaCaliente returns [EObject current=null] : iv_ruleBebidaCaliente= ruleBebidaCaliente EOF ;
    public final EObject entryRuleBebidaCaliente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBebidaCaliente = null;


        try {
            // InternalRestaurante.g:938:55: (iv_ruleBebidaCaliente= ruleBebidaCaliente EOF )
            // InternalRestaurante.g:939:2: iv_ruleBebidaCaliente= ruleBebidaCaliente EOF
            {
             newCompositeNode(grammarAccess.getBebidaCalienteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBebidaCaliente=ruleBebidaCaliente();

            state._fsp--;

             current =iv_ruleBebidaCaliente; 
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
    // $ANTLR end "entryRuleBebidaCaliente"


    // $ANTLR start "ruleBebidaCaliente"
    // InternalRestaurante.g:945:1: ruleBebidaCaliente returns [EObject current=null] : (otherlv_0= 'Bebida caliente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Foto:' ( (lv_foto_7_0= RULE_STRING ) ) (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleBebidaCaliente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_descripcion_5_0=null;
        Token otherlv_6=null;
        Token lv_foto_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_nutricional_9_0 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:951:2: ( (otherlv_0= 'Bebida caliente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Foto:' ( (lv_foto_7_0= RULE_STRING ) ) (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )? otherlv_10= '}' ) )
            // InternalRestaurante.g:952:2: (otherlv_0= 'Bebida caliente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Foto:' ( (lv_foto_7_0= RULE_STRING ) ) (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )? otherlv_10= '}' )
            {
            // InternalRestaurante.g:952:2: (otherlv_0= 'Bebida caliente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Foto:' ( (lv_foto_7_0= RULE_STRING ) ) (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )? otherlv_10= '}' )
            // InternalRestaurante.g:953:3: otherlv_0= 'Bebida caliente:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Foto:' ( (lv_foto_7_0= RULE_STRING ) ) (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBebidaCalienteAccess().getBebidaCalienteKeyword_0());
            		
            // InternalRestaurante.g:957:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestaurante.g:958:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestaurante.g:958:4: (lv_name_1_0= RULE_ID )
            // InternalRestaurante.g:959:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBebidaCalienteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBebidaCalienteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestaurante.g:975:3: ( (lv_nombre_2_0= RULE_STRING ) )
            // InternalRestaurante.g:976:4: (lv_nombre_2_0= RULE_STRING )
            {
            // InternalRestaurante.g:976:4: (lv_nombre_2_0= RULE_STRING )
            // InternalRestaurante.g:977:5: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getBebidaCalienteAccess().getNombreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBebidaCalienteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getBebidaCalienteAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBebidaCalienteAccess().getDescripcionKeyword_4());
            		
            // InternalRestaurante.g:1001:3: ( (lv_descripcion_5_0= RULE_STRING ) )
            // InternalRestaurante.g:1002:4: (lv_descripcion_5_0= RULE_STRING )
            {
            // InternalRestaurante.g:1002:4: (lv_descripcion_5_0= RULE_STRING )
            // InternalRestaurante.g:1003:5: lv_descripcion_5_0= RULE_STRING
            {
            lv_descripcion_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_descripcion_5_0, grammarAccess.getBebidaCalienteAccess().getDescripcionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBebidaCalienteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descripcion",
            						lv_descripcion_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getBebidaCalienteAccess().getFotoKeyword_6());
            		
            // InternalRestaurante.g:1023:3: ( (lv_foto_7_0= RULE_STRING ) )
            // InternalRestaurante.g:1024:4: (lv_foto_7_0= RULE_STRING )
            {
            // InternalRestaurante.g:1024:4: (lv_foto_7_0= RULE_STRING )
            // InternalRestaurante.g:1025:5: lv_foto_7_0= RULE_STRING
            {
            lv_foto_7_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_foto_7_0, grammarAccess.getBebidaCalienteAccess().getFotoSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBebidaCalienteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"foto",
            						lv_foto_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:1041:3: (otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRestaurante.g:1042:4: otherlv_8= 'Nutricional' ( (lv_nutricional_9_0= ruleNutricional ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getBebidaCalienteAccess().getNutricionalKeyword_8_0());
                    			
                    // InternalRestaurante.g:1046:4: ( (lv_nutricional_9_0= ruleNutricional ) )
                    // InternalRestaurante.g:1047:5: (lv_nutricional_9_0= ruleNutricional )
                    {
                    // InternalRestaurante.g:1047:5: (lv_nutricional_9_0= ruleNutricional )
                    // InternalRestaurante.g:1048:6: lv_nutricional_9_0= ruleNutricional
                    {

                    						newCompositeNode(grammarAccess.getBebidaCalienteAccess().getNutricionalNutricionalParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_nutricional_9_0=ruleNutricional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBebidaCalienteRule());
                    						}
                    						set(
                    							current,
                    							"nutricional",
                    							lv_nutricional_9_0,
                    							"org.xtext.dsl.restaurante.Restaurante.Nutricional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBebidaCalienteAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleBebidaCaliente"


    // $ANTLR start "entryRulePostre"
    // InternalRestaurante.g:1074:1: entryRulePostre returns [EObject current=null] : iv_rulePostre= rulePostre EOF ;
    public final EObject entryRulePostre() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostre = null;


        try {
            // InternalRestaurante.g:1074:47: (iv_rulePostre= rulePostre EOF )
            // InternalRestaurante.g:1075:2: iv_rulePostre= rulePostre EOF
            {
             newCompositeNode(grammarAccess.getPostreRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostre=rulePostre();

            state._fsp--;

             current =iv_rulePostre; 
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
    // $ANTLR end "entryRulePostre"


    // $ANTLR start "rulePostre"
    // InternalRestaurante.g:1081:1: rulePostre returns [EObject current=null] : (otherlv_0= 'Postre:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_helado_3_0= 'helado' ) )? otherlv_4= '{' otherlv_5= 'Descripcion:' ( (lv_descripcion_6_0= RULE_STRING ) ) (otherlv_7= 'Distribuidor:' ( (lv_distribuidor_8_0= ruleDistribuidor ) ) )? otherlv_9= 'Foto:' ( (lv_foto_10_0= RULE_STRING ) ) (otherlv_11= 'Ingredientes:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )? otherlv_17= '}' ) ;
    public final EObject rulePostre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nombre_2_0=null;
        Token lv_helado_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_descripcion_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_foto_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_distribuidor_8_0 = null;

        EObject lv_nutricional_16_0 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:1087:2: ( (otherlv_0= 'Postre:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_helado_3_0= 'helado' ) )? otherlv_4= '{' otherlv_5= 'Descripcion:' ( (lv_descripcion_6_0= RULE_STRING ) ) (otherlv_7= 'Distribuidor:' ( (lv_distribuidor_8_0= ruleDistribuidor ) ) )? otherlv_9= 'Foto:' ( (lv_foto_10_0= RULE_STRING ) ) (otherlv_11= 'Ingredientes:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )? otherlv_17= '}' ) )
            // InternalRestaurante.g:1088:2: (otherlv_0= 'Postre:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_helado_3_0= 'helado' ) )? otherlv_4= '{' otherlv_5= 'Descripcion:' ( (lv_descripcion_6_0= RULE_STRING ) ) (otherlv_7= 'Distribuidor:' ( (lv_distribuidor_8_0= ruleDistribuidor ) ) )? otherlv_9= 'Foto:' ( (lv_foto_10_0= RULE_STRING ) ) (otherlv_11= 'Ingredientes:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )? otherlv_17= '}' )
            {
            // InternalRestaurante.g:1088:2: (otherlv_0= 'Postre:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_helado_3_0= 'helado' ) )? otherlv_4= '{' otherlv_5= 'Descripcion:' ( (lv_descripcion_6_0= RULE_STRING ) ) (otherlv_7= 'Distribuidor:' ( (lv_distribuidor_8_0= ruleDistribuidor ) ) )? otherlv_9= 'Foto:' ( (lv_foto_10_0= RULE_STRING ) ) (otherlv_11= 'Ingredientes:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )? otherlv_17= '}' )
            // InternalRestaurante.g:1089:3: otherlv_0= 'Postre:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) ( (lv_helado_3_0= 'helado' ) )? otherlv_4= '{' otherlv_5= 'Descripcion:' ( (lv_descripcion_6_0= RULE_STRING ) ) (otherlv_7= 'Distribuidor:' ( (lv_distribuidor_8_0= ruleDistribuidor ) ) )? otherlv_9= 'Foto:' ( (lv_foto_10_0= RULE_STRING ) ) (otherlv_11= 'Ingredientes:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )? (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPostreAccess().getPostreKeyword_0());
            		
            // InternalRestaurante.g:1093:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestaurante.g:1094:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestaurante.g:1094:4: (lv_name_1_0= RULE_ID )
            // InternalRestaurante.g:1095:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPostreAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestaurante.g:1111:3: ( (lv_nombre_2_0= RULE_STRING ) )
            // InternalRestaurante.g:1112:4: (lv_nombre_2_0= RULE_STRING )
            {
            // InternalRestaurante.g:1112:4: (lv_nombre_2_0= RULE_STRING )
            // InternalRestaurante.g:1113:5: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getPostreAccess().getNombreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:1129:3: ( (lv_helado_3_0= 'helado' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRestaurante.g:1130:4: (lv_helado_3_0= 'helado' )
                    {
                    // InternalRestaurante.g:1130:4: (lv_helado_3_0= 'helado' )
                    // InternalRestaurante.g:1131:5: lv_helado_3_0= 'helado'
                    {
                    lv_helado_3_0=(Token)match(input,37,FOLLOW_7); 

                    					newLeafNode(lv_helado_3_0, grammarAccess.getPostreAccess().getHeladoHeladoKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPostreRule());
                    					}
                    					setWithLastConsumed(current, "helado", true, "helado");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getPostreAccess().getLeftCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPostreAccess().getDescripcionKeyword_5());
            		
            // InternalRestaurante.g:1151:3: ( (lv_descripcion_6_0= RULE_STRING ) )
            // InternalRestaurante.g:1152:4: (lv_descripcion_6_0= RULE_STRING )
            {
            // InternalRestaurante.g:1152:4: (lv_descripcion_6_0= RULE_STRING )
            // InternalRestaurante.g:1153:5: lv_descripcion_6_0= RULE_STRING
            {
            lv_descripcion_6_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_descripcion_6_0, grammarAccess.getPostreAccess().getDescripcionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descripcion",
            						lv_descripcion_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:1169:3: (otherlv_7= 'Distribuidor:' ( (lv_distribuidor_8_0= ruleDistribuidor ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRestaurante.g:1170:4: otherlv_7= 'Distribuidor:' ( (lv_distribuidor_8_0= ruleDistribuidor ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getPostreAccess().getDistribuidorKeyword_7_0());
                    			
                    // InternalRestaurante.g:1174:4: ( (lv_distribuidor_8_0= ruleDistribuidor ) )
                    // InternalRestaurante.g:1175:5: (lv_distribuidor_8_0= ruleDistribuidor )
                    {
                    // InternalRestaurante.g:1175:5: (lv_distribuidor_8_0= ruleDistribuidor )
                    // InternalRestaurante.g:1176:6: lv_distribuidor_8_0= ruleDistribuidor
                    {

                    						newCompositeNode(grammarAccess.getPostreAccess().getDistribuidorDistribuidorEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_distribuidor_8_0=ruleDistribuidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPostreRule());
                    						}
                    						set(
                    							current,
                    							"distribuidor",
                    							lv_distribuidor_8_0,
                    							"org.xtext.dsl.restaurante.Restaurante.Distribuidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getPostreAccess().getFotoKeyword_8());
            		
            // InternalRestaurante.g:1198:3: ( (lv_foto_10_0= RULE_STRING ) )
            // InternalRestaurante.g:1199:4: (lv_foto_10_0= RULE_STRING )
            {
            // InternalRestaurante.g:1199:4: (lv_foto_10_0= RULE_STRING )
            // InternalRestaurante.g:1200:5: lv_foto_10_0= RULE_STRING
            {
            lv_foto_10_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_foto_10_0, grammarAccess.getPostreAccess().getFotoSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"foto",
            						lv_foto_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:1216:3: (otherlv_11= 'Ingredientes:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRestaurante.g:1217:4: otherlv_11= 'Ingredientes:' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getPostreAccess().getIngredientesKeyword_10_0());
                    			
                    // InternalRestaurante.g:1221:4: ( (otherlv_12= RULE_ID ) )
                    // InternalRestaurante.g:1222:5: (otherlv_12= RULE_ID )
                    {
                    // InternalRestaurante.g:1222:5: (otherlv_12= RULE_ID )
                    // InternalRestaurante.g:1223:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPostreRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_12, grammarAccess.getPostreAccess().getIngredientesIngredienteCrossReference_10_1_0());
                    					

                    }


                    }

                    // InternalRestaurante.g:1234:4: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==29) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRestaurante.g:1235:5: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,29,FOLLOW_13); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getPostreAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalRestaurante.g:1239:5: ( (otherlv_14= RULE_ID ) )
                    	    // InternalRestaurante.g:1240:6: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalRestaurante.g:1240:6: (otherlv_14= RULE_ID )
                    	    // InternalRestaurante.g:1241:7: otherlv_14= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPostreRule());
                    	    							}
                    	    						
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_31); 

                    	    							newLeafNode(otherlv_14, grammarAccess.getPostreAccess().getIngredientesIngredienteCrossReference_10_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRestaurante.g:1254:3: (otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRestaurante.g:1255:4: otherlv_15= 'Nutricional' ( (lv_nutricional_16_0= ruleNutricional ) )
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getPostreAccess().getNutricionalKeyword_11_0());
                    			
                    // InternalRestaurante.g:1259:4: ( (lv_nutricional_16_0= ruleNutricional ) )
                    // InternalRestaurante.g:1260:5: (lv_nutricional_16_0= ruleNutricional )
                    {
                    // InternalRestaurante.g:1260:5: (lv_nutricional_16_0= ruleNutricional )
                    // InternalRestaurante.g:1261:6: lv_nutricional_16_0= ruleNutricional
                    {

                    						newCompositeNode(grammarAccess.getPostreAccess().getNutricionalNutricionalParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_nutricional_16_0=ruleNutricional();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPostreRule());
                    						}
                    						set(
                    							current,
                    							"nutricional",
                    							lv_nutricional_16_0,
                    							"org.xtext.dsl.restaurante.Restaurante.Nutricional");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getPostreAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "rulePostre"


    // $ANTLR start "entryRuleNutricional"
    // InternalRestaurante.g:1287:1: entryRuleNutricional returns [EObject current=null] : iv_ruleNutricional= ruleNutricional EOF ;
    public final EObject entryRuleNutricional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutricional = null;


        try {
            // InternalRestaurante.g:1287:52: (iv_ruleNutricional= ruleNutricional EOF )
            // InternalRestaurante.g:1288:2: iv_ruleNutricional= ruleNutricional EOF
            {
             newCompositeNode(grammarAccess.getNutricionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNutricional=ruleNutricional();

            state._fsp--;

             current =iv_ruleNutricional; 
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
    // $ANTLR end "entryRuleNutricional"


    // $ANTLR start "ruleNutricional"
    // InternalRestaurante.g:1294:1: ruleNutricional returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'cantidad:' ( (lv_cantidad_2_0= ruleFloat ) ) otherlv_3= 'medida:' ( (lv_unidad_4_0= RULE_STRING ) ) otherlv_5= 'energia:' ( (lv_energia_6_0= ruleFloat ) ) otherlv_7= 'grasas:' ( (lv_grasas_8_0= ruleFloat ) ) otherlv_9= 'hidratos:' ( (lv_hidratos_10_0= ruleFloat ) ) otherlv_11= 'proteinas:' ( (lv_proteinas_12_0= ruleFloat ) ) otherlv_13= 'sal:' ( (lv_sal_14_0= ruleFloat ) ) otherlv_15= '}' ) ;
    public final EObject ruleNutricional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_unidad_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_cantidad_2_0 = null;

        AntlrDatatypeRuleToken lv_energia_6_0 = null;

        AntlrDatatypeRuleToken lv_grasas_8_0 = null;

        AntlrDatatypeRuleToken lv_hidratos_10_0 = null;

        AntlrDatatypeRuleToken lv_proteinas_12_0 = null;

        AntlrDatatypeRuleToken lv_sal_14_0 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:1300:2: ( (otherlv_0= '{' otherlv_1= 'cantidad:' ( (lv_cantidad_2_0= ruleFloat ) ) otherlv_3= 'medida:' ( (lv_unidad_4_0= RULE_STRING ) ) otherlv_5= 'energia:' ( (lv_energia_6_0= ruleFloat ) ) otherlv_7= 'grasas:' ( (lv_grasas_8_0= ruleFloat ) ) otherlv_9= 'hidratos:' ( (lv_hidratos_10_0= ruleFloat ) ) otherlv_11= 'proteinas:' ( (lv_proteinas_12_0= ruleFloat ) ) otherlv_13= 'sal:' ( (lv_sal_14_0= ruleFloat ) ) otherlv_15= '}' ) )
            // InternalRestaurante.g:1301:2: (otherlv_0= '{' otherlv_1= 'cantidad:' ( (lv_cantidad_2_0= ruleFloat ) ) otherlv_3= 'medida:' ( (lv_unidad_4_0= RULE_STRING ) ) otherlv_5= 'energia:' ( (lv_energia_6_0= ruleFloat ) ) otherlv_7= 'grasas:' ( (lv_grasas_8_0= ruleFloat ) ) otherlv_9= 'hidratos:' ( (lv_hidratos_10_0= ruleFloat ) ) otherlv_11= 'proteinas:' ( (lv_proteinas_12_0= ruleFloat ) ) otherlv_13= 'sal:' ( (lv_sal_14_0= ruleFloat ) ) otherlv_15= '}' )
            {
            // InternalRestaurante.g:1301:2: (otherlv_0= '{' otherlv_1= 'cantidad:' ( (lv_cantidad_2_0= ruleFloat ) ) otherlv_3= 'medida:' ( (lv_unidad_4_0= RULE_STRING ) ) otherlv_5= 'energia:' ( (lv_energia_6_0= ruleFloat ) ) otherlv_7= 'grasas:' ( (lv_grasas_8_0= ruleFloat ) ) otherlv_9= 'hidratos:' ( (lv_hidratos_10_0= ruleFloat ) ) otherlv_11= 'proteinas:' ( (lv_proteinas_12_0= ruleFloat ) ) otherlv_13= 'sal:' ( (lv_sal_14_0= ruleFloat ) ) otherlv_15= '}' )
            // InternalRestaurante.g:1302:3: otherlv_0= '{' otherlv_1= 'cantidad:' ( (lv_cantidad_2_0= ruleFloat ) ) otherlv_3= 'medida:' ( (lv_unidad_4_0= RULE_STRING ) ) otherlv_5= 'energia:' ( (lv_energia_6_0= ruleFloat ) ) otherlv_7= 'grasas:' ( (lv_grasas_8_0= ruleFloat ) ) otherlv_9= 'hidratos:' ( (lv_hidratos_10_0= ruleFloat ) ) otherlv_11= 'proteinas:' ( (lv_proteinas_12_0= ruleFloat ) ) otherlv_13= 'sal:' ( (lv_sal_14_0= ruleFloat ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getNutricionalAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getNutricionalAccess().getCantidadKeyword_1());
            		
            // InternalRestaurante.g:1310:3: ( (lv_cantidad_2_0= ruleFloat ) )
            // InternalRestaurante.g:1311:4: (lv_cantidad_2_0= ruleFloat )
            {
            // InternalRestaurante.g:1311:4: (lv_cantidad_2_0= ruleFloat )
            // InternalRestaurante.g:1312:5: lv_cantidad_2_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getNutricionalAccess().getCantidadFloatParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_cantidad_2_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNutricionalRule());
            					}
            					set(
            						current,
            						"cantidad",
            						lv_cantidad_2_0,
            						"org.xtext.dsl.restaurante.Restaurante.Float");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getNutricionalAccess().getMedidaKeyword_3());
            		
            // InternalRestaurante.g:1333:3: ( (lv_unidad_4_0= RULE_STRING ) )
            // InternalRestaurante.g:1334:4: (lv_unidad_4_0= RULE_STRING )
            {
            // InternalRestaurante.g:1334:4: (lv_unidad_4_0= RULE_STRING )
            // InternalRestaurante.g:1335:5: lv_unidad_4_0= RULE_STRING
            {
            lv_unidad_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

            					newLeafNode(lv_unidad_4_0, grammarAccess.getNutricionalAccess().getUnidadSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNutricionalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"unidad",
            						lv_unidad_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_33); 

            			newLeafNode(otherlv_5, grammarAccess.getNutricionalAccess().getEnergiaKeyword_5());
            		
            // InternalRestaurante.g:1355:3: ( (lv_energia_6_0= ruleFloat ) )
            // InternalRestaurante.g:1356:4: (lv_energia_6_0= ruleFloat )
            {
            // InternalRestaurante.g:1356:4: (lv_energia_6_0= ruleFloat )
            // InternalRestaurante.g:1357:5: lv_energia_6_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getNutricionalAccess().getEnergiaFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_36);
            lv_energia_6_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNutricionalRule());
            					}
            					set(
            						current,
            						"energia",
            						lv_energia_6_0,
            						"org.xtext.dsl.restaurante.Restaurante.Float");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,41,FOLLOW_33); 

            			newLeafNode(otherlv_7, grammarAccess.getNutricionalAccess().getGrasasKeyword_7());
            		
            // InternalRestaurante.g:1378:3: ( (lv_grasas_8_0= ruleFloat ) )
            // InternalRestaurante.g:1379:4: (lv_grasas_8_0= ruleFloat )
            {
            // InternalRestaurante.g:1379:4: (lv_grasas_8_0= ruleFloat )
            // InternalRestaurante.g:1380:5: lv_grasas_8_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getNutricionalAccess().getGrasasFloatParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_37);
            lv_grasas_8_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNutricionalRule());
            					}
            					set(
            						current,
            						"grasas",
            						lv_grasas_8_0,
            						"org.xtext.dsl.restaurante.Restaurante.Float");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,42,FOLLOW_33); 

            			newLeafNode(otherlv_9, grammarAccess.getNutricionalAccess().getHidratosKeyword_9());
            		
            // InternalRestaurante.g:1401:3: ( (lv_hidratos_10_0= ruleFloat ) )
            // InternalRestaurante.g:1402:4: (lv_hidratos_10_0= ruleFloat )
            {
            // InternalRestaurante.g:1402:4: (lv_hidratos_10_0= ruleFloat )
            // InternalRestaurante.g:1403:5: lv_hidratos_10_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getNutricionalAccess().getHidratosFloatParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_38);
            lv_hidratos_10_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNutricionalRule());
            					}
            					set(
            						current,
            						"hidratos",
            						lv_hidratos_10_0,
            						"org.xtext.dsl.restaurante.Restaurante.Float");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,43,FOLLOW_33); 

            			newLeafNode(otherlv_11, grammarAccess.getNutricionalAccess().getProteinasKeyword_11());
            		
            // InternalRestaurante.g:1424:3: ( (lv_proteinas_12_0= ruleFloat ) )
            // InternalRestaurante.g:1425:4: (lv_proteinas_12_0= ruleFloat )
            {
            // InternalRestaurante.g:1425:4: (lv_proteinas_12_0= ruleFloat )
            // InternalRestaurante.g:1426:5: lv_proteinas_12_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getNutricionalAccess().getProteinasFloatParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_39);
            lv_proteinas_12_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNutricionalRule());
            					}
            					set(
            						current,
            						"proteinas",
            						lv_proteinas_12_0,
            						"org.xtext.dsl.restaurante.Restaurante.Float");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,44,FOLLOW_33); 

            			newLeafNode(otherlv_13, grammarAccess.getNutricionalAccess().getSalKeyword_13());
            		
            // InternalRestaurante.g:1447:3: ( (lv_sal_14_0= ruleFloat ) )
            // InternalRestaurante.g:1448:4: (lv_sal_14_0= ruleFloat )
            {
            // InternalRestaurante.g:1448:4: (lv_sal_14_0= ruleFloat )
            // InternalRestaurante.g:1449:5: lv_sal_14_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getNutricionalAccess().getSalFloatParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_25);
            lv_sal_14_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNutricionalRule());
            					}
            					set(
            						current,
            						"sal",
            						lv_sal_14_0,
            						"org.xtext.dsl.restaurante.Restaurante.Float");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getNutricionalAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleNutricional"


    // $ANTLR start "entryRuleMenu"
    // InternalRestaurante.g:1474:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // InternalRestaurante.g:1474:45: (iv_ruleMenu= ruleMenu EOF )
            // InternalRestaurante.g:1475:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalRestaurante.g:1481:1: ruleMenu returns [EObject current=null] : (otherlv_0= 'Menu:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Tama\\u00F1o:' ( (lv_tamanio_7_0= ruleTamanioMenu ) ) otherlv_8= 'Foto:' ( (lv_foto_9_0= RULE_STRING ) ) (otherlv_10= 'Productos:' ( (lv_productos_11_0= ruleProductoY ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_descripcion_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_foto_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_tamanio_7_0 = null;

        EObject lv_productos_11_0 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:1487:2: ( (otherlv_0= 'Menu:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Tama\\u00F1o:' ( (lv_tamanio_7_0= ruleTamanioMenu ) ) otherlv_8= 'Foto:' ( (lv_foto_9_0= RULE_STRING ) ) (otherlv_10= 'Productos:' ( (lv_productos_11_0= ruleProductoY ) ) )? otherlv_12= '}' ) )
            // InternalRestaurante.g:1488:2: (otherlv_0= 'Menu:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Tama\\u00F1o:' ( (lv_tamanio_7_0= ruleTamanioMenu ) ) otherlv_8= 'Foto:' ( (lv_foto_9_0= RULE_STRING ) ) (otherlv_10= 'Productos:' ( (lv_productos_11_0= ruleProductoY ) ) )? otherlv_12= '}' )
            {
            // InternalRestaurante.g:1488:2: (otherlv_0= 'Menu:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Tama\\u00F1o:' ( (lv_tamanio_7_0= ruleTamanioMenu ) ) otherlv_8= 'Foto:' ( (lv_foto_9_0= RULE_STRING ) ) (otherlv_10= 'Productos:' ( (lv_productos_11_0= ruleProductoY ) ) )? otherlv_12= '}' )
            // InternalRestaurante.g:1489:3: otherlv_0= 'Menu:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_nombre_2_0= RULE_STRING ) ) otherlv_3= '{' otherlv_4= 'Descripcion:' ( (lv_descripcion_5_0= RULE_STRING ) ) otherlv_6= 'Tama\\u00F1o:' ( (lv_tamanio_7_0= ruleTamanioMenu ) ) otherlv_8= 'Foto:' ( (lv_foto_9_0= RULE_STRING ) ) (otherlv_10= 'Productos:' ( (lv_productos_11_0= ruleProductoY ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMenuAccess().getMenuKeyword_0());
            		
            // InternalRestaurante.g:1493:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRestaurante.g:1494:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRestaurante.g:1494:4: (lv_name_1_0= RULE_ID )
            // InternalRestaurante.g:1495:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRestaurante.g:1511:3: ( (lv_nombre_2_0= RULE_STRING ) )
            // InternalRestaurante.g:1512:4: (lv_nombre_2_0= RULE_STRING )
            {
            // InternalRestaurante.g:1512:4: (lv_nombre_2_0= RULE_STRING )
            // InternalRestaurante.g:1513:5: lv_nombre_2_0= RULE_STRING
            {
            lv_nombre_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getMenuAccess().getNombreSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getDescripcionKeyword_4());
            		
            // InternalRestaurante.g:1537:3: ( (lv_descripcion_5_0= RULE_STRING ) )
            // InternalRestaurante.g:1538:4: (lv_descripcion_5_0= RULE_STRING )
            {
            // InternalRestaurante.g:1538:4: (lv_descripcion_5_0= RULE_STRING )
            // InternalRestaurante.g:1539:5: lv_descripcion_5_0= RULE_STRING
            {
            lv_descripcion_5_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            					newLeafNode(lv_descripcion_5_0, grammarAccess.getMenuAccess().getDescripcionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"descripcion",
            						lv_descripcion_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_41); 

            			newLeafNode(otherlv_6, grammarAccess.getMenuAccess().getTamaOKeyword_6());
            		
            // InternalRestaurante.g:1559:3: ( (lv_tamanio_7_0= ruleTamanioMenu ) )
            // InternalRestaurante.g:1560:4: (lv_tamanio_7_0= ruleTamanioMenu )
            {
            // InternalRestaurante.g:1560:4: (lv_tamanio_7_0= ruleTamanioMenu )
            // InternalRestaurante.g:1561:5: lv_tamanio_7_0= ruleTamanioMenu
            {

            					newCompositeNode(grammarAccess.getMenuAccess().getTamanioTamanioMenuEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_20);
            lv_tamanio_7_0=ruleTamanioMenu();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuRule());
            					}
            					set(
            						current,
            						"tamanio",
            						lv_tamanio_7_0,
            						"org.xtext.dsl.restaurante.Restaurante.TamanioMenu");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMenuAccess().getFotoKeyword_8());
            		
            // InternalRestaurante.g:1582:3: ( (lv_foto_9_0= RULE_STRING ) )
            // InternalRestaurante.g:1583:4: (lv_foto_9_0= RULE_STRING )
            {
            // InternalRestaurante.g:1583:4: (lv_foto_9_0= RULE_STRING )
            // InternalRestaurante.g:1584:5: lv_foto_9_0= RULE_STRING
            {
            lv_foto_9_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            					newLeafNode(lv_foto_9_0, grammarAccess.getMenuAccess().getFotoSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMenuRule());
            					}
            					setWithLastConsumed(
            						current,
            						"foto",
            						lv_foto_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRestaurante.g:1600:3: (otherlv_10= 'Productos:' ( (lv_productos_11_0= ruleProductoY ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRestaurante.g:1601:4: otherlv_10= 'Productos:' ( (lv_productos_11_0= ruleProductoY ) )
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_43); 

                    				newLeafNode(otherlv_10, grammarAccess.getMenuAccess().getProductosKeyword_10_0());
                    			
                    // InternalRestaurante.g:1605:4: ( (lv_productos_11_0= ruleProductoY ) )
                    // InternalRestaurante.g:1606:5: (lv_productos_11_0= ruleProductoY )
                    {
                    // InternalRestaurante.g:1606:5: (lv_productos_11_0= ruleProductoY )
                    // InternalRestaurante.g:1607:6: lv_productos_11_0= ruleProductoY
                    {

                    						newCompositeNode(grammarAccess.getMenuAccess().getProductosProductoYParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_productos_11_0=ruleProductoY();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMenuRule());
                    						}
                    						set(
                    							current,
                    							"productos",
                    							lv_productos_11_0,
                    							"org.xtext.dsl.restaurante.Restaurante.ProductoY");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleProductoY"
    // InternalRestaurante.g:1633:1: entryRuleProductoY returns [EObject current=null] : iv_ruleProductoY= ruleProductoY EOF ;
    public final EObject entryRuleProductoY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductoY = null;


        try {
            // InternalRestaurante.g:1633:50: (iv_ruleProductoY= ruleProductoY EOF )
            // InternalRestaurante.g:1634:2: iv_ruleProductoY= ruleProductoY EOF
            {
             newCompositeNode(grammarAccess.getProductoYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductoY=ruleProductoY();

            state._fsp--;

             current =iv_ruleProductoY; 
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
    // $ANTLR end "entryRuleProductoY"


    // $ANTLR start "ruleProductoY"
    // InternalRestaurante.g:1640:1: ruleProductoY returns [EObject current=null] : ( ( (lv_izq_0_0= ruleProductoO ) ) (otherlv_1= 'Y' ( (lv_der_2_0= ruleProductoO ) ) )* ) ;
    public final EObject ruleProductoY() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_izq_0_0 = null;

        EObject lv_der_2_0 = null;



        	enterRule();

        try {
            // InternalRestaurante.g:1646:2: ( ( ( (lv_izq_0_0= ruleProductoO ) ) (otherlv_1= 'Y' ( (lv_der_2_0= ruleProductoO ) ) )* ) )
            // InternalRestaurante.g:1647:2: ( ( (lv_izq_0_0= ruleProductoO ) ) (otherlv_1= 'Y' ( (lv_der_2_0= ruleProductoO ) ) )* )
            {
            // InternalRestaurante.g:1647:2: ( ( (lv_izq_0_0= ruleProductoO ) ) (otherlv_1= 'Y' ( (lv_der_2_0= ruleProductoO ) ) )* )
            // InternalRestaurante.g:1648:3: ( (lv_izq_0_0= ruleProductoO ) ) (otherlv_1= 'Y' ( (lv_der_2_0= ruleProductoO ) ) )*
            {
            // InternalRestaurante.g:1648:3: ( (lv_izq_0_0= ruleProductoO ) )
            // InternalRestaurante.g:1649:4: (lv_izq_0_0= ruleProductoO )
            {
            // InternalRestaurante.g:1649:4: (lv_izq_0_0= ruleProductoO )
            // InternalRestaurante.g:1650:5: lv_izq_0_0= ruleProductoO
            {

            					newCompositeNode(grammarAccess.getProductoYAccess().getIzqProductoOParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_izq_0_0=ruleProductoO();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductoYRule());
            					}
            					set(
            						current,
            						"izq",
            						lv_izq_0_0,
            						"org.xtext.dsl.restaurante.Restaurante.ProductoO");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRestaurante.g:1667:3: (otherlv_1= 'Y' ( (lv_der_2_0= ruleProductoO ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRestaurante.g:1668:4: otherlv_1= 'Y' ( (lv_der_2_0= ruleProductoO ) )
            	    {
            	    otherlv_1=(Token)match(input,48,FOLLOW_43); 

            	    				newLeafNode(otherlv_1, grammarAccess.getProductoYAccess().getYKeyword_1_0());
            	    			
            	    // InternalRestaurante.g:1672:4: ( (lv_der_2_0= ruleProductoO ) )
            	    // InternalRestaurante.g:1673:5: (lv_der_2_0= ruleProductoO )
            	    {
            	    // InternalRestaurante.g:1673:5: (lv_der_2_0= ruleProductoO )
            	    // InternalRestaurante.g:1674:6: lv_der_2_0= ruleProductoO
            	    {

            	    						newCompositeNode(grammarAccess.getProductoYAccess().getDerProductoOParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
            	    lv_der_2_0=ruleProductoO();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProductoYRule());
            	    						}
            	    						add(
            	    							current,
            	    							"der",
            	    							lv_der_2_0,
            	    							"org.xtext.dsl.restaurante.Restaurante.ProductoO");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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
    // $ANTLR end "ruleProductoY"


    // $ANTLR start "entryRuleProductoO"
    // InternalRestaurante.g:1696:1: entryRuleProductoO returns [EObject current=null] : iv_ruleProductoO= ruleProductoO EOF ;
    public final EObject entryRuleProductoO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductoO = null;


        try {
            // InternalRestaurante.g:1696:50: (iv_ruleProductoO= ruleProductoO EOF )
            // InternalRestaurante.g:1697:2: iv_ruleProductoO= ruleProductoO EOF
            {
             newCompositeNode(grammarAccess.getProductoORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductoO=ruleProductoO();

            state._fsp--;

             current =iv_ruleProductoO; 
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
    // $ANTLR end "entryRuleProductoO"


    // $ANTLR start "ruleProductoO"
    // InternalRestaurante.g:1703:1: ruleProductoO returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'O' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' ) ) ;
    public final EObject ruleProductoO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRestaurante.g:1709:2: ( ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'O' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' ) ) )
            // InternalRestaurante.g:1710:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'O' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' ) )
            {
            // InternalRestaurante.g:1710:2: ( ( (otherlv_0= RULE_ID ) ) | (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'O' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            else if ( (LA24_0==49) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalRestaurante.g:1711:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalRestaurante.g:1711:3: ( (otherlv_0= RULE_ID ) )
                    // InternalRestaurante.g:1712:4: (otherlv_0= RULE_ID )
                    {
                    // InternalRestaurante.g:1712:4: (otherlv_0= RULE_ID )
                    // InternalRestaurante.g:1713:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProductoORule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getProductoOAccess().getIzqProductoCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:1725:3: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'O' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )
                    {
                    // InternalRestaurante.g:1725:3: (otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'O' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')' )
                    // InternalRestaurante.g:1726:4: otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'O' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getProductoOAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalRestaurante.g:1730:4: ( (otherlv_2= RULE_ID ) )
                    // InternalRestaurante.g:1731:5: (otherlv_2= RULE_ID )
                    {
                    // InternalRestaurante.g:1731:5: (otherlv_2= RULE_ID )
                    // InternalRestaurante.g:1732:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProductoORule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_45); 

                    						newLeafNode(otherlv_2, grammarAccess.getProductoOAccess().getIzqProductoCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalRestaurante.g:1743:4: (otherlv_3= 'O' ( (otherlv_4= RULE_ID ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==50) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRestaurante.g:1744:5: otherlv_3= 'O' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,50,FOLLOW_13); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getProductoOAccess().getOKeyword_1_2_0());
                    	    				
                    	    // InternalRestaurante.g:1748:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalRestaurante.g:1749:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalRestaurante.g:1749:6: (otherlv_4= RULE_ID )
                    	    // InternalRestaurante.g:1750:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProductoORule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_45); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getProductoOAccess().getDerProductoCrossReference_1_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getProductoOAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleProductoO"


    // $ANTLR start "entryRuleFloat"
    // InternalRestaurante.g:1771:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalRestaurante.g:1771:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalRestaurante.g:1772:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalRestaurante.g:1778:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= ',' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalRestaurante.g:1784:2: ( (this_INT_0= RULE_INT (kw= ',' this_INT_2= RULE_INT )? ) )
            // InternalRestaurante.g:1785:2: (this_INT_0= RULE_INT (kw= ',' this_INT_2= RULE_INT )? )
            {
            // InternalRestaurante.g:1785:2: (this_INT_0= RULE_INT (kw= ',' this_INT_2= RULE_INT )? )
            // InternalRestaurante.g:1786:3: this_INT_0= RULE_INT (kw= ',' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_46); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            // InternalRestaurante.g:1793:3: (kw= ',' this_INT_2= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRestaurante.g:1794:4: kw= ',' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,29,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFloatAccess().getCommaKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "ruleSalsaRecomendada"
    // InternalRestaurante.g:1811:1: ruleSalsaRecomendada returns [Enumerator current=null] : ( (enumLiteral_0= 'NINGUNA' ) | (enumLiteral_1= 'ACEITE_Y_VINAGRE' ) | (enumLiteral_2= 'CESAR' ) | (enumLiteral_3= 'MODENA' ) | (enumLiteral_4= 'MOSTAZA' ) ) ;
    public final Enumerator ruleSalsaRecomendada() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRestaurante.g:1817:2: ( ( (enumLiteral_0= 'NINGUNA' ) | (enumLiteral_1= 'ACEITE_Y_VINAGRE' ) | (enumLiteral_2= 'CESAR' ) | (enumLiteral_3= 'MODENA' ) | (enumLiteral_4= 'MOSTAZA' ) ) )
            // InternalRestaurante.g:1818:2: ( (enumLiteral_0= 'NINGUNA' ) | (enumLiteral_1= 'ACEITE_Y_VINAGRE' ) | (enumLiteral_2= 'CESAR' ) | (enumLiteral_3= 'MODENA' ) | (enumLiteral_4= 'MOSTAZA' ) )
            {
            // InternalRestaurante.g:1818:2: ( (enumLiteral_0= 'NINGUNA' ) | (enumLiteral_1= 'ACEITE_Y_VINAGRE' ) | (enumLiteral_2= 'CESAR' ) | (enumLiteral_3= 'MODENA' ) | (enumLiteral_4= 'MOSTAZA' ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt26=1;
                }
                break;
            case 53:
                {
                alt26=2;
                }
                break;
            case 54:
                {
                alt26=3;
                }
                break;
            case 55:
                {
                alt26=4;
                }
                break;
            case 56:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalRestaurante.g:1819:3: (enumLiteral_0= 'NINGUNA' )
                    {
                    // InternalRestaurante.g:1819:3: (enumLiteral_0= 'NINGUNA' )
                    // InternalRestaurante.g:1820:4: enumLiteral_0= 'NINGUNA'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getSalsaRecomendadaAccess().getNINGUNAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSalsaRecomendadaAccess().getNINGUNAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:1827:3: (enumLiteral_1= 'ACEITE_Y_VINAGRE' )
                    {
                    // InternalRestaurante.g:1827:3: (enumLiteral_1= 'ACEITE_Y_VINAGRE' )
                    // InternalRestaurante.g:1828:4: enumLiteral_1= 'ACEITE_Y_VINAGRE'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getSalsaRecomendadaAccess().getACEITE_Y_VINAGREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSalsaRecomendadaAccess().getACEITE_Y_VINAGREEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRestaurante.g:1835:3: (enumLiteral_2= 'CESAR' )
                    {
                    // InternalRestaurante.g:1835:3: (enumLiteral_2= 'CESAR' )
                    // InternalRestaurante.g:1836:4: enumLiteral_2= 'CESAR'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getSalsaRecomendadaAccess().getCESAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSalsaRecomendadaAccess().getCESAREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRestaurante.g:1843:3: (enumLiteral_3= 'MODENA' )
                    {
                    // InternalRestaurante.g:1843:3: (enumLiteral_3= 'MODENA' )
                    // InternalRestaurante.g:1844:4: enumLiteral_3= 'MODENA'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getSalsaRecomendadaAccess().getMODENAEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSalsaRecomendadaAccess().getMODENAEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRestaurante.g:1851:3: (enumLiteral_4= 'MOSTAZA' )
                    {
                    // InternalRestaurante.g:1851:3: (enumLiteral_4= 'MOSTAZA' )
                    // InternalRestaurante.g:1852:4: enumLiteral_4= 'MOSTAZA'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getSalsaRecomendadaAccess().getMOSTAZAEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSalsaRecomendadaAccess().getMOSTAZAEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleSalsaRecomendada"


    // $ANTLR start "ruleTamanioMenu"
    // InternalRestaurante.g:1862:1: ruleTamanioMenu returns [Enumerator current=null] : ( (enumLiteral_0= 'NORMAL' ) | (enumLiteral_1= 'GRANDE' ) | (enumLiteral_2= 'NORMAL_Y_GRANDE' ) ) ;
    public final Enumerator ruleTamanioMenu() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRestaurante.g:1868:2: ( ( (enumLiteral_0= 'NORMAL' ) | (enumLiteral_1= 'GRANDE' ) | (enumLiteral_2= 'NORMAL_Y_GRANDE' ) ) )
            // InternalRestaurante.g:1869:2: ( (enumLiteral_0= 'NORMAL' ) | (enumLiteral_1= 'GRANDE' ) | (enumLiteral_2= 'NORMAL_Y_GRANDE' ) )
            {
            // InternalRestaurante.g:1869:2: ( (enumLiteral_0= 'NORMAL' ) | (enumLiteral_1= 'GRANDE' ) | (enumLiteral_2= 'NORMAL_Y_GRANDE' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt27=1;
                }
                break;
            case 58:
                {
                alt27=2;
                }
                break;
            case 59:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalRestaurante.g:1870:3: (enumLiteral_0= 'NORMAL' )
                    {
                    // InternalRestaurante.g:1870:3: (enumLiteral_0= 'NORMAL' )
                    // InternalRestaurante.g:1871:4: enumLiteral_0= 'NORMAL'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTamanioMenuAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTamanioMenuAccess().getNORMALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:1878:3: (enumLiteral_1= 'GRANDE' )
                    {
                    // InternalRestaurante.g:1878:3: (enumLiteral_1= 'GRANDE' )
                    // InternalRestaurante.g:1879:4: enumLiteral_1= 'GRANDE'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getTamanioMenuAccess().getGRANDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTamanioMenuAccess().getGRANDEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRestaurante.g:1886:3: (enumLiteral_2= 'NORMAL_Y_GRANDE' )
                    {
                    // InternalRestaurante.g:1886:3: (enumLiteral_2= 'NORMAL_Y_GRANDE' )
                    // InternalRestaurante.g:1887:4: enumLiteral_2= 'NORMAL_Y_GRANDE'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getTamanioMenuAccess().getNORMAL_Y_GRANDEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTamanioMenuAccess().getNORMAL_Y_GRANDEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTamanioMenu"


    // $ANTLR start "ruleDistribuidor"
    // InternalRestaurante.g:1897:1: ruleDistribuidor returns [Enumerator current=null] : ( (enumLiteral_0= 'COCA_COLA' ) | (enumLiteral_1= 'AQUABONA' ) | (enumLiteral_2= 'MAHOU' ) | (enumLiteral_3= 'ALVALLE' ) | (enumLiteral_4= 'TROPICANA' ) | (enumLiteral_5= 'OREO' ) | (enumLiteral_6= 'MILKA' ) | (enumLiteral_7= 'DANONE' ) ) ;
    public final Enumerator ruleDistribuidor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalRestaurante.g:1903:2: ( ( (enumLiteral_0= 'COCA_COLA' ) | (enumLiteral_1= 'AQUABONA' ) | (enumLiteral_2= 'MAHOU' ) | (enumLiteral_3= 'ALVALLE' ) | (enumLiteral_4= 'TROPICANA' ) | (enumLiteral_5= 'OREO' ) | (enumLiteral_6= 'MILKA' ) | (enumLiteral_7= 'DANONE' ) ) )
            // InternalRestaurante.g:1904:2: ( (enumLiteral_0= 'COCA_COLA' ) | (enumLiteral_1= 'AQUABONA' ) | (enumLiteral_2= 'MAHOU' ) | (enumLiteral_3= 'ALVALLE' ) | (enumLiteral_4= 'TROPICANA' ) | (enumLiteral_5= 'OREO' ) | (enumLiteral_6= 'MILKA' ) | (enumLiteral_7= 'DANONE' ) )
            {
            // InternalRestaurante.g:1904:2: ( (enumLiteral_0= 'COCA_COLA' ) | (enumLiteral_1= 'AQUABONA' ) | (enumLiteral_2= 'MAHOU' ) | (enumLiteral_3= 'ALVALLE' ) | (enumLiteral_4= 'TROPICANA' ) | (enumLiteral_5= 'OREO' ) | (enumLiteral_6= 'MILKA' ) | (enumLiteral_7= 'DANONE' ) )
            int alt28=8;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt28=1;
                }
                break;
            case 61:
                {
                alt28=2;
                }
                break;
            case 62:
                {
                alt28=3;
                }
                break;
            case 63:
                {
                alt28=4;
                }
                break;
            case 64:
                {
                alt28=5;
                }
                break;
            case 65:
                {
                alt28=6;
                }
                break;
            case 66:
                {
                alt28=7;
                }
                break;
            case 67:
                {
                alt28=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalRestaurante.g:1905:3: (enumLiteral_0= 'COCA_COLA' )
                    {
                    // InternalRestaurante.g:1905:3: (enumLiteral_0= 'COCA_COLA' )
                    // InternalRestaurante.g:1906:4: enumLiteral_0= 'COCA_COLA'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDistribuidorAccess().getCOCA_COLAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDistribuidorAccess().getCOCA_COLAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:1913:3: (enumLiteral_1= 'AQUABONA' )
                    {
                    // InternalRestaurante.g:1913:3: (enumLiteral_1= 'AQUABONA' )
                    // InternalRestaurante.g:1914:4: enumLiteral_1= 'AQUABONA'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getDistribuidorAccess().getAQUABONAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDistribuidorAccess().getAQUABONAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRestaurante.g:1921:3: (enumLiteral_2= 'MAHOU' )
                    {
                    // InternalRestaurante.g:1921:3: (enumLiteral_2= 'MAHOU' )
                    // InternalRestaurante.g:1922:4: enumLiteral_2= 'MAHOU'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getDistribuidorAccess().getMAHOUEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDistribuidorAccess().getMAHOUEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRestaurante.g:1929:3: (enumLiteral_3= 'ALVALLE' )
                    {
                    // InternalRestaurante.g:1929:3: (enumLiteral_3= 'ALVALLE' )
                    // InternalRestaurante.g:1930:4: enumLiteral_3= 'ALVALLE'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getDistribuidorAccess().getALVALLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDistribuidorAccess().getALVALLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRestaurante.g:1937:3: (enumLiteral_4= 'TROPICANA' )
                    {
                    // InternalRestaurante.g:1937:3: (enumLiteral_4= 'TROPICANA' )
                    // InternalRestaurante.g:1938:4: enumLiteral_4= 'TROPICANA'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getDistribuidorAccess().getTROPICANAEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDistribuidorAccess().getTROPICANAEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRestaurante.g:1945:3: (enumLiteral_5= 'OREO' )
                    {
                    // InternalRestaurante.g:1945:3: (enumLiteral_5= 'OREO' )
                    // InternalRestaurante.g:1946:4: enumLiteral_5= 'OREO'
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getDistribuidorAccess().getOREOEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDistribuidorAccess().getOREOEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRestaurante.g:1953:3: (enumLiteral_6= 'MILKA' )
                    {
                    // InternalRestaurante.g:1953:3: (enumLiteral_6= 'MILKA' )
                    // InternalRestaurante.g:1954:4: enumLiteral_6= 'MILKA'
                    {
                    enumLiteral_6=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getDistribuidorAccess().getMILKAEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDistribuidorAccess().getMILKAEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRestaurante.g:1961:3: (enumLiteral_7= 'DANONE' )
                    {
                    // InternalRestaurante.g:1961:3: (enumLiteral_7= 'DANONE' )
                    // InternalRestaurante.g:1962:4: enumLiteral_7= 'DANONE'
                    {
                    enumLiteral_7=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDistribuidorAccess().getDANONEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getDistribuidorAccess().getDANONEEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleDistribuidor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001B01020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01F0000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xF000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000408000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000090020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000A0020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000020000002L});

}