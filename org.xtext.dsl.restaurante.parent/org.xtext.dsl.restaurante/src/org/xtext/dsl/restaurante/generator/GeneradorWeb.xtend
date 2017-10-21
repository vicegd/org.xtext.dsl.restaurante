package org.xtext.dsl.restaurante.generator

import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.dsl.restaurante.restaurante.BebidaFria
import org.xtext.dsl.restaurante.restaurante.Ingrediente
import org.xtext.dsl.restaurante.restaurante.Menu
import org.xtext.dsl.restaurante.restaurante.Postre
import org.xtext.dsl.restaurante.restaurante.Principal
import org.xtext.dsl.restaurante.restaurante.Producto
import org.xtext.dsl.restaurante.restaurante.ProductoO
import org.xtext.dsl.restaurante.restaurante.ProductoY
import org.xtext.dsl.restaurante.restaurante.Restaurante
import org.xtext.dsl.restaurante.restaurante.SalsaRecomendada
import org.xtext.dsl.restaurante.restaurante.TamanioMenu

class GeneradorWeb {
	Resource resource;
	IFileSystemAccess fsa;
	
	new (Resource resource, IFileSystemAccess fsa) {
		this.resource = resource;
		this.fsa = fsa;
	}
	
	def compilar() {
		for(r: resource.allContents.toIterable.filter(typeof(Restaurante))){
			r.compilarTexto;
		}
	}
	
	def compilarTexto(Restaurante r) '''
		«fsa.generateFile("scripts/ingredientes_gen.inc", compilarIngredientes(r.ingredientes))»
		«fsa.generateFile("scripts/productos_gen.inc", compilarProductos(r.productos))»
		«fsa.generateFile("scripts/menus_gen.inc", compilarMenus(r.menus))»
	'''
	
	//INICIO PARTE WEB PARA INGREDIENTES
	def compilarIngredientes(List<Ingrediente> ingredientes) '''
		var code = '<table class="tingredientes">\
			<tr class="tingredientes_cabecera">\
				<td></td>\
				<td>Ingrediente</td>\
				<td>Alérgeno</td>\
			</tr>\
			«FOR i:ingredientes»
				«i.compilarTexto»
			«ENDFOR»
		</table>';
	'''
	
	def compilarTexto(Ingrediente i) '''
		<tr>\
			<td><img class="ingredientes" src="imagenes/«IF i.foto !== null»«i.foto»«ELSE»generico.jpg«ENDIF»" alt="«i.nombre» («i.name»)" title="«i.nombre» («i.name»)" /></td>\
			<td>«IF i.infoURL !== null»<a href="«i.infoURL»" target="_blank">«i.nombre»</a>«ELSE»«i.nombre»«ENDIF»</td>\
			<td><img class="alergenos" src="imagenes/«IF i.alergenico»alergeno.png«ELSE»noalergeno.png«ENDIF»" alt="Este ingrediente «IF !i.alergenico»no «ENDIF»contiene alérgenos" title="Este ingrediente «IF !i.alergenico»no «ENDIF»contiene alérgenos" /></td>\
		</tr>\
	'''
	//FIN PARTE WEB PARA INGREDIENTES
	
	//INICIO PARTE WEB PARA PRODUCTOS
	def compilarProductos(List<Producto> productos) '''
		var code = '«FOR p:productos»«p.compilarTexto»«ENDFOR»';
	'''
	
	def compilarTexto(Producto p) '''
		«IF (p.eClass.name.equals("Principal"))»
			«var principal = p as Principal»
			«IF principal.ensalada»<div class="caja_producto_principal_ensalada"><div class="caja">\
			«ELSE»<div class="caja_producto_principal"><div class="caja">\
			«ENDIF»
		«ELSEIF (p.eClass.name.equals("Complemento"))»
			<div class="caja_producto_complemento"><div class="caja">\
		«ELSEIF (p.eClass.name.equals("BebidaFria"))»
			<div class="caja_producto_bebida_fria"><div class="caja">\
		«ELSEIF (p.eClass.name.equals("BebidaCaliente"))»
			<div class="caja_producto_bebida_caliente"><div class="caja">\
		«ELSEIF (p.eClass.name.equals("Postre"))»
			<div class="caja_producto_postre"><div class="caja">\
		«ENDIF»
			<img src="imagenes/«p.foto»" alt="«p.nombre» («p.name»)" title="«p.nombre» («p.name»)" />\
			<h2>«p.nombre»</h2>\
			<div class="caja_descripcion">«p.descripcion»</div>\
			«IF (p.eClass.name.equals("Principal"))»
				«var principal = p as Principal»
				«IF principal.ingredientes.size > 0»
					<h3>Listado de ingredientes:</h3>\
					<div class="caja_ingredientes">«ingredientes(principal.ingredientes)» (<a href="ingredientes.html">ver</a>)</div>\
				«ENDIF»
				«IF principal.salsa == SalsaRecomendada.NINGUNA»
					«ELSEIF principal.salsa == SalsaRecomendada.CESAR»
					<div class="caja_salsa">*Para este plato se recomienda la salsa César</div>\
					«ELSEIF principal.salsa == SalsaRecomendada.ACEITE_YVINAGRE»
					<div class="caja_salsa">*Para este plato se recomienda la salsa de aceite y vinagre</div>\
					«ELSEIF principal.salsa == SalsaRecomendada.MODENA»
					<div class="caja_salsa">*Para este plato se recomienda la salsa de Módena</div>\
					«ELSEIF principal.salsa == SalsaRecomendada.MOSTAZA»
					<div class="caja_salsa">*Para este plato se recomienda la salsa de mostaza</div>\
				«ENDIF»
			«ELSEIF (p.eClass.name.equals("BebidaFria"))»
				«var bebidaFria = p as BebidaFria»
				«IF bebidaFria.distribuidor!==null»
					<h3>Distribuidor:</h3>\
					<div class="caja_distribuidor">«bebidaFria.distribuidor»</div>\
				«ENDIF»			
			«ELSEIF (p.eClass.name.equals("Postre"))»
				«var postre = p as Postre»
				«IF postre.ingredientes.size > 0»
					<h3>Listado de ingredientes: </h3>\
					<div class="caja_ingredientes">«ingredientes(postre.ingredientes)» (<a href="ingredientes.html">ver</a>)</div>\
				«ENDIF»
				«IF postre.distribuidor!==null»
					<h3>Distribuidor:</h3>\
					<div class="caja_distribuidor">«postre.distribuidor»</div>\
				«ENDIF»
			«ENDIF»
			«IF p.nutricional !== null»
				<h3>Información nutricional:</h3>\
				<div class="caja_nutricional">\
					<div class="caja_nutricional_elemento">Valor nutricional para «p.nutricional.cantidad» «p.nutricional.unidad»</div>\
					<div class="caja_nutricional_elemento">Energía: «p.nutricional.energia»kcal</div>\
					<div class="caja_nutricional_elemento">Grasas: «p.nutricional.grasas»g</div>\
					<div class="caja_nutricional_elemento">Hidratos de carbono: «p.nutricional.hidratos»g</div>\
					<div class="caja_nutricional_elemento">Proteínas: «p.nutricional.proteinas»g</div>\
					<div class="caja_nutricional_elemento">Sal: «p.nutricional.sal»g</div>\
				</div>\
			«ENDIF»
		</div></div>\
	'''
	
	def String ingredientes(List<Ingrediente> ingredientes) {
		var sb = new StringBuilder();
		for (Ingrediente i : ingredientes) {
			sb.append(i.nombre + " - ");
		}
		return sb.toString;
	}
	//FIN PARTE WEB PARA PRODUCTOS
	
	//INICIO PARTE WEB PARA MENUS
	def compilarMenus(List<Menu> menus) '''
		var code = '«FOR m:menus»«m.compilarTexto»«ENDFOR»';
	'''
	
	def compilarTexto(Menu m) '''
		<div class="caja_menu"><div class="caja">\
			<img src="imagenes/«m.foto»" alt="«m.nombre» («m.name»)" title="«m.nombre» («m.name»)" />\
			<h2>«m.nombre»</h2>\
			<div class="caja_descripcion">«m.descripcion»</div>\
			<div class="caja_tamanio">«tamanioMenu(m.tamanio)»</div>\
			«IF m.productos !== null»
				<h3>Productos incluidos:</h3>\
				<div class="caja_productos_incluidos">\
					<ul>\
					«productosDelMenuY(m.productos)»\
					</ul>\
				</div>\
			«ENDIF»
		</div></div>\
	'''
	
	def tamanioMenu(TamanioMenu t) {
		var result = new String();
		switch (t) {
			case TamanioMenu.GRANDE:
				result = "Este menú se presenta en tamaño grande"
			case TamanioMenu.NORMAL:
				result = "Este menú se presenta en tamaño normal"
			case TamanioMenu.NORMAL_YGRANDE:
				result = "Este menú está disponible tanto en tamaño normal como en tamaño grande"
		}
		return result;
	}
	
	def productosDelMenuY(ProductoY productoY){
		var sb = new StringBuilder();
		sb.append('<li>' + productosDelMenuO(productoY.izq));
		for (ProductoO prO : productoY.der) {
			sb.append('<li>')
			sb.append(productosDelMenuO(prO));
		}
		return sb;
	}
	
	def productosDelMenuO(ProductoO productoO){
		var sb = new StringBuilder();
		sb.append(productoO.izq.nombre)
		for (Producto pr : productoO.der) {
			sb.append(' o ' + pr.nombre);			
		}
		sb.append('</li>');
		return sb;
	}
	//FIN PARTE WEB PARA MENUS
}
