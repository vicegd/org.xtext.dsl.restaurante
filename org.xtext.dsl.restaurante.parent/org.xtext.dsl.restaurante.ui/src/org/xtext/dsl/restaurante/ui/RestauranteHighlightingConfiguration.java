package org.xtext.dsl.restaurante.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class RestauranteHighlightingConfiguration implements IHighlightingConfiguration {
	public static final String NORMAL = "Texto por defecto";
	public static final String CADENA_TEXTO = "Cadena de texto";
	public static final String PALABRA_CLAVE = "Palabra clave"; 
	public static final String PALABRA_CLAVE_PRINCIPAL = "Palabra clave principal"; 
	public static final String REFERENCIA_CRUZADA = "Referencia cruzada";
	public static final String COMENTARIO = "Comentario";
	public static final String NUMERO = "Numero";
	public static final String ID = "Identificador";
	public static final String FONDO_CABECERA = "Fondo de la cabecera";

	//se configuran los diferentes estilos utilizando un ID, una cadena descriptiva y el estilo
	//todos ellos aparecerán en Windows -> Preferences- > Restaurante -> Syntax Coloring
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		//se utiliza un ID único para que se pueda acceder desde la clase Calculator
		incluirTipo(acceptor, NORMAL, new RGB(0, 0, 0), new RGB(255, 255, 255), SWT.NORMAL);
		incluirTipo(acceptor, CADENA_TEXTO, new RGB(0, 0, 255), new RGB(255, 255, 255), SWT.NORMAL);
		incluirTipo(acceptor, PALABRA_CLAVE, new RGB(228, 11, 111), new RGB(255, 255, 255), SWT.BOLD);
		incluirTipo(acceptor, PALABRA_CLAVE_PRINCIPAL, new RGB(255, 20, 20), new RGB(255, 255, 255), SWT.BOLD);
		incluirTipo(acceptor, REFERENCIA_CRUZADA, new RGB(208, 200, 200), new RGB(255, 255, 255), SWT.ITALIC);
		incluirTipo(acceptor, COMENTARIO, new RGB(150, 200, 200), new RGB(255, 255, 255), SWT.NORMAL);
		incluirTipo(acceptor, NUMERO, new RGB(115, 237, 185), new RGB(255, 255, 255), SWT.NORMAL);
		incluirTipo(acceptor, ID, new RGB(14, 4, 40), new RGB(242, 236, 236), SWT.NORMAL);
		incluirTipo(acceptor, FONDO_CABECERA, new RGB(251, 238, 217));
	}

	public void incluirTipo(IHighlightingConfigurationAcceptor acceptor, String s, RGB rgbD, RGB rgbT, int estilo) {
		TextStyle estiloTexto = new TextStyle();
		estiloTexto.setColor(rgbD);
		estiloTexto.setBackgroundColor(rgbT);
		estiloTexto.setStyle(estilo);
		//FontData f = new FontData();
		//f.setHeight(7);
		//textStyle.setFontData(f);
		acceptor.acceptDefaultHighlighting(s, s, estiloTexto);
	}
	
	public void incluirTipo(IHighlightingConfigurationAcceptor acceptor, String s, RGB rgbT) {
		TextStyle estiloTexto = new TextStyle();
		estiloTexto.setBackgroundColor(rgbT);
		acceptor.acceptDefaultHighlighting(s, s, estiloTexto);
	}

}