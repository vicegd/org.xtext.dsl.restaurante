package org.xtext.dsl.restaurante.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.xtext.dsl.restaurante.restaurante.Ingrediente
import org.xtext.dsl.restaurante.restaurante.Nutricional
import org.xtext.dsl.restaurante.restaurante.Producto
import org.xtext.dsl.restaurante.restaurante.Restaurante
import org.xtext.dsl.restaurante.restaurante.Menu

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class RestauranteLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

 	def image(Restaurante r) {
		'restaurante.ico'
	}

	def text(Ingrediente i) {
		'Ingrediente ' + i.name + ' (' + i.nombre + ')'
	}
	
	def image(Ingrediente i) {
		'ingrediente.ico'
	}
	
	def text(Producto p) {
		'Producto ' + p.name + ' (' + p.nombre + ')'
	}
	
	def image(Producto p) {
		'producto.ico'
	}
	
	def text(Nutricional n) {
		'Informaci�n nutricional para ' + n.cantidad + n.unidad
	}
	
	def image(Nutricional n) {
		'nutricional.ico'
	}
	
	def text(Menu m) {
		'Menu ' + m.name + ' (' + m.nombre + ')'
	}
	
	def image(Menu m) {
		'menu.png'
	}
	
	//A�adido para mostrar el valor en las etiquetas que a�adimos extras en el �rbol outline
	def text(EAttribute a) { 
		a.name + ": " + a.defaultValue
	}
}