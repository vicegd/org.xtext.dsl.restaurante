/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.restaurante.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.dsl.restaurante.restaurante.Nutricional;
import org.xtext.dsl.restaurante.restaurante.Producto;
import org.xtext.dsl.restaurante.restaurante.RestaurantePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.ProductoImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.ProductoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.ProductoImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.ProductoImpl#getFoto <em>Foto</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.ProductoImpl#getNutricional <em>Nutricional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductoImpl extends MinimalEObjectImpl.Container implements Producto
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescripcion()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPCION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescripcion()
   * @generated
   * @ordered
   */
  protected String descripcion = DESCRIPCION_EDEFAULT;

  /**
   * The default value of the '{@link #getFoto() <em>Foto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoto()
   * @generated
   * @ordered
   */
  protected static final String FOTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFoto() <em>Foto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFoto()
   * @generated
   * @ordered
   */
  protected String foto = FOTO_EDEFAULT;

  /**
   * The cached value of the '{@link #getNutricional() <em>Nutricional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNutricional()
   * @generated
   * @ordered
   */
  protected Nutricional nutricional;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductoImpl()
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
    return RestaurantePackage.Literals.PRODUCTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestaurantePackage.PRODUCTO__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RestaurantePackage.PRODUCTO__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescripcion()
  {
    return descripcion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescripcion(String newDescripcion)
  {
    String oldDescripcion = descripcion;
    descripcion = newDescripcion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestaurantePackage.PRODUCTO__DESCRIPCION, oldDescripcion, descripcion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFoto()
  {
    return foto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFoto(String newFoto)
  {
    String oldFoto = foto;
    foto = newFoto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestaurantePackage.PRODUCTO__FOTO, oldFoto, foto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nutricional getNutricional()
  {
    return nutricional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNutricional(Nutricional newNutricional, NotificationChain msgs)
  {
    Nutricional oldNutricional = nutricional;
    nutricional = newNutricional;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestaurantePackage.PRODUCTO__NUTRICIONAL, oldNutricional, newNutricional);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNutricional(Nutricional newNutricional)
  {
    if (newNutricional != nutricional)
    {
      NotificationChain msgs = null;
      if (nutricional != null)
        msgs = ((InternalEObject)nutricional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestaurantePackage.PRODUCTO__NUTRICIONAL, null, msgs);
      if (newNutricional != null)
        msgs = ((InternalEObject)newNutricional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestaurantePackage.PRODUCTO__NUTRICIONAL, null, msgs);
      msgs = basicSetNutricional(newNutricional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestaurantePackage.PRODUCTO__NUTRICIONAL, newNutricional, newNutricional));
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
      case RestaurantePackage.PRODUCTO__NUTRICIONAL:
        return basicSetNutricional(null, msgs);
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
      case RestaurantePackage.PRODUCTO__NAME:
        return getName();
      case RestaurantePackage.PRODUCTO__NOMBRE:
        return getNombre();
      case RestaurantePackage.PRODUCTO__DESCRIPCION:
        return getDescripcion();
      case RestaurantePackage.PRODUCTO__FOTO:
        return getFoto();
      case RestaurantePackage.PRODUCTO__NUTRICIONAL:
        return getNutricional();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RestaurantePackage.PRODUCTO__NAME:
        setName((String)newValue);
        return;
      case RestaurantePackage.PRODUCTO__NOMBRE:
        setNombre((String)newValue);
        return;
      case RestaurantePackage.PRODUCTO__DESCRIPCION:
        setDescripcion((String)newValue);
        return;
      case RestaurantePackage.PRODUCTO__FOTO:
        setFoto((String)newValue);
        return;
      case RestaurantePackage.PRODUCTO__NUTRICIONAL:
        setNutricional((Nutricional)newValue);
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
      case RestaurantePackage.PRODUCTO__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RestaurantePackage.PRODUCTO__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case RestaurantePackage.PRODUCTO__DESCRIPCION:
        setDescripcion(DESCRIPCION_EDEFAULT);
        return;
      case RestaurantePackage.PRODUCTO__FOTO:
        setFoto(FOTO_EDEFAULT);
        return;
      case RestaurantePackage.PRODUCTO__NUTRICIONAL:
        setNutricional((Nutricional)null);
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
      case RestaurantePackage.PRODUCTO__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RestaurantePackage.PRODUCTO__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case RestaurantePackage.PRODUCTO__DESCRIPCION:
        return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
      case RestaurantePackage.PRODUCTO__FOTO:
        return FOTO_EDEFAULT == null ? foto != null : !FOTO_EDEFAULT.equals(foto);
      case RestaurantePackage.PRODUCTO__NUTRICIONAL:
        return nutricional != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", nombre: ");
    result.append(nombre);
    result.append(", descripcion: ");
    result.append(descripcion);
    result.append(", foto: ");
    result.append(foto);
    result.append(')');
    return result.toString();
  }

} //ProductoImpl