/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.restaurante.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.dsl.restaurante.restaurante.Distribuidor;
import org.xtext.dsl.restaurante.restaurante.Ingrediente;
import org.xtext.dsl.restaurante.restaurante.Postre;
import org.xtext.dsl.restaurante.restaurante.RestaurantePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.PostreImpl#isHelado <em>Helado</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.PostreImpl#getDistribuidor <em>Distribuidor</em>}</li>
 *   <li>{@link org.xtext.dsl.restaurante.restaurante.impl.PostreImpl#getIngredientes <em>Ingredientes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostreImpl extends ProductoImpl implements Postre
{
  /**
   * The default value of the '{@link #isHelado() <em>Helado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHelado()
   * @generated
   * @ordered
   */
  protected static final boolean HELADO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHelado() <em>Helado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHelado()
   * @generated
   * @ordered
   */
  protected boolean helado = HELADO_EDEFAULT;

  /**
   * The default value of the '{@link #getDistribuidor() <em>Distribuidor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistribuidor()
   * @generated
   * @ordered
   */
  protected static final Distribuidor DISTRIBUIDOR_EDEFAULT = Distribuidor.COCA_COLA;

  /**
   * The cached value of the '{@link #getDistribuidor() <em>Distribuidor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistribuidor()
   * @generated
   * @ordered
   */
  protected Distribuidor distribuidor = DISTRIBUIDOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getIngredientes() <em>Ingredientes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIngredientes()
   * @generated
   * @ordered
   */
  protected EList<Ingrediente> ingredientes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PostreImpl()
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
    return RestaurantePackage.Literals.POSTRE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHelado()
  {
    return helado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHelado(boolean newHelado)
  {
    boolean oldHelado = helado;
    helado = newHelado;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestaurantePackage.POSTRE__HELADO, oldHelado, helado));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distribuidor getDistribuidor()
  {
    return distribuidor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistribuidor(Distribuidor newDistribuidor)
  {
    Distribuidor oldDistribuidor = distribuidor;
    distribuidor = newDistribuidor == null ? DISTRIBUIDOR_EDEFAULT : newDistribuidor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestaurantePackage.POSTRE__DISTRIBUIDOR, oldDistribuidor, distribuidor));
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
      ingredientes = new EObjectResolvingEList<Ingrediente>(Ingrediente.class, this, RestaurantePackage.POSTRE__INGREDIENTES);
    }
    return ingredientes;
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
      case RestaurantePackage.POSTRE__HELADO:
        return isHelado();
      case RestaurantePackage.POSTRE__DISTRIBUIDOR:
        return getDistribuidor();
      case RestaurantePackage.POSTRE__INGREDIENTES:
        return getIngredientes();
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
      case RestaurantePackage.POSTRE__HELADO:
        setHelado((Boolean)newValue);
        return;
      case RestaurantePackage.POSTRE__DISTRIBUIDOR:
        setDistribuidor((Distribuidor)newValue);
        return;
      case RestaurantePackage.POSTRE__INGREDIENTES:
        getIngredientes().clear();
        getIngredientes().addAll((Collection<? extends Ingrediente>)newValue);
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
      case RestaurantePackage.POSTRE__HELADO:
        setHelado(HELADO_EDEFAULT);
        return;
      case RestaurantePackage.POSTRE__DISTRIBUIDOR:
        setDistribuidor(DISTRIBUIDOR_EDEFAULT);
        return;
      case RestaurantePackage.POSTRE__INGREDIENTES:
        getIngredientes().clear();
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
      case RestaurantePackage.POSTRE__HELADO:
        return helado != HELADO_EDEFAULT;
      case RestaurantePackage.POSTRE__DISTRIBUIDOR:
        return distribuidor != DISTRIBUIDOR_EDEFAULT;
      case RestaurantePackage.POSTRE__INGREDIENTES:
        return ingredientes != null && !ingredientes.isEmpty();
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
    result.append(" (helado: ");
    result.append(helado);
    result.append(", distribuidor: ");
    result.append(distribuidor);
    result.append(')');
    return result.toString();
  }

} //PostreImpl
