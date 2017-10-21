/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.restaurante.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.dsl.restaurante.restaurante.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestauranteFactoryImpl extends EFactoryImpl implements RestauranteFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestauranteFactory init()
  {
    try
    {
      RestauranteFactory theRestauranteFactory = (RestauranteFactory)EPackage.Registry.INSTANCE.getEFactory(RestaurantePackage.eNS_URI);
      if (theRestauranteFactory != null)
      {
        return theRestauranteFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RestauranteFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestauranteFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RestaurantePackage.RESTAURANTE: return createRestaurante();
      case RestaurantePackage.INGREDIENTE: return createIngrediente();
      case RestaurantePackage.PRODUCTO: return createProducto();
      case RestaurantePackage.PRINCIPAL: return createPrincipal();
      case RestaurantePackage.COMPLEMENTO: return createComplemento();
      case RestaurantePackage.BEBIDA: return createBebida();
      case RestaurantePackage.BEBIDA_FRIA: return createBebidaFria();
      case RestaurantePackage.BEBIDA_CALIENTE: return createBebidaCaliente();
      case RestaurantePackage.POSTRE: return createPostre();
      case RestaurantePackage.NUTRICIONAL: return createNutricional();
      case RestaurantePackage.MENU: return createMenu();
      case RestaurantePackage.PRODUCTO_Y: return createProductoY();
      case RestaurantePackage.PRODUCTO_O: return createProductoO();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RestaurantePackage.SALSA_RECOMENDADA:
        return createSalsaRecomendadaFromString(eDataType, initialValue);
      case RestaurantePackage.TAMANIO_MENU:
        return createTamanioMenuFromString(eDataType, initialValue);
      case RestaurantePackage.DISTRIBUIDOR:
        return createDistribuidorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RestaurantePackage.SALSA_RECOMENDADA:
        return convertSalsaRecomendadaToString(eDataType, instanceValue);
      case RestaurantePackage.TAMANIO_MENU:
        return convertTamanioMenuToString(eDataType, instanceValue);
      case RestaurantePackage.DISTRIBUIDOR:
        return convertDistribuidorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Restaurante createRestaurante()
  {
    RestauranteImpl restaurante = new RestauranteImpl();
    return restaurante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ingrediente createIngrediente()
  {
    IngredienteImpl ingrediente = new IngredienteImpl();
    return ingrediente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Producto createProducto()
  {
    ProductoImpl producto = new ProductoImpl();
    return producto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Principal createPrincipal()
  {
    PrincipalImpl principal = new PrincipalImpl();
    return principal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Complemento createComplemento()
  {
    ComplementoImpl complemento = new ComplementoImpl();
    return complemento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bebida createBebida()
  {
    BebidaImpl bebida = new BebidaImpl();
    return bebida;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BebidaFria createBebidaFria()
  {
    BebidaFriaImpl bebidaFria = new BebidaFriaImpl();
    return bebidaFria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BebidaCaliente createBebidaCaliente()
  {
    BebidaCalienteImpl bebidaCaliente = new BebidaCalienteImpl();
    return bebidaCaliente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Postre createPostre()
  {
    PostreImpl postre = new PostreImpl();
    return postre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nutricional createNutricional()
  {
    NutricionalImpl nutricional = new NutricionalImpl();
    return nutricional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Menu createMenu()
  {
    MenuImpl menu = new MenuImpl();
    return menu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductoY createProductoY()
  {
    ProductoYImpl productoY = new ProductoYImpl();
    return productoY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductoO createProductoO()
  {
    ProductoOImpl productoO = new ProductoOImpl();
    return productoO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SalsaRecomendada createSalsaRecomendadaFromString(EDataType eDataType, String initialValue)
  {
    SalsaRecomendada result = SalsaRecomendada.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSalsaRecomendadaToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TamanioMenu createTamanioMenuFromString(EDataType eDataType, String initialValue)
  {
    TamanioMenu result = TamanioMenu.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTamanioMenuToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distribuidor createDistribuidorFromString(EDataType eDataType, String initialValue)
  {
    Distribuidor result = Distribuidor.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDistribuidorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestaurantePackage getRestaurantePackage()
  {
    return (RestaurantePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RestaurantePackage getPackage()
  {
    return RestaurantePackage.eINSTANCE;
  }

} //RestauranteFactoryImpl