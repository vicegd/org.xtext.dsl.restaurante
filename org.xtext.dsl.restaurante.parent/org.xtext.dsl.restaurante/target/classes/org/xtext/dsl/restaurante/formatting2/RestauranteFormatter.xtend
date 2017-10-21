package org.xtext.dsl.restaurante.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.dsl.restaurante.restaurante.Ingrediente
import org.xtext.dsl.restaurante.restaurante.Restaurante
import org.xtext.dsl.restaurante.services.RestauranteGrammarAccess

class RestauranteFormatter extends AbstractFormatter2 {
	
	@Inject extension RestauranteGrammarAccess
	
	def dispatch void format(Restaurante restaurante, extension IFormattableDocument document) {
		val open = restaurante.regionFor.keyword("{")
		val close = restaurante.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]
		
		restaurante.ingredientes.forEach[ it.prepend[newLine] ]
	}
	
}