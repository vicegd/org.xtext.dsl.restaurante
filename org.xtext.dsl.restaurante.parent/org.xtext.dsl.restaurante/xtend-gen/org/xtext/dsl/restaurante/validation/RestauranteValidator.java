package org.xtext.dsl.restaurante.validation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.dsl.restaurante.restaurante.BebidaFria;
import org.xtext.dsl.restaurante.restaurante.Ingrediente;
import org.xtext.dsl.restaurante.restaurante.Nutricional;
import org.xtext.dsl.restaurante.restaurante.Producto;
import org.xtext.dsl.restaurante.restaurante.Restaurante;
import org.xtext.dsl.restaurante.restaurante.RestaurantePackage;
import org.xtext.dsl.restaurante.validation.AbstractRestauranteValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class RestauranteValidator extends AbstractRestauranteValidator {
  public final static String INVALID_NAME = "invalidName";
  
  public final static String FECHA_INVALIDA = "feachInvalida";
  
  public final static String EXTENSION_INVALIDA = "extensionInvalida";
  
  public final static String NOMBRE_MUY_LARGO = "nombreMuyLargo";
  
  /**
   * @Check
   * def checkGreetingStartsWithCapital(Greeting greeting) {
   * if (!Character.isUpperCase(greeting.name.charAt(0))) {
   * warning('Name should start with a capital',
   * RestaurantePackage.Literals.GREETING__NAME,
   * INVALID_NAME)
   * }
   * }
   */
  @Check
  public void checkDescripcion(final Ingrediente ingrediente) {
    int _length = ingrediente.getNombre().length();
    boolean _greaterEqualsThan = (_length >= 20);
    if (_greaterEqualsThan) {
      this.warning("No se recomiendan nombres de ingredientes de más de 20 caracteres", 
        RestaurantePackage.Literals.INGREDIENTE__NOMBRE, RestauranteValidator.NOMBRE_MUY_LARGO);
    }
  }
  
  @Check
  public void checkFoto(final Producto producto) {
    if ((((!producto.getFoto().endsWith(".png")) && (!producto.getFoto().endsWith(".gif"))) && (!producto.getFoto().endsWith(".jpg")))) {
      this.warning("El nombre del archivo para la foto tiene una extensión no reconocida", 
        RestaurantePackage.Literals.PRODUCTO__FOTO, RestauranteValidator.EXTENSION_INVALIDA);
    }
  }
  
  @Check
  public void checkNutricional(final Nutricional nutricional) {
    Float _valueOf = Float.valueOf(nutricional.getEnergia());
    boolean _greaterEqualsThan = ((_valueOf).floatValue() >= 1000);
    if (_greaterEqualsThan) {
      EObject _eContainer = nutricional.eContainer();
      Producto producto = ((Producto) _eContainer);
      String _name = producto.getName();
      String _plus = ("No se recomienda que se exceda de las 1000 calorias en el producto " + _name);
      this.warning(_plus, 
        RestaurantePackage.Literals.NUTRICIONAL__ENERGIA);
    }
  }
  
  @Check
  public void checkFecha(final Restaurante restaurante) {
    try {
      SimpleDateFormat formateadorFecha = new SimpleDateFormat("dd-MM-yyyy");
      Date fechaDada = formateadorFecha.parse(restaurante.getFecha());
      Calendar fechaActual = Calendar.getInstance();
      Date _time = fechaActual.getTime();
      boolean _greaterThan = (fechaDada.compareTo(_time) > 0);
      if (_greaterThan) {
        this.error("La fecha tiene que ser igual o menor que la actual", 
          RestaurantePackage.Literals.RESTAURANTE__FECHA, RestauranteValidator.FECHA_INVALIDA);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Check
  public void checkIDIngredientes(final Ingrediente ingrediente) {
    EObject _eContainer = ingrediente.eContainer();
    Restaurante restaurante = ((Restaurante) _eContainer);
    EList<Ingrediente> _ingredientes = restaurante.getIngredientes();
    for (final Ingrediente i : _ingredientes) {
      if (((!i.equals(ingrediente)) && i.getName().equals(ingrediente.getName()))) {
        this.error("Los identificadores de los ingredientes tienen que ser únicos", 
          RestaurantePackage.Literals.INGREDIENTE__NAME);
        return;
      }
    }
  }
  
  @Check
  public void checkNumeroProductos(final Restaurante restaurante) {
    int i = 0;
    EList<Producto> _productos = restaurante.getProductos();
    for (final Producto p : _productos) {
      if ((p instanceof BebidaFria)) {
        i = (i + 1);
      }
    }
    if ((i < 2)) {
      this.error("El número de bebidas frías no es mayor o igual a dos", 
        RestaurantePackage.Literals.RESTAURANTE__PRODUCTOS);
    }
  }
}
