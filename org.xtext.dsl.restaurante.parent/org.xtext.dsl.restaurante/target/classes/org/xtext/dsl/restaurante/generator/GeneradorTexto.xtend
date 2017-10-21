package org.xtext.dsl.restaurante.generator

import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.dsl.restaurante.restaurante.Ingrediente
import org.xtext.dsl.restaurante.restaurante.Producto
import org.xtext.dsl.restaurante.restaurante.Restaurante
import org.xtext.dsl.restaurante.restaurante.Postre
import org.xtext.dsl.restaurante.restaurante.BebidaCaliente
import org.xtext.dsl.restaurante.restaurante.BebidaFria
import org.xtext.dsl.restaurante.restaurante.Complemento
import org.xtext.dsl.restaurante.restaurante.Principal
import org.xtext.dsl.restaurante.restaurante.Nutricional
import org.xtext.dsl.restaurante.restaurante.SalsaRecomendada
import org.xtext.dsl.restaurante.restaurante.ProductoO
import org.xtext.dsl.restaurante.restaurante.ProductoY
import org.xtext.dsl.restaurante.restaurante.Menu
import org.xtext.dsl.restaurante.restaurante.TamanioMenu

class GeneradorTexto {
	Resource resource;
	IFileSystemAccess fsa;
	
	new (Resource resource, IFileSystemAccess fsa) {
		this.resource = resource;
		this.fsa = fsa;
	}
	
	def compilar() {
		//SALIDA A UN ARCHIVO TXT CON INFORMACIÓN DE LOS INGREDIENTES
		var sb = new StringBuilder();
		for(i: resource.allContents.toIterable.filter(typeof(Ingrediente))){
			sb.append(i.compilarTexto);
		}
		fsa.generateFile('ingredientes.txt', sb.toString);
		for(r: resource.allContents.toIterable.filter(typeof(Restaurante))){
			fsa.generateFile('resto_informacion.txt', r.compilarTexto);
		}
	}
	
	//INICIO ARCHIVO TXT PARA INGREDIENTES
	def compilarTexto(Ingrediente i) '''
		Ingrediente: «i.nombre» código «i.name» «IF i.alergenico»(alergénico)«ENDIF»
			«IF i.infoURL !== null»
			Se puede consultar más información en «i.infoURL»
			«ENDIF»
			«IF i.foto !== null»
			Se ha proporcionado una foto para el ingrediente en la ruta imagenes/«i.foto»
			«ENDIF»
	'''
	//FIN ARCHIVO TXT PARA INGREDIENTES

	//INICIO ARCHIVO TXT RESTO INFORMACIÓN
	def compilarTexto(Restaurante r) '''
		Restaurantes ==> «r.nombre»
		Fecha de edición ==> «r.fecha»
		
		Información sobre los productos
		-------------------------------
		«FOR p:r.productos»
			«p.compilarTexto»
		«ENDFOR»
		
		Información sobre los menús
		---------------------------
		«FOR m:r.menus»
			«m.compilarTexto»
		«ENDFOR»
	'''
	
	def compilarTexto(Producto p) '''
		Producto: «p.nombre» código «p.name»
			«IF p.descripcion !== null»«p.descripcion»«ENDIF»
			Se ha proporcionado una foto para el ingrediente en la ruta imagenes/«p.foto»
			«IF p.nutricional !== null»
				«informacionNutricional(p.nutricional)»
			«ENDIF»
			«IF (p.eClass.name.equals("Principal"))»«compilarTexto(p as Principal)»
				«ELSEIF (p.eClass.name.equals("Complemento"))»«compilarTexto(p as Complemento)»
				«ELSEIF (p.eClass.name.equals("BebidaFria"))»«compilarTexto(p as BebidaFria)»
				«ELSEIF (p.eClass.name.equals("BebidaCaliente"))»«compilarTexto(p as BebidaCaliente)»
				«ELSEIF (p.eClass.name.equals("Postre"))»«compilarTexto(p as Postre)»
			«ENDIF»
	'''
	
	def informacionNutricional(Nutricional n) '''
		Por cada «n.cantidad»«n.unidad» de producto se proporciona:
			«n.energia»Kcal de energía, «n.grasas»g de grasa, «n.hidratos»g de hidratos de carbono «n.proteinas»g de proteinas «n.sal»g de sal
	'''
	
	def compilarTexto(Principal p) '''
		«IF p.ensalada»Tipo de producto: Ensalada
		«ELSE»Tipo de producto: Plato principal
		«ENDIF»
		«IF p.salsa == SalsaRecomendada.NINGUNA»
			«ELSEIF p.salsa == SalsaRecomendada.CESAR»
			Para este plato se recomienda salsa César
			«ELSEIF p.salsa == SalsaRecomendada.ACEITE_YVINAGRE»
			Para este plato se recomienda salsa de aceite y vinagre
			«ELSEIF p.salsa == SalsaRecomendada.MODENA»
			Para este plato se recomienda salsa de Módena
			«ELSEIF p.salsa == SalsaRecomendada.MOSTAZA»
			Para este plato se recomienda salsa de mostaza
		«ENDIF»
		Listado de ingredientes: «ingredientes(p.ingredientes)»
		'''
	def String ingredientes(List<Ingrediente> ingredientes) {
		var sb = new StringBuilder();
		for (Ingrediente i : ingredientes) {
			sb.append(i.nombre + " - ");
		}
		return sb.toString;
	}
	
	def compilarTexto(Complemento p) '''
		Tipo de producto: Complemento
	'''
	
	def compilarTexto(BebidaFria p) '''
		Tipo de producto: Bebida fría
		Distribuidor: «p.distribuidor»
	'''
	
	def compilarTexto(BebidaCaliente p) '''
		Tipo de producto: Bebida caliente
	'''
	
	def compilarTexto(Postre p) '''
		«IF p.helado»Tipo de producto: Helado
		«ELSE»Tipo de producto: Postre no helado
		«ENDIF»
		Distribuidor: «p.distribuidor»
		Listado de ingredientes: «ingredientes(p.ingredientes)»
	'''
	
	def compilarTexto(Menu m) '''
		Menu: «m.nombre» código «m.name»
			Descripción «m.descripcion»
			«IF m.tamanio == TamanioMenu.NORMAL»
				Disponible en tamaño normal
			«ELSEIF m.tamanio == TamanioMenu.GRANDE»
				Disponible en tamaño grande
			«ELSEIF m.tamanio == TamanioMenu.NORMAL_YGRANDE»
				Disponible en tamaño normal y grande
			«ENDIF»
			Foto «m.foto»
			«productosDelMenuY(m.productos)»
	'''
	
	def productosDelMenuY(ProductoY productoY){
		var sb = new StringBuilder();
		sb.append(productosDelMenuO(productoY.izq));
		for (ProductoO prO : productoY.der) {
			sb.append('\t+ ')
			sb.append(productosDelMenuO(prO));
		}
		return sb;
	}
	
	def productosDelMenuO(ProductoO productoO){
		var sb = new StringBuilder();
		sb.append('El producto: ' + productoO.izq.name)
		for (Producto pr : productoO.der) {
			sb.append(' o el producto ' + pr.name);			
		}
		sb.append('\r');
		return sb;
	}
	///FIN ARCHIVO TXT RESTO INFORMACIÓN
}


 