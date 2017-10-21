package org.xtext.dsl.restaurante.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.xtext.dsl.restaurante.restaurante.Ingrediente;
import org.xtext.dsl.restaurante.restaurante.Menu;
import org.xtext.dsl.restaurante.restaurante.Nutricional;
import org.xtext.dsl.restaurante.restaurante.Producto;
import org.xtext.dsl.restaurante.restaurante.Restaurante;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class RestauranteLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public RestauranteLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String image(final Restaurante r) {
    return "restaurante.ico";
  }
  
  public String text(final Ingrediente i) {
    String _name = i.getName();
    String _plus = ("Ingrediente " + _name);
    String _plus_1 = (_plus + " (");
    String _nombre = i.getNombre();
    String _plus_2 = (_plus_1 + _nombre);
    return (_plus_2 + ")");
  }
  
  public String image(final Ingrediente i) {
    return "ingrediente.ico";
  }
  
  public String text(final Producto p) {
    String _name = p.getName();
    String _plus = ("Producto " + _name);
    String _plus_1 = (_plus + " (");
    String _nombre = p.getNombre();
    String _plus_2 = (_plus_1 + _nombre);
    return (_plus_2 + ")");
  }
  
  public String image(final Producto p) {
    return "producto.ico";
  }
  
  public String text(final Nutricional n) {
    String _cantidad = n.getCantidad();
    String _plus = ("Información nutricional para " + _cantidad);
    String _unidad = n.getUnidad();
    return (_plus + _unidad);
  }
  
  public String image(final Nutricional n) {
    return "nutricional.ico";
  }
  
  public String text(final Menu m) {
    String _name = m.getName();
    String _plus = ("Menu " + _name);
    String _plus_1 = (_plus + " (");
    String _nombre = m.getNombre();
    String _plus_2 = (_plus_1 + _nombre);
    return (_plus_2 + ")");
  }
  
  public String image(final Menu m) {
    return "menu.png";
  }
  
  public String text(final EAttribute a) {
    String _name = a.getName();
    String _plus = (_name + ": ");
    Object _defaultValue = a.getDefaultValue();
    return (_plus + _defaultValue);
  }
}
