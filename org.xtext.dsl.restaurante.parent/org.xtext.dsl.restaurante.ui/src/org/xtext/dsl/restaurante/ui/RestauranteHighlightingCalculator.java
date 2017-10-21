package org.xtext.dsl.restaurante.ui;

import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.xtext.dsl.restaurante.restaurante.Restaurante;

public class RestauranteHighlightingCalculator implements ISemanticHighlightingCalculator {

	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancel) {
		if (resource == null) return;

		INode raiz = resource.getParseResult().getRootNode();
		BidiTreeIterator<INode> it = raiz.getAsTreeIterable().iterator();
		
		while (it.hasNext()) {
			INode node = it.next();
			
			//Elementos gramaticales
			if (node.getGrammarElement() instanceof Keyword) {
				Keyword k = (Keyword)node.getGrammarElement();
				if (k.getValue().equals("Restaurantes") || k.getValue().equals("Ingredientes") ||k.getValue().equals("Productos") /*|| k.getValue().equals("Menus")*/) {
					acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.PALABRA_CLAVE_PRINCIPAL);
				} 
				else acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.PALABRA_CLAVE);
			}
			else if (node.getGrammarElement() instanceof CrossReference) {
				acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.REFERENCIA_CRUZADA);
			}
			else if (node.getGrammarElement() instanceof TerminalRule) { //reglas descolgadas del árbol
				TerminalRule t = (TerminalRule)node.getGrammarElement();
				if ((t.getName().equals("ML_COMMENT")) || (t.getName().equals("SL_COMMENT"))){
					acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.COMENTARIO);
				}
			}
			else if (node.getGrammarElement() instanceof RuleCall) { //todas las reglas del árbol
				RuleCall r = (RuleCall)node.getGrammarElement();
				//Para Java 1.7 --> problemas al exportar plugin si se utiliza SWITCH con STRINGS
				if (r.getRule().getName().equals("STRING"))
					acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.CADENA_TEXTO);
				else if ((r.getRule().getName().equals("Float"))||(r.getRule().getName().equals("INT")))
					acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.NUMERO);
				else if (r.getRule().getName().equals("ID"))
					acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.ID);
				else acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.NORMAL);
			}
			
			//Elementos semánticos
			if (node.getSemanticElement() instanceof Restaurante) {
				Restaurante r = (Restaurante)node.getSemanticElement();
				if (r.getNombre().equals("AsturDonals")){ //cuando es AsturDonals se cambia el fondo de las palabras clave dentro de Restaurante
					//Elemento gramatical dentro del elemento semántico
					if (node.getGrammarElement() instanceof Keyword) {
						acceptor.addPosition(node.getOffset(), node.getLength(), RestauranteHighlightingConfiguration.FONDO_CABECERA);	
					}				
				}
			} //if
		}
	}


}
