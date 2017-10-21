package org.xtext.dsl.restaurante.ui.contentassist;

import com.google.common.collect.Iterables;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.dsl.restaurante.restaurante.Ingrediente;
import org.xtext.dsl.restaurante.restaurante.Principal;
import org.xtext.dsl.restaurante.restaurante.Restaurante;
import org.xtext.dsl.restaurante.ui.contentassist.AbstractRestauranteProposalProvider;

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
@SuppressWarnings("all")
public class RestauranteProposalProvider extends AbstractRestauranteProposalProvider {
  @Override
  public void complete_Ingrediente(final EObject o, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal propuesta = this.createCompletionProposal("Ingrediente: CODIGO \'NOMBRE\' infoURL: http://www.ejemplo.com", context);
    acceptor.accept(propuesta);
  }
  
  public void completeIngrediente_Name(final Ingrediente i, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeIngrediente_Name(i, assignment, context, acceptor);
    EObject _eContainer = i.eContainer();
    Restaurante r = ((Restaurante) _eContainer);
    int _size = IterableExtensions.size(Iterables.<Ingrediente>filter(r.getIngredientes(), Ingrediente.class));
    String id = ("CODI" + Integer.valueOf(_size));
    ICompletionProposal propuesta = this.createCompletionProposal(id, context);
    acceptor.accept(propuesta);
  }
  
  public void completeRestaurante_Fecha(final Restaurante r, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeRestaurante_Fecha(r, assignment, context, acceptor);
    SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd-MM-yyyy");
    Calendar calendario = Calendar.getInstance();
    final String fecha = formateadorFecha.format(calendario.getTime());
    ICompletionProposal propuesta = this.createCompletionProposal(fecha, context);
    acceptor.accept(propuesta);
  }
  
  public void completePrincipal_Foto(final Principal p, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completePrincipal_Foto(p, assignment, context, acceptor);
    String _lowerCase = p.getNombre().replace(" ", "_").toLowerCase();
    String nombreFoto = ("\'producto_" + _lowerCase);
    nombreFoto = (nombreFoto + ".png\'");
    ICompletionProposal propuesta = this.createCompletionProposal(nombreFoto, context);
    acceptor.accept(propuesta);
  }
  
  public void completePrincipal_Name(final Principal p, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completePrincipal_Name(p, assignment, context, acceptor);
    EObject _eContainer = p.eContainer();
    Restaurante r = ((Restaurante) _eContainer);
    int _size = IterableExtensions.size(Iterables.<Principal>filter(r.getProductos(), Principal.class));
    String id = ("CODP" + Integer.valueOf(_size));
    ICompletionProposal propuesta = this.createCompletionProposal(id, context);
    acceptor.accept(propuesta);
  }
  
  @Override
  public void complete_Nutricional(final EObject o, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal propuesta = this.createCompletionProposal("{\r\n\t\t\tcantidad: 0 medida: \'unidad\'\r\n\t\t\tenergia: 0\r\n\t\t\tgrasas: 0\r\n\t\t\thidratos: 0\r\n\t\t\tproteinas: 0\r\n\t\t\tsal: 0\r\n\t\t}", context);
    acceptor.accept(propuesta);
  }
}
