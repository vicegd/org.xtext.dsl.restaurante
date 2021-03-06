/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.restaurante;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.dsl.restaurante.restaurante.RestaurantePackage
 * @generated
 */
public interface RestauranteFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RestauranteFactory eINSTANCE = org.xtext.dsl.restaurante.restaurante.impl.RestauranteFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Restaurante</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Restaurante</em>'.
   * @generated
   */
  Restaurante createRestaurante();

  /**
   * Returns a new object of class '<em>Ingrediente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ingrediente</em>'.
   * @generated
   */
  Ingrediente createIngrediente();

  /**
   * Returns a new object of class '<em>Producto</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Producto</em>'.
   * @generated
   */
  Producto createProducto();

  /**
   * Returns a new object of class '<em>Principal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Principal</em>'.
   * @generated
   */
  Principal createPrincipal();

  /**
   * Returns a new object of class '<em>Complemento</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complemento</em>'.
   * @generated
   */
  Complemento createComplemento();

  /**
   * Returns a new object of class '<em>Bebida</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bebida</em>'.
   * @generated
   */
  Bebida createBebida();

  /**
   * Returns a new object of class '<em>Bebida Fria</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bebida Fria</em>'.
   * @generated
   */
  BebidaFria createBebidaFria();

  /**
   * Returns a new object of class '<em>Bebida Caliente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bebida Caliente</em>'.
   * @generated
   */
  BebidaCaliente createBebidaCaliente();

  /**
   * Returns a new object of class '<em>Postre</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Postre</em>'.
   * @generated
   */
  Postre createPostre();

  /**
   * Returns a new object of class '<em>Nutricional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nutricional</em>'.
   * @generated
   */
  Nutricional createNutricional();

  /**
   * Returns a new object of class '<em>Menu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Menu</em>'.
   * @generated
   */
  Menu createMenu();

  /**
   * Returns a new object of class '<em>Producto Y</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Producto Y</em>'.
   * @generated
   */
  ProductoY createProductoY();

  /**
   * Returns a new object of class '<em>Producto O</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Producto O</em>'.
   * @generated
   */
  ProductoO createProductoO();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RestaurantePackage getRestaurantePackage();

} //RestauranteFactory
