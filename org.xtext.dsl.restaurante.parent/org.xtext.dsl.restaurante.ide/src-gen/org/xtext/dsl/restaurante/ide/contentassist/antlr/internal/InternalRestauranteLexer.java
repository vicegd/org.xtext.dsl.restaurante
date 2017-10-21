package org.xtext.dsl.restaurante.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestauranteLexer extends Lexer {
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

    public InternalRestauranteLexer() {;} 
    public InternalRestauranteLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRestauranteLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRestaurante.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:11:7: ( 'NINGUNA' )
            // InternalRestaurante.g:11:9: 'NINGUNA'
            {
            match("NINGUNA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:12:7: ( 'ACEITE_Y_VINAGRE' )
            // InternalRestaurante.g:12:9: 'ACEITE_Y_VINAGRE'
            {
            match("ACEITE_Y_VINAGRE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:13:7: ( 'CESAR' )
            // InternalRestaurante.g:13:9: 'CESAR'
            {
            match("CESAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:14:7: ( 'MODENA' )
            // InternalRestaurante.g:14:9: 'MODENA'
            {
            match("MODENA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:15:7: ( 'MOSTAZA' )
            // InternalRestaurante.g:15:9: 'MOSTAZA'
            {
            match("MOSTAZA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:16:7: ( 'NORMAL' )
            // InternalRestaurante.g:16:9: 'NORMAL'
            {
            match("NORMAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:17:7: ( 'GRANDE' )
            // InternalRestaurante.g:17:9: 'GRANDE'
            {
            match("GRANDE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:18:7: ( 'NORMAL_Y_GRANDE' )
            // InternalRestaurante.g:18:9: 'NORMAL_Y_GRANDE'
            {
            match("NORMAL_Y_GRANDE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:19:7: ( 'COCA_COLA' )
            // InternalRestaurante.g:19:9: 'COCA_COLA'
            {
            match("COCA_COLA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:20:7: ( 'AQUABONA' )
            // InternalRestaurante.g:20:9: 'AQUABONA'
            {
            match("AQUABONA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:21:7: ( 'MAHOU' )
            // InternalRestaurante.g:21:9: 'MAHOU'
            {
            match("MAHOU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:22:7: ( 'ALVALLE' )
            // InternalRestaurante.g:22:9: 'ALVALLE'
            {
            match("ALVALLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:23:7: ( 'TROPICANA' )
            // InternalRestaurante.g:23:9: 'TROPICANA'
            {
            match("TROPICANA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:24:7: ( 'OREO' )
            // InternalRestaurante.g:24:9: 'OREO'
            {
            match("OREO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:25:7: ( 'MILKA' )
            // InternalRestaurante.g:25:9: 'MILKA'
            {
            match("MILKA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:26:7: ( 'DANONE' )
            // InternalRestaurante.g:26:9: 'DANONE'
            {
            match("DANONE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:27:7: ( 'Restaurantes' )
            // InternalRestaurante.g:27:9: 'Restaurantes'
            {
            match("Restaurantes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:28:7: ( 'fecha' )
            // InternalRestaurante.g:28:9: 'fecha'
            {
            match("fecha"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:29:7: ( 'Ingredientes' )
            // InternalRestaurante.g:29:9: 'Ingredientes'
            {
            match("Ingredientes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:30:7: ( '{' )
            // InternalRestaurante.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:31:7: ( '}' )
            // InternalRestaurante.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:32:7: ( 'Productos' )
            // InternalRestaurante.g:32:9: 'Productos'
            {
            match("Productos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:33:7: ( 'Menus' )
            // InternalRestaurante.g:33:9: 'Menus'
            {
            match("Menus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:34:7: ( 'Ingrediente:' )
            // InternalRestaurante.g:34:9: 'Ingrediente:'
            {
            match("Ingrediente:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:35:7: ( 'infoURL:' )
            // InternalRestaurante.g:35:9: 'infoURL:'
            {
            match("infoURL:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:36:7: ( 'foto:' )
            // InternalRestaurante.g:36:9: 'foto:'
            {
            match("foto:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:37:7: ( 'Principal:' )
            // InternalRestaurante.g:37:9: 'Principal:'
            {
            match("Principal:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:38:7: ( 'Descripcion:' )
            // InternalRestaurante.g:38:9: 'Descripcion:'
            {
            match("Descripcion:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:39:7: ( 'Foto:' )
            // InternalRestaurante.g:39:9: 'Foto:'
            {
            match("Foto:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:40:7: ( 'Salsa recomendada:' )
            // InternalRestaurante.g:40:9: 'Salsa recomendada:'
            {
            match("Salsa recomendada:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:41:7: ( 'Ingredientes:' )
            // InternalRestaurante.g:41:9: 'Ingredientes:'
            {
            match("Ingredientes:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:42:7: ( ',' )
            // InternalRestaurante.g:42:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:43:7: ( 'Nutricional' )
            // InternalRestaurante.g:43:9: 'Nutricional'
            {
            match("Nutricional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:44:7: ( 'Complemento:' )
            // InternalRestaurante.g:44:9: 'Complemento:'
            {
            match("Complemento:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:45:7: ( 'Bebida fria:' )
            // InternalRestaurante.g:45:9: 'Bebida fria:'
            {
            match("Bebida fria:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:46:7: ( 'Distribuidor:' )
            // InternalRestaurante.g:46:9: 'Distribuidor:'
            {
            match("Distribuidor:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:47:7: ( 'Bebida caliente:' )
            // InternalRestaurante.g:47:9: 'Bebida caliente:'
            {
            match("Bebida caliente:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:48:7: ( 'Postre:' )
            // InternalRestaurante.g:48:9: 'Postre:'
            {
            match("Postre:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:49:7: ( 'cantidad:' )
            // InternalRestaurante.g:49:9: 'cantidad:'
            {
            match("cantidad:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:50:7: ( 'medida:' )
            // InternalRestaurante.g:50:9: 'medida:'
            {
            match("medida:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:51:7: ( 'energia:' )
            // InternalRestaurante.g:51:9: 'energia:'
            {
            match("energia:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:52:7: ( 'grasas:' )
            // InternalRestaurante.g:52:9: 'grasas:'
            {
            match("grasas:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:53:7: ( 'hidratos:' )
            // InternalRestaurante.g:53:9: 'hidratos:'
            {
            match("hidratos:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:54:7: ( 'proteinas:' )
            // InternalRestaurante.g:54:9: 'proteinas:'
            {
            match("proteinas:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:55:7: ( 'sal:' )
            // InternalRestaurante.g:55:9: 'sal:'
            {
            match("sal:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:56:7: ( 'Menu:' )
            // InternalRestaurante.g:56:9: 'Menu:'
            {
            match("Menu:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:57:7: ( 'Tama\\u00F1o:' )
            // InternalRestaurante.g:57:9: 'Tama\\u00F1o:'
            {
            match("Tama\u00F1o:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:58:7: ( 'Productos:' )
            // InternalRestaurante.g:58:9: 'Productos:'
            {
            match("Productos:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:59:7: ( 'Y' )
            // InternalRestaurante.g:59:9: 'Y'
            {
            match('Y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:60:7: ( '(' )
            // InternalRestaurante.g:60:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:61:7: ( ')' )
            // InternalRestaurante.g:61:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:62:7: ( 'O' )
            // InternalRestaurante.g:62:9: 'O'
            {
            match('O'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:63:7: ( 'alergenico' )
            // InternalRestaurante.g:63:9: 'alergenico'
            {
            match("alergenico"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:64:7: ( 'ensalada' )
            // InternalRestaurante.g:64:9: 'ensalada'
            {
            match("ensalada"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:65:7: ( 'helado' )
            // InternalRestaurante.g:65:9: 'helado'
            {
            match("helado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "RULE_FECHA"
    public final void mRULE_FECHA() throws RecognitionException {
        try {
            int _type = RULE_FECHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:5695:12: ( '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRestaurante.g:5695:14: '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '-' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            match('-'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FECHA"

    // $ANTLR start "RULE_URL"
    public final void mRULE_URL() throws RecognitionException {
        try {
            int _type = RULE_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:5697:10: ( ( 'http' | 'https' ) '://' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '(' | ')' | '\\\\' | '/' | '.' | '0' .. '9' )+ )
            // InternalRestaurante.g:5697:12: ( 'http' | 'https' ) '://' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '(' | ')' | '\\\\' | '/' | '.' | '0' .. '9' )+
            {
            // InternalRestaurante.g:5697:12: ( 'http' | 'https' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='h') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='t') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='t') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='p') ) {
                            int LA1_4 = input.LA(5);

                            if ( (LA1_4=='s') ) {
                                alt1=2;
                            }
                            else if ( (LA1_4==':') ) {
                                alt1=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRestaurante.g:5697:13: 'http'
                    {
                    match("http"); 


                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:5697:20: 'https'
                    {
                    match("https"); 


                    }
                    break;

            }

            match("://"); 

            // InternalRestaurante.g:5697:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '(' | ')' | '\\\\' | '/' | '.' | '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='(' && LA2_0<=')')||(LA2_0>='-' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='\\'||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRestaurante.g:
            	    {
            	    if ( (input.LA(1)>='(' && input.LA(1)<=')')||(input.LA(1)>='-' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_URL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:5699:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRestaurante.g:5699:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRestaurante.g:5699:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRestaurante.g:5699:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRestaurante.g:5699:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRestaurante.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:5701:10: ( ( '0' .. '9' )+ )
            // InternalRestaurante.g:5701:12: ( '0' .. '9' )+
            {
            // InternalRestaurante.g:5701:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRestaurante.g:5701:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:5703:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRestaurante.g:5703:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRestaurante.g:5703:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRestaurante.g:5703:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRestaurante.g:5703:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRestaurante.g:5703:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRestaurante.g:5703:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRestaurante.g:5703:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRestaurante.g:5703:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRestaurante.g:5703:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRestaurante.g:5703:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:5705:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRestaurante.g:5705:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRestaurante.g:5705:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRestaurante.g:5705:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:5707:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalRestaurante.g:5707:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalRestaurante.g:5707:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRestaurante.g:5707:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalRestaurante.g:5707:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRestaurante.g:5707:41: ( '\\r' )? '\\n'
                    {
                    // InternalRestaurante.g:5707:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRestaurante.g:5707:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:5709:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRestaurante.g:5709:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRestaurante.g:5709:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRestaurante.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRestaurante.g:5711:16: ( . )
            // InternalRestaurante.g:5711:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRestaurante.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_FECHA | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=64;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalRestaurante.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalRestaurante.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalRestaurante.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalRestaurante.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalRestaurante.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalRestaurante.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalRestaurante.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalRestaurante.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalRestaurante.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalRestaurante.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalRestaurante.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalRestaurante.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalRestaurante.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalRestaurante.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalRestaurante.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalRestaurante.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalRestaurante.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalRestaurante.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalRestaurante.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalRestaurante.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalRestaurante.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalRestaurante.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalRestaurante.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalRestaurante.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalRestaurante.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalRestaurante.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalRestaurante.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalRestaurante.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalRestaurante.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalRestaurante.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalRestaurante.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalRestaurante.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalRestaurante.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalRestaurante.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalRestaurante.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalRestaurante.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // InternalRestaurante.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // InternalRestaurante.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // InternalRestaurante.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // InternalRestaurante.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // InternalRestaurante.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // InternalRestaurante.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // InternalRestaurante.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // InternalRestaurante.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // InternalRestaurante.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // InternalRestaurante.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // InternalRestaurante.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // InternalRestaurante.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // InternalRestaurante.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // InternalRestaurante.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // InternalRestaurante.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // InternalRestaurante.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // InternalRestaurante.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // InternalRestaurante.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // InternalRestaurante.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // InternalRestaurante.g:1:340: RULE_FECHA
                {
                mRULE_FECHA(); 

                }
                break;
            case 57 :
                // InternalRestaurante.g:1:351: RULE_URL
                {
                mRULE_URL(); 

                }
                break;
            case 58 :
                // InternalRestaurante.g:1:360: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 59 :
                // InternalRestaurante.g:1:368: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 60 :
                // InternalRestaurante.g:1:377: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 61 :
                // InternalRestaurante.g:1:389: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 62 :
                // InternalRestaurante.g:1:405: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 63 :
                // InternalRestaurante.g:1:421: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 64 :
                // InternalRestaurante.g:1:429: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\6\52\1\71\4\52\2\uffff\4\52\1\uffff\10\52\1\123\2\uffff\1\52\1\130\1\46\1\uffff\3\46\2\uffff\3\52\1\uffff\16\52\1\uffff\7\52\2\uffff\5\52\1\uffff\12\52\3\uffff\1\52\1\130\5\uffff\53\52\1\uffff\21\52\1\u00c6\27\52\1\uffff\7\52\1\u00e6\4\52\1\u00eb\1\u00ec\1\u00ed\1\uffff\2\52\2\uffff\4\52\1\u00f4\1\uffff\5\52\1\uffff\12\52\1\uffff\3\52\1\u0107\4\52\1\uffff\2\52\1\u010e\1\52\3\uffff\1\u0110\1\52\1\u0112\3\52\1\uffff\5\52\1\uffff\7\52\1\u0122\2\52\1\u0125\1\52\1\uffff\3\52\1\u012a\2\52\1\uffff\1\u012d\1\uffff\1\52\1\uffff\6\52\1\uffff\1\52\1\uffff\1\52\1\uffff\2\52\1\uffff\1\52\1\uffff\2\52\1\uffff\3\52\1\u0141\1\uffff\2\52\1\uffff\7\52\3\uffff\1\52\1\uffff\1\u014c\6\52\1\uffff\1\u0153\1\52\1\u0155\4\52\1\u015b\1\52\3\uffff\5\52\1\uffff\1\52\1\uffff\4\52\4\uffff\1\u0167\1\52\1\u0169\6\52\1\uffff\1\52\1\uffff\1\52\2\uffff\1\52\1\u0174\1\u0176\1\uffff\2\52\4\uffff\2\52\1\u017b\1\52\1\uffff\1\u017d\1\uffff";
    static final String DFA14_eofS =
        "\u017e\uffff";
    static final String DFA14_minS =
        "\1\0\1\111\1\103\1\105\1\101\2\122\1\60\1\101\2\145\1\156\2\uffff\1\157\1\156\1\157\1\141\1\uffff\1\145\1\141\1\145\1\156\1\162\1\145\1\162\1\141\1\60\2\uffff\1\154\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\116\1\122\1\164\1\uffff\1\105\1\125\1\126\1\123\1\103\1\155\1\104\1\110\1\114\1\156\1\101\1\117\1\155\1\105\1\uffff\1\116\3\163\1\143\1\164\1\147\2\uffff\1\151\1\163\1\146\1\164\1\154\1\uffff\1\142\1\156\1\144\1\145\1\141\1\144\1\154\1\164\1\157\1\154\3\uffff\1\145\1\55\5\uffff\1\107\1\115\1\162\1\111\4\101\1\160\1\105\1\124\1\117\1\113\1\165\1\116\1\120\1\141\2\117\1\143\2\164\1\150\1\157\1\162\1\144\1\156\1\164\2\157\1\163\1\151\1\164\1\151\1\162\1\141\1\163\1\162\1\141\1\160\1\164\1\72\1\162\1\uffff\1\125\1\101\1\151\1\124\1\102\1\114\1\122\1\137\1\154\1\116\1\101\1\125\1\101\1\72\1\104\1\111\1\u00f1\1\60\1\116\2\162\2\141\1\72\1\145\1\165\1\143\1\162\1\125\1\72\1\141\1\144\1\151\1\144\1\147\1\154\2\141\1\144\1\72\1\145\1\uffff\1\147\1\116\1\114\1\143\1\105\1\117\1\114\1\60\1\103\1\145\1\101\1\132\3\60\1\uffff\1\105\1\103\2\uffff\1\105\2\151\1\165\1\60\1\uffff\1\144\1\143\1\151\1\145\1\122\1\uffff\1\40\1\141\1\144\1\141\1\151\1\141\1\163\1\164\1\157\1\72\1\uffff\1\151\1\145\1\101\1\60\1\151\1\137\1\116\1\105\1\uffff\1\117\1\155\1\60\1\101\3\uffff\1\60\1\101\1\60\1\160\1\142\1\162\1\uffff\1\151\1\164\1\160\1\72\1\114\1\uffff\1\40\1\141\1\72\1\141\1\144\1\72\1\157\1\60\2\156\1\60\1\131\1\uffff\1\157\1\131\1\101\1\60\1\114\1\145\1\uffff\1\60\1\uffff\1\116\1\uffff\1\143\1\165\1\141\1\145\1\157\1\141\1\uffff\1\72\1\143\1\144\1\uffff\1\72\1\141\1\uffff\1\163\1\uffff\1\141\1\151\1\uffff\1\137\1\156\1\137\1\60\1\uffff\1\101\1\156\1\uffff\1\101\2\151\2\156\1\163\1\154\3\uffff\1\72\1\uffff\1\60\1\72\1\163\1\143\1\107\1\141\1\126\1\uffff\1\60\1\164\1\60\1\157\1\144\2\164\1\60\1\72\3\uffff\1\72\1\157\1\122\1\154\1\111\1\uffff\1\157\1\uffff\1\156\1\157\2\145\4\uffff\1\60\1\101\1\60\1\116\2\72\1\162\1\163\1\72\1\uffff\1\116\1\uffff\1\101\2\uffff\1\72\2\60\1\uffff\1\104\1\107\4\uffff\1\105\1\122\1\60\1\105\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\165\1\121\1\157\1\145\1\122\1\141\1\172\1\151\1\145\1\157\1\156\2\uffff\1\162\1\156\1\157\1\141\1\uffff\1\145\1\141\1\145\1\156\1\162\1\164\1\162\1\141\1\172\2\uffff\1\154\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\116\1\122\1\164\1\uffff\1\105\1\125\1\126\1\123\1\103\1\155\1\123\1\110\1\114\1\156\1\101\1\117\1\155\1\105\1\uffff\1\116\3\163\1\143\1\164\1\147\2\uffff\1\157\1\163\1\146\1\164\1\154\1\uffff\1\142\1\156\1\144\1\163\1\141\1\144\1\154\1\164\1\157\1\154\3\uffff\1\145\1\55\5\uffff\1\107\1\115\1\162\1\111\4\101\1\160\1\105\1\124\1\117\1\113\1\165\1\116\1\120\1\141\2\117\1\143\2\164\1\150\1\157\1\162\1\144\1\156\1\164\2\157\1\163\1\151\1\164\1\151\1\162\1\141\1\163\1\162\1\141\1\160\1\164\1\72\1\162\1\uffff\1\125\1\101\1\151\1\124\1\102\1\114\1\122\1\137\1\154\1\116\1\101\1\125\1\101\1\163\1\104\1\111\1\u00f1\1\172\1\116\2\162\2\141\1\72\1\145\1\165\1\143\1\162\1\125\1\72\1\141\1\144\1\151\1\144\1\147\1\154\2\141\1\144\1\163\1\145\1\uffff\1\147\1\116\1\114\1\143\1\105\1\117\1\114\1\172\1\103\1\145\1\101\1\132\3\172\1\uffff\1\105\1\103\2\uffff\1\105\2\151\1\165\1\172\1\uffff\1\144\1\143\1\151\1\145\1\122\1\uffff\1\40\1\141\1\144\1\141\1\151\1\141\1\163\1\164\1\157\1\72\1\uffff\1\151\1\145\1\101\1\172\1\151\1\137\1\116\1\105\1\uffff\1\117\1\155\1\172\1\101\3\uffff\1\172\1\101\1\172\1\160\1\142\1\162\1\uffff\1\151\1\164\1\160\1\72\1\114\1\uffff\1\40\1\141\1\72\1\141\1\144\1\72\1\157\1\172\2\156\1\172\1\131\1\uffff\1\157\1\131\1\101\1\172\1\114\1\145\1\uffff\1\172\1\uffff\1\116\1\uffff\1\143\1\165\1\141\1\145\1\157\1\141\1\uffff\1\72\1\146\1\144\1\uffff\1\72\1\141\1\uffff\1\163\1\uffff\1\141\1\151\1\uffff\1\137\1\156\1\137\1\172\1\uffff\1\101\1\156\1\uffff\1\101\2\151\2\156\1\163\1\154\3\uffff\1\72\1\uffff\1\172\1\72\1\163\1\143\1\107\1\141\1\126\1\uffff\1\172\1\164\1\172\1\157\1\144\2\164\1\172\1\72\3\uffff\1\72\1\157\1\122\1\154\1\111\1\uffff\1\157\1\uffff\1\156\1\157\2\145\4\uffff\1\172\1\101\1\172\1\116\2\72\1\162\2\163\1\uffff\1\116\1\uffff\1\101\2\uffff\1\72\2\172\1\uffff\1\104\1\107\4\uffff\1\105\1\122\1\172\1\105\1\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\14\uffff\1\24\1\25\4\uffff\1\40\11\uffff\1\62\1\63\3\uffff\1\72\3\uffff\1\77\1\100\3\uffff\1\72\16\uffff\1\64\7\uffff\1\24\1\25\5\uffff\1\40\12\uffff\1\61\1\62\1\63\2\uffff\1\73\1\74\1\75\1\76\1\77\53\uffff\1\70\51\uffff\1\55\17\uffff\1\56\2\uffff\1\57\1\16\5\uffff\1\32\5\uffff\1\35\12\uffff\1\71\10\uffff\1\3\4\uffff\1\13\1\17\1\27\6\uffff\1\22\5\uffff\1\36\14\uffff\1\6\6\uffff\1\4\1\uffff\1\7\1\uffff\1\20\6\uffff\1\46\3\uffff\1\50\2\uffff\1\52\1\uffff\1\67\2\uffff\1\1\4\uffff\1\14\2\uffff\1\5\7\uffff\1\31\1\43\1\45\1\uffff\1\51\7\uffff\1\12\11\uffff\1\47\1\66\1\53\5\uffff\1\11\1\uffff\1\15\4\uffff\1\60\1\26\1\33\1\54\11\uffff\1\65\1\uffff\1\41\1\uffff\1\42\1\34\3\uffff\1\30\2\uffff\1\44\1\21\1\37\1\23\4\uffff\1\10\1\uffff\1\2";
    static final String DFA14_specialS =
        "\1\0\41\uffff\1\2\1\1\u015a\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\46\1\42\4\46\1\43\1\34\1\35\2\46\1\22\2\46\1\44\12\37\7\46\1\2\1\23\1\3\1\10\1\41\1\20\1\5\1\41\1\13\3\41\1\4\1\1\1\7\1\16\1\41\1\11\1\21\1\6\4\41\1\33\1\41\3\46\1\40\1\41\1\46\1\36\1\41\1\24\1\41\1\26\1\12\1\27\1\30\1\17\3\41\1\25\2\41\1\31\2\41\1\32\7\41\1\14\1\46\1\15\uff82\46",
            "\1\47\5\uffff\1\50\45\uffff\1\51",
            "\1\53\10\uffff\1\55\4\uffff\1\54",
            "\1\56\11\uffff\1\57\37\uffff\1\60",
            "\1\62\7\uffff\1\63\5\uffff\1\61\25\uffff\1\64",
            "\1\65",
            "\1\66\16\uffff\1\67",
            "\12\52\7\uffff\21\52\1\70\10\52\4\uffff\1\52\1\uffff\32\52",
            "\1\72\43\uffff\1\73\3\uffff\1\74",
            "\1\75",
            "\1\76\11\uffff\1\77",
            "\1\100",
            "",
            "",
            "\1\104\2\uffff\1\103",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\117\3\uffff\1\116\12\uffff\1\120",
            "\1\121",
            "\1\122",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\126",
            "\12\127",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\0\131",
            "\0\131",
            "\1\132\4\uffff\1\133",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146\16\uffff\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "",
            "",
            "\1\167\5\uffff\1\166",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177\15\uffff\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c2\70\uffff\1\u00c1",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dd\70\uffff\1\u00dc",
            "\1\u00de",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u00dd",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\52\7\uffff\32\52\4\uffff\1\u0106\1\uffff\32\52",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "\1\u010d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010f",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0111",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0123",
            "\1\u0124",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u012b",
            "\1\u012c",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u012e",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0137\2\uffff\1\u0136",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "",
            "",
            "",
            "\1\u014b",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0154",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\12\52\1\u015a\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u015c",
            "",
            "",
            "",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "",
            "\1\u0162",
            "",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0168",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u0170\70\uffff\1\u016f",
            "",
            "\1\u0171",
            "",
            "\1\u0172",
            "",
            "",
            "\1\u0173",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\1\u0175\6\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0177",
            "\1\u0178",
            "",
            "",
            "",
            "",
            "\1\u0179",
            "\1\u017a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u017c",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_FECHA | RULE_URL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='N') ) {s = 1;}

                        else if ( (LA14_0=='A') ) {s = 2;}

                        else if ( (LA14_0=='C') ) {s = 3;}

                        else if ( (LA14_0=='M') ) {s = 4;}

                        else if ( (LA14_0=='G') ) {s = 5;}

                        else if ( (LA14_0=='T') ) {s = 6;}

                        else if ( (LA14_0=='O') ) {s = 7;}

                        else if ( (LA14_0=='D') ) {s = 8;}

                        else if ( (LA14_0=='R') ) {s = 9;}

                        else if ( (LA14_0=='f') ) {s = 10;}

                        else if ( (LA14_0=='I') ) {s = 11;}

                        else if ( (LA14_0=='{') ) {s = 12;}

                        else if ( (LA14_0=='}') ) {s = 13;}

                        else if ( (LA14_0=='P') ) {s = 14;}

                        else if ( (LA14_0=='i') ) {s = 15;}

                        else if ( (LA14_0=='F') ) {s = 16;}

                        else if ( (LA14_0=='S') ) {s = 17;}

                        else if ( (LA14_0==',') ) {s = 18;}

                        else if ( (LA14_0=='B') ) {s = 19;}

                        else if ( (LA14_0=='c') ) {s = 20;}

                        else if ( (LA14_0=='m') ) {s = 21;}

                        else if ( (LA14_0=='e') ) {s = 22;}

                        else if ( (LA14_0=='g') ) {s = 23;}

                        else if ( (LA14_0=='h') ) {s = 24;}

                        else if ( (LA14_0=='p') ) {s = 25;}

                        else if ( (LA14_0=='s') ) {s = 26;}

                        else if ( (LA14_0=='Y') ) {s = 27;}

                        else if ( (LA14_0=='(') ) {s = 28;}

                        else if ( (LA14_0==')') ) {s = 29;}

                        else if ( (LA14_0=='a') ) {s = 30;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 31;}

                        else if ( (LA14_0=='^') ) {s = 32;}

                        else if ( (LA14_0=='E'||LA14_0=='H'||(LA14_0>='J' && LA14_0<='L')||LA14_0=='Q'||(LA14_0>='U' && LA14_0<='X')||LA14_0=='Z'||LA14_0=='_'||LA14_0=='b'||LA14_0=='d'||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='n' && LA14_0<='o')||(LA14_0>='q' && LA14_0<='r')||(LA14_0>='t' && LA14_0<='z')) ) {s = 33;}

                        else if ( (LA14_0=='\"') ) {s = 34;}

                        else if ( (LA14_0=='\'') ) {s = 35;}

                        else if ( (LA14_0=='/') ) {s = 36;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 37;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_35 = input.LA(1);

                        s = -1;
                        if ( ((LA14_35>='\u0000' && LA14_35<='\uFFFF')) ) {s = 89;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_34 = input.LA(1);

                        s = -1;
                        if ( ((LA14_34>='\u0000' && LA14_34<='\uFFFF')) ) {s = 89;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}