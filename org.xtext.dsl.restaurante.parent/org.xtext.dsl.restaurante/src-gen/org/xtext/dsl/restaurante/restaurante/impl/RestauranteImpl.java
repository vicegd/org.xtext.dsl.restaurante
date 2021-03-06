/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.restaurante.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.dsl.restaurante.restaurante.Ingrediente;
import org.xtext.dsl.restaurante.restaurante.Menu;
import org.xtext.dsl.restaurante.restaurante.Producto;
import org.xtext.dsl.restaurante.restaurante.Restaurante;
import org.xtext.dsl.restaurante.restaurante.RestaurantePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.RestauranteImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.RestauranteImpl#getFecha <em>Fecha</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.RestauranteImpl#getIngredientes <em>Ingredientes</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.RestauranteImpl#getProductos <em>Productos</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.RestauranteImpl#getMenus <em>Menus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RestauranteImpl extends MinimalEObjectImpl.Container implements Restaurante
{
  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected String nombre = NOMBRE_EDEFAULT;

  /**
   * The default value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFecha()
   * @generated
   * @ordered
   */
  protected static final String FECHA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFecha() <em>Fecha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFecha()
   * @generated
   * @ordered
   */
  protected String fecha = FECHA_EDEFAULT;

  /**
   * The cached value of the '{@link #getIngredientes() <em>Ingredientes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIngredientes()
   * @generated
   * @ordered
   */
  protected EList<Ingrediente> ingredientes;

  /**
   * The cached value of the '{@link #getProductos() <em>Productos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductos()
   * @generated
   * @ordered
   */
  protected EList<Producto> productos;

  /**
   * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMenus()
   * @generated
   * @ordered
   */
  protected EList<Menu> menus;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RestauranteImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RestaurantePackage.Literals.RESTAURANTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestaurantePackage.RESTAURANTE__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFecha()
  {
    return fecha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFecha(String newFecha)
  {
    String oldFecha = fecha;
    fecha = newFecha;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestaurantePackage.RESTAURANTE__FECHA, oldFecha, fecha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Ingrediente> getIngredientes()
  {
    if (ingredientes == null)
    {
      ingredientes = new EObjectContainmentEList<Ingrediente>(Ingrediente.class, this, RestaurantePackage.RESTAURANTE__INGREDIENTES);
    }
    return ingredientes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Producto> getProductos()
  {
    if (productos == null)
    {
      productos = new EObjectContainmentEList<Producto>(Producto.class, this, RestaurantePackage.RESTAURANTE__PRODUCTOS);
    }
    return productos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Menu> getMenus()
  {
    if (menus == null)
    {
      menus = new EObjectContainmentEList<Menu>(Menu.class, this, RestaurantePackage.RESTAURANTE__MENUS);
    }
    return menus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RestaurantePackage.RESTAURANTE__INGREDIENTES:
        return ((InternalEList<?>)getIngredientes()).basicRemove(otherEnd, msgs);
      case RestaurantePackage.RESTAURANTE__PRODUCTOS:
        return ((InternalEList<?>)getProductos()).basicRemove(otherEnd, msgs);
      case RestaurantePackage.RESTAURANTE__MENUS:
        return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RestaurantePackage.RESTAURANTE__NOMBRE:
        return getNombre();
      case RestaurantePackage.RESTAURANTE__FECHA:
        return getFecha();
      case RestaurantePackage.RESTAURANTE__INGREDIENTES:
        return getIngredientes();
      case RestaurantePackage.RESTAURANTE__PRODUCTOS:
        return getProductos();
      case RestaurantePackage.RESTAURANTE__MENUS:
        return getMenus();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RestaurantePackage.RESTAURANTE__NOMBRE:
        setNombre((String)newValue);
        return;
      case RestaurantePackage.RESTAURANTE__FECHA:
        setFecha((String)newValue);
        return;
      case RestaurantePackage.RESTAURANTE__INGREDIENTES:
        getIngredientes().clear();
        getIngredientes().addAll((Collection<? extends Ingrediente>)newValue);
        return;
      case RestaurantePackage.RESTAURANTE__PRODUCTOS:
        getProductos().clear();
        getProductos().addAll((Collection<? extends Producto>)newValue);
        return;
      case RestaurantePackage.RESTAURANTE__MENUS:
        getMenus().clear();
        getMenus().addAll((Collection<? extends Menu>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RestaurantePackage.RESTAURANTE__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case RestaurantePackage.RESTAURANTE__FECHA:
        setFecha(FECHA_EDEFAULT);
        return;
      case RestaurantePackage.RESTAURANTE__INGREDIENTES:
        getIngredientes().clear();
        return;
      case RestaurantePackage.RESTAURANTE__PRODUCTOS:
        getProductos().clear();
        return;
      case RestaurantePackage.RESTAURANTE__MENUS:
        getMenus().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RestaurantePackage.RESTAURANTE__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case RestaurantePackage.RESTAURANTE__FECHA:
        return FECHA_EDEFAULT == null ? fecha != null : !FECHA_EDEFAULT.equals(fecha);
      case RestaurantePackage.RESTAURANTE__INGREDIENTES:
        return ingredientes != null && !ingredientes.isEmpty();
      case RestaurantePackage.RESTAURANTE__PRODUCTOS:
        return productos != null && !productos.isEmpty();
      case RestaurantePackage.RESTAURANTE__MENUS:
        return menus != null && !menus.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nombre: ");
    result.append(nombre);
    result.append(", fecha: ");
    result.append(fecha);
    result.append(')');
    return result.toString();
  }

} //RestauranteImpl
