package org.xtext.dsl.restaurante.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.dsl.restaurante.services.RestauranteGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestauranteParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_FECHA", "RULE_ID", "RULE_URL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NINGUNA'", "'ACEITE_Y_VINAGRE'", "'CESAR'", "'MODENA'", "'MOSTAZA'", "'NORMAL'", "'GRANDE'", "'NORMAL_Y_GRANDE'", "'COCA_COLA'", "'AQUABONA'", "'MAHOU'", "'ALVALLE'", "'TROPICANA'", "'OREO'", "'MILKA'", "'DANONE'", "'Restaurantes'", "'fecha'", "'Ingredientes'", "'{'", "'}'", "'Productos'", "'Menus'", "'Ingrediente:'", "'infoURL:'", "'foto:'", "'Principal:'", "'Descripcion:'", "'Foto:'", "'Salsa recomendada:'", "'Ingredientes:'", "','", "'Nutricional'", "'Complemento:'", "'Bebida fria:'", "'Distribuidor:'", "'Bebida caliente:'", "'Postre:'", "'cantidad:'", "'medida:'", "'energia:'", "'grasas:'", "'hidratos:'", "'proteinas:'", "'sal:'", "'Menu:'", "'Tama\\u00F1o:'", "'Productos:'", "'Y'", "'('", "')'", "'O'", "'alergenico'", "'ensalada'", "'helado'"
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
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int RULE_URL=8;
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
    public static final int RULE_STRING=5;
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
    public static final int RULE_FECHA=6;
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

    	public void setGrammarAccess(RestauranteGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRestaurante"
    // InternalRestaurante.g:53:1: entryRuleRestaurante : ruleRestaurante EOF ;
    public final void entryRuleRestaurante() throws RecognitionException {
        try {
            // InternalRestaurante.g:54:1: ( ruleRestaurante EOF )
            // InternalRestaurante.g:55:1: ruleRestaurante EOF
            {
             before(grammarAccess.getRestauranteRule()); 
            pushFollow(FOLLOW_1);
            ruleRestaurante();

            state._fsp--;

             after(grammarAccess.getRestauranteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRestaurante"


    // $ANTLR start "ruleRestaurante"
    // InternalRestaurante.g:62:1: ruleRestaurante : ( ( rule__Restaurante__Group__0 ) ) ;
    public final void ruleRestaurante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:66:2: ( ( ( rule__Restaurante__Group__0 ) ) )
            // InternalRestaurante.g:67:2: ( ( rule__Restaurante__Group__0 ) )
            {
            // InternalRestaurante.g:67:2: ( ( rule__Restaurante__Group__0 ) )
            // InternalRestaurante.g:68:3: ( rule__Restaurante__Group__0 )
            {
             before(grammarAccess.getRestauranteAccess().getGroup()); 
            // InternalRestaurante.g:69:3: ( rule__Restaurante__Group__0 )
            // InternalRestaurante.g:69:4: rule__Restaurante__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestauranteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRestaurante"


    // $ANTLR start "entryRuleIngrediente"
    // InternalRestaurante.g:78:1: entryRuleIngrediente : ruleIngrediente EOF ;
    public final void entryRuleIngrediente() throws RecognitionException {
        try {
            // InternalRestaurante.g:79:1: ( ruleIngrediente EOF )
            // InternalRestaurante.g:80:1: ruleIngrediente EOF
            {
             before(grammarAccess.getIngredienteRule()); 
            pushFollow(FOLLOW_1);
            ruleIngrediente();

            state._fsp--;

             after(grammarAccess.getIngredienteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIngrediente"


    // $ANTLR start "ruleIngrediente"
    // InternalRestaurante.g:87:1: ruleIngrediente : ( ( rule__Ingrediente__Group__0 ) ) ;
    public final void ruleIngrediente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:91:2: ( ( ( rule__Ingrediente__Group__0 ) ) )
            // InternalRestaurante.g:92:2: ( ( rule__Ingrediente__Group__0 ) )
            {
            // InternalRestaurante.g:92:2: ( ( rule__Ingrediente__Group__0 ) )
            // InternalRestaurante.g:93:3: ( rule__Ingrediente__Group__0 )
            {
             before(grammarAccess.getIngredienteAccess().getGroup()); 
            // InternalRestaurante.g:94:3: ( rule__Ingrediente__Group__0 )
            // InternalRestaurante.g:94:4: rule__Ingrediente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngrediente"


    // $ANTLR start "entryRuleProducto"
    // InternalRestaurante.g:103:1: entryRuleProducto : ruleProducto EOF ;
    public final void entryRuleProducto() throws RecognitionException {
        try {
            // InternalRestaurante.g:104:1: ( ruleProducto EOF )
            // InternalRestaurante.g:105:1: ruleProducto EOF
            {
             before(grammarAccess.getProductoRule()); 
            pushFollow(FOLLOW_1);
            ruleProducto();

            state._fsp--;

             after(grammarAccess.getProductoRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProducto"


    // $ANTLR start "ruleProducto"
    // InternalRestaurante.g:112:1: ruleProducto : ( ( rule__Producto__Alternatives ) ) ;
    public final void ruleProducto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:116:2: ( ( ( rule__Producto__Alternatives ) ) )
            // InternalRestaurante.g:117:2: ( ( rule__Producto__Alternatives ) )
            {
            // InternalRestaurante.g:117:2: ( ( rule__Producto__Alternatives ) )
            // InternalRestaurante.g:118:3: ( rule__Producto__Alternatives )
            {
             before(grammarAccess.getProductoAccess().getAlternatives()); 
            // InternalRestaurante.g:119:3: ( rule__Producto__Alternatives )
            // InternalRestaurante.g:119:4: rule__Producto__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Producto__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProductoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProducto"


    // $ANTLR start "entryRulePrincipal"
    // InternalRestaurante.g:128:1: entryRulePrincipal : rulePrincipal EOF ;
    public final void entryRulePrincipal() throws RecognitionException {
        try {
            // InternalRestaurante.g:129:1: ( rulePrincipal EOF )
            // InternalRestaurante.g:130:1: rulePrincipal EOF
            {
             before(grammarAccess.getPrincipalRule()); 
            pushFollow(FOLLOW_1);
            rulePrincipal();

            state._fsp--;

             after(grammarAccess.getPrincipalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrincipal"


    // $ANTLR start "rulePrincipal"
    // InternalRestaurante.g:137:1: rulePrincipal : ( ( rule__Principal__Group__0 ) ) ;
    public final void rulePrincipal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:141:2: ( ( ( rule__Principal__Group__0 ) ) )
            // InternalRestaurante.g:142:2: ( ( rule__Principal__Group__0 ) )
            {
            // InternalRestaurante.g:142:2: ( ( rule__Principal__Group__0 ) )
            // InternalRestaurante.g:143:3: ( rule__Principal__Group__0 )
            {
             before(grammarAccess.getPrincipalAccess().getGroup()); 
            // InternalRestaurante.g:144:3: ( rule__Principal__Group__0 )
            // InternalRestaurante.g:144:4: rule__Principal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrincipal"


    // $ANTLR start "entryRuleComplemento"
    // InternalRestaurante.g:153:1: entryRuleComplemento : ruleComplemento EOF ;
    public final void entryRuleComplemento() throws RecognitionException {
        try {
            // InternalRestaurante.g:154:1: ( ruleComplemento EOF )
            // InternalRestaurante.g:155:1: ruleComplemento EOF
            {
             before(grammarAccess.getComplementoRule()); 
            pushFollow(FOLLOW_1);
            ruleComplemento();

            state._fsp--;

             after(grammarAccess.getComplementoRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplemento"


    // $ANTLR start "ruleComplemento"
    // InternalRestaurante.g:162:1: ruleComplemento : ( ( rule__Complemento__Group__0 ) ) ;
    public final void ruleComplemento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:166:2: ( ( ( rule__Complemento__Group__0 ) ) )
            // InternalRestaurante.g:167:2: ( ( rule__Complemento__Group__0 ) )
            {
            // InternalRestaurante.g:167:2: ( ( rule__Complemento__Group__0 ) )
            // InternalRestaurante.g:168:3: ( rule__Complemento__Group__0 )
            {
             before(grammarAccess.getComplementoAccess().getGroup()); 
            // InternalRestaurante.g:169:3: ( rule__Complemento__Group__0 )
            // InternalRestaurante.g:169:4: rule__Complemento__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Complemento__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplementoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplemento"


    // $ANTLR start "entryRuleBebida"
    // InternalRestaurante.g:178:1: entryRuleBebida : ruleBebida EOF ;
    public final void entryRuleBebida() throws RecognitionException {
        try {
            // InternalRestaurante.g:179:1: ( ruleBebida EOF )
            // InternalRestaurante.g:180:1: ruleBebida EOF
            {
             before(grammarAccess.getBebidaRule()); 
            pushFollow(FOLLOW_1);
            ruleBebida();

            state._fsp--;

             after(grammarAccess.getBebidaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBebida"


    // $ANTLR start "ruleBebida"
    // InternalRestaurante.g:187:1: ruleBebida : ( ( rule__Bebida__Alternatives ) ) ;
    public final void ruleBebida() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:191:2: ( ( ( rule__Bebida__Alternatives ) ) )
            // InternalRestaurante.g:192:2: ( ( rule__Bebida__Alternatives ) )
            {
            // InternalRestaurante.g:192:2: ( ( rule__Bebida__Alternatives ) )
            // InternalRestaurante.g:193:3: ( rule__Bebida__Alternatives )
            {
             before(grammarAccess.getBebidaAccess().getAlternatives()); 
            // InternalRestaurante.g:194:3: ( rule__Bebida__Alternatives )
            // InternalRestaurante.g:194:4: rule__Bebida__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bebida__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBebidaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBebida"


    // $ANTLR start "entryRuleBebidaFria"
    // InternalRestaurante.g:203:1: entryRuleBebidaFria : ruleBebidaFria EOF ;
    public final void entryRuleBebidaFria() throws RecognitionException {
        try {
            // InternalRestaurante.g:204:1: ( ruleBebidaFria EOF )
            // InternalRestaurante.g:205:1: ruleBebidaFria EOF
            {
             before(grammarAccess.getBebidaFriaRule()); 
            pushFollow(FOLLOW_1);
            ruleBebidaFria();

            state._fsp--;

             after(grammarAccess.getBebidaFriaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBebidaFria"


    // $ANTLR start "ruleBebidaFria"
    // InternalRestaurante.g:212:1: ruleBebidaFria : ( ( rule__BebidaFria__Group__0 ) ) ;
    public final void ruleBebidaFria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:216:2: ( ( ( rule__BebidaFria__Group__0 ) ) )
            // InternalRestaurante.g:217:2: ( ( rule__BebidaFria__Group__0 ) )
            {
            // InternalRestaurante.g:217:2: ( ( rule__BebidaFria__Group__0 ) )
            // InternalRestaurante.g:218:3: ( rule__BebidaFria__Group__0 )
            {
             before(grammarAccess.getBebidaFriaAccess().getGroup()); 
            // InternalRestaurante.g:219:3: ( rule__BebidaFria__Group__0 )
            // InternalRestaurante.g:219:4: rule__BebidaFria__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBebidaFriaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBebidaFria"


    // $ANTLR start "entryRuleBebidaCaliente"
    // InternalRestaurante.g:228:1: entryRuleBebidaCaliente : ruleBebidaCaliente EOF ;
    public final void entryRuleBebidaCaliente() throws RecognitionException {
        try {
            // InternalRestaurante.g:229:1: ( ruleBebidaCaliente EOF )
            // InternalRestaurante.g:230:1: ruleBebidaCaliente EOF
            {
             before(grammarAccess.getBebidaCalienteRule()); 
            pushFollow(FOLLOW_1);
            ruleBebidaCaliente();

            state._fsp--;

             after(grammarAccess.getBebidaCalienteRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBebidaCaliente"


    // $ANTLR start "ruleBebidaCaliente"
    // InternalRestaurante.g:237:1: ruleBebidaCaliente : ( ( rule__BebidaCaliente__Group__0 ) ) ;
    public final void ruleBebidaCaliente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:241:2: ( ( ( rule__BebidaCaliente__Group__0 ) ) )
            // InternalRestaurante.g:242:2: ( ( rule__BebidaCaliente__Group__0 ) )
            {
            // InternalRestaurante.g:242:2: ( ( rule__BebidaCaliente__Group__0 ) )
            // InternalRestaurante.g:243:3: ( rule__BebidaCaliente__Group__0 )
            {
             before(grammarAccess.getBebidaCalienteAccess().getGroup()); 
            // InternalRestaurante.g:244:3: ( rule__BebidaCaliente__Group__0 )
            // InternalRestaurante.g:244:4: rule__BebidaCaliente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBebidaCalienteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBebidaCaliente"


    // $ANTLR start "entryRulePostre"
    // InternalRestaurante.g:253:1: entryRulePostre : rulePostre EOF ;
    public final void entryRulePostre() throws RecognitionException {
        try {
            // InternalRestaurante.g:254:1: ( rulePostre EOF )
            // InternalRestaurante.g:255:1: rulePostre EOF
            {
             before(grammarAccess.getPostreRule()); 
            pushFollow(FOLLOW_1);
            rulePostre();

            state._fsp--;

             after(grammarAccess.getPostreRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePostre"


    // $ANTLR start "rulePostre"
    // InternalRestaurante.g:262:1: rulePostre : ( ( rule__Postre__Group__0 ) ) ;
    public final void rulePostre() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:266:2: ( ( ( rule__Postre__Group__0 ) ) )
            // InternalRestaurante.g:267:2: ( ( rule__Postre__Group__0 ) )
            {
            // InternalRestaurante.g:267:2: ( ( rule__Postre__Group__0 ) )
            // InternalRestaurante.g:268:3: ( rule__Postre__Group__0 )
            {
             before(grammarAccess.getPostreAccess().getGroup()); 
            // InternalRestaurante.g:269:3: ( rule__Postre__Group__0 )
            // InternalRestaurante.g:269:4: rule__Postre__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Postre__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPostreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePostre"


    // $ANTLR start "entryRuleNutricional"
    // InternalRestaurante.g:278:1: entryRuleNutricional : ruleNutricional EOF ;
    public final void entryRuleNutricional() throws RecognitionException {
        try {
            // InternalRestaurante.g:279:1: ( ruleNutricional EOF )
            // InternalRestaurante.g:280:1: ruleNutricional EOF
            {
             before(grammarAccess.getNutricionalRule()); 
            pushFollow(FOLLOW_1);
            ruleNutricional();

            state._fsp--;

             after(grammarAccess.getNutricionalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNutricional"


    // $ANTLR start "ruleNutricional"
    // InternalRestaurante.g:287:1: ruleNutricional : ( ( rule__Nutricional__Group__0 ) ) ;
    public final void ruleNutricional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:291:2: ( ( ( rule__Nutricional__Group__0 ) ) )
            // InternalRestaurante.g:292:2: ( ( rule__Nutricional__Group__0 ) )
            {
            // InternalRestaurante.g:292:2: ( ( rule__Nutricional__Group__0 ) )
            // InternalRestaurante.g:293:3: ( rule__Nutricional__Group__0 )
            {
             before(grammarAccess.getNutricionalAccess().getGroup()); 
            // InternalRestaurante.g:294:3: ( rule__Nutricional__Group__0 )
            // InternalRestaurante.g:294:4: rule__Nutricional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNutricionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNutricional"


    // $ANTLR start "entryRuleMenu"
    // InternalRestaurante.g:303:1: entryRuleMenu : ruleMenu EOF ;
    public final void entryRuleMenu() throws RecognitionException {
        try {
            // InternalRestaurante.g:304:1: ( ruleMenu EOF )
            // InternalRestaurante.g:305:1: ruleMenu EOF
            {
             before(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getMenuRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalRestaurante.g:312:1: ruleMenu : ( ( rule__Menu__Group__0 ) ) ;
    public final void ruleMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:316:2: ( ( ( rule__Menu__Group__0 ) ) )
            // InternalRestaurante.g:317:2: ( ( rule__Menu__Group__0 ) )
            {
            // InternalRestaurante.g:317:2: ( ( rule__Menu__Group__0 ) )
            // InternalRestaurante.g:318:3: ( rule__Menu__Group__0 )
            {
             before(grammarAccess.getMenuAccess().getGroup()); 
            // InternalRestaurante.g:319:3: ( rule__Menu__Group__0 )
            // InternalRestaurante.g:319:4: rule__Menu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleProductoY"
    // InternalRestaurante.g:328:1: entryRuleProductoY : ruleProductoY EOF ;
    public final void entryRuleProductoY() throws RecognitionException {
        try {
            // InternalRestaurante.g:329:1: ( ruleProductoY EOF )
            // InternalRestaurante.g:330:1: ruleProductoY EOF
            {
             before(grammarAccess.getProductoYRule()); 
            pushFollow(FOLLOW_1);
            ruleProductoY();

            state._fsp--;

             after(grammarAccess.getProductoYRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProductoY"


    // $ANTLR start "ruleProductoY"
    // InternalRestaurante.g:337:1: ruleProductoY : ( ( rule__ProductoY__Group__0 ) ) ;
    public final void ruleProductoY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:341:2: ( ( ( rule__ProductoY__Group__0 ) ) )
            // InternalRestaurante.g:342:2: ( ( rule__ProductoY__Group__0 ) )
            {
            // InternalRestaurante.g:342:2: ( ( rule__ProductoY__Group__0 ) )
            // InternalRestaurante.g:343:3: ( rule__ProductoY__Group__0 )
            {
             before(grammarAccess.getProductoYAccess().getGroup()); 
            // InternalRestaurante.g:344:3: ( rule__ProductoY__Group__0 )
            // InternalRestaurante.g:344:4: rule__ProductoY__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProductoY__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductoYAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductoY"


    // $ANTLR start "entryRuleProductoO"
    // InternalRestaurante.g:353:1: entryRuleProductoO : ruleProductoO EOF ;
    public final void entryRuleProductoO() throws RecognitionException {
        try {
            // InternalRestaurante.g:354:1: ( ruleProductoO EOF )
            // InternalRestaurante.g:355:1: ruleProductoO EOF
            {
             before(grammarAccess.getProductoORule()); 
            pushFollow(FOLLOW_1);
            ruleProductoO();

            state._fsp--;

             after(grammarAccess.getProductoORule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProductoO"


    // $ANTLR start "ruleProductoO"
    // InternalRestaurante.g:362:1: ruleProductoO : ( ( rule__ProductoO__Alternatives ) ) ;
    public final void ruleProductoO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:366:2: ( ( ( rule__ProductoO__Alternatives ) ) )
            // InternalRestaurante.g:367:2: ( ( rule__ProductoO__Alternatives ) )
            {
            // InternalRestaurante.g:367:2: ( ( rule__ProductoO__Alternatives ) )
            // InternalRestaurante.g:368:3: ( rule__ProductoO__Alternatives )
            {
             before(grammarAccess.getProductoOAccess().getAlternatives()); 
            // InternalRestaurante.g:369:3: ( rule__ProductoO__Alternatives )
            // InternalRestaurante.g:369:4: rule__ProductoO__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProductoO__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProductoOAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductoO"


    // $ANTLR start "entryRuleFloat"
    // InternalRestaurante.g:378:1: entryRuleFloat : ruleFloat EOF ;
    public final void entryRuleFloat() throws RecognitionException {
        try {
            // InternalRestaurante.g:379:1: ( ruleFloat EOF )
            // InternalRestaurante.g:380:1: ruleFloat EOF
            {
             before(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getFloatRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalRestaurante.g:387:1: ruleFloat : ( ( rule__Float__Group__0 ) ) ;
    public final void ruleFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:391:2: ( ( ( rule__Float__Group__0 ) ) )
            // InternalRestaurante.g:392:2: ( ( rule__Float__Group__0 ) )
            {
            // InternalRestaurante.g:392:2: ( ( rule__Float__Group__0 ) )
            // InternalRestaurante.g:393:3: ( rule__Float__Group__0 )
            {
             before(grammarAccess.getFloatAccess().getGroup()); 
            // InternalRestaurante.g:394:3: ( rule__Float__Group__0 )
            // InternalRestaurante.g:394:4: rule__Float__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "ruleSalsaRecomendada"
    // InternalRestaurante.g:403:1: ruleSalsaRecomendada : ( ( rule__SalsaRecomendada__Alternatives ) ) ;
    public final void ruleSalsaRecomendada() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:407:1: ( ( ( rule__SalsaRecomendada__Alternatives ) ) )
            // InternalRestaurante.g:408:2: ( ( rule__SalsaRecomendada__Alternatives ) )
            {
            // InternalRestaurante.g:408:2: ( ( rule__SalsaRecomendada__Alternatives ) )
            // InternalRestaurante.g:409:3: ( rule__SalsaRecomendada__Alternatives )
            {
             before(grammarAccess.getSalsaRecomendadaAccess().getAlternatives()); 
            // InternalRestaurante.g:410:3: ( rule__SalsaRecomendada__Alternatives )
            // InternalRestaurante.g:410:4: rule__SalsaRecomendada__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SalsaRecomendada__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSalsaRecomendadaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSalsaRecomendada"


    // $ANTLR start "ruleTamanioMenu"
    // InternalRestaurante.g:419:1: ruleTamanioMenu : ( ( rule__TamanioMenu__Alternatives ) ) ;
    public final void ruleTamanioMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:423:1: ( ( ( rule__TamanioMenu__Alternatives ) ) )
            // InternalRestaurante.g:424:2: ( ( rule__TamanioMenu__Alternatives ) )
            {
            // InternalRestaurante.g:424:2: ( ( rule__TamanioMenu__Alternatives ) )
            // InternalRestaurante.g:425:3: ( rule__TamanioMenu__Alternatives )
            {
             before(grammarAccess.getTamanioMenuAccess().getAlternatives()); 
            // InternalRestaurante.g:426:3: ( rule__TamanioMenu__Alternatives )
            // InternalRestaurante.g:426:4: rule__TamanioMenu__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TamanioMenu__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTamanioMenuAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTamanioMenu"


    // $ANTLR start "ruleDistribuidor"
    // InternalRestaurante.g:435:1: ruleDistribuidor : ( ( rule__Distribuidor__Alternatives ) ) ;
    public final void ruleDistribuidor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:439:1: ( ( ( rule__Distribuidor__Alternatives ) ) )
            // InternalRestaurante.g:440:2: ( ( rule__Distribuidor__Alternatives ) )
            {
            // InternalRestaurante.g:440:2: ( ( rule__Distribuidor__Alternatives ) )
            // InternalRestaurante.g:441:3: ( rule__Distribuidor__Alternatives )
            {
             before(grammarAccess.getDistribuidorAccess().getAlternatives()); 
            // InternalRestaurante.g:442:3: ( rule__Distribuidor__Alternatives )
            // InternalRestaurante.g:442:4: rule__Distribuidor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Distribuidor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDistribuidorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistribuidor"


    // $ANTLR start "rule__Producto__Alternatives"
    // InternalRestaurante.g:450:1: rule__Producto__Alternatives : ( ( rulePrincipal ) | ( ruleComplemento ) | ( ruleBebida ) | ( rulePostre ) );
    public final void rule__Producto__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:454:1: ( ( rulePrincipal ) | ( ruleComplemento ) | ( ruleBebida ) | ( rulePostre ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt1=1;
                }
                break;
            case 46:
                {
                alt1=2;
                }
                break;
            case 47:
            case 49:
                {
                alt1=3;
                }
                break;
            case 50:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRestaurante.g:455:2: ( rulePrincipal )
                    {
                    // InternalRestaurante.g:455:2: ( rulePrincipal )
                    // InternalRestaurante.g:456:3: rulePrincipal
                    {
                     before(grammarAccess.getProductoAccess().getPrincipalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrincipal();

                    state._fsp--;

                     after(grammarAccess.getProductoAccess().getPrincipalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:461:2: ( ruleComplemento )
                    {
                    // InternalRestaurante.g:461:2: ( ruleComplemento )
                    // InternalRestaurante.g:462:3: ruleComplemento
                    {
                     before(grammarAccess.getProductoAccess().getComplementoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComplemento();

                    state._fsp--;

                     after(grammarAccess.getProductoAccess().getComplementoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRestaurante.g:467:2: ( ruleBebida )
                    {
                    // InternalRestaurante.g:467:2: ( ruleBebida )
                    // InternalRestaurante.g:468:3: ruleBebida
                    {
                     before(grammarAccess.getProductoAccess().getBebidaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBebida();

                    state._fsp--;

                     after(grammarAccess.getProductoAccess().getBebidaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRestaurante.g:473:2: ( rulePostre )
                    {
                    // InternalRestaurante.g:473:2: ( rulePostre )
                    // InternalRestaurante.g:474:3: rulePostre
                    {
                     before(grammarAccess.getProductoAccess().getPostreParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePostre();

                    state._fsp--;

                     after(grammarAccess.getProductoAccess().getPostreParserRuleCall_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Producto__Alternatives"


    // $ANTLR start "rule__Bebida__Alternatives"
    // InternalRestaurante.g:483:1: rule__Bebida__Alternatives : ( ( ruleBebidaFria ) | ( ruleBebidaCaliente ) );
    public final void rule__Bebida__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:487:1: ( ( ruleBebidaFria ) | ( ruleBebidaCaliente ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==47) ) {
                alt2=1;
            }
            else if ( (LA2_0==49) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRestaurante.g:488:2: ( ruleBebidaFria )
                    {
                    // InternalRestaurante.g:488:2: ( ruleBebidaFria )
                    // InternalRestaurante.g:489:3: ruleBebidaFria
                    {
                     before(grammarAccess.getBebidaAccess().getBebidaFriaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBebidaFria();

                    state._fsp--;

                     after(grammarAccess.getBebidaAccess().getBebidaFriaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:494:2: ( ruleBebidaCaliente )
                    {
                    // InternalRestaurante.g:494:2: ( ruleBebidaCaliente )
                    // InternalRestaurante.g:495:3: ruleBebidaCaliente
                    {
                     before(grammarAccess.getBebidaAccess().getBebidaCalienteParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBebidaCaliente();

                    state._fsp--;

                     after(grammarAccess.getBebidaAccess().getBebidaCalienteParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bebida__Alternatives"


    // $ANTLR start "rule__ProductoO__Alternatives"
    // InternalRestaurante.g:504:1: rule__ProductoO__Alternatives : ( ( ( rule__ProductoO__IzqAssignment_0 ) ) | ( ( rule__ProductoO__Group_1__0 ) ) );
    public final void rule__ProductoO__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:508:1: ( ( ( rule__ProductoO__IzqAssignment_0 ) ) | ( ( rule__ProductoO__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==62) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRestaurante.g:509:2: ( ( rule__ProductoO__IzqAssignment_0 ) )
                    {
                    // InternalRestaurante.g:509:2: ( ( rule__ProductoO__IzqAssignment_0 ) )
                    // InternalRestaurante.g:510:3: ( rule__ProductoO__IzqAssignment_0 )
                    {
                     before(grammarAccess.getProductoOAccess().getIzqAssignment_0()); 
                    // InternalRestaurante.g:511:3: ( rule__ProductoO__IzqAssignment_0 )
                    // InternalRestaurante.g:511:4: rule__ProductoO__IzqAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProductoO__IzqAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProductoOAccess().getIzqAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:515:2: ( ( rule__ProductoO__Group_1__0 ) )
                    {
                    // InternalRestaurante.g:515:2: ( ( rule__ProductoO__Group_1__0 ) )
                    // InternalRestaurante.g:516:3: ( rule__ProductoO__Group_1__0 )
                    {
                     before(grammarAccess.getProductoOAccess().getGroup_1()); 
                    // InternalRestaurante.g:517:3: ( rule__ProductoO__Group_1__0 )
                    // InternalRestaurante.g:517:4: rule__ProductoO__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProductoO__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProductoOAccess().getGroup_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Alternatives"


    // $ANTLR start "rule__SalsaRecomendada__Alternatives"
    // InternalRestaurante.g:525:1: rule__SalsaRecomendada__Alternatives : ( ( ( 'NINGUNA' ) ) | ( ( 'ACEITE_Y_VINAGRE' ) ) | ( ( 'CESAR' ) ) | ( ( 'MODENA' ) ) | ( ( 'MOSTAZA' ) ) );
    public final void rule__SalsaRecomendada__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:529:1: ( ( ( 'NINGUNA' ) ) | ( ( 'ACEITE_Y_VINAGRE' ) ) | ( ( 'CESAR' ) ) | ( ( 'MODENA' ) ) | ( ( 'MOSTAZA' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRestaurante.g:530:2: ( ( 'NINGUNA' ) )
                    {
                    // InternalRestaurante.g:530:2: ( ( 'NINGUNA' ) )
                    // InternalRestaurante.g:531:3: ( 'NINGUNA' )
                    {
                     before(grammarAccess.getSalsaRecomendadaAccess().getNINGUNAEnumLiteralDeclaration_0()); 
                    // InternalRestaurante.g:532:3: ( 'NINGUNA' )
                    // InternalRestaurante.g:532:4: 'NINGUNA'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSalsaRecomendadaAccess().getNINGUNAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:536:2: ( ( 'ACEITE_Y_VINAGRE' ) )
                    {
                    // InternalRestaurante.g:536:2: ( ( 'ACEITE_Y_VINAGRE' ) )
                    // InternalRestaurante.g:537:3: ( 'ACEITE_Y_VINAGRE' )
                    {
                     before(grammarAccess.getSalsaRecomendadaAccess().getACEITE_Y_VINAGREEnumLiteralDeclaration_1()); 
                    // InternalRestaurante.g:538:3: ( 'ACEITE_Y_VINAGRE' )
                    // InternalRestaurante.g:538:4: 'ACEITE_Y_VINAGRE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSalsaRecomendadaAccess().getACEITE_Y_VINAGREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRestaurante.g:542:2: ( ( 'CESAR' ) )
                    {
                    // InternalRestaurante.g:542:2: ( ( 'CESAR' ) )
                    // InternalRestaurante.g:543:3: ( 'CESAR' )
                    {
                     before(grammarAccess.getSalsaRecomendadaAccess().getCESAREnumLiteralDeclaration_2()); 
                    // InternalRestaurante.g:544:3: ( 'CESAR' )
                    // InternalRestaurante.g:544:4: 'CESAR'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSalsaRecomendadaAccess().getCESAREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRestaurante.g:548:2: ( ( 'MODENA' ) )
                    {
                    // InternalRestaurante.g:548:2: ( ( 'MODENA' ) )
                    // InternalRestaurante.g:549:3: ( 'MODENA' )
                    {
                     before(grammarAccess.getSalsaRecomendadaAccess().getMODENAEnumLiteralDeclaration_3()); 
                    // InternalRestaurante.g:550:3: ( 'MODENA' )
                    // InternalRestaurante.g:550:4: 'MODENA'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSalsaRecomendadaAccess().getMODENAEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRestaurante.g:554:2: ( ( 'MOSTAZA' ) )
                    {
                    // InternalRestaurante.g:554:2: ( ( 'MOSTAZA' ) )
                    // InternalRestaurante.g:555:3: ( 'MOSTAZA' )
                    {
                     before(grammarAccess.getSalsaRecomendadaAccess().getMOSTAZAEnumLiteralDeclaration_4()); 
                    // InternalRestaurante.g:556:3: ( 'MOSTAZA' )
                    // InternalRestaurante.g:556:4: 'MOSTAZA'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSalsaRecomendadaAccess().getMOSTAZAEnumLiteralDeclaration_4()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SalsaRecomendada__Alternatives"


    // $ANTLR start "rule__TamanioMenu__Alternatives"
    // InternalRestaurante.g:564:1: rule__TamanioMenu__Alternatives : ( ( ( 'NORMAL' ) ) | ( ( 'GRANDE' ) ) | ( ( 'NORMAL_Y_GRANDE' ) ) );
    public final void rule__TamanioMenu__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:568:1: ( ( ( 'NORMAL' ) ) | ( ( 'GRANDE' ) ) | ( ( 'NORMAL_Y_GRANDE' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRestaurante.g:569:2: ( ( 'NORMAL' ) )
                    {
                    // InternalRestaurante.g:569:2: ( ( 'NORMAL' ) )
                    // InternalRestaurante.g:570:3: ( 'NORMAL' )
                    {
                     before(grammarAccess.getTamanioMenuAccess().getNORMALEnumLiteralDeclaration_0()); 
                    // InternalRestaurante.g:571:3: ( 'NORMAL' )
                    // InternalRestaurante.g:571:4: 'NORMAL'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanioMenuAccess().getNORMALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:575:2: ( ( 'GRANDE' ) )
                    {
                    // InternalRestaurante.g:575:2: ( ( 'GRANDE' ) )
                    // InternalRestaurante.g:576:3: ( 'GRANDE' )
                    {
                     before(grammarAccess.getTamanioMenuAccess().getGRANDEEnumLiteralDeclaration_1()); 
                    // InternalRestaurante.g:577:3: ( 'GRANDE' )
                    // InternalRestaurante.g:577:4: 'GRANDE'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanioMenuAccess().getGRANDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRestaurante.g:581:2: ( ( 'NORMAL_Y_GRANDE' ) )
                    {
                    // InternalRestaurante.g:581:2: ( ( 'NORMAL_Y_GRANDE' ) )
                    // InternalRestaurante.g:582:3: ( 'NORMAL_Y_GRANDE' )
                    {
                     before(grammarAccess.getTamanioMenuAccess().getNORMAL_Y_GRANDEEnumLiteralDeclaration_2()); 
                    // InternalRestaurante.g:583:3: ( 'NORMAL_Y_GRANDE' )
                    // InternalRestaurante.g:583:4: 'NORMAL_Y_GRANDE'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanioMenuAccess().getNORMAL_Y_GRANDEEnumLiteralDeclaration_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TamanioMenu__Alternatives"


    // $ANTLR start "rule__Distribuidor__Alternatives"
    // InternalRestaurante.g:591:1: rule__Distribuidor__Alternatives : ( ( ( 'COCA_COLA' ) ) | ( ( 'AQUABONA' ) ) | ( ( 'MAHOU' ) ) | ( ( 'ALVALLE' ) ) | ( ( 'TROPICANA' ) ) | ( ( 'OREO' ) ) | ( ( 'MILKA' ) ) | ( ( 'DANONE' ) ) );
    public final void rule__Distribuidor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:595:1: ( ( ( 'COCA_COLA' ) ) | ( ( 'AQUABONA' ) ) | ( ( 'MAHOU' ) ) | ( ( 'ALVALLE' ) ) | ( ( 'TROPICANA' ) ) | ( ( 'OREO' ) ) | ( ( 'MILKA' ) ) | ( ( 'DANONE' ) ) )
            int alt6=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 22:
                {
                alt6=2;
                }
                break;
            case 23:
                {
                alt6=3;
                }
                break;
            case 24:
                {
                alt6=4;
                }
                break;
            case 25:
                {
                alt6=5;
                }
                break;
            case 26:
                {
                alt6=6;
                }
                break;
            case 27:
                {
                alt6=7;
                }
                break;
            case 28:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRestaurante.g:596:2: ( ( 'COCA_COLA' ) )
                    {
                    // InternalRestaurante.g:596:2: ( ( 'COCA_COLA' ) )
                    // InternalRestaurante.g:597:3: ( 'COCA_COLA' )
                    {
                     before(grammarAccess.getDistribuidorAccess().getCOCA_COLAEnumLiteralDeclaration_0()); 
                    // InternalRestaurante.g:598:3: ( 'COCA_COLA' )
                    // InternalRestaurante.g:598:4: 'COCA_COLA'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistribuidorAccess().getCOCA_COLAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:602:2: ( ( 'AQUABONA' ) )
                    {
                    // InternalRestaurante.g:602:2: ( ( 'AQUABONA' ) )
                    // InternalRestaurante.g:603:3: ( 'AQUABONA' )
                    {
                     before(grammarAccess.getDistribuidorAccess().getAQUABONAEnumLiteralDeclaration_1()); 
                    // InternalRestaurante.g:604:3: ( 'AQUABONA' )
                    // InternalRestaurante.g:604:4: 'AQUABONA'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistribuidorAccess().getAQUABONAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRestaurante.g:608:2: ( ( 'MAHOU' ) )
                    {
                    // InternalRestaurante.g:608:2: ( ( 'MAHOU' ) )
                    // InternalRestaurante.g:609:3: ( 'MAHOU' )
                    {
                     before(grammarAccess.getDistribuidorAccess().getMAHOUEnumLiteralDeclaration_2()); 
                    // InternalRestaurante.g:610:3: ( 'MAHOU' )
                    // InternalRestaurante.g:610:4: 'MAHOU'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistribuidorAccess().getMAHOUEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRestaurante.g:614:2: ( ( 'ALVALLE' ) )
                    {
                    // InternalRestaurante.g:614:2: ( ( 'ALVALLE' ) )
                    // InternalRestaurante.g:615:3: ( 'ALVALLE' )
                    {
                     before(grammarAccess.getDistribuidorAccess().getALVALLEEnumLiteralDeclaration_3()); 
                    // InternalRestaurante.g:616:3: ( 'ALVALLE' )
                    // InternalRestaurante.g:616:4: 'ALVALLE'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistribuidorAccess().getALVALLEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRestaurante.g:620:2: ( ( 'TROPICANA' ) )
                    {
                    // InternalRestaurante.g:620:2: ( ( 'TROPICANA' ) )
                    // InternalRestaurante.g:621:3: ( 'TROPICANA' )
                    {
                     before(grammarAccess.getDistribuidorAccess().getTROPICANAEnumLiteralDeclaration_4()); 
                    // InternalRestaurante.g:622:3: ( 'TROPICANA' )
                    // InternalRestaurante.g:622:4: 'TROPICANA'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistribuidorAccess().getTROPICANAEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRestaurante.g:626:2: ( ( 'OREO' ) )
                    {
                    // InternalRestaurante.g:626:2: ( ( 'OREO' ) )
                    // InternalRestaurante.g:627:3: ( 'OREO' )
                    {
                     before(grammarAccess.getDistribuidorAccess().getOREOEnumLiteralDeclaration_5()); 
                    // InternalRestaurante.g:628:3: ( 'OREO' )
                    // InternalRestaurante.g:628:4: 'OREO'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistribuidorAccess().getOREOEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRestaurante.g:632:2: ( ( 'MILKA' ) )
                    {
                    // InternalRestaurante.g:632:2: ( ( 'MILKA' ) )
                    // InternalRestaurante.g:633:3: ( 'MILKA' )
                    {
                     before(grammarAccess.getDistribuidorAccess().getMILKAEnumLiteralDeclaration_6()); 
                    // InternalRestaurante.g:634:3: ( 'MILKA' )
                    // InternalRestaurante.g:634:4: 'MILKA'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistribuidorAccess().getMILKAEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRestaurante.g:638:2: ( ( 'DANONE' ) )
                    {
                    // InternalRestaurante.g:638:2: ( ( 'DANONE' ) )
                    // InternalRestaurante.g:639:3: ( 'DANONE' )
                    {
                     before(grammarAccess.getDistribuidorAccess().getDANONEEnumLiteralDeclaration_7()); 
                    // InternalRestaurante.g:640:3: ( 'DANONE' )
                    // InternalRestaurante.g:640:4: 'DANONE'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistribuidorAccess().getDANONEEnumLiteralDeclaration_7()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distribuidor__Alternatives"


    // $ANTLR start "rule__Restaurante__Group__0"
    // InternalRestaurante.g:648:1: rule__Restaurante__Group__0 : rule__Restaurante__Group__0__Impl rule__Restaurante__Group__1 ;
    public final void rule__Restaurante__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:652:1: ( rule__Restaurante__Group__0__Impl rule__Restaurante__Group__1 )
            // InternalRestaurante.g:653:2: rule__Restaurante__Group__0__Impl rule__Restaurante__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Restaurante__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__0"


    // $ANTLR start "rule__Restaurante__Group__0__Impl"
    // InternalRestaurante.g:660:1: rule__Restaurante__Group__0__Impl : ( 'Restaurantes' ) ;
    public final void rule__Restaurante__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:664:1: ( ( 'Restaurantes' ) )
            // InternalRestaurante.g:665:1: ( 'Restaurantes' )
            {
            // InternalRestaurante.g:665:1: ( 'Restaurantes' )
            // InternalRestaurante.g:666:2: 'Restaurantes'
            {
             before(grammarAccess.getRestauranteAccess().getRestaurantesKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getRestaurantesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__0__Impl"


    // $ANTLR start "rule__Restaurante__Group__1"
    // InternalRestaurante.g:675:1: rule__Restaurante__Group__1 : rule__Restaurante__Group__1__Impl rule__Restaurante__Group__2 ;
    public final void rule__Restaurante__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:679:1: ( rule__Restaurante__Group__1__Impl rule__Restaurante__Group__2 )
            // InternalRestaurante.g:680:2: rule__Restaurante__Group__1__Impl rule__Restaurante__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Restaurante__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__1"


    // $ANTLR start "rule__Restaurante__Group__1__Impl"
    // InternalRestaurante.g:687:1: rule__Restaurante__Group__1__Impl : ( ( rule__Restaurante__NombreAssignment_1 ) ) ;
    public final void rule__Restaurante__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:691:1: ( ( ( rule__Restaurante__NombreAssignment_1 ) ) )
            // InternalRestaurante.g:692:1: ( ( rule__Restaurante__NombreAssignment_1 ) )
            {
            // InternalRestaurante.g:692:1: ( ( rule__Restaurante__NombreAssignment_1 ) )
            // InternalRestaurante.g:693:2: ( rule__Restaurante__NombreAssignment_1 )
            {
             before(grammarAccess.getRestauranteAccess().getNombreAssignment_1()); 
            // InternalRestaurante.g:694:2: ( rule__Restaurante__NombreAssignment_1 )
            // InternalRestaurante.g:694:3: rule__Restaurante__NombreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Restaurante__NombreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestauranteAccess().getNombreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__1__Impl"


    // $ANTLR start "rule__Restaurante__Group__2"
    // InternalRestaurante.g:702:1: rule__Restaurante__Group__2 : rule__Restaurante__Group__2__Impl rule__Restaurante__Group__3 ;
    public final void rule__Restaurante__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:706:1: ( rule__Restaurante__Group__2__Impl rule__Restaurante__Group__3 )
            // InternalRestaurante.g:707:2: rule__Restaurante__Group__2__Impl rule__Restaurante__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Restaurante__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__2"


    // $ANTLR start "rule__Restaurante__Group__2__Impl"
    // InternalRestaurante.g:714:1: rule__Restaurante__Group__2__Impl : ( 'fecha' ) ;
    public final void rule__Restaurante__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:718:1: ( ( 'fecha' ) )
            // InternalRestaurante.g:719:1: ( 'fecha' )
            {
            // InternalRestaurante.g:719:1: ( 'fecha' )
            // InternalRestaurante.g:720:2: 'fecha'
            {
             before(grammarAccess.getRestauranteAccess().getFechaKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getFechaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__2__Impl"


    // $ANTLR start "rule__Restaurante__Group__3"
    // InternalRestaurante.g:729:1: rule__Restaurante__Group__3 : rule__Restaurante__Group__3__Impl rule__Restaurante__Group__4 ;
    public final void rule__Restaurante__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:733:1: ( rule__Restaurante__Group__3__Impl rule__Restaurante__Group__4 )
            // InternalRestaurante.g:734:2: rule__Restaurante__Group__3__Impl rule__Restaurante__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Restaurante__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__3"


    // $ANTLR start "rule__Restaurante__Group__3__Impl"
    // InternalRestaurante.g:741:1: rule__Restaurante__Group__3__Impl : ( ( rule__Restaurante__FechaAssignment_3 ) ) ;
    public final void rule__Restaurante__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:745:1: ( ( ( rule__Restaurante__FechaAssignment_3 ) ) )
            // InternalRestaurante.g:746:1: ( ( rule__Restaurante__FechaAssignment_3 ) )
            {
            // InternalRestaurante.g:746:1: ( ( rule__Restaurante__FechaAssignment_3 ) )
            // InternalRestaurante.g:747:2: ( rule__Restaurante__FechaAssignment_3 )
            {
             before(grammarAccess.getRestauranteAccess().getFechaAssignment_3()); 
            // InternalRestaurante.g:748:2: ( rule__Restaurante__FechaAssignment_3 )
            // InternalRestaurante.g:748:3: rule__Restaurante__FechaAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Restaurante__FechaAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRestauranteAccess().getFechaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__3__Impl"


    // $ANTLR start "rule__Restaurante__Group__4"
    // InternalRestaurante.g:756:1: rule__Restaurante__Group__4 : rule__Restaurante__Group__4__Impl rule__Restaurante__Group__5 ;
    public final void rule__Restaurante__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:760:1: ( rule__Restaurante__Group__4__Impl rule__Restaurante__Group__5 )
            // InternalRestaurante.g:761:2: rule__Restaurante__Group__4__Impl rule__Restaurante__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Restaurante__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__4"


    // $ANTLR start "rule__Restaurante__Group__4__Impl"
    // InternalRestaurante.g:768:1: rule__Restaurante__Group__4__Impl : ( 'Ingredientes' ) ;
    public final void rule__Restaurante__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:772:1: ( ( 'Ingredientes' ) )
            // InternalRestaurante.g:773:1: ( 'Ingredientes' )
            {
            // InternalRestaurante.g:773:1: ( 'Ingredientes' )
            // InternalRestaurante.g:774:2: 'Ingredientes'
            {
             before(grammarAccess.getRestauranteAccess().getIngredientesKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getIngredientesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__4__Impl"


    // $ANTLR start "rule__Restaurante__Group__5"
    // InternalRestaurante.g:783:1: rule__Restaurante__Group__5 : rule__Restaurante__Group__5__Impl rule__Restaurante__Group__6 ;
    public final void rule__Restaurante__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:787:1: ( rule__Restaurante__Group__5__Impl rule__Restaurante__Group__6 )
            // InternalRestaurante.g:788:2: rule__Restaurante__Group__5__Impl rule__Restaurante__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Restaurante__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__5"


    // $ANTLR start "rule__Restaurante__Group__5__Impl"
    // InternalRestaurante.g:795:1: rule__Restaurante__Group__5__Impl : ( '{' ) ;
    public final void rule__Restaurante__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:799:1: ( ( '{' ) )
            // InternalRestaurante.g:800:1: ( '{' )
            {
            // InternalRestaurante.g:800:1: ( '{' )
            // InternalRestaurante.g:801:2: '{'
            {
             before(grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__5__Impl"


    // $ANTLR start "rule__Restaurante__Group__6"
    // InternalRestaurante.g:810:1: rule__Restaurante__Group__6 : rule__Restaurante__Group__6__Impl rule__Restaurante__Group__7 ;
    public final void rule__Restaurante__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:814:1: ( rule__Restaurante__Group__6__Impl rule__Restaurante__Group__7 )
            // InternalRestaurante.g:815:2: rule__Restaurante__Group__6__Impl rule__Restaurante__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Restaurante__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__6"


    // $ANTLR start "rule__Restaurante__Group__6__Impl"
    // InternalRestaurante.g:822:1: rule__Restaurante__Group__6__Impl : ( ( rule__Restaurante__IngredientesAssignment_6 )* ) ;
    public final void rule__Restaurante__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:826:1: ( ( ( rule__Restaurante__IngredientesAssignment_6 )* ) )
            // InternalRestaurante.g:827:1: ( ( rule__Restaurante__IngredientesAssignment_6 )* )
            {
            // InternalRestaurante.g:827:1: ( ( rule__Restaurante__IngredientesAssignment_6 )* )
            // InternalRestaurante.g:828:2: ( rule__Restaurante__IngredientesAssignment_6 )*
            {
             before(grammarAccess.getRestauranteAccess().getIngredientesAssignment_6()); 
            // InternalRestaurante.g:829:2: ( rule__Restaurante__IngredientesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==36) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRestaurante.g:829:3: rule__Restaurante__IngredientesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Restaurante__IngredientesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRestauranteAccess().getIngredientesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__6__Impl"


    // $ANTLR start "rule__Restaurante__Group__7"
    // InternalRestaurante.g:837:1: rule__Restaurante__Group__7 : rule__Restaurante__Group__7__Impl rule__Restaurante__Group__8 ;
    public final void rule__Restaurante__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:841:1: ( rule__Restaurante__Group__7__Impl rule__Restaurante__Group__8 )
            // InternalRestaurante.g:842:2: rule__Restaurante__Group__7__Impl rule__Restaurante__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Restaurante__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__7"


    // $ANTLR start "rule__Restaurante__Group__7__Impl"
    // InternalRestaurante.g:849:1: rule__Restaurante__Group__7__Impl : ( '}' ) ;
    public final void rule__Restaurante__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:853:1: ( ( '}' ) )
            // InternalRestaurante.g:854:1: ( '}' )
            {
            // InternalRestaurante.g:854:1: ( '}' )
            // InternalRestaurante.g:855:2: '}'
            {
             before(grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__7__Impl"


    // $ANTLR start "rule__Restaurante__Group__8"
    // InternalRestaurante.g:864:1: rule__Restaurante__Group__8 : rule__Restaurante__Group__8__Impl rule__Restaurante__Group__9 ;
    public final void rule__Restaurante__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:868:1: ( rule__Restaurante__Group__8__Impl rule__Restaurante__Group__9 )
            // InternalRestaurante.g:869:2: rule__Restaurante__Group__8__Impl rule__Restaurante__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Restaurante__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__8"


    // $ANTLR start "rule__Restaurante__Group__8__Impl"
    // InternalRestaurante.g:876:1: rule__Restaurante__Group__8__Impl : ( 'Productos' ) ;
    public final void rule__Restaurante__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:880:1: ( ( 'Productos' ) )
            // InternalRestaurante.g:881:1: ( 'Productos' )
            {
            // InternalRestaurante.g:881:1: ( 'Productos' )
            // InternalRestaurante.g:882:2: 'Productos'
            {
             before(grammarAccess.getRestauranteAccess().getProductosKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getProductosKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__8__Impl"


    // $ANTLR start "rule__Restaurante__Group__9"
    // InternalRestaurante.g:891:1: rule__Restaurante__Group__9 : rule__Restaurante__Group__9__Impl rule__Restaurante__Group__10 ;
    public final void rule__Restaurante__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:895:1: ( rule__Restaurante__Group__9__Impl rule__Restaurante__Group__10 )
            // InternalRestaurante.g:896:2: rule__Restaurante__Group__9__Impl rule__Restaurante__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Restaurante__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__9"


    // $ANTLR start "rule__Restaurante__Group__9__Impl"
    // InternalRestaurante.g:903:1: rule__Restaurante__Group__9__Impl : ( '{' ) ;
    public final void rule__Restaurante__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:907:1: ( ( '{' ) )
            // InternalRestaurante.g:908:1: ( '{' )
            {
            // InternalRestaurante.g:908:1: ( '{' )
            // InternalRestaurante.g:909:2: '{'
            {
             before(grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__9__Impl"


    // $ANTLR start "rule__Restaurante__Group__10"
    // InternalRestaurante.g:918:1: rule__Restaurante__Group__10 : rule__Restaurante__Group__10__Impl rule__Restaurante__Group__11 ;
    public final void rule__Restaurante__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:922:1: ( rule__Restaurante__Group__10__Impl rule__Restaurante__Group__11 )
            // InternalRestaurante.g:923:2: rule__Restaurante__Group__10__Impl rule__Restaurante__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Restaurante__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__10"


    // $ANTLR start "rule__Restaurante__Group__10__Impl"
    // InternalRestaurante.g:930:1: rule__Restaurante__Group__10__Impl : ( ( rule__Restaurante__ProductosAssignment_10 )* ) ;
    public final void rule__Restaurante__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:934:1: ( ( ( rule__Restaurante__ProductosAssignment_10 )* ) )
            // InternalRestaurante.g:935:1: ( ( rule__Restaurante__ProductosAssignment_10 )* )
            {
            // InternalRestaurante.g:935:1: ( ( rule__Restaurante__ProductosAssignment_10 )* )
            // InternalRestaurante.g:936:2: ( rule__Restaurante__ProductosAssignment_10 )*
            {
             before(grammarAccess.getRestauranteAccess().getProductosAssignment_10()); 
            // InternalRestaurante.g:937:2: ( rule__Restaurante__ProductosAssignment_10 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==39||(LA8_0>=46 && LA8_0<=47)||(LA8_0>=49 && LA8_0<=50)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRestaurante.g:937:3: rule__Restaurante__ProductosAssignment_10
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Restaurante__ProductosAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRestauranteAccess().getProductosAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__10__Impl"


    // $ANTLR start "rule__Restaurante__Group__11"
    // InternalRestaurante.g:945:1: rule__Restaurante__Group__11 : rule__Restaurante__Group__11__Impl rule__Restaurante__Group__12 ;
    public final void rule__Restaurante__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:949:1: ( rule__Restaurante__Group__11__Impl rule__Restaurante__Group__12 )
            // InternalRestaurante.g:950:2: rule__Restaurante__Group__11__Impl rule__Restaurante__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Restaurante__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__11"


    // $ANTLR start "rule__Restaurante__Group__11__Impl"
    // InternalRestaurante.g:957:1: rule__Restaurante__Group__11__Impl : ( '}' ) ;
    public final void rule__Restaurante__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:961:1: ( ( '}' ) )
            // InternalRestaurante.g:962:1: ( '}' )
            {
            // InternalRestaurante.g:962:1: ( '}' )
            // InternalRestaurante.g:963:2: '}'
            {
             before(grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__11__Impl"


    // $ANTLR start "rule__Restaurante__Group__12"
    // InternalRestaurante.g:972:1: rule__Restaurante__Group__12 : rule__Restaurante__Group__12__Impl rule__Restaurante__Group__13 ;
    public final void rule__Restaurante__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:976:1: ( rule__Restaurante__Group__12__Impl rule__Restaurante__Group__13 )
            // InternalRestaurante.g:977:2: rule__Restaurante__Group__12__Impl rule__Restaurante__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Restaurante__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__12"


    // $ANTLR start "rule__Restaurante__Group__12__Impl"
    // InternalRestaurante.g:984:1: rule__Restaurante__Group__12__Impl : ( 'Menus' ) ;
    public final void rule__Restaurante__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:988:1: ( ( 'Menus' ) )
            // InternalRestaurante.g:989:1: ( 'Menus' )
            {
            // InternalRestaurante.g:989:1: ( 'Menus' )
            // InternalRestaurante.g:990:2: 'Menus'
            {
             before(grammarAccess.getRestauranteAccess().getMenusKeyword_12()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getMenusKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__12__Impl"


    // $ANTLR start "rule__Restaurante__Group__13"
    // InternalRestaurante.g:999:1: rule__Restaurante__Group__13 : rule__Restaurante__Group__13__Impl rule__Restaurante__Group__14 ;
    public final void rule__Restaurante__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1003:1: ( rule__Restaurante__Group__13__Impl rule__Restaurante__Group__14 )
            // InternalRestaurante.g:1004:2: rule__Restaurante__Group__13__Impl rule__Restaurante__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__Restaurante__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__13"


    // $ANTLR start "rule__Restaurante__Group__13__Impl"
    // InternalRestaurante.g:1011:1: rule__Restaurante__Group__13__Impl : ( '{' ) ;
    public final void rule__Restaurante__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1015:1: ( ( '{' ) )
            // InternalRestaurante.g:1016:1: ( '{' )
            {
            // InternalRestaurante.g:1016:1: ( '{' )
            // InternalRestaurante.g:1017:2: '{'
            {
             before(grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__13__Impl"


    // $ANTLR start "rule__Restaurante__Group__14"
    // InternalRestaurante.g:1026:1: rule__Restaurante__Group__14 : rule__Restaurante__Group__14__Impl rule__Restaurante__Group__15 ;
    public final void rule__Restaurante__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1030:1: ( rule__Restaurante__Group__14__Impl rule__Restaurante__Group__15 )
            // InternalRestaurante.g:1031:2: rule__Restaurante__Group__14__Impl rule__Restaurante__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__Restaurante__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__14"


    // $ANTLR start "rule__Restaurante__Group__14__Impl"
    // InternalRestaurante.g:1038:1: rule__Restaurante__Group__14__Impl : ( ( rule__Restaurante__MenusAssignment_14 )* ) ;
    public final void rule__Restaurante__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1042:1: ( ( ( rule__Restaurante__MenusAssignment_14 )* ) )
            // InternalRestaurante.g:1043:1: ( ( rule__Restaurante__MenusAssignment_14 )* )
            {
            // InternalRestaurante.g:1043:1: ( ( rule__Restaurante__MenusAssignment_14 )* )
            // InternalRestaurante.g:1044:2: ( rule__Restaurante__MenusAssignment_14 )*
            {
             before(grammarAccess.getRestauranteAccess().getMenusAssignment_14()); 
            // InternalRestaurante.g:1045:2: ( rule__Restaurante__MenusAssignment_14 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==58) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRestaurante.g:1045:3: rule__Restaurante__MenusAssignment_14
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Restaurante__MenusAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRestauranteAccess().getMenusAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__14__Impl"


    // $ANTLR start "rule__Restaurante__Group__15"
    // InternalRestaurante.g:1053:1: rule__Restaurante__Group__15 : rule__Restaurante__Group__15__Impl ;
    public final void rule__Restaurante__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1057:1: ( rule__Restaurante__Group__15__Impl )
            // InternalRestaurante.g:1058:2: rule__Restaurante__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Restaurante__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__15"


    // $ANTLR start "rule__Restaurante__Group__15__Impl"
    // InternalRestaurante.g:1064:1: rule__Restaurante__Group__15__Impl : ( '}' ) ;
    public final void rule__Restaurante__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1068:1: ( ( '}' ) )
            // InternalRestaurante.g:1069:1: ( '}' )
            {
            // InternalRestaurante.g:1069:1: ( '}' )
            // InternalRestaurante.g:1070:2: '}'
            {
             before(grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_15()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__Group__15__Impl"


    // $ANTLR start "rule__Ingrediente__Group__0"
    // InternalRestaurante.g:1080:1: rule__Ingrediente__Group__0 : rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1 ;
    public final void rule__Ingrediente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1084:1: ( rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1 )
            // InternalRestaurante.g:1085:2: rule__Ingrediente__Group__0__Impl rule__Ingrediente__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Ingrediente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__0"


    // $ANTLR start "rule__Ingrediente__Group__0__Impl"
    // InternalRestaurante.g:1092:1: rule__Ingrediente__Group__0__Impl : ( 'Ingrediente:' ) ;
    public final void rule__Ingrediente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1096:1: ( ( 'Ingrediente:' ) )
            // InternalRestaurante.g:1097:1: ( 'Ingrediente:' )
            {
            // InternalRestaurante.g:1097:1: ( 'Ingrediente:' )
            // InternalRestaurante.g:1098:2: 'Ingrediente:'
            {
             before(grammarAccess.getIngredienteAccess().getIngredienteKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getIngredienteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__0__Impl"


    // $ANTLR start "rule__Ingrediente__Group__1"
    // InternalRestaurante.g:1107:1: rule__Ingrediente__Group__1 : rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2 ;
    public final void rule__Ingrediente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1111:1: ( rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2 )
            // InternalRestaurante.g:1112:2: rule__Ingrediente__Group__1__Impl rule__Ingrediente__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Ingrediente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__1"


    // $ANTLR start "rule__Ingrediente__Group__1__Impl"
    // InternalRestaurante.g:1119:1: rule__Ingrediente__Group__1__Impl : ( ( rule__Ingrediente__NameAssignment_1 ) ) ;
    public final void rule__Ingrediente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1123:1: ( ( ( rule__Ingrediente__NameAssignment_1 ) ) )
            // InternalRestaurante.g:1124:1: ( ( rule__Ingrediente__NameAssignment_1 ) )
            {
            // InternalRestaurante.g:1124:1: ( ( rule__Ingrediente__NameAssignment_1 ) )
            // InternalRestaurante.g:1125:2: ( rule__Ingrediente__NameAssignment_1 )
            {
             before(grammarAccess.getIngredienteAccess().getNameAssignment_1()); 
            // InternalRestaurante.g:1126:2: ( rule__Ingrediente__NameAssignment_1 )
            // InternalRestaurante.g:1126:3: rule__Ingrediente__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__1__Impl"


    // $ANTLR start "rule__Ingrediente__Group__2"
    // InternalRestaurante.g:1134:1: rule__Ingrediente__Group__2 : rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3 ;
    public final void rule__Ingrediente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1138:1: ( rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3 )
            // InternalRestaurante.g:1139:2: rule__Ingrediente__Group__2__Impl rule__Ingrediente__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Ingrediente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__2"


    // $ANTLR start "rule__Ingrediente__Group__2__Impl"
    // InternalRestaurante.g:1146:1: rule__Ingrediente__Group__2__Impl : ( ( rule__Ingrediente__NombreAssignment_2 ) ) ;
    public final void rule__Ingrediente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1150:1: ( ( ( rule__Ingrediente__NombreAssignment_2 ) ) )
            // InternalRestaurante.g:1151:1: ( ( rule__Ingrediente__NombreAssignment_2 ) )
            {
            // InternalRestaurante.g:1151:1: ( ( rule__Ingrediente__NombreAssignment_2 ) )
            // InternalRestaurante.g:1152:2: ( rule__Ingrediente__NombreAssignment_2 )
            {
             before(grammarAccess.getIngredienteAccess().getNombreAssignment_2()); 
            // InternalRestaurante.g:1153:2: ( rule__Ingrediente__NombreAssignment_2 )
            // InternalRestaurante.g:1153:3: rule__Ingrediente__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__2__Impl"


    // $ANTLR start "rule__Ingrediente__Group__3"
    // InternalRestaurante.g:1161:1: rule__Ingrediente__Group__3 : rule__Ingrediente__Group__3__Impl rule__Ingrediente__Group__4 ;
    public final void rule__Ingrediente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1165:1: ( rule__Ingrediente__Group__3__Impl rule__Ingrediente__Group__4 )
            // InternalRestaurante.g:1166:2: rule__Ingrediente__Group__3__Impl rule__Ingrediente__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Ingrediente__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__3"


    // $ANTLR start "rule__Ingrediente__Group__3__Impl"
    // InternalRestaurante.g:1173:1: rule__Ingrediente__Group__3__Impl : ( ( rule__Ingrediente__Group_3__0 )? ) ;
    public final void rule__Ingrediente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1177:1: ( ( ( rule__Ingrediente__Group_3__0 )? ) )
            // InternalRestaurante.g:1178:1: ( ( rule__Ingrediente__Group_3__0 )? )
            {
            // InternalRestaurante.g:1178:1: ( ( rule__Ingrediente__Group_3__0 )? )
            // InternalRestaurante.g:1179:2: ( rule__Ingrediente__Group_3__0 )?
            {
             before(grammarAccess.getIngredienteAccess().getGroup_3()); 
            // InternalRestaurante.g:1180:2: ( rule__Ingrediente__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRestaurante.g:1180:3: rule__Ingrediente__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingrediente__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredienteAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__3__Impl"


    // $ANTLR start "rule__Ingrediente__Group__4"
    // InternalRestaurante.g:1188:1: rule__Ingrediente__Group__4 : rule__Ingrediente__Group__4__Impl rule__Ingrediente__Group__5 ;
    public final void rule__Ingrediente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1192:1: ( rule__Ingrediente__Group__4__Impl rule__Ingrediente__Group__5 )
            // InternalRestaurante.g:1193:2: rule__Ingrediente__Group__4__Impl rule__Ingrediente__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Ingrediente__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__4"


    // $ANTLR start "rule__Ingrediente__Group__4__Impl"
    // InternalRestaurante.g:1200:1: rule__Ingrediente__Group__4__Impl : ( ( rule__Ingrediente__Group_4__0 )? ) ;
    public final void rule__Ingrediente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1204:1: ( ( ( rule__Ingrediente__Group_4__0 )? ) )
            // InternalRestaurante.g:1205:1: ( ( rule__Ingrediente__Group_4__0 )? )
            {
            // InternalRestaurante.g:1205:1: ( ( rule__Ingrediente__Group_4__0 )? )
            // InternalRestaurante.g:1206:2: ( rule__Ingrediente__Group_4__0 )?
            {
             before(grammarAccess.getIngredienteAccess().getGroup_4()); 
            // InternalRestaurante.g:1207:2: ( rule__Ingrediente__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRestaurante.g:1207:3: rule__Ingrediente__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingrediente__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredienteAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__4__Impl"


    // $ANTLR start "rule__Ingrediente__Group__5"
    // InternalRestaurante.g:1215:1: rule__Ingrediente__Group__5 : rule__Ingrediente__Group__5__Impl ;
    public final void rule__Ingrediente__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1219:1: ( rule__Ingrediente__Group__5__Impl )
            // InternalRestaurante.g:1220:2: rule__Ingrediente__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__5"


    // $ANTLR start "rule__Ingrediente__Group__5__Impl"
    // InternalRestaurante.g:1226:1: rule__Ingrediente__Group__5__Impl : ( ( rule__Ingrediente__AlergenicoAssignment_5 )? ) ;
    public final void rule__Ingrediente__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1230:1: ( ( ( rule__Ingrediente__AlergenicoAssignment_5 )? ) )
            // InternalRestaurante.g:1231:1: ( ( rule__Ingrediente__AlergenicoAssignment_5 )? )
            {
            // InternalRestaurante.g:1231:1: ( ( rule__Ingrediente__AlergenicoAssignment_5 )? )
            // InternalRestaurante.g:1232:2: ( rule__Ingrediente__AlergenicoAssignment_5 )?
            {
             before(grammarAccess.getIngredienteAccess().getAlergenicoAssignment_5()); 
            // InternalRestaurante.g:1233:2: ( rule__Ingrediente__AlergenicoAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==65) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRestaurante.g:1233:3: rule__Ingrediente__AlergenicoAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ingrediente__AlergenicoAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredienteAccess().getAlergenicoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group__5__Impl"


    // $ANTLR start "rule__Ingrediente__Group_3__0"
    // InternalRestaurante.g:1242:1: rule__Ingrediente__Group_3__0 : rule__Ingrediente__Group_3__0__Impl rule__Ingrediente__Group_3__1 ;
    public final void rule__Ingrediente__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1246:1: ( rule__Ingrediente__Group_3__0__Impl rule__Ingrediente__Group_3__1 )
            // InternalRestaurante.g:1247:2: rule__Ingrediente__Group_3__0__Impl rule__Ingrediente__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Ingrediente__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_3__0"


    // $ANTLR start "rule__Ingrediente__Group_3__0__Impl"
    // InternalRestaurante.g:1254:1: rule__Ingrediente__Group_3__0__Impl : ( 'infoURL:' ) ;
    public final void rule__Ingrediente__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1258:1: ( ( 'infoURL:' ) )
            // InternalRestaurante.g:1259:1: ( 'infoURL:' )
            {
            // InternalRestaurante.g:1259:1: ( 'infoURL:' )
            // InternalRestaurante.g:1260:2: 'infoURL:'
            {
             before(grammarAccess.getIngredienteAccess().getInfoURLKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getInfoURLKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_3__0__Impl"


    // $ANTLR start "rule__Ingrediente__Group_3__1"
    // InternalRestaurante.g:1269:1: rule__Ingrediente__Group_3__1 : rule__Ingrediente__Group_3__1__Impl ;
    public final void rule__Ingrediente__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1273:1: ( rule__Ingrediente__Group_3__1__Impl )
            // InternalRestaurante.g:1274:2: rule__Ingrediente__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_3__1"


    // $ANTLR start "rule__Ingrediente__Group_3__1__Impl"
    // InternalRestaurante.g:1280:1: rule__Ingrediente__Group_3__1__Impl : ( ( rule__Ingrediente__InfoURLAssignment_3_1 ) ) ;
    public final void rule__Ingrediente__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1284:1: ( ( ( rule__Ingrediente__InfoURLAssignment_3_1 ) ) )
            // InternalRestaurante.g:1285:1: ( ( rule__Ingrediente__InfoURLAssignment_3_1 ) )
            {
            // InternalRestaurante.g:1285:1: ( ( rule__Ingrediente__InfoURLAssignment_3_1 ) )
            // InternalRestaurante.g:1286:2: ( rule__Ingrediente__InfoURLAssignment_3_1 )
            {
             before(grammarAccess.getIngredienteAccess().getInfoURLAssignment_3_1()); 
            // InternalRestaurante.g:1287:2: ( rule__Ingrediente__InfoURLAssignment_3_1 )
            // InternalRestaurante.g:1287:3: rule__Ingrediente__InfoURLAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__InfoURLAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getInfoURLAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_3__1__Impl"


    // $ANTLR start "rule__Ingrediente__Group_4__0"
    // InternalRestaurante.g:1296:1: rule__Ingrediente__Group_4__0 : rule__Ingrediente__Group_4__0__Impl rule__Ingrediente__Group_4__1 ;
    public final void rule__Ingrediente__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1300:1: ( rule__Ingrediente__Group_4__0__Impl rule__Ingrediente__Group_4__1 )
            // InternalRestaurante.g:1301:2: rule__Ingrediente__Group_4__0__Impl rule__Ingrediente__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Ingrediente__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_4__0"


    // $ANTLR start "rule__Ingrediente__Group_4__0__Impl"
    // InternalRestaurante.g:1308:1: rule__Ingrediente__Group_4__0__Impl : ( 'foto:' ) ;
    public final void rule__Ingrediente__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1312:1: ( ( 'foto:' ) )
            // InternalRestaurante.g:1313:1: ( 'foto:' )
            {
            // InternalRestaurante.g:1313:1: ( 'foto:' )
            // InternalRestaurante.g:1314:2: 'foto:'
            {
             before(grammarAccess.getIngredienteAccess().getFotoKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getFotoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_4__0__Impl"


    // $ANTLR start "rule__Ingrediente__Group_4__1"
    // InternalRestaurante.g:1323:1: rule__Ingrediente__Group_4__1 : rule__Ingrediente__Group_4__1__Impl ;
    public final void rule__Ingrediente__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1327:1: ( rule__Ingrediente__Group_4__1__Impl )
            // InternalRestaurante.g:1328:2: rule__Ingrediente__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_4__1"


    // $ANTLR start "rule__Ingrediente__Group_4__1__Impl"
    // InternalRestaurante.g:1334:1: rule__Ingrediente__Group_4__1__Impl : ( ( rule__Ingrediente__FotoAssignment_4_1 ) ) ;
    public final void rule__Ingrediente__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1338:1: ( ( ( rule__Ingrediente__FotoAssignment_4_1 ) ) )
            // InternalRestaurante.g:1339:1: ( ( rule__Ingrediente__FotoAssignment_4_1 ) )
            {
            // InternalRestaurante.g:1339:1: ( ( rule__Ingrediente__FotoAssignment_4_1 ) )
            // InternalRestaurante.g:1340:2: ( rule__Ingrediente__FotoAssignment_4_1 )
            {
             before(grammarAccess.getIngredienteAccess().getFotoAssignment_4_1()); 
            // InternalRestaurante.g:1341:2: ( rule__Ingrediente__FotoAssignment_4_1 )
            // InternalRestaurante.g:1341:3: rule__Ingrediente__FotoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Ingrediente__FotoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredienteAccess().getFotoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__Group_4__1__Impl"


    // $ANTLR start "rule__Principal__Group__0"
    // InternalRestaurante.g:1350:1: rule__Principal__Group__0 : rule__Principal__Group__0__Impl rule__Principal__Group__1 ;
    public final void rule__Principal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1354:1: ( rule__Principal__Group__0__Impl rule__Principal__Group__1 )
            // InternalRestaurante.g:1355:2: rule__Principal__Group__0__Impl rule__Principal__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Principal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__0"


    // $ANTLR start "rule__Principal__Group__0__Impl"
    // InternalRestaurante.g:1362:1: rule__Principal__Group__0__Impl : ( 'Principal:' ) ;
    public final void rule__Principal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1366:1: ( ( 'Principal:' ) )
            // InternalRestaurante.g:1367:1: ( 'Principal:' )
            {
            // InternalRestaurante.g:1367:1: ( 'Principal:' )
            // InternalRestaurante.g:1368:2: 'Principal:'
            {
             before(grammarAccess.getPrincipalAccess().getPrincipalKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getPrincipalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__0__Impl"


    // $ANTLR start "rule__Principal__Group__1"
    // InternalRestaurante.g:1377:1: rule__Principal__Group__1 : rule__Principal__Group__1__Impl rule__Principal__Group__2 ;
    public final void rule__Principal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1381:1: ( rule__Principal__Group__1__Impl rule__Principal__Group__2 )
            // InternalRestaurante.g:1382:2: rule__Principal__Group__1__Impl rule__Principal__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Principal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__1"


    // $ANTLR start "rule__Principal__Group__1__Impl"
    // InternalRestaurante.g:1389:1: rule__Principal__Group__1__Impl : ( ( rule__Principal__NameAssignment_1 ) ) ;
    public final void rule__Principal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1393:1: ( ( ( rule__Principal__NameAssignment_1 ) ) )
            // InternalRestaurante.g:1394:1: ( ( rule__Principal__NameAssignment_1 ) )
            {
            // InternalRestaurante.g:1394:1: ( ( rule__Principal__NameAssignment_1 ) )
            // InternalRestaurante.g:1395:2: ( rule__Principal__NameAssignment_1 )
            {
             before(grammarAccess.getPrincipalAccess().getNameAssignment_1()); 
            // InternalRestaurante.g:1396:2: ( rule__Principal__NameAssignment_1 )
            // InternalRestaurante.g:1396:3: rule__Principal__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Principal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__1__Impl"


    // $ANTLR start "rule__Principal__Group__2"
    // InternalRestaurante.g:1404:1: rule__Principal__Group__2 : rule__Principal__Group__2__Impl rule__Principal__Group__3 ;
    public final void rule__Principal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1408:1: ( rule__Principal__Group__2__Impl rule__Principal__Group__3 )
            // InternalRestaurante.g:1409:2: rule__Principal__Group__2__Impl rule__Principal__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Principal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__2"


    // $ANTLR start "rule__Principal__Group__2__Impl"
    // InternalRestaurante.g:1416:1: rule__Principal__Group__2__Impl : ( ( rule__Principal__NombreAssignment_2 ) ) ;
    public final void rule__Principal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1420:1: ( ( ( rule__Principal__NombreAssignment_2 ) ) )
            // InternalRestaurante.g:1421:1: ( ( rule__Principal__NombreAssignment_2 ) )
            {
            // InternalRestaurante.g:1421:1: ( ( rule__Principal__NombreAssignment_2 ) )
            // InternalRestaurante.g:1422:2: ( rule__Principal__NombreAssignment_2 )
            {
             before(grammarAccess.getPrincipalAccess().getNombreAssignment_2()); 
            // InternalRestaurante.g:1423:2: ( rule__Principal__NombreAssignment_2 )
            // InternalRestaurante.g:1423:3: rule__Principal__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Principal__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__2__Impl"


    // $ANTLR start "rule__Principal__Group__3"
    // InternalRestaurante.g:1431:1: rule__Principal__Group__3 : rule__Principal__Group__3__Impl rule__Principal__Group__4 ;
    public final void rule__Principal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1435:1: ( rule__Principal__Group__3__Impl rule__Principal__Group__4 )
            // InternalRestaurante.g:1436:2: rule__Principal__Group__3__Impl rule__Principal__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Principal__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__3"


    // $ANTLR start "rule__Principal__Group__3__Impl"
    // InternalRestaurante.g:1443:1: rule__Principal__Group__3__Impl : ( ( rule__Principal__EnsaladaAssignment_3 )? ) ;
    public final void rule__Principal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1447:1: ( ( ( rule__Principal__EnsaladaAssignment_3 )? ) )
            // InternalRestaurante.g:1448:1: ( ( rule__Principal__EnsaladaAssignment_3 )? )
            {
            // InternalRestaurante.g:1448:1: ( ( rule__Principal__EnsaladaAssignment_3 )? )
            // InternalRestaurante.g:1449:2: ( rule__Principal__EnsaladaAssignment_3 )?
            {
             before(grammarAccess.getPrincipalAccess().getEnsaladaAssignment_3()); 
            // InternalRestaurante.g:1450:2: ( rule__Principal__EnsaladaAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==66) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRestaurante.g:1450:3: rule__Principal__EnsaladaAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Principal__EnsaladaAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrincipalAccess().getEnsaladaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__3__Impl"


    // $ANTLR start "rule__Principal__Group__4"
    // InternalRestaurante.g:1458:1: rule__Principal__Group__4 : rule__Principal__Group__4__Impl rule__Principal__Group__5 ;
    public final void rule__Principal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1462:1: ( rule__Principal__Group__4__Impl rule__Principal__Group__5 )
            // InternalRestaurante.g:1463:2: rule__Principal__Group__4__Impl rule__Principal__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Principal__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__4"


    // $ANTLR start "rule__Principal__Group__4__Impl"
    // InternalRestaurante.g:1470:1: rule__Principal__Group__4__Impl : ( '{' ) ;
    public final void rule__Principal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1474:1: ( ( '{' ) )
            // InternalRestaurante.g:1475:1: ( '{' )
            {
            // InternalRestaurante.g:1475:1: ( '{' )
            // InternalRestaurante.g:1476:2: '{'
            {
             before(grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__4__Impl"


    // $ANTLR start "rule__Principal__Group__5"
    // InternalRestaurante.g:1485:1: rule__Principal__Group__5 : rule__Principal__Group__5__Impl rule__Principal__Group__6 ;
    public final void rule__Principal__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1489:1: ( rule__Principal__Group__5__Impl rule__Principal__Group__6 )
            // InternalRestaurante.g:1490:2: rule__Principal__Group__5__Impl rule__Principal__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Principal__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__5"


    // $ANTLR start "rule__Principal__Group__5__Impl"
    // InternalRestaurante.g:1497:1: rule__Principal__Group__5__Impl : ( 'Descripcion:' ) ;
    public final void rule__Principal__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1501:1: ( ( 'Descripcion:' ) )
            // InternalRestaurante.g:1502:1: ( 'Descripcion:' )
            {
            // InternalRestaurante.g:1502:1: ( 'Descripcion:' )
            // InternalRestaurante.g:1503:2: 'Descripcion:'
            {
             before(grammarAccess.getPrincipalAccess().getDescripcionKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getDescripcionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__5__Impl"


    // $ANTLR start "rule__Principal__Group__6"
    // InternalRestaurante.g:1512:1: rule__Principal__Group__6 : rule__Principal__Group__6__Impl rule__Principal__Group__7 ;
    public final void rule__Principal__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1516:1: ( rule__Principal__Group__6__Impl rule__Principal__Group__7 )
            // InternalRestaurante.g:1517:2: rule__Principal__Group__6__Impl rule__Principal__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Principal__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__6"


    // $ANTLR start "rule__Principal__Group__6__Impl"
    // InternalRestaurante.g:1524:1: rule__Principal__Group__6__Impl : ( ( rule__Principal__DescripcionAssignment_6 ) ) ;
    public final void rule__Principal__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1528:1: ( ( ( rule__Principal__DescripcionAssignment_6 ) ) )
            // InternalRestaurante.g:1529:1: ( ( rule__Principal__DescripcionAssignment_6 ) )
            {
            // InternalRestaurante.g:1529:1: ( ( rule__Principal__DescripcionAssignment_6 ) )
            // InternalRestaurante.g:1530:2: ( rule__Principal__DescripcionAssignment_6 )
            {
             before(grammarAccess.getPrincipalAccess().getDescripcionAssignment_6()); 
            // InternalRestaurante.g:1531:2: ( rule__Principal__DescripcionAssignment_6 )
            // InternalRestaurante.g:1531:3: rule__Principal__DescripcionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Principal__DescripcionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getDescripcionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__6__Impl"


    // $ANTLR start "rule__Principal__Group__7"
    // InternalRestaurante.g:1539:1: rule__Principal__Group__7 : rule__Principal__Group__7__Impl rule__Principal__Group__8 ;
    public final void rule__Principal__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1543:1: ( rule__Principal__Group__7__Impl rule__Principal__Group__8 )
            // InternalRestaurante.g:1544:2: rule__Principal__Group__7__Impl rule__Principal__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__Principal__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__7"


    // $ANTLR start "rule__Principal__Group__7__Impl"
    // InternalRestaurante.g:1551:1: rule__Principal__Group__7__Impl : ( 'Foto:' ) ;
    public final void rule__Principal__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1555:1: ( ( 'Foto:' ) )
            // InternalRestaurante.g:1556:1: ( 'Foto:' )
            {
            // InternalRestaurante.g:1556:1: ( 'Foto:' )
            // InternalRestaurante.g:1557:2: 'Foto:'
            {
             before(grammarAccess.getPrincipalAccess().getFotoKeyword_7()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getFotoKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__7__Impl"


    // $ANTLR start "rule__Principal__Group__8"
    // InternalRestaurante.g:1566:1: rule__Principal__Group__8 : rule__Principal__Group__8__Impl rule__Principal__Group__9 ;
    public final void rule__Principal__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1570:1: ( rule__Principal__Group__8__Impl rule__Principal__Group__9 )
            // InternalRestaurante.g:1571:2: rule__Principal__Group__8__Impl rule__Principal__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Principal__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__8"


    // $ANTLR start "rule__Principal__Group__8__Impl"
    // InternalRestaurante.g:1578:1: rule__Principal__Group__8__Impl : ( ( rule__Principal__FotoAssignment_8 ) ) ;
    public final void rule__Principal__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1582:1: ( ( ( rule__Principal__FotoAssignment_8 ) ) )
            // InternalRestaurante.g:1583:1: ( ( rule__Principal__FotoAssignment_8 ) )
            {
            // InternalRestaurante.g:1583:1: ( ( rule__Principal__FotoAssignment_8 ) )
            // InternalRestaurante.g:1584:2: ( rule__Principal__FotoAssignment_8 )
            {
             before(grammarAccess.getPrincipalAccess().getFotoAssignment_8()); 
            // InternalRestaurante.g:1585:2: ( rule__Principal__FotoAssignment_8 )
            // InternalRestaurante.g:1585:3: rule__Principal__FotoAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Principal__FotoAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getFotoAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__8__Impl"


    // $ANTLR start "rule__Principal__Group__9"
    // InternalRestaurante.g:1593:1: rule__Principal__Group__9 : rule__Principal__Group__9__Impl rule__Principal__Group__10 ;
    public final void rule__Principal__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1597:1: ( rule__Principal__Group__9__Impl rule__Principal__Group__10 )
            // InternalRestaurante.g:1598:2: rule__Principal__Group__9__Impl rule__Principal__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__Principal__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__9"


    // $ANTLR start "rule__Principal__Group__9__Impl"
    // InternalRestaurante.g:1605:1: rule__Principal__Group__9__Impl : ( ( rule__Principal__Group_9__0 )? ) ;
    public final void rule__Principal__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1609:1: ( ( ( rule__Principal__Group_9__0 )? ) )
            // InternalRestaurante.g:1610:1: ( ( rule__Principal__Group_9__0 )? )
            {
            // InternalRestaurante.g:1610:1: ( ( rule__Principal__Group_9__0 )? )
            // InternalRestaurante.g:1611:2: ( rule__Principal__Group_9__0 )?
            {
             before(grammarAccess.getPrincipalAccess().getGroup_9()); 
            // InternalRestaurante.g:1612:2: ( rule__Principal__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRestaurante.g:1612:3: rule__Principal__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Principal__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrincipalAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__9__Impl"


    // $ANTLR start "rule__Principal__Group__10"
    // InternalRestaurante.g:1620:1: rule__Principal__Group__10 : rule__Principal__Group__10__Impl rule__Principal__Group__11 ;
    public final void rule__Principal__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1624:1: ( rule__Principal__Group__10__Impl rule__Principal__Group__11 )
            // InternalRestaurante.g:1625:2: rule__Principal__Group__10__Impl rule__Principal__Group__11
            {
            pushFollow(FOLLOW_23);
            rule__Principal__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__10"


    // $ANTLR start "rule__Principal__Group__10__Impl"
    // InternalRestaurante.g:1632:1: rule__Principal__Group__10__Impl : ( 'Salsa recomendada:' ) ;
    public final void rule__Principal__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1636:1: ( ( 'Salsa recomendada:' ) )
            // InternalRestaurante.g:1637:1: ( 'Salsa recomendada:' )
            {
            // InternalRestaurante.g:1637:1: ( 'Salsa recomendada:' )
            // InternalRestaurante.g:1638:2: 'Salsa recomendada:'
            {
             before(grammarAccess.getPrincipalAccess().getSalsaRecomendadaKeyword_10()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getSalsaRecomendadaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__10__Impl"


    // $ANTLR start "rule__Principal__Group__11"
    // InternalRestaurante.g:1647:1: rule__Principal__Group__11 : rule__Principal__Group__11__Impl rule__Principal__Group__12 ;
    public final void rule__Principal__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1651:1: ( rule__Principal__Group__11__Impl rule__Principal__Group__12 )
            // InternalRestaurante.g:1652:2: rule__Principal__Group__11__Impl rule__Principal__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__Principal__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__11"


    // $ANTLR start "rule__Principal__Group__11__Impl"
    // InternalRestaurante.g:1659:1: rule__Principal__Group__11__Impl : ( ( rule__Principal__SalsaAssignment_11 ) ) ;
    public final void rule__Principal__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1663:1: ( ( ( rule__Principal__SalsaAssignment_11 ) ) )
            // InternalRestaurante.g:1664:1: ( ( rule__Principal__SalsaAssignment_11 ) )
            {
            // InternalRestaurante.g:1664:1: ( ( rule__Principal__SalsaAssignment_11 ) )
            // InternalRestaurante.g:1665:2: ( rule__Principal__SalsaAssignment_11 )
            {
             before(grammarAccess.getPrincipalAccess().getSalsaAssignment_11()); 
            // InternalRestaurante.g:1666:2: ( rule__Principal__SalsaAssignment_11 )
            // InternalRestaurante.g:1666:3: rule__Principal__SalsaAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Principal__SalsaAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getSalsaAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__11__Impl"


    // $ANTLR start "rule__Principal__Group__12"
    // InternalRestaurante.g:1674:1: rule__Principal__Group__12 : rule__Principal__Group__12__Impl rule__Principal__Group__13 ;
    public final void rule__Principal__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1678:1: ( rule__Principal__Group__12__Impl rule__Principal__Group__13 )
            // InternalRestaurante.g:1679:2: rule__Principal__Group__12__Impl rule__Principal__Group__13
            {
            pushFollow(FOLLOW_24);
            rule__Principal__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__12"


    // $ANTLR start "rule__Principal__Group__12__Impl"
    // InternalRestaurante.g:1686:1: rule__Principal__Group__12__Impl : ( ( rule__Principal__Group_12__0 )? ) ;
    public final void rule__Principal__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1690:1: ( ( ( rule__Principal__Group_12__0 )? ) )
            // InternalRestaurante.g:1691:1: ( ( rule__Principal__Group_12__0 )? )
            {
            // InternalRestaurante.g:1691:1: ( ( rule__Principal__Group_12__0 )? )
            // InternalRestaurante.g:1692:2: ( rule__Principal__Group_12__0 )?
            {
             before(grammarAccess.getPrincipalAccess().getGroup_12()); 
            // InternalRestaurante.g:1693:2: ( rule__Principal__Group_12__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==45) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRestaurante.g:1693:3: rule__Principal__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Principal__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrincipalAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__12__Impl"


    // $ANTLR start "rule__Principal__Group__13"
    // InternalRestaurante.g:1701:1: rule__Principal__Group__13 : rule__Principal__Group__13__Impl ;
    public final void rule__Principal__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1705:1: ( rule__Principal__Group__13__Impl )
            // InternalRestaurante.g:1706:2: rule__Principal__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__13"


    // $ANTLR start "rule__Principal__Group__13__Impl"
    // InternalRestaurante.g:1712:1: rule__Principal__Group__13__Impl : ( '}' ) ;
    public final void rule__Principal__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1716:1: ( ( '}' ) )
            // InternalRestaurante.g:1717:1: ( '}' )
            {
            // InternalRestaurante.g:1717:1: ( '}' )
            // InternalRestaurante.g:1718:2: '}'
            {
             before(grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_13()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group__13__Impl"


    // $ANTLR start "rule__Principal__Group_9__0"
    // InternalRestaurante.g:1728:1: rule__Principal__Group_9__0 : rule__Principal__Group_9__0__Impl rule__Principal__Group_9__1 ;
    public final void rule__Principal__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1732:1: ( rule__Principal__Group_9__0__Impl rule__Principal__Group_9__1 )
            // InternalRestaurante.g:1733:2: rule__Principal__Group_9__0__Impl rule__Principal__Group_9__1
            {
            pushFollow(FOLLOW_16);
            rule__Principal__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_9__0"


    // $ANTLR start "rule__Principal__Group_9__0__Impl"
    // InternalRestaurante.g:1740:1: rule__Principal__Group_9__0__Impl : ( 'Ingredientes:' ) ;
    public final void rule__Principal__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1744:1: ( ( 'Ingredientes:' ) )
            // InternalRestaurante.g:1745:1: ( 'Ingredientes:' )
            {
            // InternalRestaurante.g:1745:1: ( 'Ingredientes:' )
            // InternalRestaurante.g:1746:2: 'Ingredientes:'
            {
             before(grammarAccess.getPrincipalAccess().getIngredientesKeyword_9_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getIngredientesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_9__0__Impl"


    // $ANTLR start "rule__Principal__Group_9__1"
    // InternalRestaurante.g:1755:1: rule__Principal__Group_9__1 : rule__Principal__Group_9__1__Impl rule__Principal__Group_9__2 ;
    public final void rule__Principal__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1759:1: ( rule__Principal__Group_9__1__Impl rule__Principal__Group_9__2 )
            // InternalRestaurante.g:1760:2: rule__Principal__Group_9__1__Impl rule__Principal__Group_9__2
            {
            pushFollow(FOLLOW_25);
            rule__Principal__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_9__1"


    // $ANTLR start "rule__Principal__Group_9__1__Impl"
    // InternalRestaurante.g:1767:1: rule__Principal__Group_9__1__Impl : ( ( rule__Principal__IngredientesAssignment_9_1 ) ) ;
    public final void rule__Principal__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1771:1: ( ( ( rule__Principal__IngredientesAssignment_9_1 ) ) )
            // InternalRestaurante.g:1772:1: ( ( rule__Principal__IngredientesAssignment_9_1 ) )
            {
            // InternalRestaurante.g:1772:1: ( ( rule__Principal__IngredientesAssignment_9_1 ) )
            // InternalRestaurante.g:1773:2: ( rule__Principal__IngredientesAssignment_9_1 )
            {
             before(grammarAccess.getPrincipalAccess().getIngredientesAssignment_9_1()); 
            // InternalRestaurante.g:1774:2: ( rule__Principal__IngredientesAssignment_9_1 )
            // InternalRestaurante.g:1774:3: rule__Principal__IngredientesAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Principal__IngredientesAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getIngredientesAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_9__1__Impl"


    // $ANTLR start "rule__Principal__Group_9__2"
    // InternalRestaurante.g:1782:1: rule__Principal__Group_9__2 : rule__Principal__Group_9__2__Impl ;
    public final void rule__Principal__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1786:1: ( rule__Principal__Group_9__2__Impl )
            // InternalRestaurante.g:1787:2: rule__Principal__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_9__2"


    // $ANTLR start "rule__Principal__Group_9__2__Impl"
    // InternalRestaurante.g:1793:1: rule__Principal__Group_9__2__Impl : ( ( rule__Principal__Group_9_2__0 )* ) ;
    public final void rule__Principal__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1797:1: ( ( ( rule__Principal__Group_9_2__0 )* ) )
            // InternalRestaurante.g:1798:1: ( ( rule__Principal__Group_9_2__0 )* )
            {
            // InternalRestaurante.g:1798:1: ( ( rule__Principal__Group_9_2__0 )* )
            // InternalRestaurante.g:1799:2: ( rule__Principal__Group_9_2__0 )*
            {
             before(grammarAccess.getPrincipalAccess().getGroup_9_2()); 
            // InternalRestaurante.g:1800:2: ( rule__Principal__Group_9_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==44) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRestaurante.g:1800:3: rule__Principal__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Principal__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPrincipalAccess().getGroup_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_9__2__Impl"


    // $ANTLR start "rule__Principal__Group_9_2__0"
    // InternalRestaurante.g:1809:1: rule__Principal__Group_9_2__0 : rule__Principal__Group_9_2__0__Impl rule__Principal__Group_9_2__1 ;
    public final void rule__Principal__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1813:1: ( rule__Principal__Group_9_2__0__Impl rule__Principal__Group_9_2__1 )
            // InternalRestaurante.g:1814:2: rule__Principal__Group_9_2__0__Impl rule__Principal__Group_9_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Principal__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_9_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_9_2__0"


    // $ANTLR start "rule__Principal__Group_9_2__0__Impl"
    // InternalRestaurante.g:1821:1: rule__Principal__Group_9_2__0__Impl : ( ',' ) ;
    public final void rule__Principal__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1825:1: ( ( ',' ) )
            // InternalRestaurante.g:1826:1: ( ',' )
            {
            // InternalRestaurante.g:1826:1: ( ',' )
            // InternalRestaurante.g:1827:2: ','
            {
             before(grammarAccess.getPrincipalAccess().getCommaKeyword_9_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getCommaKeyword_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_9_2__0__Impl"


    // $ANTLR start "rule__Principal__Group_9_2__1"
    // InternalRestaurante.g:1836:1: rule__Principal__Group_9_2__1 : rule__Principal__Group_9_2__1__Impl ;
    public final void rule__Principal__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1840:1: ( rule__Principal__Group_9_2__1__Impl )
            // InternalRestaurante.g:1841:2: rule__Principal__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group_9_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_9_2__1"


    // $ANTLR start "rule__Principal__Group_9_2__1__Impl"
    // InternalRestaurante.g:1847:1: rule__Principal__Group_9_2__1__Impl : ( ( rule__Principal__IngredientesAssignment_9_2_1 ) ) ;
    public final void rule__Principal__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1851:1: ( ( ( rule__Principal__IngredientesAssignment_9_2_1 ) ) )
            // InternalRestaurante.g:1852:1: ( ( rule__Principal__IngredientesAssignment_9_2_1 ) )
            {
            // InternalRestaurante.g:1852:1: ( ( rule__Principal__IngredientesAssignment_9_2_1 ) )
            // InternalRestaurante.g:1853:2: ( rule__Principal__IngredientesAssignment_9_2_1 )
            {
             before(grammarAccess.getPrincipalAccess().getIngredientesAssignment_9_2_1()); 
            // InternalRestaurante.g:1854:2: ( rule__Principal__IngredientesAssignment_9_2_1 )
            // InternalRestaurante.g:1854:3: rule__Principal__IngredientesAssignment_9_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Principal__IngredientesAssignment_9_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getIngredientesAssignment_9_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_9_2__1__Impl"


    // $ANTLR start "rule__Principal__Group_12__0"
    // InternalRestaurante.g:1863:1: rule__Principal__Group_12__0 : rule__Principal__Group_12__0__Impl rule__Principal__Group_12__1 ;
    public final void rule__Principal__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1867:1: ( rule__Principal__Group_12__0__Impl rule__Principal__Group_12__1 )
            // InternalRestaurante.g:1868:2: rule__Principal__Group_12__0__Impl rule__Principal__Group_12__1
            {
            pushFollow(FOLLOW_7);
            rule__Principal__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Principal__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_12__0"


    // $ANTLR start "rule__Principal__Group_12__0__Impl"
    // InternalRestaurante.g:1875:1: rule__Principal__Group_12__0__Impl : ( 'Nutricional' ) ;
    public final void rule__Principal__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1879:1: ( ( 'Nutricional' ) )
            // InternalRestaurante.g:1880:1: ( 'Nutricional' )
            {
            // InternalRestaurante.g:1880:1: ( 'Nutricional' )
            // InternalRestaurante.g:1881:2: 'Nutricional'
            {
             before(grammarAccess.getPrincipalAccess().getNutricionalKeyword_12_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getNutricionalKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_12__0__Impl"


    // $ANTLR start "rule__Principal__Group_12__1"
    // InternalRestaurante.g:1890:1: rule__Principal__Group_12__1 : rule__Principal__Group_12__1__Impl ;
    public final void rule__Principal__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1894:1: ( rule__Principal__Group_12__1__Impl )
            // InternalRestaurante.g:1895:2: rule__Principal__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Principal__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_12__1"


    // $ANTLR start "rule__Principal__Group_12__1__Impl"
    // InternalRestaurante.g:1901:1: rule__Principal__Group_12__1__Impl : ( ( rule__Principal__NutricionalAssignment_12_1 ) ) ;
    public final void rule__Principal__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1905:1: ( ( ( rule__Principal__NutricionalAssignment_12_1 ) ) )
            // InternalRestaurante.g:1906:1: ( ( rule__Principal__NutricionalAssignment_12_1 ) )
            {
            // InternalRestaurante.g:1906:1: ( ( rule__Principal__NutricionalAssignment_12_1 ) )
            // InternalRestaurante.g:1907:2: ( rule__Principal__NutricionalAssignment_12_1 )
            {
             before(grammarAccess.getPrincipalAccess().getNutricionalAssignment_12_1()); 
            // InternalRestaurante.g:1908:2: ( rule__Principal__NutricionalAssignment_12_1 )
            // InternalRestaurante.g:1908:3: rule__Principal__NutricionalAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Principal__NutricionalAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getPrincipalAccess().getNutricionalAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__Group_12__1__Impl"


    // $ANTLR start "rule__Complemento__Group__0"
    // InternalRestaurante.g:1917:1: rule__Complemento__Group__0 : rule__Complemento__Group__0__Impl rule__Complemento__Group__1 ;
    public final void rule__Complemento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1921:1: ( rule__Complemento__Group__0__Impl rule__Complemento__Group__1 )
            // InternalRestaurante.g:1922:2: rule__Complemento__Group__0__Impl rule__Complemento__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Complemento__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complemento__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__0"


    // $ANTLR start "rule__Complemento__Group__0__Impl"
    // InternalRestaurante.g:1929:1: rule__Complemento__Group__0__Impl : ( 'Complemento:' ) ;
    public final void rule__Complemento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1933:1: ( ( 'Complemento:' ) )
            // InternalRestaurante.g:1934:1: ( 'Complemento:' )
            {
            // InternalRestaurante.g:1934:1: ( 'Complemento:' )
            // InternalRestaurante.g:1935:2: 'Complemento:'
            {
             before(grammarAccess.getComplementoAccess().getComplementoKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getComplementoAccess().getComplementoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__0__Impl"


    // $ANTLR start "rule__Complemento__Group__1"
    // InternalRestaurante.g:1944:1: rule__Complemento__Group__1 : rule__Complemento__Group__1__Impl rule__Complemento__Group__2 ;
    public final void rule__Complemento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1948:1: ( rule__Complemento__Group__1__Impl rule__Complemento__Group__2 )
            // InternalRestaurante.g:1949:2: rule__Complemento__Group__1__Impl rule__Complemento__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Complemento__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complemento__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__1"


    // $ANTLR start "rule__Complemento__Group__1__Impl"
    // InternalRestaurante.g:1956:1: rule__Complemento__Group__1__Impl : ( ( rule__Complemento__NameAssignment_1 ) ) ;
    public final void rule__Complemento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1960:1: ( ( ( rule__Complemento__NameAssignment_1 ) ) )
            // InternalRestaurante.g:1961:1: ( ( rule__Complemento__NameAssignment_1 ) )
            {
            // InternalRestaurante.g:1961:1: ( ( rule__Complemento__NameAssignment_1 ) )
            // InternalRestaurante.g:1962:2: ( rule__Complemento__NameAssignment_1 )
            {
             before(grammarAccess.getComplementoAccess().getNameAssignment_1()); 
            // InternalRestaurante.g:1963:2: ( rule__Complemento__NameAssignment_1 )
            // InternalRestaurante.g:1963:3: rule__Complemento__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Complemento__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplementoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__1__Impl"


    // $ANTLR start "rule__Complemento__Group__2"
    // InternalRestaurante.g:1971:1: rule__Complemento__Group__2 : rule__Complemento__Group__2__Impl rule__Complemento__Group__3 ;
    public final void rule__Complemento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1975:1: ( rule__Complemento__Group__2__Impl rule__Complemento__Group__3 )
            // InternalRestaurante.g:1976:2: rule__Complemento__Group__2__Impl rule__Complemento__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Complemento__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complemento__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__2"


    // $ANTLR start "rule__Complemento__Group__2__Impl"
    // InternalRestaurante.g:1983:1: rule__Complemento__Group__2__Impl : ( ( rule__Complemento__NombreAssignment_2 ) ) ;
    public final void rule__Complemento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:1987:1: ( ( ( rule__Complemento__NombreAssignment_2 ) ) )
            // InternalRestaurante.g:1988:1: ( ( rule__Complemento__NombreAssignment_2 ) )
            {
            // InternalRestaurante.g:1988:1: ( ( rule__Complemento__NombreAssignment_2 ) )
            // InternalRestaurante.g:1989:2: ( rule__Complemento__NombreAssignment_2 )
            {
             before(grammarAccess.getComplementoAccess().getNombreAssignment_2()); 
            // InternalRestaurante.g:1990:2: ( rule__Complemento__NombreAssignment_2 )
            // InternalRestaurante.g:1990:3: rule__Complemento__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Complemento__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplementoAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__2__Impl"


    // $ANTLR start "rule__Complemento__Group__3"
    // InternalRestaurante.g:1998:1: rule__Complemento__Group__3 : rule__Complemento__Group__3__Impl rule__Complemento__Group__4 ;
    public final void rule__Complemento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2002:1: ( rule__Complemento__Group__3__Impl rule__Complemento__Group__4 )
            // InternalRestaurante.g:2003:2: rule__Complemento__Group__3__Impl rule__Complemento__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Complemento__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complemento__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__3"


    // $ANTLR start "rule__Complemento__Group__3__Impl"
    // InternalRestaurante.g:2010:1: rule__Complemento__Group__3__Impl : ( '{' ) ;
    public final void rule__Complemento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2014:1: ( ( '{' ) )
            // InternalRestaurante.g:2015:1: ( '{' )
            {
            // InternalRestaurante.g:2015:1: ( '{' )
            // InternalRestaurante.g:2016:2: '{'
            {
             before(grammarAccess.getComplementoAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComplementoAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__3__Impl"


    // $ANTLR start "rule__Complemento__Group__4"
    // InternalRestaurante.g:2025:1: rule__Complemento__Group__4 : rule__Complemento__Group__4__Impl rule__Complemento__Group__5 ;
    public final void rule__Complemento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2029:1: ( rule__Complemento__Group__4__Impl rule__Complemento__Group__5 )
            // InternalRestaurante.g:2030:2: rule__Complemento__Group__4__Impl rule__Complemento__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Complemento__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complemento__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__4"


    // $ANTLR start "rule__Complemento__Group__4__Impl"
    // InternalRestaurante.g:2037:1: rule__Complemento__Group__4__Impl : ( 'Descripcion:' ) ;
    public final void rule__Complemento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2041:1: ( ( 'Descripcion:' ) )
            // InternalRestaurante.g:2042:1: ( 'Descripcion:' )
            {
            // InternalRestaurante.g:2042:1: ( 'Descripcion:' )
            // InternalRestaurante.g:2043:2: 'Descripcion:'
            {
             before(grammarAccess.getComplementoAccess().getDescripcionKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComplementoAccess().getDescripcionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__4__Impl"


    // $ANTLR start "rule__Complemento__Group__5"
    // InternalRestaurante.g:2052:1: rule__Complemento__Group__5 : rule__Complemento__Group__5__Impl rule__Complemento__Group__6 ;
    public final void rule__Complemento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2056:1: ( rule__Complemento__Group__5__Impl rule__Complemento__Group__6 )
            // InternalRestaurante.g:2057:2: rule__Complemento__Group__5__Impl rule__Complemento__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Complemento__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complemento__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__5"


    // $ANTLR start "rule__Complemento__Group__5__Impl"
    // InternalRestaurante.g:2064:1: rule__Complemento__Group__5__Impl : ( ( rule__Complemento__DescripcionAssignment_5 ) ) ;
    public final void rule__Complemento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2068:1: ( ( ( rule__Complemento__DescripcionAssignment_5 ) ) )
            // InternalRestaurante.g:2069:1: ( ( rule__Complemento__DescripcionAssignment_5 ) )
            {
            // InternalRestaurante.g:2069:1: ( ( rule__Complemento__DescripcionAssignment_5 ) )
            // InternalRestaurante.g:2070:2: ( rule__Complemento__DescripcionAssignment_5 )
            {
             before(grammarAccess.getComplementoAccess().getDescripcionAssignment_5()); 
            // InternalRestaurante.g:2071:2: ( rule__Complemento__DescripcionAssignment_5 )
            // InternalRestaurante.g:2071:3: rule__Complemento__DescripcionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Complemento__DescripcionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComplementoAccess().getDescripcionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__5__Impl"


    // $ANTLR start "rule__Complemento__Group__6"
    // InternalRestaurante.g:2079:1: rule__Complemento__Group__6 : rule__Complemento__Group__6__Impl rule__Complemento__Group__7 ;
    public final void rule__Complemento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2083:1: ( rule__Complemento__Group__6__Impl rule__Complemento__Group__7 )
            // InternalRestaurante.g:2084:2: rule__Complemento__Group__6__Impl rule__Complemento__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Complemento__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complemento__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__6"


    // $ANTLR start "rule__Complemento__Group__6__Impl"
    // InternalRestaurante.g:2091:1: rule__Complemento__Group__6__Impl : ( 'Foto:' ) ;
    public final void rule__Complemento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2095:1: ( ( 'Foto:' ) )
            // InternalRestaurante.g:2096:1: ( 'Foto:' )
            {
            // InternalRestaurante.g:2096:1: ( 'Foto:' )
            // InternalRestaurante.g:2097:2: 'Foto:'
            {
             before(grammarAccess.getComplementoAccess().getFotoKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComplementoAccess().getFotoKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__6__Impl"


    // $ANTLR start "rule__Complemento__Group__7"
    // InternalRestaurante.g:2106:1: rule__Complemento__Group__7 : rule__Complemento__Group__7__Impl rule__Complemento__Group__8 ;
    public final void rule__Complemento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2110:1: ( rule__Complemento__Group__7__Impl rule__Complemento__Group__8 )
            // InternalRestaurante.g:2111:2: rule__Complemento__Group__7__Impl rule__Complemento__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Complemento__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complemento__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__7"


    // $ANTLR start "rule__Complemento__Group__7__Impl"
    // InternalRestaurante.g:2118:1: rule__Complemento__Group__7__Impl : ( ( rule__Complemento__FotoAssignment_7 ) ) ;
    public final void rule__Complemento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2122:1: ( ( ( rule__Complemento__FotoAssignment_7 ) ) )
            // InternalRestaurante.g:2123:1: ( ( rule__Complemento__FotoAssignment_7 ) )
            {
            // InternalRestaurante.g:2123:1: ( ( rule__Complemento__FotoAssignment_7 ) )
            // InternalRestaurante.g:2124:2: ( rule__Complemento__FotoAssignment_7 )
            {
             before(grammarAccess.getComplementoAccess().getFotoAssignment_7()); 
            // InternalRestaurante.g:2125:2: ( rule__Complemento__FotoAssignment_7 )
            // InternalRestaurante.g:2125:3: rule__Complemento__FotoAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Complemento__FotoAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getComplementoAccess().getFotoAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__7__Impl"


    // $ANTLR start "rule__Complemento__Group__8"
    // InternalRestaurante.g:2133:1: rule__Complemento__Group__8 : rule__Complemento__Group__8__Impl rule__Complemento__Group__9 ;
    public final void rule__Complemento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2137:1: ( rule__Complemento__Group__8__Impl rule__Complemento__Group__9 )
            // InternalRestaurante.g:2138:2: rule__Complemento__Group__8__Impl rule__Complemento__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Complemento__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complemento__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__8"


    // $ANTLR start "rule__Complemento__Group__8__Impl"
    // InternalRestaurante.g:2145:1: rule__Complemento__Group__8__Impl : ( ( rule__Complemento__Group_8__0 )? ) ;
    public final void rule__Complemento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2149:1: ( ( ( rule__Complemento__Group_8__0 )? ) )
            // InternalRestaurante.g:2150:1: ( ( rule__Complemento__Group_8__0 )? )
            {
            // InternalRestaurante.g:2150:1: ( ( rule__Complemento__Group_8__0 )? )
            // InternalRestaurante.g:2151:2: ( rule__Complemento__Group_8__0 )?
            {
             before(grammarAccess.getComplementoAccess().getGroup_8()); 
            // InternalRestaurante.g:2152:2: ( rule__Complemento__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRestaurante.g:2152:3: rule__Complemento__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Complemento__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplementoAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__8__Impl"


    // $ANTLR start "rule__Complemento__Group__9"
    // InternalRestaurante.g:2160:1: rule__Complemento__Group__9 : rule__Complemento__Group__9__Impl ;
    public final void rule__Complemento__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2164:1: ( rule__Complemento__Group__9__Impl )
            // InternalRestaurante.g:2165:2: rule__Complemento__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Complemento__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__9"


    // $ANTLR start "rule__Complemento__Group__9__Impl"
    // InternalRestaurante.g:2171:1: rule__Complemento__Group__9__Impl : ( '}' ) ;
    public final void rule__Complemento__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2175:1: ( ( '}' ) )
            // InternalRestaurante.g:2176:1: ( '}' )
            {
            // InternalRestaurante.g:2176:1: ( '}' )
            // InternalRestaurante.g:2177:2: '}'
            {
             before(grammarAccess.getComplementoAccess().getRightCurlyBracketKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComplementoAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group__9__Impl"


    // $ANTLR start "rule__Complemento__Group_8__0"
    // InternalRestaurante.g:2187:1: rule__Complemento__Group_8__0 : rule__Complemento__Group_8__0__Impl rule__Complemento__Group_8__1 ;
    public final void rule__Complemento__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2191:1: ( rule__Complemento__Group_8__0__Impl rule__Complemento__Group_8__1 )
            // InternalRestaurante.g:2192:2: rule__Complemento__Group_8__0__Impl rule__Complemento__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__Complemento__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complemento__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group_8__0"


    // $ANTLR start "rule__Complemento__Group_8__0__Impl"
    // InternalRestaurante.g:2199:1: rule__Complemento__Group_8__0__Impl : ( 'Nutricional' ) ;
    public final void rule__Complemento__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2203:1: ( ( 'Nutricional' ) )
            // InternalRestaurante.g:2204:1: ( 'Nutricional' )
            {
            // InternalRestaurante.g:2204:1: ( 'Nutricional' )
            // InternalRestaurante.g:2205:2: 'Nutricional'
            {
             before(grammarAccess.getComplementoAccess().getNutricionalKeyword_8_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getComplementoAccess().getNutricionalKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group_8__0__Impl"


    // $ANTLR start "rule__Complemento__Group_8__1"
    // InternalRestaurante.g:2214:1: rule__Complemento__Group_8__1 : rule__Complemento__Group_8__1__Impl ;
    public final void rule__Complemento__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2218:1: ( rule__Complemento__Group_8__1__Impl )
            // InternalRestaurante.g:2219:2: rule__Complemento__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Complemento__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group_8__1"


    // $ANTLR start "rule__Complemento__Group_8__1__Impl"
    // InternalRestaurante.g:2225:1: rule__Complemento__Group_8__1__Impl : ( ( rule__Complemento__NutricionalAssignment_8_1 ) ) ;
    public final void rule__Complemento__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2229:1: ( ( ( rule__Complemento__NutricionalAssignment_8_1 ) ) )
            // InternalRestaurante.g:2230:1: ( ( rule__Complemento__NutricionalAssignment_8_1 ) )
            {
            // InternalRestaurante.g:2230:1: ( ( rule__Complemento__NutricionalAssignment_8_1 ) )
            // InternalRestaurante.g:2231:2: ( rule__Complemento__NutricionalAssignment_8_1 )
            {
             before(grammarAccess.getComplementoAccess().getNutricionalAssignment_8_1()); 
            // InternalRestaurante.g:2232:2: ( rule__Complemento__NutricionalAssignment_8_1 )
            // InternalRestaurante.g:2232:3: rule__Complemento__NutricionalAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Complemento__NutricionalAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getComplementoAccess().getNutricionalAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__Group_8__1__Impl"


    // $ANTLR start "rule__BebidaFria__Group__0"
    // InternalRestaurante.g:2241:1: rule__BebidaFria__Group__0 : rule__BebidaFria__Group__0__Impl rule__BebidaFria__Group__1 ;
    public final void rule__BebidaFria__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2245:1: ( rule__BebidaFria__Group__0__Impl rule__BebidaFria__Group__1 )
            // InternalRestaurante.g:2246:2: rule__BebidaFria__Group__0__Impl rule__BebidaFria__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BebidaFria__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__0"


    // $ANTLR start "rule__BebidaFria__Group__0__Impl"
    // InternalRestaurante.g:2253:1: rule__BebidaFria__Group__0__Impl : ( 'Bebida fria:' ) ;
    public final void rule__BebidaFria__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2257:1: ( ( 'Bebida fria:' ) )
            // InternalRestaurante.g:2258:1: ( 'Bebida fria:' )
            {
            // InternalRestaurante.g:2258:1: ( 'Bebida fria:' )
            // InternalRestaurante.g:2259:2: 'Bebida fria:'
            {
             before(grammarAccess.getBebidaFriaAccess().getBebidaFriaKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getBebidaFriaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__0__Impl"


    // $ANTLR start "rule__BebidaFria__Group__1"
    // InternalRestaurante.g:2268:1: rule__BebidaFria__Group__1 : rule__BebidaFria__Group__1__Impl rule__BebidaFria__Group__2 ;
    public final void rule__BebidaFria__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2272:1: ( rule__BebidaFria__Group__1__Impl rule__BebidaFria__Group__2 )
            // InternalRestaurante.g:2273:2: rule__BebidaFria__Group__1__Impl rule__BebidaFria__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BebidaFria__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__1"


    // $ANTLR start "rule__BebidaFria__Group__1__Impl"
    // InternalRestaurante.g:2280:1: rule__BebidaFria__Group__1__Impl : ( ( rule__BebidaFria__NameAssignment_1 ) ) ;
    public final void rule__BebidaFria__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2284:1: ( ( ( rule__BebidaFria__NameAssignment_1 ) ) )
            // InternalRestaurante.g:2285:1: ( ( rule__BebidaFria__NameAssignment_1 ) )
            {
            // InternalRestaurante.g:2285:1: ( ( rule__BebidaFria__NameAssignment_1 ) )
            // InternalRestaurante.g:2286:2: ( rule__BebidaFria__NameAssignment_1 )
            {
             before(grammarAccess.getBebidaFriaAccess().getNameAssignment_1()); 
            // InternalRestaurante.g:2287:2: ( rule__BebidaFria__NameAssignment_1 )
            // InternalRestaurante.g:2287:3: rule__BebidaFria__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BebidaFria__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBebidaFriaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__1__Impl"


    // $ANTLR start "rule__BebidaFria__Group__2"
    // InternalRestaurante.g:2295:1: rule__BebidaFria__Group__2 : rule__BebidaFria__Group__2__Impl rule__BebidaFria__Group__3 ;
    public final void rule__BebidaFria__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2299:1: ( rule__BebidaFria__Group__2__Impl rule__BebidaFria__Group__3 )
            // InternalRestaurante.g:2300:2: rule__BebidaFria__Group__2__Impl rule__BebidaFria__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__BebidaFria__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__2"


    // $ANTLR start "rule__BebidaFria__Group__2__Impl"
    // InternalRestaurante.g:2307:1: rule__BebidaFria__Group__2__Impl : ( ( rule__BebidaFria__NombreAssignment_2 ) ) ;
    public final void rule__BebidaFria__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2311:1: ( ( ( rule__BebidaFria__NombreAssignment_2 ) ) )
            // InternalRestaurante.g:2312:1: ( ( rule__BebidaFria__NombreAssignment_2 ) )
            {
            // InternalRestaurante.g:2312:1: ( ( rule__BebidaFria__NombreAssignment_2 ) )
            // InternalRestaurante.g:2313:2: ( rule__BebidaFria__NombreAssignment_2 )
            {
             before(grammarAccess.getBebidaFriaAccess().getNombreAssignment_2()); 
            // InternalRestaurante.g:2314:2: ( rule__BebidaFria__NombreAssignment_2 )
            // InternalRestaurante.g:2314:3: rule__BebidaFria__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BebidaFria__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBebidaFriaAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__2__Impl"


    // $ANTLR start "rule__BebidaFria__Group__3"
    // InternalRestaurante.g:2322:1: rule__BebidaFria__Group__3 : rule__BebidaFria__Group__3__Impl rule__BebidaFria__Group__4 ;
    public final void rule__BebidaFria__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2326:1: ( rule__BebidaFria__Group__3__Impl rule__BebidaFria__Group__4 )
            // InternalRestaurante.g:2327:2: rule__BebidaFria__Group__3__Impl rule__BebidaFria__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__BebidaFria__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__3"


    // $ANTLR start "rule__BebidaFria__Group__3__Impl"
    // InternalRestaurante.g:2334:1: rule__BebidaFria__Group__3__Impl : ( '{' ) ;
    public final void rule__BebidaFria__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2338:1: ( ( '{' ) )
            // InternalRestaurante.g:2339:1: ( '{' )
            {
            // InternalRestaurante.g:2339:1: ( '{' )
            // InternalRestaurante.g:2340:2: '{'
            {
             before(grammarAccess.getBebidaFriaAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__3__Impl"


    // $ANTLR start "rule__BebidaFria__Group__4"
    // InternalRestaurante.g:2349:1: rule__BebidaFria__Group__4 : rule__BebidaFria__Group__4__Impl rule__BebidaFria__Group__5 ;
    public final void rule__BebidaFria__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2353:1: ( rule__BebidaFria__Group__4__Impl rule__BebidaFria__Group__5 )
            // InternalRestaurante.g:2354:2: rule__BebidaFria__Group__4__Impl rule__BebidaFria__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__BebidaFria__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__4"


    // $ANTLR start "rule__BebidaFria__Group__4__Impl"
    // InternalRestaurante.g:2361:1: rule__BebidaFria__Group__4__Impl : ( 'Descripcion:' ) ;
    public final void rule__BebidaFria__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2365:1: ( ( 'Descripcion:' ) )
            // InternalRestaurante.g:2366:1: ( 'Descripcion:' )
            {
            // InternalRestaurante.g:2366:1: ( 'Descripcion:' )
            // InternalRestaurante.g:2367:2: 'Descripcion:'
            {
             before(grammarAccess.getBebidaFriaAccess().getDescripcionKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getDescripcionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__4__Impl"


    // $ANTLR start "rule__BebidaFria__Group__5"
    // InternalRestaurante.g:2376:1: rule__BebidaFria__Group__5 : rule__BebidaFria__Group__5__Impl rule__BebidaFria__Group__6 ;
    public final void rule__BebidaFria__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2380:1: ( rule__BebidaFria__Group__5__Impl rule__BebidaFria__Group__6 )
            // InternalRestaurante.g:2381:2: rule__BebidaFria__Group__5__Impl rule__BebidaFria__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__BebidaFria__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__5"


    // $ANTLR start "rule__BebidaFria__Group__5__Impl"
    // InternalRestaurante.g:2388:1: rule__BebidaFria__Group__5__Impl : ( ( rule__BebidaFria__DescripcionAssignment_5 ) ) ;
    public final void rule__BebidaFria__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2392:1: ( ( ( rule__BebidaFria__DescripcionAssignment_5 ) ) )
            // InternalRestaurante.g:2393:1: ( ( rule__BebidaFria__DescripcionAssignment_5 ) )
            {
            // InternalRestaurante.g:2393:1: ( ( rule__BebidaFria__DescripcionAssignment_5 ) )
            // InternalRestaurante.g:2394:2: ( rule__BebidaFria__DescripcionAssignment_5 )
            {
             before(grammarAccess.getBebidaFriaAccess().getDescripcionAssignment_5()); 
            // InternalRestaurante.g:2395:2: ( rule__BebidaFria__DescripcionAssignment_5 )
            // InternalRestaurante.g:2395:3: rule__BebidaFria__DescripcionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BebidaFria__DescripcionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBebidaFriaAccess().getDescripcionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__5__Impl"


    // $ANTLR start "rule__BebidaFria__Group__6"
    // InternalRestaurante.g:2403:1: rule__BebidaFria__Group__6 : rule__BebidaFria__Group__6__Impl rule__BebidaFria__Group__7 ;
    public final void rule__BebidaFria__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2407:1: ( rule__BebidaFria__Group__6__Impl rule__BebidaFria__Group__7 )
            // InternalRestaurante.g:2408:2: rule__BebidaFria__Group__6__Impl rule__BebidaFria__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__BebidaFria__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__6"


    // $ANTLR start "rule__BebidaFria__Group__6__Impl"
    // InternalRestaurante.g:2415:1: rule__BebidaFria__Group__6__Impl : ( 'Distribuidor:' ) ;
    public final void rule__BebidaFria__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2419:1: ( ( 'Distribuidor:' ) )
            // InternalRestaurante.g:2420:1: ( 'Distribuidor:' )
            {
            // InternalRestaurante.g:2420:1: ( 'Distribuidor:' )
            // InternalRestaurante.g:2421:2: 'Distribuidor:'
            {
             before(grammarAccess.getBebidaFriaAccess().getDistribuidorKeyword_6()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getDistribuidorKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__6__Impl"


    // $ANTLR start "rule__BebidaFria__Group__7"
    // InternalRestaurante.g:2430:1: rule__BebidaFria__Group__7 : rule__BebidaFria__Group__7__Impl rule__BebidaFria__Group__8 ;
    public final void rule__BebidaFria__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2434:1: ( rule__BebidaFria__Group__7__Impl rule__BebidaFria__Group__8 )
            // InternalRestaurante.g:2435:2: rule__BebidaFria__Group__7__Impl rule__BebidaFria__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__BebidaFria__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__7"


    // $ANTLR start "rule__BebidaFria__Group__7__Impl"
    // InternalRestaurante.g:2442:1: rule__BebidaFria__Group__7__Impl : ( ( rule__BebidaFria__DistribuidorAssignment_7 ) ) ;
    public final void rule__BebidaFria__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2446:1: ( ( ( rule__BebidaFria__DistribuidorAssignment_7 ) ) )
            // InternalRestaurante.g:2447:1: ( ( rule__BebidaFria__DistribuidorAssignment_7 ) )
            {
            // InternalRestaurante.g:2447:1: ( ( rule__BebidaFria__DistribuidorAssignment_7 ) )
            // InternalRestaurante.g:2448:2: ( rule__BebidaFria__DistribuidorAssignment_7 )
            {
             before(grammarAccess.getBebidaFriaAccess().getDistribuidorAssignment_7()); 
            // InternalRestaurante.g:2449:2: ( rule__BebidaFria__DistribuidorAssignment_7 )
            // InternalRestaurante.g:2449:3: rule__BebidaFria__DistribuidorAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BebidaFria__DistribuidorAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBebidaFriaAccess().getDistribuidorAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__7__Impl"


    // $ANTLR start "rule__BebidaFria__Group__8"
    // InternalRestaurante.g:2457:1: rule__BebidaFria__Group__8 : rule__BebidaFria__Group__8__Impl rule__BebidaFria__Group__9 ;
    public final void rule__BebidaFria__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2461:1: ( rule__BebidaFria__Group__8__Impl rule__BebidaFria__Group__9 )
            // InternalRestaurante.g:2462:2: rule__BebidaFria__Group__8__Impl rule__BebidaFria__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__BebidaFria__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__8"


    // $ANTLR start "rule__BebidaFria__Group__8__Impl"
    // InternalRestaurante.g:2469:1: rule__BebidaFria__Group__8__Impl : ( 'Foto:' ) ;
    public final void rule__BebidaFria__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2473:1: ( ( 'Foto:' ) )
            // InternalRestaurante.g:2474:1: ( 'Foto:' )
            {
            // InternalRestaurante.g:2474:1: ( 'Foto:' )
            // InternalRestaurante.g:2475:2: 'Foto:'
            {
             before(grammarAccess.getBebidaFriaAccess().getFotoKeyword_8()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getFotoKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__8__Impl"


    // $ANTLR start "rule__BebidaFria__Group__9"
    // InternalRestaurante.g:2484:1: rule__BebidaFria__Group__9 : rule__BebidaFria__Group__9__Impl rule__BebidaFria__Group__10 ;
    public final void rule__BebidaFria__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2488:1: ( rule__BebidaFria__Group__9__Impl rule__BebidaFria__Group__10 )
            // InternalRestaurante.g:2489:2: rule__BebidaFria__Group__9__Impl rule__BebidaFria__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__BebidaFria__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__9"


    // $ANTLR start "rule__BebidaFria__Group__9__Impl"
    // InternalRestaurante.g:2496:1: rule__BebidaFria__Group__9__Impl : ( ( rule__BebidaFria__FotoAssignment_9 ) ) ;
    public final void rule__BebidaFria__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2500:1: ( ( ( rule__BebidaFria__FotoAssignment_9 ) ) )
            // InternalRestaurante.g:2501:1: ( ( rule__BebidaFria__FotoAssignment_9 ) )
            {
            // InternalRestaurante.g:2501:1: ( ( rule__BebidaFria__FotoAssignment_9 ) )
            // InternalRestaurante.g:2502:2: ( rule__BebidaFria__FotoAssignment_9 )
            {
             before(grammarAccess.getBebidaFriaAccess().getFotoAssignment_9()); 
            // InternalRestaurante.g:2503:2: ( rule__BebidaFria__FotoAssignment_9 )
            // InternalRestaurante.g:2503:3: rule__BebidaFria__FotoAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__BebidaFria__FotoAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBebidaFriaAccess().getFotoAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__9__Impl"


    // $ANTLR start "rule__BebidaFria__Group__10"
    // InternalRestaurante.g:2511:1: rule__BebidaFria__Group__10 : rule__BebidaFria__Group__10__Impl rule__BebidaFria__Group__11 ;
    public final void rule__BebidaFria__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2515:1: ( rule__BebidaFria__Group__10__Impl rule__BebidaFria__Group__11 )
            // InternalRestaurante.g:2516:2: rule__BebidaFria__Group__10__Impl rule__BebidaFria__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__BebidaFria__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__10"


    // $ANTLR start "rule__BebidaFria__Group__10__Impl"
    // InternalRestaurante.g:2523:1: rule__BebidaFria__Group__10__Impl : ( ( rule__BebidaFria__Group_10__0 )? ) ;
    public final void rule__BebidaFria__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2527:1: ( ( ( rule__BebidaFria__Group_10__0 )? ) )
            // InternalRestaurante.g:2528:1: ( ( rule__BebidaFria__Group_10__0 )? )
            {
            // InternalRestaurante.g:2528:1: ( ( rule__BebidaFria__Group_10__0 )? )
            // InternalRestaurante.g:2529:2: ( rule__BebidaFria__Group_10__0 )?
            {
             before(grammarAccess.getBebidaFriaAccess().getGroup_10()); 
            // InternalRestaurante.g:2530:2: ( rule__BebidaFria__Group_10__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==45) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRestaurante.g:2530:3: rule__BebidaFria__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BebidaFria__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBebidaFriaAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__10__Impl"


    // $ANTLR start "rule__BebidaFria__Group__11"
    // InternalRestaurante.g:2538:1: rule__BebidaFria__Group__11 : rule__BebidaFria__Group__11__Impl ;
    public final void rule__BebidaFria__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2542:1: ( rule__BebidaFria__Group__11__Impl )
            // InternalRestaurante.g:2543:2: rule__BebidaFria__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__11"


    // $ANTLR start "rule__BebidaFria__Group__11__Impl"
    // InternalRestaurante.g:2549:1: rule__BebidaFria__Group__11__Impl : ( '}' ) ;
    public final void rule__BebidaFria__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2553:1: ( ( '}' ) )
            // InternalRestaurante.g:2554:1: ( '}' )
            {
            // InternalRestaurante.g:2554:1: ( '}' )
            // InternalRestaurante.g:2555:2: '}'
            {
             before(grammarAccess.getBebidaFriaAccess().getRightCurlyBracketKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group__11__Impl"


    // $ANTLR start "rule__BebidaFria__Group_10__0"
    // InternalRestaurante.g:2565:1: rule__BebidaFria__Group_10__0 : rule__BebidaFria__Group_10__0__Impl rule__BebidaFria__Group_10__1 ;
    public final void rule__BebidaFria__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2569:1: ( rule__BebidaFria__Group_10__0__Impl rule__BebidaFria__Group_10__1 )
            // InternalRestaurante.g:2570:2: rule__BebidaFria__Group_10__0__Impl rule__BebidaFria__Group_10__1
            {
            pushFollow(FOLLOW_7);
            rule__BebidaFria__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group_10__0"


    // $ANTLR start "rule__BebidaFria__Group_10__0__Impl"
    // InternalRestaurante.g:2577:1: rule__BebidaFria__Group_10__0__Impl : ( 'Nutricional' ) ;
    public final void rule__BebidaFria__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2581:1: ( ( 'Nutricional' ) )
            // InternalRestaurante.g:2582:1: ( 'Nutricional' )
            {
            // InternalRestaurante.g:2582:1: ( 'Nutricional' )
            // InternalRestaurante.g:2583:2: 'Nutricional'
            {
             before(grammarAccess.getBebidaFriaAccess().getNutricionalKeyword_10_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getNutricionalKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group_10__0__Impl"


    // $ANTLR start "rule__BebidaFria__Group_10__1"
    // InternalRestaurante.g:2592:1: rule__BebidaFria__Group_10__1 : rule__BebidaFria__Group_10__1__Impl ;
    public final void rule__BebidaFria__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2596:1: ( rule__BebidaFria__Group_10__1__Impl )
            // InternalRestaurante.g:2597:2: rule__BebidaFria__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BebidaFria__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group_10__1"


    // $ANTLR start "rule__BebidaFria__Group_10__1__Impl"
    // InternalRestaurante.g:2603:1: rule__BebidaFria__Group_10__1__Impl : ( ( rule__BebidaFria__NutricionalAssignment_10_1 ) ) ;
    public final void rule__BebidaFria__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2607:1: ( ( ( rule__BebidaFria__NutricionalAssignment_10_1 ) ) )
            // InternalRestaurante.g:2608:1: ( ( rule__BebidaFria__NutricionalAssignment_10_1 ) )
            {
            // InternalRestaurante.g:2608:1: ( ( rule__BebidaFria__NutricionalAssignment_10_1 ) )
            // InternalRestaurante.g:2609:2: ( rule__BebidaFria__NutricionalAssignment_10_1 )
            {
             before(grammarAccess.getBebidaFriaAccess().getNutricionalAssignment_10_1()); 
            // InternalRestaurante.g:2610:2: ( rule__BebidaFria__NutricionalAssignment_10_1 )
            // InternalRestaurante.g:2610:3: rule__BebidaFria__NutricionalAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__BebidaFria__NutricionalAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getBebidaFriaAccess().getNutricionalAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__Group_10__1__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group__0"
    // InternalRestaurante.g:2619:1: rule__BebidaCaliente__Group__0 : rule__BebidaCaliente__Group__0__Impl rule__BebidaCaliente__Group__1 ;
    public final void rule__BebidaCaliente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2623:1: ( rule__BebidaCaliente__Group__0__Impl rule__BebidaCaliente__Group__1 )
            // InternalRestaurante.g:2624:2: rule__BebidaCaliente__Group__0__Impl rule__BebidaCaliente__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BebidaCaliente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__0"


    // $ANTLR start "rule__BebidaCaliente__Group__0__Impl"
    // InternalRestaurante.g:2631:1: rule__BebidaCaliente__Group__0__Impl : ( 'Bebida caliente:' ) ;
    public final void rule__BebidaCaliente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2635:1: ( ( 'Bebida caliente:' ) )
            // InternalRestaurante.g:2636:1: ( 'Bebida caliente:' )
            {
            // InternalRestaurante.g:2636:1: ( 'Bebida caliente:' )
            // InternalRestaurante.g:2637:2: 'Bebida caliente:'
            {
             before(grammarAccess.getBebidaCalienteAccess().getBebidaCalienteKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getBebidaCalienteAccess().getBebidaCalienteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__0__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group__1"
    // InternalRestaurante.g:2646:1: rule__BebidaCaliente__Group__1 : rule__BebidaCaliente__Group__1__Impl rule__BebidaCaliente__Group__2 ;
    public final void rule__BebidaCaliente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2650:1: ( rule__BebidaCaliente__Group__1__Impl rule__BebidaCaliente__Group__2 )
            // InternalRestaurante.g:2651:2: rule__BebidaCaliente__Group__1__Impl rule__BebidaCaliente__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__BebidaCaliente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__1"


    // $ANTLR start "rule__BebidaCaliente__Group__1__Impl"
    // InternalRestaurante.g:2658:1: rule__BebidaCaliente__Group__1__Impl : ( ( rule__BebidaCaliente__NameAssignment_1 ) ) ;
    public final void rule__BebidaCaliente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2662:1: ( ( ( rule__BebidaCaliente__NameAssignment_1 ) ) )
            // InternalRestaurante.g:2663:1: ( ( rule__BebidaCaliente__NameAssignment_1 ) )
            {
            // InternalRestaurante.g:2663:1: ( ( rule__BebidaCaliente__NameAssignment_1 ) )
            // InternalRestaurante.g:2664:2: ( rule__BebidaCaliente__NameAssignment_1 )
            {
             before(grammarAccess.getBebidaCalienteAccess().getNameAssignment_1()); 
            // InternalRestaurante.g:2665:2: ( rule__BebidaCaliente__NameAssignment_1 )
            // InternalRestaurante.g:2665:3: rule__BebidaCaliente__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBebidaCalienteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__1__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group__2"
    // InternalRestaurante.g:2673:1: rule__BebidaCaliente__Group__2 : rule__BebidaCaliente__Group__2__Impl rule__BebidaCaliente__Group__3 ;
    public final void rule__BebidaCaliente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2677:1: ( rule__BebidaCaliente__Group__2__Impl rule__BebidaCaliente__Group__3 )
            // InternalRestaurante.g:2678:2: rule__BebidaCaliente__Group__2__Impl rule__BebidaCaliente__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__BebidaCaliente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__2"


    // $ANTLR start "rule__BebidaCaliente__Group__2__Impl"
    // InternalRestaurante.g:2685:1: rule__BebidaCaliente__Group__2__Impl : ( ( rule__BebidaCaliente__NombreAssignment_2 ) ) ;
    public final void rule__BebidaCaliente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2689:1: ( ( ( rule__BebidaCaliente__NombreAssignment_2 ) ) )
            // InternalRestaurante.g:2690:1: ( ( rule__BebidaCaliente__NombreAssignment_2 ) )
            {
            // InternalRestaurante.g:2690:1: ( ( rule__BebidaCaliente__NombreAssignment_2 ) )
            // InternalRestaurante.g:2691:2: ( rule__BebidaCaliente__NombreAssignment_2 )
            {
             before(grammarAccess.getBebidaCalienteAccess().getNombreAssignment_2()); 
            // InternalRestaurante.g:2692:2: ( rule__BebidaCaliente__NombreAssignment_2 )
            // InternalRestaurante.g:2692:3: rule__BebidaCaliente__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBebidaCalienteAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__2__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group__3"
    // InternalRestaurante.g:2700:1: rule__BebidaCaliente__Group__3 : rule__BebidaCaliente__Group__3__Impl rule__BebidaCaliente__Group__4 ;
    public final void rule__BebidaCaliente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2704:1: ( rule__BebidaCaliente__Group__3__Impl rule__BebidaCaliente__Group__4 )
            // InternalRestaurante.g:2705:2: rule__BebidaCaliente__Group__3__Impl rule__BebidaCaliente__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__BebidaCaliente__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__3"


    // $ANTLR start "rule__BebidaCaliente__Group__3__Impl"
    // InternalRestaurante.g:2712:1: rule__BebidaCaliente__Group__3__Impl : ( '{' ) ;
    public final void rule__BebidaCaliente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2716:1: ( ( '{' ) )
            // InternalRestaurante.g:2717:1: ( '{' )
            {
            // InternalRestaurante.g:2717:1: ( '{' )
            // InternalRestaurante.g:2718:2: '{'
            {
             before(grammarAccess.getBebidaCalienteAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBebidaCalienteAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__3__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group__4"
    // InternalRestaurante.g:2727:1: rule__BebidaCaliente__Group__4 : rule__BebidaCaliente__Group__4__Impl rule__BebidaCaliente__Group__5 ;
    public final void rule__BebidaCaliente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2731:1: ( rule__BebidaCaliente__Group__4__Impl rule__BebidaCaliente__Group__5 )
            // InternalRestaurante.g:2732:2: rule__BebidaCaliente__Group__4__Impl rule__BebidaCaliente__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__BebidaCaliente__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__4"


    // $ANTLR start "rule__BebidaCaliente__Group__4__Impl"
    // InternalRestaurante.g:2739:1: rule__BebidaCaliente__Group__4__Impl : ( 'Descripcion:' ) ;
    public final void rule__BebidaCaliente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2743:1: ( ( 'Descripcion:' ) )
            // InternalRestaurante.g:2744:1: ( 'Descripcion:' )
            {
            // InternalRestaurante.g:2744:1: ( 'Descripcion:' )
            // InternalRestaurante.g:2745:2: 'Descripcion:'
            {
             before(grammarAccess.getBebidaCalienteAccess().getDescripcionKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBebidaCalienteAccess().getDescripcionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__4__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group__5"
    // InternalRestaurante.g:2754:1: rule__BebidaCaliente__Group__5 : rule__BebidaCaliente__Group__5__Impl rule__BebidaCaliente__Group__6 ;
    public final void rule__BebidaCaliente__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2758:1: ( rule__BebidaCaliente__Group__5__Impl rule__BebidaCaliente__Group__6 )
            // InternalRestaurante.g:2759:2: rule__BebidaCaliente__Group__5__Impl rule__BebidaCaliente__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__BebidaCaliente__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__5"


    // $ANTLR start "rule__BebidaCaliente__Group__5__Impl"
    // InternalRestaurante.g:2766:1: rule__BebidaCaliente__Group__5__Impl : ( ( rule__BebidaCaliente__DescripcionAssignment_5 ) ) ;
    public final void rule__BebidaCaliente__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2770:1: ( ( ( rule__BebidaCaliente__DescripcionAssignment_5 ) ) )
            // InternalRestaurante.g:2771:1: ( ( rule__BebidaCaliente__DescripcionAssignment_5 ) )
            {
            // InternalRestaurante.g:2771:1: ( ( rule__BebidaCaliente__DescripcionAssignment_5 ) )
            // InternalRestaurante.g:2772:2: ( rule__BebidaCaliente__DescripcionAssignment_5 )
            {
             before(grammarAccess.getBebidaCalienteAccess().getDescripcionAssignment_5()); 
            // InternalRestaurante.g:2773:2: ( rule__BebidaCaliente__DescripcionAssignment_5 )
            // InternalRestaurante.g:2773:3: rule__BebidaCaliente__DescripcionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__DescripcionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBebidaCalienteAccess().getDescripcionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__5__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group__6"
    // InternalRestaurante.g:2781:1: rule__BebidaCaliente__Group__6 : rule__BebidaCaliente__Group__6__Impl rule__BebidaCaliente__Group__7 ;
    public final void rule__BebidaCaliente__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2785:1: ( rule__BebidaCaliente__Group__6__Impl rule__BebidaCaliente__Group__7 )
            // InternalRestaurante.g:2786:2: rule__BebidaCaliente__Group__6__Impl rule__BebidaCaliente__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__BebidaCaliente__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__6"


    // $ANTLR start "rule__BebidaCaliente__Group__6__Impl"
    // InternalRestaurante.g:2793:1: rule__BebidaCaliente__Group__6__Impl : ( 'Foto:' ) ;
    public final void rule__BebidaCaliente__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2797:1: ( ( 'Foto:' ) )
            // InternalRestaurante.g:2798:1: ( 'Foto:' )
            {
            // InternalRestaurante.g:2798:1: ( 'Foto:' )
            // InternalRestaurante.g:2799:2: 'Foto:'
            {
             before(grammarAccess.getBebidaCalienteAccess().getFotoKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBebidaCalienteAccess().getFotoKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__6__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group__7"
    // InternalRestaurante.g:2808:1: rule__BebidaCaliente__Group__7 : rule__BebidaCaliente__Group__7__Impl rule__BebidaCaliente__Group__8 ;
    public final void rule__BebidaCaliente__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2812:1: ( rule__BebidaCaliente__Group__7__Impl rule__BebidaCaliente__Group__8 )
            // InternalRestaurante.g:2813:2: rule__BebidaCaliente__Group__7__Impl rule__BebidaCaliente__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__BebidaCaliente__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__7"


    // $ANTLR start "rule__BebidaCaliente__Group__7__Impl"
    // InternalRestaurante.g:2820:1: rule__BebidaCaliente__Group__7__Impl : ( ( rule__BebidaCaliente__FotoAssignment_7 ) ) ;
    public final void rule__BebidaCaliente__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2824:1: ( ( ( rule__BebidaCaliente__FotoAssignment_7 ) ) )
            // InternalRestaurante.g:2825:1: ( ( rule__BebidaCaliente__FotoAssignment_7 ) )
            {
            // InternalRestaurante.g:2825:1: ( ( rule__BebidaCaliente__FotoAssignment_7 ) )
            // InternalRestaurante.g:2826:2: ( rule__BebidaCaliente__FotoAssignment_7 )
            {
             before(grammarAccess.getBebidaCalienteAccess().getFotoAssignment_7()); 
            // InternalRestaurante.g:2827:2: ( rule__BebidaCaliente__FotoAssignment_7 )
            // InternalRestaurante.g:2827:3: rule__BebidaCaliente__FotoAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__FotoAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBebidaCalienteAccess().getFotoAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__7__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group__8"
    // InternalRestaurante.g:2835:1: rule__BebidaCaliente__Group__8 : rule__BebidaCaliente__Group__8__Impl rule__BebidaCaliente__Group__9 ;
    public final void rule__BebidaCaliente__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2839:1: ( rule__BebidaCaliente__Group__8__Impl rule__BebidaCaliente__Group__9 )
            // InternalRestaurante.g:2840:2: rule__BebidaCaliente__Group__8__Impl rule__BebidaCaliente__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__BebidaCaliente__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__8"


    // $ANTLR start "rule__BebidaCaliente__Group__8__Impl"
    // InternalRestaurante.g:2847:1: rule__BebidaCaliente__Group__8__Impl : ( ( rule__BebidaCaliente__Group_8__0 )? ) ;
    public final void rule__BebidaCaliente__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2851:1: ( ( ( rule__BebidaCaliente__Group_8__0 )? ) )
            // InternalRestaurante.g:2852:1: ( ( rule__BebidaCaliente__Group_8__0 )? )
            {
            // InternalRestaurante.g:2852:1: ( ( rule__BebidaCaliente__Group_8__0 )? )
            // InternalRestaurante.g:2853:2: ( rule__BebidaCaliente__Group_8__0 )?
            {
             before(grammarAccess.getBebidaCalienteAccess().getGroup_8()); 
            // InternalRestaurante.g:2854:2: ( rule__BebidaCaliente__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRestaurante.g:2854:3: rule__BebidaCaliente__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BebidaCaliente__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBebidaCalienteAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__8__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group__9"
    // InternalRestaurante.g:2862:1: rule__BebidaCaliente__Group__9 : rule__BebidaCaliente__Group__9__Impl ;
    public final void rule__BebidaCaliente__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2866:1: ( rule__BebidaCaliente__Group__9__Impl )
            // InternalRestaurante.g:2867:2: rule__BebidaCaliente__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__9"


    // $ANTLR start "rule__BebidaCaliente__Group__9__Impl"
    // InternalRestaurante.g:2873:1: rule__BebidaCaliente__Group__9__Impl : ( '}' ) ;
    public final void rule__BebidaCaliente__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2877:1: ( ( '}' ) )
            // InternalRestaurante.g:2878:1: ( '}' )
            {
            // InternalRestaurante.g:2878:1: ( '}' )
            // InternalRestaurante.g:2879:2: '}'
            {
             before(grammarAccess.getBebidaCalienteAccess().getRightCurlyBracketKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBebidaCalienteAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group__9__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group_8__0"
    // InternalRestaurante.g:2889:1: rule__BebidaCaliente__Group_8__0 : rule__BebidaCaliente__Group_8__0__Impl rule__BebidaCaliente__Group_8__1 ;
    public final void rule__BebidaCaliente__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2893:1: ( rule__BebidaCaliente__Group_8__0__Impl rule__BebidaCaliente__Group_8__1 )
            // InternalRestaurante.g:2894:2: rule__BebidaCaliente__Group_8__0__Impl rule__BebidaCaliente__Group_8__1
            {
            pushFollow(FOLLOW_7);
            rule__BebidaCaliente__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group_8__0"


    // $ANTLR start "rule__BebidaCaliente__Group_8__0__Impl"
    // InternalRestaurante.g:2901:1: rule__BebidaCaliente__Group_8__0__Impl : ( 'Nutricional' ) ;
    public final void rule__BebidaCaliente__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2905:1: ( ( 'Nutricional' ) )
            // InternalRestaurante.g:2906:1: ( 'Nutricional' )
            {
            // InternalRestaurante.g:2906:1: ( 'Nutricional' )
            // InternalRestaurante.g:2907:2: 'Nutricional'
            {
             before(grammarAccess.getBebidaCalienteAccess().getNutricionalKeyword_8_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getBebidaCalienteAccess().getNutricionalKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group_8__0__Impl"


    // $ANTLR start "rule__BebidaCaliente__Group_8__1"
    // InternalRestaurante.g:2916:1: rule__BebidaCaliente__Group_8__1 : rule__BebidaCaliente__Group_8__1__Impl ;
    public final void rule__BebidaCaliente__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2920:1: ( rule__BebidaCaliente__Group_8__1__Impl )
            // InternalRestaurante.g:2921:2: rule__BebidaCaliente__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group_8__1"


    // $ANTLR start "rule__BebidaCaliente__Group_8__1__Impl"
    // InternalRestaurante.g:2927:1: rule__BebidaCaliente__Group_8__1__Impl : ( ( rule__BebidaCaliente__NutricionalAssignment_8_1 ) ) ;
    public final void rule__BebidaCaliente__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2931:1: ( ( ( rule__BebidaCaliente__NutricionalAssignment_8_1 ) ) )
            // InternalRestaurante.g:2932:1: ( ( rule__BebidaCaliente__NutricionalAssignment_8_1 ) )
            {
            // InternalRestaurante.g:2932:1: ( ( rule__BebidaCaliente__NutricionalAssignment_8_1 ) )
            // InternalRestaurante.g:2933:2: ( rule__BebidaCaliente__NutricionalAssignment_8_1 )
            {
             before(grammarAccess.getBebidaCalienteAccess().getNutricionalAssignment_8_1()); 
            // InternalRestaurante.g:2934:2: ( rule__BebidaCaliente__NutricionalAssignment_8_1 )
            // InternalRestaurante.g:2934:3: rule__BebidaCaliente__NutricionalAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__BebidaCaliente__NutricionalAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getBebidaCalienteAccess().getNutricionalAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__Group_8__1__Impl"


    // $ANTLR start "rule__Postre__Group__0"
    // InternalRestaurante.g:2943:1: rule__Postre__Group__0 : rule__Postre__Group__0__Impl rule__Postre__Group__1 ;
    public final void rule__Postre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2947:1: ( rule__Postre__Group__0__Impl rule__Postre__Group__1 )
            // InternalRestaurante.g:2948:2: rule__Postre__Group__0__Impl rule__Postre__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Postre__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__0"


    // $ANTLR start "rule__Postre__Group__0__Impl"
    // InternalRestaurante.g:2955:1: rule__Postre__Group__0__Impl : ( 'Postre:' ) ;
    public final void rule__Postre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2959:1: ( ( 'Postre:' ) )
            // InternalRestaurante.g:2960:1: ( 'Postre:' )
            {
            // InternalRestaurante.g:2960:1: ( 'Postre:' )
            // InternalRestaurante.g:2961:2: 'Postre:'
            {
             before(grammarAccess.getPostreAccess().getPostreKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getPostreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__0__Impl"


    // $ANTLR start "rule__Postre__Group__1"
    // InternalRestaurante.g:2970:1: rule__Postre__Group__1 : rule__Postre__Group__1__Impl rule__Postre__Group__2 ;
    public final void rule__Postre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2974:1: ( rule__Postre__Group__1__Impl rule__Postre__Group__2 )
            // InternalRestaurante.g:2975:2: rule__Postre__Group__1__Impl rule__Postre__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Postre__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__1"


    // $ANTLR start "rule__Postre__Group__1__Impl"
    // InternalRestaurante.g:2982:1: rule__Postre__Group__1__Impl : ( ( rule__Postre__NameAssignment_1 ) ) ;
    public final void rule__Postre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:2986:1: ( ( ( rule__Postre__NameAssignment_1 ) ) )
            // InternalRestaurante.g:2987:1: ( ( rule__Postre__NameAssignment_1 ) )
            {
            // InternalRestaurante.g:2987:1: ( ( rule__Postre__NameAssignment_1 ) )
            // InternalRestaurante.g:2988:2: ( rule__Postre__NameAssignment_1 )
            {
             before(grammarAccess.getPostreAccess().getNameAssignment_1()); 
            // InternalRestaurante.g:2989:2: ( rule__Postre__NameAssignment_1 )
            // InternalRestaurante.g:2989:3: rule__Postre__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Postre__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPostreAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__1__Impl"


    // $ANTLR start "rule__Postre__Group__2"
    // InternalRestaurante.g:2997:1: rule__Postre__Group__2 : rule__Postre__Group__2__Impl rule__Postre__Group__3 ;
    public final void rule__Postre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3001:1: ( rule__Postre__Group__2__Impl rule__Postre__Group__3 )
            // InternalRestaurante.g:3002:2: rule__Postre__Group__2__Impl rule__Postre__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Postre__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__2"


    // $ANTLR start "rule__Postre__Group__2__Impl"
    // InternalRestaurante.g:3009:1: rule__Postre__Group__2__Impl : ( ( rule__Postre__NombreAssignment_2 ) ) ;
    public final void rule__Postre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3013:1: ( ( ( rule__Postre__NombreAssignment_2 ) ) )
            // InternalRestaurante.g:3014:1: ( ( rule__Postre__NombreAssignment_2 ) )
            {
            // InternalRestaurante.g:3014:1: ( ( rule__Postre__NombreAssignment_2 ) )
            // InternalRestaurante.g:3015:2: ( rule__Postre__NombreAssignment_2 )
            {
             before(grammarAccess.getPostreAccess().getNombreAssignment_2()); 
            // InternalRestaurante.g:3016:2: ( rule__Postre__NombreAssignment_2 )
            // InternalRestaurante.g:3016:3: rule__Postre__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Postre__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPostreAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__2__Impl"


    // $ANTLR start "rule__Postre__Group__3"
    // InternalRestaurante.g:3024:1: rule__Postre__Group__3 : rule__Postre__Group__3__Impl rule__Postre__Group__4 ;
    public final void rule__Postre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3028:1: ( rule__Postre__Group__3__Impl rule__Postre__Group__4 )
            // InternalRestaurante.g:3029:2: rule__Postre__Group__3__Impl rule__Postre__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Postre__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__3"


    // $ANTLR start "rule__Postre__Group__3__Impl"
    // InternalRestaurante.g:3036:1: rule__Postre__Group__3__Impl : ( ( rule__Postre__HeladoAssignment_3 )? ) ;
    public final void rule__Postre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3040:1: ( ( ( rule__Postre__HeladoAssignment_3 )? ) )
            // InternalRestaurante.g:3041:1: ( ( rule__Postre__HeladoAssignment_3 )? )
            {
            // InternalRestaurante.g:3041:1: ( ( rule__Postre__HeladoAssignment_3 )? )
            // InternalRestaurante.g:3042:2: ( rule__Postre__HeladoAssignment_3 )?
            {
             before(grammarAccess.getPostreAccess().getHeladoAssignment_3()); 
            // InternalRestaurante.g:3043:2: ( rule__Postre__HeladoAssignment_3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==67) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRestaurante.g:3043:3: rule__Postre__HeladoAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Postre__HeladoAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPostreAccess().getHeladoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__3__Impl"


    // $ANTLR start "rule__Postre__Group__4"
    // InternalRestaurante.g:3051:1: rule__Postre__Group__4 : rule__Postre__Group__4__Impl rule__Postre__Group__5 ;
    public final void rule__Postre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3055:1: ( rule__Postre__Group__4__Impl rule__Postre__Group__5 )
            // InternalRestaurante.g:3056:2: rule__Postre__Group__4__Impl rule__Postre__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Postre__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__4"


    // $ANTLR start "rule__Postre__Group__4__Impl"
    // InternalRestaurante.g:3063:1: rule__Postre__Group__4__Impl : ( '{' ) ;
    public final void rule__Postre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3067:1: ( ( '{' ) )
            // InternalRestaurante.g:3068:1: ( '{' )
            {
            // InternalRestaurante.g:3068:1: ( '{' )
            // InternalRestaurante.g:3069:2: '{'
            {
             before(grammarAccess.getPostreAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__4__Impl"


    // $ANTLR start "rule__Postre__Group__5"
    // InternalRestaurante.g:3078:1: rule__Postre__Group__5 : rule__Postre__Group__5__Impl rule__Postre__Group__6 ;
    public final void rule__Postre__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3082:1: ( rule__Postre__Group__5__Impl rule__Postre__Group__6 )
            // InternalRestaurante.g:3083:2: rule__Postre__Group__5__Impl rule__Postre__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Postre__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__5"


    // $ANTLR start "rule__Postre__Group__5__Impl"
    // InternalRestaurante.g:3090:1: rule__Postre__Group__5__Impl : ( 'Descripcion:' ) ;
    public final void rule__Postre__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3094:1: ( ( 'Descripcion:' ) )
            // InternalRestaurante.g:3095:1: ( 'Descripcion:' )
            {
            // InternalRestaurante.g:3095:1: ( 'Descripcion:' )
            // InternalRestaurante.g:3096:2: 'Descripcion:'
            {
             before(grammarAccess.getPostreAccess().getDescripcionKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getDescripcionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__5__Impl"


    // $ANTLR start "rule__Postre__Group__6"
    // InternalRestaurante.g:3105:1: rule__Postre__Group__6 : rule__Postre__Group__6__Impl rule__Postre__Group__7 ;
    public final void rule__Postre__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3109:1: ( rule__Postre__Group__6__Impl rule__Postre__Group__7 )
            // InternalRestaurante.g:3110:2: rule__Postre__Group__6__Impl rule__Postre__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Postre__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__6"


    // $ANTLR start "rule__Postre__Group__6__Impl"
    // InternalRestaurante.g:3117:1: rule__Postre__Group__6__Impl : ( ( rule__Postre__DescripcionAssignment_6 ) ) ;
    public final void rule__Postre__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3121:1: ( ( ( rule__Postre__DescripcionAssignment_6 ) ) )
            // InternalRestaurante.g:3122:1: ( ( rule__Postre__DescripcionAssignment_6 ) )
            {
            // InternalRestaurante.g:3122:1: ( ( rule__Postre__DescripcionAssignment_6 ) )
            // InternalRestaurante.g:3123:2: ( rule__Postre__DescripcionAssignment_6 )
            {
             before(grammarAccess.getPostreAccess().getDescripcionAssignment_6()); 
            // InternalRestaurante.g:3124:2: ( rule__Postre__DescripcionAssignment_6 )
            // InternalRestaurante.g:3124:3: rule__Postre__DescripcionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Postre__DescripcionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPostreAccess().getDescripcionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__6__Impl"


    // $ANTLR start "rule__Postre__Group__7"
    // InternalRestaurante.g:3132:1: rule__Postre__Group__7 : rule__Postre__Group__7__Impl rule__Postre__Group__8 ;
    public final void rule__Postre__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3136:1: ( rule__Postre__Group__7__Impl rule__Postre__Group__8 )
            // InternalRestaurante.g:3137:2: rule__Postre__Group__7__Impl rule__Postre__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Postre__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__7"


    // $ANTLR start "rule__Postre__Group__7__Impl"
    // InternalRestaurante.g:3144:1: rule__Postre__Group__7__Impl : ( ( rule__Postre__Group_7__0 )? ) ;
    public final void rule__Postre__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3148:1: ( ( ( rule__Postre__Group_7__0 )? ) )
            // InternalRestaurante.g:3149:1: ( ( rule__Postre__Group_7__0 )? )
            {
            // InternalRestaurante.g:3149:1: ( ( rule__Postre__Group_7__0 )? )
            // InternalRestaurante.g:3150:2: ( rule__Postre__Group_7__0 )?
            {
             before(grammarAccess.getPostreAccess().getGroup_7()); 
            // InternalRestaurante.g:3151:2: ( rule__Postre__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRestaurante.g:3151:3: rule__Postre__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Postre__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPostreAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__7__Impl"


    // $ANTLR start "rule__Postre__Group__8"
    // InternalRestaurante.g:3159:1: rule__Postre__Group__8 : rule__Postre__Group__8__Impl rule__Postre__Group__9 ;
    public final void rule__Postre__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3163:1: ( rule__Postre__Group__8__Impl rule__Postre__Group__9 )
            // InternalRestaurante.g:3164:2: rule__Postre__Group__8__Impl rule__Postre__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Postre__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__8"


    // $ANTLR start "rule__Postre__Group__8__Impl"
    // InternalRestaurante.g:3171:1: rule__Postre__Group__8__Impl : ( 'Foto:' ) ;
    public final void rule__Postre__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3175:1: ( ( 'Foto:' ) )
            // InternalRestaurante.g:3176:1: ( 'Foto:' )
            {
            // InternalRestaurante.g:3176:1: ( 'Foto:' )
            // InternalRestaurante.g:3177:2: 'Foto:'
            {
             before(grammarAccess.getPostreAccess().getFotoKeyword_8()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getFotoKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__8__Impl"


    // $ANTLR start "rule__Postre__Group__9"
    // InternalRestaurante.g:3186:1: rule__Postre__Group__9 : rule__Postre__Group__9__Impl rule__Postre__Group__10 ;
    public final void rule__Postre__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3190:1: ( rule__Postre__Group__9__Impl rule__Postre__Group__10 )
            // InternalRestaurante.g:3191:2: rule__Postre__Group__9__Impl rule__Postre__Group__10
            {
            pushFollow(FOLLOW_31);
            rule__Postre__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__9"


    // $ANTLR start "rule__Postre__Group__9__Impl"
    // InternalRestaurante.g:3198:1: rule__Postre__Group__9__Impl : ( ( rule__Postre__FotoAssignment_9 ) ) ;
    public final void rule__Postre__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3202:1: ( ( ( rule__Postre__FotoAssignment_9 ) ) )
            // InternalRestaurante.g:3203:1: ( ( rule__Postre__FotoAssignment_9 ) )
            {
            // InternalRestaurante.g:3203:1: ( ( rule__Postre__FotoAssignment_9 ) )
            // InternalRestaurante.g:3204:2: ( rule__Postre__FotoAssignment_9 )
            {
             before(grammarAccess.getPostreAccess().getFotoAssignment_9()); 
            // InternalRestaurante.g:3205:2: ( rule__Postre__FotoAssignment_9 )
            // InternalRestaurante.g:3205:3: rule__Postre__FotoAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Postre__FotoAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPostreAccess().getFotoAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__9__Impl"


    // $ANTLR start "rule__Postre__Group__10"
    // InternalRestaurante.g:3213:1: rule__Postre__Group__10 : rule__Postre__Group__10__Impl rule__Postre__Group__11 ;
    public final void rule__Postre__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3217:1: ( rule__Postre__Group__10__Impl rule__Postre__Group__11 )
            // InternalRestaurante.g:3218:2: rule__Postre__Group__10__Impl rule__Postre__Group__11
            {
            pushFollow(FOLLOW_31);
            rule__Postre__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__10"


    // $ANTLR start "rule__Postre__Group__10__Impl"
    // InternalRestaurante.g:3225:1: rule__Postre__Group__10__Impl : ( ( rule__Postre__Group_10__0 )? ) ;
    public final void rule__Postre__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3229:1: ( ( ( rule__Postre__Group_10__0 )? ) )
            // InternalRestaurante.g:3230:1: ( ( rule__Postre__Group_10__0 )? )
            {
            // InternalRestaurante.g:3230:1: ( ( rule__Postre__Group_10__0 )? )
            // InternalRestaurante.g:3231:2: ( rule__Postre__Group_10__0 )?
            {
             before(grammarAccess.getPostreAccess().getGroup_10()); 
            // InternalRestaurante.g:3232:2: ( rule__Postre__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRestaurante.g:3232:3: rule__Postre__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Postre__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPostreAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__10__Impl"


    // $ANTLR start "rule__Postre__Group__11"
    // InternalRestaurante.g:3240:1: rule__Postre__Group__11 : rule__Postre__Group__11__Impl rule__Postre__Group__12 ;
    public final void rule__Postre__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3244:1: ( rule__Postre__Group__11__Impl rule__Postre__Group__12 )
            // InternalRestaurante.g:3245:2: rule__Postre__Group__11__Impl rule__Postre__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__Postre__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__11"


    // $ANTLR start "rule__Postre__Group__11__Impl"
    // InternalRestaurante.g:3252:1: rule__Postre__Group__11__Impl : ( ( rule__Postre__Group_11__0 )? ) ;
    public final void rule__Postre__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3256:1: ( ( ( rule__Postre__Group_11__0 )? ) )
            // InternalRestaurante.g:3257:1: ( ( rule__Postre__Group_11__0 )? )
            {
            // InternalRestaurante.g:3257:1: ( ( rule__Postre__Group_11__0 )? )
            // InternalRestaurante.g:3258:2: ( rule__Postre__Group_11__0 )?
            {
             before(grammarAccess.getPostreAccess().getGroup_11()); 
            // InternalRestaurante.g:3259:2: ( rule__Postre__Group_11__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRestaurante.g:3259:3: rule__Postre__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Postre__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPostreAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__11__Impl"


    // $ANTLR start "rule__Postre__Group__12"
    // InternalRestaurante.g:3267:1: rule__Postre__Group__12 : rule__Postre__Group__12__Impl ;
    public final void rule__Postre__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3271:1: ( rule__Postre__Group__12__Impl )
            // InternalRestaurante.g:3272:2: rule__Postre__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postre__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__12"


    // $ANTLR start "rule__Postre__Group__12__Impl"
    // InternalRestaurante.g:3278:1: rule__Postre__Group__12__Impl : ( '}' ) ;
    public final void rule__Postre__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3282:1: ( ( '}' ) )
            // InternalRestaurante.g:3283:1: ( '}' )
            {
            // InternalRestaurante.g:3283:1: ( '}' )
            // InternalRestaurante.g:3284:2: '}'
            {
             before(grammarAccess.getPostreAccess().getRightCurlyBracketKeyword_12()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group__12__Impl"


    // $ANTLR start "rule__Postre__Group_7__0"
    // InternalRestaurante.g:3294:1: rule__Postre__Group_7__0 : rule__Postre__Group_7__0__Impl rule__Postre__Group_7__1 ;
    public final void rule__Postre__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3298:1: ( rule__Postre__Group_7__0__Impl rule__Postre__Group_7__1 )
            // InternalRestaurante.g:3299:2: rule__Postre__Group_7__0__Impl rule__Postre__Group_7__1
            {
            pushFollow(FOLLOW_28);
            rule__Postre__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_7__0"


    // $ANTLR start "rule__Postre__Group_7__0__Impl"
    // InternalRestaurante.g:3306:1: rule__Postre__Group_7__0__Impl : ( 'Distribuidor:' ) ;
    public final void rule__Postre__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3310:1: ( ( 'Distribuidor:' ) )
            // InternalRestaurante.g:3311:1: ( 'Distribuidor:' )
            {
            // InternalRestaurante.g:3311:1: ( 'Distribuidor:' )
            // InternalRestaurante.g:3312:2: 'Distribuidor:'
            {
             before(grammarAccess.getPostreAccess().getDistribuidorKeyword_7_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getDistribuidorKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_7__0__Impl"


    // $ANTLR start "rule__Postre__Group_7__1"
    // InternalRestaurante.g:3321:1: rule__Postre__Group_7__1 : rule__Postre__Group_7__1__Impl ;
    public final void rule__Postre__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3325:1: ( rule__Postre__Group_7__1__Impl )
            // InternalRestaurante.g:3326:2: rule__Postre__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postre__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_7__1"


    // $ANTLR start "rule__Postre__Group_7__1__Impl"
    // InternalRestaurante.g:3332:1: rule__Postre__Group_7__1__Impl : ( ( rule__Postre__DistribuidorAssignment_7_1 ) ) ;
    public final void rule__Postre__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3336:1: ( ( ( rule__Postre__DistribuidorAssignment_7_1 ) ) )
            // InternalRestaurante.g:3337:1: ( ( rule__Postre__DistribuidorAssignment_7_1 ) )
            {
            // InternalRestaurante.g:3337:1: ( ( rule__Postre__DistribuidorAssignment_7_1 ) )
            // InternalRestaurante.g:3338:2: ( rule__Postre__DistribuidorAssignment_7_1 )
            {
             before(grammarAccess.getPostreAccess().getDistribuidorAssignment_7_1()); 
            // InternalRestaurante.g:3339:2: ( rule__Postre__DistribuidorAssignment_7_1 )
            // InternalRestaurante.g:3339:3: rule__Postre__DistribuidorAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Postre__DistribuidorAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPostreAccess().getDistribuidorAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_7__1__Impl"


    // $ANTLR start "rule__Postre__Group_10__0"
    // InternalRestaurante.g:3348:1: rule__Postre__Group_10__0 : rule__Postre__Group_10__0__Impl rule__Postre__Group_10__1 ;
    public final void rule__Postre__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3352:1: ( rule__Postre__Group_10__0__Impl rule__Postre__Group_10__1 )
            // InternalRestaurante.g:3353:2: rule__Postre__Group_10__0__Impl rule__Postre__Group_10__1
            {
            pushFollow(FOLLOW_16);
            rule__Postre__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_10__0"


    // $ANTLR start "rule__Postre__Group_10__0__Impl"
    // InternalRestaurante.g:3360:1: rule__Postre__Group_10__0__Impl : ( 'Ingredientes:' ) ;
    public final void rule__Postre__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3364:1: ( ( 'Ingredientes:' ) )
            // InternalRestaurante.g:3365:1: ( 'Ingredientes:' )
            {
            // InternalRestaurante.g:3365:1: ( 'Ingredientes:' )
            // InternalRestaurante.g:3366:2: 'Ingredientes:'
            {
             before(grammarAccess.getPostreAccess().getIngredientesKeyword_10_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getIngredientesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_10__0__Impl"


    // $ANTLR start "rule__Postre__Group_10__1"
    // InternalRestaurante.g:3375:1: rule__Postre__Group_10__1 : rule__Postre__Group_10__1__Impl rule__Postre__Group_10__2 ;
    public final void rule__Postre__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3379:1: ( rule__Postre__Group_10__1__Impl rule__Postre__Group_10__2 )
            // InternalRestaurante.g:3380:2: rule__Postre__Group_10__1__Impl rule__Postre__Group_10__2
            {
            pushFollow(FOLLOW_25);
            rule__Postre__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_10__1"


    // $ANTLR start "rule__Postre__Group_10__1__Impl"
    // InternalRestaurante.g:3387:1: rule__Postre__Group_10__1__Impl : ( ( rule__Postre__IngredientesAssignment_10_1 ) ) ;
    public final void rule__Postre__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3391:1: ( ( ( rule__Postre__IngredientesAssignment_10_1 ) ) )
            // InternalRestaurante.g:3392:1: ( ( rule__Postre__IngredientesAssignment_10_1 ) )
            {
            // InternalRestaurante.g:3392:1: ( ( rule__Postre__IngredientesAssignment_10_1 ) )
            // InternalRestaurante.g:3393:2: ( rule__Postre__IngredientesAssignment_10_1 )
            {
             before(grammarAccess.getPostreAccess().getIngredientesAssignment_10_1()); 
            // InternalRestaurante.g:3394:2: ( rule__Postre__IngredientesAssignment_10_1 )
            // InternalRestaurante.g:3394:3: rule__Postre__IngredientesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Postre__IngredientesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getPostreAccess().getIngredientesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_10__1__Impl"


    // $ANTLR start "rule__Postre__Group_10__2"
    // InternalRestaurante.g:3402:1: rule__Postre__Group_10__2 : rule__Postre__Group_10__2__Impl ;
    public final void rule__Postre__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3406:1: ( rule__Postre__Group_10__2__Impl )
            // InternalRestaurante.g:3407:2: rule__Postre__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postre__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_10__2"


    // $ANTLR start "rule__Postre__Group_10__2__Impl"
    // InternalRestaurante.g:3413:1: rule__Postre__Group_10__2__Impl : ( ( rule__Postre__Group_10_2__0 )* ) ;
    public final void rule__Postre__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3417:1: ( ( ( rule__Postre__Group_10_2__0 )* ) )
            // InternalRestaurante.g:3418:1: ( ( rule__Postre__Group_10_2__0 )* )
            {
            // InternalRestaurante.g:3418:1: ( ( rule__Postre__Group_10_2__0 )* )
            // InternalRestaurante.g:3419:2: ( rule__Postre__Group_10_2__0 )*
            {
             before(grammarAccess.getPostreAccess().getGroup_10_2()); 
            // InternalRestaurante.g:3420:2: ( rule__Postre__Group_10_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRestaurante.g:3420:3: rule__Postre__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Postre__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getPostreAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_10__2__Impl"


    // $ANTLR start "rule__Postre__Group_10_2__0"
    // InternalRestaurante.g:3429:1: rule__Postre__Group_10_2__0 : rule__Postre__Group_10_2__0__Impl rule__Postre__Group_10_2__1 ;
    public final void rule__Postre__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3433:1: ( rule__Postre__Group_10_2__0__Impl rule__Postre__Group_10_2__1 )
            // InternalRestaurante.g:3434:2: rule__Postre__Group_10_2__0__Impl rule__Postre__Group_10_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Postre__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_10_2__0"


    // $ANTLR start "rule__Postre__Group_10_2__0__Impl"
    // InternalRestaurante.g:3441:1: rule__Postre__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__Postre__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3445:1: ( ( ',' ) )
            // InternalRestaurante.g:3446:1: ( ',' )
            {
            // InternalRestaurante.g:3446:1: ( ',' )
            // InternalRestaurante.g:3447:2: ','
            {
             before(grammarAccess.getPostreAccess().getCommaKeyword_10_2_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getCommaKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_10_2__0__Impl"


    // $ANTLR start "rule__Postre__Group_10_2__1"
    // InternalRestaurante.g:3456:1: rule__Postre__Group_10_2__1 : rule__Postre__Group_10_2__1__Impl ;
    public final void rule__Postre__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3460:1: ( rule__Postre__Group_10_2__1__Impl )
            // InternalRestaurante.g:3461:2: rule__Postre__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postre__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_10_2__1"


    // $ANTLR start "rule__Postre__Group_10_2__1__Impl"
    // InternalRestaurante.g:3467:1: rule__Postre__Group_10_2__1__Impl : ( ( rule__Postre__IngredientesAssignment_10_2_1 ) ) ;
    public final void rule__Postre__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3471:1: ( ( ( rule__Postre__IngredientesAssignment_10_2_1 ) ) )
            // InternalRestaurante.g:3472:1: ( ( rule__Postre__IngredientesAssignment_10_2_1 ) )
            {
            // InternalRestaurante.g:3472:1: ( ( rule__Postre__IngredientesAssignment_10_2_1 ) )
            // InternalRestaurante.g:3473:2: ( rule__Postre__IngredientesAssignment_10_2_1 )
            {
             before(grammarAccess.getPostreAccess().getIngredientesAssignment_10_2_1()); 
            // InternalRestaurante.g:3474:2: ( rule__Postre__IngredientesAssignment_10_2_1 )
            // InternalRestaurante.g:3474:3: rule__Postre__IngredientesAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Postre__IngredientesAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPostreAccess().getIngredientesAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_10_2__1__Impl"


    // $ANTLR start "rule__Postre__Group_11__0"
    // InternalRestaurante.g:3483:1: rule__Postre__Group_11__0 : rule__Postre__Group_11__0__Impl rule__Postre__Group_11__1 ;
    public final void rule__Postre__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3487:1: ( rule__Postre__Group_11__0__Impl rule__Postre__Group_11__1 )
            // InternalRestaurante.g:3488:2: rule__Postre__Group_11__0__Impl rule__Postre__Group_11__1
            {
            pushFollow(FOLLOW_7);
            rule__Postre__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postre__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_11__0"


    // $ANTLR start "rule__Postre__Group_11__0__Impl"
    // InternalRestaurante.g:3495:1: rule__Postre__Group_11__0__Impl : ( 'Nutricional' ) ;
    public final void rule__Postre__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3499:1: ( ( 'Nutricional' ) )
            // InternalRestaurante.g:3500:1: ( 'Nutricional' )
            {
            // InternalRestaurante.g:3500:1: ( 'Nutricional' )
            // InternalRestaurante.g:3501:2: 'Nutricional'
            {
             before(grammarAccess.getPostreAccess().getNutricionalKeyword_11_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getNutricionalKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_11__0__Impl"


    // $ANTLR start "rule__Postre__Group_11__1"
    // InternalRestaurante.g:3510:1: rule__Postre__Group_11__1 : rule__Postre__Group_11__1__Impl ;
    public final void rule__Postre__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3514:1: ( rule__Postre__Group_11__1__Impl )
            // InternalRestaurante.g:3515:2: rule__Postre__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postre__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_11__1"


    // $ANTLR start "rule__Postre__Group_11__1__Impl"
    // InternalRestaurante.g:3521:1: rule__Postre__Group_11__1__Impl : ( ( rule__Postre__NutricionalAssignment_11_1 ) ) ;
    public final void rule__Postre__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3525:1: ( ( ( rule__Postre__NutricionalAssignment_11_1 ) ) )
            // InternalRestaurante.g:3526:1: ( ( rule__Postre__NutricionalAssignment_11_1 ) )
            {
            // InternalRestaurante.g:3526:1: ( ( rule__Postre__NutricionalAssignment_11_1 ) )
            // InternalRestaurante.g:3527:2: ( rule__Postre__NutricionalAssignment_11_1 )
            {
             before(grammarAccess.getPostreAccess().getNutricionalAssignment_11_1()); 
            // InternalRestaurante.g:3528:2: ( rule__Postre__NutricionalAssignment_11_1 )
            // InternalRestaurante.g:3528:3: rule__Postre__NutricionalAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Postre__NutricionalAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getPostreAccess().getNutricionalAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__Group_11__1__Impl"


    // $ANTLR start "rule__Nutricional__Group__0"
    // InternalRestaurante.g:3537:1: rule__Nutricional__Group__0 : rule__Nutricional__Group__0__Impl rule__Nutricional__Group__1 ;
    public final void rule__Nutricional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3541:1: ( rule__Nutricional__Group__0__Impl rule__Nutricional__Group__1 )
            // InternalRestaurante.g:3542:2: rule__Nutricional__Group__0__Impl rule__Nutricional__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Nutricional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__0"


    // $ANTLR start "rule__Nutricional__Group__0__Impl"
    // InternalRestaurante.g:3549:1: rule__Nutricional__Group__0__Impl : ( '{' ) ;
    public final void rule__Nutricional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3553:1: ( ( '{' ) )
            // InternalRestaurante.g:3554:1: ( '{' )
            {
            // InternalRestaurante.g:3554:1: ( '{' )
            // InternalRestaurante.g:3555:2: '{'
            {
             before(grammarAccess.getNutricionalAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getNutricionalAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__0__Impl"


    // $ANTLR start "rule__Nutricional__Group__1"
    // InternalRestaurante.g:3564:1: rule__Nutricional__Group__1 : rule__Nutricional__Group__1__Impl rule__Nutricional__Group__2 ;
    public final void rule__Nutricional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3568:1: ( rule__Nutricional__Group__1__Impl rule__Nutricional__Group__2 )
            // InternalRestaurante.g:3569:2: rule__Nutricional__Group__1__Impl rule__Nutricional__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Nutricional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__1"


    // $ANTLR start "rule__Nutricional__Group__1__Impl"
    // InternalRestaurante.g:3576:1: rule__Nutricional__Group__1__Impl : ( 'cantidad:' ) ;
    public final void rule__Nutricional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3580:1: ( ( 'cantidad:' ) )
            // InternalRestaurante.g:3581:1: ( 'cantidad:' )
            {
            // InternalRestaurante.g:3581:1: ( 'cantidad:' )
            // InternalRestaurante.g:3582:2: 'cantidad:'
            {
             before(grammarAccess.getNutricionalAccess().getCantidadKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getNutricionalAccess().getCantidadKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__1__Impl"


    // $ANTLR start "rule__Nutricional__Group__2"
    // InternalRestaurante.g:3591:1: rule__Nutricional__Group__2 : rule__Nutricional__Group__2__Impl rule__Nutricional__Group__3 ;
    public final void rule__Nutricional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3595:1: ( rule__Nutricional__Group__2__Impl rule__Nutricional__Group__3 )
            // InternalRestaurante.g:3596:2: rule__Nutricional__Group__2__Impl rule__Nutricional__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Nutricional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__2"


    // $ANTLR start "rule__Nutricional__Group__2__Impl"
    // InternalRestaurante.g:3603:1: rule__Nutricional__Group__2__Impl : ( ( rule__Nutricional__CantidadAssignment_2 ) ) ;
    public final void rule__Nutricional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3607:1: ( ( ( rule__Nutricional__CantidadAssignment_2 ) ) )
            // InternalRestaurante.g:3608:1: ( ( rule__Nutricional__CantidadAssignment_2 ) )
            {
            // InternalRestaurante.g:3608:1: ( ( rule__Nutricional__CantidadAssignment_2 ) )
            // InternalRestaurante.g:3609:2: ( rule__Nutricional__CantidadAssignment_2 )
            {
             before(grammarAccess.getNutricionalAccess().getCantidadAssignment_2()); 
            // InternalRestaurante.g:3610:2: ( rule__Nutricional__CantidadAssignment_2 )
            // InternalRestaurante.g:3610:3: rule__Nutricional__CantidadAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Nutricional__CantidadAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNutricionalAccess().getCantidadAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__2__Impl"


    // $ANTLR start "rule__Nutricional__Group__3"
    // InternalRestaurante.g:3618:1: rule__Nutricional__Group__3 : rule__Nutricional__Group__3__Impl rule__Nutricional__Group__4 ;
    public final void rule__Nutricional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3622:1: ( rule__Nutricional__Group__3__Impl rule__Nutricional__Group__4 )
            // InternalRestaurante.g:3623:2: rule__Nutricional__Group__3__Impl rule__Nutricional__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Nutricional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__3"


    // $ANTLR start "rule__Nutricional__Group__3__Impl"
    // InternalRestaurante.g:3630:1: rule__Nutricional__Group__3__Impl : ( 'medida:' ) ;
    public final void rule__Nutricional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3634:1: ( ( 'medida:' ) )
            // InternalRestaurante.g:3635:1: ( 'medida:' )
            {
            // InternalRestaurante.g:3635:1: ( 'medida:' )
            // InternalRestaurante.g:3636:2: 'medida:'
            {
             before(grammarAccess.getNutricionalAccess().getMedidaKeyword_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getNutricionalAccess().getMedidaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__3__Impl"


    // $ANTLR start "rule__Nutricional__Group__4"
    // InternalRestaurante.g:3645:1: rule__Nutricional__Group__4 : rule__Nutricional__Group__4__Impl rule__Nutricional__Group__5 ;
    public final void rule__Nutricional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3649:1: ( rule__Nutricional__Group__4__Impl rule__Nutricional__Group__5 )
            // InternalRestaurante.g:3650:2: rule__Nutricional__Group__4__Impl rule__Nutricional__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Nutricional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__4"


    // $ANTLR start "rule__Nutricional__Group__4__Impl"
    // InternalRestaurante.g:3657:1: rule__Nutricional__Group__4__Impl : ( ( rule__Nutricional__UnidadAssignment_4 ) ) ;
    public final void rule__Nutricional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3661:1: ( ( ( rule__Nutricional__UnidadAssignment_4 ) ) )
            // InternalRestaurante.g:3662:1: ( ( rule__Nutricional__UnidadAssignment_4 ) )
            {
            // InternalRestaurante.g:3662:1: ( ( rule__Nutricional__UnidadAssignment_4 ) )
            // InternalRestaurante.g:3663:2: ( rule__Nutricional__UnidadAssignment_4 )
            {
             before(grammarAccess.getNutricionalAccess().getUnidadAssignment_4()); 
            // InternalRestaurante.g:3664:2: ( rule__Nutricional__UnidadAssignment_4 )
            // InternalRestaurante.g:3664:3: rule__Nutricional__UnidadAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Nutricional__UnidadAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNutricionalAccess().getUnidadAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__4__Impl"


    // $ANTLR start "rule__Nutricional__Group__5"
    // InternalRestaurante.g:3672:1: rule__Nutricional__Group__5 : rule__Nutricional__Group__5__Impl rule__Nutricional__Group__6 ;
    public final void rule__Nutricional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3676:1: ( rule__Nutricional__Group__5__Impl rule__Nutricional__Group__6 )
            // InternalRestaurante.g:3677:2: rule__Nutricional__Group__5__Impl rule__Nutricional__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Nutricional__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__5"


    // $ANTLR start "rule__Nutricional__Group__5__Impl"
    // InternalRestaurante.g:3684:1: rule__Nutricional__Group__5__Impl : ( 'energia:' ) ;
    public final void rule__Nutricional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3688:1: ( ( 'energia:' ) )
            // InternalRestaurante.g:3689:1: ( 'energia:' )
            {
            // InternalRestaurante.g:3689:1: ( 'energia:' )
            // InternalRestaurante.g:3690:2: 'energia:'
            {
             before(grammarAccess.getNutricionalAccess().getEnergiaKeyword_5()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getNutricionalAccess().getEnergiaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__5__Impl"


    // $ANTLR start "rule__Nutricional__Group__6"
    // InternalRestaurante.g:3699:1: rule__Nutricional__Group__6 : rule__Nutricional__Group__6__Impl rule__Nutricional__Group__7 ;
    public final void rule__Nutricional__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3703:1: ( rule__Nutricional__Group__6__Impl rule__Nutricional__Group__7 )
            // InternalRestaurante.g:3704:2: rule__Nutricional__Group__6__Impl rule__Nutricional__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__Nutricional__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__6"


    // $ANTLR start "rule__Nutricional__Group__6__Impl"
    // InternalRestaurante.g:3711:1: rule__Nutricional__Group__6__Impl : ( ( rule__Nutricional__EnergiaAssignment_6 ) ) ;
    public final void rule__Nutricional__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3715:1: ( ( ( rule__Nutricional__EnergiaAssignment_6 ) ) )
            // InternalRestaurante.g:3716:1: ( ( rule__Nutricional__EnergiaAssignment_6 ) )
            {
            // InternalRestaurante.g:3716:1: ( ( rule__Nutricional__EnergiaAssignment_6 ) )
            // InternalRestaurante.g:3717:2: ( rule__Nutricional__EnergiaAssignment_6 )
            {
             before(grammarAccess.getNutricionalAccess().getEnergiaAssignment_6()); 
            // InternalRestaurante.g:3718:2: ( rule__Nutricional__EnergiaAssignment_6 )
            // InternalRestaurante.g:3718:3: rule__Nutricional__EnergiaAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Nutricional__EnergiaAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getNutricionalAccess().getEnergiaAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__6__Impl"


    // $ANTLR start "rule__Nutricional__Group__7"
    // InternalRestaurante.g:3726:1: rule__Nutricional__Group__7 : rule__Nutricional__Group__7__Impl rule__Nutricional__Group__8 ;
    public final void rule__Nutricional__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3730:1: ( rule__Nutricional__Group__7__Impl rule__Nutricional__Group__8 )
            // InternalRestaurante.g:3731:2: rule__Nutricional__Group__7__Impl rule__Nutricional__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__Nutricional__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__7"


    // $ANTLR start "rule__Nutricional__Group__7__Impl"
    // InternalRestaurante.g:3738:1: rule__Nutricional__Group__7__Impl : ( 'grasas:' ) ;
    public final void rule__Nutricional__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3742:1: ( ( 'grasas:' ) )
            // InternalRestaurante.g:3743:1: ( 'grasas:' )
            {
            // InternalRestaurante.g:3743:1: ( 'grasas:' )
            // InternalRestaurante.g:3744:2: 'grasas:'
            {
             before(grammarAccess.getNutricionalAccess().getGrasasKeyword_7()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getNutricionalAccess().getGrasasKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__7__Impl"


    // $ANTLR start "rule__Nutricional__Group__8"
    // InternalRestaurante.g:3753:1: rule__Nutricional__Group__8 : rule__Nutricional__Group__8__Impl rule__Nutricional__Group__9 ;
    public final void rule__Nutricional__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3757:1: ( rule__Nutricional__Group__8__Impl rule__Nutricional__Group__9 )
            // InternalRestaurante.g:3758:2: rule__Nutricional__Group__8__Impl rule__Nutricional__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__Nutricional__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__8"


    // $ANTLR start "rule__Nutricional__Group__8__Impl"
    // InternalRestaurante.g:3765:1: rule__Nutricional__Group__8__Impl : ( ( rule__Nutricional__GrasasAssignment_8 ) ) ;
    public final void rule__Nutricional__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3769:1: ( ( ( rule__Nutricional__GrasasAssignment_8 ) ) )
            // InternalRestaurante.g:3770:1: ( ( rule__Nutricional__GrasasAssignment_8 ) )
            {
            // InternalRestaurante.g:3770:1: ( ( rule__Nutricional__GrasasAssignment_8 ) )
            // InternalRestaurante.g:3771:2: ( rule__Nutricional__GrasasAssignment_8 )
            {
             before(grammarAccess.getNutricionalAccess().getGrasasAssignment_8()); 
            // InternalRestaurante.g:3772:2: ( rule__Nutricional__GrasasAssignment_8 )
            // InternalRestaurante.g:3772:3: rule__Nutricional__GrasasAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Nutricional__GrasasAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getNutricionalAccess().getGrasasAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__8__Impl"


    // $ANTLR start "rule__Nutricional__Group__9"
    // InternalRestaurante.g:3780:1: rule__Nutricional__Group__9 : rule__Nutricional__Group__9__Impl rule__Nutricional__Group__10 ;
    public final void rule__Nutricional__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3784:1: ( rule__Nutricional__Group__9__Impl rule__Nutricional__Group__10 )
            // InternalRestaurante.g:3785:2: rule__Nutricional__Group__9__Impl rule__Nutricional__Group__10
            {
            pushFollow(FOLLOW_33);
            rule__Nutricional__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__9"


    // $ANTLR start "rule__Nutricional__Group__9__Impl"
    // InternalRestaurante.g:3792:1: rule__Nutricional__Group__9__Impl : ( 'hidratos:' ) ;
    public final void rule__Nutricional__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3796:1: ( ( 'hidratos:' ) )
            // InternalRestaurante.g:3797:1: ( 'hidratos:' )
            {
            // InternalRestaurante.g:3797:1: ( 'hidratos:' )
            // InternalRestaurante.g:3798:2: 'hidratos:'
            {
             before(grammarAccess.getNutricionalAccess().getHidratosKeyword_9()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getNutricionalAccess().getHidratosKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__9__Impl"


    // $ANTLR start "rule__Nutricional__Group__10"
    // InternalRestaurante.g:3807:1: rule__Nutricional__Group__10 : rule__Nutricional__Group__10__Impl rule__Nutricional__Group__11 ;
    public final void rule__Nutricional__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3811:1: ( rule__Nutricional__Group__10__Impl rule__Nutricional__Group__11 )
            // InternalRestaurante.g:3812:2: rule__Nutricional__Group__10__Impl rule__Nutricional__Group__11
            {
            pushFollow(FOLLOW_38);
            rule__Nutricional__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__10"


    // $ANTLR start "rule__Nutricional__Group__10__Impl"
    // InternalRestaurante.g:3819:1: rule__Nutricional__Group__10__Impl : ( ( rule__Nutricional__HidratosAssignment_10 ) ) ;
    public final void rule__Nutricional__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3823:1: ( ( ( rule__Nutricional__HidratosAssignment_10 ) ) )
            // InternalRestaurante.g:3824:1: ( ( rule__Nutricional__HidratosAssignment_10 ) )
            {
            // InternalRestaurante.g:3824:1: ( ( rule__Nutricional__HidratosAssignment_10 ) )
            // InternalRestaurante.g:3825:2: ( rule__Nutricional__HidratosAssignment_10 )
            {
             before(grammarAccess.getNutricionalAccess().getHidratosAssignment_10()); 
            // InternalRestaurante.g:3826:2: ( rule__Nutricional__HidratosAssignment_10 )
            // InternalRestaurante.g:3826:3: rule__Nutricional__HidratosAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Nutricional__HidratosAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getNutricionalAccess().getHidratosAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__10__Impl"


    // $ANTLR start "rule__Nutricional__Group__11"
    // InternalRestaurante.g:3834:1: rule__Nutricional__Group__11 : rule__Nutricional__Group__11__Impl rule__Nutricional__Group__12 ;
    public final void rule__Nutricional__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3838:1: ( rule__Nutricional__Group__11__Impl rule__Nutricional__Group__12 )
            // InternalRestaurante.g:3839:2: rule__Nutricional__Group__11__Impl rule__Nutricional__Group__12
            {
            pushFollow(FOLLOW_33);
            rule__Nutricional__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__11"


    // $ANTLR start "rule__Nutricional__Group__11__Impl"
    // InternalRestaurante.g:3846:1: rule__Nutricional__Group__11__Impl : ( 'proteinas:' ) ;
    public final void rule__Nutricional__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3850:1: ( ( 'proteinas:' ) )
            // InternalRestaurante.g:3851:1: ( 'proteinas:' )
            {
            // InternalRestaurante.g:3851:1: ( 'proteinas:' )
            // InternalRestaurante.g:3852:2: 'proteinas:'
            {
             before(grammarAccess.getNutricionalAccess().getProteinasKeyword_11()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getNutricionalAccess().getProteinasKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__11__Impl"


    // $ANTLR start "rule__Nutricional__Group__12"
    // InternalRestaurante.g:3861:1: rule__Nutricional__Group__12 : rule__Nutricional__Group__12__Impl rule__Nutricional__Group__13 ;
    public final void rule__Nutricional__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3865:1: ( rule__Nutricional__Group__12__Impl rule__Nutricional__Group__13 )
            // InternalRestaurante.g:3866:2: rule__Nutricional__Group__12__Impl rule__Nutricional__Group__13
            {
            pushFollow(FOLLOW_39);
            rule__Nutricional__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__12"


    // $ANTLR start "rule__Nutricional__Group__12__Impl"
    // InternalRestaurante.g:3873:1: rule__Nutricional__Group__12__Impl : ( ( rule__Nutricional__ProteinasAssignment_12 ) ) ;
    public final void rule__Nutricional__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3877:1: ( ( ( rule__Nutricional__ProteinasAssignment_12 ) ) )
            // InternalRestaurante.g:3878:1: ( ( rule__Nutricional__ProteinasAssignment_12 ) )
            {
            // InternalRestaurante.g:3878:1: ( ( rule__Nutricional__ProteinasAssignment_12 ) )
            // InternalRestaurante.g:3879:2: ( rule__Nutricional__ProteinasAssignment_12 )
            {
             before(grammarAccess.getNutricionalAccess().getProteinasAssignment_12()); 
            // InternalRestaurante.g:3880:2: ( rule__Nutricional__ProteinasAssignment_12 )
            // InternalRestaurante.g:3880:3: rule__Nutricional__ProteinasAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Nutricional__ProteinasAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getNutricionalAccess().getProteinasAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__12__Impl"


    // $ANTLR start "rule__Nutricional__Group__13"
    // InternalRestaurante.g:3888:1: rule__Nutricional__Group__13 : rule__Nutricional__Group__13__Impl rule__Nutricional__Group__14 ;
    public final void rule__Nutricional__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3892:1: ( rule__Nutricional__Group__13__Impl rule__Nutricional__Group__14 )
            // InternalRestaurante.g:3893:2: rule__Nutricional__Group__13__Impl rule__Nutricional__Group__14
            {
            pushFollow(FOLLOW_33);
            rule__Nutricional__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__13"


    // $ANTLR start "rule__Nutricional__Group__13__Impl"
    // InternalRestaurante.g:3900:1: rule__Nutricional__Group__13__Impl : ( 'sal:' ) ;
    public final void rule__Nutricional__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3904:1: ( ( 'sal:' ) )
            // InternalRestaurante.g:3905:1: ( 'sal:' )
            {
            // InternalRestaurante.g:3905:1: ( 'sal:' )
            // InternalRestaurante.g:3906:2: 'sal:'
            {
             before(grammarAccess.getNutricionalAccess().getSalKeyword_13()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getNutricionalAccess().getSalKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__13__Impl"


    // $ANTLR start "rule__Nutricional__Group__14"
    // InternalRestaurante.g:3915:1: rule__Nutricional__Group__14 : rule__Nutricional__Group__14__Impl rule__Nutricional__Group__15 ;
    public final void rule__Nutricional__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3919:1: ( rule__Nutricional__Group__14__Impl rule__Nutricional__Group__15 )
            // InternalRestaurante.g:3920:2: rule__Nutricional__Group__14__Impl rule__Nutricional__Group__15
            {
            pushFollow(FOLLOW_40);
            rule__Nutricional__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__14"


    // $ANTLR start "rule__Nutricional__Group__14__Impl"
    // InternalRestaurante.g:3927:1: rule__Nutricional__Group__14__Impl : ( ( rule__Nutricional__SalAssignment_14 ) ) ;
    public final void rule__Nutricional__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3931:1: ( ( ( rule__Nutricional__SalAssignment_14 ) ) )
            // InternalRestaurante.g:3932:1: ( ( rule__Nutricional__SalAssignment_14 ) )
            {
            // InternalRestaurante.g:3932:1: ( ( rule__Nutricional__SalAssignment_14 ) )
            // InternalRestaurante.g:3933:2: ( rule__Nutricional__SalAssignment_14 )
            {
             before(grammarAccess.getNutricionalAccess().getSalAssignment_14()); 
            // InternalRestaurante.g:3934:2: ( rule__Nutricional__SalAssignment_14 )
            // InternalRestaurante.g:3934:3: rule__Nutricional__SalAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Nutricional__SalAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getNutricionalAccess().getSalAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__14__Impl"


    // $ANTLR start "rule__Nutricional__Group__15"
    // InternalRestaurante.g:3942:1: rule__Nutricional__Group__15 : rule__Nutricional__Group__15__Impl ;
    public final void rule__Nutricional__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3946:1: ( rule__Nutricional__Group__15__Impl )
            // InternalRestaurante.g:3947:2: rule__Nutricional__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutricional__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__15"


    // $ANTLR start "rule__Nutricional__Group__15__Impl"
    // InternalRestaurante.g:3953:1: rule__Nutricional__Group__15__Impl : ( '}' ) ;
    public final void rule__Nutricional__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3957:1: ( ( '}' ) )
            // InternalRestaurante.g:3958:1: ( '}' )
            {
            // InternalRestaurante.g:3958:1: ( '}' )
            // InternalRestaurante.g:3959:2: '}'
            {
             before(grammarAccess.getNutricionalAccess().getRightCurlyBracketKeyword_15()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNutricionalAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__Group__15__Impl"


    // $ANTLR start "rule__Menu__Group__0"
    // InternalRestaurante.g:3969:1: rule__Menu__Group__0 : rule__Menu__Group__0__Impl rule__Menu__Group__1 ;
    public final void rule__Menu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3973:1: ( rule__Menu__Group__0__Impl rule__Menu__Group__1 )
            // InternalRestaurante.g:3974:2: rule__Menu__Group__0__Impl rule__Menu__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Menu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__0"


    // $ANTLR start "rule__Menu__Group__0__Impl"
    // InternalRestaurante.g:3981:1: rule__Menu__Group__0__Impl : ( 'Menu:' ) ;
    public final void rule__Menu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:3985:1: ( ( 'Menu:' ) )
            // InternalRestaurante.g:3986:1: ( 'Menu:' )
            {
            // InternalRestaurante.g:3986:1: ( 'Menu:' )
            // InternalRestaurante.g:3987:2: 'Menu:'
            {
             before(grammarAccess.getMenuAccess().getMenuKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getMenuKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__0__Impl"


    // $ANTLR start "rule__Menu__Group__1"
    // InternalRestaurante.g:3996:1: rule__Menu__Group__1 : rule__Menu__Group__1__Impl rule__Menu__Group__2 ;
    public final void rule__Menu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4000:1: ( rule__Menu__Group__1__Impl rule__Menu__Group__2 )
            // InternalRestaurante.g:4001:2: rule__Menu__Group__1__Impl rule__Menu__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Menu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__1"


    // $ANTLR start "rule__Menu__Group__1__Impl"
    // InternalRestaurante.g:4008:1: rule__Menu__Group__1__Impl : ( ( rule__Menu__NameAssignment_1 ) ) ;
    public final void rule__Menu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4012:1: ( ( ( rule__Menu__NameAssignment_1 ) ) )
            // InternalRestaurante.g:4013:1: ( ( rule__Menu__NameAssignment_1 ) )
            {
            // InternalRestaurante.g:4013:1: ( ( rule__Menu__NameAssignment_1 ) )
            // InternalRestaurante.g:4014:2: ( rule__Menu__NameAssignment_1 )
            {
             before(grammarAccess.getMenuAccess().getNameAssignment_1()); 
            // InternalRestaurante.g:4015:2: ( rule__Menu__NameAssignment_1 )
            // InternalRestaurante.g:4015:3: rule__Menu__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Menu__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__1__Impl"


    // $ANTLR start "rule__Menu__Group__2"
    // InternalRestaurante.g:4023:1: rule__Menu__Group__2 : rule__Menu__Group__2__Impl rule__Menu__Group__3 ;
    public final void rule__Menu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4027:1: ( rule__Menu__Group__2__Impl rule__Menu__Group__3 )
            // InternalRestaurante.g:4028:2: rule__Menu__Group__2__Impl rule__Menu__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Menu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__2"


    // $ANTLR start "rule__Menu__Group__2__Impl"
    // InternalRestaurante.g:4035:1: rule__Menu__Group__2__Impl : ( ( rule__Menu__NombreAssignment_2 ) ) ;
    public final void rule__Menu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4039:1: ( ( ( rule__Menu__NombreAssignment_2 ) ) )
            // InternalRestaurante.g:4040:1: ( ( rule__Menu__NombreAssignment_2 ) )
            {
            // InternalRestaurante.g:4040:1: ( ( rule__Menu__NombreAssignment_2 ) )
            // InternalRestaurante.g:4041:2: ( rule__Menu__NombreAssignment_2 )
            {
             before(grammarAccess.getMenuAccess().getNombreAssignment_2()); 
            // InternalRestaurante.g:4042:2: ( rule__Menu__NombreAssignment_2 )
            // InternalRestaurante.g:4042:3: rule__Menu__NombreAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Menu__NombreAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getNombreAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__2__Impl"


    // $ANTLR start "rule__Menu__Group__3"
    // InternalRestaurante.g:4050:1: rule__Menu__Group__3 : rule__Menu__Group__3__Impl rule__Menu__Group__4 ;
    public final void rule__Menu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4054:1: ( rule__Menu__Group__3__Impl rule__Menu__Group__4 )
            // InternalRestaurante.g:4055:2: rule__Menu__Group__3__Impl rule__Menu__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Menu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__3"


    // $ANTLR start "rule__Menu__Group__3__Impl"
    // InternalRestaurante.g:4062:1: rule__Menu__Group__3__Impl : ( '{' ) ;
    public final void rule__Menu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4066:1: ( ( '{' ) )
            // InternalRestaurante.g:4067:1: ( '{' )
            {
            // InternalRestaurante.g:4067:1: ( '{' )
            // InternalRestaurante.g:4068:2: '{'
            {
             before(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__3__Impl"


    // $ANTLR start "rule__Menu__Group__4"
    // InternalRestaurante.g:4077:1: rule__Menu__Group__4 : rule__Menu__Group__4__Impl rule__Menu__Group__5 ;
    public final void rule__Menu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4081:1: ( rule__Menu__Group__4__Impl rule__Menu__Group__5 )
            // InternalRestaurante.g:4082:2: rule__Menu__Group__4__Impl rule__Menu__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Menu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__4"


    // $ANTLR start "rule__Menu__Group__4__Impl"
    // InternalRestaurante.g:4089:1: rule__Menu__Group__4__Impl : ( 'Descripcion:' ) ;
    public final void rule__Menu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4093:1: ( ( 'Descripcion:' ) )
            // InternalRestaurante.g:4094:1: ( 'Descripcion:' )
            {
            // InternalRestaurante.g:4094:1: ( 'Descripcion:' )
            // InternalRestaurante.g:4095:2: 'Descripcion:'
            {
             before(grammarAccess.getMenuAccess().getDescripcionKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getDescripcionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__4__Impl"


    // $ANTLR start "rule__Menu__Group__5"
    // InternalRestaurante.g:4104:1: rule__Menu__Group__5 : rule__Menu__Group__5__Impl rule__Menu__Group__6 ;
    public final void rule__Menu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4108:1: ( rule__Menu__Group__5__Impl rule__Menu__Group__6 )
            // InternalRestaurante.g:4109:2: rule__Menu__Group__5__Impl rule__Menu__Group__6
            {
            pushFollow(FOLLOW_41);
            rule__Menu__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__5"


    // $ANTLR start "rule__Menu__Group__5__Impl"
    // InternalRestaurante.g:4116:1: rule__Menu__Group__5__Impl : ( ( rule__Menu__DescripcionAssignment_5 ) ) ;
    public final void rule__Menu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4120:1: ( ( ( rule__Menu__DescripcionAssignment_5 ) ) )
            // InternalRestaurante.g:4121:1: ( ( rule__Menu__DescripcionAssignment_5 ) )
            {
            // InternalRestaurante.g:4121:1: ( ( rule__Menu__DescripcionAssignment_5 ) )
            // InternalRestaurante.g:4122:2: ( rule__Menu__DescripcionAssignment_5 )
            {
             before(grammarAccess.getMenuAccess().getDescripcionAssignment_5()); 
            // InternalRestaurante.g:4123:2: ( rule__Menu__DescripcionAssignment_5 )
            // InternalRestaurante.g:4123:3: rule__Menu__DescripcionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Menu__DescripcionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getDescripcionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__5__Impl"


    // $ANTLR start "rule__Menu__Group__6"
    // InternalRestaurante.g:4131:1: rule__Menu__Group__6 : rule__Menu__Group__6__Impl rule__Menu__Group__7 ;
    public final void rule__Menu__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4135:1: ( rule__Menu__Group__6__Impl rule__Menu__Group__7 )
            // InternalRestaurante.g:4136:2: rule__Menu__Group__6__Impl rule__Menu__Group__7
            {
            pushFollow(FOLLOW_42);
            rule__Menu__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__6"


    // $ANTLR start "rule__Menu__Group__6__Impl"
    // InternalRestaurante.g:4143:1: rule__Menu__Group__6__Impl : ( 'Tama\\u00F1o:' ) ;
    public final void rule__Menu__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4147:1: ( ( 'Tama\\u00F1o:' ) )
            // InternalRestaurante.g:4148:1: ( 'Tama\\u00F1o:' )
            {
            // InternalRestaurante.g:4148:1: ( 'Tama\\u00F1o:' )
            // InternalRestaurante.g:4149:2: 'Tama\\u00F1o:'
            {
             before(grammarAccess.getMenuAccess().getTamaOKeyword_6()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getTamaOKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__6__Impl"


    // $ANTLR start "rule__Menu__Group__7"
    // InternalRestaurante.g:4158:1: rule__Menu__Group__7 : rule__Menu__Group__7__Impl rule__Menu__Group__8 ;
    public final void rule__Menu__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4162:1: ( rule__Menu__Group__7__Impl rule__Menu__Group__8 )
            // InternalRestaurante.g:4163:2: rule__Menu__Group__7__Impl rule__Menu__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Menu__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__7"


    // $ANTLR start "rule__Menu__Group__7__Impl"
    // InternalRestaurante.g:4170:1: rule__Menu__Group__7__Impl : ( ( rule__Menu__TamanioAssignment_7 ) ) ;
    public final void rule__Menu__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4174:1: ( ( ( rule__Menu__TamanioAssignment_7 ) ) )
            // InternalRestaurante.g:4175:1: ( ( rule__Menu__TamanioAssignment_7 ) )
            {
            // InternalRestaurante.g:4175:1: ( ( rule__Menu__TamanioAssignment_7 ) )
            // InternalRestaurante.g:4176:2: ( rule__Menu__TamanioAssignment_7 )
            {
             before(grammarAccess.getMenuAccess().getTamanioAssignment_7()); 
            // InternalRestaurante.g:4177:2: ( rule__Menu__TamanioAssignment_7 )
            // InternalRestaurante.g:4177:3: rule__Menu__TamanioAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Menu__TamanioAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getTamanioAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__7__Impl"


    // $ANTLR start "rule__Menu__Group__8"
    // InternalRestaurante.g:4185:1: rule__Menu__Group__8 : rule__Menu__Group__8__Impl rule__Menu__Group__9 ;
    public final void rule__Menu__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4189:1: ( rule__Menu__Group__8__Impl rule__Menu__Group__9 )
            // InternalRestaurante.g:4190:2: rule__Menu__Group__8__Impl rule__Menu__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Menu__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__8"


    // $ANTLR start "rule__Menu__Group__8__Impl"
    // InternalRestaurante.g:4197:1: rule__Menu__Group__8__Impl : ( 'Foto:' ) ;
    public final void rule__Menu__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4201:1: ( ( 'Foto:' ) )
            // InternalRestaurante.g:4202:1: ( 'Foto:' )
            {
            // InternalRestaurante.g:4202:1: ( 'Foto:' )
            // InternalRestaurante.g:4203:2: 'Foto:'
            {
             before(grammarAccess.getMenuAccess().getFotoKeyword_8()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getFotoKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__8__Impl"


    // $ANTLR start "rule__Menu__Group__9"
    // InternalRestaurante.g:4212:1: rule__Menu__Group__9 : rule__Menu__Group__9__Impl rule__Menu__Group__10 ;
    public final void rule__Menu__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4216:1: ( rule__Menu__Group__9__Impl rule__Menu__Group__10 )
            // InternalRestaurante.g:4217:2: rule__Menu__Group__9__Impl rule__Menu__Group__10
            {
            pushFollow(FOLLOW_43);
            rule__Menu__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__9"


    // $ANTLR start "rule__Menu__Group__9__Impl"
    // InternalRestaurante.g:4224:1: rule__Menu__Group__9__Impl : ( ( rule__Menu__FotoAssignment_9 ) ) ;
    public final void rule__Menu__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4228:1: ( ( ( rule__Menu__FotoAssignment_9 ) ) )
            // InternalRestaurante.g:4229:1: ( ( rule__Menu__FotoAssignment_9 ) )
            {
            // InternalRestaurante.g:4229:1: ( ( rule__Menu__FotoAssignment_9 ) )
            // InternalRestaurante.g:4230:2: ( rule__Menu__FotoAssignment_9 )
            {
             before(grammarAccess.getMenuAccess().getFotoAssignment_9()); 
            // InternalRestaurante.g:4231:2: ( rule__Menu__FotoAssignment_9 )
            // InternalRestaurante.g:4231:3: rule__Menu__FotoAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Menu__FotoAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getFotoAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__9__Impl"


    // $ANTLR start "rule__Menu__Group__10"
    // InternalRestaurante.g:4239:1: rule__Menu__Group__10 : rule__Menu__Group__10__Impl rule__Menu__Group__11 ;
    public final void rule__Menu__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4243:1: ( rule__Menu__Group__10__Impl rule__Menu__Group__11 )
            // InternalRestaurante.g:4244:2: rule__Menu__Group__10__Impl rule__Menu__Group__11
            {
            pushFollow(FOLLOW_43);
            rule__Menu__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__10"


    // $ANTLR start "rule__Menu__Group__10__Impl"
    // InternalRestaurante.g:4251:1: rule__Menu__Group__10__Impl : ( ( rule__Menu__Group_10__0 )? ) ;
    public final void rule__Menu__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4255:1: ( ( ( rule__Menu__Group_10__0 )? ) )
            // InternalRestaurante.g:4256:1: ( ( rule__Menu__Group_10__0 )? )
            {
            // InternalRestaurante.g:4256:1: ( ( rule__Menu__Group_10__0 )? )
            // InternalRestaurante.g:4257:2: ( rule__Menu__Group_10__0 )?
            {
             before(grammarAccess.getMenuAccess().getGroup_10()); 
            // InternalRestaurante.g:4258:2: ( rule__Menu__Group_10__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==60) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRestaurante.g:4258:3: rule__Menu__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Menu__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMenuAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__10__Impl"


    // $ANTLR start "rule__Menu__Group__11"
    // InternalRestaurante.g:4266:1: rule__Menu__Group__11 : rule__Menu__Group__11__Impl ;
    public final void rule__Menu__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4270:1: ( rule__Menu__Group__11__Impl )
            // InternalRestaurante.g:4271:2: rule__Menu__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__11"


    // $ANTLR start "rule__Menu__Group__11__Impl"
    // InternalRestaurante.g:4277:1: rule__Menu__Group__11__Impl : ( '}' ) ;
    public final void rule__Menu__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4281:1: ( ( '}' ) )
            // InternalRestaurante.g:4282:1: ( '}' )
            {
            // InternalRestaurante.g:4282:1: ( '}' )
            // InternalRestaurante.g:4283:2: '}'
            {
             before(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__11__Impl"


    // $ANTLR start "rule__Menu__Group_10__0"
    // InternalRestaurante.g:4293:1: rule__Menu__Group_10__0 : rule__Menu__Group_10__0__Impl rule__Menu__Group_10__1 ;
    public final void rule__Menu__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4297:1: ( rule__Menu__Group_10__0__Impl rule__Menu__Group_10__1 )
            // InternalRestaurante.g:4298:2: rule__Menu__Group_10__0__Impl rule__Menu__Group_10__1
            {
            pushFollow(FOLLOW_44);
            rule__Menu__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_10__0"


    // $ANTLR start "rule__Menu__Group_10__0__Impl"
    // InternalRestaurante.g:4305:1: rule__Menu__Group_10__0__Impl : ( 'Productos:' ) ;
    public final void rule__Menu__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4309:1: ( ( 'Productos:' ) )
            // InternalRestaurante.g:4310:1: ( 'Productos:' )
            {
            // InternalRestaurante.g:4310:1: ( 'Productos:' )
            // InternalRestaurante.g:4311:2: 'Productos:'
            {
             before(grammarAccess.getMenuAccess().getProductosKeyword_10_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getProductosKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_10__0__Impl"


    // $ANTLR start "rule__Menu__Group_10__1"
    // InternalRestaurante.g:4320:1: rule__Menu__Group_10__1 : rule__Menu__Group_10__1__Impl ;
    public final void rule__Menu__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4324:1: ( rule__Menu__Group_10__1__Impl )
            // InternalRestaurante.g:4325:2: rule__Menu__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_10__1"


    // $ANTLR start "rule__Menu__Group_10__1__Impl"
    // InternalRestaurante.g:4331:1: rule__Menu__Group_10__1__Impl : ( ( rule__Menu__ProductosAssignment_10_1 ) ) ;
    public final void rule__Menu__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4335:1: ( ( ( rule__Menu__ProductosAssignment_10_1 ) ) )
            // InternalRestaurante.g:4336:1: ( ( rule__Menu__ProductosAssignment_10_1 ) )
            {
            // InternalRestaurante.g:4336:1: ( ( rule__Menu__ProductosAssignment_10_1 ) )
            // InternalRestaurante.g:4337:2: ( rule__Menu__ProductosAssignment_10_1 )
            {
             before(grammarAccess.getMenuAccess().getProductosAssignment_10_1()); 
            // InternalRestaurante.g:4338:2: ( rule__Menu__ProductosAssignment_10_1 )
            // InternalRestaurante.g:4338:3: rule__Menu__ProductosAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Menu__ProductosAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getProductosAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_10__1__Impl"


    // $ANTLR start "rule__ProductoY__Group__0"
    // InternalRestaurante.g:4347:1: rule__ProductoY__Group__0 : rule__ProductoY__Group__0__Impl rule__ProductoY__Group__1 ;
    public final void rule__ProductoY__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4351:1: ( rule__ProductoY__Group__0__Impl rule__ProductoY__Group__1 )
            // InternalRestaurante.g:4352:2: rule__ProductoY__Group__0__Impl rule__ProductoY__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__ProductoY__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductoY__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoY__Group__0"


    // $ANTLR start "rule__ProductoY__Group__0__Impl"
    // InternalRestaurante.g:4359:1: rule__ProductoY__Group__0__Impl : ( ( rule__ProductoY__IzqAssignment_0 ) ) ;
    public final void rule__ProductoY__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4363:1: ( ( ( rule__ProductoY__IzqAssignment_0 ) ) )
            // InternalRestaurante.g:4364:1: ( ( rule__ProductoY__IzqAssignment_0 ) )
            {
            // InternalRestaurante.g:4364:1: ( ( rule__ProductoY__IzqAssignment_0 ) )
            // InternalRestaurante.g:4365:2: ( rule__ProductoY__IzqAssignment_0 )
            {
             before(grammarAccess.getProductoYAccess().getIzqAssignment_0()); 
            // InternalRestaurante.g:4366:2: ( rule__ProductoY__IzqAssignment_0 )
            // InternalRestaurante.g:4366:3: rule__ProductoY__IzqAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ProductoY__IzqAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProductoYAccess().getIzqAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoY__Group__0__Impl"


    // $ANTLR start "rule__ProductoY__Group__1"
    // InternalRestaurante.g:4374:1: rule__ProductoY__Group__1 : rule__ProductoY__Group__1__Impl ;
    public final void rule__ProductoY__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4378:1: ( rule__ProductoY__Group__1__Impl )
            // InternalRestaurante.g:4379:2: rule__ProductoY__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductoY__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoY__Group__1"


    // $ANTLR start "rule__ProductoY__Group__1__Impl"
    // InternalRestaurante.g:4385:1: rule__ProductoY__Group__1__Impl : ( ( rule__ProductoY__Group_1__0 )* ) ;
    public final void rule__ProductoY__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4389:1: ( ( ( rule__ProductoY__Group_1__0 )* ) )
            // InternalRestaurante.g:4390:1: ( ( rule__ProductoY__Group_1__0 )* )
            {
            // InternalRestaurante.g:4390:1: ( ( rule__ProductoY__Group_1__0 )* )
            // InternalRestaurante.g:4391:2: ( rule__ProductoY__Group_1__0 )*
            {
             before(grammarAccess.getProductoYAccess().getGroup_1()); 
            // InternalRestaurante.g:4392:2: ( rule__ProductoY__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==61) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRestaurante.g:4392:3: rule__ProductoY__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__ProductoY__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getProductoYAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoY__Group__1__Impl"


    // $ANTLR start "rule__ProductoY__Group_1__0"
    // InternalRestaurante.g:4401:1: rule__ProductoY__Group_1__0 : rule__ProductoY__Group_1__0__Impl rule__ProductoY__Group_1__1 ;
    public final void rule__ProductoY__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4405:1: ( rule__ProductoY__Group_1__0__Impl rule__ProductoY__Group_1__1 )
            // InternalRestaurante.g:4406:2: rule__ProductoY__Group_1__0__Impl rule__ProductoY__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__ProductoY__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductoY__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoY__Group_1__0"


    // $ANTLR start "rule__ProductoY__Group_1__0__Impl"
    // InternalRestaurante.g:4413:1: rule__ProductoY__Group_1__0__Impl : ( 'Y' ) ;
    public final void rule__ProductoY__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4417:1: ( ( 'Y' ) )
            // InternalRestaurante.g:4418:1: ( 'Y' )
            {
            // InternalRestaurante.g:4418:1: ( 'Y' )
            // InternalRestaurante.g:4419:2: 'Y'
            {
             before(grammarAccess.getProductoYAccess().getYKeyword_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getProductoYAccess().getYKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoY__Group_1__0__Impl"


    // $ANTLR start "rule__ProductoY__Group_1__1"
    // InternalRestaurante.g:4428:1: rule__ProductoY__Group_1__1 : rule__ProductoY__Group_1__1__Impl ;
    public final void rule__ProductoY__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4432:1: ( rule__ProductoY__Group_1__1__Impl )
            // InternalRestaurante.g:4433:2: rule__ProductoY__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductoY__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoY__Group_1__1"


    // $ANTLR start "rule__ProductoY__Group_1__1__Impl"
    // InternalRestaurante.g:4439:1: rule__ProductoY__Group_1__1__Impl : ( ( rule__ProductoY__DerAssignment_1_1 ) ) ;
    public final void rule__ProductoY__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4443:1: ( ( ( rule__ProductoY__DerAssignment_1_1 ) ) )
            // InternalRestaurante.g:4444:1: ( ( rule__ProductoY__DerAssignment_1_1 ) )
            {
            // InternalRestaurante.g:4444:1: ( ( rule__ProductoY__DerAssignment_1_1 ) )
            // InternalRestaurante.g:4445:2: ( rule__ProductoY__DerAssignment_1_1 )
            {
             before(grammarAccess.getProductoYAccess().getDerAssignment_1_1()); 
            // InternalRestaurante.g:4446:2: ( rule__ProductoY__DerAssignment_1_1 )
            // InternalRestaurante.g:4446:3: rule__ProductoY__DerAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProductoY__DerAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProductoYAccess().getDerAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoY__Group_1__1__Impl"


    // $ANTLR start "rule__ProductoO__Group_1__0"
    // InternalRestaurante.g:4455:1: rule__ProductoO__Group_1__0 : rule__ProductoO__Group_1__0__Impl rule__ProductoO__Group_1__1 ;
    public final void rule__ProductoO__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4459:1: ( rule__ProductoO__Group_1__0__Impl rule__ProductoO__Group_1__1 )
            // InternalRestaurante.g:4460:2: rule__ProductoO__Group_1__0__Impl rule__ProductoO__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ProductoO__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductoO__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1__0"


    // $ANTLR start "rule__ProductoO__Group_1__0__Impl"
    // InternalRestaurante.g:4467:1: rule__ProductoO__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ProductoO__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4471:1: ( ( '(' ) )
            // InternalRestaurante.g:4472:1: ( '(' )
            {
            // InternalRestaurante.g:4472:1: ( '(' )
            // InternalRestaurante.g:4473:2: '('
            {
             before(grammarAccess.getProductoOAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getProductoOAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1__0__Impl"


    // $ANTLR start "rule__ProductoO__Group_1__1"
    // InternalRestaurante.g:4482:1: rule__ProductoO__Group_1__1 : rule__ProductoO__Group_1__1__Impl rule__ProductoO__Group_1__2 ;
    public final void rule__ProductoO__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4486:1: ( rule__ProductoO__Group_1__1__Impl rule__ProductoO__Group_1__2 )
            // InternalRestaurante.g:4487:2: rule__ProductoO__Group_1__1__Impl rule__ProductoO__Group_1__2
            {
            pushFollow(FOLLOW_47);
            rule__ProductoO__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductoO__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1__1"


    // $ANTLR start "rule__ProductoO__Group_1__1__Impl"
    // InternalRestaurante.g:4494:1: rule__ProductoO__Group_1__1__Impl : ( ( rule__ProductoO__IzqAssignment_1_1 ) ) ;
    public final void rule__ProductoO__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4498:1: ( ( ( rule__ProductoO__IzqAssignment_1_1 ) ) )
            // InternalRestaurante.g:4499:1: ( ( rule__ProductoO__IzqAssignment_1_1 ) )
            {
            // InternalRestaurante.g:4499:1: ( ( rule__ProductoO__IzqAssignment_1_1 ) )
            // InternalRestaurante.g:4500:2: ( rule__ProductoO__IzqAssignment_1_1 )
            {
             before(grammarAccess.getProductoOAccess().getIzqAssignment_1_1()); 
            // InternalRestaurante.g:4501:2: ( rule__ProductoO__IzqAssignment_1_1 )
            // InternalRestaurante.g:4501:3: rule__ProductoO__IzqAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ProductoO__IzqAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProductoOAccess().getIzqAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1__1__Impl"


    // $ANTLR start "rule__ProductoO__Group_1__2"
    // InternalRestaurante.g:4509:1: rule__ProductoO__Group_1__2 : rule__ProductoO__Group_1__2__Impl rule__ProductoO__Group_1__3 ;
    public final void rule__ProductoO__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4513:1: ( rule__ProductoO__Group_1__2__Impl rule__ProductoO__Group_1__3 )
            // InternalRestaurante.g:4514:2: rule__ProductoO__Group_1__2__Impl rule__ProductoO__Group_1__3
            {
            pushFollow(FOLLOW_47);
            rule__ProductoO__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductoO__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1__2"


    // $ANTLR start "rule__ProductoO__Group_1__2__Impl"
    // InternalRestaurante.g:4521:1: rule__ProductoO__Group_1__2__Impl : ( ( rule__ProductoO__Group_1_2__0 )* ) ;
    public final void rule__ProductoO__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4525:1: ( ( ( rule__ProductoO__Group_1_2__0 )* ) )
            // InternalRestaurante.g:4526:1: ( ( rule__ProductoO__Group_1_2__0 )* )
            {
            // InternalRestaurante.g:4526:1: ( ( rule__ProductoO__Group_1_2__0 )* )
            // InternalRestaurante.g:4527:2: ( rule__ProductoO__Group_1_2__0 )*
            {
             before(grammarAccess.getProductoOAccess().getGroup_1_2()); 
            // InternalRestaurante.g:4528:2: ( rule__ProductoO__Group_1_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==64) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRestaurante.g:4528:3: rule__ProductoO__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__ProductoO__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getProductoOAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1__2__Impl"


    // $ANTLR start "rule__ProductoO__Group_1__3"
    // InternalRestaurante.g:4536:1: rule__ProductoO__Group_1__3 : rule__ProductoO__Group_1__3__Impl ;
    public final void rule__ProductoO__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4540:1: ( rule__ProductoO__Group_1__3__Impl )
            // InternalRestaurante.g:4541:2: rule__ProductoO__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductoO__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1__3"


    // $ANTLR start "rule__ProductoO__Group_1__3__Impl"
    // InternalRestaurante.g:4547:1: rule__ProductoO__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ProductoO__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4551:1: ( ( ')' ) )
            // InternalRestaurante.g:4552:1: ( ')' )
            {
            // InternalRestaurante.g:4552:1: ( ')' )
            // InternalRestaurante.g:4553:2: ')'
            {
             before(grammarAccess.getProductoOAccess().getRightParenthesisKeyword_1_3()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getProductoOAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1__3__Impl"


    // $ANTLR start "rule__ProductoO__Group_1_2__0"
    // InternalRestaurante.g:4563:1: rule__ProductoO__Group_1_2__0 : rule__ProductoO__Group_1_2__0__Impl rule__ProductoO__Group_1_2__1 ;
    public final void rule__ProductoO__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4567:1: ( rule__ProductoO__Group_1_2__0__Impl rule__ProductoO__Group_1_2__1 )
            // InternalRestaurante.g:4568:2: rule__ProductoO__Group_1_2__0__Impl rule__ProductoO__Group_1_2__1
            {
            pushFollow(FOLLOW_16);
            rule__ProductoO__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductoO__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1_2__0"


    // $ANTLR start "rule__ProductoO__Group_1_2__0__Impl"
    // InternalRestaurante.g:4575:1: rule__ProductoO__Group_1_2__0__Impl : ( 'O' ) ;
    public final void rule__ProductoO__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4579:1: ( ( 'O' ) )
            // InternalRestaurante.g:4580:1: ( 'O' )
            {
            // InternalRestaurante.g:4580:1: ( 'O' )
            // InternalRestaurante.g:4581:2: 'O'
            {
             before(grammarAccess.getProductoOAccess().getOKeyword_1_2_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getProductoOAccess().getOKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1_2__0__Impl"


    // $ANTLR start "rule__ProductoO__Group_1_2__1"
    // InternalRestaurante.g:4590:1: rule__ProductoO__Group_1_2__1 : rule__ProductoO__Group_1_2__1__Impl ;
    public final void rule__ProductoO__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4594:1: ( rule__ProductoO__Group_1_2__1__Impl )
            // InternalRestaurante.g:4595:2: rule__ProductoO__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductoO__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1_2__1"


    // $ANTLR start "rule__ProductoO__Group_1_2__1__Impl"
    // InternalRestaurante.g:4601:1: rule__ProductoO__Group_1_2__1__Impl : ( ( rule__ProductoO__DerAssignment_1_2_1 ) ) ;
    public final void rule__ProductoO__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4605:1: ( ( ( rule__ProductoO__DerAssignment_1_2_1 ) ) )
            // InternalRestaurante.g:4606:1: ( ( rule__ProductoO__DerAssignment_1_2_1 ) )
            {
            // InternalRestaurante.g:4606:1: ( ( rule__ProductoO__DerAssignment_1_2_1 ) )
            // InternalRestaurante.g:4607:2: ( rule__ProductoO__DerAssignment_1_2_1 )
            {
             before(grammarAccess.getProductoOAccess().getDerAssignment_1_2_1()); 
            // InternalRestaurante.g:4608:2: ( rule__ProductoO__DerAssignment_1_2_1 )
            // InternalRestaurante.g:4608:3: rule__ProductoO__DerAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ProductoO__DerAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProductoOAccess().getDerAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__Group_1_2__1__Impl"


    // $ANTLR start "rule__Float__Group__0"
    // InternalRestaurante.g:4617:1: rule__Float__Group__0 : rule__Float__Group__0__Impl rule__Float__Group__1 ;
    public final void rule__Float__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4621:1: ( rule__Float__Group__0__Impl rule__Float__Group__1 )
            // InternalRestaurante.g:4622:2: rule__Float__Group__0__Impl rule__Float__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Float__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0"


    // $ANTLR start "rule__Float__Group__0__Impl"
    // InternalRestaurante.g:4629:1: rule__Float__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4633:1: ( ( RULE_INT ) )
            // InternalRestaurante.g:4634:1: ( RULE_INT )
            {
            // InternalRestaurante.g:4634:1: ( RULE_INT )
            // InternalRestaurante.g:4635:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__0__Impl"


    // $ANTLR start "rule__Float__Group__1"
    // InternalRestaurante.g:4644:1: rule__Float__Group__1 : rule__Float__Group__1__Impl ;
    public final void rule__Float__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4648:1: ( rule__Float__Group__1__Impl )
            // InternalRestaurante.g:4649:2: rule__Float__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1"


    // $ANTLR start "rule__Float__Group__1__Impl"
    // InternalRestaurante.g:4655:1: rule__Float__Group__1__Impl : ( ( rule__Float__Group_1__0 )? ) ;
    public final void rule__Float__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4659:1: ( ( ( rule__Float__Group_1__0 )? ) )
            // InternalRestaurante.g:4660:1: ( ( rule__Float__Group_1__0 )? )
            {
            // InternalRestaurante.g:4660:1: ( ( rule__Float__Group_1__0 )? )
            // InternalRestaurante.g:4661:2: ( rule__Float__Group_1__0 )?
            {
             before(grammarAccess.getFloatAccess().getGroup_1()); 
            // InternalRestaurante.g:4662:2: ( rule__Float__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==44) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRestaurante.g:4662:3: rule__Float__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Float__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFloatAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group__1__Impl"


    // $ANTLR start "rule__Float__Group_1__0"
    // InternalRestaurante.g:4671:1: rule__Float__Group_1__0 : rule__Float__Group_1__0__Impl rule__Float__Group_1__1 ;
    public final void rule__Float__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4675:1: ( rule__Float__Group_1__0__Impl rule__Float__Group_1__1 )
            // InternalRestaurante.g:4676:2: rule__Float__Group_1__0__Impl rule__Float__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Float__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__0"


    // $ANTLR start "rule__Float__Group_1__0__Impl"
    // InternalRestaurante.g:4683:1: rule__Float__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Float__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4687:1: ( ( ',' ) )
            // InternalRestaurante.g:4688:1: ( ',' )
            {
            // InternalRestaurante.g:4688:1: ( ',' )
            // InternalRestaurante.g:4689:2: ','
            {
             before(grammarAccess.getFloatAccess().getCommaKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__0__Impl"


    // $ANTLR start "rule__Float__Group_1__1"
    // InternalRestaurante.g:4698:1: rule__Float__Group_1__1 : rule__Float__Group_1__1__Impl ;
    public final void rule__Float__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4702:1: ( rule__Float__Group_1__1__Impl )
            // InternalRestaurante.g:4703:2: rule__Float__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__1"


    // $ANTLR start "rule__Float__Group_1__1__Impl"
    // InternalRestaurante.g:4709:1: rule__Float__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Float__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4713:1: ( ( RULE_INT ) )
            // InternalRestaurante.g:4714:1: ( RULE_INT )
            {
            // InternalRestaurante.g:4714:1: ( RULE_INT )
            // InternalRestaurante.g:4715:2: RULE_INT
            {
             before(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFloatAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float__Group_1__1__Impl"


    // $ANTLR start "rule__Restaurante__NombreAssignment_1"
    // InternalRestaurante.g:4725:1: rule__Restaurante__NombreAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Restaurante__NombreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4729:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:4730:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:4730:2: ( RULE_STRING )
            // InternalRestaurante.g:4731:3: RULE_STRING
            {
             before(grammarAccess.getRestauranteAccess().getNombreSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getNombreSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__NombreAssignment_1"


    // $ANTLR start "rule__Restaurante__FechaAssignment_3"
    // InternalRestaurante.g:4740:1: rule__Restaurante__FechaAssignment_3 : ( RULE_FECHA ) ;
    public final void rule__Restaurante__FechaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4744:1: ( ( RULE_FECHA ) )
            // InternalRestaurante.g:4745:2: ( RULE_FECHA )
            {
            // InternalRestaurante.g:4745:2: ( RULE_FECHA )
            // InternalRestaurante.g:4746:3: RULE_FECHA
            {
             before(grammarAccess.getRestauranteAccess().getFechaFECHATerminalRuleCall_3_0()); 
            match(input,RULE_FECHA,FOLLOW_2); 
             after(grammarAccess.getRestauranteAccess().getFechaFECHATerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__FechaAssignment_3"


    // $ANTLR start "rule__Restaurante__IngredientesAssignment_6"
    // InternalRestaurante.g:4755:1: rule__Restaurante__IngredientesAssignment_6 : ( ruleIngrediente ) ;
    public final void rule__Restaurante__IngredientesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4759:1: ( ( ruleIngrediente ) )
            // InternalRestaurante.g:4760:2: ( ruleIngrediente )
            {
            // InternalRestaurante.g:4760:2: ( ruleIngrediente )
            // InternalRestaurante.g:4761:3: ruleIngrediente
            {
             before(grammarAccess.getRestauranteAccess().getIngredientesIngredienteParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleIngrediente();

            state._fsp--;

             after(grammarAccess.getRestauranteAccess().getIngredientesIngredienteParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__IngredientesAssignment_6"


    // $ANTLR start "rule__Restaurante__ProductosAssignment_10"
    // InternalRestaurante.g:4770:1: rule__Restaurante__ProductosAssignment_10 : ( ruleProducto ) ;
    public final void rule__Restaurante__ProductosAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4774:1: ( ( ruleProducto ) )
            // InternalRestaurante.g:4775:2: ( ruleProducto )
            {
            // InternalRestaurante.g:4775:2: ( ruleProducto )
            // InternalRestaurante.g:4776:3: ruleProducto
            {
             before(grammarAccess.getRestauranteAccess().getProductosProductoParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleProducto();

            state._fsp--;

             after(grammarAccess.getRestauranteAccess().getProductosProductoParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__ProductosAssignment_10"


    // $ANTLR start "rule__Restaurante__MenusAssignment_14"
    // InternalRestaurante.g:4785:1: rule__Restaurante__MenusAssignment_14 : ( ruleMenu ) ;
    public final void rule__Restaurante__MenusAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4789:1: ( ( ruleMenu ) )
            // InternalRestaurante.g:4790:2: ( ruleMenu )
            {
            // InternalRestaurante.g:4790:2: ( ruleMenu )
            // InternalRestaurante.g:4791:3: ruleMenu
            {
             before(grammarAccess.getRestauranteAccess().getMenusMenuParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getRestauranteAccess().getMenusMenuParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Restaurante__MenusAssignment_14"


    // $ANTLR start "rule__Ingrediente__NameAssignment_1"
    // InternalRestaurante.g:4800:1: rule__Ingrediente__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Ingrediente__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4804:1: ( ( RULE_ID ) )
            // InternalRestaurante.g:4805:2: ( RULE_ID )
            {
            // InternalRestaurante.g:4805:2: ( RULE_ID )
            // InternalRestaurante.g:4806:3: RULE_ID
            {
             before(grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__NameAssignment_1"


    // $ANTLR start "rule__Ingrediente__NombreAssignment_2"
    // InternalRestaurante.g:4815:1: rule__Ingrediente__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ingrediente__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4819:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:4820:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:4820:2: ( RULE_STRING )
            // InternalRestaurante.g:4821:3: RULE_STRING
            {
             before(grammarAccess.getIngredienteAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__NombreAssignment_2"


    // $ANTLR start "rule__Ingrediente__InfoURLAssignment_3_1"
    // InternalRestaurante.g:4830:1: rule__Ingrediente__InfoURLAssignment_3_1 : ( RULE_URL ) ;
    public final void rule__Ingrediente__InfoURLAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4834:1: ( ( RULE_URL ) )
            // InternalRestaurante.g:4835:2: ( RULE_URL )
            {
            // InternalRestaurante.g:4835:2: ( RULE_URL )
            // InternalRestaurante.g:4836:3: RULE_URL
            {
             before(grammarAccess.getIngredienteAccess().getInfoURLURLTerminalRuleCall_3_1_0()); 
            match(input,RULE_URL,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getInfoURLURLTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__InfoURLAssignment_3_1"


    // $ANTLR start "rule__Ingrediente__FotoAssignment_4_1"
    // InternalRestaurante.g:4845:1: rule__Ingrediente__FotoAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Ingrediente__FotoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4849:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:4850:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:4850:2: ( RULE_STRING )
            // InternalRestaurante.g:4851:3: RULE_STRING
            {
             before(grammarAccess.getIngredienteAccess().getFotoSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getFotoSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__FotoAssignment_4_1"


    // $ANTLR start "rule__Ingrediente__AlergenicoAssignment_5"
    // InternalRestaurante.g:4860:1: rule__Ingrediente__AlergenicoAssignment_5 : ( ( 'alergenico' ) ) ;
    public final void rule__Ingrediente__AlergenicoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4864:1: ( ( ( 'alergenico' ) ) )
            // InternalRestaurante.g:4865:2: ( ( 'alergenico' ) )
            {
            // InternalRestaurante.g:4865:2: ( ( 'alergenico' ) )
            // InternalRestaurante.g:4866:3: ( 'alergenico' )
            {
             before(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); 
            // InternalRestaurante.g:4867:3: ( 'alergenico' )
            // InternalRestaurante.g:4868:4: 'alergenico'
            {
             before(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); 

            }

             after(grammarAccess.getIngredienteAccess().getAlergenicoAlergenicoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingrediente__AlergenicoAssignment_5"


    // $ANTLR start "rule__Principal__NameAssignment_1"
    // InternalRestaurante.g:4879:1: rule__Principal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Principal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4883:1: ( ( RULE_ID ) )
            // InternalRestaurante.g:4884:2: ( RULE_ID )
            {
            // InternalRestaurante.g:4884:2: ( RULE_ID )
            // InternalRestaurante.g:4885:3: RULE_ID
            {
             before(grammarAccess.getPrincipalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__NameAssignment_1"


    // $ANTLR start "rule__Principal__NombreAssignment_2"
    // InternalRestaurante.g:4894:1: rule__Principal__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Principal__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4898:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:4899:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:4899:2: ( RULE_STRING )
            // InternalRestaurante.g:4900:3: RULE_STRING
            {
             before(grammarAccess.getPrincipalAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__NombreAssignment_2"


    // $ANTLR start "rule__Principal__EnsaladaAssignment_3"
    // InternalRestaurante.g:4909:1: rule__Principal__EnsaladaAssignment_3 : ( ( 'ensalada' ) ) ;
    public final void rule__Principal__EnsaladaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4913:1: ( ( ( 'ensalada' ) ) )
            // InternalRestaurante.g:4914:2: ( ( 'ensalada' ) )
            {
            // InternalRestaurante.g:4914:2: ( ( 'ensalada' ) )
            // InternalRestaurante.g:4915:3: ( 'ensalada' )
            {
             before(grammarAccess.getPrincipalAccess().getEnsaladaEnsaladaKeyword_3_0()); 
            // InternalRestaurante.g:4916:3: ( 'ensalada' )
            // InternalRestaurante.g:4917:4: 'ensalada'
            {
             before(grammarAccess.getPrincipalAccess().getEnsaladaEnsaladaKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getEnsaladaEnsaladaKeyword_3_0()); 

            }

             after(grammarAccess.getPrincipalAccess().getEnsaladaEnsaladaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__EnsaladaAssignment_3"


    // $ANTLR start "rule__Principal__DescripcionAssignment_6"
    // InternalRestaurante.g:4928:1: rule__Principal__DescripcionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Principal__DescripcionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4932:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:4933:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:4933:2: ( RULE_STRING )
            // InternalRestaurante.g:4934:3: RULE_STRING
            {
             before(grammarAccess.getPrincipalAccess().getDescripcionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getDescripcionSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__DescripcionAssignment_6"


    // $ANTLR start "rule__Principal__FotoAssignment_8"
    // InternalRestaurante.g:4943:1: rule__Principal__FotoAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Principal__FotoAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4947:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:4948:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:4948:2: ( RULE_STRING )
            // InternalRestaurante.g:4949:3: RULE_STRING
            {
             before(grammarAccess.getPrincipalAccess().getFotoSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getFotoSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__FotoAssignment_8"


    // $ANTLR start "rule__Principal__IngredientesAssignment_9_1"
    // InternalRestaurante.g:4958:1: rule__Principal__IngredientesAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Principal__IngredientesAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4962:1: ( ( ( RULE_ID ) ) )
            // InternalRestaurante.g:4963:2: ( ( RULE_ID ) )
            {
            // InternalRestaurante.g:4963:2: ( ( RULE_ID ) )
            // InternalRestaurante.g:4964:3: ( RULE_ID )
            {
             before(grammarAccess.getPrincipalAccess().getIngredientesIngredienteCrossReference_9_1_0()); 
            // InternalRestaurante.g:4965:3: ( RULE_ID )
            // InternalRestaurante.g:4966:4: RULE_ID
            {
             before(grammarAccess.getPrincipalAccess().getIngredientesIngredienteIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getIngredientesIngredienteIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getPrincipalAccess().getIngredientesIngredienteCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__IngredientesAssignment_9_1"


    // $ANTLR start "rule__Principal__IngredientesAssignment_9_2_1"
    // InternalRestaurante.g:4977:1: rule__Principal__IngredientesAssignment_9_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Principal__IngredientesAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:4981:1: ( ( ( RULE_ID ) ) )
            // InternalRestaurante.g:4982:2: ( ( RULE_ID ) )
            {
            // InternalRestaurante.g:4982:2: ( ( RULE_ID ) )
            // InternalRestaurante.g:4983:3: ( RULE_ID )
            {
             before(grammarAccess.getPrincipalAccess().getIngredientesIngredienteCrossReference_9_2_1_0()); 
            // InternalRestaurante.g:4984:3: ( RULE_ID )
            // InternalRestaurante.g:4985:4: RULE_ID
            {
             before(grammarAccess.getPrincipalAccess().getIngredientesIngredienteIDTerminalRuleCall_9_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrincipalAccess().getIngredientesIngredienteIDTerminalRuleCall_9_2_1_0_1()); 

            }

             after(grammarAccess.getPrincipalAccess().getIngredientesIngredienteCrossReference_9_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__IngredientesAssignment_9_2_1"


    // $ANTLR start "rule__Principal__SalsaAssignment_11"
    // InternalRestaurante.g:4996:1: rule__Principal__SalsaAssignment_11 : ( ruleSalsaRecomendada ) ;
    public final void rule__Principal__SalsaAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5000:1: ( ( ruleSalsaRecomendada ) )
            // InternalRestaurante.g:5001:2: ( ruleSalsaRecomendada )
            {
            // InternalRestaurante.g:5001:2: ( ruleSalsaRecomendada )
            // InternalRestaurante.g:5002:3: ruleSalsaRecomendada
            {
             before(grammarAccess.getPrincipalAccess().getSalsaSalsaRecomendadaEnumRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSalsaRecomendada();

            state._fsp--;

             after(grammarAccess.getPrincipalAccess().getSalsaSalsaRecomendadaEnumRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__SalsaAssignment_11"


    // $ANTLR start "rule__Principal__NutricionalAssignment_12_1"
    // InternalRestaurante.g:5011:1: rule__Principal__NutricionalAssignment_12_1 : ( ruleNutricional ) ;
    public final void rule__Principal__NutricionalAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5015:1: ( ( ruleNutricional ) )
            // InternalRestaurante.g:5016:2: ( ruleNutricional )
            {
            // InternalRestaurante.g:5016:2: ( ruleNutricional )
            // InternalRestaurante.g:5017:3: ruleNutricional
            {
             before(grammarAccess.getPrincipalAccess().getNutricionalNutricionalParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNutricional();

            state._fsp--;

             after(grammarAccess.getPrincipalAccess().getNutricionalNutricionalParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Principal__NutricionalAssignment_12_1"


    // $ANTLR start "rule__Complemento__NameAssignment_1"
    // InternalRestaurante.g:5026:1: rule__Complemento__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Complemento__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5030:1: ( ( RULE_ID ) )
            // InternalRestaurante.g:5031:2: ( RULE_ID )
            {
            // InternalRestaurante.g:5031:2: ( RULE_ID )
            // InternalRestaurante.g:5032:3: RULE_ID
            {
             before(grammarAccess.getComplementoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplementoAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__NameAssignment_1"


    // $ANTLR start "rule__Complemento__NombreAssignment_2"
    // InternalRestaurante.g:5041:1: rule__Complemento__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Complemento__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5045:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5046:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5046:2: ( RULE_STRING )
            // InternalRestaurante.g:5047:3: RULE_STRING
            {
             before(grammarAccess.getComplementoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComplementoAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__NombreAssignment_2"


    // $ANTLR start "rule__Complemento__DescripcionAssignment_5"
    // InternalRestaurante.g:5056:1: rule__Complemento__DescripcionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Complemento__DescripcionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5060:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5061:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5061:2: ( RULE_STRING )
            // InternalRestaurante.g:5062:3: RULE_STRING
            {
             before(grammarAccess.getComplementoAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComplementoAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__DescripcionAssignment_5"


    // $ANTLR start "rule__Complemento__FotoAssignment_7"
    // InternalRestaurante.g:5071:1: rule__Complemento__FotoAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Complemento__FotoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5075:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5076:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5076:2: ( RULE_STRING )
            // InternalRestaurante.g:5077:3: RULE_STRING
            {
             before(grammarAccess.getComplementoAccess().getFotoSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComplementoAccess().getFotoSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__FotoAssignment_7"


    // $ANTLR start "rule__Complemento__NutricionalAssignment_8_1"
    // InternalRestaurante.g:5086:1: rule__Complemento__NutricionalAssignment_8_1 : ( ruleNutricional ) ;
    public final void rule__Complemento__NutricionalAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5090:1: ( ( ruleNutricional ) )
            // InternalRestaurante.g:5091:2: ( ruleNutricional )
            {
            // InternalRestaurante.g:5091:2: ( ruleNutricional )
            // InternalRestaurante.g:5092:3: ruleNutricional
            {
             before(grammarAccess.getComplementoAccess().getNutricionalNutricionalParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNutricional();

            state._fsp--;

             after(grammarAccess.getComplementoAccess().getNutricionalNutricionalParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Complemento__NutricionalAssignment_8_1"


    // $ANTLR start "rule__BebidaFria__NameAssignment_1"
    // InternalRestaurante.g:5101:1: rule__BebidaFria__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BebidaFria__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5105:1: ( ( RULE_ID ) )
            // InternalRestaurante.g:5106:2: ( RULE_ID )
            {
            // InternalRestaurante.g:5106:2: ( RULE_ID )
            // InternalRestaurante.g:5107:3: RULE_ID
            {
             before(grammarAccess.getBebidaFriaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__NameAssignment_1"


    // $ANTLR start "rule__BebidaFria__NombreAssignment_2"
    // InternalRestaurante.g:5116:1: rule__BebidaFria__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__BebidaFria__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5120:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5121:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5121:2: ( RULE_STRING )
            // InternalRestaurante.g:5122:3: RULE_STRING
            {
             before(grammarAccess.getBebidaFriaAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__NombreAssignment_2"


    // $ANTLR start "rule__BebidaFria__DescripcionAssignment_5"
    // InternalRestaurante.g:5131:1: rule__BebidaFria__DescripcionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__BebidaFria__DescripcionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5135:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5136:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5136:2: ( RULE_STRING )
            // InternalRestaurante.g:5137:3: RULE_STRING
            {
             before(grammarAccess.getBebidaFriaAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__DescripcionAssignment_5"


    // $ANTLR start "rule__BebidaFria__DistribuidorAssignment_7"
    // InternalRestaurante.g:5146:1: rule__BebidaFria__DistribuidorAssignment_7 : ( ruleDistribuidor ) ;
    public final void rule__BebidaFria__DistribuidorAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5150:1: ( ( ruleDistribuidor ) )
            // InternalRestaurante.g:5151:2: ( ruleDistribuidor )
            {
            // InternalRestaurante.g:5151:2: ( ruleDistribuidor )
            // InternalRestaurante.g:5152:3: ruleDistribuidor
            {
             before(grammarAccess.getBebidaFriaAccess().getDistribuidorDistribuidorEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDistribuidor();

            state._fsp--;

             after(grammarAccess.getBebidaFriaAccess().getDistribuidorDistribuidorEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__DistribuidorAssignment_7"


    // $ANTLR start "rule__BebidaFria__FotoAssignment_9"
    // InternalRestaurante.g:5161:1: rule__BebidaFria__FotoAssignment_9 : ( RULE_STRING ) ;
    public final void rule__BebidaFria__FotoAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5165:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5166:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5166:2: ( RULE_STRING )
            // InternalRestaurante.g:5167:3: RULE_STRING
            {
             before(grammarAccess.getBebidaFriaAccess().getFotoSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBebidaFriaAccess().getFotoSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__FotoAssignment_9"


    // $ANTLR start "rule__BebidaFria__NutricionalAssignment_10_1"
    // InternalRestaurante.g:5176:1: rule__BebidaFria__NutricionalAssignment_10_1 : ( ruleNutricional ) ;
    public final void rule__BebidaFria__NutricionalAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5180:1: ( ( ruleNutricional ) )
            // InternalRestaurante.g:5181:2: ( ruleNutricional )
            {
            // InternalRestaurante.g:5181:2: ( ruleNutricional )
            // InternalRestaurante.g:5182:3: ruleNutricional
            {
             before(grammarAccess.getBebidaFriaAccess().getNutricionalNutricionalParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNutricional();

            state._fsp--;

             after(grammarAccess.getBebidaFriaAccess().getNutricionalNutricionalParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaFria__NutricionalAssignment_10_1"


    // $ANTLR start "rule__BebidaCaliente__NameAssignment_1"
    // InternalRestaurante.g:5191:1: rule__BebidaCaliente__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BebidaCaliente__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5195:1: ( ( RULE_ID ) )
            // InternalRestaurante.g:5196:2: ( RULE_ID )
            {
            // InternalRestaurante.g:5196:2: ( RULE_ID )
            // InternalRestaurante.g:5197:3: RULE_ID
            {
             before(grammarAccess.getBebidaCalienteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBebidaCalienteAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__NameAssignment_1"


    // $ANTLR start "rule__BebidaCaliente__NombreAssignment_2"
    // InternalRestaurante.g:5206:1: rule__BebidaCaliente__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__BebidaCaliente__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5210:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5211:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5211:2: ( RULE_STRING )
            // InternalRestaurante.g:5212:3: RULE_STRING
            {
             before(grammarAccess.getBebidaCalienteAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBebidaCalienteAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__NombreAssignment_2"


    // $ANTLR start "rule__BebidaCaliente__DescripcionAssignment_5"
    // InternalRestaurante.g:5221:1: rule__BebidaCaliente__DescripcionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__BebidaCaliente__DescripcionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5225:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5226:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5226:2: ( RULE_STRING )
            // InternalRestaurante.g:5227:3: RULE_STRING
            {
             before(grammarAccess.getBebidaCalienteAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBebidaCalienteAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__DescripcionAssignment_5"


    // $ANTLR start "rule__BebidaCaliente__FotoAssignment_7"
    // InternalRestaurante.g:5236:1: rule__BebidaCaliente__FotoAssignment_7 : ( RULE_STRING ) ;
    public final void rule__BebidaCaliente__FotoAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5240:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5241:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5241:2: ( RULE_STRING )
            // InternalRestaurante.g:5242:3: RULE_STRING
            {
             before(grammarAccess.getBebidaCalienteAccess().getFotoSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBebidaCalienteAccess().getFotoSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__FotoAssignment_7"


    // $ANTLR start "rule__BebidaCaliente__NutricionalAssignment_8_1"
    // InternalRestaurante.g:5251:1: rule__BebidaCaliente__NutricionalAssignment_8_1 : ( ruleNutricional ) ;
    public final void rule__BebidaCaliente__NutricionalAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5255:1: ( ( ruleNutricional ) )
            // InternalRestaurante.g:5256:2: ( ruleNutricional )
            {
            // InternalRestaurante.g:5256:2: ( ruleNutricional )
            // InternalRestaurante.g:5257:3: ruleNutricional
            {
             before(grammarAccess.getBebidaCalienteAccess().getNutricionalNutricionalParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNutricional();

            state._fsp--;

             after(grammarAccess.getBebidaCalienteAccess().getNutricionalNutricionalParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BebidaCaliente__NutricionalAssignment_8_1"


    // $ANTLR start "rule__Postre__NameAssignment_1"
    // InternalRestaurante.g:5266:1: rule__Postre__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Postre__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5270:1: ( ( RULE_ID ) )
            // InternalRestaurante.g:5271:2: ( RULE_ID )
            {
            // InternalRestaurante.g:5271:2: ( RULE_ID )
            // InternalRestaurante.g:5272:3: RULE_ID
            {
             before(grammarAccess.getPostreAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__NameAssignment_1"


    // $ANTLR start "rule__Postre__NombreAssignment_2"
    // InternalRestaurante.g:5281:1: rule__Postre__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Postre__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5285:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5286:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5286:2: ( RULE_STRING )
            // InternalRestaurante.g:5287:3: RULE_STRING
            {
             before(grammarAccess.getPostreAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__NombreAssignment_2"


    // $ANTLR start "rule__Postre__HeladoAssignment_3"
    // InternalRestaurante.g:5296:1: rule__Postre__HeladoAssignment_3 : ( ( 'helado' ) ) ;
    public final void rule__Postre__HeladoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5300:1: ( ( ( 'helado' ) ) )
            // InternalRestaurante.g:5301:2: ( ( 'helado' ) )
            {
            // InternalRestaurante.g:5301:2: ( ( 'helado' ) )
            // InternalRestaurante.g:5302:3: ( 'helado' )
            {
             before(grammarAccess.getPostreAccess().getHeladoHeladoKeyword_3_0()); 
            // InternalRestaurante.g:5303:3: ( 'helado' )
            // InternalRestaurante.g:5304:4: 'helado'
            {
             before(grammarAccess.getPostreAccess().getHeladoHeladoKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getHeladoHeladoKeyword_3_0()); 

            }

             after(grammarAccess.getPostreAccess().getHeladoHeladoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__HeladoAssignment_3"


    // $ANTLR start "rule__Postre__DescripcionAssignment_6"
    // InternalRestaurante.g:5315:1: rule__Postre__DescripcionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Postre__DescripcionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5319:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5320:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5320:2: ( RULE_STRING )
            // InternalRestaurante.g:5321:3: RULE_STRING
            {
             before(grammarAccess.getPostreAccess().getDescripcionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getDescripcionSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__DescripcionAssignment_6"


    // $ANTLR start "rule__Postre__DistribuidorAssignment_7_1"
    // InternalRestaurante.g:5330:1: rule__Postre__DistribuidorAssignment_7_1 : ( ruleDistribuidor ) ;
    public final void rule__Postre__DistribuidorAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5334:1: ( ( ruleDistribuidor ) )
            // InternalRestaurante.g:5335:2: ( ruleDistribuidor )
            {
            // InternalRestaurante.g:5335:2: ( ruleDistribuidor )
            // InternalRestaurante.g:5336:3: ruleDistribuidor
            {
             before(grammarAccess.getPostreAccess().getDistribuidorDistribuidorEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDistribuidor();

            state._fsp--;

             after(grammarAccess.getPostreAccess().getDistribuidorDistribuidorEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__DistribuidorAssignment_7_1"


    // $ANTLR start "rule__Postre__FotoAssignment_9"
    // InternalRestaurante.g:5345:1: rule__Postre__FotoAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Postre__FotoAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5349:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5350:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5350:2: ( RULE_STRING )
            // InternalRestaurante.g:5351:3: RULE_STRING
            {
             before(grammarAccess.getPostreAccess().getFotoSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getFotoSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__FotoAssignment_9"


    // $ANTLR start "rule__Postre__IngredientesAssignment_10_1"
    // InternalRestaurante.g:5360:1: rule__Postre__IngredientesAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Postre__IngredientesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5364:1: ( ( ( RULE_ID ) ) )
            // InternalRestaurante.g:5365:2: ( ( RULE_ID ) )
            {
            // InternalRestaurante.g:5365:2: ( ( RULE_ID ) )
            // InternalRestaurante.g:5366:3: ( RULE_ID )
            {
             before(grammarAccess.getPostreAccess().getIngredientesIngredienteCrossReference_10_1_0()); 
            // InternalRestaurante.g:5367:3: ( RULE_ID )
            // InternalRestaurante.g:5368:4: RULE_ID
            {
             before(grammarAccess.getPostreAccess().getIngredientesIngredienteIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getIngredientesIngredienteIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getPostreAccess().getIngredientesIngredienteCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__IngredientesAssignment_10_1"


    // $ANTLR start "rule__Postre__IngredientesAssignment_10_2_1"
    // InternalRestaurante.g:5379:1: rule__Postre__IngredientesAssignment_10_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Postre__IngredientesAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5383:1: ( ( ( RULE_ID ) ) )
            // InternalRestaurante.g:5384:2: ( ( RULE_ID ) )
            {
            // InternalRestaurante.g:5384:2: ( ( RULE_ID ) )
            // InternalRestaurante.g:5385:3: ( RULE_ID )
            {
             before(grammarAccess.getPostreAccess().getIngredientesIngredienteCrossReference_10_2_1_0()); 
            // InternalRestaurante.g:5386:3: ( RULE_ID )
            // InternalRestaurante.g:5387:4: RULE_ID
            {
             before(grammarAccess.getPostreAccess().getIngredientesIngredienteIDTerminalRuleCall_10_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPostreAccess().getIngredientesIngredienteIDTerminalRuleCall_10_2_1_0_1()); 

            }

             after(grammarAccess.getPostreAccess().getIngredientesIngredienteCrossReference_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__IngredientesAssignment_10_2_1"


    // $ANTLR start "rule__Postre__NutricionalAssignment_11_1"
    // InternalRestaurante.g:5398:1: rule__Postre__NutricionalAssignment_11_1 : ( ruleNutricional ) ;
    public final void rule__Postre__NutricionalAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5402:1: ( ( ruleNutricional ) )
            // InternalRestaurante.g:5403:2: ( ruleNutricional )
            {
            // InternalRestaurante.g:5403:2: ( ruleNutricional )
            // InternalRestaurante.g:5404:3: ruleNutricional
            {
             before(grammarAccess.getPostreAccess().getNutricionalNutricionalParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNutricional();

            state._fsp--;

             after(grammarAccess.getPostreAccess().getNutricionalNutricionalParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postre__NutricionalAssignment_11_1"


    // $ANTLR start "rule__Nutricional__CantidadAssignment_2"
    // InternalRestaurante.g:5413:1: rule__Nutricional__CantidadAssignment_2 : ( ruleFloat ) ;
    public final void rule__Nutricional__CantidadAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5417:1: ( ( ruleFloat ) )
            // InternalRestaurante.g:5418:2: ( ruleFloat )
            {
            // InternalRestaurante.g:5418:2: ( ruleFloat )
            // InternalRestaurante.g:5419:3: ruleFloat
            {
             before(grammarAccess.getNutricionalAccess().getCantidadFloatParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getNutricionalAccess().getCantidadFloatParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__CantidadAssignment_2"


    // $ANTLR start "rule__Nutricional__UnidadAssignment_4"
    // InternalRestaurante.g:5428:1: rule__Nutricional__UnidadAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Nutricional__UnidadAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5432:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5433:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5433:2: ( RULE_STRING )
            // InternalRestaurante.g:5434:3: RULE_STRING
            {
             before(grammarAccess.getNutricionalAccess().getUnidadSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNutricionalAccess().getUnidadSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__UnidadAssignment_4"


    // $ANTLR start "rule__Nutricional__EnergiaAssignment_6"
    // InternalRestaurante.g:5443:1: rule__Nutricional__EnergiaAssignment_6 : ( ruleFloat ) ;
    public final void rule__Nutricional__EnergiaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5447:1: ( ( ruleFloat ) )
            // InternalRestaurante.g:5448:2: ( ruleFloat )
            {
            // InternalRestaurante.g:5448:2: ( ruleFloat )
            // InternalRestaurante.g:5449:3: ruleFloat
            {
             before(grammarAccess.getNutricionalAccess().getEnergiaFloatParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getNutricionalAccess().getEnergiaFloatParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__EnergiaAssignment_6"


    // $ANTLR start "rule__Nutricional__GrasasAssignment_8"
    // InternalRestaurante.g:5458:1: rule__Nutricional__GrasasAssignment_8 : ( ruleFloat ) ;
    public final void rule__Nutricional__GrasasAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5462:1: ( ( ruleFloat ) )
            // InternalRestaurante.g:5463:2: ( ruleFloat )
            {
            // InternalRestaurante.g:5463:2: ( ruleFloat )
            // InternalRestaurante.g:5464:3: ruleFloat
            {
             before(grammarAccess.getNutricionalAccess().getGrasasFloatParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getNutricionalAccess().getGrasasFloatParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__GrasasAssignment_8"


    // $ANTLR start "rule__Nutricional__HidratosAssignment_10"
    // InternalRestaurante.g:5473:1: rule__Nutricional__HidratosAssignment_10 : ( ruleFloat ) ;
    public final void rule__Nutricional__HidratosAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5477:1: ( ( ruleFloat ) )
            // InternalRestaurante.g:5478:2: ( ruleFloat )
            {
            // InternalRestaurante.g:5478:2: ( ruleFloat )
            // InternalRestaurante.g:5479:3: ruleFloat
            {
             before(grammarAccess.getNutricionalAccess().getHidratosFloatParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getNutricionalAccess().getHidratosFloatParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__HidratosAssignment_10"


    // $ANTLR start "rule__Nutricional__ProteinasAssignment_12"
    // InternalRestaurante.g:5488:1: rule__Nutricional__ProteinasAssignment_12 : ( ruleFloat ) ;
    public final void rule__Nutricional__ProteinasAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5492:1: ( ( ruleFloat ) )
            // InternalRestaurante.g:5493:2: ( ruleFloat )
            {
            // InternalRestaurante.g:5493:2: ( ruleFloat )
            // InternalRestaurante.g:5494:3: ruleFloat
            {
             before(grammarAccess.getNutricionalAccess().getProteinasFloatParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getNutricionalAccess().getProteinasFloatParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__ProteinasAssignment_12"


    // $ANTLR start "rule__Nutricional__SalAssignment_14"
    // InternalRestaurante.g:5503:1: rule__Nutricional__SalAssignment_14 : ( ruleFloat ) ;
    public final void rule__Nutricional__SalAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5507:1: ( ( ruleFloat ) )
            // InternalRestaurante.g:5508:2: ( ruleFloat )
            {
            // InternalRestaurante.g:5508:2: ( ruleFloat )
            // InternalRestaurante.g:5509:3: ruleFloat
            {
             before(grammarAccess.getNutricionalAccess().getSalFloatParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleFloat();

            state._fsp--;

             after(grammarAccess.getNutricionalAccess().getSalFloatParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutricional__SalAssignment_14"


    // $ANTLR start "rule__Menu__NameAssignment_1"
    // InternalRestaurante.g:5518:1: rule__Menu__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Menu__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5522:1: ( ( RULE_ID ) )
            // InternalRestaurante.g:5523:2: ( RULE_ID )
            {
            // InternalRestaurante.g:5523:2: ( RULE_ID )
            // InternalRestaurante.g:5524:3: RULE_ID
            {
             before(grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__NameAssignment_1"


    // $ANTLR start "rule__Menu__NombreAssignment_2"
    // InternalRestaurante.g:5533:1: rule__Menu__NombreAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Menu__NombreAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5537:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5538:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5538:2: ( RULE_STRING )
            // InternalRestaurante.g:5539:3: RULE_STRING
            {
             before(grammarAccess.getMenuAccess().getNombreSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getNombreSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__NombreAssignment_2"


    // $ANTLR start "rule__Menu__DescripcionAssignment_5"
    // InternalRestaurante.g:5548:1: rule__Menu__DescripcionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Menu__DescripcionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5552:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5553:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5553:2: ( RULE_STRING )
            // InternalRestaurante.g:5554:3: RULE_STRING
            {
             before(grammarAccess.getMenuAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getDescripcionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__DescripcionAssignment_5"


    // $ANTLR start "rule__Menu__TamanioAssignment_7"
    // InternalRestaurante.g:5563:1: rule__Menu__TamanioAssignment_7 : ( ruleTamanioMenu ) ;
    public final void rule__Menu__TamanioAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5567:1: ( ( ruleTamanioMenu ) )
            // InternalRestaurante.g:5568:2: ( ruleTamanioMenu )
            {
            // InternalRestaurante.g:5568:2: ( ruleTamanioMenu )
            // InternalRestaurante.g:5569:3: ruleTamanioMenu
            {
             before(grammarAccess.getMenuAccess().getTamanioTamanioMenuEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanioMenu();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getTamanioTamanioMenuEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__TamanioAssignment_7"


    // $ANTLR start "rule__Menu__FotoAssignment_9"
    // InternalRestaurante.g:5578:1: rule__Menu__FotoAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Menu__FotoAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5582:1: ( ( RULE_STRING ) )
            // InternalRestaurante.g:5583:2: ( RULE_STRING )
            {
            // InternalRestaurante.g:5583:2: ( RULE_STRING )
            // InternalRestaurante.g:5584:3: RULE_STRING
            {
             before(grammarAccess.getMenuAccess().getFotoSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getFotoSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__FotoAssignment_9"


    // $ANTLR start "rule__Menu__ProductosAssignment_10_1"
    // InternalRestaurante.g:5593:1: rule__Menu__ProductosAssignment_10_1 : ( ruleProductoY ) ;
    public final void rule__Menu__ProductosAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5597:1: ( ( ruleProductoY ) )
            // InternalRestaurante.g:5598:2: ( ruleProductoY )
            {
            // InternalRestaurante.g:5598:2: ( ruleProductoY )
            // InternalRestaurante.g:5599:3: ruleProductoY
            {
             before(grammarAccess.getMenuAccess().getProductosProductoYParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProductoY();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getProductosProductoYParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__ProductosAssignment_10_1"


    // $ANTLR start "rule__ProductoY__IzqAssignment_0"
    // InternalRestaurante.g:5608:1: rule__ProductoY__IzqAssignment_0 : ( ruleProductoO ) ;
    public final void rule__ProductoY__IzqAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5612:1: ( ( ruleProductoO ) )
            // InternalRestaurante.g:5613:2: ( ruleProductoO )
            {
            // InternalRestaurante.g:5613:2: ( ruleProductoO )
            // InternalRestaurante.g:5614:3: ruleProductoO
            {
             before(grammarAccess.getProductoYAccess().getIzqProductoOParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProductoO();

            state._fsp--;

             after(grammarAccess.getProductoYAccess().getIzqProductoOParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoY__IzqAssignment_0"


    // $ANTLR start "rule__ProductoY__DerAssignment_1_1"
    // InternalRestaurante.g:5623:1: rule__ProductoY__DerAssignment_1_1 : ( ruleProductoO ) ;
    public final void rule__ProductoY__DerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5627:1: ( ( ruleProductoO ) )
            // InternalRestaurante.g:5628:2: ( ruleProductoO )
            {
            // InternalRestaurante.g:5628:2: ( ruleProductoO )
            // InternalRestaurante.g:5629:3: ruleProductoO
            {
             before(grammarAccess.getProductoYAccess().getDerProductoOParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProductoO();

            state._fsp--;

             after(grammarAccess.getProductoYAccess().getDerProductoOParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoY__DerAssignment_1_1"


    // $ANTLR start "rule__ProductoO__IzqAssignment_0"
    // InternalRestaurante.g:5638:1: rule__ProductoO__IzqAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ProductoO__IzqAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5642:1: ( ( ( RULE_ID ) ) )
            // InternalRestaurante.g:5643:2: ( ( RULE_ID ) )
            {
            // InternalRestaurante.g:5643:2: ( ( RULE_ID ) )
            // InternalRestaurante.g:5644:3: ( RULE_ID )
            {
             before(grammarAccess.getProductoOAccess().getIzqProductoCrossReference_0_0()); 
            // InternalRestaurante.g:5645:3: ( RULE_ID )
            // InternalRestaurante.g:5646:4: RULE_ID
            {
             before(grammarAccess.getProductoOAccess().getIzqProductoIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProductoOAccess().getIzqProductoIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getProductoOAccess().getIzqProductoCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__IzqAssignment_0"


    // $ANTLR start "rule__ProductoO__IzqAssignment_1_1"
    // InternalRestaurante.g:5657:1: rule__ProductoO__IzqAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProductoO__IzqAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5661:1: ( ( ( RULE_ID ) ) )
            // InternalRestaurante.g:5662:2: ( ( RULE_ID ) )
            {
            // InternalRestaurante.g:5662:2: ( ( RULE_ID ) )
            // InternalRestaurante.g:5663:3: ( RULE_ID )
            {
             before(grammarAccess.getProductoOAccess().getIzqProductoCrossReference_1_1_0()); 
            // InternalRestaurante.g:5664:3: ( RULE_ID )
            // InternalRestaurante.g:5665:4: RULE_ID
            {
             before(grammarAccess.getProductoOAccess().getIzqProductoIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProductoOAccess().getIzqProductoIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getProductoOAccess().getIzqProductoCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__IzqAssignment_1_1"


    // $ANTLR start "rule__ProductoO__DerAssignment_1_2_1"
    // InternalRestaurante.g:5676:1: rule__ProductoO__DerAssignment_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProductoO__DerAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRestaurante.g:5680:1: ( ( ( RULE_ID ) ) )
            // InternalRestaurante.g:5681:2: ( ( RULE_ID ) )
            {
            // InternalRestaurante.g:5681:2: ( ( RULE_ID ) )
            // InternalRestaurante.g:5682:3: ( RULE_ID )
            {
             before(grammarAccess.getProductoOAccess().getDerProductoCrossReference_1_2_1_0()); 
            // InternalRestaurante.g:5683:3: ( RULE_ID )
            // InternalRestaurante.g:5684:4: RULE_ID
            {
             before(grammarAccess.getProductoOAccess().getDerProductoIDTerminalRuleCall_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProductoOAccess().getDerProductoIDTerminalRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getProductoOAccess().getDerProductoCrossReference_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductoO__DerAssignment_1_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0006C08200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0006C08000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0400000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000006000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000001FE00000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000280200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000200000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});

}