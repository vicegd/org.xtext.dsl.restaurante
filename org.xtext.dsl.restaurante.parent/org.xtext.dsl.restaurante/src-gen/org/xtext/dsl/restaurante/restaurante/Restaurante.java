/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.restaurante;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.Restaurante#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.Restaurante#getFecha <em>Fecha</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.Restaurante#getIngredientes <em>Ingredientes</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.Restaurante#getProductos <em>Productos</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.Restaurante#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getRestaurante()
 * @model
 * @generated
 */
public interface Restaurante extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getRestaurante_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link org.xtext.dsl.restaurante.restaurante.Restaurante#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Fecha</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fecha</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fecha</em>' attribute.
   * @see #setFecha(String)
   * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getRestaurante_Fecha()
   * @model
   * @generated
   */
  String getFecha();

  /**
   * Sets the value of the '{@link org.xtext.dsl.restaurante.restaurante.Restaurante#getFecha <em>Fecha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fecha</em>' attribute.
   * @see #getFecha()
   * @generated
   */
  void setFecha(String value);

  /**
   * Returns the value of the '<em><b>Ingredientes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.dsl.restaurante.restaurante.Ingrediente}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ingredientes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ingredientes</em>' containment reference list.
   * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getRestaurante_Ingredientes()
   * @model containment="true"
   * @generated
   */
  EList<Ingrediente> getIngredientes();

  /**
   * Returns the value of the '<em><b>Productos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.dsl.restaurante.restaurante.Producto}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Productos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Productos</em>' containment reference list.
   * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getRestaurante_Productos()
   * @model containment="true"
   * @generated
   */
  EList<Producto> getProductos();

  /**
   * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.dsl.restaurante.restaurante.Menu}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menus</em>' containment reference list.
   * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage#getRestaurante_Menus()
   * @model containment="true"
   * @generated
   */
  EList<Menu> getMenus();

} // Restaurante
