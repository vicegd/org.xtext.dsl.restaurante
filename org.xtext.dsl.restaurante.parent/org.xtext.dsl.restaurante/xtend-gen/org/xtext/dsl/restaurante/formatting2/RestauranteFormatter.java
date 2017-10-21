package org.xtext.dsl.restaurante.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.xtext.dsl.restaurante.restaurante.Ingrediente;
import org.xtext.dsl.restaurante.restaurante.Restaurante;
import org.xtext.dsl.restaurante.services.RestauranteGrammarAccess;

@SuppressWarnings("all")
public class RestauranteFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RestauranteGrammarAccess _restauranteGrammarAccess;
  
  protected void _format(final Restaurante restaurante, @Extension final IFormattableDocument document) {
    final ISemanticRegion open = this.textRegionExtensions.regionFor(restaurante).keyword("{");
    final ISemanticRegion close = this.textRegionExtensions.regionFor(restaurante).keyword("}");
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open, close, _function_1);
    final Consumer<Ingrediente> _function_2 = (Ingrediente it) -> {
      final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it_1) -> {
        it_1.newLine();
      };
      document.<Ingrediente>prepend(it, _function_3);
    };
    restaurante.getIngredientes().forEach(_function_2);
  }
  
  public void format(final Object restaurante, final IFormattableDocument document) {
    if (restaurante instanceof XtextResource) {
      _format((XtextResource)restaurante, document);
      return;
    } else if (restaurante instanceof Restaurante) {
      _format((Restaurante)restaurante, document);
      return;
    } else if (restaurante instanceof EObject) {
      _format((EObject)restaurante, document);
      return;
    } else if (restaurante == null) {
      _format((Void)null, document);
      return;
    } else if (restaurante != null) {
      _format(restaurante, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(restaurante, document).toString());
    }
  }
}
