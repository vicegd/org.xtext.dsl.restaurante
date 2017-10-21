package org.xtext.dsl.restaurante.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.xtext.dsl.restaurante.restaurante.Ingrediente;
import org.xtext.dsl.restaurante.restaurante.Menu;
import org.xtext.dsl.restaurante.restaurante.Postre;
import org.xtext.dsl.restaurante.restaurante.Principal;
import org.xtext.dsl.restaurante.restaurante.Producto;
import org.xtext.dsl.restaurante.restaurante.ProductoO;
import org.xtext.dsl.restaurante.restaurante.ProductoY;
import org.xtext.dsl.restaurante.restaurante.Restaurante;
import org.xtext.dsl.restaurante.restaurante.impl.RestaurantePackageImpl;

public class RestauranteOutlineTransformer extends DefaultOutlineTreeProvider {

	@Override
	protected void createNode(IOutlineNode parentNode, EObject modelElement) {
		if (modelElement instanceof Restaurante) {
			createEObjectNode(parentNode, modelElement); //Se mete a Restaurante debajo de la raiz
		}
		else if (modelElement instanceof Ingrediente) {
			createEObjectNode(parentNode, modelElement); //Se mete al Ingrediente debajo de Restaurante
			
			int posicion = parentNode.getChildren().size()-1; //posición del elemento modelElement en el árbol de objetos IOutlineNode
			IOutlineNode nodoActual = parentNode.getChildren().get(posicion); //se obtiene el nodo de dicha posición (el nodo correspondiente al Ingrediente)

			Ingrediente i = (Ingrediente)modelElement;
			//EAttribute a = EcoreFactory.eINSTANCE.createEAttribute(); //FALLA AL HACER LA REFERENCIA
			
			EAttribute aNombre = RestaurantePackageImpl.eINSTANCE.getIngrediente_Nombre();
			aNombre.setDefaultValue(i.getNombre());
			createEObjectNode(nodoActual, aNombre);
			
			if (i.getInfoURL() != null) {
				EAttribute aURL = RestaurantePackageImpl.eINSTANCE.getIngrediente_InfoURL();
				aURL.setDefaultValue(i.getInfoURL());
				createEObjectNode(nodoActual, aURL);	
			}
			
			if (i.getFoto() != null) {
				EAttribute aFoto = RestaurantePackageImpl.eINSTANCE.getIngrediente_Foto();
				aFoto.setDefaultValue(i.getFoto());
				createEObjectNode(nodoActual, aFoto);	
			}
				
			EAttribute aAlergenico = RestaurantePackageImpl.eINSTANCE.getIngrediente_Alergenico();
			aAlergenico.setDefaultValue(i.isAlergenico()?true:false);
			createEObjectNode(nodoActual, aAlergenico);
		}
		else if (modelElement instanceof Producto) {
			createEObjectNode(parentNode, modelElement); //Se mete al Producto debajo de Restaurante

			int posicion = parentNode.getChildren().size()-1; //posición del elemento modelElement en el árbol de objetos IOutlineNode
			IOutlineNode nodoActual = parentNode.getChildren().get(posicion); //se obtiene el nodo de dicha posición (el nodo correspondiente al Producto)
			
			Producto pr = (Producto)modelElement;
			
			if (((Producto)modelElement).getNutricional() != null) { //información nutricional de todos los productos
				createEObjectNode(nodoActual, pr.getNutricional());
				
				int posicionNutricional = nodoActual.getChildren().size()-1; //posición del elemento modelElement en el árbol de objetos IOutlineNode
				IOutlineNode nodoNutricional = nodoActual.getChildren().get(posicionNutricional); //se obtiene el nodo de dicha posición (el nodo correspondiente a la información Nutricional)
				
				EAttribute aEnergia = RestaurantePackageImpl.eINSTANCE.getNutricional_Energia();
				aEnergia.setDefaultValue(pr.getNutricional().getEnergia());
				createEObjectNode(nodoNutricional, aEnergia);
				
				EAttribute aGrasas = RestaurantePackageImpl.eINSTANCE.getNutricional_Grasas();
				aGrasas.setDefaultValue(pr.getNutricional().getGrasas());
				createEObjectNode(nodoNutricional, aGrasas);
				
				EAttribute aHidratos = RestaurantePackageImpl.eINSTANCE.getNutricional_Hidratos();
				aHidratos.setDefaultValue(pr.getNutricional().getHidratos());
				createEObjectNode(nodoNutricional, aHidratos);
				
				EAttribute aProteinas = RestaurantePackageImpl.eINSTANCE.getNutricional_Proteinas();
				aProteinas.setDefaultValue(pr.getNutricional().getProteinas());
				createEObjectNode(nodoNutricional, aProteinas);
				
				EAttribute aSal = RestaurantePackageImpl.eINSTANCE.getNutricional_Sal();
				aSal.setDefaultValue(pr.getNutricional().getSal());
				createEObjectNode(nodoNutricional, aSal);
			}
			
			if (modelElement instanceof Principal){ //Si es Principal queremos introducir también los ingredientes
				Principal p = (Principal)modelElement;
				for (Ingrediente i : p.getIngredientes()){				
					createEObjectNode(nodoActual, i);
				}			
				EAttribute aSalsa = RestaurantePackageImpl.eINSTANCE.getPrincipal_Salsa();
				aSalsa.setDefaultValue(p.getSalsa());
				createEObjectNode(nodoActual, aSalsa);
			}
			if (modelElement instanceof Postre){ //Si es Postre queremos introducir también los ingredientes
				Postre p = (Postre)modelElement;
				for (Ingrediente i : p.getIngredientes()){				
					createEObjectNode(nodoActual, i);
				}			
			}
		}
		else if (modelElement instanceof Menu) {
			createEObjectNode(parentNode, modelElement); //Se mete al Menú debajo de Restaurante
			
			int posicion = parentNode.getChildren().size()-1; //posición del elemento modelElement en el árbol de objetos IOutlineNode
			IOutlineNode nodoActual = parentNode.getChildren().get(posicion); //se obtiene el nodo de dicha posición (el nodo correspondiente al Menú)
			
			Menu m = (Menu)modelElement;
			
			//para la lista de productos incluidos dentro del menú
			if (m.getProductos() != null) {
				ProductoY py = m.getProductos();
				for (Producto p : obtenerListadaDeProductos(py)){
					createEObjectNode(nodoActual, p); //Se introduce cada producto que cuelga del menú
				}	
			}
		}
	}
	
	List<Producto> obtenerListadaDeProductos(ProductoY productoY){
		List<Producto> resultado = new ArrayList<Producto>();
		resultado.addAll(obtenerListadaDeProductosO(productoY.getIzq()));
		for (ProductoO prO : productoY.getDer()) {
			resultado.addAll(obtenerListadaDeProductosO(prO));
		}
		return resultado;
	}
	
	List<Producto> obtenerListadaDeProductosO(ProductoO productoO){
		List<Producto> resultado = new ArrayList<Producto>();
		resultado.add(productoO.getIzq());
		for (Producto pr : productoO.getDer()) {
			resultado.add(pr);		
		}
		return resultado;
	}
	
}