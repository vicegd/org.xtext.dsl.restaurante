package org.xtext.dsl.restaurante.ui.contentassist

import org.xtext.dsl.restaurante.restaurante.Restaurante
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import java.text.SimpleDateFormat
import java.util.Calendar
import org.eclipse.xtext.RuleCall
import org.eclipse.emf.ecore.EObject
import org.xtext.dsl.restaurante.restaurante.Ingrediente
import org.xtext.dsl.restaurante.restaurante.Principal

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class RestauranteProposalProvider extends AbstractRestauranteProposalProvider {
	
	override void complete_Ingrediente(EObject o, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		var propuesta = createCompletionProposal("Ingrediente: CODIGO 'NOMBRE' infoURL: http://www.ejemplo.com", context)
		acceptor.accept(propuesta)
	}
	
	def void completeIngrediente_Name(Ingrediente i, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeIngrediente_Name(i, assignment, context, acceptor)
		
		var r = i.eContainer as Restaurante
		var id = "CODI" + (r.ingredientes.filter(typeof(Ingrediente)).size);
		var propuesta = createCompletionProposal(id, context)
		acceptor.accept(propuesta)
	}
	
	def void completeRestaurante_Fecha(Restaurante r, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeRestaurante_Fecha(r, assignment, context, acceptor)
		
		var formateadorFecha = new SimpleDateFormat("dd-MM-yyyy")
		var calendario = Calendar.getInstance()
		val fecha = formateadorFecha.format(calendario.getTime())
		var propuesta = createCompletionProposal(fecha, context)
		acceptor.accept(propuesta)
	}
	
	def void completePrincipal_Foto(Principal p, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completePrincipal_Foto(p, assignment, context, acceptor)
		
		var nombreFoto = "'producto_" + p.nombre.replace(" ", "_").toLowerCase()
		nombreFoto = nombreFoto + ".png'"
		var propuesta = createCompletionProposal(nombreFoto, context)
		acceptor.accept(propuesta)
	}
	
	def void completePrincipal_Name(Principal p, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completePrincipal_Name(p, assignment, context, acceptor)
		
		var r = p.eContainer as Restaurante
		var id = "CODP" + (r.productos.filter(typeof(Principal)).size);
		var propuesta = createCompletionProposal(id, context)
		acceptor.accept(propuesta)
	}
	
	override void complete_Nutricional(EObject o, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		var propuesta = createCompletionProposal("{
			cantidad: 0 medida: 'unidad'
			energia: 0
			grasas: 0
			hidratos: 0
			proteinas: 0
			sal: 0
		}", context)
		acceptor.accept(propuesta)
	}
}
