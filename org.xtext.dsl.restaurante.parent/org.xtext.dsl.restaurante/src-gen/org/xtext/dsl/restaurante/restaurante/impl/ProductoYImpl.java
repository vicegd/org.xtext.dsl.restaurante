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

import org.xtext.dsl.restaurante.restaurante.ProductoO;
import org.xtext.dsl.restaurante.restaurante.ProductoY;
import org.xtext.dsl.restaurante.restaurante.RestaurantePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producto Y</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.ProductoYImpl#getIzq <em>Izq</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.ProductoYImpl#getDer <em>Der</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductoYImpl extends MinimalEObjectImpl.Container implements ProductoY
{
  /**
   * The cached value of the '{@link #getIzq() <em>Izq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIzq()
   * @generated
   * @ordered
   */
  protected ProductoO izq;

  /**
   * The cached value of the '{@link #getDer() <em>Der</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDer()
   * @generated
   * @ordered
   */
  protected EList<ProductoO> der;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductoYImpl()
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
    return RestaurantePackage.Literals.PRODUCTO_Y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductoO getIzq()
  {
    return izq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIzq(ProductoO newIzq, NotificationChain msgs)
  {
    ProductoO oldIzq = izq;
    izq = newIzq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestaurantePackage.PRODUCTO_Y__IZQ, oldIzq, newIzq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIzq(ProductoO newIzq)
  {
    if (newIzq != izq)
    {
      NotificationChain msgs = null;
      if (izq != null)
        msgs = ((InternalEObject)izq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestaurantePackage.PRODUCTO_Y__IZQ, null, msgs);
      if (newIzq != null)
        msgs = ((InternalEObject)newIzq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestaurantePackage.PRODUCTO_Y__IZQ, null, msgs);
      msgs = basicSetIzq(newIzq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestaurantePackage.PRODUCTO_Y__IZQ, newIzq, newIzq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProductoO> getDer()
  {
    if (der == null)
    {
      der = new EObjectContainmentEList<ProductoO>(ProductoO.class, this, RestaurantePackage.PRODUCTO_Y__DER);
    }
    return der;
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
      case RestaurantePackage.PRODUCTO_Y__IZQ:
        return basicSetIzq(null, msgs);
      case RestaurantePackage.PRODUCTO_Y__DER:
        return ((InternalEList<?>)getDer()).basicRemove(otherEnd, msgs);
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
      case RestaurantePackage.PRODUCTO_Y__IZQ:
        return getIzq();
      case RestaurantePackage.PRODUCTO_Y__DER:
        return getDer();
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
      case RestaurantePackage.PRODUCTO_Y__IZQ:
        setIzq((ProductoO)newValue);
        return;
      case RestaurantePackage.PRODUCTO_Y__DER:
        getDer().clear();
        getDer().addAll((Collection<? extends ProductoO>)newValue);
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
      case RestaurantePackage.PRODUCTO_Y__IZQ:
        setIzq((ProductoO)null);
        return;
      case RestaurantePackage.PRODUCTO_Y__DER:
        getDer().clear();
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
      case RestaurantePackage.PRODUCTO_Y__IZQ:
        return izq != null;
      case RestaurantePackage.PRODUCTO_Y__DER:
        return der != null && !der.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProductoYImpl
