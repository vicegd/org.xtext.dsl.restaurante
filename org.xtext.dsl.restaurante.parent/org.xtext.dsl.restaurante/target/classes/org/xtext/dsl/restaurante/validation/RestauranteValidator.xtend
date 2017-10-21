package org.xtext.dsl.restaurante.validation

import org.eclipse.xtext.validation.Check
import org.xtext.dsl.restaurante.restaurante.Ingrediente
import org.xtext.dsl.restaurante.restaurante.RestaurantePackage
import org.xtext.dsl.restaurante.restaurante.Producto
import org.xtext.dsl.restaurante.restaurante.Nutricional
import org.xtext.dsl.restaurante.restaurante.Restaurante
import org.xtext.dsl.restaurante.restaurante.BebidaFria
import java.text.SimpleDateFormat
import java.util.Calendar

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class RestauranteValidator extends AbstractRestauranteValidator {
  	public static val INVALID_NAME = 'invalidName'
  	public static val FECHA_INVALIDA = 'feachInvalida'
  	public static val EXTENSION_INVALIDA = 'extensionInvalida'
  	public static val NOMBRE_MUY_LARGO = 'nombreMuyLargo'

	/* @Check
	def checkGreetingStartsWithCapital(Greeting greeting) {
		if (!Character.isUpperCase(greeting.name.charAt(0))) {
			warning('Name should start with a capital', 
					RestaurantePackage.Literals.GREETING__NAME,
					INVALID_NAME)
		}
	}*/
	
	@Check //Recomendación: los nombres de los ingredientes han de contener menos de 20 caracteres
	def checkDescripcion(Ingrediente ingrediente) {
		if (ingrediente.nombre.length >= 20) {
			warning("No se recomiendan nombres de ingredientes de más de 20 caracteres", 
				RestaurantePackage.Literals.INGREDIENTE__NOMBRE, NOMBRE_MUY_LARGO);
		}
	}
	
 	@Check //Recomendación: extensiones de archivos conocidas en productos
	def checkFoto(Producto producto) {
		if (!producto.foto.endsWith(".png")&&!producto.foto.endsWith(".gif")&&!producto.foto.endsWith(".jpg")) {
			warning("El nombre del archivo para la foto tiene una extensión no reconocida", 
				RestaurantePackage.Literals.PRODUCTO__FOTO, EXTENSION_INVALIDA);
		}
	}
	
	@Check //Recomendación: menos de 1000 calorías
	def checkNutricional(Nutricional nutricional) {
		if (Float.valueOf(nutricional.energia) >= 1000) {
			var producto = nutricional.eContainer as Producto;
			warning("No se recomienda que se exceda de las 1000 calorias en el producto " + producto.name, 
				RestaurantePackage.Literals.NUTRICIONAL__ENERGIA);
		}
	}
	
	@Check //La fecha tiene que ser igual o menor que la actual
	def checkFecha(Restaurante restaurante) {
		var formateadorFecha = new SimpleDateFormat("dd-MM-yyyy");
		var fechaDada = formateadorFecha.parse(restaurante.fecha);
		var fechaActual = Calendar.getInstance();
		if (fechaDada > fechaActual.time) {
			error("La fecha tiene que ser igual o menor que la actual", 
				RestaurantePackage.Literals.RESTAURANTE__FECHA, FECHA_INVALIDA);
		}
	}
	
	@Check //Identificadores de ingredientes únicos
	def checkIDIngredientes(Ingrediente ingrediente) {
		var restaurante = ingrediente.eContainer() as Restaurante;
		for (Ingrediente i : restaurante.ingredientes) {
			if ((!i.equals(ingrediente)) && (i.name.equals(ingrediente.name))) {
				error("Los identificadores de los ingredientes tienen que ser únicos", 
					RestaurantePackage.Literals.INGREDIENTE__NAME);
				return;
			}
		}
	}
	
	@Check //El número de bebidas frias >=2
	def checkNumeroProductos(Restaurante restaurante) {
		var i = 0;
		for (Producto p : restaurante.productos) {
			if (p instanceof BebidaFria) {
				i = i+1;
			}
		}
		if (i < 2) {
			error("El número de bebidas frías no es mayor o igual a dos", 
				RestaurantePackage.Literals.RESTAURANTE__PRODUCTOS);
		}
	}
	
}
