/*
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.dsl.restaurante.parser.antlr.internal.InternalRestauranteParser;
import org.xtext.dsl.restaurante.services.RestauranteGrammarAccess;

public class RestauranteParser extends AbstractAntlrParser {

	@Inject
	private RestauranteGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRestauranteParser createParser(XtextTokenStream stream) {
		return new InternalRestauranteParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Restaurante";
	}

	public RestauranteGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RestauranteGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
